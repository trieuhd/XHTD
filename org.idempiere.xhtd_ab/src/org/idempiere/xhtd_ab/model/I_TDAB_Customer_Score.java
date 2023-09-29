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

/** Generated Interface for TDAB_Customer_Score
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Customer_Score 
{

    /** TableName=TDAB_Customer_Score */
    public static final String Table_Name = "TDAB_Customer_Score";

    /** AD_Table_ID=1000173 */
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

    /** Column name ActionCd */
    public static final String COLUMNNAME_ActionCd = "ActionCd";

	/** Set ActionCd	  */
	public void setActionCd (String ActionCd);

	/** Get ActionCd	  */
	public String getActionCd();

    /** Column name ActionDel */
    public static final String COLUMNNAME_ActionDel = "ActionDel";

	/** Set ActionDel	  */
	public void setActionDel (String ActionDel);

	/** Get ActionDel	  */
	public String getActionDel();

    /** Column name ActionDetalScore */
    public static final String COLUMNNAME_ActionDetalScore = "ActionDetalScore";

	/** Set ActionDetalScore	  */
	public void setActionDetalScore (String ActionDetalScore);

	/** Get ActionDetalScore	  */
	public String getActionDetalScore();

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

    /** Column name Date_Approved */
    public static final String COLUMNNAME_Date_Approved = "Date_Approved";

	/** Set Date_Approved	  */
	public void setDate_Approved (Timestamp Date_Approved);

	/** Get Date_Approved	  */
	public Timestamp getDate_Approved();

    /** Column name Date_Checked */
    public static final String COLUMNNAME_Date_Checked = "Date_Checked";

	/** Set Date_Checked	  */
	public void setDate_Checked (Timestamp Date_Checked);

	/** Get Date_Checked	  */
	public Timestamp getDate_Checked();

    /** Column name DeleteStatus */
    public static final String COLUMNNAME_DeleteStatus = "DeleteStatus";

	/** Set DeleteStatus	  */
	public void setDeleteStatus (String DeleteStatus);

	/** Get DeleteStatus	  */
	public String getDeleteStatus();

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

    /** Column name DocumentNumber */
    public static final String COLUMNNAME_DocumentNumber = "DocumentNumber";

	/** Set DocumentNumber	  */
	public void setDocumentNumber (String DocumentNumber);

	/** Get DocumentNumber	  */
	public String getDocumentNumber();

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

    /** Column name StatusProfile */
    public static final String COLUMNNAME_StatusProfile = "StatusProfile";

	/** Set StatusProfile	  */
	public void setStatusProfile (String StatusProfile);

	/** Get StatusProfile	  */
	public String getStatusProfile();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Customer_Score_ID */
    public static final String COLUMNNAME_TDAB_Customer_Score_ID = "TDAB_Customer_Score_ID";

	/** Set TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID);

	/** Get TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID();

    /** Column name TDAB_Customer_Score_UU */
    public static final String COLUMNNAME_TDAB_Customer_Score_UU = "TDAB_Customer_Score_UU";

	/** Set TDAB_Customer_Score_UU	  */
	public void setTDAB_Customer_Score_UU (String TDAB_Customer_Score_UU);

	/** Get TDAB_Customer_Score_UU	  */
	public String getTDAB_Customer_Score_UU();

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
