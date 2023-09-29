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

/** Generated Interface for TDAB_Config_Value
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Config_Value 
{

    /** TableName=TDAB_Config_Value */
    public static final String Table_Name = "TDAB_Config_Value";

    /** AD_Table_ID=1000175 */
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

    /** Column name PTC39 */
    public static final String COLUMNNAME_PTC39 = "PTC39";

	/** Set PTC39	  */
	public void setPTC39 (String PTC39);

	/** Get PTC39	  */
	public String getPTC39();

    /** Column name Score */
    public static final String COLUMNNAME_Score = "Score";

	/** Set Score	  */
	public void setScore (BigDecimal Score);

	/** Get Score	  */
	public BigDecimal getScore();

    /** Column name TDAB_Config_Value_ID */
    public static final String COLUMNNAME_TDAB_Config_Value_ID = "TDAB_Config_Value_ID";

	/** Set TDAB_Config_Value	  */
	public void setTDAB_Config_Value_ID (int TDAB_Config_Value_ID);

	/** Get TDAB_Config_Value	  */
	public int getTDAB_Config_Value_ID();

    /** Column name TDAB_Config_Value_TQ_ID */
    public static final String COLUMNNAME_TDAB_Config_Value_TQ_ID = "TDAB_Config_Value_TQ_ID";

	/** Set TDAB_Config_Value_TQ	  */
	public void setTDAB_Config_Value_TQ_ID (int TDAB_Config_Value_TQ_ID);

	/** Get TDAB_Config_Value_TQ	  */
	public int getTDAB_Config_Value_TQ_ID();

    /** Column name TDAB_Config_Value_UU */
    public static final String COLUMNNAME_TDAB_Config_Value_UU = "TDAB_Config_Value_UU";

	/** Set TDAB_Config_Value_UU	  */
	public void setTDAB_Config_Value_UU (String TDAB_Config_Value_UU);

	/** Get TDAB_Config_Value_UU	  */
	public String getTDAB_Config_Value_UU();

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
