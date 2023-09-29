package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Normalized_Param_Info;

public class MTDABNormalizedParamInfo  extends X_TDAB_Normalized_Param_Info {

	public MTDABNormalizedParamInfo(Properties ctx, int TDAB_Normalized_Param_Info_ID, String trxName) {
		super(ctx, TDAB_Normalized_Param_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABNormalizedParamInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
