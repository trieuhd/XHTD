package org.idempiere.xhtd_ab.callout;

import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MCustomerScore;

public class CustomerScoreCallout implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		if (MCustomerScore.COLUMNNAME_TDAB_Customer_Profile_ID.equalsIgnoreCase(mField.getColumnName()) && value != null) {
			MCustomerProfile cusProfile = new MCustomerProfile(ctx, Integer.valueOf(String.valueOf(value)), null);
			setInfoCustomerProfile(mTab, cusProfile);
		}
		return null;
	}

	private void setInfoCustomerProfile(GridTab mTab, MCustomerProfile cusProfile) {
		// TODO Auto-generated method stub
		mTab.setValue(MCustomerScore.COLUMNNAME_Name, cusProfile.getCompanyName());
		mTab.setValue(MCustomerScore.COLUMNNAME_Value, cusProfile.getValue());
	}
}
