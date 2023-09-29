/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.idempiere.xhtd_ab.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for TDAB_Customer_Profile
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Customer_Profile 
{

    /** TableName=TDAB_Customer_Profile */
    public static final String Table_Name = "TDAB_Customer_Profile";

    /** AD_Table_ID=1000168 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name ACTION_UPL */
    public static final String COLUMNNAME_ACTION_UPL = "ACTION_UPL";

	/** Set ACTION_UPL	  */
	public void setACTION_UPL (String ACTION_UPL);

	/** Get ACTION_UPL	  */
	public String getACTION_UPL();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_Org_ID_Hander */
    public static final String COLUMNNAME_AD_Org_ID_Hander = "AD_Org_ID_Hander";

	/** Set AD_Org_ID_Hander	  */
	public void setAD_Org_ID_Hander (int AD_Org_ID_Hander);

	/** Get AD_Org_ID_Hander	  */
	public int getAD_Org_ID_Hander();

    /** Column name AD_Org_ID_KS */
    public static final String COLUMNNAME_AD_Org_ID_KS = "AD_Org_ID_KS";

	/** Set AD_Org_ID_KS	  */
	public void setAD_Org_ID_KS (int AD_Org_ID_KS);

	/** Get AD_Org_ID_KS	  */
	public int getAD_Org_ID_KS();

    /** Column name AD_Org_ID_TD */
    public static final String COLUMNNAME_AD_Org_ID_TD = "AD_Org_ID_TD";

	/** Set AD_Org_ID_TD	  */
	public void setAD_Org_ID_TD (int AD_Org_ID_TD);

	/** Get AD_Org_ID_TD	  */
	public int getAD_Org_ID_TD();

    /** Column name ActionAp */
    public static final String COLUMNNAME_ActionAp = "ActionAp";

	/** Set ActionAp	  */
	public void setActionAp (String ActionAp);

	/** Get ActionAp	  */
	public String getActionAp();

    /** Column name ActionCancel */
    public static final String COLUMNNAME_ActionCancel = "ActionCancel";

	/** Set ActionCancel	  */
	public void setActionCancel (String ActionCancel);

	/** Get ActionCancel	  */
	public String getActionCancel();

    /** Column name ActionCd */
    public static final String COLUMNNAME_ActionCd = "ActionCd";

	/** Set ActionCd	  */
	public void setActionCd (String ActionCd);

	/** Get ActionCd	  */
	public String getActionCd();

    /** Column name ActionEdit */
    public static final String COLUMNNAME_ActionEdit = "ActionEdit";

	/** Set ActionEdit	  */
	public void setActionEdit (String ActionEdit);

	/** Get ActionEdit	  */
	public String getActionEdit();

    /** Column name ActionKs */
    public static final String COLUMNNAME_ActionKs = "ActionKs";

	/** Set ActionKs	  */
	public void setActionKs (String ActionKs);

	/** Get ActionKs	  */
	public String getActionKs();

    /** Column name ActionViewScore */
    public static final String COLUMNNAME_ActionViewScore = "ActionViewScore";

	/** Set ActionViewScore	  */
	public void setActionViewScore (String ActionViewScore);

	/** Get ActionViewScore	  */
	public String getActionViewScore();

    /** Column name Action_Suggest */
    public static final String COLUMNNAME_Action_Suggest = "Action_Suggest";

	/** Set Action_Suggest	  */
	public void setAction_Suggest (String Action_Suggest);

	/** Get Action_Suggest	  */
	public String getAction_Suggest();

    /** Column name BusinessType */
    public static final String COLUMNNAME_BusinessType = "BusinessType";

	/** Set BusinessType	  */
	public void setBusinessType (String BusinessType);

	/** Get BusinessType	  */
	public String getBusinessType();

    /** Column name Business_Name */
    public static final String COLUMNNAME_Business_Name = "Business_Name";

	/** Set Business_Name	  */
	public void setBusiness_Name (String Business_Name);

	/** Get Business_Name	  */
	public String getBusiness_Name();

    /** Column name CIC_ID */
    public static final String COLUMNNAME_CIC_ID = "CIC_ID";

	/** Set CIC_ID	  */
	public void setCIC_ID (String CIC_ID);

	/** Get CIC_ID	  */
	public String getCIC_ID();

    /** Column name CIC_Score */
    public static final String COLUMNNAME_CIC_Score = "CIC_Score";

	/** Set CIC_Score	  */
	public void setCIC_Score (String CIC_Score);

	/** Get CIC_Score	  */
	public String getCIC_Score();

    /** Column name CIF */
    public static final String COLUMNNAME_CIF = "CIF";

	/** Set CIF	  */
	public void setCIF (String CIF);

	/** Get CIF	  */
	public String getCIF();

    /** Column name CompanyName */
    public static final String COLUMNNAME_CompanyName = "CompanyName";

	/** Set CompanyName	  */
	public void setCompanyName (String CompanyName);

	/** Get CompanyName	  */
	public String getCompanyName();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DATE_OFFER */
    public static final String COLUMNNAME_DATE_OFFER = "DATE_OFFER";

	/** Set DATE_OFFER	  */
	public void setDATE_OFFER (Timestamp DATE_OFFER);

	/** Get DATE_OFFER	  */
	public Timestamp getDATE_OFFER();

    /** Column name DATE_REFUSE */
    public static final String COLUMNNAME_DATE_REFUSE = "DATE_REFUSE";

	/** Set DATE_REFUSE	  */
	public void setDATE_REFUSE (Timestamp DATE_REFUSE);

	/** Get DATE_REFUSE	  */
	public Timestamp getDATE_REFUSE();

    /** Column name Date_CIC_KS */
    public static final String COLUMNNAME_Date_CIC_KS = "Date_CIC_KS";

	/** Set Date_CIC_KS	  */
	public void setDate_CIC_KS (Timestamp Date_CIC_KS);

	/** Get Date_CIC_KS	  */
	public Timestamp getDate_CIC_KS();

    /** Column name Date_CIC_TD */
    public static final String COLUMNNAME_Date_CIC_TD = "Date_CIC_TD";

	/** Set Date_CIC_TD	  */
	public void setDate_CIC_TD (int Date_CIC_TD);

	/** Get Date_CIC_TD	  */
	public int getDate_CIC_TD();

    /** Column name Date_CiC */
    public static final String COLUMNNAME_Date_CiC = "Date_CiC";

	/** Set Date_CiC	  */
	public void setDate_CiC (Timestamp Date_CiC);

	/** Get Date_CiC	  */
	public Timestamp getDate_CiC();

    /** Column name Date_Create */
    public static final String COLUMNNAME_Date_Create = "Date_Create";

	/** Set Date_Create	  */
	public void setDate_Create (Timestamp Date_Create);

	/** Get Date_Create	  */
	public Timestamp getDate_Create();

    /** Column name Date_First_Business_Regist */
    public static final String COLUMNNAME_Date_First_Business_Regist = "Date_First_Business_Regist";

	/** Set Date_First_Business_Regist.
	  * Ngày cấp đăng kí kinh doanh đầu tiên
	  */
	public void setDate_First_Business_Regist (Timestamp Date_First_Business_Regist);

	/** Get Date_First_Business_Regist.
	  * Ngày cấp đăng kí kinh doanh đầu tiên
	  */
	public Timestamp getDate_First_Business_Regist();

    /** Column name Date_Loan */
    public static final String COLUMNNAME_Date_Loan = "Date_Loan";

	/** Set Date_Loan	  */
	public void setDate_Loan (Timestamp Date_Loan);

	/** Get Date_Loan	  */
	public Timestamp getDate_Loan();

    /** Column name Date_Loan_KS */
    public static final String COLUMNNAME_Date_Loan_KS = "Date_Loan_KS";

	/** Set Date_Loan_KS	  */
	public void setDate_Loan_KS (Timestamp Date_Loan_KS);

	/** Get Date_Loan_KS	  */
	public Timestamp getDate_Loan_KS();

    /** Column name Date_Loan_TD */
    public static final String COLUMNNAME_Date_Loan_TD = "Date_Loan_TD";

	/** Set Date_Loan_TD	  */
	public void setDate_Loan_TD (Timestamp Date_Loan_TD);

	/** Get Date_Loan_TD	  */
	public Timestamp getDate_Loan_TD();

    /** Column name Date_Update */
    public static final String COLUMNNAME_Date_Update = "Date_Update";

	/** Set Date_Update	  */
	public void setDate_Update (Timestamp Date_Update);

	/** Get Date_Update	  */
	public Timestamp getDate_Update();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name INFO_OFFER */
    public static final String COLUMNNAME_INFO_OFFER = "INFO_OFFER";

	/** Set INFO_OFFER	  */
	public void setINFO_OFFER (String INFO_OFFER);

	/** Get INFO_OFFER	  */
	public String getINFO_OFFER();

    /** Column name INFO_REFUSE */
    public static final String COLUMNNAME_INFO_REFUSE = "INFO_REFUSE";

	/** Set INFO_REFUSE	  */
	public void setINFO_REFUSE (String INFO_REFUSE);

	/** Get INFO_REFUSE	  */
	public String getINFO_REFUSE();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set IsActive.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get IsActive.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsRecordReject */
    public static final String COLUMNNAME_IsRecordReject = "IsRecordReject";

	/** Set IsRecordReject	  */
	public void setIsRecordReject (String IsRecordReject);

	/** Get IsRecordReject	  */
	public String getIsRecordReject();

    /** Column name LockProfile */
    public static final String COLUMNNAME_LockProfile = "LockProfile";

	/** Set LockProfile	  */
	public void setLockProfile (String LockProfile);

	/** Get LockProfile	  */
	public String getLockProfile();

    /** Column name Medium_Level */
    public static final String COLUMNNAME_Medium_Level = "Medium_Level";

	/** Set Medium_Level.
	  * Mức độ trung bình
	  */
	public void setMedium_Level (BigDecimal Medium_Level);

	/** Get Medium_Level.
	  * Mức độ trung bình
	  */
	public BigDecimal getMedium_Level();

    /** Column name NOFFER */
    public static final String COLUMNNAME_NOFFER = "NOFFER";

	/** Set NOFFER	  */
	public void setNOFFER (int NOFFER);

	/** Get NOFFER	  */
	public int getNOFFER();

    /** Column name NREFUSE */
    public static final String COLUMNNAME_NREFUSE = "NREFUSE";

	/** Set NREFUSE	  */
	public void setNREFUSE (int NREFUSE);

	/** Get NREFUSE	  */
	public int getNREFUSE();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Name_Ids */
    public static final String COLUMNNAME_Name_Ids = "Name_Ids";

	/** Set Name_Ids	  */
	public void setName_Ids (String Name_Ids);

	/** Get Name_Ids	  */
	public String getName_Ids();

    /** Column name Note */
    public static final String COLUMNNAME_Note = "Note";

	/** Set Note.
	  * Optional additional user defined information
	  */
	public void setNote (String Note);

	/** Get Note.
	  * Optional additional user defined information
	  */
	public String getNote();

    /** Column name Note_CV */
    public static final String COLUMNNAME_Note_CV = "Note_CV";

	/** Set Note_CV	  */
	public void setNote_CV (String Note_CV);

	/** Get Note_CV	  */
	public String getNote_CV();

    /** Column name Note_KS */
    public static final String COLUMNNAME_Note_KS = "Note_KS";

	/** Set Note_KS	  */
	public void setNote_KS (String Note_KS);

	/** Get Note_KS	  */
	public String getNote_KS();

    /** Column name Note_TD */
    public static final String COLUMNNAME_Note_TD = "Note_TD";

	/** Set Note_TD	  */
	public void setNote_TD (String Note_TD);

	/** Get Note_TD	  */
	public String getNote_TD();

    /** Column name NumberBusiness */
    public static final String COLUMNNAME_NumberBusiness = "NumberBusiness";

	/** Set NumberBusiness	  */
	public void setNumberBusiness (String NumberBusiness);

	/** Get NumberBusiness	  */
	public String getNumberBusiness();

    /** Column name PTC_SCORE */
    public static final String COLUMNNAME_PTC_SCORE = "PTC_SCORE";

	/** Set PTC_SCORE	  */
	public void setPTC_SCORE (String PTC_SCORE);

	/** Get PTC_SCORE	  */
	public String getPTC_SCORE();

    /** Column name Rank */
    public static final String COLUMNNAME_Rank = "Rank";

	/** Set Rank	  */
	public void setRank (String Rank);

	/** Get Rank	  */
	public String getRank();

    /** Column name Rank_KS */
    public static final String COLUMNNAME_Rank_KS = "Rank_KS";

	/** Set Rank_KS	  */
	public void setRank_KS (String Rank_KS);

	/** Get Rank_KS	  */
	public String getRank_KS();

    /** Column name Rank_PD */
    public static final String COLUMNNAME_Rank_PD = "Rank_PD";

	/** Set Rank_PD	  */
	public void setRank_PD (String Rank_PD);

	/** Get Rank_PD	  */
	public String getRank_PD();

    /** Column name Rate_Debt */
    public static final String COLUMNNAME_Rate_Debt = "Rate_Debt";

	/** Set Rate_Debt	  */
	public void setRate_Debt (String Rate_Debt);

	/** Get Rate_Debt	  */
	public String getRate_Debt();

    /** Column name Rate_Debt_KS */
    public static final String COLUMNNAME_Rate_Debt_KS = "Rate_Debt_KS";

	/** Set Rate_Debt_KS	  */
	public void setRate_Debt_KS (String Rate_Debt_KS);

	/** Get Rate_Debt_KS	  */
	public String getRate_Debt_KS();

    /** Column name Rate_Debt_PD */
    public static final String COLUMNNAME_Rate_Debt_PD = "Rate_Debt_PD";

	/** Set Rate_Debt_PD	  */
	public void setRate_Debt_PD (String Rate_Debt_PD);

	/** Get Rate_Debt_PD	  */
	public String getRate_Debt_PD();

    /** Column name Report_Btn */
    public static final String COLUMNNAME_Report_Btn = "Report_Btn";

	/** Set Report_Btn	  */
	public void setReport_Btn (String Report_Btn);

	/** Get Report_Btn	  */
	public String getReport_Btn();

    /** Column name Report_Btn_Cus */
    public static final String COLUMNNAME_Report_Btn_Cus = "Report_Btn_Cus";

	/** Set Report_Btn_Cus	  */
	public void setReport_Btn_Cus (String Report_Btn_Cus);

	/** Get Report_Btn_Cus	  */
	public String getReport_Btn_Cus();

    /** Column name Report_Btn_Detail */
    public static final String COLUMNNAME_Report_Btn_Detail = "Report_Btn_Detail";

	/** Set Report_Btn_Detail	  */
	public void setReport_Btn_Detail (String Report_Btn_Detail);

	/** Get Report_Btn_Detail	  */
	public String getReport_Btn_Detail();

    /** Column name Request_Purposes */
    public static final String COLUMNNAME_Request_Purposes = "Request_Purposes";

	/** Set Request_Purposes.
	  * Mục đích chấm điểm
	  */
	public void setRequest_Purposes (String Request_Purposes);

	/** Get Request_Purposes.
	  * Mục đích chấm điểm
	  */
	public String getRequest_Purposes();

    /** Column name Revenue */
    public static final String COLUMNNAME_Revenue = "Revenue";

	/** Set Revenue	  */
	public void setRevenue (BigDecimal Revenue);

	/** Get Revenue	  */
	public BigDecimal getRevenue();

    /** Column name Severity_Level */
    public static final String COLUMNNAME_Severity_Level = "Severity_Level";

	/** Set Severity_Level.
	  * Mức độ nghiêm trọng
	  */
	public void setSeverity_Level (BigDecimal Severity_Level);

	/** Get Severity_Level.
	  * Mức độ nghiêm trọng
	  */
	public BigDecimal getSeverity_Level();

    /** Column name StatusCIC */
    public static final String COLUMNNAME_StatusCIC = "StatusCIC";

	/** Set StatusCIC	  */
	public void setStatusCIC (String StatusCIC);

	/** Get StatusCIC	  */
	public String getStatusCIC();

    /** Column name StatusFinance */
    public static final String COLUMNNAME_StatusFinance = "StatusFinance";

	/** Set StatusFinance	  */
	public void setStatusFinance (String StatusFinance);

	/** Get StatusFinance	  */
	public String getStatusFinance();

    /** Column name StatusNonFinance */
    public static final String COLUMNNAME_StatusNonFinance = "StatusNonFinance";

	/** Set StatusNonFinance	  */
	public void setStatusNonFinance (String StatusNonFinance);

	/** Get StatusNonFinance	  */
	public String getStatusNonFinance();

    /** Column name Status_DN */
    public static final String COLUMNNAME_Status_DN = "Status_DN";

	/** Set Status_DN	  */
	public void setStatus_DN (String Status_DN);

	/** Get Status_DN	  */
	public String getStatus_DN();

    /** Column name Status_KO */
    public static final String COLUMNNAME_Status_KO = "Status_KO";

	/** Set Status_KO	  */
	public void setStatus_KO (String Status_KO);

	/** Get Status_KO	  */
	public String getStatus_KO();

    /** Column name Status_Suggest */
    public static final String COLUMNNAME_Status_Suggest = "Status_Suggest";

	/** Set Status_Suggest	  */
	public void setStatus_Suggest (String Status_Suggest);

	/** Get Status_Suggest	  */
	public String getStatus_Suggest();

    /** Column name TC_SCORE */
    public static final String COLUMNNAME_TC_SCORE = "TC_SCORE";

	/** Set TC_SCORE	  */
	public void setTC_SCORE (String TC_SCORE);

	/** Get TC_SCORE	  */
	public String getTC_SCORE();

    /** Column name TDAB_Customer_ID */
    public static final String COLUMNNAME_TDAB_Customer_ID = "TDAB_Customer_ID";

	/** Set TDAB_Customer	  */
	public void setTDAB_Customer_ID (int TDAB_Customer_ID);

	/** Get TDAB_Customer	  */
	public int getTDAB_Customer_ID();

	public I_TDAB_Customer getTDAB_Customer() throws RuntimeException;

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

    /** Column name TDAB_Customer_Profile_UU */
    public static final String COLUMNNAME_TDAB_Customer_Profile_UU = "TDAB_Customer_Profile_UU";

	/** Set TDAB_Customer_Profile_UU	  */
	public void setTDAB_Customer_Profile_UU (String TDAB_Customer_Profile_UU);

	/** Get TDAB_Customer_Profile_UU	  */
	public String getTDAB_Customer_Profile_UU();

    /** Column name TDAB_Profile_Status_ID */
    public static final String COLUMNNAME_TDAB_Profile_Status_ID = "TDAB_Profile_Status_ID";

	/** Set TDAB_Profile_Status	  */
	public void setTDAB_Profile_Status_ID (int TDAB_Profile_Status_ID);

	/** Get TDAB_Profile_Status	  */
	public int getTDAB_Profile_Status_ID();

	public I_TDAB_Profile_Status getTDAB_Profile_Status() throws RuntimeException;

    /** Column name TYPE_BCTC */
    public static final String COLUMNNAME_TYPE_BCTC = "TYPE_BCTC";

	/** Set TYPE_BCTC	  */
	public void setTYPE_BCTC (String TYPE_BCTC);

	/** Get TYPE_BCTC	  */
	public String getTYPE_BCTC();

    /** Column name TaxCode */
    public static final String COLUMNNAME_TaxCode = "TaxCode";

	/** Set TaxCode	  */
	public void setTaxCode (String TaxCode);

	/** Get TaxCode	  */
	public String getTaxCode();

    /** Column name TotalScore */
    public static final String COLUMNNAME_TotalScore = "TotalScore";

	/** Set TotalScore	  */
	public void setTotalScore (String TotalScore);

	/** Get TotalScore	  */
	public String getTotalScore();

    /** Column name TotalScoreKS */
    public static final String COLUMNNAME_TotalScoreKS = "TotalScoreKS";

	/** Set TotalScoreKS	  */
	public void setTotalScoreKS (String TotalScoreKS);

	/** Get TotalScoreKS	  */
	public String getTotalScoreKS();

    /** Column name TotalScorePD */
    public static final String COLUMNNAME_TotalScorePD = "TotalScorePD";

	/** Set TotalScorePD	  */
	public void setTotalScorePD (String TotalScorePD);

	/** Get TotalScorePD	  */
	public String getTotalScorePD();

    /** Column name Type_Business */
    public static final String COLUMNNAME_Type_Business = "Type_Business";

	/** Set Type_Business.
	  * Loại doanh nghiệp
	  */
	public void setType_Business (String Type_Business);

	/** Get Type_Business.
	  * Loại doanh nghiệp
	  */
	public String getType_Business();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name User_Appraiser_ID */
    public static final String COLUMNNAME_User_Appraiser_ID = "User_Appraiser_ID";

	/** Set User_Appraiser_ID	  */
	public void setUser_Appraiser_ID (int User_Appraiser_ID);

	/** Get User_Appraiser_ID	  */
	public int getUser_Appraiser_ID();

	public org.compiere.model.I_AD_User getUser_Appraiser() throws RuntimeException;

    /** Column name User_Approved_ID */
    public static final String COLUMNNAME_User_Approved_ID = "User_Approved_ID";

	/** Set User_Approved_ID	  */
	public void setUser_Approved_ID (int User_Approved_ID);

	/** Get User_Approved_ID	  */
	public int getUser_Approved_ID();

	public org.compiere.model.I_AD_User getUser_Approved() throws RuntimeException;

    /** Column name User_Checked_ID */
    public static final String COLUMNNAME_User_Checked_ID = "User_Checked_ID";

	/** Set User_Checked_ID	  */
	public void setUser_Checked_ID (int User_Checked_ID);

	/** Get User_Checked_ID	  */
	public int getUser_Checked_ID();

	public org.compiere.model.I_AD_User getUser_Checked() throws RuntimeException;

    /** Column name User_Handover_ID */
    public static final String COLUMNNAME_User_Handover_ID = "User_Handover_ID";

	/** Set User_Handover_ID	  */
	public void setUser_Handover_ID (int User_Handover_ID);

	/** Get User_Handover_ID	  */
	public int getUser_Handover_ID();

	public org.compiere.model.I_AD_User getUser_Handover() throws RuntimeException;

    /** Column name User_Score_ID */
    public static final String COLUMNNAME_User_Score_ID = "User_Score_ID";

	/** Set User_Score_ID	  */
	public void setUser_Score_ID (int User_Score_ID);

	/** Get User_Score_ID	  */
	public int getUser_Score_ID();

	public org.compiere.model.I_AD_User getUser_Score() throws RuntimeException;

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Value.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Value.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}
