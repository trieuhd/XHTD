package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Config_Value;
import org.idempiere.xhtd_ab.model.X_TDAB_Config_Value_TQ;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABConfigValueTQ extends X_TDAB_Config_Value_TQ {

	public MTDABConfigValueTQ(Properties ctx, int TDAB_Config_Value_TQ_ID, String trxName) {
		super(ctx, TDAB_Config_Value_TQ_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABConfigValueTQ(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABConfigValueTQ mList = getByVersion(currentVer.subtract(new BigDecimal(1)));\

			MTDABConfigValueTQ mList = getStatusHD();
			List<MTDABConfigValue> arr = getMInfo(mList.getTDAB_Config_Value_TQ_ID());
			for (X_TDAB_Config_Value mInfo : arr) {
				MTDABConfigValue mIf = new MTDABConfigValue(getCtx(), null, get_TrxName());
				mIf.setTDAB_Config_Value_TQ_ID(this.getTDAB_Config_Value_TQ_ID());
				mIf.setPTC39(mInfo.getPTC39());
				mIf.setScore(mInfo.getScore());
				
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
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABConfigValueTQ.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABConfigValueTQ getByVersion(BigDecimal version) {
		String whereClause = MTDABConfigValueTQ.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABConfigValueTQ.Table_Name, whereClause, null).first();
	}

	private List<MTDABConfigValue> getMInfo(int mId) {
		String whereClause = MTDABConfigValue.COLUMNNAME_TDAB_Config_Value_TQ_ID + " = " + mId;
		return new Query(null, MTDABConfigValue.Table_Name, whereClause, null).list();
	}
	public static X_TDAB_Config_Value_TQ findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	private MTDABConfigValueTQ getStatusHD() {
		String whereClause = MTDABConfigValueTQ.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABConfigValueTQ.Table_Name, whereClause, null).first();
	}

}
