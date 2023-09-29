package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max_Info;

public class MTDABMinMaxInfo extends X_TDAB_Min_Max_Info{

	public MTDABMinMaxInfo(Properties ctx, int TDAB_Min_Max_Info_ID, String trxName) {
		super(ctx, TDAB_Min_Max_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABMinMaxInfo(Properties ctx, ResultSet rs, String trxName) {
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
	private List<MTDABMinMaxInfo> getTDABMinMaxInfo(int minMaxId) {
		String whereClause = MTDABMinMaxInfo.COLUMNNAME_TDAB_Min_Max_ID + " = " + minMaxId;
		return new Query(null, MTDABMinMaxInfo.Table_Name, whereClause, null).list();
	}
}
