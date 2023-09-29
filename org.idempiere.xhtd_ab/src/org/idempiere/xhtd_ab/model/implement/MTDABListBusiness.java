package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_List_Business;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABListBusiness extends X_TDAB_List_Business {

	public MTDABListBusiness(Properties ctx, int TDAB_List_Business_ID, String trxName) {
		super(ctx, TDAB_List_Business_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABListBusiness(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (newRecord) {
			MTDABListBusiness business = getMTDABListBusinessByCode(this.getCode());
			if (null != business) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DUPLICATE_CODE));
			}
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}

	public static MTDABListBusiness getMTDABListBusinessByCode(String code) {
		String whereClause = MTDABListBusiness.COLUMNNAME_Code + " = '" + code + "'";
		return new Query(null, MTDABListBusiness.Table_Name, whereClause, null).first();
	}

	public static MTDABListBusiness getMTDABListBusinessByBusinessCode(String code) {
		String whereClause = MTDABListBusiness.COLUMNNAME_TDAB_List_Business_ID + " = '" + code + "'";
		return new Query(null, MTDABListBusiness.Table_Name, whereClause, null).first();
	}

	public static MTDABListBusiness getListActive() {
		String whereClause = MTDABListBusiness.COLUMNNAME_IsActive + "= 'Y'";
		return new Query(null, MTDABListBusiness.Table_Name, whereClause, null).first();
	}

}
