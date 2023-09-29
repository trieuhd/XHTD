package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Direct_KO_Info;
import org.idempiere.xhtd_ab.utils.MessageUtil;


public class MTDABDirectKOInfo extends X_TDAB_Direct_KO_Info {

	public MTDABDirectKOInfo(Properties ctx, int TDAB_Direct_KO_Info_ID, String trxName) {
		super(ctx, TDAB_Direct_KO_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABDirectKOInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		if (newRecord) {
			MTDABDirectKOInfo mInfo= getInfo(this.getTDAB_Direct_KO_QL_ID(), this.getCode());
			if (null != mInfo) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DUPLICATE_KO));
			}
		}
		return super.beforeSave(newRecord);
	}

	public static MTDABDirectKOInfo getInfo(int checkID, String code) {
		List<Object> parames = new ArrayList<>();
		StringBuffer whereClause = new StringBuffer();
		whereClause.append(COLUMNNAME_TDAB_Direct_KO_QL_ID + "=?");
		whereClause.append(" And "+COLUMNNAME_Code +"=?");
		parames.add(checkID);
		parames.add(code);
		
		return new Query(null, Table_Name, whereClause.toString(), null).setParameters(parames).first();
	}
	
	
}
