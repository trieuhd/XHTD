package org.idempiere.xhtd_ab.access;

import java.util.List;

import org.compiere.model.MUserOrgAccess;
import org.compiere.model.Query;
import org.idempiere.xhtd_ab.model.I_TDAB_GROUP_STANDARD;
import org.idempiere.xhtd_ab.model.I_TDAB_SET_OF_STANDARD;
import org.idempiere.xhtd_ab.model.I_TDAB_STANDARD;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC_DN_B1;
import org.idempiere.xhtd_ab.model.X_TDAB_BCTC_DN_B2;
import org.idempiere.xhtd_ab.model.X_TDAB_Config_Value;
import org.idempiere.xhtd_ab.model.X_TDAB_Customer_Profile;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.model.X_TDAB_GROUP_STANDARD;
import org.idempiere.xhtd_ab.model.X_TDAB_Info_CIC;
import org.idempiere.xhtd_ab.model.X_TDAB_Logistic_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Median_Mean_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Min_Max_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Normalized_Param_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_ORG_DETAIL;
import org.idempiere.xhtd_ab.model.X_TDAB_PC;
import org.idempiere.xhtd_ab.model.X_TDAB_PTC_CIC_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Point_Rate_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_Rating;
import org.idempiere.xhtd_ab.model.X_TDAB_Rating_Info;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE_CONFIG;
import org.idempiere.xhtd_ab.model.X_TDAB_SCORE_DETAIL;
import org.idempiere.xhtd_ab.model.X_TDAB_SET_OF_STANDARD;
import org.idempiere.xhtd_ab.model.X_TDAB_STANDARD;

public class ScoreAccess {

	public static List<X_TDAB_STANDARD> getStandard() {
		return new Query(null, I_TDAB_STANDARD.Table_Name, null, null).list();
	}

	public static List<X_TDAB_SET_OF_STANDARD> getSetOfStandard() {
		return new Query(null, I_TDAB_SET_OF_STANDARD.Table_Name, null, null).list();
	}

	public static List<X_TDAB_GROUP_STANDARD> getGroupStandard() {
		return new Query(null, I_TDAB_GROUP_STANDARD.Table_Name, null, null).list();
	}

	public static List<X_TDAB_SCORE_CONFIG> getScoreConfig() {
		return new Query(null, X_TDAB_SCORE_CONFIG.Table_Name, null, null).list();
	}

	public static X_TDAB_BCTC_DN_B1 findB(int profileID) {
		try {
			String whereString = X_TDAB_BCTC_DN_B1.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
			return new Query(null, X_TDAB_BCTC_DN_B1.Table_Name, whereString, null).first();
		} catch (Exception e) {
			return null;
		}
	}
	public static X_TDAB_Financial_Info findBCTC(int profileID) {
		try {
			String whereString = X_TDAB_Financial_Info.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
			return new Query(null, X_TDAB_Financial_Info.Table_Name, whereString, null).first();
		} catch (Exception e) {
			return null;
		}
	}


	public static X_TDAB_BCTC_DN_B2 findBCTCB2(int profileID) {
		try {
			String whereString = X_TDAB_BCTC_DN_B1.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
			return new Query(null, X_TDAB_BCTC_DN_B2.Table_Name, whereString, null).first();
		} catch (Exception e) {
			return null;
		}

	}

	public static X_TDAB_Financial_Non findNonFinancial(int profileID) {
		String whereString = X_TDAB_Financial_Non.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
		return new Query(null, X_TDAB_Financial_Non.Table_Name, whereString, null).first();
	}

	public static X_TDAB_Info_CIC findCIC(int profileID) {
		String whereString = X_TDAB_Info_CIC.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
		return new Query(null, X_TDAB_Info_CIC.Table_Name, whereString, null).first();
	}
	
	public static List<X_TDAB_BCTC> findAllBCTC() {
		String whereString = X_TDAB_BCTC.COLUMNNAME_TDAB_BCTC_TQ_ID + " = " + " (select TDAB_BCTC_TQ_ID from TDAB_BCTC_TQ where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_BCTC.Table_Name, whereString, null).setOrderBy(X_TDAB_BCTC.COLUMNNAME_Created+" DESC").list();
	}
	
	public static X_TDAB_Customer_Profile findCustomerProfile(int profileID) {
		String whereString = X_TDAB_Customer_Profile.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
		return new Query(null, X_TDAB_Customer_Profile.Table_Name, whereString, null).first();
	}
	
	public static List<X_TDAB_Config_Value> findConfigPTC39() {
		String whereString = X_TDAB_Config_Value.COLUMNNAME_TDAB_Config_Value_TQ_ID + " = " + " (select TDAB_Config_Value_TQ_ID from TDAB_Config_Value_TQ where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Config_Value.Table_Name, whereString, null).setOrderBy(X_TDAB_Config_Value.COLUMNNAME_Created+" DESC").list();
	}
	
	public static X_TDAB_PC findConfigPDRate() {
		String whereString = X_TDAB_PC.COLUMNNAME_TDAB_PC_TQ_ID + " = " + " (select TDAB_PC_TQ_ID from TDAB_PC_TQ where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_PC.Table_Name, whereString, null).setOrderBy(X_TDAB_PC.COLUMNNAME_Created+" DESC").first();
	}
	
