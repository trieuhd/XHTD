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

/** Generated Interface for TDAB_Warning_Question_HS
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Warning_Question_HS 
{

    /** TableName=TDAB_Warning_Question_HS */
    public static final String Table_Name = "TDAB_Warning_Question_HS";

    /** AD_Table_ID=1000207 */
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

    /** Column name Answer_TDTD */
    public static final String COLUMNNAME_Answer_TDTD = "Answer_TDTD";

	/** Set Answer_TDTD	  */
	public void setAnswer_TDTD (String Answer_TDTD);

	/** Get Answer_TDTD	  */
	public String getAnswer_TDTD();

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

    /** Column name IsRecordReject */
    public static final String COLUMNNAME_IsRecordReject = "IsRecordReject";

	/** Set IsRecordReject	  */
	public void setIsRecordReject (String IsRecordReject);

	/** Get IsRecordReject	  */
	public String getIsRecordReject();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

    /** Column name TDAB_Early_Warning_Question_ID */
    public static final String COLUMNNAME_TDAB_Early_Warning_Question_ID = "TDAB_Early_Warning_Question_ID";

	/** Set TDAB_Early_Warning_Question	  */
	public void setTDAB_Early_Warning_Question_ID (int TDAB_Early_Warning_Question_ID);

	/** Get TDAB_Early_Warning_Question	  */
	public int getTDAB_Early_Warning_Question_ID();

	public I_TDAB_Early_Warning_Question getTDAB_Early_Warning_Question() throws RuntimeException;

    /** Column name TDAB_Warning_Question_HS_ID */
    public static final String COLUMNNAME_TDAB_Warning_Question_HS_ID = "TDAB_Warning_Question_HS_ID";

	/** Set Bo cau hoi canh bao som	  */
	public void setTDAB_Warning_Question_HS_ID (int TDAB_Warning_Question_HS_ID);

	/** Get Bo cau hoi canh bao som	  */
	public int getTDAB_Warning_Question_HS_ID();

    /** Column name TDAB_Warning_Question_HS_UU */
    public static final String COLUMNNAME_TDAB_Warning_Question_HS_UU = "TDAB_Warning_Question_HS_UU";

	/** Set TDAB_Warning_Question_HS_UU	  */
	public void setTDAB_Warning_Question_HS_UU (String TDAB_Warning_Question_HS_UU);

	/** Get TDAB_Warning_Question_HS_UU	  */
	public String getTDAB_Warning_Question_HS_UU();

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

    /** Column name Warning_Question_Info_ID */
    public static final String COLUMNNAME_Warning_Question_Info_ID = "Warning_Question_Info_ID";

	/** Set Warning_Question_Info_ID	  */
	public void setWarning_Question_Info_ID (int Warning_Question_Info_ID);

	/** Get Warning_Question_Info_ID	  */
	public int getWarning_Question_Info_ID();

	public I_TDAB_Warning_Question_Info getWarning_Question_Info() throws RuntimeException;

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
