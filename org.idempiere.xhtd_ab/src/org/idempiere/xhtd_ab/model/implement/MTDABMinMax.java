package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max_Info;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABMinMax extends X_TDAB_Min_Max {

	public MTDABMinMax(Properties ctx, int TDAB_Min_Max_ID, String trxName) {
		super(ctx, TDAB_Min_Max_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABMinMax(Properties ctx, ResultSet rs, String trxName) {
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

		if(newRecord) {
			BigDecimal currentVer = getMaxVersion();

			//MTDABMinMax minMax = getTDABMinMaxByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABMinMax mList = getStatusHD();
			List<MTDABMinMaxInfo> arr = getTDABMinMaxInfo(mList.getTDAB_Min_Max_ID());
			for (X_TDAB_Min_Max_Info MMinfo : arr) {
				MTDABMinMaxInfo mMinMaxIf = new MTDABMinMaxInfo(getCtx(), null, get_TrxName());

				mMinMaxIf.setTDAB_Min_Max_ID(this.getTDAB_Min_Max_ID());
				mMinMaxIf.setName(MMinfo.getName());
				mMinMaxIf.setMin_Info(MMinfo.getMin_Info());
				mMinMaxIf.setMax_Info(MMinfo.getMax_Info());
				mMinMaxIf.save();
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

	private List<MTDABMinMaxInfo> getTDABMinMaxInfo(int minMaxId) {
		String whereClause = MTDABMinMaxInfo.COLUMNNAME_TDAB_Min_Max_ID + " = " + minMaxId;
		return new Query(null, MTDABMinMaxInfo.Table_Name, whereClause, null).list();
	}

	private BigDecimal checkRecord(boolean newRecord) {
		if (newRecord) {
			StringBuilder sql = new StringBuilder("SELECT COUNT(1) FROM ").append(MTDABMinMax.Table_Name);
			int count = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});

			return new BigDecimal(count + 1);
		}
		return null;

	}

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABMinMax.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABMinMax getTDABMinMaxByVersion(BigDecimal version) {
		String whereClause = MTDABMinMax.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABMinMax.Table_Name, whereClause, null).first();
	}

	public static X_TDAB_Min_Max findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	private MTDABMinMax getStatusHD() {
		String whereClause = MTDABMinMax.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABMinMax.Table_Name, whereClause, null).first();
	}

}
