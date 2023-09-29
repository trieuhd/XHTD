package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.idempiere.xhtd_ab.model.X_TDAB_ORG_DETAIL;
import org.idempiere.xhtd_ab.model.X_TDAB_Org;

public class MOrgXHTD extends X_TDAB_Org {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MOrgXHTD(Properties ctx, int TDAB_Org_ID, String trxName) {
		super(ctx, TDAB_Org_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MOrgXHTD(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		if (newRecord) {
			MOrgDetail defult = new MOrgDetail(getCtx(), 0, get_TrxName());
			defult.setValue(getValue());
			defult.setName(getName());
			defult.setTDAB_Org_ID(getTDAB_Org_ID());
			defult.setAreaCode(getAreaCode());;
			defult.setIsParent(true);
			defult.save();
		}
		return super.afterSave(newRecord, success);
	}
	
	

}
