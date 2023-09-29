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

/** Generated Interface for TDAB_Business_Areas
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Business_Areas 
{

    /** TableName=TDAB_Business_Areas */
    public static final String Table_Name = "TDAB_Business_Areas";

    /** AD_Table_ID=1000181 */
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

    /** Column name Active */
    public static final String COLUMNNAME_Active = "Active";

	/** Set Active	  */
	public void setActive (String Active);

	/** Get Active	  */
	public String getActive();

    /** Column name Business_Areas_Code */
    public static final String COLUMNNAME_Business_Areas_Code = "Business_Areas_Code";

	/** Set Business_Areas_Code.
	  * Mã ngành nghề kinh doanh
	  */
	public void setBusiness_Areas_Code (String Business_Areas_Code);

	/** Get Business_Areas_Code.
	  * Mã ngành nghề kinh doanh
	  */
	public String getBusiness_Areas_Code();

    /** Column name Business_Areas_Value */
    public static final String COLUMNNAME_Business_Areas_Value = "Business_Areas_Value";

	/** Set Business_Areas_Value.
	  * Giá trị ngành nghề kinh doanh
	  */
	public void setBusiness_Areas_Value (String Business_Areas_Value);

	/** Get Business_Areas_Value.
	  * Giá trị ngành nghề kinh doanh
	  */
	public String getBusiness_Areas_Value();

    /** Column name Business_Areas_Year */
    public static final String COLUMNNAME_Business_Areas_Year = "Business_Areas_Year";

	/** Set Business_Areas_Year.
	  * Năm
	  */
	public void setBusiness_Areas_Year (String Business_Areas_Year);

	/** Get Business_Areas_Year.
	  * Năm
	  */
	public String getBusiness_Areas_Year();

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

    /** Column name JobName */
    public static final String COLUMNNAME_JobName = "JobName";

	/** Set JobName	  */
	public void setJobName (String JobName);

	/** Get JobName	  */
	public String getJobName();

    /** Column name TDAB_Business_Areas_ID */
    public static final String COLUMNNAME_TDAB_Business_Areas_ID = "TDAB_Business_Areas_ID";

	/** Set TDAB_Business_Areas	  */
	public void setTDAB_Business_Areas_ID (int TDAB_Business_Areas_ID);

	/** Get TDAB_Business_Areas	  */
	public int getTDAB_Business_Areas_ID();

    /** Column name TDAB_Business_Areas_TQ_ID */
    public static final String COLUMNNAME_TDAB_Business_Areas_TQ_ID = "TDAB_Business_Areas_TQ_ID";

	/** Set TDAB_Business_Areas_TQ	  */
	public void setTDAB_Business_Areas_TQ_ID (int TDAB_Business_Areas_TQ_ID);

	/** Get TDAB_Business_Areas_TQ	  */
	public int getTDAB_Business_Areas_TQ_ID();

    /** Column name TDAB_Business_Areas_UU */
    public static final String COLUMNNAME_TDAB_Business_Areas_UU = "TDAB_Business_Areas_UU";

	/** Set TDAB_Business_Areas_UU	  */
	public void setTDAB_Business_Areas_UU (String TDAB_Business_Areas_UU);

	/** Get TDAB_Business_Areas_UU	  */
	public String getTDAB_Business_Areas_UU();

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