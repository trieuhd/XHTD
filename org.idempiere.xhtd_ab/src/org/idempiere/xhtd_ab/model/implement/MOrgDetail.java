package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MOrg;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_ORG_DETAIL;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MOrgDetail extends X_TDAB_ORG_DETAIL {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MOrgDetail(Properties ctx, int TDAB_ORG_DETAIL_ID, String trxName) {
		super(ctx, TDAB_ORG_DETAIL_ID, trxName);
		// TODO Auto-generated constructor stub
	}	
	public MOrgDetail(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if(newRecord) {
			MOrg org = new MOrg(getCtx(), 0, get_TrxName());
			org.setValue(getValue());
			org.setName(getName());
			org.setIsActive(isActive());
			if(!org.save()) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), "Khong The Luu!!!"));
			}
			setS_Org_ID(org.getAD_Org_ID());
			org.save();
		}
		else {
			MOrg org = new MOrg(getCtx(), getS_Org_ID(), get_TrxName());
			org.setIsActive(isActive());
			org.setName(getName());
			org.setValue(getValue());
			if(!org.save()) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), "Khong The Luu!!!"));
			}
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}

}
