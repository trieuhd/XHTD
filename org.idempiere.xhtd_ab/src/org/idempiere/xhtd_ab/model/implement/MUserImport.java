package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.X_AD_User_Roles;
import org.idempiere.xhtd_ab.access.ScoreAccess;
import org.idempiere.xhtd_ab.model.X_TDAB_FILE_IMPORT_USER;
import org.idempiere.xhtd_ab.model.X_TDAB_ORG_DETAIL;

public class MUserImport extends X_TDAB_FILE_IMPORT_USER {

	public MUserImport(Properties ctx, int TDAB_FILE_IMPORT_USER_ID, String trxName) {
		super(ctx, TDAB_FILE_IMPORT_USER_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MUserImport(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if(getAD_Role() == null) {
			setStatus("Fail");
			setAD_Role_ID(103);
			setError_Log("Role khong ton tai");
			return super.beforeSave(newRecord);
		}
		
		List<X_TDAB_ORG_DETAIL> list = ScoreAccess.getListOrgDetailByValue(getOrg_Value());
		if(list == null || list.size() == 0) {
			setStatus("Fail");
			setError_Log(("Chi nhanh ko ton tai"));
			return super.beforeSave(newRecord);
		}
		
		MUserTDAB user = new MUserTDAB(getCtx(), 0, get_TrxName());
		user.setName(getName());
		user.setDescription(getDescription());
		user.setEMail(getEMail());
		user.setLDAPUser(getLDAPUser());
		user.setTitle(getTitle());
		user.save();
		X_AD_User_Roles userRole = new X_AD_User_Roles(getCtx(), 0, get_TrxName());
		userRole.setAD_User_ID(user.getAD_User_ID());
		userRole.setAD_Role_ID(getAD_Role_ID());
		userRole.save();
		MTDAB_Org_Access orgAcess = new MTDAB_Org_Access(getCtx(), 0, get_TrxName());
		orgAcess.setTDAB_ORG_DETAIL_ID(list.get(0).getTDAB_ORG_DETAIL_ID());
		orgAcess.setAD_User_ID(user.getAD_User_ID());
		orgAcess.save();
		setStatus("Success");
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		
		return super.afterSave(newRecord, success);
	}

}
