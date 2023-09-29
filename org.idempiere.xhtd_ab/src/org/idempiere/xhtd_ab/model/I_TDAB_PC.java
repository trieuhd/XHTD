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

/** Generated Interface for TDAB_PC
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_PC 
{

    /** TableName=TDAB_PC */
    public static final String Table_Name = "TDAB_PC";

    /** AD_Table_ID=1000176 */
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

    /** Column name Alpha */
    public static final String COLUMNNAME_Alpha = "Alpha";

	/** Set Alpha.
	  * Color Alpha value 0-255
	  */
	public void setAlpha (BigDecimal Alpha);

	/** Get Alpha.
	  * Color Alpha value 0-255
	  */
	public BigDecimal getAlpha();

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

    /** Column name TDAB_PC_ID */
    public static final String COLUMNNAME_TDAB_PC_ID = "TDAB_PC_ID";

	/** Set TDAB_PC	  */
	public void setTDAB_PC_ID (int TDAB_PC_ID);

	/** Get TDAB_PC	  */
	public int getTDAB_PC_ID();

    /** Column name TDAB_PC_TQ_ID */
    public static final String COLUMNNAME_TDAB_PC_TQ_ID = "TDAB_PC_TQ_ID";

	/** Set TDAB_PC_TQ	  */
	public void setTDAB_PC_TQ_ID (int TDAB_PC_TQ_ID);

	/** Get TDAB_PC_TQ	  */
	public int getTDAB_PC_TQ_ID();

    /** Column name TDAB_PC_UU */
    public static final String COLUMNNAME_TDAB_PC_UU = "TDAB_PC_UU";

	/** Set TDAB_PC_UU	  */
	public void setTDAB_PC_UU (String TDAB_PC_UU);

	/** Get TDAB_PC_UU	  */
	public String getTDAB_PC_UU();

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

    /** Column name beta */
    public static final String COLUMNNAME_beta = "beta";

	/** Set beta	  */
	public void setbeta (BigDecimal beta);

	/** Get beta	  */
	public BigDecimal getbeta();

    /** Column name k */
    public static final String COLUMNNAME_k = "k";

	/** Set k	  */
	public void setk (BigDecimal k);

	/** Get k	  */
	public BigDecimal getk();
}
