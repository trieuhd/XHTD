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

/** Generated Interface for TDAB_Info_CIC
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Info_CIC 
{

    /** TableName=TDAB_Info_CIC */
    public static final String Table_Name = "TDAB_Info_CIC";

    /** AD_Table_ID=1000165 */
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

    /** Column name Debt_345_Arising_Date */
    public static final String COLUMNNAME_Debt_345_Arising_Date = "Debt_345_Arising_Date";

	/** Set Debt_345_Arising_Date.
	  * Số lượng khoản nợ nhóm 3, 4, 5 tại ngày phát sinh
	  */
	public void setDebt_345_Arising_Date (BigDecimal Debt_345_Arising_Date);

	/** Get Debt_345_Arising_Date.
	  * Số lượng khoản nợ nhóm 3, 4, 5 tại ngày phát sinh
	  */
	public BigDecimal getDebt_345_Arising_Date();

    /** Column name Highest_Debt_12m */
    public static final String COLUMNNAME_Highest_Debt_12m = "Highest_Debt_12m";

	/** Set Highest_Debt_12m.
	  * Nhóm nợ cao nhất trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setHighest_Debt_12m (String Highest_Debt_12m);

	/** Get Highest_Debt_12m.
	  * Nhóm nợ cao nhất trong vòng 12 tháng trước ngày phát sinh
	  */
	public String getHighest_Debt_12m();

    /** Column name Highest_Debt_Arising_Date */
    public static final String COLUMNNAME_Highest_Debt_Arising_Date = "Highest_Debt_Arising_Date";

	/** Set Highest_Debt_Arising_Date.
	  * Nhóm nợ cao nhất tại ngày phát sinh
	  */
	public void setHighest_Debt_Arising_Date (String Highest_Debt_Arising_Date);

	/** Get Highest_Debt_Arising_Date.
	  * Nhóm nợ cao nhất tại ngày phát sinh
	  */
	public String getHighest_Debt_Arising_Date();

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

    /** Column name Number_CIC_Request_12m */
    public static final String COLUMNNAME_Number_CIC_Request_12m = "Number_CIC_Request_12m";

	/** Set Number_CIC_Request_12m.
	  * Số lần hỏi tin CIC trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setNumber_CIC_Request_12m (BigDecimal Number_CIC_Request_12m);

	/** Get Number_CIC_Request_12m.
	  * Số lần hỏi tin CIC trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_CIC_Request_12m();

    /** Column name Number_CIC_Request_12m_KS */
    public static final String COLUMNNAME_Number_CIC_Request_12m_KS = "Number_CIC_Request_12m_KS";

	/** Set Number_CIC_Request_12m_KS	  */
	public void setNumber_CIC_Request_12m_KS (BigDecimal Number_CIC_Request_12m_KS);

	/** Get Number_CIC_Request_12m_KS	  */
	public BigDecimal getNumber_CIC_Request_12m_KS();

    /** Column name Number_CIC_Request_12m_TD */
    public static final String COLUMNNAME_Number_CIC_Request_12m_TD = "Number_CIC_Request_12m_TD";

	/** Set Number_CIC_Request_12m_TD	  */
	public void setNumber_CIC_Request_12m_TD (BigDecimal Number_CIC_Request_12m_TD);

	/** Get Number_CIC_Request_12m_TD	  */
	public BigDecimal getNumber_CIC_Request_12m_TD();

    /** Column name Number_Debt_345_12m */
    public static final String COLUMNNAME_Number_Debt_345_12m = "Number_Debt_345_12m";

	/** Set Number_Debt_345_12m.
	  * Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setNumber_Debt_345_12m (BigDecimal Number_Debt_345_12m);

	/** Get Number_Debt_345_12m.
	  * Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_Debt_345_12m();

    /** Column name Number_Debt_345_24m */
    public static final String COLUMNNAME_Number_Debt_345_24m = "Number_Debt_345_24m";

	/** Set Number_Debt_345_24m.
	  * Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public void setNumber_Debt_345_24m (BigDecimal Number_Debt_345_24m);

	/** Get Number_Debt_345_24m.
	  * Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_Debt_345_24m();

    /** Column name Number_Month_Expired_Debit_345 */
    public static final String COLUMNNAME_Number_Month_Expired_Debit_345 = "Number_Month_Expired_Debit_345";

	/** Set Number_Month_Expired_Debit_345.
	  * Số tháng tính từ lúc kết thúc trạng thái nợ nhóm 3, 4, 5 tới ngày phát sinh
	  */
	public void setNumber_Month_Expired_Debit_345 (BigDecimal Number_Month_Expired_Debit_345);

	/** Get Number_Month_Expired_Debit_345.
	  * Số tháng tính từ lúc kết thúc trạng thái nợ nhóm 3, 4, 5 tới ngày phát sinh
	  */
	public BigDecimal getNumber_Month_Expired_Debit_345();

    /** Column name Number_loan_2_12m */
    public static final String COLUMNNAME_Number_loan_2_12m = "Number_loan_2_12m";

	/** Set Number_loan_2_12m.
	  * Số lần rơi vào nợ nhóm 2 trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setNumber_loan_2_12m (BigDecimal Number_loan_2_12m);

	/** Get Number_loan_2_12m.
	  * Số lần rơi vào nợ nhóm 2 trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_loan_2_12m();

    /** Column name Number_loan_2_12m_KS */
    public static final String COLUMNNAME_Number_loan_2_12m_KS = "Number_loan_2_12m_KS";

	/** Set Number_loan_2_12m_KS	  */
	public void setNumber_loan_2_12m_KS (BigDecimal Number_loan_2_12m_KS);

	/** Get Number_loan_2_12m_KS	  */
	public BigDecimal getNumber_loan_2_12m_KS();

    /** Column name Number_loan_2_12m_TD */
    public static final String COLUMNNAME_Number_loan_2_12m_TD = "Number_loan_2_12m_TD";

	/** Set Number_loan_2_12m_TD	  */
	public void setNumber_loan_2_12m_TD (BigDecimal Number_loan_2_12m_TD);

	/** Get Number_loan_2_12m_TD	  */
	public BigDecimal getNumber_loan_2_12m_TD();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Info_CIC_ID */
    public static final String COLUMNNAME_TDAB_Info_CIC_ID = "TDAB_Info_CIC_ID";

	/** Set TDAB_Info_CIC	  */
	public void setTDAB_Info_CIC_ID (int TDAB_Info_CIC_ID);

	/** Get TDAB_Info_CIC	  */
	public int getTDAB_Info_CIC_ID();

    /** Column name TDAB_Info_CIC_UU */
    public static final String COLUMNNAME_TDAB_Info_CIC_UU = "TDAB_Info_CIC_UU";

	/** Set TDAB_Info_CIC_UU	  */
	public void setTDAB_Info_CIC_UU (String TDAB_Info_CIC_UU);

	/** Get TDAB_Info_CIC_UU	  */
	public String getTDAB_Info_CIC_UU();

    /** Column name Total_Loan_345_12m_prior_arisi */
    public static final String COLUMNNAME_Total_Loan_345_12m_prior_arisi = "Total_Loan_345_12m_prior_arisi";

	/** Set Total_Loan_345_12m_prior_arisi.
	  * Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setTotal_Loan_345_12m_prior_arisi (BigDecimal Total_Loan_345_12m_prior_arisi);

	/** Get Total_Loan_345_12m_prior_arisi.
	  * Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getTotal_Loan_345_12m_prior_arisi();

    /** Column name Total_Loan_345_24m_prior_arisi */
    public static final String COLUMNNAME_Total_Loan_345_24m_prior_arisi = "Total_Loan_345_24m_prior_arisi";

	/** Set Total_Loan_345_24m_prior_arisi.
	  * Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public void setTotal_Loan_345_24m_prior_arisi (BigDecimal Total_Loan_345_24m_prior_arisi);

	/** Get Total_Loan_345_24m_prior_arisi.
	  * Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public BigDecimal getTotal_Loan_345_24m_prior_arisi();

    /** Column name Total_Loan_Arising_Date */
    public static final String COLUMNNAME_Total_Loan_Arising_Date = "Total_Loan_Arising_Date";

	/** Set Total_Loan_Arising_Date.
	  * Tổng dư nợ tại ngày phát sinh (ĐVT: VND)
	  */
	public void setTotal_Loan_Arising_Date (BigDecimal Total_Loan_Arising_Date);

	/** Get Total_Loan_Arising_Date.
	  * Tổng dư nợ tại ngày phát sinh (ĐVT: VND)
	  */
	public BigDecimal getTotal_Loan_Arising_Date();

    /** Column name Total_Loan_Arising_Date_KS */
    public static final String COLUMNNAME_Total_Loan_Arising_Date_KS = "Total_Loan_Arising_Date_KS";

	/** Set Total_Loan_Arising_Date_KS	  */
	public void setTotal_Loan_Arising_Date_KS (BigDecimal Total_Loan_Arising_Date_KS);

	/** Get Total_Loan_Arising_Date_KS	  */
	public BigDecimal getTotal_Loan_Arising_Date_KS();

    /** Column name Total_Loan_Arising_Date_TD */
    public static final String COLUMNNAME_Total_Loan_Arising_Date_TD = "Total_Loan_Arising_Date_TD";

	/** Set Total_Loan_Arising_Date_TD	  */
	public void setTotal_Loan_Arising_Date_TD (BigDecimal Total_Loan_Arising_Date_TD);

	/** Get Total_Loan_Arising_Date_TD	  */
	public BigDecimal getTotal_Loan_Arising_Date_TD();

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
}
