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

/** Generated Interface for TDAB_Financial_Non
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Financial_Non 
{

    /** TableName=TDAB_Financial_Non */
    public static final String Table_Name = "TDAB_Financial_Non";

    /** AD_Table_ID=1000164 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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

    /** Column name Average_Balance_12_Month */
    public static final String COLUMNNAME_Average_Balance_12_Month = "Average_Balance_12_Month";

	/** Set Average_Balance_12_Month.
	  * Số dư bình quân tài khoản thanh toán tại ABBANK trong vòng 12 tháng gần nhất (VNĐ)
	  */
	public void setAverage_Balance_12_Month (BigDecimal Average_Balance_12_Month);

	/** Get Average_Balance_12_Month.
	  * Số dư bình quân tài khoản thanh toán tại ABBANK trong vòng 12 tháng gần nhất (VNĐ)
	  */
	public BigDecimal getAverage_Balance_12_Month();

    /** Column name Average_Balance_12_Month_KS */
    public static final String COLUMNNAME_Average_Balance_12_Month_KS = "Average_Balance_12_Month_KS";

	/** Set Average_Balance_12_Month_KS	  */
	public void setAverage_Balance_12_Month_KS (BigDecimal Average_Balance_12_Month_KS);

	/** Get Average_Balance_12_Month_KS	  */
	public BigDecimal getAverage_Balance_12_Month_KS();

    /** Column name Average_Balance_12_Month_TD */
    public static final String COLUMNNAME_Average_Balance_12_Month_TD = "Average_Balance_12_Month_TD";

	/** Set Average_Balance_12_Month_TD	  */
	public void setAverage_Balance_12_Month_TD (BigDecimal Average_Balance_12_Month_TD);

	/** Get Average_Balance_12_Month_TD	  */
	public BigDecimal getAverage_Balance_12_Month_TD();

    /** Column name Business_Profession */
    public static final String COLUMNNAME_Business_Profession = "Business_Profession";

	/** Set Business_Profession.
	  * Ngành nghề kinh doanh
	  */
	public void setBusiness_Profession (int Business_Profession);

	/** Get Business_Profession.
	  * Ngành nghề kinh doanh
	  */
	public int getBusiness_Profession();

	public I_TDAB_Business_Areas getBusiness_Profess() throws RuntimeException;

    /** Column name Comment_On_Audit_Report */
    public static final String COLUMNNAME_Comment_On_Audit_Report = "Comment_On_Audit_Report";

	/** Set Comment_On_Audit_Report.
	  * Ý kiến trên báo cáo kiểm toán
	  */
	public void setComment_On_Audit_Report (String Comment_On_Audit_Report);

	/** Get Comment_On_Audit_Report.
	  * Ý kiến trên báo cáo kiểm toán
	  */
	public String getComment_On_Audit_Report();

    /** Column name Comment_On_Audit_Report_KS */
    public static final String COLUMNNAME_Comment_On_Audit_Report_KS = "Comment_On_Audit_Report_KS";

	/** Set Comment_On_Audit_Report_KS	  */
	public void setComment_On_Audit_Report_KS (String Comment_On_Audit_Report_KS);

	/** Get Comment_On_Audit_Report_KS	  */
	public String getComment_On_Audit_Report_KS();

    /** Column name Comment_On_Audit_Report_TD */
    public static final String COLUMNNAME_Comment_On_Audit_Report_TD = "Comment_On_Audit_Report_TD";

	/** Set Comment_On_Audit_Report_TD	  */
	public void setComment_On_Audit_Report_TD (String Comment_On_Audit_Report_TD);

	/** Get Comment_On_Audit_Report_TD	  */
	public String getComment_On_Audit_Report_TD();

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

    /** Column name Date_First_Business_Regist_KS */
    public static final String COLUMNNAME_Date_First_Business_Regist_KS = "Date_First_Business_Regist_KS";

	/** Set Date_First_Business_Regist_KS	  */
	public void setDate_First_Business_Regist_KS (Timestamp Date_First_Business_Regist_KS);

	/** Get Date_First_Business_Regist_KS	  */
	public Timestamp getDate_First_Business_Regist_KS();

    /** Column name Date_First_Business_Regist_TD */
    public static final String COLUMNNAME_Date_First_Business_Regist_TD = "Date_First_Business_Regist_TD";

	/** Set Date_First_Business_Regist_TD	  */
	public void setDate_First_Business_Regist_TD (Timestamp Date_First_Business_Regist_TD);

	/** Get Date_First_Business_Regist_TD	  */
	public Timestamp getDate_First_Business_Regist_TD();

    /** Column name Financial_Statements_Audit_KS */
    public static final String COLUMNNAME_Financial_Statements_Audit_KS = "Financial_Statements_Audit_KS";

	/** Set Financial_Statements_Audit_KS	  */
	public void setFinancial_Statements_Audit_KS (String Financial_Statements_Audit_KS);

	/** Get Financial_Statements_Audit_KS	  */
	public String getFinancial_Statements_Audit_KS();

    /** Column name Financial_Statements_Audit_TD */
    public static final String COLUMNNAME_Financial_Statements_Audit_TD = "Financial_Statements_Audit_TD";

	/** Set Financial_Statements_Audit_TD	  */
	public void setFinancial_Statements_Audit_TD (String Financial_Statements_Audit_TD);

	/** Get Financial_Statements_Audit_TD	  */
	public String getFinancial_Statements_Audit_TD();

    /** Column name Financial_Statements_Audited */
    public static final String COLUMNNAME_Financial_Statements_Audited = "Financial_Statements_Audited";

	/** Set Financial_Statements_Audited.
	  * BCTC có được kiểm toán không?
	  */
	public void setFinancial_Statements_Audited (String Financial_Statements_Audited);

	/** Get Financial_Statements_Audited.
	  * BCTC có được kiểm toán không?
	  */
	public String getFinancial_Statements_Audited();

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

    /** Column name Number_Of_Work */
    public static final String COLUMNNAME_Number_Of_Work = "Number_Of_Work";

	/** Set Number_Of_Work.
	  * Số lượng lao động
	  */
	public void setNumber_Of_Work (BigDecimal Number_Of_Work);

	/** Get Number_Of_Work.
	  * Số lượng lao động
	  */
	public BigDecimal getNumber_Of_Work();

    /** Column name Owner_Location_KS */
    public static final String COLUMNNAME_Owner_Location_KS = "Owner_Location_KS";

	/** Set Owner_Location_KS	  */
	public void setOwner_Location_KS (String Owner_Location_KS);

	/** Get Owner_Location_KS	  */
	public String getOwner_Location_KS();

    /** Column name Owner_Location_TD */
    public static final String COLUMNNAME_Owner_Location_TD = "Owner_Location_TD";

	/** Set Owner_Location_TD	  */
	public void setOwner_Location_TD (String Owner_Location_TD);

	/** Get Owner_Location_TD	  */
	public String getOwner_Location_TD();

    /** Column name Ownership_Location_Business */
    public static final String COLUMNNAME_Ownership_Location_Business = "Ownership_Location_Business";

	/** Set Ownership_Location_Business.
	  * Quyền sở hữu địa điểm kinh doanh
	  */
	public void setOwnership_Location_Business (String Ownership_Location_Business);

	/** Get Ownership_Location_Business.
	  * Quyền sở hữu địa điểm kinh doanh
	  */
	public String getOwnership_Location_Business();

    /** Column name ROCE_Index */
    public static final String COLUMNNAME_ROCE_Index = "ROCE_Index";

	/** Set ROCE_Index.
	  * Chỉ số ROCE của ngành
	  */
	public void setROCE_Index (String ROCE_Index);

	/** Get ROCE_Index.
	  * Chỉ số ROCE của ngành
	  */
	public String getROCE_Index();

    /** Column name ROCE_Index_KS */
    public static final String COLUMNNAME_ROCE_Index_KS = "ROCE_Index_KS";

	/** Set ROCE_Index_KS	  */
	public void setROCE_Index_KS (BigDecimal ROCE_Index_KS);

	/** Get ROCE_Index_KS	  */
	public BigDecimal getROCE_Index_KS();

    /** Column name ROCE_Index_TD */
    public static final String COLUMNNAME_ROCE_Index_TD = "ROCE_Index_TD";

	/** Set ROCE_Index_TD	  */
	public void setROCE_Index_TD (String ROCE_Index_TD);

	/** Get ROCE_Index_TD	  */
	public String getROCE_Index_TD();

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

    /** Column name TDAB_Business_Areas_ID */
    public static final String COLUMNNAME_TDAB_Business_Areas_ID = "TDAB_Business_Areas_ID";

	/** Set TDAB_Business_Areas	  */
	public void setTDAB_Business_Areas_ID (int TDAB_Business_Areas_ID);

	/** Get TDAB_Business_Areas	  */
	public int getTDAB_Business_Areas_ID();

	public I_TDAB_Business_Areas getTDAB_Business_Areas() throws RuntimeException;

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

    /** Column name TDAB_Customer_Score_ID */
    public static final String COLUMNNAME_TDAB_Customer_Score_ID = "TDAB_Customer_Score_ID";

	/** Set TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID);

	/** Get TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID();

    /** Column name TDAB_Financial_Non_ID */
    public static final String COLUMNNAME_TDAB_Financial_Non_ID = "TDAB_Financial_Non_ID";

	/** Set TDAB_Financial_Non	  */
	public void setTDAB_Financial_Non_ID (int TDAB_Financial_Non_ID);

	/** Get TDAB_Financial_Non	  */
	public int getTDAB_Financial_Non_ID();

    /** Column name TDAB_Financial_Non_UU */
    public static final String COLUMNNAME_TDAB_Financial_Non_UU = "TDAB_Financial_Non_UU";

	/** Set TDAB_Financial_Non_UU	  */
	public void setTDAB_Financial_Non_UU (String TDAB_Financial_Non_UU);

	/** Get TDAB_Financial_Non_UU	  */
	public String getTDAB_Financial_Non_UU();

    /** Column name TDAB_List_Business_ID */
    public static final String COLUMNNAME_TDAB_List_Business_ID = "TDAB_List_Business_ID";

	/** Set TDAB_List_Business	  */
	public void setTDAB_List_Business_ID (int TDAB_List_Business_ID);

	/** Get TDAB_List_Business	  */
	public int getTDAB_List_Business_ID();

	public I_TDAB_Business_Areas getTDAB_List_Business() throws RuntimeException;

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

    /** Column name Years_Experience_CEO */
    public static final String COLUMNNAME_Years_Experience_CEO = "Years_Experience_CEO";

	/** Set Years_Experience_CEO.
	  * Số năm kinh nghiệm của người điều hành chính
	  */
	public void setYears_Experience_CEO (BigDecimal Years_Experience_CEO);

	/** Get Years_Experience_CEO.
	  * Số năm kinh nghiệm của người điều hành chính
	  */
	public BigDecimal getYears_Experience_CEO();

    /** Column name Years_Experience_CEO_KS */
    public static final String COLUMNNAME_Years_Experience_CEO_KS = "Years_Experience_CEO_KS";

	/** Set Years_Experience_CEO_KS	  */
	public void setYears_Experience_CEO_KS (BigDecimal Years_Experience_CEO_KS);

	/** Get Years_Experience_CEO_KS	  */
	public BigDecimal getYears_Experience_CEO_KS();

    /** Column name Years_Experience_CEO_TD */
    public static final String COLUMNNAME_Years_Experience_CEO_TD = "Years_Experience_CEO_TD";

	/** Set Years_Experience_CEO_TD	  */
	public void setYears_Experience_CEO_TD (BigDecimal Years_Experience_CEO_TD);

	/** Get Years_Experience_CEO_TD	  */
	public BigDecimal getYears_Experience_CEO_TD();

    /** Column name Years_Operation */
    public static final String COLUMNNAME_Years_Operation = "Years_Operation";

	/** Set Years_Operation.
	  * Số năm hoạt động (tính từ khi được cấp giấy phép ĐKKD)
	  */
	public void setYears_Operation (BigDecimal Years_Operation);

	/** Get Years_Operation.
	  * Số năm hoạt động (tính từ khi được cấp giấy phép ĐKKD)
	  */
	public BigDecimal getYears_Operation();

    /** Column name Years_Operation_KS */
    public static final String COLUMNNAME_Years_Operation_KS = "Years_Operation_KS";

	/** Set Years_Operation_KS	  */
	public void setYears_Operation_KS (BigDecimal Years_Operation_KS);

	/** Get Years_Operation_KS	  */
	public BigDecimal getYears_Operation_KS();

    /** Column name Years_Operation_TD */
    public static final String COLUMNNAME_Years_Operation_TD = "Years_Operation_TD";

	/** Set Years_Operation_TD	  */
	public void setYears_Operation_TD (BigDecimal Years_Operation_TD);

	/** Get Years_Operation_TD	  */
	public BigDecimal getYears_Operation_TD();
}
