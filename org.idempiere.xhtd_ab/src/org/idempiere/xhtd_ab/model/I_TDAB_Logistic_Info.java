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

/** Generated Interface for TDAB_Logistic_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Logistic_Info 
{

    /** TableName=TDAB_Logistic_Info */
    public static final String Table_Name = "TDAB_Logistic_Info";

    /** AD_Table_ID=1000192 */
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

    /** Column name TDAB_Logistic_ID */
    public static final String COLUMNNAME_TDAB_Logistic_ID = "TDAB_Logistic_ID";

	/** Set TDAB_Logistic	  */
	public void setTDAB_Logistic_ID (int TDAB_Logistic_ID);

	/** Get TDAB_Logistic	  */
	public int getTDAB_Logistic_ID();

    /** Column name TDAB_Logistic_Info_ID */
    public static final String COLUMNNAME_TDAB_Logistic_Info_ID = "TDAB_Logistic_Info_ID";

	/** Set TDAB_Logistic_Info	  */
	public void setTDAB_Logistic_Info_ID (int TDAB_Logistic_Info_ID);

	/** Get TDAB_Logistic_Info	  */
	public int getTDAB_Logistic_Info_ID();

    /** Column name TDAB_Logistic_Info_UU */
    public static final String COLUMNNAME_TDAB_Logistic_Info_UU = "TDAB_Logistic_Info_UU";

	/** Set TDAB_Logistic_Info_UU	  */
	public void setTDAB_Logistic_Info_UU (String TDAB_Logistic_Info_UU);

	/** Get TDAB_Logistic_Info_UU	  */
	public String getTDAB_Logistic_Info_UU();

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

    /** Column name a_logistic */
    public static final String COLUMNNAME_a_logistic = "a_logistic";

	/** Set a_logistic	  */
	public void seta_logistic (BigDecimal a_logistic);

	/** Get a_logistic	  */
	public BigDecimal geta_logistic();

    /** Column name b_logistic */
    public static final String COLUMNNAME_b_logistic = "b_logistic";

	/** Set b_logistic	  */
	public void setb_logistic (BigDecimal b_logistic);

	/** Get b_logistic	  */
	public BigDecimal getb_logistic();
}
