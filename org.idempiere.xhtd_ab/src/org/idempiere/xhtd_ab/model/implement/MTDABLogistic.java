package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Logistic;
import org.idempiere.xhtd_ab.model.X_TDAB_Logistic_Info;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABLogistic extends X_TDAB_Logistic {

	public MTDABLogistic(Properties ctx, int TDAB_Logistic_ID, String trxName) {
		super(ctx, TDAB_Logistic_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABLogistic(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (newRecord) {
			BigDecimal currentVer = getMaxVersion();
			BigDecimal newVer = currentVer.add(new BigDecimal(1));
			setVersion(newVer);
			setRole_ID(Constants.PDTS);
			setAD_Org_ID(0);
			setStatus_Check("KT");
			setsubmit("Y");
		}
		return super.beforeSave(newRecord);
	}
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		if (newRecord) {
			BigDecimal currentVer = getMaxVersion();
			//MTDABLogistic mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABLogistic mList = getStatusHD();
			List<MTDABLogisticInfo> arr = getMInfo(mList.getTDAB_Logistic_ID());
			for (X_TDAB_Logistic_Info mInfo : arr) {
				MTDABLogisticInfo mIf = new MTDABLogisticInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Logistic_ID(this.getTDAB_Logistic_ID());
				mIf.setName(mInfo.getName());
				mIf.seta_logistic(mInfo.geta_logistic());
				mIf.setb_logistic(mInfo.getb_logistic());

				mIf.save();
			}
		}

		return super.afterSave(newRecord, success);
	}
	@Override
	protected boolean beforeDelete() {
		if (!getStatus_Check().equals("KT")) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DELETE_TS));
		}
		return super.beforeDelete();
	}

	@Override
	protected boolean afterDelete(boolean success) {
		// TODO Auto-generated method stub

		return super.afterDelete(success);
	}
	
	
	public static X_TDAB_Logistic findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABLogistic.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABLogistic getByVersion(BigDecimal version) {
		String whereClause = MTDABLogistic.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABLogistic.Table_Name, whereClause, null).first();
	}

	private List<MTDABLogisticInfo> getMInfo(int mId) {
		String whereClause = MTDABLogisticInfo.COLUMNNAME_TDAB_Logistic_ID + " = " + mId;
		return new Query(null, MTDABLogisticInfo.Table_Name, whereClause, null).list();
	}
	private MTDABLogistic getStatusHD() {
		String whereClause = MTDABLogistic.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABLogistic.Table_Name, whereClause, null).first();
	}


}
