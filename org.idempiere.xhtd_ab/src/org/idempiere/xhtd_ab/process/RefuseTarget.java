package org.idempiere.xhtd_ab.process;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.implement.MTDABMedianMean;
import org.idempiere.xhtd_ab.model.implement.MTDABMinMax;
import org.idempiere.xhtd_ab.utils.Constants;

public class RefuseTarget extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MTDABMinMax mTDABMinMax = new MTDABMinMax(getCtx(), getRecord_ID(), get_TrxName());
		mTDABMinMax.setStatus_Check(Constants.TC);
		mTDABMinMax.save();
		
		MTDABMedianMean mTDABMedianMean = new MTDABMedianMean(getCtx(), getRecord_ID(), get_TrxName());
		mTDABMedianMean.setStatus_Check(Constants.TC);
		mTDABMedianMean.save();
		
		return null;
	}

}
