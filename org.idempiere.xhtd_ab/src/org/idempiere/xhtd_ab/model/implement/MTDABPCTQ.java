package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_PC_TQ;
import org.idempiere.xhtd_ab.model.X_TDAB_PC;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABPCTQ extends X_TDAB_PC_TQ {

	public MTDABPCTQ(Properties ctx, int TDAB_PC_TQ_ID, String trxName) {
		super(ctx, TDAB_PC_TQ_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABPCTQ(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABPCTQ mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABPCTQ mList = getStatusHD();
			List<MTDABPC> arr = getMInfo(mList.getTDAB_PC_TQ_ID());
			for (X_TDAB_PC mInfo : arr) {
				MTDABPC mIf = new MTDABPC(getCtx(), null, get_TrxName());
				mIf.setTDAB_PC_TQ_ID(this.getTDAB_PC_TQ_ID());
				mIf.setk(mInfo.getk());
				mIf.setAlpha(mInfo.getAlpha());
				mIf.setbeta(mInfo.getbeta());
				
				
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
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABPCTQ.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABPCTQ getByVersion(BigDecimal version) {
		String whereClause = MTDABPCTQ.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABPCTQ.Table_Name, whereClause, null).first();
	}

	private List<MTDABPC> getMInfo(int mId) {
		String whereClause = MTDABPC.COLUMNNAME_TDAB_PC_TQ_ID + " = " + mId;
		return new Query(null, MTDABPC.Table_Name, whereClause, null).list();
	}
	public static X_TDAB_PC_TQ findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	private MTDABPCTQ getStatusHD() {
		String whereClause = MTDABPCTQ.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABPCTQ.Table_Name, whereClause, null).first();
	}

}
