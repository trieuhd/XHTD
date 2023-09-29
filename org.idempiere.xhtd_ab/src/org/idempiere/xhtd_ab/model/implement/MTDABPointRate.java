package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Point_Rate;
import org.idempiere.xhtd_ab.model.X_TDAB_Point_Rate_Info;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABPointRate extends X_TDAB_Point_Rate {

	public MTDABPointRate(Properties ctx, int TDAB_Point_Rate_ID, String trxName) {
		super(ctx, TDAB_Point_Rate_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABPointRate(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABPointRate mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABPointRate mList = getStatusHD();
			List<MTDABPointRateInfo> arr = getMInfo(mList.getTDAB_Point_Rate_ID());
			for (X_TDAB_Point_Rate_Info mInfo : arr) {
				MTDABPointRateInfo mIf = new MTDABPointRateInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Point_Rate_ID(this.getTDAB_Point_Rate_ID());
				mIf.setName(mInfo.getName());
				mIf.setMark_Point(mInfo.getMark_Point());
				mIf.setBCTC_KKT(mInfo.getBCTC_KKT());
				mIf.setBCTC_KT(mInfo.getBCTC_KT());
			
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
	public static X_TDAB_Point_Rate findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABPointRate.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABPointRate getByVersion(BigDecimal version) {
		String whereClause = MTDABPointRate.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABPointRate.Table_Name, whereClause, null).first();
	}

	private List<MTDABPointRateInfo> getMInfo(int mId) {
		String whereClause = MTDABPointRateInfo.COLUMNNAME_TDAB_Point_Rate_ID + " = " + mId;
		return new Query(null, MTDABPointRateInfo.Table_Name, whereClause, null).list();
	}
	private MTDABPointRate getStatusHD() {
		String whereClause = MTDABPointRate.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABPointRate.Table_Name, whereClause, null).first();
	}

}
