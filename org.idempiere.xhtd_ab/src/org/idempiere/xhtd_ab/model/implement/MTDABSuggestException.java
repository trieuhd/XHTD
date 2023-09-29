//package org.idempiere.xhtd_ab.model.implement;
//
//import java.sql.ResultSet;
//import java.util.Properties;
//
//import org.idempiere.xhtd_ab.model.X_TDAB_Suggest_Exception;
//import org.idempiere.xhtd_ab.utils.CustomerScoreUtil;
//
//public class MTDABSuggestException extends X_TDAB_Suggest_Exception {
//
//	public MTDABSuggestException(Properties ctx, int TDAB_Suggest_Exception_ID, String trxName) {
//		super(ctx, TDAB_Suggest_Exception_ID, trxName);
//		// TODO Auto-generated constructor stub
//	}
//	
//	public MTDABSuggestException(Properties ctx, ResultSet rs, String trxName) {
//		super(ctx, rs, trxName);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected boolean beforeSave(boolean newRecord) {
//		// TODO Auto-generated method stub
//		return super.beforeSave(newRecord);
//	}
//
//	@Override
//	protected boolean afterSave(boolean newRecord, boolean success) {
//		// TODO Auto-generated method stub
//		CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
//				MCustomerProfile.COLUMNNAME_Status_Suggest);
//		return super.afterSave(newRecord, success);
//	}
//
//	@Override
//	protected boolean beforeDelete() {
//		// TODO Auto-generated method stub
//		return super.beforeDelete();
//	}
//
//	@Override
//	protected boolean afterDelete(boolean success) {
//		// TODO Auto-generated method stub
//		return super.afterDelete(success);
//	}
//
//}
