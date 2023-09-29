package org.idempiere.xhtd_ab.process;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOHS;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABRejectInfo;
import org.idempiere.xhtd_ab.model.implement.MTDABWarningQuestionHS;
import org.idempiere.xhtd_ab.object.ScoreObject;
import org.idempiere.xhtd_ab.services.ScoreService;
import org.idempiere.xhtd_ab.utils.MessageUtil;
import org.idempiere.xhtd_ab.utils.ProcessUtil;

public class ActionProfileProcess extends SvrProcess {

	private String statusValue = "";
	private String note = "";
	private static final String STATUS = "Status";
	private static final String STATUS_OK = "Y";
	private static final String NOTE = "note";

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		for (ProcessInfoParameter processInfoParameter : getParameter()) {
			if (STATUS.equalsIgnoreCase(processInfoParameter.getParameterName())) {
				statusValue = processInfoParameter.getParameterAsString();
			}
			if (NOTE.equalsIgnoreCase(processInfoParameter.getParameterName())) {
				note = processInfoParameter.getParameterAsString();
			}
		}
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MCustomerProfile mCustomerScore = new MCustomerProfile(getCtx(), getRecord_ID(), null);
		if (mCustomerScore.getCIC_ID() == null) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_ID_CIC));
		}
		// set mức độ nghiem trong
		setLevelProfile();
		
		String docStatus = "";
		if (STATUS_OK.equalsIgnoreCase(statusValue)) {
			docStatus = ProcessUtil.getStatusApproved(mCustomerScore.getDocStatus());
			// call tinh diem
			mCustomerScore = callGetScore(mCustomerScore, docStatus);
			if (MCustomerProfile.DOCSTATUS_KhoiTao.equalsIgnoreCase(mCustomerScore.getDocStatus())) {
				if (!checkKO(mCustomerScore, docStatus)) {
					mCustomerScore.setDocStatus(MCustomerProfile.DOCSTATUS_ViPhamKO);
					mCustomerScore.setStatus_KO(MCustomerProfile.STATUS_KO_Yes);
					mCustomerScore.save(get_TrxName());
					showDialogMessage(MCustomerProfile.DOCSTATUS_ViPhamKO);
					return null;
				}
			} else if (MCustomerProfile.DOCSTATUS_ViPhamKO.equalsIgnoreCase(mCustomerScore.getDocStatus())) {
			}
		} else {
			docStatus = ProcessUtil.getStatusReject(mCustomerScore.getDocStatus());
			if (docStatus.equalsIgnoreCase(MCustomerProfile.DOCSTATUS_LoaiHoSo)) {
				mCustomerScore.setDocStatus(docStatus);
				mCustomerScore.save(get_TrxName());
			} else {
				saveInfoReject(mCustomerScore, docStatus);
			}

			showDialogMessage(docStatus);
			return null;
		}
		if (MCustomerProfile.DOCSTATUS_ChoDuyet.equalsIgnoreCase(docStatus)) {
			mCustomerScore.setNote_CV(note);
		} else if (MCustomerProfile.DOCSTATUS_KiemSoatDuyet.equalsIgnoreCase(docStatus)) {
			mCustomerScore.setNote_KS(note);
			mCustomerScore.setDate_Loan_KS(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			mCustomerScore.setUser_Approved_ID(getAD_User_ID());
		} else if (MCustomerProfile.DOCSTATUS_ThamDinhTinDung.equalsIgnoreCase(docStatus)) {
			mCustomerScore.setNote_TD(note);
			mCustomerScore.setDate_Loan_TD(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			mCustomerScore.setUser_Appraiser_ID(getAD_User_ID());
		}

		mCustomerScore.setDocStatus(docStatus);
		mCustomerScore.save();
		
//		System.out.println("save success");
		showDialogMessage(docStatus);
		return null;
	}

	private void showDialogMessage(String docStatus) {
		// TODO Auto-generated method stub
		String message = "";
		switch (docStatus) {
		case MCustomerProfile.DOCSTATUS_ViPhamKO:
			message = MessageUtil.VI_PHAM_KO;
			break;
		case MCustomerProfile.DOCSTATUS_ChoDuyet:
			message = MessageUtil.CHO_DUYET;
			break;
		case MCustomerProfile.DOCSTATUS_KiemSoatDuyet:
			message = MessageUtil.CHO_TD_DUYET;
			break;
		case MCustomerProfile.DOCSTATUS_ThamDinhTinDung:
			message = MessageUtil.DUYET;
			break;
		case MCustomerProfile.DOCSTATUS_KiemSoatTuChoi:
			message = MessageUtil.TU_CHOI;
			break;
		case MCustomerProfile.DOCSTATUS_ThamDinhTuChoi:
			message = MessageUtil.TU_CHOI;
			break;
		case MCustomerProfile.DOCSTATUS_LoaiHoSo:
			message = MessageUtil.LOAI_HO_SO;
			break;
		default:
			break;
		}
		addLog(Msg.getMsg(Env.getCtx(), message));

	}

	private boolean checkKO(MCustomerProfile mCustomerScore, String docStatus) {
		// TODO Auto-generated method stub
		List<MTDABDirectKOHS> mDirectKos = MCustomerProfile
				.getListDirectKO(mCustomerScore.getTDAB_Customer_Profile_ID());
		for (MTDABDirectKOHS mDirectKoHs : mDirectKos) {
			MTDABDirectKOInfo directKO = new MTDABDirectKOInfo(getCtx(), mDirectKoHs.getDirect_KO_Info_ID(),
					get_TrxName());
			if ((Integer.parseInt(mDirectKoHs.getAnswer_CV()) < getInt(directKO.getSmaller_KO().toString()))
					&& (Integer.parseInt(mDirectKoHs.getAnswer_CV()) > getInt((directKO.getBigger_KO().toString()))))
				return false;
		}
		return true;
	}

	private Integer getInt(String value) {
		if (value.equals("0.0"))
			return 0;
		else
			return Integer.parseInt(value);
	}

	private MCustomerProfile callGetScore(MCustomerProfile mCustomerScore, String docStatus) {
//		System.out.println("Start goi cham diem............");
		ScoreService service = new ScoreService(getCtx(), mCustomerScore.getTDAB_Customer_Profile_ID(), get_TrxName());
		ScoreObject scoreObject = service.calScoreObject();
		
		// save 3 gia tri tong diem, xac xuat vo no, rank theo từng trạng thai
		if (docStatus.equalsIgnoreCase(MCustomerProfile.DOCSTATUS_ChoDuyet)) {
			mCustomerScore.setTotalScore(scoreObject.getScore().toEngineeringString());
			mCustomerScore.setRate_Debt(scoreObject.getPdRate().toEngineeringString());
			mCustomerScore.setRank(scoreObject.getFinalScoreTag().getIndexScore());
		} else
		// cham diem theo KS (docStatus = DOCSTATUS_KiemSoatDuyet
		if (docStatus.equalsIgnoreCase(MCustomerProfile.DOCSTATUS_KiemSoatDuyet)) {
			mCustomerScore.setTotalScoreKS(scoreObject.getScore().toEngineeringString());
			mCustomerScore.setRate_Debt_KS(scoreObject.getPdRate().toEngineeringString());
			mCustomerScore.setRank_KS(scoreObject.getFinalScoreTag().getIndexScore());
		} else if (docStatus.equalsIgnoreCase(MCustomerProfile.DOCSTATUS_ThamDinhTinDung)) {
			mCustomerScore.setTotalScorePD(scoreObject.getScore().toEngineeringString());
			mCustomerScore.setRate_Debt_PD(scoreObject.getPdRate().toEngineeringString());
			mCustomerScore.setRank_PD(scoreObject.getFinalScoreTag().getIndexScore());
		}
		return mCustomerScore;
	}

	private void saveInfoReject(MCustomerProfile mCustomerScore, String docStatus) {
		// save info to table tdab_customer_profile
		mCustomerScore.setNREFUSE(mCustomerScore.getNREFUSE() + 1);
		mCustomerScore.setDATE_REFUSE(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		mCustomerScore.setINFO_REFUSE(note);
		mCustomerScore.setUser_Checked_ID(getAD_User_ID());
		if (docStatus.equalsIgnoreCase(MCustomerProfile.DOCSTATUS_KiemSoatTuChoi)) {
			mCustomerScore.setUser_Approved_ID(getAD_User_ID());
		} else if (docStatus.equalsIgnoreCase(MCustomerProfile.DOCSTATUS_ThamDinhTuChoi)) {
			mCustomerScore.setUser_Appraiser_ID(getAD_User_ID());
		}
		mCustomerScore.setDocStatus(docStatus);
		mCustomerScore.save(get_TrxName());

		// save info to table TDAB_Reject_Info
		MTDABRejectInfo mRejectInfo = new MTDABRejectInfo(getCtx(), 0, get_TrxName());
		mRejectInfo.setTDAB_Customer_Profile_ID(mCustomerScore.getTDAB_Customer_Profile_ID());
		mRejectInfo.setNREFUSE(mCustomerScore.getNREFUSE());
		mRejectInfo.setDATE_REFUSE(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		mRejectInfo.setNote(note);
		mRejectInfo.setUser_Checked_ID(mCustomerScore.getUser_Checked_ID());
		mRejectInfo.setAD_User_ID(mCustomerScore.getUser_Score_ID());
		mRejectInfo.save(get_TrxName());
	}

	public void setLevelProfile() {
		MCustomerProfile profile = new MCustomerProfile(getCtx(), getRecord_ID(), null);

		int count1 = getCountLevel(MTDABWarningQuestionHS.WARNING_QUESTION_LEVEL_1,
				profile.getTDAB_Customer_Profile_ID());
		int count2 = getCountLevel(MTDABWarningQuestionHS.WARNING_QUESTION_LEVEL_2,
				profile.getTDAB_Customer_Profile_ID());

		// save info to customer profile;
		profile.setSeverity_Level(new BigDecimal(count1));
		profile.setMedium_Level(new BigDecimal(count2));

		profile.save();
	}

	private int getCountLevel(String warningQuestionLevel, int profileId) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("SELECT COUNT(*) FROM ").append(MTDABWarningQuestionHS.Table_Name);
		sql.append(" WHERE ").append(MTDABWarningQuestionHS.COLUMNNAME_TDAB_Customer_Profile_ID);
		sql.append(" = ? ").append(" AND ").append(MTDABWarningQuestionHS.COLUMNNAME_Warning_Question_Level)
				.append(" = ? ");
		sql.append(" AND ").append(MTDABWarningQuestionHS.COLUMNNAME_Answer_CV).append(" = ? ");

		int count = DB.getSQLValue(get_TrxName(), sql.toString(),
				new Object[] { profileId, warningQuestionLevel, MTDABWarningQuestionHS.ANSWER_CV_Yes });

		return count;
	}
}
