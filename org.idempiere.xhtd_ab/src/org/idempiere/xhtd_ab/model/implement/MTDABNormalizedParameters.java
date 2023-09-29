package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Normalized_Parameters;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABNormalizedParameters extends X_TDAB_Normalized_Parameters {

	public MTDABNormalizedParameters(Properties ctx, int TDAB_Normalized_Parameters_ID, String trxName) {
		super(ctx, TDAB_Normalized_Parameters_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABNormalizedParameters(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABNormalizedParameters mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABNormalizedParameters mList = getStatusHD();
			List<MTDABNormalizedParamInfo> arr = getMInfo(mList.getTDAB_Normalized_Parameters_ID());
			for (MTDABNormalizedParamInfo mInfo : arr) {
				MTDABNormalizedParamInfo mIf = new MTDABNormalizedParamInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Normalized_Parameters_ID(this.getTDAB_Normalized_Parameters_ID());
				mIf.setName(mInfo.getName());
				mIf.setMean(mInfo.getMean());
				mIf.setSD(mInfo.getSD());
			
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
	
	public static X_TDAB_Normalized_Parameters findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABNormalizedParameters.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABNormalizedParameters getByVersion(BigDecimal version) {
		String whereClause = MTDABNormalizedParameters.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABNormalizedParameters.Table_Name, whereClause, null).first();
	}

	private List<MTDABNormalizedParamInfo> getMInfo(int mId) {
		String whereClause = MTDABNormalizedParamInfo.COLUMNNAME_TDAB_Normalized_Parameters_ID + " = " + mId;
		return new Query(null, MTDABNormalizedParamInfo.Table_Name, whereClause, null).list();
	}
	private MTDABNormalizedParameters getStatusHD() {
		String whereClause = MTDABNormalizedParameters.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABNormalizedParameters.Table_Name, whereClause, null).first();
	}

}
