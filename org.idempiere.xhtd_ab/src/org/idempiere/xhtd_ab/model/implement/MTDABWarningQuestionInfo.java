package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Warning_Question_Info;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABWarningQuestionInfo extends X_TDAB_Warning_Question_Info {

	public MTDABWarningQuestionInfo(Properties ctx, int TDAB_Warning_Question_Info_ID, String trxName) {
		super(ctx, TDAB_Warning_Question_Info_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	public MTDABWarningQuestionInfo(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		if (newRecord) {
			MTDABWarningQuestionInfo mInfo= getInfo(this.getTDAB_Warning_Question_QL_ID(), this.getCode());
			if (null != mInfo) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DUPLICATE_QUESTION));
			}
		}
		return super.beforeSave(newRecord);
	}


	public static MTDABWarningQuestionInfo getInfo(int checkID, String code) {
		List<Object> parames = new ArrayList<>();
		StringBuffer whereClause = new StringBuffer();
		whereClause.append(COLUMNNAME_TDAB_Warning_Question_QL_ID + "=?");
		whereClause.append(" And "+COLUMNNAME_Code +"=?");
		parames.add(checkID);
		parames.add(code);
		
		return new Query(null, Table_Name, whereClause.toString(), null).setParameters(parames).first();
	}


}
