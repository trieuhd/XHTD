package org.idempiere.xhtd_ab.process;

import java.sql.Timestamp;
import java.util.Calendar;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.X_TDAB_Direct_KO_QL;
import org.idempiere.xhtd_ab.model.implement.MTDABDirectKOQL;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.ScoreUtils;

public class ApprovalDirectKOQL extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MTDABDirectKOQL mMM = new MTDABDirectKOQL(getCtx(), getRecord_ID(), get_TrxName());
		MTDABDirectKOQL mMM1 = new MTDABDirectKOQL(getCtx(), null, get_TrxName());
		X_TDAB_Direct_KO_QL listTD = mMM.findStatusHD();
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
