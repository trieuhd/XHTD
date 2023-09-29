package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Info_History;

public class MFinancialInfoHistory extends X_TDAB_Financial_Info_History{
	
	
	public MFinancialInfoHistory(Properties ctx, int TDAB_Financial_Info_History_ID, String trxName) {
		super(ctx, TDAB_Financial_Info_History_ID, trxName);
		
			
		}
	public MFinancialInfoHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
}
