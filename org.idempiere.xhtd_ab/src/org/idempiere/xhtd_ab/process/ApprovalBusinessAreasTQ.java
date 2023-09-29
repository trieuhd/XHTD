package org.idempiere.xhtd_ab.process;

import java.sql.Timestamp;
import java.util.Calendar;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.X_TDAB_Business_Areas_TQ;
import org.idempiere.xhtd_ab.model.implement.MTDABBusinessAreasTQ;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.ScoreUtils;

public class ApprovalBusinessAreasTQ extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MTDABBusinessAreasTQ mMM = new MTDABBusinessAreasTQ(getCtx(), getRecord_ID(), get_TrxName());
		MTDABBusinessAreasTQ mMM1 = new MTDABBusinessAreasTQ(getCtx(), null, get_TrxName());
		X_TDAB_Business_Areas_TQ listTD = mMM.findStatusHD();
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
