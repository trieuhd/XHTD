package org.idempiere.xhtd_ab.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.idempiere.xhtd_ab.access.ScoreAccess;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE_DETAIL;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.object.ConfigAllObject;
import org.idempiere.xhtd_ab.object.ProfileObject;
import org.idempiere.xhtd_ab.object.ScoreConfigObject;
import org.idempiere.xhtd_ab.object.ScoreDisplayObject;
import org.idempiere.xhtd_ab.object.ScoreObject;
import org.idempiere.xhtd_ab.object.ScoreStringTag;
import org.idempiere.xhtd_ab.utils.BaseObject;
import org.idempiere.xhtd_ab.utils.Logutil;
import org.idempiere.xhtd_ab.utils.ScoreUtils;
import org.idempiere.xhtd_ab.utils.Utils;

public class ScoreService extends BaseObject {
	protected Logger logger = Logger.getLogger(this.getClass());
	private ProfileObject profile;
	private List<ScoreDisplayObject> listScore;
	private int customerProfileID;
	private Properties ctx;
	private String txtName;
	private ScoreObject result;
	private BigDecimal totalScore;
	private List<ScoreServiceStep> listRsScore;
	private ConfigAllObject config;
	private BigDecimal cic = BigDecimal.ZERO;
	private BigDecimal ptc = BigDecimal.ZERO;
	private BigDecimal tc  = BigDecimal.ZERO;

	public ScoreService(Properties ctx, int customerProfileID, String txtName) {
		this.ctx = ctx;
		this.txtName = txtName;
		this.customerProfileID = customerProfileID;
	}

	public List<ScoreDisplayObject> calScore() {
		listRsScore = new ArrayList<>();
		Logutil.config();
		totalScore = BigDecimal.ZERO;
		logger.info("Cal Score start with profileID " + customerProfileID);
		profile = new ProfileObject(customerProfileID);
		listScore = new ArrayList<>();
		loadConfig();
		if (config.getListConfig() == null || config.getListConfig().size() == 0) {
			logger.info("Could not get config for all standard");
			return null;
		}

		for (ScoreConfigObject scoreConfig : config.getListConfig()) {
			// Tinh toan tung chi tieu 1
			calStandard(scoreConfig);
		}
		// Tong diem chua trong so
		calSumScore();
		// Diem so bo
		scorePreliminary();
		// Diem ching thuc
		calFinalScore();
		// Tinh xac xuat vo no
		calPDRating();

		convertToTag();

		processWarning();
		logger.info("Cal score result "+ gson.toJson(result));
		// Luu diem
		saveScore();
		
		return listScore;
	}

	public ScoreObject calScoreObject() {
		calScore();
		return result;
	}
	
