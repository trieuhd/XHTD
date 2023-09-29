package org.idempiere.xhtd_ab.object;

import org.compiere.model.PO;
import org.idempiere.xhtd_ab.access.ScoreAccess;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC_DN_B1;
import org.idempiere.xhtd_ab.model.X_TDAB_Customer_Profile;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.model.X_TDAB_Info_CIC;

public class ProfileObject {
	private int profileID;
	
	// Thông tin cic
	private X_TDAB_Info_CIC cic;
	private X_TDAB_Customer_Profile profile;

	// Thông tin phi tài chinh
	private X_TDAB_Financial_Non nonFinancial;

	// Thông tin tài chính năm hiện tại
	private X_TDAB_Financial_Info bctcB1;

	public ProfileObject(int profileID) {
		this.setProfileID(profileID);
		profile = ScoreAccess.findCustomerProfile(profileID);
		cic = ScoreAccess.findCIC(profileID);
		nonFinancial = ScoreAccess.findNonFinancial(profileID);
		bctcB1 = ScoreAccess.findBCTC(profileID);
	}

	private PO getDetailProfile(String tableName) {
		switch (tableName) {
		case X_TDAB_Info_CIC.Table_Name:
			return cic;
		case X_TDAB_Financial_Non.Table_Name:
			return nonFinancial;
		case X_TDAB_Financial_Info.Table_Name:
			return bctcB1;
		default:
			break;
		}
		return null;
	}

	public Object getValue(String tableName, String collumName) {
		PO po = getDetailProfile(tableName);
		if (po == null) {
			return null;
		}
		Object value = po.get_Value(collumName);
		return value;
	}

	public int getProfileID() {
		return profileID;
	}

	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}

	public X_TDAB_Info_CIC getCic() {
		return cic;
	}

	public void setCic(X_TDAB_Info_CIC cic) {
		this.cic = cic;
	}

	public X_TDAB_Financial_Non getNonFinancial() {
		return nonFinancial;
	}

	public void setNonFinancial(X_TDAB_Financial_Non nonFinancial) {
		this.nonFinancial = nonFinancial;
	}

	public X_TDAB_Customer_Profile getProfile() {
		return profile;
	}

	public X_TDAB_Financial_Info getBctcB1() {
		return bctcB1;
	}

	public void setBctcB1(X_TDAB_Financial_Info bctcB1) {
		this.bctcB1 = bctcB1;
	}
}
