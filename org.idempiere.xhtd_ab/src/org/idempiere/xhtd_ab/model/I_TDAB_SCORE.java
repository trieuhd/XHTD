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

/** Generated Interface for TDAB_SCORE
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_SCORE 
{

    /** TableName=TDAB_SCORE */
    public static final String Table_Name = "TDAB_SCORE";

    /** AD_Table_ID=1000166 */
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

    /** Column name CIC */
    public static final String COLUMNNAME_CIC = "CIC";

	/** Set CIC	  */
	public void setCIC (String CIC);

	/** Get CIC	  */
	public String getCIC();

    /** Column name Counter */
    public static final String COLUMNNAME_Counter = "Counter";

	/** Set Counter.
	  * Count Value
	  */
	public void setCounter (int Counter);

	/** Get Counter.
	  * Count Value
	  */
	public int getCounter();

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

    /** Column name Moody_Score */
    public static final String COLUMNNAME_Moody_Score = "Moody_Score";

	/** Set  Moody_Score	  */
	public void setMoody_Score (String Moody_Score);

	/** Get  Moody_Score	  */
	public String getMoody_Score();

    /** Column name Moody_Score_Changed */
    public static final String COLUMNNAME_Moody_Score_Changed = "Moody_Score_Changed";

	/** Set Moody_Score_Changed	  */
	public void setMoody_Score_Changed (String Moody_Score_Changed);

	/** Get Moody_Score_Changed	  */
	public String getMoody_Score_Changed();

    /** Column name PTC_SCORE */
    public static final String COLUMNNAME_PTC_SCORE = "PTC_SCORE";

	/** Set PTC_SCORE	  */
	public void setPTC_SCORE (String PTC_SCORE);

	/** Get PTC_SCORE	  */
	public String getPTC_SCORE();

    /** Column name PreliminaryScore */
    public static final String COLUMNNAME_PreliminaryScore = "PreliminaryScore";

	/** Set PreliminaryScore	  */
	public void setPreliminaryScore (String PreliminaryScore);

	/** Get PreliminaryScore	  */
	public String getPreliminaryScore();

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

    /** Column name RateScore */
    public static final String COLUMNNAME_RateScore = "RateScore";

	/** Set RateScore	  */
	public void setRateScore (BigDecimal RateScore);

	/** Get RateScore	  */
	public BigDecimal getRateScore();

    /** Column name RateScoreChanged */
    public static final String COLUMNNAME_RateScoreChanged = "RateScoreChanged";

	/** Set RateScoreChanged	  */
	public void setRateScoreChanged (BigDecimal RateScoreChanged);

	/** Get RateScoreChanged	  */
	public BigDecimal getRateScoreChanged();

    /** Column name ReleaseScore */
    public static final String COLUMNNAME_ReleaseScore = "ReleaseScore";

	/** Set ReleaseScore	  */
	public void setReleaseScore (String ReleaseScore);

	/** Get ReleaseScore	  */
	public String getReleaseScore();

    /** Column name SP_Score */
    public static final String COLUMNNAME_SP_Score = "SP_Score";

	/** Set SP_Score	  */
	public void setSP_Score (String SP_Score);

	/** Get SP_Score	  */
	public String getSP_Score();

    /** Column name SP_Score_Changed */
    public static final String COLUMNNAME_SP_Score_Changed = "SP_Score_Changed";

	/** Set SP_Score_Changed	  */
	public void setSP_Score_Changed (String SP_Score_Changed);

	/** Get SP_Score_Changed	  */
	public String getSP_Score_Changed();

    /** Column name Score */
    public static final String COLUMNNAME_Score = "Score";

	/** Set Score	  */
	public void setScore (BigDecimal Score);

	/** Get Score	  */
	public BigDecimal getScore();

    /** Column name TC_SCORE */
    public static final String COLUMNNAME_TC_SCORE = "TC_SCORE";

	/** Set TC_SCORE	  */
	public void setTC_SCORE (String TC_SCORE);

	/** Get TC_SCORE	  */
	public String getTC_SCORE();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Customer_Score_ID */
    public static final String COLUMNNAME_TDAB_Customer_Score_ID = "TDAB_Customer_Score_ID";

	/** Set TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID);

	/** Get TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID();

	public I_TDAB_Customer_Score getTDAB_Customer_Score() throws RuntimeException;

    /** Column name TDAB_SCORE_ID */
    public static final String COLUMNNAME_TDAB_SCORE_ID = "TDAB_SCORE_ID";

	/** Set TDAB_SCORE	  */
	public void setTDAB_SCORE_ID (int TDAB_SCORE_ID);

	/** Get TDAB_SCORE	  */
	public int getTDAB_SCORE_ID();

    /** Column name TDAB_SCORE_UU */
    public static final String COLUMNNAME_TDAB_SCORE_UU = "TDAB_SCORE_UU";

	/** Set TDAB_SCORE_UU	  */
	public void setTDAB_SCORE_UU (String TDAB_SCORE_UU);

	/** Get TDAB_SCORE_UU	  */
	public String getTDAB_SCORE_UU();

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

    /** Column name XSVN_Rate */
    public static final String COLUMNNAME_XSVN_Rate = "XSVN_Rate";

	/** Set XSVN_Rate	  */
	public void setXSVN_Rate (BigDecimal XSVN_Rate);

	/** Get XSVN_Rate	  */
	public BigDecimal getXSVN_Rate();
}
