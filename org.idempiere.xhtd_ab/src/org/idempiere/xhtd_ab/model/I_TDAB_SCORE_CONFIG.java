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

/** Generated Interface for TDAB_SCORE_CONFIG
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_SCORE_CONFIG 
{

    /** TableName=TDAB_SCORE_CONFIG */
    public static final String Table_Name = "TDAB_SCORE_CONFIG";

    /** AD_Table_ID=1000170 */
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

    /** Column name CV_Mean */
    public static final String COLUMNNAME_CV_Mean = "CV_Mean";

	/** Set CV_Mean	  */
	public void setCV_Mean (String CV_Mean);

	/** Get CV_Mean	  */
	public String getCV_Mean();

    /** Column name CV_SD */
    public static final String COLUMNNAME_CV_SD = "CV_SD";

	/** Set CV_SD	  */
	public void setCV_SD (String CV_SD);

	/** Get CV_SD	  */
	public String getCV_SD();

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

    /** Column name FieldValue */
    public static final String COLUMNNAME_FieldValue = "FieldValue";

	/** Set FieldValue	  */
	public void setFieldValue (String FieldValue);

	/** Get FieldValue	  */
	public String getFieldValue();

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

    /** Column name Logistic_A */
    public static final String COLUMNNAME_Logistic_A = "Logistic_A";

	/** Set Logistic_A	  */
	public void setLogistic_A (String Logistic_A);

	/** Get Logistic_A	  */
	public String getLogistic_A();

    /** Column name Logistic_B */
    public static final String COLUMNNAME_Logistic_B = "Logistic_B";

	/** Set Logistic_B	  */
	public void setLogistic_B (String Logistic_B);

	/** Get Logistic_B	  */
	public String getLogistic_B();

    /** Column name NA_Max */
    public static final String COLUMNNAME_NA_Max = "NA_Max";

	/** Set NA_Max	  */
	public void setNA_Max (String NA_Max);

	/** Get NA_Max	  */
	public String getNA_Max();

    /** Column name NA_Min */
    public static final String COLUMNNAME_NA_Min = "NA_Min";

	/** Set NA_Min	  */
	public void setNA_Min (String NA_Min);

	/** Get NA_Min	  */
	public String getNA_Min();

    /** Column name NA_Value */
    public static final String COLUMNNAME_NA_Value = "NA_Value";

	/** Set NA_Value	  */
	public void setNA_Value (String NA_Value);

	/** Get NA_Value	  */
	public String getNA_Value();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name StandardValue */
    public static final String COLUMNNAME_StandardValue = "StandardValue";

	/** Set StandardValue	  */
	public void setStandardValue (String StandardValue);

	/** Get StandardValue	  */
	public String getStandardValue();

    /** Column name Str_Mean */
    public static final String COLUMNNAME_Str_Mean = "Str_Mean";

	/** Set Str_Mean	  */
	public void setStr_Mean (String Str_Mean);

	/** Get Str_Mean	  */
	public String getStr_Mean();

    /** Column name Str_Mean_SD */
    public static final String COLUMNNAME_Str_Mean_SD = "Str_Mean_SD";

	/** Set Str_Mean_SD	  */
	public void setStr_Mean_SD (String Str_Mean_SD);

	/** Get Str_Mean_SD	  */
	public String getStr_Mean_SD();

    /** Column name Str_Mean_SD_Plus */
    public static final String COLUMNNAME_Str_Mean_SD_Plus = "Str_Mean_SD_Plus";

	/** Set Str_Mean_SD_Plus	  */
	public void setStr_Mean_SD_Plus (String Str_Mean_SD_Plus);

	/** Get Str_Mean_SD_Plus	  */
	public String getStr_Mean_SD_Plus();

    /** Column name Str_SD */
    public static final String COLUMNNAME_Str_SD = "Str_SD";

	/** Set Str_SD	  */
	public void setStr_SD (String Str_SD);

	/** Get Str_SD	  */
	public String getStr_SD();

    /** Column name TDAB_SCORE_CONFIG_ID */
    public static final String COLUMNNAME_TDAB_SCORE_CONFIG_ID = "TDAB_SCORE_CONFIG_ID";

	/** Set TDAB_SCORE_CONFIG	  */
	public void setTDAB_SCORE_CONFIG_ID (int TDAB_SCORE_CONFIG_ID);

	/** Get TDAB_SCORE_CONFIG	  */
	public int getTDAB_SCORE_CONFIG_ID();

    /** Column name TDAB_SCORE_CONFIG_UU */
    public static final String COLUMNNAME_TDAB_SCORE_CONFIG_UU = "TDAB_SCORE_CONFIG_UU";

	/** Set TDAB_SCORE_CONFIG_UU	  */
	public void setTDAB_SCORE_CONFIG_UU (String TDAB_SCORE_CONFIG_UU);

	/** Get TDAB_SCORE_CONFIG_UU	  */
	public String getTDAB_SCORE_CONFIG_UU();

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
