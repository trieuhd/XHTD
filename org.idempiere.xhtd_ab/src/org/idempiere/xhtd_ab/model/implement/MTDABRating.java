package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Rating;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABRating extends X_TDAB_Rating {

	public MTDABRating(Properties ctx, int TDAB_Rating_ID, String trxName) {
		super(ctx, TDAB_Rating_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABRating(Properties ctx, ResultSet rs, String trxName) {
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
			//MTDABRating mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABRating mList = getStatusHD();
			List<MTDABRatingInfo> arr = getMInfo(mList.getTDAB_Rating_ID());
			for (MTDABRatingInfo mInfo : arr) {
				MTDABRatingInfo mIf = new MTDABRatingInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Rating_ID(this.getTDAB_Rating_ID());
				mIf.setSP_Rating(mInfo.getSP_Rating());
				mIf.setMoodys_Rating(mInfo.getMoodys_Rating());
				mIf.setInternal_Rating(mInfo.getInternal_Rating());
				mIf.setPD_Cao(mInfo.getPD_Cao());
				mIf.setPD_Thap(mInfo.getPD_Thap());
				
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
	
	
	public static X_TDAB_Rating findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABRating.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABRating getByVersion(BigDecimal version) {
		String whereClause = MTDABRating.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABRating.Table_Name, whereClause, null).first();
	}

	private List<MTDABRatingInfo> getMInfo(int mId) {
		String whereClause = MTDABRatingInfo.COLUMNNAME_TDAB_Rating_ID + " = " + mId;
		return new Query(null, MTDABRatingInfo.Table_Name, whereClause, null).list();
	}
	private MTDABRating getStatusHD() {
		String whereClause = MTDABRating.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABRating.Table_Name, whereClause, null).first();
	}

}
