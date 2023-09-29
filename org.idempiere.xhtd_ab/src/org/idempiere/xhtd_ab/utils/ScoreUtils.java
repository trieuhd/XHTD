package org.idempiere.xhtd_ab.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.idempiere.xhtd_ab.access.ScoreAccess;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC;
import org.idempiere.xhtd_ab.model.X_TDAB_Config_Value;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.model.X_TDAB_Info_CIC;
import org.idempiere.xhtd_ab.model.X_TDAB_Logistic_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Median_Mean_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Normalized_Param_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_PC;
import org.idempiere.xhtd_ab.model.X_TDAB_PTC_CIC_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Point_Rate_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Rating_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE_CONFIG;
import org.idempiere.xhtd_ab.model.X_TDAB_STANDARD;
import org.idempiere.xhtd_ab.object.ConfigPDRateObject;
import org.idempiere.xhtd_ab.object.ConfigPTC39Object;
import org.idempiere.xhtd_ab.object.ConfigWOEObject;
import org.idempiere.xhtd_ab.object.ScoreConfigObject;
import org.idempiere.xhtd_ab.object.ScoreStringTag;
import org.idempiere.xhtd_ab.object.SetOfStandard;
import org.idempiere.xhtd_ab.object.SminSmaxObject;

public class ScoreUtils extends BaseObject {
	private static List<SetOfStandard> listSetOfStandard;
	
	private static List<ScoreConfigObject> listScoreConfig;
	
	private static List<SminSmaxObject> listSminSmax;
	
	private static List<ConfigPTC39Object> listConfigPTC39;
	
	private static ConfigPDRateObject configPDRate;
	
	private static List<ScoreStringTag> listScoreStringTag;
	
	private static List<ConfigWOEObject> listWOE;
	
	private static SetOfStandard ptc39;

	public static List<SetOfStandard> getListStandard() {
		logger.info("Get standard start ... ");
		if (listSetOfStandard == null) {
			setListSetOfStandard();
		}
		logger.info("Get standard end ... ");
		return listSetOfStandard;
	}
	
	
	
	public static List<ScoreConfigObject> getListConfig() {
		logger.info("Get list config start ... ");
		// Lay list standard truoc khi lay list config
		getListStandard();
		if(listScoreConfig == null) {
			setListScoreConfig();
		}
		logger.info("Get list config end ... ");
		return listScoreConfig;
	}
	
	public static String getTableName(String value) {
		if(value.equals("PTC")) {
			return X_TDAB_Financial_Non.Table_Name;
		}
		if(value.equals("CIC")) {
			return X_TDAB_Info_CIC.Table_Name;
		}
		return null;
	}

	private static void setListSetOfStandard() {
		List<X_TDAB_STANDARD> listStandard = ScoreAccess.getStandard();
//		List<X_TDAB_GROUP_STANDARD> listGroupStand = ScoreAccess.getGroupStandard();
//		List<X_TDAB_SET_OF_STANDARD> listSetOfStands = ScoreAccess.getSetOfStandard();
		listSetOfStandard = new ArrayList<>();
		
//		for(X_TDAB_SET_OF_STANDARD setOfStandard : listSetOfStands) {
//			listSetOfStandard.add(setStandard(setOfStandard));
//		}
//		
//		for(X_TDAB_GROUP_STANDARD groupStand : listGroupStand) {
//			listSetOfStandard.add(setStandard(groupStand));
//		}
		
		for(X_TDAB_STANDARD standard : listStandard) {
			listSetOfStandard.add(setStandard(standard));
			if(standard.getValue().equals("PTC39")) {
				ptc39 = setStandard(standard);
			}
		}
		
		for(SetOfStandard stand : listSetOfStandard) {
			if(stand.getLevel()>1) {
				stand.setParent(findByParentID(stand.getParentID()));
			}
		}
	}
	
	public static SetOfStandard getPTC39() {
		return ptc39;
	}
	
	public static SetOfStandard findByParentID(String parentValue) {
		for(SetOfStandard stand : listSetOfStandard) {
			if(stand.getValue().equals(parentValue)) {
				return stand;
			}
		}
		return null;
	}
	
