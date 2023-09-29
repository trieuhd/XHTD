package org.idempiere.xhtd_ab.process;

import java.sql.Timestamp;
import java.util.Calendar;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max;
import org.idempiere.xhtd_ab.model.implement.MTDABMinMax;
import org.idempiere.xhtd_ab.utils.Constants;
import org.idempiere.xhtd_ab.utils.ScoreUtils;

public class ApprovalTarget extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {

		MTDABMinMax mTDABMinMax = new MTDABMinMax(getCtx(), getRecord_ID(), get_TrxName());
		MTDABMinMax mTDABMinMax1 = new MTDABMinMax(getCtx(), null, get_TrxName());
		X_TDAB_Min_Max listTD = mTDABMinMax.findStatusHD();
		listTD.setStatus_Check(Constants.K);
		mTDABMinMax.setStatus_Check(Constants.HD);
		mTDABMinMax.setUser_Checked_ID(mTDABMinMax1.getCreatedBy());
		mTDABMinMax.setDate_Approved(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		
		mTDABMinMax.setapproval("N");
		
		ScoreUtils.reloadConfig();
		mTDABMinMax.save();
		listTD.save();
		
		return null;
	}

}
