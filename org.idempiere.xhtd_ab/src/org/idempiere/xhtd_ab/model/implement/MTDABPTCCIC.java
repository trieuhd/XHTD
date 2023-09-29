package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_PTC_CIC;
import org.idempiere.xhtd_ab.model.X_TDAB_PTC_CIC_Info;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABPTCCIC extends X_TDAB_PTC_CIC {

	public MTDABPTCCIC(Properties ctx, int TDAB_PTC_CIC_ID, String trxName) {
		super(ctx, TDAB_PTC_CIC_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABPTCCIC(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABPTCCIC mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABPTCCIC mList = getStatusHD();
			List<MTDABPTCCICInfo> arr = getMInfo(mList.getTDAB_PTC_CIC_ID());
			for (X_TDAB_PTC_CIC_Info mInfo : arr) {
				MTDABPTCCICInfo mIf = new MTDABPTCCICInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_PTC_CIC_ID(this.getTDAB_PTC_CIC_ID());
				mIf.setName(mInfo.getName());
				mIf.setMean(mInfo.getMean());
				mIf.setSD(mInfo.getSD());
				mIf.setMean_3(mInfo.getMean_3());
				mIf.setMean_3_SD(mInfo.getMean_3_SD());
				
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
	
	public static X_TDAB_PTC_CIC findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABPTCCIC.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABPTCCIC getByVersion(BigDecimal version) {
		String whereClause = MTDABPTCCIC.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABPTCCIC.Table_Name, whereClause, null).first();
	}

	private List<MTDABPTCCICInfo> getMInfo(int mId) {
		String whereClause = MTDABPTCCICInfo.COLUMNNAME_TDAB_PTC_CIC_ID + " = " + mId;
		return new Query(null, MTDABPTCCICInfo.Table_Name, whereClause, null).list();
	}
	private MTDABPTCCIC getStatusHD() {
		String whereClause = MTDABPTCCIC.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABPTCCIC.Table_Name, whereClause, null).first();
	}


}
