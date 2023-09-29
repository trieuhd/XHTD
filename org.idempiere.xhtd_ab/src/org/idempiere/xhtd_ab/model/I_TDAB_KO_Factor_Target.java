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

/** Generated Interface for TDAB_KO_Factor_Target
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_KO_Factor_Target 
{

    /** TableName=TDAB_KO_Factor_Target */
    public static final String Table_Name = "TDAB_KO_Factor_Target";

    /** AD_Table_ID=1000220 */
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

    /** Column name Answer */
    public static final String COLUMNNAME_Answer = "Answer";

	/** Set Answer	  */
	public void setAnswer (String Answer);

	/** Get Answer	  */
	public String getAnswer();

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

    /** Column name Name_ID */
    public static final String COLUMNNAME_Name_ID = "Name_ID";

	/** Set Name_ID	  */
	public void setName_ID (int Name_ID);

	/** Get Name_ID	  */
	public int getName_ID();

	public I_TDAB_Direct_KO getName() throws RuntimeException;

    /** Column name TDAB_KO_Factor_Target_ID */
    public static final String COLUMNNAME_TDAB_KO_Factor_Target_ID = "TDAB_KO_Factor_Target_ID";

	/** Set TDAB_KO_Factor_Target	  */
	public void setTDAB_KO_Factor_Target_ID (int TDAB_KO_Factor_Target_ID);

	/** Get TDAB_KO_Factor_Target	  */
	public int getTDAB_KO_Factor_Target_ID();

    /** Column name TDAB_KO_Factor_Target_UU */
    public static final String COLUMNNAME_TDAB_KO_Factor_Target_UU = "TDAB_KO_Factor_Target_UU";

	/** Set TDAB_KO_Factor_Target_UU	  */
	public void setTDAB_KO_Factor_Target_UU (String TDAB_KO_Factor_Target_UU);

	/** Get TDAB_KO_Factor_Target_UU	  */
	public String getTDAB_KO_Factor_Target_UU();

    /** Column name TDAB_Set_Indicator_ID */
    public static final String COLUMNNAME_TDAB_Set_Indicator_ID = "TDAB_Set_Indicator_ID";

	/** Set TDAB_Set_Indicator	  */
	public void setTDAB_Set_Indicator_ID (int TDAB_Set_Indicator_ID);

	/** Get TDAB_Set_Indicator	  */
	public int getTDAB_Set_Indicator_ID();

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
}
