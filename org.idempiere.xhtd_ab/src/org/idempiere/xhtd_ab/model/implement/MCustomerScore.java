package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.idempiere.xhtd_ab.model.X_TDAB_Customer_Score;

public class MCustomerScore extends X_TDAB_Customer_Score {

	public MCustomerScore(Properties ctx, int TDAB_Customer_Score_ID, String trxName) {
		super(ctx, TDAB_Customer_Score_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCustomerScore(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		List<MCustomerScore> profiles = getListCustomerProfile(getTDAB_Customer_Profile_ID());
		if (profiles != null && profiles.size() > 0) {
			MCustomerScore objMCustomerScore = profiles.get(0);

		}

		String code = DB.getDocumentNo(getAD_Client_ID(), get_TableName(), get_TrxName(), this);
		String value = geraneCode(code);
		setDocumentNumber(value);
		if (newRecord)
			setStatusProfile(MCustomerScore.STATUSPROFILE_Success);
		return super.beforeSave(newRecord);

	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}

	private static List<MCustomerScore> getListCustomerProfile(int customerID) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomerScore.COLUMNNAME_TDAB_Customer_Score_ID + "=?");
		return new Query(null, MCustomerScore.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { customerID }).list();
	}

	synchronized static String geraneCode(String code) {
		// TODO Auto-generated method stub
		StringBuffer codeProfile = new StringBuffer(getDateCD() + "_");
		codeProfile.append(code);
		return codeProfile.toString();
	}

	private static String getDateCD() {
		// TODO Auto-generated method stub

		SimpleDateFormat dateFormat = new SimpleDateFormat("MMyyyy");
		Date date = new Date();
		String parsedDate = dateFormat.format(date);

		return parsedDate;
	}

}
