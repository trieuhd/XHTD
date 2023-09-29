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

/** Generated Interface for TDAB_User_Org
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_User_Org 
{

    /** TableName=TDAB_User_Org */
    public static final String Table_Name = "TDAB_User_Org";

    /** AD_Table_ID=1000248 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

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

    /** Column name IsParent */
    public static final String COLUMNNAME_IsParent = "IsParent";

	/** Set Parent link column.
	  * This column is a link to the parent table (e.g. header from lines) - incl. Association key columns
	  */
	public void setIsParent (boolean IsParent);

	/** Get Parent link column.
	  * This column is a link to the parent table (e.g. header from lines) - incl. Association key columns
	  */
	public boolean isParent();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name ReadAndWrite */
    public static final String COLUMNNAME_ReadAndWrite = "ReadAndWrite";

	/** Set ReadAndWrite	  */
	public void setReadAndWrite (boolean ReadAndWrite);

	/** Get ReadAndWrite	  */
	public boolean isReadAndWrite();

    /** Column name TDAB_ORG_DETAIL_ID */
    public static final String COLUMNNAME_TDAB_ORG_DETAIL_ID = "TDAB_ORG_DETAIL_ID";

	/** Set TDAB_ORG_DETAIL	  */
	public void setTDAB_ORG_DETAIL_ID (int TDAB_ORG_DETAIL_ID);

	/** Get TDAB_ORG_DETAIL	  */
	public int getTDAB_ORG_DETAIL_ID();

	public I_TDAB_ORG_DETAIL getTDAB_ORG_DETAIL() throws RuntimeException;

    /** Column name TDAB_User_Org_ID */
    public static final String COLUMNNAME_TDAB_User_Org_ID = "TDAB_User_Org_ID";

	/** Set TDAB_User_Org	  */
	public void setTDAB_User_Org_ID (int TDAB_User_Org_ID);

	/** Get TDAB_User_Org	  */
	public int getTDAB_User_Org_ID();

    /** Column name TDAB_User_Org_UU */
    public static final String COLUMNNAME_TDAB_User_Org_UU = "TDAB_User_Org_UU";

	/** Set TDAB_User_Org_UU	  */
	public void setTDAB_User_Org_UU (String TDAB_User_Org_UU);

	/** Get TDAB_User_Org_UU	  */
	public String getTDAB_User_Org_UU();

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