	private static SetOfStandard setStandard(Object standard) {
		SetOfStandard rs = new SetOfStandard();
		List<X_TDAB_Point_Rate_Info> listPointRate = ScoreAccess.getListPointRate();
		if(standard instanceof X_TDAB_STANDARD) {
			X_TDAB_STANDARD rq = (X_TDAB_STANDARD) standard;
			rs.setName(rq.getName());
			rs.setValue(rq.getValue());
//			rs.setRate(rq.getRate());
			rs.setGroupName(rq.getTDAB_GROUP_STANDARD().getName());
//			rs.setwAuditer(rq.getW_AUDITER());
//			rs.setwUnauditer(rq.getW_UNAUDITER());
			rs.setParentID(rq.getTDAB_GROUP_STANDARD().getValue());
			rs.setLevel(3);
			rs.setTypeOfValue(rq.getTDAB_GROUP_STANDARD().getTDAB_SET_OF_STANDARD().getValue());
			setPointRate(rs, listPointRate);
			return rs;
		}
		

//		if(standard instanceof X_TDAB_GROUP_STANDARD) {
//			X_TDAB_GROUP_STANDARD rq = (X_TDAB_GROUP_STANDARD) standard;
//			rs.setName(rq.getName());
//			rs.setValue(rq.getValue());
//			rs.setParentID(rq.getTDAB_SET_OF_STANDARD().getValue());
//			rs.setLevel(2);
//			return rs;
//		}
//		
//		if(standard instanceof X_TDAB_SET_OF_STANDARD) {
//			X_TDAB_SET_OF_STANDARD rq = (X_TDAB_SET_OF_STANDARD) standard;
//			rs.setName(rq.getName());
//			rs.setValue(rq.getValue());
//			rs.setLevel(1);
//			return rs;
//		}
		return rs;
		
	}
	private static void setPointRate(SetOfStandard standard,List<X_TDAB_Point_Rate_Info> listPointRate) {
		for(X_TDAB_Point_Rate_Info pointRate : listPointRate) {
			if(standard.getValue().equals(pointRate.getName())) {
				standard.setwAuditer(pointRate.getBCTC_KT());
				standard.setwUnauditer(pointRate.getBCTC_KKT());
				standard.setRate(pointRate.getMark_Point());
			}
		}
	}
	
	private static void setListScoreConfig() {
		List<X_TDAB_SCORE_CONFIG> listConfigDB = ScoreAccess.getScoreConfig();
		List<X_TDAB_Logistic_Info> listLogistic  = ScoreAccess.getListLogistic_Info();
		List<X_TDAB_Min_Max_Info> listMinMaxNA = ScoreAccess.findByMinMax();
		List<X_TDAB_Median_Mean_Info> listMedianMean = ScoreAccess.getListMedianMean();
		List<X_TDAB_PTC_CIC_Info> listPTC_CIC = ScoreAccess.getlistPTCCIC();
		List<X_TDAB_Normalized_Param_Info> listNormalized = ScoreAccess.getListNormalized();
		logger.info("Get listConfigDB end ... ");
		listScoreConfig = new ArrayList<>();
		for(X_TDAB_SCORE_CONFIG config : listConfigDB) {
			ScoreConfigObject cg = convertConfig(config);
			setMinMax(cg,listMinMaxNA);
			setMedianMean(cg,listMedianMean);
			setLogistic(cg,listLogistic);
			setPTC_CIC(cg, listPTC_CIC);
			setNormalized(cg, listNormalized);
			listScoreConfig.add(cg);
		}
		
	}
	
	private static void setLogistic(ScoreConfigObject cg, List<X_TDAB_Logistic_Info> listLogistic) {
		for(X_TDAB_Logistic_Info loggistic : listLogistic) {
			if(cg.getStandardValue().equals(loggistic.getName())) {
				cg.setLogisticA(loggistic.geta_logistic());
				cg.setLogisticB(loggistic.getb_logistic());
				return;
			}
		}
	}
	
	private static void setMinMax(ScoreConfigObject cg, List<X_TDAB_Min_Max_Info> listLogistic) {
		for(X_TDAB_Min_Max_Info minMax : listLogistic) {
			if(cg.getStandardValue().equals(minMax.getName())) {
				cg.setMinNaValue(minMax.getMin_Info());;
				cg.setMaxNaValue(minMax.getMax_Info());
				return;
			}
		}
	}
	
