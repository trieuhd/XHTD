package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MUser;

public class MUserTDAB extends MUser{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MUserTDAB(Properties ctx, int AD_User_ID, String trxName) {
		super(ctx, AD_User_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MUserTDAB(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		if(newRecord && (getPassword() == null || getPassword().equals(""))) {
//			setPassword("Abcd@1234");
		}
		return super.beforeSave(newRecord);
	}


}
