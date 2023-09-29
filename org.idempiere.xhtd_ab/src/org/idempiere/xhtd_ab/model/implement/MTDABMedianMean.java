package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Median_Mean;
import org.idempiere.xhtd_ab.model.X_TDAB_Median_Mean_Info;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABMedianMean extends X_TDAB_Median_Mean {

	public MTDABMedianMean(Properties ctx, int TDAB_Median_Mean_ID, String trxName) {
		super(ctx, TDAB_Median_Mean_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABMedianMean(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABMedianMean medianMean = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABMedianMean mList = getStatusHD();
			List<MTDABMedianMeanInfo> arr = getMTDABMedianMeanInfo(mList.getTDAB_Median_Mean_ID());
			for (X_TDAB_Median_Mean_Info MMinfo : arr) {
				MTDABMedianMeanInfo mIf = new MTDABMedianMeanInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Median_Mean_ID(this.getTDAB_Median_Mean_ID());
				mIf.setName(MMinfo.getName());
				mIf.setMean(MMinfo.getMean());
				mIf.setMedian(MMinfo.getMedian());

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

	private BigDecimal checkRecord(boolean newRecord) {
		StringBuilder sql = new StringBuilder("SELECT COUNT(1) FROM ").append(MTDABMedianMean.Table_Name);
		int count = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(count + 1);
	}

	public static X_TDAB_Median_Mean findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABMedianMean.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABMedianMean getByVersion(BigDecimal version) {
		String whereClause = MTDABMedianMean.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABMedianMean.Table_Name, whereClause, null).first();
	}

	private List<MTDABMedianMeanInfo> getMTDABMedianMeanInfo(int mId) {
		String whereClause = MTDABMedianMeanInfo.COLUMNNAME_TDAB_Median_Mean_ID + " = " + mId;
		return new Query(null, MTDABMedianMeanInfo.Table_Name, whereClause, null).list();
	}
	private MTDABMedianMean getStatusHD() {
		String whereClause = MTDABMedianMean.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABMedianMean.Table_Name, whereClause, null).first();
	}

}