	private static void setPTC_CIC(ScoreConfigObject cg,List<X_TDAB_PTC_CIC_Info> listPTC_CIC) {
		for(X_TDAB_PTC_CIC_Info ptcCIC : listPTC_CIC) {
			if(cg.getStandardValue().equals(ptcCIC.getName())) {
				cg.setStrMean(ptcCIC.getMean());
				cg.setStrSD(ptcCIC.getSD());
				cg.setStrMeanS(ptcCIC.getMean_3());
				cg.setStrMeanP(ptcCIC.getMean_3_SD());
				return;
			}
		}
	}
	
	private static void setNormalized(ScoreConfigObject cg,List<X_TDAB_Normalized_Param_Info> listNormalized) {
		for(X_TDAB_Normalized_Param_Info ptcNormalized : listNormalized) {
			if(cg.getStandardValue().equals(ptcNormalized.getName())) {
				cg.setCvMeanSD(ptcNormalized.getMean());
				cg.setCvSD(ptcNormalized.getSD());
				return;
			}
		}
	}
	
	private static void setMedianMean(ScoreConfigObject cg,List<X_TDAB_Median_Mean_Info> listMedianMean) {
		for(X_TDAB_Median_Mean_Info medianMean : listMedianMean) {
			if(cg.getStandardValue().equals(medianMean.getName())) {
				if(medianMean.getMean() != null && !medianMean.getMean().equals(BigDecimal.ZERO)) {
					cg.setNaValue(medianMean.getMean());
				}
				else {
					cg.setNaValue(medianMean.getMedian());
				}
				return;
			}
		}
	}
	
	private static ScoreConfigObject convertConfig(X_TDAB_SCORE_CONFIG config){
		ScoreConfigObject object = new ScoreConfigObject();
		object.setFieldValue(config.getFieldValue());
		object.setStandardValue(config.getStandardValue());
//		object.setCvMeanSD(Utils.convertStringToNB(config.getCV_Mean()));
//		object.setCvSD(Utils.convertStringToNB(config.getCV_SD()));
//		object.setLogisticA(Utils.convertStringToNB(config.getLogistic_A()));
//		object.setLogisticB(Utils.convertStringToNB(config.getLogistic_B()));
//		object.setMaxNaValue(Utils.convertStringToNB(config.getNA_Max()));
//		object.setMinNaValue(Utils.convertStringToNB(config.getNA_Min()));
//		object.setStrMean(Utils.convertStringToNB(config.getStr_Mean()));
//		object.setStrSD(Utils.convertStringToNB(config.getStr_SD()));
//		object.setNaValue(Utils.convertStringToNB(config.getNA_Value()));
//		object.setStrMeanS(Utils.convertStringToNB(config.getStr_Mean_SD()));
//		object.setStrMeanP(Utils.convertStringToNB(config.getStr_Mean_SD_Plus()));
		object.setSetOfStandard(finStandardByValue(config.getStandardValue()));
		return object;
	}
	
	public static ScoreConfigObject findConfig(String standValue) {
		if(listScoreConfig == null || listScoreConfig.size() == 0) {
			getListConfig();
		}
		for(ScoreConfigObject config : listScoreConfig) {
			if(config.getStandardValue().equals(standValue)) {
				return config;
			}
		}
		return null;
	}
	
	private static void setSminSmax() {
		listSminSmax = new ArrayList<>();
		List<X_TDAB_BCTC> listBCTC = ScoreAccess.findAllBCTC();
		if(listBCTC != null && listBCTC.size() > 0) {
			for(X_TDAB_BCTC bctc : listBCTC) {
				SminSmaxObject s = new SminSmaxObject();
				s.setsMax(bctc.getSmax());
				s.setsMin(bctc.getSmin());
				s.setType(bctc.getName());
				listSminSmax.add(s);
			}
		}
		logger.info("BCTC is ......"+gson.toJson(listSminSmax));
	}
	
	private static void setListPTC39() {
		logger.info("Start get List BTC39");
		List<X_TDAB_Config_Value> listValue = ScoreAccess.findConfigPTC39();
		listConfigPTC39 = new ArrayList<>();
		for(X_TDAB_Config_Value config : listValue) {
			ConfigPTC39Object object = new ConfigPTC39Object();
			object.setScore(config.getScore());
			object.setType(config.getPTC39());
			listConfigPTC39.add(object);
		}
		logger.info("PTC 309 is "+ gson.toJson(listConfigPTC39));
	}
	
	private static SetOfStandard finStandardByValue(String value) {
		if(listSetOfStandard == null || listSetOfStandard.size()==0){
			return null;
		}
		for(SetOfStandard standard : listSetOfStandard) {
			if(standard.getValue().equals(value)) {
				return standard;
			}
		}
		return null;
	}
	
