package org.idempiere.xhtd_ab.callout;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.apache.log4j.Logger;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MQuery;
import org.compiere.model.MTab;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.idempiere.xhtd_ab.model.implement.MCustomer;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MCustomerScore;

public class CustomerProfileCallout implements IColumnCallout {
	Logger log = Logger.getLogger(this.getClass());

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {

		MQuery query = new MQuery();
		String srtWinDowName = "";
		MWindow objMWindow = getADWindowName(mTab);
		if (objMWindow != null) {
			srtWinDowName = objMWindow.getName();
		}
		if (MCustomerProfile.COLUMNNAME_TDAB_Customer_ID.equalsIgnoreCase(mField.getColumnName()) && value != null) {
			MCustomer customer = new MCustomer(ctx, Integer.valueOf(String.valueOf(value)), null);
			List<MCustomerProfile> mCus = findByCustomerProfileId(Integer.valueOf(String.valueOf(value)));
			setInfoCustomer(mTab, customer, srtWinDowName, mCus);
		}

		return null;
	}

	private void setInfoCustomer(GridTab mTab, MCustomer customer, String srtWinDowName, List<MCustomerProfile> mCus) {
		// TODO Auto-generated method stub
		mTab.setValue(MCustomerProfile.COLUMNNAME_Name, customer.getName());
		mTab.setValue(MCustomerProfile.COLUMNNAME_CIC_ID, customer.getCIC_ID());
		mTab.setValue(MCustomerProfile.COLUMNNAME_CompanyName, customer.getCompanyName());
		mTab.setValue(MCustomerProfile.COLUMNNAME_Date_Loan, new Timestamp(Calendar.getInstance().getTimeInMillis()));
		mTab.setValue(MCustomerProfile.COLUMNNAME_Revenue, customer.getRevenue());
		mTab.setValue(MCustomerProfile.COLUMNNAME_Name_Ids, customer.getName_Ids());
		mTab.setValue(MCustomerProfile.COLUMNNAME_NumberBusiness, customer.getNumberBusiness());
		mTab.setValue(MCustomerProfile.COLUMNNAME_TaxCode, customer.getTaxCode());
		mTab.setValue(MCustomerProfile.COLUMNNAME_Value, customer.getValue());
		mTab.setValue(MCustomerProfile.COLUMNNAME_Status_DN, customer.getStatus());
		if (("TDAB_Update_Reject").equals(srtWinDowName)) {
			mTab.setValue(MCustomerProfile.COLUMNNAME_IsRecordReject, "1");
			if (mCus.size() > 0) {
				mTab.setValue(MCustomerProfile.COLUMNNAME_Note, mCus.get(0).getNote());
				mTab.setValue(MCustomerProfile.COLUMNNAME_Date_CiC, mCus.get(0).getDate_CiC());
				mTab.setValue(MCustomerProfile.COLUMNNAME_StatusCIC, MCustomerScore.STATUSFINANCE_Success);
				mTab.setValue(MCustomerProfile.COLUMNNAME_StatusNonFinance, MCustomerScore.STATUSFINANCE_Success);
				mTab.setValue(MCustomerProfile.COLUMNNAME_StatusFinance, MCustomerScore.STATUSFINANCE_Success);
			}
		}

	}

	public static MWindow getADWindowName(GridTab mTab) {
		StringBuffer sql = new StringBuffer(MWindow.COLUMNNAME_AD_Window_ID + " = ?");
		sql.append(" and " + MWindow.COLUMNNAME_IsActive + "=? ");
		MWindow mGu = new Query(null, MWindow.Table_Name, sql.toString(), null)
				.setParameters(new Object[] { mTab.getGridWindow().getAD_Window_ID(), "Y" }).first();
		return mGu;
	}

	public static List<MTab> getTabByWindowId(int id) {
		StringBuilder whereClauseFinal = new StringBuilder(MTab.COLUMNNAME_AD_Window_ID + "=?");
		return new Query(null, MTab.Table_Name, whereClauseFinal.toString(), null).setParameters(new Object[] { id })
				.list();

	}

	// lay ho so bi tu choi
	public static List<MCustomerProfile> findByCustomerProfileId(int profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerProfile.COLUMNNAME_TDAB_Customer_ID + "=?");
		whereClauseFinal.append(" and " + MCustomerProfile.COLUMNNAME_DocStatus + "=?");
		return new Query(null, MCustomerProfile.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId, MCustomerProfile.DOCSTATUS_ThamDinhTuChoi })
				.setOrderBy(MCustomerProfile.COLUMNNAME_Date_Create + " DESC").list();
	}

}
