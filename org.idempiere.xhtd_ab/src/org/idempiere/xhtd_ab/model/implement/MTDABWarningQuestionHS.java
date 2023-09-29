package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.model.X_AD_User;
import org.compiere.util.Env;
import org.idempiere.xhtd_ab.model.X_TDAB_Warning_Question_HS;

public class MTDABWarningQuestionHS extends X_TDAB_Warning_Question_HS {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MTDABWarningQuestionHS(Properties ctx, int TDAB_Warning_Question_HS_ID, String trxName) {
		super(ctx, TDAB_Warning_Question_HS_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABWarningQuestionHS(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	private List<MWarningQuestionHis> getHistoryByIdAndUser(Integer id, Integer warning_id) {
		StringBuilder whereClauseFinal = new StringBuilder(MWarningQuestionHis.COLUMNNAME_CreatedBy + "=? AND "
				+ MWarningQuestionHis.COLUMNNAME_TDAB_Warning_Question_HS_ID + "=?");
		return new Query(null, MWarningQuestionHis.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id, warning_id }).list();
	}

	private X_AD_User getUserById(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(X_AD_User.COLUMNNAME_AD_User_ID + "=?");
		return new Query(null, X_AD_User.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).first();
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		if (!"1".equals(getIsRecordReject())) {
			MWarningQuestionHis mWarningHistory = null;
			List<MWarningQuestionHis> listWarningHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),
					getTDAB_Warning_Question_HS_ID());
			if (listWarningHis.size() == 0) {
				mWarningHistory = new MWarningQuestionHis(getCtx(), 0, get_TrxName());
				mWarningHistory.setTDAB_Warning_Question_HS_ID(getTDAB_Warning_Question_HS_ID());
			} else {
				mWarningHistory = listWarningHis.get(0);
			}
			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);
			mWarningHistory.setHisCreatedBy(user.getName());
			mWarningHistory.setWarning_Question_Info_ID(getWarning_Question_Info_ID());
			mWarningHistory.setValue(getValue());
			mWarningHistory.setAnswer_CV(getAnswer_CV());
			mWarningHistory.save();

		
	} else if ("1".equals(getIsRecordReject()) && !newRecord) {
		MWarningQuestionHis mWarningHistory = null;
		List<MWarningQuestionHis> listWarningHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),
				getTDAB_Warning_Question_HS_ID());
		
			mWarningHistory = new MWarningQuestionHis(getCtx(), 0, get_TrxName());
			mWarningHistory.setTDAB_Warning_Question_HS_ID(getTDAB_Warning_Question_HS_ID());
		
		Integer userID = Env.getAD_User_ID(getCtx());
		X_AD_User user = getUserById(userID);
		mWarningHistory.setHisCreatedBy(user.getName());
		mWarningHistory.setWarning_Question_Info_ID(getWarning_Question_Info_ID());
		mWarningHistory.setValue(getValue());
		mWarningHistory.setAnswer_CV(getAnswer_CV());
		mWarningHistory.save();
	}
		return super.afterSave(newRecord, success);
	}

}
