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

/** Generated Interface for TDAB_Rating_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Rating_Info 
{

    /** TableName=TDAB_Rating_Info */
    public static final String Table_Name = "TDAB_Rating_Info";

    /** AD_Table_ID=1000180 */
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

    /** Column name Internal_Rating */
    public static final String COLUMNNAME_Internal_Rating = "Internal_Rating";

	/** Set Internal_Rating	  */
	public void setInternal_Rating (String Internal_Rating);

	/** Get Internal_Rating	  */
	public String getInternal_Rating();

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

    /** Column name Moodys_Rating */
    public static final String COLUMNNAME_Moodys_Rating = "Moodys_Rating";

	/** Set Moodys_Rating	  */
	public void setMoodys_Rating (String Moodys_Rating);

	/** Get Moodys_Rating	  */
	public String getMoodys_Rating();

    /** Column name PD_Cao */
    public static final String COLUMNNAME_PD_Cao = "PD_Cao";

	/** Set PD_Cao	  */
	public void setPD_Cao (BigDecimal PD_Cao);

	/** Get PD_Cao	  */
	public BigDecimal getPD_Cao();

    /** Column name PD_Thap */
    public static final String COLUMNNAME_PD_Thap = "PD_Thap";

	/** Set PD_Thap	  */
	public void setPD_Thap (BigDecimal PD_Thap);

	/** Get PD_Thap	  */
	public BigDecimal getPD_Thap();

    /** Column name SP_Rating */
    public static final String COLUMNNAME_SP_Rating = "SP_Rating";

	/** Set SP_Rating	  */
	public void setSP_Rating (String SP_Rating);

	/** Get SP_Rating	  */
	public String getSP_Rating();

    /** Column name TDAB_Rating_ID */
    public static final String COLUMNNAME_TDAB_Rating_ID = "TDAB_Rating_ID";

	/** Set TDAB_Rating	  */
	public void setTDAB_Rating_ID (int TDAB_Rating_ID);

	/** Get TDAB_Rating	  */
	public int getTDAB_Rating_ID();

    /** Column name TDAB_Rating_Info_ID */
    public static final String COLUMNNAME_TDAB_Rating_Info_ID = "TDAB_Rating_Info_ID";

	/** Set TDAB_Rating_Info	  */
	public void setTDAB_Rating_Info_ID (int TDAB_Rating_Info_ID);

	/** Get TDAB_Rating_Info	  */
	public int getTDAB_Rating_Info_ID();

    /** Column name TDAB_Rating_Info_UU */
    public static final String COLUMNNAME_TDAB_Rating_Info_UU = "TDAB_Rating_Info_UU";

	/** Set TDAB_Rating_Info_UU	  */
	public void setTDAB_Rating_Info_UU (String TDAB_Rating_Info_UU);

	/** Get TDAB_Rating_Info_UU	  */
	public String getTDAB_Rating_Info_UU();

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
