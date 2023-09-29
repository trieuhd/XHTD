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

/** Generated Interface for TDAB_Direct_KO_HS
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Direct_KO_HS 
{

    /** TableName=TDAB_Direct_KO_HS */
    public static final String Table_Name = "TDAB_Direct_KO_HS";

    /** AD_Table_ID=1000209 */
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

    /** Column name Answer_CV */
    public static final String COLUMNNAME_Answer_CV = "Answer_CV";

	/** Set Answer_CV	  */
	public void setAnswer_CV (String Answer_CV);

	/** Get Answer_CV	  */
	public String getAnswer_CV();

    /** Column name Answer_KS */
    public static final String COLUMNNAME_Answer_KS = "Answer_KS";

	/** Set Answer_KS	  */
	public void setAnswer_KS (String Answer_KS);

	/** Get Answer_KS	  */
	public String getAnswer_KS();

    /** Column name Answer_TD */
    public static final String COLUMNNAME_Answer_TD = "Answer_TD";

	/** Set Answer_TD	  */
	public void setAnswer_TD (String Answer_TD);

	/** Get Answer_TD	  */
	public String getAnswer_TD();

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

    /** Column name Direct_KO_Info_ID */
    public static final String COLUMNNAME_Direct_KO_Info_ID = "Direct_KO_Info_ID";

	/** Set Direct_KO_Info_ID	  */
	public void setDirect_KO_Info_ID (int Direct_KO_Info_ID);

	/** Get Direct_KO_Info_ID	  */
	public int getDirect_KO_Info_ID();

	public I_TDAB_Direct_KO_Info getDirect_KO_Info() throws RuntimeException;

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

    /** Column name IsRecordReject */
    public static final String COLUMNNAME_IsRecordReject = "IsRecordReject";

	/** Set IsRecordReject	  */
	public void setIsRecordReject (String IsRecordReject);

	/** Get IsRecordReject	  */
	public String getIsRecordReject();

    /** Column name MaxValue */
    public static final String COLUMNNAME_MaxValue = "MaxValue";

	/** Set Max Value	  */
	public void setMaxValue (BigDecimal MaxValue);

	/** Get Max Value	  */
	public BigDecimal getMaxValue();

    /** Column name MinValue */
    public static final String COLUMNNAME_MinValue = "MinValue";

	/** Set Min Value	  */
	public void setMinValue (BigDecimal MinValue);

	/** Get Min Value	  */
	public BigDecimal getMinValue();

    /** Column name Note */
    public static final String COLUMNNAME_Note = "Note";

	/** Set Note.
	  * Optional additional user defined information
	  */
	public void setNote (String Note);

	/** Get Note.
	  * Optional additional user defined information
	  */
	public String getNote();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Direct_KO_HS_ID */
    public static final String COLUMNNAME_TDAB_Direct_KO_HS_ID = "TDAB_Direct_KO_HS_ID";

	/** Set Quan ly bien loai truc tiep KO	  */
	public void setTDAB_Direct_KO_HS_ID (int TDAB_Direct_KO_HS_ID);

	/** Get Quan ly bien loai truc tiep KO	  */
	public int getTDAB_Direct_KO_HS_ID();

    /** Column name TDAB_Direct_KO_HS_UU */
    public static final String COLUMNNAME_TDAB_Direct_KO_HS_UU = "TDAB_Direct_KO_HS_UU";

	/** Set TDAB_Direct_KO_HS_UU	  */
	public void setTDAB_Direct_KO_HS_UU (String TDAB_Direct_KO_HS_UU);

	/** Get TDAB_Direct_KO_HS_UU	  */
	public String getTDAB_Direct_KO_HS_UU();

    /** Column name TDAB_Direct_KO_ID */
    public static final String COLUMNNAME_TDAB_Direct_KO_ID = "TDAB_Direct_KO_ID";

	/** Set TDAB_Direct_KO	  */
	public void setTDAB_Direct_KO_ID (int TDAB_Direct_KO_ID);

	/** Get TDAB_Direct_KO	  */
	public int getTDAB_Direct_KO_ID();

	public I_TDAB_Direct_KO getTDAB_Direct_KO() throws RuntimeException;

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
