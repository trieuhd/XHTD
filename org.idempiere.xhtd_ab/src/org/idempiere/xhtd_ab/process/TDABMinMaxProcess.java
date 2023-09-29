package org.idempiere.xhtd_ab.process;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max;
import org.idempiere.xhtd_ab.model.implement.MTDABMinMax;
import org.idempiere.xhtd_ab.utils.Constants;

public class TDABMinMaxProcess extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MTDABMinMax mTDABMinMax = new MTDABMinMax(getCtx(), getRecord_ID(), get_TrxName());
		if (mTDABMinMax.getStatus_Check() == Constants.KT) {
			mTDABMinMax.setStatus_Check(Constants.CD);
		} else if (mTDABMinMax.getStatus_Check() == Constants.CD) {
			X_TDAB_Min_Max listTD = mTDABMinMax.findStatusHD();
			listTD.setStatus_Check(Constants.K);
			mTDABMinMax.setStatus_Check(Constants.HD);
			listTD.save();
		} else {
			

		}
		mTDABMinMax.save();

		return null;
	}

}
