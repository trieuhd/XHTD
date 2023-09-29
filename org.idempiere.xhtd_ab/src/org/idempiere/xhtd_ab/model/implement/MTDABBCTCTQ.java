package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC_TQ;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABBCTCTQ extends X_TDAB_BCTC_TQ {

	public MTDABBCTCTQ(Properties ctx, int TDAB_BCTC_TQ_ID, String trxName) {
		super(ctx, TDAB_BCTC_TQ_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABBCTCTQ(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABBCTCTQ mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABBCTCTQ mList = getStatusHD();
			
			List<MTDABBCTC> arr = getMInfo(mList.getTDAB_BCTC_TQ_ID());
			for (X_TDAB_BCTC mInfo : arr) {
				MTDABBCTC mIf = new MTDABBCTC(getCtx(), null, get_TrxName());
				mIf.setTDAB_BCTC_TQ_ID(this.getTDAB_BCTC_TQ_ID());
				mIf.setName(mInfo.getName());
				mIf.setSmax(mInfo.getSmax());
				mIf.setSmin(mInfo.getSmin());
			
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
	public static X_TDAB_BCTC_TQ findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABBCTCTQ.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABBCTCTQ getByVersion(BigDecimal version) {
		String whereClause = MTDABBCTCTQ.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABBCTCTQ.Table_Name, whereClause, null).first();
	}
	
	private MTDABBCTCTQ getStatusHD() {
		String whereClause = MTDABBCTCTQ.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABBCTCTQ.Table_Name, whereClause, null).first();
	}

	private List<MTDABBCTC> getMInfo(int mId) {
		String whereClause = MTDABBCTC.COLUMNNAME_TDAB_BCTC_TQ_ID + " = " + mId;
		return new Query(null, MTDABBCTC.Table_Name, whereClause, null).list();
	}
	

}
