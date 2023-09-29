package org.idempiere.xhtd_ab.process;

import java.sql.Timestamp;
import java.util.Calendar;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC_TQ;
import org.idempiere.xhtd_ab.model.implement.MTDABBCTCTQ;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.ScoreUtils;

public class ApprovalBCTCTQ extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MTDABBCTCTQ mMM = new MTDABBCTCTQ(getCtx(), getRecord_ID(), get_TrxName());
		MTDABBCTCTQ mMM1 = new MTDABBCTCTQ(getCtx(), null, get_TrxName());
		X_TDAB_BCTC_TQ listTD = mMM.findStatusHD();
		listTD.setStatus_Check(Constants.K);
		mMM.setStatus_Check(Constants.HD);
		mMM.setUser_Checked_ID(mMM1.getCreatedBy());
		mMM.setDate_Approved(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		mMM.setapproval("N");
		ScoreUtils.reloadConfig();
		mMM.save();
		listTD.save();
		
		return null;
	}

}
