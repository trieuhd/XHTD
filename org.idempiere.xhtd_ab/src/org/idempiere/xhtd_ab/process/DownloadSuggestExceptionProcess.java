package org.idempiere.xhtd_ab.process;

import java.nio.file.Paths;

import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.implement.MSuggestException;
import org.idempiere.xhtd_ab.utils.FileUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class DownloadSuggestExceptionProcess extends SvrProcess {
	
	
	@Override
	protected void prepare() {
		
	}

	@Override
	protected String doIt() throws Exception {
		MSuggestException mSuggestException = new MSuggestException(getCtx(), getRecord_ID(), get_TrxName());
		
		if (mSuggestException.getFile_Suggest_CV()!=null || !"".equalsIgnoreCase(mSuggestException.getFile_Suggest_CV())) {
			FileUtil.download(Paths.get(mSuggestException.getFile_Suggest_CV()), processUI);
		} else {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.FILE_NOTEXIST));
		}
		
		return null;
	}

}
