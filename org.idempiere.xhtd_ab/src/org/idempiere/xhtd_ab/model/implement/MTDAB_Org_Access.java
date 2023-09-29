package org.idempiere.xhtd_ab.model.implement;

import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.MOrg;
import org.compiere.model.MUserOrgAccess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.access.ScoreAccess;
import org.idempiere.xhtd_ab.model.X_TDAB_ORG_DETAIL;
import org.idempiere.xhtd_ab.model.X_TDAB_User_Org;

public class MTDAB_Org_Access extends X_TDAB_User_Org{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MTDAB_Org_Access(Properties ctx, int TDAB_User_Org_ID, String trxName) {
		super(ctx, TDAB_User_Org_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	public MTDAB_Org_Access(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		if(!getTDAB_ORG_DETAIL().isParent()) {
			MUserOrgAccess userOrgAccess = new MUserOrgAccess(new MOrg(getCtx(), getTDAB_ORG_DETAIL().getS_Org_ID(), get_TrxName()), getAD_User_ID());
			if(!userOrgAccess.save()) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), "Khong The Luu!!!"));
			}
		} else {
			List<X_TDAB_ORG_DETAIL> listChild = ScoreAccess.getListOrgDetail(getTDAB_ORG_DETAIL().getTDAB_ORG_DETAIL_ID());
			for(X_TDAB_ORG_DETAIL child : listChild) {
				MUserOrgAccess userOrgAccess = new MUserOrgAccess(new MOrg(getCtx(), child.getS_Org_ID(), get_TrxName()), getAD_User_ID());
				if(!userOrgAccess.save()) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), "Khong The Luu!!!"));
				}
			}
		}
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		// TODO Auto-generated method stub
		return super.afterSave(newRecord, success);
	}

	@Override
	protected boolean afterDelete(boolean success) {
		if(getTDAB_ORG_DETAIL().isParent()) {
			List<X_TDAB_ORG_DETAIL> listChild = ScoreAccess.getListOrgDetail(getTDAB_ORG_DETAIL().getTDAB_ORG_DETAIL_ID());
			for(X_TDAB_ORG_DETAIL child : listChild) {
				MUserOrgAccess userOrgAccess = ScoreAccess.findOrgAccess(getAD_User_ID(), child.getS_Org_ID());
				if(userOrgAccess == null ) {
					continue;
				}
				if(!userOrgAccess.delete(true)) {
					throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), "Khong The Xoa!!!"));
				}
			}
		}
		else {
			MUserOrgAccess userOrgAccess = ScoreAccess.findOrgAccess(getAD_User_ID(), getTDAB_ORG_DETAIL().getS_Org_ID());
			if(userOrgAccess!=null && !userOrgAccess.delete(true)) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), "Khong The Xoa!!!"));
			}
		}
		
		return super.afterDelete(success);
	}

}
