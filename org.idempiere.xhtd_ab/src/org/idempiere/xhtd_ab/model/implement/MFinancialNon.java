package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.model.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.utils.CustomerScoreUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MFinancialNon extends X_TDAB_Financial_Non {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MFinancialNon(Properties ctx, int TDAB_Financial_ID, String trxName) {
		super(ctx, TDAB_Financial_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MFinancialNon(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	private List<MNonFinancialHistory> getHistoryByIdAndUser(Integer id, Integer financial_id) {
		StringBuilder whereClauseFinal = new StringBuilder(MNonFinancialHistory.COLUMNNAME_CreatedBy + "=? AND "
				+ MNonFinancialHistory.COLUMNNAME_TDAB_Financial_Non_ID + "=?");
		return new Query(null, MNonFinancialHistory.Table_Name, whereClauseFinal.toString(), null)
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
			MNonFinancialHistory mNonFinancialHistory = null;
			CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
					MCustomerProfile.COLUMNNAME_StatusNonFinance);

			List<MNonFinancialHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),
					getTDAB_Financial_Non_ID());
			if (listFinanHis.size() == 0) {
				mNonFinancialHistory = new MNonFinancialHistory(getCtx(), 0, get_TrxName());
				mNonFinancialHistory.setTDAB_Financial_Non_ID(getTDAB_Financial_Non_ID());
			} else {
				mNonFinancialHistory = listFinanHis.get(0);
			}
			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);
			mNonFinancialHistory.setHisCreatedBy(user.getName());
			mNonFinancialHistory.setAverage_Balance_12_Month(getAverage_Balance_12_Month());
			mNonFinancialHistory.setYears_Operation(getYears_Operation());
			mNonFinancialHistory.setYears_Experience_CEO(getYears_Experience_CEO());
			mNonFinancialHistory.setType_Business(getType_Business());
			mNonFinancialHistory.setROCE_Index(getROCE_Index().toString());
			mNonFinancialHistory.setFinancial_Statements_Audited(getFinancial_Statements_Audited());
			mNonFinancialHistory.setOwnership_Location_Business(getOwnership_Location_Business());
			mNonFinancialHistory.setDate_First_Business_Regist(getDate_First_Business_Regist());
			mNonFinancialHistory.setComment_On_Audit_Report(getComment_On_Audit_Report());
			mNonFinancialHistory.setNumber_Of_Work(getNumber_Of_Work());
			mNonFinancialHistory.setBusiness_Profession_His(
					MTDABBusinessAreas.getBusinessAreasById(getTDAB_Business_Areas_ID()).getJobName());
			MCustomerProfile mCustomerProfile = MCustomerProfile.findByCustomerProfileId(getTDAB_Customer_Profile_ID());
			MTDABBusinessAreas mtdabBusinessAreas = MTDABBusinessAreas
					.getBusinessAreasById(getTDAB_Business_Areas_ID());
			if (mCustomerProfile != null) {
				mCustomerProfile.setDate_First_Business_Regist(getDate_First_Business_Regist());
				if (mtdabBusinessAreas != null) {
					mCustomerProfile.setBusiness_Name(mtdabBusinessAreas.getJobName());
				}
				mCustomerProfile.setTYPE_BCTC(getFinancial_Statements_Audited());
				mCustomerProfile.setType_Business(getType_Business());
				mCustomerProfile.save();
			}

			mNonFinancialHistory.save();
		}
		else if ("1".equals(getIsRecordReject()) && !newRecord) {
			MNonFinancialHistory mNonFinancialHistory = null;
			CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
					MCustomerProfile.COLUMNNAME_StatusNonFinance);

			List<MNonFinancialHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),
					getTDAB_Financial_Non_ID());
			mNonFinancialHistory = new MNonFinancialHistory(getCtx(), 0, get_TrxName());
			mNonFinancialHistory.setTDAB_Financial_Non_ID(getTDAB_Financial_Non_ID());
	
			Integer userID = Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);
			mNonFinancialHistory.setHisCreatedBy(user.getName());
			mNonFinancialHistory.setAverage_Balance_12_Month(getAverage_Balance_12_Month());
			mNonFinancialHistory.setYears_Operation(getYears_Operation());
			mNonFinancialHistory.setYears_Experience_CEO(getYears_Experience_CEO());
			mNonFinancialHistory.setType_Business(getType_Business());
			mNonFinancialHistory.setROCE_Index(getROCE_Index().toString());
			mNonFinancialHistory.setFinancial_Statements_Audited(getFinancial_Statements_Audited());
			mNonFinancialHistory.setOwnership_Location_Business(getOwnership_Location_Business());
			mNonFinancialHistory.setDate_First_Business_Regist(getDate_First_Business_Regist());
			mNonFinancialHistory.setComment_On_Audit_Report(getComment_On_Audit_Report());
			mNonFinancialHistory.setNumber_Of_Work(getNumber_Of_Work());
			mNonFinancialHistory.setBusiness_Profession_His(
					MTDABBusinessAreas.getBusinessAreasById(getTDAB_Business_Areas_ID()).getJobName());
			MCustomerProfile mCustomerProfile = MCustomerProfile.findByCustomerProfileId(getTDAB_Customer_Profile_ID());
			MTDABBusinessAreas mtdabBusinessAreas = MTDABBusinessAreas
					.getBusinessAreasById(getTDAB_Business_Areas_ID());
			if (mCustomerProfile != null) {
				mCustomerProfile.setDate_First_Business_Regist(getDate_First_Business_Regist());
				if (mtdabBusinessAreas != null) {
					mCustomerProfile.setBusiness_Name(mtdabBusinessAreas.getJobName());
				}
				mCustomerProfile.setTYPE_BCTC(getFinancial_Statements_Audited());
				mCustomerProfile.setType_Business(getType_Business());
				mCustomerProfile.save();
			}

			mNonFinancialHistory.save();
			
		}

		return super.afterSave(newRecord, success);
	}

	private List<MFinancialNon> getNonFinancialByCustomerProfile(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialNon.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MFinancialNon.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).list();
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		MCustomerProfile profile = new MCustomerProfile(getCtx(), getTDAB_Customer_Profile_ID(), get_TrxName());

		List<MFinancialNon> mNonFinancial = getNonFinancialByCustomerProfile(getTDAB_Customer_Profile_ID());

		if (newRecord) {
			if (mNonFinancial.size() != 0) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_NON_FINANCIAL));
			}
		}

		// check ngày đăng ký kinh doanh
		if (getDate_First_Business_Regist().compareTo(profile.getDate_Loan()) > 0) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DATE_REGISTER_KD));
		}
		// check nam kinh doanh phai > 1
		if (getYears_Operation().compareTo(new BigDecimal(1)) == -1) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_YEARS_OPERATION));
		}
		// DN da QHTD thi tk phai > 0
//		if ("2".equals(getType_Business())) {
//			if (getAverage_Balance_12_Month().compareTo(new BigDecimal(0)) == 0) {
//				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_AVERAGE_BALANCE_12_MONTH));
//			}
//		}
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
		return super.afterDelete(success);
	}

}
