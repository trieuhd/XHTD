package org.idempiere.xhtd_ab.utils;

import org.compiere.util.DB;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.model.implement.MCustomerScore;


public class CustomerScoreUtil {

	public static void setStatusApproved(int profileID, String columnName ) {
		MCustomerProfile profile = new MCustomerProfile(null, profileID, null);
		String statusCurrent = profile.get_Value(columnName).toString();

		String status = MCustomerScore.STATUSFINANCE_Success;
		
		if (statusCurrent.equalsIgnoreCase(MCustomerScore.STATUSPROFILE_NoSuccess)) {
			status = MCustomerScore.STATUSFINANCE_Success;
		} 
//		else if (statusCurrent.equalsIgnoreCase(MCustomerScore.STATUSFINANCE_Success)
//				&& (profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_SubmitControl)
//						|| profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_SubmitApproval))) {
//			status = MCustomerScore.STATUSFINANCE_ProcessEdit;
//		} else if (statusCurrent.equalsIgnoreCase(MCustomerScore.STATUSFINANCE_ProcessEdit)
//				&& (profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_SuggestEditing)
//						|| profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_PDRSuggestEditing)
//						|| profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_EditProfileUnlocked))) {
//			status = MCustomerScore.STATUSFINANCE_Edited;
//		} else if (statusCurrent.equalsIgnoreCase(MCustomerScore.STATUSFINANCE_Edited) 
//				&& (profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_SubmitControl)
//						|| profile.getDocStatus().equalsIgnoreCase(MCustomerScore.DOCSTATUS_SubmitApproval))) {
//			status = MCustomerScore.STATUSFINANCE_ProcessEdit;
//		} 
	else return;

		StringBuilder sql = new StringBuilder("Update TDAB_Customer_Profile  set ");
		sql.append(columnName);
		sql.append(" = '" + status + "' where TDAB_Customer_Profile_ID = " + profileID);
		DB.executeUpdateEx(sql.toString(), null);
	}

	public static void setStatusReject(int profileID, String columnName) {
		MCustomerProfile profile = new MCustomerProfile(null, profileID, null);
		String statusCurrent = profile.get_Value(columnName).toString();

		String status = MCustomerScore.STATUSCIC_ProcessEdit;

		if (statusCurrent.equalsIgnoreCase(MCustomerScore.STATUSFINANCE_Success)) {
			status = MCustomerScore.STATUSFINANCE_NoSuccess;
		} else return;

		StringBuilder sql = new StringBuilder("Update TDAB_Customer_Profile set ");
		sql.append(columnName);
		sql.append(" = '" + status + "' where TDAB_Customer_Profile_ID = " + profileID);
		DB.executeUpdateEx(sql.toString(), null);
	}
	

	public static void checkStatusTabInProfile(int profileID, String columnName, String tableName, String trxName) {
		MCustomerProfile profile = new MCustomerProfile(null, profileID, null);

		StringBuilder sql = new StringBuilder("Select COUNT(*) from " + tableName + " where TDAB_Customer_Profile_ID = ?");
		
		int count = DB.getSQLValue(trxName, sql.toString(), profileID);
		
		if (count == 0) {
			setStatusReject(profileID, columnName);
		}
	}

}
