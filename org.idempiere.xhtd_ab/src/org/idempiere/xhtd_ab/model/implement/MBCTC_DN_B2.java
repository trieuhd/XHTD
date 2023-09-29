package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC_DN_B2;

public class MBCTC_DN_B2 extends X_TDAB_BCTC_DN_B2{
	public MBCTC_DN_B2(Properties ctx, int TDAB_BCTC_DN_B2_ID, String trxName) {
		super(ctx, TDAB_BCTC_DN_B2_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MBCTC_DN_B2(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
	public static X_TDAB_BCTC_DN_B2 findByID(int profileID) {
		List<Object> parames = new ArrayList<>();
		StringBuffer whereClause = new StringBuffer();
		whereClause.append(COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		whereClause.append("and isdeleted = 0");
		
		parames.add(profileID);
		return new Query(Env.getCtx(), Table_Name, whereClause.toString(), null).setParameters(parames).first();
		
	}
}
