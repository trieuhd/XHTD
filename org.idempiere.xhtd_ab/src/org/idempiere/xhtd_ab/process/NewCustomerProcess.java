package org.idempiere.xhtd_ab.process;

import org.compiere.process.SvrProcess;
import org.idempiere.xhtd_ab.model.implement.MCustomer;

public class NewCustomerProcess extends SvrProcess  {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MCustomer mCustomer = new MCustomer(getCtx(), getRecord_ID(), get_TrxName());
		mCustomer.setStatus("HD");
		mCustomer.save();
		return null;
	}
	


}
