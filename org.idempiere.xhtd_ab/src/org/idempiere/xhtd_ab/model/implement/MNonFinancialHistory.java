package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Non_Financial_History;

public class MNonFinancialHistory extends X_TDAB_Non_Financial_History{
	
	public MNonFinancialHistory(Properties ctx, int TDAB_Non_Financial_History_ID, String trxName) {
		super(ctx, TDAB_Non_Financial_History_ID, trxName);
		
			
		}
	public MNonFinancialHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
