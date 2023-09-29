package org.idempiere.xhtd_ab.model.implement;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Business_Areas_TQ;
import org.idempiere.xhtd_ab.model.X_TDAB_List_Business;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABBusinessAreasTQ extends X_TDAB_Business_Areas_TQ {
	public static MTDABListBusiness mB;

	public MTDABBusinessAreasTQ(Properties ctx, int TDAB_Business_Areas_TQ_ID, String trxName) {
		super(ctx, TDAB_Business_Areas_TQ_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABBusinessAreasTQ(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
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
			MTDABBusinessAreasTQ mList = getByVersion(currentVer.subtract(new BigDecimal(1)));
			List<MTDABListBusiness> bList =getListActive();
			for (MTDABListBusiness arr: bList ) {					
				MTDABBusinessAreas mIf = new MTDABBusinessAreas(getCtx(), null, get_TrxName());
				
				mIf.setTDAB_Business_Areas_TQ_ID(this.getTDAB_Business_Areas_TQ_ID());
				mIf.setBusiness_Areas_Code(arr.getCode());
				mIf.setJobName(arr.getName());

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
	

	private List<MTDABListBusiness> getListActive() {
		String whereClause = MTDABListBusiness.COLUMNNAME_IsActive + "= 'Y'";
		return new Query(null, MTDABListBusiness.Table_Name, whereClause, null).list();
	}
	
	
	public static X_TDAB_Business_Areas_TQ findStatusHD() {
		String whereClause = COLUMNNAME_Status_Check + " = 'HD'";
		return new Query(null, Table_Name, whereClause, null).first();
	}
	

	private BigDecimal getMaxVersion() {
		StringBuilder sql = new StringBuilder("SELECT max(VERSION) as ver FROM ").append(MTDABBusinessAreasTQ.Table_Name);
		int maxVersion = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] {});
		return new BigDecimal(maxVersion);
	}

	private MTDABBusinessAreasTQ getByVersion(BigDecimal version) {
		String whereClause = MTDABBusinessAreasTQ.COLUMNNAME_Version + " = " + version;
		return new Query(null, MTDABBusinessAreasTQ.Table_Name, whereClause, null).first();
	}

}
