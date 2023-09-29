package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.model.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Info_CIC;
import org.idempiere.xhtd_ab.utils.CustomerScoreUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MInfoCIC extends X_TDAB_Info_CIC {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MInfoCIC(Properties ctx, int TDAB_Info_CIC_ID, String trxName) {
		super(ctx, TDAB_Info_CIC_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MInfoCIC(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
//	public MInfoCIC(MCustomerScore mCustomerScore) {
//		// TODO Auto-generated constructor stub
//		this (mCustomerScore.getCtx(), 0, mCustomerScore.get_TrxName());
//		if (mCustomerScore.get_ID() == 0)
//			throw new IllegalArgumentException("Header not saved");
//		setTDAB_Customer_Score_ID(mCustomerScore.getTDAB_Customer_Score_ID());
//	}

	private List<MCICHistory> getHistoryByIdAndUser(Integer id, Integer financial_id) {
		StringBuilder whereClauseFinal = new StringBuilder(
				MCICHistory.COLUMNNAME_CreatedBy + "=? AND " + MCICHistory.COLUMNNAME_TDAB_Info_CIC_ID + "=?");
		return new Query(null, MCICHistory.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id, financial_id }).list();
	}

	private X_AD_User getUserById(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(X_AD_User.COLUMNNAME_AD_User_ID + "=?");
		return new Query(null, X_AD_User.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).first();
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		if (!"1".equals(getIsRecordReject())) {
			MCICHistory mcicHistory = null;
			CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(), MCustomerScore.COLUMNNAME_StatusCIC);

			List<MCICHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()), getTDAB_Info_CIC_ID());
			if (listFinanHis.size() == 0) {
				mcicHistory = new MCICHistory(getCtx(), 0, get_TrxName());
				mcicHistory.setTDAB_Info_CIC_ID(getTDAB_Info_CIC_ID());
			} else {
				mcicHistory = listFinanHis.get(0);
			}
			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);
			mcicHistory.setHisCreatedBy(user.getName());
			mcicHistory.setNumber_loan_2_12m(getNumber_loan_2_12m());
			mcicHistory.setTotal_Loan_Arising_Date(getTotal_Loan_Arising_Date());
			mcicHistory.setNumber_CIC_Request_12m(getNumber_CIC_Request_12m());
			mcicHistory.save();
		} else if ("1".equals(getIsRecordReject()) && !newRecord) {
			MCICHistory mcicHistory = null;
			CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(), MCustomerScore.COLUMNNAME_StatusCIC);

			List<MCICHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()), getTDAB_Info_CIC_ID());

			mcicHistory = new MCICHistory(getCtx(), 0, get_TrxName());
			mcicHistory.setTDAB_Info_CIC_ID(getTDAB_Info_CIC_ID());

			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);
			mcicHistory.setHisCreatedBy(user.getName());
			mcicHistory.setNumber_loan_2_12m(getNumber_loan_2_12m());
			mcicHistory.setTotal_Loan_Arising_Date(getTotal_Loan_Arising_Date());
			mcicHistory.setNumber_CIC_Request_12m(getNumber_CIC_Request_12m());
			mcicHistory.save();
		}

		return super.afterSave(newRecord, success);
	}

	private List<MInfoCIC> getCICByCustomerProfile(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(MInfoCIC.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MInfoCIC.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).list();
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		List<MInfoCIC> mCIC = getCICByCustomerProfile(getTDAB_Customer_Profile_ID());

		if (newRecord) {
			if (mCIC.size() != 0) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_CIC));
			}
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean beforeDelete() {
		// TODO Auto-generated method stub
		return super.beforeDelete();
	}

	@Override
	protected boolean afterDelete(boolean success) {
		// TODO Auto-generated method stub
//		CustomerScoreUtil.checkStatusTabInProfile(getTDAB_Customer_Profile_ID(),
//				MCustomerProfile.Columname_sta, MManagerEnvDN.Table_Name, get_TrxName());
		return super.afterDelete(success);
	}

}
