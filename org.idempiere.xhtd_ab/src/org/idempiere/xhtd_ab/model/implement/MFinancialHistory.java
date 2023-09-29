package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Financial_History;

public class MFinancialHistory extends X_TDAB_Financial_History{
	
	
	public MFinancialHistory(Properties ctx, int TDAB_Financial_History_ID, String trxName) {
		super(ctx, TDAB_Financial_History_ID, trxName);
		
			
		}
	public MFinancialHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
}
