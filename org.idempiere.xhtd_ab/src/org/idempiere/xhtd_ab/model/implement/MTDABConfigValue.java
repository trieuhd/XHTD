package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Config_Value;

public class MTDABConfigValue extends X_TDAB_Config_Value{

	public MTDABConfigValue(Properties ctx, int TDAB_Config_Value_ID, String trxName) {
		super(ctx, TDAB_Config_Value_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABConfigValue(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
