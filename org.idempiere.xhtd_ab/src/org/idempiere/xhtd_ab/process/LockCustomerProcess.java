package org.idempiere.xhtd_ab.process;

import java.util.List;

import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.implement.MCustomer;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class LockCustomerProcess extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		MCustomer mCustomer = new MCustomer(getCtx(), getRecord_ID(), get_TrxName());
		MCustomerProfile mCusP = new MCustomerProfile(getCtx(), null, get_TrxName());
		List<MCustomerProfile> list = mCusP.getListMCustomer(mCustomer.getValue());
		if (list.size() > 1) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_DUPLICATE_CUS));
			
		}

		mCustomer.setStatus("K");

		mCustomer.save();
		return null;
	}

}
