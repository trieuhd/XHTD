package org.idempiere.xhtd_ab.process;

import java.nio.file.Paths;

import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.implement.MSuggestExceptionHistory;
import org.idempiere.xhtd_ab.utils.FileUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class DownloadSuggestExceptionProcessHis extends SvrProcess{
	
	@Override
	protected void prepare() {
		
	}

	@Override
	protected String doIt() throws Exception {
		MSuggestExceptionHistory mSuggestExceptionHistory = new MSuggestExceptionHistory(getCtx(), getRecord_ID(), get_TrxName());
		
		if (mSuggestExceptionHistory.getFile_Suggest_CV()!=null || !"".equalsIgnoreCase(mSuggestExceptionHistory.getFile_Suggest_CV())) {
			FileUtil.download(Paths.get(mSuggestExceptionHistory.getFile_Suggest_CV()), processUI);
		} else {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.FILE_NOTEXIST));
		}
		
		return null;
	}

}
