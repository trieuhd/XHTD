package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Logistic_Info;

public class MTDABLogisticInfo extends X_TDAB_Logistic_Info {

	public MTDABLogisticInfo(Properties ctx, int TDAB_Logistic_Info_ID, String trxName) {
		super(ctx, TDAB_Logistic_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABLogisticInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
