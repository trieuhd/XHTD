package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Warning_Question_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Warning_Question_QL;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABWarningQuestionQL extends X_TDAB_Warning_Question_QL {

	public MTDABWarningQuestionQL(Properties ctx, int TDAB_Warning_Question_QL_ID, String trxName) {
		super(ctx, TDAB_Warning_Question_QL_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABWarningQuestionQL(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	public static X_TDAB_Warning_Question_QL findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
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
			//MTDABWarningQuestionQL mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			MTDABWarningQuestionQL mList = getStatusHD();
			List<MTDABWarningQuestionInfo> arr = getMInfo(mList.getTDAB_Warning_Question_QL_ID());
			for (X_TDAB_Warning_Question_Info mInfo : arr) {
				MTDABWarningQuestionInfo mIf = new MTDABWarningQuestionInfo(getCtx(), null, get_TrxName());
				mIf.setTDAB_Warning_Question_QL_ID(this.getTDAB_Warning_Question_QL_ID());
				mIf.setCode(mInfo.getCode());
				mIf.setName(mInfo.getName());
				mIf.setWarning_Question_Level(mInfo.getWarning_Question_Level());
				
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
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABWarningQuestionQL.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABWarningQuestionQL getByVersion(BigDecimal version) {
		String whereClause = MTDABWarningQuestionQL.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABWarningQuestionQL.Table_Name, whereClause, null).first();
	}

	private List<MTDABWarningQuestionInfo> getMInfo(int mId) {
		String whereClause = MTDABWarningQuestionInfo.COLUMNNAME_TDAB_Warning_Question_QL_ID + " = " + mId;
		return new Query(null, MTDABWarningQuestionInfo.Table_Name, whereClause, null).list();
	}
	private MTDABWarningQuestionQL getStatusHD() {
		String whereClause = MTDABWarningQuestionQL.COLUMNNAME_Status_Check  + " = 'HD'";
		return new Query(null, MTDABWarningQuestionQL.Table_Name, whereClause, null).first();
	}


}