	public ScoreObject loadScore(String profileID) {
		ScoreObject score = new ScoreObject();
		X_TDAB_SCORE xScore = ScoreAccess.findScore(profileID);
		List<X_TDAB_SCORE_DETAIL> listScoreDetail = ScoreAccess.findListScoreDetail(xScore.getTDAB_SCORE_ID());
		score.setPreliminaryScore(new BigDecimal(xScore.getPreliminaryScore()));
		score.setPdRate(xScore.getXSVN_Rate());
		score.setScore(new BigDecimal(xScore.getReleaseScore()));
		score.setTotalScore(xScore.getScore());
		ScoreStringTag scoreTag = new ScoreStringTag();
		scoreTag.setIndexScore(xScore.getRateScore().toEngineeringString());
		scoreTag.setSpScore(xScore.getSP_Score());
		scoreTag.setMoodyScore(xScore.getMoody_Score());
		score.setScoreTag(scoreTag);
		ScoreStringTag finalScoreTag = new ScoreStringTag();
		finalScoreTag.setIndexScore(xScore.getRateScoreChanged().toEngineeringString());
		finalScoreTag.setSpScore(xScore.getSP_Score_Changed());
		finalScoreTag.setMoodyScore(xScore.getMoody_Score_Changed());
		score.setFinalScoreTag(finalScoreTag);
		List<ScoreDisplayObject> listDisplay = new ArrayList<>();
		ScoreDisplayObject ptc39 = new ScoreDisplayObject();
		for(X_TDAB_SCORE_DETAIL detail : listScoreDetail) {
			if(!detail.getValue().equals("PTC39")) {
				ScoreConfigObject config = ScoreUtils.findConfig(detail.getValue());
				ScoreDisplayObject scoreObject = new ScoreDisplayObject();
				scoreObject.setGroupName(config.getSetOfStandard().getGroupName());
				scoreObject.setReleaseScore(detail.getScore_Changed());
				scoreObject.setSourceScore(detail.getScore());
				scoreObject.setStandard(config.getSetOfStandard());
				scoreObject.setTypeOfData(config.getSetOfStandard().getTypeOfValue());
				listDisplay.add(scoreObject);
			}
			else {
				ptc39.setGroupName(ScoreUtils.getPTC39().getGroupName());
				ptc39.setSourceScore(detail.getScore());
				ptc39.setTypeOfData(ScoreUtils.getPTC39().getTypeOfValue());
				ptc39.setStandard(ScoreUtils.getPTC39());
				ptc39.setReleaseScore(detail.getScore());
			}
			
		}
		listDisplay.add(ptc39);
		listDisplay = sort(listDisplay);
		score.setListScoreDetail(listDisplay);
		logger.info("profileID = "+profileID+"-----"+gson.toJson(score));
		return score;
	}

	// Tinh toan gia tri tung chi tieu
	private void calStandard(ScoreConfigObject configObject) {
		result = new ScoreObject();
		try {
			ScoreDisplayObject scoreObject = new ScoreDisplayObject();
			if (configObject.getSetOfStandard().getLevel() == 3 && !configObject.getStandardValue().equals("PTC39")) {
//						scoreObject.setGroupName(configObject.getSetOfStandard().getParent().getName());
				scoreObject.setTypeOfData(configObject.getSetOfStandard().getTypeOfValue());
				scoreObject.setStandard(configObject.getSetOfStandard());
				// Sau khi new thi se tu tinh gia tri gan vao ScoreServiceStep
				ScoreServiceStep scoreObjectStep = new ScoreServiceStep(configObject, profile);
				if (scoreObjectStep.getRsValue() != null) {
					scoreObject.setSourceScore(scoreObjectStep.getRsValue());
					scoreObject.setReleaseScore(scoreObjectStep.getFinalValue());
					if(scoreObjectStep.getConfig().getSetOfStandard().getTypeOfValue().equals("CIC")) {
						cic = cic.add(scoreObjectStep.getFinalValue());
					}
					
					if(scoreObjectStep.getConfig().getSetOfStandard().getTypeOfValue().equals("TC")) {
						tc = tc.add(scoreObjectStep.getFinalValue());
					}
					
					if(scoreObjectStep.getConfig().getSetOfStandard().getTypeOfValue().equals("PTC")) {
						ptc = ptc.add(scoreObjectStep.getFinalValue());
					}
					
					totalScore = totalScore.add(scoreObjectStep.getFinalValue());
				}
				listRsScore.add(scoreObjectStep);
				listScore.add(scoreObject);
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getMessage());
			logger.info("Error standard with value : " + configObject.getStandardValue());
		}

	}

	private void calSumScore() {
		result = new ScoreObject();
		result.setTotalScore(totalScore);
		result.setListScoreDetail(listScore);
		result.setPdRate(totalScore);
		logger.info("total score is ...." + totalScore);
	}

