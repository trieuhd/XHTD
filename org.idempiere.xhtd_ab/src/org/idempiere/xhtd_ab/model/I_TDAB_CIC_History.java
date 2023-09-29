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

/** Generated Interface for TDAB_CIC_History
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_CIC_History 
{

    /** TableName=TDAB_CIC_History */
    public static final String Table_Name = "TDAB_CIC_History";

    /** AD_Table_ID=1000229 */
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

    /** Column name TDAB_CIC_History_ID */
    public static final String COLUMNNAME_TDAB_CIC_History_ID = "TDAB_CIC_History_ID";

	/** Set TDAB_CIC_History	  */
	public void setTDAB_CIC_History_ID (int TDAB_CIC_History_ID);

	/** Get TDAB_CIC_History	  */
	public int getTDAB_CIC_History_ID();

    /** Column name TDAB_CIC_History_UU */
    public static final String COLUMNNAME_TDAB_CIC_History_UU = "TDAB_CIC_History_UU";

	/** Set TDAB_CIC_History_UU	  */
	public void setTDAB_CIC_History_UU (String TDAB_CIC_History_UU);

	/** Get TDAB_CIC_History_UU	  */
	public String getTDAB_CIC_History_UU();

    /** Column name TDAB_Info_CIC_ID */
    public static final String COLUMNNAME_TDAB_Info_CIC_ID = "TDAB_Info_CIC_ID";

	/** Set TDAB_Info_CIC	  */
	public void setTDAB_Info_CIC_ID (int TDAB_Info_CIC_ID);

	/** Get TDAB_Info_CIC	  */
	public int getTDAB_Info_CIC_ID();

	public I_TDAB_Info_CIC getTDAB_Info_CIC() throws RuntimeException;

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
