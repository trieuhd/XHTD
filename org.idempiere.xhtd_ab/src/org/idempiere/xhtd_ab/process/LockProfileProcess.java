package org.idempiere.xhtd_ab.process;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;

public class LockProfileProcess extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		
		MCustomerProfile mCustomerProfile = new MCustomerProfile(getCtx(), getRecord_ID(), get_TrxName());
		
		mCustomerProfile.setTDAB_Profile_Status_ID(2);
		mCustomerProfile.save();
		return null;
	}

}
