package org.idempiere.xhtd_ab.process;


import java.nio.file.Paths;

import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.implement.MFinancialHistory;
import org.idempiere.xhtd_ab.model.implement.MFinancialInfoHistory;
import org.idempiere.xhtd_ab.utils.FileUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class DownloadInfoFinancialHisProcess extends SvrProcess{
	
	
	@Override
	protected void prepare() {
		
		
	}

	@Override
	protected String doIt() throws Exception {
		MFinancialInfoHistory mFinancialHistory = new MFinancialInfoHistory(getCtx(), getRecord_ID(), get_TrxName());
		
		if (mFinancialHistory.getBCTC_B1_File()!=null || !"".equalsIgnoreCase(mFinancialHistory.getBCTC_B1_File())) {
			FileUtil.download(Paths.get(mFinancialHistory.getBCTC_B1_File()), processUI);
		} else {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.FILE_NOTEXIST));
		}
		
		return null;
	}
	

	
	
	

}
