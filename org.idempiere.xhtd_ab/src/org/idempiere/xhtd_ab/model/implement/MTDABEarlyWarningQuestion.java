package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Early_Warning_Question;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABEarlyWarningQuestion extends X_TDAB_Early_Warning_Question{

	public MTDABEarlyWarningQuestion(Properties ctx, int TDAB_Early_Warning_Question_ID, String trxName) {
		super(ctx, TDAB_Early_Warning_Question_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MTDABEarlyWarningQuestion(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		//check creatnew or update
		if(newRecord) {
			this.setActive(Constants.ACTIVE);
		}
		if(!newRecord) {
			this.setActive(Constants.NON_ACTIVE);
		}
		
		//update bản ghi cũ
		MTDABEarlyWarningQuestion earlyWarningQuestion = getEarlyWarningQuestionByCode(this.getCode().toUpperCase());
		if(newRecord && null != earlyWarningQuestion) {
			earlyWarningQuestion.setActive(Constants.NON_ACTIVE);
			earlyWarningQuestion.save();
		}
		this.setCode(this.getCode().toUpperCase());
		return super.beforeSave(newRecord);
	}
	
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}
	
	public static MTDABEarlyWarningQuestion getEarlyWarningQuestionByCode(String code) {
		String whereClause = MTDABEarlyWarningQuestion.COLUMNNAME_Code + " = '" + code + "'";
		return new Query(null, MTDABEarlyWarningQuestion.Table_Name, whereClause, null).first();
	}
}
