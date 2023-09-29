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

/** Generated Interface for TDAB_Financial_History
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Financial_History 
{

    /** TableName=TDAB_Financial_History */
    public static final String Table_Name = "TDAB_Financial_History";

    /** AD_Table_ID=1000226 */
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

    /** Column name BCTC_B1_File */
    public static final String COLUMNNAME_BCTC_B1_File = "BCTC_B1_File";

	/** Set BCTC_B1_File	  */
	public void setBCTC_B1_File (String BCTC_B1_File);

	/** Get BCTC_B1_File	  */
	public String getBCTC_B1_File();

    /** Column name Btn_Download_BCTC */
    public static final String COLUMNNAME_Btn_Download_BCTC = "Btn_Download_BCTC";

	/** Set Btn_Download_BCTC	  */
	public void setBtn_Download_BCTC (String Btn_Download_BCTC);

	/** Get Btn_Download_BCTC	  */
	public String getBtn_Download_BCTC();

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

    /** Column name HisCreatedAt */
    public static final String COLUMNNAME_HisCreatedAt = "HisCreatedAt";

	/** Set HisCreatedAt	  */
	public void setHisCreatedAt (Timestamp HisCreatedAt);

	/** Get HisCreatedAt	  */
	public Timestamp getHisCreatedAt();

    /** Column name HisCreatedBy */
    public static final String COLUMNNAME_HisCreatedBy = "HisCreatedBy";

	/** Set HisCreatedBy	  */
	public void setHisCreatedBy (String HisCreatedBy);

	/** Get HisCreatedBy	  */
	public String getHisCreatedBy();

    /** Column name HisUpdateAt */
    public static final String COLUMNNAME_HisUpdateAt = "HisUpdateAt";

	/** Set HisUpdateAt	  */
	public void setHisUpdateAt (Timestamp HisUpdateAt);

	/** Get HisUpdateAt	  */
	public Timestamp getHisUpdateAt();

    /** Column name HisUpdateBy */
    public static final String COLUMNNAME_HisUpdateBy = "HisUpdateBy";

	/** Set HisUpdateBy	  */
	public void setHisUpdateBy (String HisUpdateBy);

	/** Get HisUpdateBy	  */
	public String getHisUpdateBy();

    /** Column name History_Change */
    public static final String COLUMNNAME_History_Change = "History_Change";

	/** Set History_Change	  */
	public void setHistory_Change (String History_Change);

	/** Get History_Change	  */
	public String getHistory_Change();

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

    /** Column name LONG_TERM_ASSETS */
    public static final String COLUMNNAME_LONG_TERM_ASSETS = "LONG_TERM_ASSETS";

	/** Set LONG_TERM_ASSETS	  */
	public void setLONG_TERM_ASSETS (BigDecimal LONG_TERM_ASSETS);

	/** Get LONG_TERM_ASSETS	  */
	public BigDecimal getLONG_TERM_ASSETS();

    /** Column name LONG_TERM_ASSETS_LY */
    public static final String COLUMNNAME_LONG_TERM_ASSETS_LY = "LONG_TERM_ASSETS_LY";

	/** Set LONG_TERM_ASSETS_LY	  */
	public void setLONG_TERM_ASSETS_LY (BigDecimal LONG_TERM_ASSETS_LY);

	/** Get LONG_TERM_ASSETS_LY	  */
	public BigDecimal getLONG_TERM_ASSETS_LY();

    /** Column name Liabilities */
    public static final String COLUMNNAME_Liabilities = "Liabilities";

	/** Set Liabilities	  */
	public void setLiabilities (BigDecimal Liabilities);

	/** Get Liabilities	  */
	public BigDecimal getLiabilities();

    /** Column name Liabilities_LY */
    public static final String COLUMNNAME_Liabilities_LY = "Liabilities_LY";

	/** Set Liabilities_LY	  */
	public void setLiabilities_LY (BigDecimal Liabilities_LY);

	/** Get Liabilities_LY	  */
	public BigDecimal getLiabilities_LY();

    /** Column name Owner_Equity */
    public static final String COLUMNNAME_Owner_Equity = "Owner_Equity";

	/** Set Owner_Equity.
	  * Vốn chủ sở hữu
	  */
	public void setOwner_Equity (BigDecimal Owner_Equity);

	/** Get Owner_Equity.
	  * Vốn chủ sở hữu
	  */
	public BigDecimal getOwner_Equity();

    /** Column name Owner_Equity_LY */
    public static final String COLUMNNAME_Owner_Equity_LY = "Owner_Equity_LY";

	/** Set Owner_Equity_LY	  */
	public void setOwner_Equity_LY (BigDecimal Owner_Equity_LY);

	/** Get Owner_Equity_LY	  */
	public BigDecimal getOwner_Equity_LY();

    /** Column name RoleCreated */
    public static final String COLUMNNAME_RoleCreated = "RoleCreated";

	/** Set RoleCreated	  */
	public void setRoleCreated (String RoleCreated);

	/** Get RoleCreated	  */
	public String getRoleCreated();

    /** Column name SHORT_TERM_ASSETS */
    public static final String COLUMNNAME_SHORT_TERM_ASSETS = "SHORT_TERM_ASSETS";

	/** Set SHORT_TERM_ASSETS	  */
	public void setSHORT_TERM_ASSETS (BigDecimal SHORT_TERM_ASSETS);

	/** Get SHORT_TERM_ASSETS	  */
	public BigDecimal getSHORT_TERM_ASSETS();

    /** Column name SHORT_TERM_ASSETS_LY */
    public static final String COLUMNNAME_SHORT_TERM_ASSETS_LY = "SHORT_TERM_ASSETS_LY";

	/** Set SHORT_TERM_ASSETS_LY	  */
	public void setSHORT_TERM_ASSETS_LY (BigDecimal SHORT_TERM_ASSETS_LY);

	/** Get SHORT_TERM_ASSETS_LY	  */
	public BigDecimal getSHORT_TERM_ASSETS_LY();

    /** Column name TDAB_Financial_History_ID */
    public static final String COLUMNNAME_TDAB_Financial_History_ID = "TDAB_Financial_History_ID";

	/** Set TDAB_Financial_History	  */
	public void setTDAB_Financial_History_ID (int TDAB_Financial_History_ID);

	/** Get TDAB_Financial_History	  */
	public int getTDAB_Financial_History_ID();

    /** Column name TDAB_Financial_History_UU */
    public static final String COLUMNNAME_TDAB_Financial_History_UU = "TDAB_Financial_History_UU";

	/** Set TDAB_Financial_History_UU	  */
	public void setTDAB_Financial_History_UU (String TDAB_Financial_History_UU);

	/** Get TDAB_Financial_History_UU	  */
	public String getTDAB_Financial_History_UU();

    /** Column name TDAB_Financial_ID */
    public static final String COLUMNNAME_TDAB_Financial_ID = "TDAB_Financial_ID";

	/** Set TDAB_Financial	  */
	public void setTDAB_Financial_ID (int TDAB_Financial_ID);

	/** Get TDAB_Financial	  */
	public int getTDAB_Financial_ID();

	public I_TDAB_Financial getTDAB_Financial() throws RuntimeException;

    /** Column name Total_Assets */
    public static final String COLUMNNAME_Total_Assets = "Total_Assets";

	/** Set Total_Assets.
	  * Tổng tài sản
	  */
	public void setTotal_Assets (BigDecimal Total_Assets);

	/** Get Total_Assets.
	  * Tổng tài sản
	  */
	public BigDecimal getTotal_Assets();

    /** Column name Total_Assets_LY */
    public static final String COLUMNNAME_Total_Assets_LY = "Total_Assets_LY";

	/** Set Total_Assets_LY	  */
	public void setTotal_Assets_LY (BigDecimal Total_Assets_LY);

	/** Get Total_Assets_LY	  */
	public BigDecimal getTotal_Assets_LY();

    /** Column name Total_Resources */
    public static final String COLUMNNAME_Total_Resources = "Total_Resources";

	/** Set Total_Resources.
	  * Tổng nguồn vốn
	  */
	public void setTotal_Resources (BigDecimal Total_Resources);

	/** Get Total_Resources.
	  * Tổng nguồn vốn
	  */
	public BigDecimal getTotal_Resources();

    /** Column name Total_Resources_LY */
    public static final String COLUMNNAME_Total_Resources_LY = "Total_Resources_LY";

	/** Set Total_Resources_LY	  */
	public void setTotal_Resources_LY (BigDecimal Total_Resources_LY);

	/** Get Total_Resources_LY	  */
	public BigDecimal getTotal_Resources_LY();

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
