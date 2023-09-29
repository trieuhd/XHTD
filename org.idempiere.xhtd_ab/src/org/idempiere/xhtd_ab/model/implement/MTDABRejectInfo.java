package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_REJECT_INFO;

public class MTDABRejectInfo extends X_TDAB_REJECT_INFO {
	private static final long serialVersionUID = 1L;

	public MTDABRejectInfo(Properties ctx, int TDAB_REJECT_INFO_ID, String trxName) {
		super(ctx, TDAB_REJECT_INFO_ID, trxName);
		// TODO Auto-generated constructor stub
		
	}

	public MTDABRejectInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		return super.afterSave(newRecord, success);
	}
	
	
	
}
