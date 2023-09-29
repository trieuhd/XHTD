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

/** Generated Interface for TDAB_PTC_CIC_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_PTC_CIC_Info 
{

    /** TableName=TDAB_PTC_CIC_Info */
    public static final String Table_Name = "TDAB_PTC_CIC_Info";

    /** AD_Table_ID=1000190 */
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

    /** Column name Mean */
    public static final String COLUMNNAME_Mean = "Mean";

	/** Set Mean	  */
	public void setMean (BigDecimal Mean);

	/** Get Mean	  */
	public BigDecimal getMean();

    /** Column name Mean_3 */
    public static final String COLUMNNAME_Mean_3 = "Mean_3";

	/** Set Mean_3	  */
	public void setMean_3 (BigDecimal Mean_3);

	/** Get Mean_3	  */
	public BigDecimal getMean_3();

    /** Column name Mean_3_SD */
    public static final String COLUMNNAME_Mean_3_SD = "Mean_3_SD";

	/** Set Mean_3_SD	  */
	public void setMean_3_SD (BigDecimal Mean_3_SD);

	/** Get Mean_3_SD	  */
	public BigDecimal getMean_3_SD();

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

    /** Column name SD */
    public static final String COLUMNNAME_SD = "SD";

	/** Set SD	  */
	public void setSD (BigDecimal SD);

	/** Get SD	  */
	public BigDecimal getSD();

    /** Column name TDAB_PTC_CIC_ID */
    public static final String COLUMNNAME_TDAB_PTC_CIC_ID = "TDAB_PTC_CIC_ID";

	/** Set TDAB_PTC_CIC	  */
	public void setTDAB_PTC_CIC_ID (int TDAB_PTC_CIC_ID);

	/** Get TDAB_PTC_CIC	  */
	public int getTDAB_PTC_CIC_ID();

    /** Column name TDAB_PTC_CIC_Info_ID */
    public static final String COLUMNNAME_TDAB_PTC_CIC_Info_ID = "TDAB_PTC_CIC_Info_ID";

	/** Set TDAB_PTC_CIC_Info	  */
	public void setTDAB_PTC_CIC_Info_ID (int TDAB_PTC_CIC_Info_ID);

	/** Get TDAB_PTC_CIC_Info	  */
	public int getTDAB_PTC_CIC_Info_ID();

    /** Column name TDAB_PTC_CIC_Info_UU */
    public static final String COLUMNNAME_TDAB_PTC_CIC_Info_UU = "TDAB_PTC_CIC_Info_UU";

	/** Set TDAB_PTC_CIC_Info_UU	  */
	public void setTDAB_PTC_CIC_Info_UU (String TDAB_PTC_CIC_Info_UU);

	/** Get TDAB_PTC_CIC_Info_UU	  */
	public String getTDAB_PTC_CIC_Info_UU();

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
