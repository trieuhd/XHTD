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

/** Generated Interface for TDAB_SCORE_DETAIL
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_SCORE_DETAIL 
{

    /** TableName=TDAB_SCORE_DETAIL */
    public static final String Table_Name = "TDAB_SCORE_DETAIL";

    /** AD_Table_ID=1000167 */
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

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

    /** Column name ExceptionValue */
    public static final String COLUMNNAME_ExceptionValue = "ExceptionValue";

	/** Set ExceptionValue	  */
	public void setExceptionValue (String ExceptionValue);

	/** Get ExceptionValue	  */
	public String getExceptionValue();

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

    /** Column name LogisticValue */
    public static final String COLUMNNAME_LogisticValue = "LogisticValue";

	/** Set LogisticValue	  */
	public void setLogisticValue (String LogisticValue);

	/** Get LogisticValue	  */
	public String getLogisticValue();

    /** Column name MinMaxValue */
    public static final String COLUMNNAME_MinMaxValue = "MinMaxValue";

	/** Set MinMaxValue	  */
	public void setMinMaxValue (String MinMaxValue);

	/** Get MinMaxValue	  */
	public String getMinMaxValue();

    /** Column name NaValue */
    public static final String COLUMNNAME_NaValue = "NaValue";

	/** Set NaValue	  */
	public void setNaValue (String NaValue);

	/** Get NaValue	  */
	public String getNaValue();

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

    /** Column name OutliersValue */
    public static final String COLUMNNAME_OutliersValue = "OutliersValue";

	/** Set OutliersValue	  */
	public void setOutliersValue (String OutliersValue);

	/** Get OutliersValue	  */
	public String getOutliersValue();

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

    /** Column name Rate */
    public static final String COLUMNNAME_Rate = "Rate";

	/** Set Rate.
	  * Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate);

	/** Get Rate.
	  * Rate or Tax or Exchange
	  */
	public BigDecimal getRate();

    /** Column name Score */
    public static final String COLUMNNAME_Score = "Score";

	/** Set Score	  */
	public void setScore (BigDecimal Score);

	/** Get Score	  */
	public BigDecimal getScore();

    /** Column name Score_Changed */
    public static final String COLUMNNAME_Score_Changed = "Score_Changed";

	/** Set Score_Changed	  */
	public void setScore_Changed (BigDecimal Score_Changed);

	/** Get Score_Changed	  */
	public BigDecimal getScore_Changed();

    /** Column name SourceValue */
    public static final String COLUMNNAME_SourceValue = "SourceValue";

	/** Set SourceValue	  */
	public void setSourceValue (String SourceValue);

	/** Get SourceValue	  */
	public String getSourceValue();

    /** Column name TDAB_SCORE_DETAIL_ID */
    public static final String COLUMNNAME_TDAB_SCORE_DETAIL_ID = "TDAB_SCORE_DETAIL_ID";

	/** Set TDAB_SCORE_DETAIL	  */
	public void setTDAB_SCORE_DETAIL_ID (int TDAB_SCORE_DETAIL_ID);

	/** Get TDAB_SCORE_DETAIL	  */
	public int getTDAB_SCORE_DETAIL_ID();

    /** Column name TDAB_SCORE_DETAIL_UU */
    public static final String COLUMNNAME_TDAB_SCORE_DETAIL_UU = "TDAB_SCORE_DETAIL_UU";

	/** Set TDAB_SCORE_DETAIL_UU	  */
	public void setTDAB_SCORE_DETAIL_UU (String TDAB_SCORE_DETAIL_UU);

	/** Get TDAB_SCORE_DETAIL_UU	  */
	public String getTDAB_SCORE_DETAIL_UU();

    /** Column name TDAB_SCORE_ID */
    public static final String COLUMNNAME_TDAB_SCORE_ID = "TDAB_SCORE_ID";

	/** Set TDAB_SCORE	  */
	public void setTDAB_SCORE_ID (int TDAB_SCORE_ID);

	/** Get TDAB_SCORE	  */
	public int getTDAB_SCORE_ID();

	public I_TDAB_SCORE getTDAB_SCORE() throws RuntimeException;

    /** Column name TDAB_STANDARD_ID */
    public static final String COLUMNNAME_TDAB_STANDARD_ID = "TDAB_STANDARD_ID";

	/** Set TDAB_STANDARD	  */
	public void setTDAB_STANDARD_ID (int TDAB_STANDARD_ID);

	/** Get TDAB_STANDARD	  */
	public int getTDAB_STANDARD_ID();

	public I_TDAB_STANDARD getTDAB_STANDARD() throws RuntimeException;

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
