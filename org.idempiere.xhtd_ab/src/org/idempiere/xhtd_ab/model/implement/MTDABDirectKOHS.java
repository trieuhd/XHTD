package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Direct_KO_HS;
import org.idempiere.xhtd_ab.utils.MessageUtil;
import org.idempiere.xhtd_ab.utils.ValidateUtil;

public class MTDABDirectKOHS extends X_TDAB_Direct_KO_HS {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MTDABDirectKOHS(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABDirectKOHS(Properties ctx, int TDAB_Direct_KO_HS_ID, String trxName) {
		super(ctx, TDAB_Direct_KO_HS_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		if (!newRecord && !ValidateUtil.isCheckNumber(getAnswer_CV())) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_KO));
		}
		if (!newRecord) {
			if ("KO_1".equals(getValue()) || "KO_2".equals(getValue())) {
				if (Integer.parseInt(getAnswer_CV()) < 1 || Integer.parseInt(getAnswer_CV()) > 5) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_ANSWER_KO));
				}
			}
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		//check KO 
		return super.afterSave(newRecord, success);
	}
	
}