	private void saveScore() {
		X_TDAB_SCORE xScore = new X_TDAB_SCORE(ctx, 0, txtName);
		xScore.setTDAB_Customer_Profile_ID(customerProfileID);
		xScore.setPreliminaryScore(result.getPreliminaryScore().toEngineeringString());
		xScore.setXSVN_Rate(result.getPdRate());
		xScore.setRateScore(new BigDecimal(result.getScoreTag().getIndexScore()));
		xScore.setMoody_Score(result.getScoreTag().getMoodyScore());
		xScore.setCIC(cic.toEngineeringString());
		xScore.setTC_SCORE(tc.toEngineeringString());
		xScore.setPTC_SCORE(ptc.toEngineeringString());
		xScore.setSP_Score(result.getScoreTag().getSpScore());
		xScore.setScore(result.getTotalScore());
		xScore.setRateScoreChanged(new BigDecimal(result.getFinalScoreTag().getIndexScore()));
		xScore.setMoody_Score_Changed(result.getFinalScoreTag().getMoodyScore());
		xScore.setSP_Score_Changed(result.getFinalScoreTag().getSpScore());
		xScore.setReleaseScore(result.getScore().toEngineeringString());
		xScore.save();
		MCustomerProfile mCustomerProfile = MCustomerProfile.findByCustomerProfileId(customerProfileID);
		if (mCustomerProfile != null) {
			mCustomerProfile.setCIC_Score(cic.toEngineeringString());
			mCustomerProfile.setTC_SCORE(tc.toEngineeringString());
			mCustomerProfile.setPTC_SCORE(ptc.toEngineeringString());
			mCustomerProfile.save();
		}
		for (ScoreServiceStep scoreDetail : listRsScore) {
			X_TDAB_SCORE_DETAIL detail = new X_TDAB_SCORE_DETAIL(ctx, 0, txtName);
			detail.setTDAB_SCORE_ID(xScore.get_ID());
			detail.setMinMaxValue(scoreDetail.getExceptionValue());
			detail.setNaValue(scoreDetail.getNaValue().toEngineeringString());
			detail.setOutliersValue(scoreDetail.getOutLiersValue().toEngineeringString());
			detail.setSourceValue(scoreDetail.getValue());
			detail.setLogisticValue(scoreDetail.getLogisticValue().toEngineeringString());
			detail.setScore_Changed(scoreDetail.getFinalValue());
			detail.setScore(scoreDetail.getRsValue());
			detail.setValue(scoreDetail.getConfig().getStandardValue());
			detail.save();
		}
		X_TDAB_SCORE_DETAIL detail = new X_TDAB_SCORE_DETAIL(ctx, 0, txtName);
		detail.setValue(ScoreUtils.getPTC39().getValue());
		detail.setScore(config.getConfigPTC39Object().getScore());
		detail.setTDAB_SCORE_ID(xScore.get_ID());
		detail.save();
	}

	// (Total - SMIN)/(SMAX -SMIN)*97
	// Phase 9: Tính toán tổng điểm và XHTD
	private void scorePreliminary() {
		if (config.getSminMaxObject() == null) {
			return;
		}
		BigDecimal preliminaryScore = BigDecimal.ZERO;
		BigDecimal tu = totalScore.subtract(config.getSminMaxObject().getsMin()).multiply(ScoreUtils.getConfigPTC39());
		logger.info("Score Preliminary tu so" + tu);
		BigDecimal mau = config.getSminMaxObject().getsMax().subtract(config.getSminMaxObject().getsMin());
		logger.info("Score Preliminary mau so" + mau);
		preliminaryScore = tu.divide(mau, 5, RoundingMode.HALF_UP);
		logger.info("preliminaryScore is " + preliminaryScore);
		result.setPreliminaryScore(preliminaryScore);
	}
	

