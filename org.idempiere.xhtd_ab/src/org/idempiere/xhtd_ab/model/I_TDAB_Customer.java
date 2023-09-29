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

/** Generated Interface for TDAB_Customer
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Customer 
{

    /** TableName=TDAB_Customer */
    public static final String Table_Name = "TDAB_Customer";

    /** AD_Table_ID=1000158 */
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

    /** Column name AD_Org_ID_Hander */
    public static final String COLUMNNAME_AD_Org_ID_Hander = "AD_Org_ID_Hander";

	/** Set AD_Org_ID_Hander	  */
	public void setAD_Org_ID_Hander (int AD_Org_ID_Hander);

	/** Get AD_Org_ID_Hander	  */
	public int getAD_Org_ID_Hander();

    /** Column name ActionChangeUser */
    public static final String COLUMNNAME_ActionChangeUser = "ActionChangeUser";

	/** Set ActionChangeUser	  */
	public void setActionChangeUser (String ActionChangeUser);

	/** Get ActionChangeUser	  */
	public String getActionChangeUser();

    /** Column name ActionUpdate */
    public static final String COLUMNNAME_ActionUpdate = "ActionUpdate";

	/** Set ActionUpdate	  */
	public void setActionUpdate (String ActionUpdate);

	/** Get ActionUpdate	  */
	public String getActionUpdate();

    /** Column name Business_Unit */
    public static final String COLUMNNAME_Business_Unit = "Business_Unit";

	/** Set Business_Unit	  */
	public void setBusiness_Unit (String Business_Unit);

	/** Get Business_Unit	  */
	public String getBusiness_Unit();

    /** Column name CIC_ID */
    public static final String COLUMNNAME_CIC_ID = "CIC_ID";

	/** Set CIC_ID	  */
	public void setCIC_ID (String CIC_ID);

	/** Get CIC_ID	  */
	public String getCIC_ID();

    /** Column name Check_T24 */
    public static final String COLUMNNAME_Check_T24 = "Check_T24";

	/** Set Check_T24.
	  * Check_T24
	  */
	public void setCheck_T24 (String Check_T24);

	/** Get Check_T24.
	  * Check_T24
	  */
	public String getCheck_T24();

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

    /** Column name DateScore */
    public static final String COLUMNNAME_DateScore = "DateScore";

	/** Set DateScore	  */
	public void setDateScore (Timestamp DateScore);

	/** Get DateScore	  */
	public Timestamp getDateScore();

    /** Column name Date_Loan */
    public static final String COLUMNNAME_Date_Loan = "Date_Loan";

	/** Set Date_Loan	  */
	public void setDate_Loan (Timestamp Date_Loan);

	/** Get Date_Loan	  */
	public Timestamp getDate_Loan();

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

    /** Column name LockProfile */
    public static final String COLUMNNAME_LockProfile = "LockProfile";

	/** Set LockProfile	  */
	public void setLockProfile (String LockProfile);

	/** Get LockProfile	  */
	public String getLockProfile();

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

    /** Column name New */
    public static final String COLUMNNAME_New = "New";

	/** Set New	  */
	public void setNew (String New);

	/** Get New	  */
	public String getNew();

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

    /** Column name Note_HandOver */
    public static final String COLUMNNAME_Note_HandOver = "Note_HandOver";

	/** Set Note_HandOver	  */
	public void setNote_HandOver (String Note_HandOver);

	/** Get Note_HandOver	  */
	public String getNote_HandOver();

    /** Column name NumberBusiness */
    public static final String COLUMNNAME_NumberBusiness = "NumberBusiness";

	/** Set NumberBusiness	  */
	public void setNumberBusiness (String NumberBusiness);

	/** Get NumberBusiness	  */
	public String getNumberBusiness();

    /** Column name Revenue */
    public static final String COLUMNNAME_Revenue = "Revenue";

	/** Set Revenue	  */
	public void setRevenue (BigDecimal Revenue);

	/** Get Revenue	  */
	public BigDecimal getRevenue();

    /** Column name Status */
    public static final String COLUMNNAME_Status = "Status";

	/** Set Status.
	  * Status of the currently running check
	  */
	public void setStatus (String Status);

	/** Get Status.
	  * Status of the currently running check
	  */
	public String getStatus();

    /** Column name TDAB_Customer_ID */
    public static final String COLUMNNAME_TDAB_Customer_ID = "TDAB_Customer_ID";

	/** Set TDAB_Customer	  */
	public void setTDAB_Customer_ID (int TDAB_Customer_ID);

	/** Get TDAB_Customer	  */
	public int getTDAB_Customer_ID();

    /** Column name TDAB_Customer_UU */
    public static final String COLUMNNAME_TDAB_Customer_UU = "TDAB_Customer_UU";

	/** Set TDAB_Customer_UU	  */
	public void setTDAB_Customer_UU (String TDAB_Customer_UU);

	/** Get TDAB_Customer_UU	  */
	public String getTDAB_Customer_UU();

    /** Column name TaxCode */
    public static final String COLUMNNAME_TaxCode = "TaxCode";

	/** Set TaxCode	  */
	public void setTaxCode (String TaxCode);

	/** Get TaxCode	  */
	public String getTaxCode();

    /** Column name UnLockProfile */
    public static final String COLUMNNAME_UnLockProfile = "UnLockProfile";

	/** Set UnLockProfile	  */
	public void setUnLockProfile (String UnLockProfile);

	/** Get UnLockProfile	  */
	public String getUnLockProfile();

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
