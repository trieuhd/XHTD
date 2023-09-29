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

/** Generated Interface for TDAB_Direct_KO_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Direct_KO_Info 
{

    /** TableName=TDAB_Direct_KO_Info */
    public static final String Table_Name = "TDAB_Direct_KO_Info";

    /** AD_Table_ID=1000239 */
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

    /** Column name Bigger_KO */
    public static final String COLUMNNAME_Bigger_KO = "Bigger_KO";

	/** Set Bigger_KO	  */
	public void setBigger_KO (BigDecimal Bigger_KO);

	/** Get Bigger_KO	  */
	public BigDecimal getBigger_KO();

    /** Column name Code */
    public static final String COLUMNNAME_Code = "Code";

	/** Set Validation code.
	  * Validation Code
	  */
	public void setCode (String Code);

	/** Get Validation code.
	  * Validation Code
	  */
	public String getCode();

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

    /** Column name Smaller_KO */
    public static final String COLUMNNAME_Smaller_KO = "Smaller_KO";

	/** Set Smaller_KO	  */
	public void setSmaller_KO (BigDecimal Smaller_KO);

	/** Get Smaller_KO	  */
	public BigDecimal getSmaller_KO();

    /** Column name TDAB_Direct_KO_Info_ID */
    public static final String COLUMNNAME_TDAB_Direct_KO_Info_ID = "TDAB_Direct_KO_Info_ID";

	/** Set TDAB_Direct_KO_Info	  */
	public void setTDAB_Direct_KO_Info_ID (int TDAB_Direct_KO_Info_ID);

	/** Get TDAB_Direct_KO_Info	  */
	public int getTDAB_Direct_KO_Info_ID();

    /** Column name TDAB_Direct_KO_Info_UU */
    public static final String COLUMNNAME_TDAB_Direct_KO_Info_UU = "TDAB_Direct_KO_Info_UU";

	/** Set TDAB_Direct_KO_Info_UU	  */
	public void setTDAB_Direct_KO_Info_UU (String TDAB_Direct_KO_Info_UU);

	/** Get TDAB_Direct_KO_Info_UU	  */
	public String getTDAB_Direct_KO_Info_UU();

    /** Column name TDAB_Direct_KO_QL_ID */
    public static final String COLUMNNAME_TDAB_Direct_KO_QL_ID = "TDAB_Direct_KO_QL_ID";

	/** Set TDAB_Direct_KO_QL	  */
	public void setTDAB_Direct_KO_QL_ID (int TDAB_Direct_KO_QL_ID);

	/** Get TDAB_Direct_KO_QL	  */
	public int getTDAB_Direct_KO_QL_ID();

    /** Column name Type_Answer */
    public static final String COLUMNNAME_Type_Answer = "Type_Answer";

	/** Set Type_Answer	  */
	public void setType_Answer (String Type_Answer);

	/** Get Type_Answer	  */
	public String getType_Answer();

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

    /** Column name Warning_Question_Level */
    public static final String COLUMNNAME_Warning_Question_Level = "Warning_Question_Level";

	/** Set Warning_Question_Level.
	  * Mức độ
	  */
	public void setWarning_Question_Level (String Warning_Question_Level);

	/** Get Warning_Question_Level.
	  * Mức độ
	  */
	public String getWarning_Question_Level();
}
