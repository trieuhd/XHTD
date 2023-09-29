package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.model.X_AD_User;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.I_TD_Value_Utils_DN;
import org.idempiere.xhtd_ab.model.X_TDAB_Business_Areas;
import org.idempiere.xhtd_ab.utils.BaseObject;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABBusinessAreas extends X_TDAB_Business_Areas{
	protected static CLogger logger = CLogger.getCLogger (BaseObject.class);
	
	public MTDABBusinessAreas(Properties ctx, int TDAB_Business_Areas_ID, String trxName) {
		super(ctx, TDAB_Business_Areas_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MTDABBusinessAreas(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Override
//	protected boolean beforeSave(boolean newRecord) {
//		
//		//Tạo mới bản ghi
//		MTDABListBusiness cbb =  new MTDABListBusiness(getCtx(), getJobName_ID(), get_TrxName());
//		this.setBusiness_Areas_Code(cbb.getCode());
//		if(newRecord) {
//			this.setActive(Constants.ACTIVE);
//		}
//		if(!newRecord) {
//			this.setActive(Constants.NON_ACTIVE);
//		}
//		
//		//valid value
//		if(null != this.getBusiness_Areas_Value() && !this.getBusiness_Areas_Value().matches(Constants.PATTERN_NUMBER)) {
//			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.INVALID_FORMAT_VALUE));
//		}
//		//valid year
//		if(null != this.getBusiness_Areas_Year() && !this.getBusiness_Areas_Year().matches(Constants.PATTERN_YEAR)) {
//			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.INVALID_FORMAT_YEAR));
//		}
//		
//		//update bản ghi cũ
//		MTDABBusinessAreas mtdabBusinessAreas = getBusinessAreas(getJobName_ID(), getBusiness_Areas_Year());
//		if(newRecord && null != mtdabBusinessAreas) {
//			mtdabBusinessAreas.setActive(Constants.NON_ACTIVE);
//			mtdabBusinessAreas.save();
//		}
//		return super.beforeSave(newRecord);
//	}
//	@Override
//	protected boolean afterSave(boolean newRecord, boolean success) {
//		// TODO Auto-generated method stub
//		return super.afterSave(newRecord, success);
//	}
//	
//	public static MTDABBusinessAreas getBusinessAreas(int scoreID, String year) {
//		String whereClause = MTDABBusinessAreas.COLUMNNAME_JobName_ID + " = " + scoreID+ " and "+MTDABBusinessAreas.COLUMNNAME_Business_Areas_Year+ " = "+year+" and "+MTDABBusinessAreas.COLUMNNAME_Active+" = 'ACTIVE'";
////		MTDABBusinessAreas.COLUMNNAME_Business_Areas_Year
////		whereClause += ("And " + MBCTC_DN_B1.COLUMNNAME_IsActive + "= '0'");
//		return new Query(null, MTDABBusinessAreas.Table_Name, whereClause, null).first();
//	}
//	
//	private List<MTDValueUtilsDN> getMTDValueUtilsDNById(Integer TD_Value_Utils_DN_ID){
//		StringBuilder whereClauseFinal = new StringBuilder(
//				"TD_Value_Utils_DN_ID" + "=? ");
//		return new Query(getCtx(), "TD_VALUE_UTILS_DN", whereClauseFinal.toString(), get_TrxName())
//		.setParameters(new Object[] { TD_Value_Utils_DN_ID }).list();
//	}
	
	public static MTDABBusinessAreas getBusinessAreasById(int id) {
		StringBuilder whereClauseFinal = new StringBuilder(X_TDAB_Business_Areas.COLUMNNAME_TDAB_Business_Areas_ID + "=?");
		return new Query(null, X_TDAB_Business_Areas.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).first();
	}
	
	

}
