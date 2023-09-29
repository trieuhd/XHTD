package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_CIC_History;

public class MCICHistory extends X_TDAB_CIC_History {
	
	public MCICHistory(Properties ctx, int TDAB_CIC_History_ID, String trxName) {
		super(ctx, TDAB_CIC_History_ID, trxName);
		
			
		}
	public MCICHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
