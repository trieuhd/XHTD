package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.model.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Suggest_Exception;
import org.idempiere.xhtd_ab.utils.CustomerScoreUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MSuggestException extends X_TDAB_Suggest_Exception{
	
	
	private static final long serialVersionUID = 1L;
	
	private List<MSuggestExceptionHistory> getHistoryByIdAndUser(Integer id, Integer financial_id){
		StringBuilder whereClauseFinal = new StringBuilder(MSuggestExceptionHistory.COLUMNNAME_CreatedBy + "=? AND "+MSuggestExceptionHistory.COLUMNNAME_TDAB_Suggest_Exception_ID+ "=?");
		return new Query(null, MSuggestExceptionHistory.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id , financial_id}).list();
	}
	
	private X_AD_User getUserById(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(X_AD_User.COLUMNNAME_AD_User_ID + "=?");
		return new Query(null, X_AD_User.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).first();
	}
	

	public MSuggestException(Properties ctx, int MSuggestException_ID, String trxName) {
		super(ctx, MSuggestException_ID, trxName);
		
			
		}
	public MSuggestException(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		MSuggestExceptionHistory mHistory = null;
		
		 List<MSuggestExceptionHistory> listHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),getTDAB_Suggest_Exception_ID());
		 
		 if (listHis.size()==0) { 
			 mHistory = new MSuggestExceptionHistory(getCtx(), 0, get_TrxName());
			 mHistory.setTDAB_Suggest_Exception_ID(getTDAB_Suggest_Exception_ID());
		    } else {
		    	mHistory = listHis.get(0);
		    }
		 
		 
		 Integer userID= Env.getAD_User_ID(getCtx());
			X_AD_User user = getUserById(userID);
			mHistory.setHisCreatedBy(user.getName());
			mHistory.setNote(getNote());
			mHistory.setDate_Suggest(getDate_Suggest());
			mHistory.setFile_Suggest_CV(getFile_Suggest_CV().replace(" ", ""));
			mHistory.save();
		
		 
		 return super.afterSave(newRecord, success);
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
				MCustomerProfile.COLUMNNAME_Status_Suggest);
		
		if (getFile_Suggest_CV()==null || "".equalsIgnoreCase(getFile_Suggest_CV())) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_SUGGEST_FILE_NULL));
		}
		
		
		if(!getFile_Suggest_CV().equalsIgnoreCase(getFile_Suggest_CV().replace(" ", ""))) {
		 // File (or directory) with old name
 		File file1 = new File(getFile_Suggest_CV());

 		// File (or directory) with new name
 		File file2 = new File(getFile_Suggest_CV().replace(" ", ""));

 		if (file2.exists())
			try {
				throw new java.io.IOException("file exists");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

 		// Rename file (or directory)
 		file1.renameTo(file2);
 		setFile_Suggest_CV(file2.getAbsolutePath());
		}
		return super.beforeSave(newRecord);
	}

	

	@Override
	protected boolean beforeDelete() {
		MSuggestException mSuggestException = new MSuggestException(getCtx(), getTDAB_Suggest_Exception_ID(), get_TrxName());
		mSuggestException.setIsActive(false);
		mSuggestException.save();
		return super.beforeDelete();
	}
	


	@Override
	protected boolean afterDelete(boolean success) {
		CustomerScoreUtil.checkStatusTabInProfile(getTDAB_Customer_Profile_ID(),
				MCustomerProfile.COLUMNNAME_Status_Suggest, MSuggestException.Table_Name, get_TrxName());
		return super.afterDelete(success);
	}




	
	
	
	
	
	
	
	
}
