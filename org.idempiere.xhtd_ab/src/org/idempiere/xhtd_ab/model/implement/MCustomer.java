package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Customer;
import org.idempiere.xhtd_ab.utils.MessageUtil;
import org.idempiere.xhtd_ab.utils.ValidateUtil;

public class MCustomer extends X_TDAB_Customer {

	private static final String REVENUE_MAX = "200000000000";
	private static final String REVENUE_MIN = "25000000000";

	public MCustomer(Properties ctx, int TDAB_Customer_ID, String trxName) {
		super(ctx, TDAB_Customer_ID, trxName);
	}

	public MCustomer(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (newRecord) {
			String error = "";
			
			// check doanh thu
			if (new BigDecimal(REVENUE_MIN).compareTo(getRevenue()) > 0
					|| new BigDecimal(REVENUE_MAX).compareTo(getRevenue()) < 0) {
				error = Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DOANH_THU);
			}

			if (!ValidateUtil.isNumberAndCheckSize(getName_Ids())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CCCD);
			}

			if (!ValidateUtil.isCheckNumberAndMinus(getTaxCode())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_STRING_MST);
			}
			if (checkTaxCode(this)) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DUPLICATE_TAXCODE);
			}

			if (!ValidateUtil.isCheckNumber(getNumberBusiness())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_STRING);
			}
			if (!ValidateUtil.isNumberBusiness(getNumberBusiness())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_LENGTH_NUMBER);
			}
			if (checkNumberBusiness(this)) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DUPLICATE_NUMBER);
			}
			if (getCIC_ID() != null && getCIC_ID().length() > 0) {
				if (!ValidateUtil.isCheckNumber(getCIC_ID())) {
					error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_STRING_CIC);
				}
			}
			if (error != "") {
				throw new IllegalArgumentException(error);
			}
			setBusiness_Unit(String.valueOf(getAD_Org_ID()));
			setValue(getTaxCode());
		} else {
			
			String error = "";
			if (new BigDecimal(REVENUE_MIN).compareTo(getRevenue()) > 0
					|| new BigDecimal(REVENUE_MAX).compareTo(getRevenue()) < 0) {
				error = Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DOANH_THU);
			}
			if (!ValidateUtil.isNumberAndCheckSize(getName_Ids())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_CCCD);
			}
			if (!ValidateUtil.isCheckNumberAndMinus(getTaxCode())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_STRING_MST);
			}
			if (!ValidateUtil.isCheckNumber(getNumberBusiness())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_STRING);
			}
			if (!ValidateUtil.isNumberBusiness(getNumberBusiness())) {
				error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_LENGTH_NUMBER);
			}
			if (getCIC_ID() != null && getCIC_ID().length() > 0) {
				if (!ValidateUtil.isCheckNumber(getCIC_ID())) {
					error = error + Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_STRING_CIC);
				}
			}
			List<MCustomerProfile> lstCustomerProfile = getListCustomerProfile(getTDAB_Customer_ID());
			for (MCustomerProfile customerProfile : lstCustomerProfile) {
				customerProfile.setCIC_ID(getCIC_ID());
				customerProfile.save();
			}
			if (error != "") {
				throw new IllegalArgumentException(error);
			}

		}
		

		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
//		setValue(getTaxCode());

		return super.afterSave(newRecord, success);
	}

	@Override
	protected boolean beforeDelete() {
		List<MCustomerProfile> listProfile = getListByMCustomerId(this);
		if (listProfile.size() > 0) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DELETE_CUSTOMER));
		}
		return super.beforeDelete();
	}

	@Override
	protected boolean afterDelete(boolean success) {
		return super.afterDelete(success);
	}

	private static List<MCustomerProfile> getListByMCustomerId(MCustomer mCustomer) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_TDAB_Customer_ID + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { mCustomer.getTDAB_Customer_ID() }).list();
	}

	private static boolean checkNumberBusiness(MCustomer mCus) {
		List<Object> parames = new ArrayList<>();
		StringBuffer whereClause = new StringBuffer();
		whereClause.append(COLUMNNAME_NumberBusiness + "=?");
		parames.add(mCus.getNumberBusiness());
		int count = new Query(null, Table_Name, whereClause.toString(), null).setParameters(parames).count();
		if (count > 0) {
			return true;
		}
		return false;
	}

	private static boolean checkTaxCode(MCustomer mCust) {
		List<Object> parames = new ArrayList<>();
		StringBuffer whereClause = new StringBuffer();
		whereClause.append(COLUMNNAME_TaxCode + "=?");
		parames.add(mCust.getTaxCode());
		int count = new Query(null, Table_Name, whereClause.toString(), null).setParameters(parames).count();
		if (count > 0) {
			return true;
		}
		return false;
	}

	public static List<MCustomerProfile> getListCustomerProfile(int customerId) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_TDAB_Customer_ID + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { customerId }).list();
	}
}
