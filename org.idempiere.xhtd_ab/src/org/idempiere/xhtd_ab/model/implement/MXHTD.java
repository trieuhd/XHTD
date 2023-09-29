package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MUser;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.utils.MessageUtil;
import org.idempiere.xhtd_ab.utils.ValidateUtil;

public class MXHTD extends MUser {

	public MXHTD(Properties ctx, int AD_User_ID, String trxName) {
		super(ctx, AD_User_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MXHTD(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (!ValidateUtil.isUserLogin(getName())) {

			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_USER_LOGIN));
		}
		if (!ValidateUtil.isLengthUserLogin(getName())) {

			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_LENGTH_USER));
		}
//		if (newRecord) {
//			setPassword("abcd123-");
//
//		}
//		if(getFailedLoginCount()>=5) {
//			setIsLocked(true);
//			setFailedLoginCount(0);
//		}
		return super.beforeSave(newRecord);
	}

}
