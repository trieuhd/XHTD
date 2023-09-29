package org.idempiere.xhtd_ab.process;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.implement.MCustomer;
import org.idempiere.xhtd_ab.model.implement.MCustomerProfile;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class ChangeUserProcess extends SvrProcess {
	private String orgId = "";
	private String userId = "";
	private static final String ORG = "Org";
	private static final String USER = "User";
	
	@Override
	protected void prepare() {
		for (ProcessInfoParameter processInfoParameter : getParameter()) {
			if (ORG.equalsIgnoreCase(processInfoParameter.getParameterName())) {
				orgId = processInfoParameter.getParameterAsString();
			}
			if (USER.equalsIgnoreCase(processInfoParameter.getParameterName())) {
				userId = processInfoParameter.getParameterAsString();
			}
		}
	}

	@Override
	protected String doIt() throws Exception {

		MCustomer mCustomer = new MCustomer(getCtx(), getRecord_ID(), get_TrxName());
		mCustomer.setAD_Org_ID_Hander(Integer.parseInt(orgId));
		mCustomer.setAD_Org_ID(Integer.parseInt(orgId));
		mCustomer.setUser_Handover_ID(Integer.parseInt(userId));
		mCustomer.save();
		//set org and user in profile
		List<MCustomerProfile> profiles = MCustomer.getListCustomerProfile(mCustomer.getTDAB_Customer_ID());
		if (CollectionUtils.isEmpty(profiles)) return null;
		
		for (MCustomerProfile profile : profiles) {
			profile.setAD_Org_ID(Integer.parseInt(orgId));
			profile.setAD_Org_ID_Hander(Integer.parseInt(orgId));
			profile.setUser_Handover_ID(Integer.parseInt(userId));
			profile.save();
		}
		
		addLog(Msg.getMsg(Env.getCtx(), MessageUtil.CHANGE_USER_SUCCESS));
		return null;
	}

}