	public static MUserOrgAccess findOrgAccess(int userID , int orgID) {
		String whereString = MUserOrgAccess.COLUMNNAME_AD_Org_ID + " = " + orgID +" AND "+MUserOrgAccess.COLUMNNAME_AD_User_ID +" = "+userID;
		return new Query(null, MUserOrgAccess.Table_Name, whereString, null).first();
	}
	
	public static X_TDAB_SCORE findScore(String profileID) {
		String whereString = X_TDAB_SCORE.COLUMNNAME_TDAB_Customer_Profile_ID + " = " + profileID;
		return new Query(null, X_TDAB_SCORE.Table_Name, whereString, null).setOrderBy(X_TDAB_SCORE.COLUMNNAME_Created+" DESC").first();
	}
	
	public static List<X_TDAB_SCORE_DETAIL> findListScoreDetail(int scoreID) {
		String whereString = X_TDAB_SCORE_DETAIL.COLUMNNAME_TDAB_SCORE_ID + " = " + scoreID;
		return new Query(null, X_TDAB_SCORE_DETAIL.Table_Name, whereString, null).setOrderBy(X_TDAB_SCORE_DETAIL.COLUMNNAME_Value+" DESC").list();
	}

	public static List<X_TDAB_Rating_Info> findRating() {
		String whereString = X_TDAB_Rating_Info.COLUMNNAME_TDAB_Rating_ID + " = " + " (select TDAB_Rating_ID from TDAB_Rating where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Rating_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_Rating_Info.COLUMNNAME_Created+" DESC").list();
	}
	
	public static List<X_TDAB_PTC_CIC_Info> getlistPTCCIC(){
		String whereString = X_TDAB_PTC_CIC_Info.COLUMNNAME_TDAB_PTC_CIC_ID + " = " + " (select tdab_ptc_cic_id from tdab_ptc_cic where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_PTC_CIC_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_SCORE.COLUMNNAME_Created+" DESC").list();
	}
	
	public static List<X_TDAB_Min_Max_Info> findByMinMax() {
		String whereString = X_TDAB_Min_Max_Info.COLUMNNAME_TDAB_Min_Max_ID + " = " + " (select TDAB_Min_Max_id from TDAB_Min_Max where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Min_Max_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_Min_Max_Info.COLUMNNAME_Created+" DESC").list();
	}
	
	public static List<X_TDAB_Median_Mean_Info> getListMedianMean(){
		String whereString = X_TDAB_Median_Mean_Info.COLUMNNAME_TDAB_Median_Mean_ID + " = " + " (select TDAB_Median_Mean_ID from TDAB_Median_Mean where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Median_Mean_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_Median_Mean_Info.COLUMNNAME_Created+" DESC").list();
	}
	
	public static List<X_TDAB_Logistic_Info> getListLogistic_Info(){
		String whereString = X_TDAB_Logistic_Info.COLUMNNAME_TDAB_Logistic_ID + " = " + " (select TDAB_Logistic_ID from TDAB_Logistic where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Logistic_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_Logistic_Info.COLUMNNAME_Created+" DESC").list();
	}
	
	public static List<X_TDAB_Normalized_Param_Info> getListNormalized(){
		String whereString = X_TDAB_Normalized_Param_Info.COLUMNNAME_TDAB_Normalized_Parameters_ID + " = " + " (select TDAB_Normalized_Parameters_ID from TDAB_Normalized_Parameters where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Normalized_Param_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_Normalized_Param_Info.COLUMNNAME_Created+" DESC").list();
	}
	

	public static List<X_TDAB_Point_Rate_Info> getListPointRate(){
		String whereString = X_TDAB_Point_Rate_Info.COLUMNNAME_TDAB_Point_Rate_ID + " = " + " (select TDAB_Point_Rate_ID from TDAB_Point_Rate where Status_Check = 'HD' and ROWNUM = 1)";
		return new Query(null, X_TDAB_Point_Rate_Info.Table_Name, whereString, null).setOrderBy(X_TDAB_Point_Rate_Info.COLUMNNAME_Created+" DESC").list();
	}
	
	
	public static List<X_TDAB_ORG_DETAIL> getListOrgDetail(int orgDetailID) {
		String whereString = X_TDAB_ORG_DETAIL.COLUMNNAME_TDAB_Org_ID + " = " + " (select tdab_org_id from tdab_org_detail where tdab_org_detail_id = "+orgDetailID+") ";
		return new Query(null, X_TDAB_ORG_DETAIL.Table_Name, whereString, null).setOrderBy(X_TDAB_Point_Rate_Info.COLUMNNAME_Created+" DESC").list();
	}
	
	public static List<X_TDAB_ORG_DETAIL> getListOrgDetailByValue(String value) {
		String whereString = X_TDAB_ORG_DETAIL.COLUMNNAME_Value + " = '" + value+"'";
		return new Query(null, X_TDAB_ORG_DETAIL.Table_Name, whereString, null).list();
	}
	
}
