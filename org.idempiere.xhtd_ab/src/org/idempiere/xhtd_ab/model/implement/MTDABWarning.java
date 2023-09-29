package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Warning;

public class MTDABWarning extends X_TDAB_Warning {

	public MTDABWarning(Properties ctx, int TDAB_Warning_ID, String trxName) {
		super(ctx, TDAB_Warning_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABWarning(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
