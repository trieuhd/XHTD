package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_SUGGEST_EXCEPTION_HIS;

public class MSuggestExceptionHistory extends X_TDAB_SUGGEST_EXCEPTION_HIS{

	
	private static final long serialVersionUID = 1L;

	public MSuggestExceptionHistory(Properties ctx, int TDAB_SUGGEST_EXCEPTION_HIS_ID, String trxName) {
		super(ctx, TDAB_SUGGEST_EXCEPTION_HIS_ID, trxName);
		
			
		}
	public MSuggestExceptionHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	
}
