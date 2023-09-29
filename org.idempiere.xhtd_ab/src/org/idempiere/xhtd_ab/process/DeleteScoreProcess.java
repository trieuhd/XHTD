package org.idempiere.xhtd_ab.process;

import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.implement.MCustomerScore;

public class DeleteScoreProcess extends SvrProcess {

	private String statusValue = "";
	private static final String STATUS = "Status";
	private static final String STATUS_OK = "Y";
	private static final String STATUS_CANCEL = "C";

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		for (ProcessInfoParameter processInfoParameter : getParameter()) {
			if (STATUS.equalsIgnoreCase(processInfoParameter.getParameterName())) {
				statusValue = processInfoParameter.getParameterAsString();
			}
		}
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MCustomerScore mCustomerScore = new MCustomerScore(getCtx(), getRecord_ID(), get_TrxName());

		String delStatus = null;
		String oldStatus = mCustomerScore.getDeleteStatus();

		if (STATUS_OK.equalsIgnoreCase(statusValue)) {
			if (MCustomerScore.DELETESTATUS_OfferToDelete.equalsIgnoreCase(oldStatus)
					|| MCustomerScore.DELETESTATUS_DeleteByIt.equalsIgnoreCase(oldStatus)
					|| MCustomerScore.DOCSTATUS_HasNotSubmittedControl
							.equalsIgnoreCase(mCustomerScore.getDocStatus())) {
				delStatus = MCustomerScore.DELETESTATUS_DeleteSucces;
			} else {
				delStatus = MCustomerScore.DELETESTATUS_OfferToDelete;
				mCustomerScore.setActionDel(MCustomerScore.DELETESTATUS_DeleteSucces);
			}
		} else if (STATUS_CANCEL.equalsIgnoreCase(statusValue)) {
			delStatus = MCustomerScore.DELETESTATUS_CancelDelete;
			mCustomerScore.setActionDel("DAF");
		} else {
			delStatus = MCustomerScore.DELETESTATUS_DeleteByIt;
		}

		mCustomerScore.setDeleteStatus(delStatus);
		mCustomerScore.save(get_TrxName());
		return null;
	}

}
