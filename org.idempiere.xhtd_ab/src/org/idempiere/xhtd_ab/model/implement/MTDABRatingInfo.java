package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Rating_Info;

public class MTDABRatingInfo extends X_TDAB_Rating_Info {

	public MTDABRatingInfo(Properties ctx, int TDAB_Rating_Info_ID, String trxName) {
		super(ctx, TDAB_Rating_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABRatingInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
