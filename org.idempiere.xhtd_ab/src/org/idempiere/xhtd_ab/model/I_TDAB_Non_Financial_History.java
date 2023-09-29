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

/** Generated Interface for TDAB_Non_Financial_History
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Non_Financial_History 
{

    /** TableName=TDAB_Non_Financial_History */
    public static final String Table_Name = "TDAB_Non_Financial_History";

    /** AD_Table_ID=1000228 */
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

    /** Column name Business_Profession_His */
    public static final String COLUMNNAME_Business_Profession_His = "Business_Profession_His";

	/** Set Business_Profession_His	  */
	public void setBusiness_Profession_His (String Business_Profession_His);

	/** Get Business_Profession_His	  */
	public String getBusiness_Profession_His();

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

    /** Column name HisCreatedAt */
    public static final String COLUMNNAME_HisCreatedAt = "HisCreatedAt";

	/** Set HisCreatedAt	  */
	public void setHisCreatedAt (Timestamp HisCreatedAt);

	/** Get HisCreatedAt	  */
	public Timestamp getHisCreatedAt();

    /** Column name HisCreatedBy */
    public static final String COLUMNNAME_HisCreatedBy = "HisCreatedBy";

	/** Set HisCreatedBy	  */
	public void setHisCreatedBy (String HisCreatedBy);

	/** Get HisCreatedBy	  */
	public String getHisCreatedBy();

    /** Column name HisUpdateAt */
    public static final String COLUMNNAME_HisUpdateAt = "HisUpdateAt";

	/** Set HisUpdateAt	  */
	public void setHisUpdateAt (Timestamp HisUpdateAt);

	/** Get HisUpdateAt	  */
	public Timestamp getHisUpdateAt();

    /** Column name HisUpdateBy */
    public static final String COLUMNNAME_HisUpdateBy = "HisUpdateBy";

	/** Set HisUpdateBy	  */
	public void setHisUpdateBy (String HisUpdateBy);

	/** Get HisUpdateBy	  */
	public String getHisUpdateBy();

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

    /** Column name TDAB_Financial_Non_ID */
    public static final String COLUMNNAME_TDAB_Financial_Non_ID = "TDAB_Financial_Non_ID";

	/** Set TDAB_Financial_Non	  */
	public void setTDAB_Financial_Non_ID (int TDAB_Financial_Non_ID);

	/** Get TDAB_Financial_Non	  */
	public int getTDAB_Financial_Non_ID();

	public I_TDAB_Financial_Non getTDAB_Financial_Non() throws RuntimeException;

    /** Column name TDAB_Non_Financial_History_ID */
    public static final String COLUMNNAME_TDAB_Non_Financial_History_ID = "TDAB_Non_Financial_History_ID";

	/** Set TDAB_Non_Financial_History	  */
	public void setTDAB_Non_Financial_History_ID (int TDAB_Non_Financial_History_ID);

	/** Get TDAB_Non_Financial_History	  */
	public int getTDAB_Non_Financial_History_ID();

    /** Column name TDAB_Non_Financial_History_UU */
    public static final String COLUMNNAME_TDAB_Non_Financial_History_UU = "TDAB_Non_Financial_History_UU";

	/** Set TDAB_Non_Financial_History_UU	  */
	public void setTDAB_Non_Financial_History_UU (String TDAB_Non_Financial_History_UU);

	/** Get TDAB_Non_Financial_History_UU	  */
	public String getTDAB_Non_Financial_History_UU();

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
}
