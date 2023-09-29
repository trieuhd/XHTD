package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_Median_Mean_Info;

public class MTDABMedianMeanInfo extends X_TDAB_Median_Mean_Info{

	public MTDABMedianMeanInfo(Properties ctx, int TDAB_Median_Mean_Info_ID, String trxName) {
		super(ctx, TDAB_Median_Mean_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABMedianMeanInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		return super.beforeSave(newRecord);
	}
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}

}