	// Tinh diem cuoi cung
	private void calFinalScore() {
		BigDecimal release = BigDecimal.ZERO;
		release = result.getPreliminaryScore().add(config.getConfigPTC39Object().getScore());
		logger.info("release score  is " + release);
		result.setScore(release);
	}

//	1/(1+k*EXP(-α-β*Điểm chính thức))
	private void calPDRating() {
		logger.info("Score release before callPDRating" + result.getScore());
		BigDecimal mau = config.getConfigPDRateObject().getValueBeta().multiply(result.getScore())
				.add(config.getConfigPDRateObject().getValueAlpha());
		mau = mau.multiply(new BigDecimal("-1"));
		mau = new BigDecimal(Math.exp(mau.doubleValue())).multiply(config.getConfigPDRateObject().getValueK());
		mau = mau.add(BigDecimal.ONE);
		BigDecimal pdRate = BigDecimal.ONE.divide(mau, 6, RoundingMode.HALF_UP).multiply(new BigDecimal("100"));
		logger.info("rating is ..."+pdRate);
		result.setPdRate(pdRate);
	}

	private boolean checkBC() {
		String auditer = profile.getNonFinancial().getFinancial_Statements_Audited();
		if (auditer.equals(X_TDAB_Financial_Non.FINANCIAL_STATEMENTS_AUDITED_3)) {
			return false;
		}
		return true;
	}

	private void convertToTag() {
		ScoreStringTag scoreTag = Utils.findPDRateByRate(config.getListScoreStringTag(), result.getPdRate());
		result.setScoreTag(scoreTag);
	}

	private void processWarning() {
		BigDecimal severity = profile.getProfile().getSeverity_Level();
		BigDecimal meium = profile.getProfile().getMedium_Level();
		
		int rank =Integer.valueOf(result.getScoreTag().getIndexScore());
		logger.info("--- rank before  .. "+rank);
		if(severity.compareTo(new BigDecimal(1)) >= 0 || meium.compareTo(new BigDecimal(3)) >= 0) {
			rank += 2 ;
		} else if(meium.compareTo(new BigDecimal(2)) == 0) {
			rank += 1;
		}
		
//		if(rank>22) {
//			rank = 22;
//		}
		
		String rk = Utils.convertRank(rank);
		logger.info("--- rank is  .. "+rk);
		ScoreStringTag scoreTag = Utils.findPDRateByIndex(rk ,config.getListScoreStringTag());
		logger.info("--- scoreTag.. "+scoreTag);
		result.setFinalScoreTag(scoreTag);
	}

	private void loadConfig() {
		String owner = profile.getNonFinancial().getOwnership_Location_Business();
		String bctc;
		if (!checkBC()) {
			bctc = X_TDAB_BCTC.NAME_KTT;
		} else {
			bctc = X_TDAB_BCTC.NAME_KT;
		}
		config = new ConfigAllObject();
		List<ScoreConfigObject> listConfig = ScoreUtils.getListConfig();
		config.setListConfig(listConfig);
		config.setConfigPTC39Object(ScoreUtils.findConfigPTC39(owner));
		config.setSminMaxObject((ScoreUtils.finMinMax(bctc)));
		config.setConfigPDRateObject(ScoreUtils.getConfigPDRate());
		config.setListScoreStringTag(ScoreUtils.getListConfigScoreTag());
		logger.info("Config is ...." + gson.toJson(config));
	}
	
	private List<ScoreDisplayObject> sort(List<ScoreDisplayObject> listDisplay) {
		List<ScoreDisplayObject> result = new ArrayList<>();
		for(ScoreDisplayObject ptc : listDisplay) {
			if(ptc.getTypeOfData().equals("PTC") && !ptc.getStandard().getValue().equals("PTC39")) {
				result.add(ptc);
			}
		}
		
		for(ScoreDisplayObject cic : listDisplay) {
			if(cic.getTypeOfData().equals("CIC") && !cic.getStandard().getValue().equals("PTC39")) {
				result.add(cic);
			}
		}
		
		for(ScoreDisplayObject tc : listDisplay) {
			if(tc.getTypeOfData().equals("TC") && !tc.getStandard().getValue().equals("PTC39")) {
				result.add(tc);
			}
		}
		
		result.add(listDisplay.get(listDisplay.size()-1));
		return result;
	}

}