	public static SminSmaxObject finMinMax(String bctc) {
		logger.info("Input bttc "+bctc);
		getListSminMax();
		for(SminSmaxObject object : listSminSmax) {
			if(object.getType().equals(bctc)) {
				return object;
			}
		}
		return null;
	}
	
	public static ConfigPTC39Object findConfigPTC39(String owner) {
		listConfigPTC39();
		for(ConfigPTC39Object config : listConfigPTC39) {
			if(config.getType().equals(owner)) {
				return config;
			}
		}
		return null;
	}
	
	public static ConfigPDRateObject getConfigPDRate() {
		if(configPDRate ==null) {
			configPDRate();
		}
		return configPDRate;
	}
	
	private static void configPDRate() {
		X_TDAB_PC pc = ScoreAccess.findConfigPDRate();
		if(pc!=null) {
			configPDRate = new ConfigPDRateObject();
			configPDRate.setValueAlpha(pc.getAlpha());
			configPDRate.setValueBeta(pc.getbeta());
			configPDRate.setValueK(pc.getk());
		}
	}
	
	public static List<ScoreStringTag> getListConfigScoreTag() {
		logger.info("Score String tag start");
		if(listScoreStringTag == null ) {
			setListScoreTag();
		}
		logger.info("Score String tag end "+ gson.toJson(listScoreStringTag));
		return listScoreStringTag;
	}
	
	private static void setListScoreTag() {
		List<X_TDAB_Rating_Info> listRating = ScoreAccess.findRating();
		listScoreStringTag = new ArrayList<>();
		for(X_TDAB_Rating_Info rating : listRating) {
			ScoreStringTag tag = new ScoreStringTag();
			tag.setFromValue(rating.getPD_Thap());
			tag.setToValue(rating.getPD_Cao());
			tag.setIndexScore(rating.getInternal_Rating());
			tag.setSpScore(rating.getSP_Rating());
			tag.setMoodyScore(rating.getMoodys_Rating());
			listScoreStringTag.add(tag);
		}
	}
	public static List<ConfigWOEObject> getListWOE() {
		if(listWOE != null) {
			return listWOE;
		}
		listWOE = new ArrayList<>();
		listWOE.add(new ConfigWOEObject(0, 3, "-0.977251431663842","PTC5"));
		listWOE.add(new ConfigWOEObject(3, 7, "-0.243420674467453","PTC5"));
		listWOE.add(new ConfigWOEObject(7, 1000, "0.100757909537319","PTC5"));
		listWOE.add(new ConfigWOEObject(0, 1, "0.790701260983389","STT_30"));
		listWOE.add(new ConfigWOEObject(1, 2, "-2.00776123601757","STT_30"));
		listWOE.add(new ConfigWOEObject(2, 1000, "-3.69241761488942","STT_30"));
		return listWOE;
	}
	
	public static ConfigWOEObject findWOEObject(String value , String standardValue) {
		double dValue = Double.valueOf(value);
		List<ConfigWOEObject> listWOE =  getListWOE();
		for(ConfigWOEObject config : listWOE) {
			if(standardValue.equals(config.getStandValue())) {
				if( dValue>=config.getFromValue() && dValue<config.getToValue()) {
					return config;
				}
			}
		}
		return null;
	}
	
	
	private static void  getListSminMax() {
		if(listSminSmax == null) {
			setSminSmax();
		}
	}

	private static void listConfigPTC39() {
		if(listConfigPTC39 == null) {
			setListPTC39();
		}
	}
	
	public static BigDecimal getConfigPTC39() {
		BigDecimal rs = new BigDecimal("100");
		BigDecimal sh = BigDecimal.ZERO;
		if(listConfigPTC39 == null || listConfigPTC39.size() == 0) {
			setListPTC39();
		}
		for(ConfigPTC39Object config : listConfigPTC39) {
			if(config.getType().equals(X_TDAB_Config_Value.PTC39_SH)) {
				sh = config.getScore();
			}
		}
		return rs.subtract(sh);
	}
	

	public static void reloadConfig() {
//		logger.info("Start reload config .... ");
//		setListScoreConfig();
//		setListPTC39();
//		setSminSmax();
//		configPDRate();
//		setListScoreTag() ;
//		logger.info("end reload config .... ");
	}
}
