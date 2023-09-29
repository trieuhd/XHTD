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

/** Generated Interface for TDAB_SET_OF_STANDARD
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_SET_OF_STANDARD 
{

    /** TableName=TDAB_SET_OF_STANDARD */
    public static final String Table_Name = "TDAB_SET_OF_STANDARD";

    /** AD_Table_ID=1000138 */
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

    /** Column name ActionAp */
    public static final String COLUMNNAME_ActionAp = "ActionAp";

	/** Set ActionAp	  */
	public void setActionAp (String ActionAp);

	/** Get ActionAp	  */
	public String getActionAp();

    /** Column name ActionCd */
    public static final String COLUMNNAME_ActionCd = "ActionCd";

	/** Set ActionCd	  */
	public void setActionCd (String ActionCd);

	/** Get ActionCd	  */
	public String getActionCd();

    /** Column name ActionKs */
    public static final String COLUMNNAME_ActionKs = "ActionKs";

	/** Set ActionKs	  */
	public void setActionKs (String ActionKs);

	/** Get ActionKs	  */
	public String getActionKs();

    /** Column name ActionUnlock */
    public static final String COLUMNNAME_ActionUnlock = "ActionUnlock";

	/** Set ActionUnlock	  */
	public void setActionUnlock (String ActionUnlock);

	/** Get ActionUnlock	  */
	public String getActionUnlock();

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

    /** Column name EXPIRED_DATE */
    public static final String COLUMNNAME_EXPIRED_DATE = "EXPIRED_DATE";

	/** Set EXPIRED_DATE	  */
	public void setEXPIRED_DATE (Timestamp EXPIRED_DATE);

	/** Get EXPIRED_DATE	  */
	public Timestamp getEXPIRED_DATE();

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

    /** Column name StartDate */
    public static final String COLUMNNAME_StartDate = "StartDate";

	/** Set Start Date.
	  * First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate);

	/** Get Start Date.
	  * First effective day (inclusive)
	  */
	public Timestamp getStartDate();

    /** Column name TDAB_SET_OF_STANDARD_ID */
    public static final String COLUMNNAME_TDAB_SET_OF_STANDARD_ID = "TDAB_SET_OF_STANDARD_ID";

	/** Set TDAB_SET_OF_STANDARD	  */
	public void setTDAB_SET_OF_STANDARD_ID (int TDAB_SET_OF_STANDARD_ID);

	/** Get TDAB_SET_OF_STANDARD	  */
	public int getTDAB_SET_OF_STANDARD_ID();

    /** Column name TDAB_SET_OF_STANDARD_UU */
    public static final String COLUMNNAME_TDAB_SET_OF_STANDARD_UU = "TDAB_SET_OF_STANDARD_UU";

	/** Set TDAB_SET_OF_STANDARD_UU	  */
	public void setTDAB_SET_OF_STANDARD_UU (String TDAB_SET_OF_STANDARD_UU);

	/** Get TDAB_SET_OF_STANDARD_UU	  */
	public String getTDAB_SET_OF_STANDARD_UU();

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
