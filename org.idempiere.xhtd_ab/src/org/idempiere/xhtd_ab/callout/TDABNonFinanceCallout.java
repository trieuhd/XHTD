package org.idempiere.xhtd_ab.callout;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Query;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MFinancialNon;
import org.idempiere.xhtd_ab.model.implement.MTDABBusinessAreas;

public class TDABNonFinanceCallout implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub
		if (MFinancialNon.COLUMNNAME_TDAB_Business_Areas_ID.equalsIgnoreCase(mField.getColumnName()) && value != null) {

			MCustomerProfile profile = new MCustomerProfile(ctx, Integer.parseInt(mTab.getValue(MFinancialNon.COLUMNNAME_TDAB_Customer_Profile_ID).toString()), null);
			Calendar date = Calendar.getInstance();
			date.setTimeInMillis(profile.getDate_Loan().getTime());
			int year = date.get(Calendar.YEAR);
			
			setRoce(mTab, year, value);
		}
		if (MFinancialNon.COLUMNNAME_Date_First_Business_Regist.equalsIgnoreCase(mField.getColumnName()) && value != null) {
			MCustomerProfile profile = new MCustomerProfile(ctx, Integer.parseInt(mTab.getValue(MFinancialNon.COLUMNNAME_TDAB_Customer_Profile_ID).toString()), null);
			
			try {
				Calendar dateLoan = Calendar.getInstance();
				dateLoan.setTimeInMillis(profile.getDate_Loan().getTime());
				
				Date dateRegister = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(value.toString());
				
				long noDay = (profile.getDate_Loan().getTime() - dateRegister.getTime()) / (24 * 3600 * 1000);
				double year = (double) noDay/365;
				double result = (double) Math.ceil(year*100)/100;
				
				mTab.setValue(MFinancialNon.COLUMNNAME_Years_Operation, new BigDecimal(result));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
		}
		
		if (MFinancialNon.COLUMNNAME_Financial_Statements_Audited.equalsIgnoreCase(mField.getColumnName())
				&& value != null) {

			if (value.equals(MFinancialNon.FINANCIAL_STATEMENTS_AUDITED_0)) {
				mTab.setValue(MFinancialNon.COLUMNNAME_Comment_On_Audit_Report,
						MFinancialNon.COMMENT_ON_AUDIT_REPORT_1);
			} else {
				mTab.setValue(MFinancialNon.COLUMNNAME_Comment_On_Audit_Report,
						null);
			}
		}
		return null;
	}

	private void setRoce(GridTab mTab, int year, Object value) {
		// TODO Auto-generated method stub
		
		try {
			StringBuffer sql = new StringBuffer(MTDABBusinessAreas.COLUMNNAME_Business_Areas_Code + " = (SELECT Business_Areas_Code FROM ");
			sql.append(MTDABBusinessAreas.Table_Name + " WHERE TDAB_Business_Areas_ID = ?)");
			sql.append(" and " + MTDABBusinessAreas.COLUMNNAME_Business_Areas_Year + "=? ");
			sql.append(" and " + MTDABBusinessAreas.COLUMNNAME_TDAB_Business_Areas_TQ_ID + " IN (SELECT tdab_business_areas_tq_id FROM tdab_business_areas_tq WHERE STATUS_CHECK ='HD')");
			MTDABBusinessAreas areas = new Query(null, MTDABBusinessAreas.Table_Name, sql.toString(), null)
					.setParameters(new Object[] { value.toString(), year-1 }).first();
			
			mTab.setValue(MFinancialNon.COLUMNNAME_ROCE_Index, areas.getBusiness_Areas_Value().toString());
		} catch (Exception e) {
			mTab.setValue(MFinancialNon.COLUMNNAME_ROCE_Index, "0");
		}
	}

}
