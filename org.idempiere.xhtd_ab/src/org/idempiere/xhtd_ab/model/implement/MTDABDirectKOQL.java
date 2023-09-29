package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Direct_KO_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Direct_KO_QL;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABDirectKOQL extends X_TDAB_Direct_KO_QL {

	public MTDABDirectKOQL(Properties ctx, int TDAB_Direct_KO_QL_ID, String trxName) {
		super(ctx, TDAB_Direct_KO_QL_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABDirectKOQL(Properties ctx, ResultSet rs, String trxName) {
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
			// MTDABDirectKOQL mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABDirectKOQL mList = getStatusHD();
			List<MTDABDirectKOInfo> arr = getMInfo(mList.getTDAB_Direct_KO_QL_ID());
			for (X_TDAB_Direct_KO_Info mInfo : arr) {
				MTDABDirectKOInfo mIf = new MTDABDirectKOInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Direct_KO_QL_ID(this.getTDAB_Direct_KO_QL_ID());
				mIf.setCode(mInfo.getCode());
				mIf.setName(mInfo.getName());
				mIf.setType_Answer(mInfo.getType_Answer());
				mIf.setBigger_KO(mInfo.getBigger_KO());
				mIf.setSmaller_KO(mInfo.getSmaller_KO());

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

	public static X_TDAB_Direct_KO_QL findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABDirectKOQL.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABDirectKOQL getByVersion(BigDecimal version) {
		String whereClause = MTDABDirectKOQL.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABDirectKOQL.Table_Name, whereClause, null).first();
	}

	private MTDABDirectKOQL getStatusHD() {
		String whereClause = MTDABDirectKOQL.COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, MTDABDirectKOQL.Table_Name, whereClause, null).first();
	}

	private List<MTDABDirectKOInfo> getMInfo(int mId) {
		String whereClause = MTDABDirectKOInfo.COLUMNNAME_TDAB_Direct_KO_QL_ID + " = " + mId;
		return new Query(null, MTDABDirectKOInfo.Table_Name, whereClause, null).list();
	}

}
