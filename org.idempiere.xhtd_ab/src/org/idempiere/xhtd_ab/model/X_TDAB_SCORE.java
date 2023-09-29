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
/** Generated Model - DO NOT CHANGE */
package org.idempiere.xhtd_ab.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TDAB_SCORE
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_SCORE extends PO implements I_TDAB_SCORE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210311L;

    /** Standard Constructor */
    public X_TDAB_SCORE (Properties ctx, int TDAB_SCORE_ID, String trxName)
    {
      super (ctx, TDAB_SCORE_ID, trxName);
      /** if (TDAB_SCORE_ID == 0)
        {
			setTDAB_SCORE_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TDAB_SCORE (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_TDAB_SCORE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CIC.
		@param CIC CIC	  */
	public void setCIC (String CIC)
	{
		set_Value (COLUMNNAME_CIC, CIC);
	}

	/** Get CIC.
		@return CIC	  */
	public String getCIC () 
	{
		return (String)get_Value(COLUMNNAME_CIC);
	}

	/** Set Counter.
		@param Counter 
		Count Value
	  */
	public void setCounter (int Counter)
	{
		set_ValueNoCheck (COLUMNNAME_Counter, Integer.valueOf(Counter));
	}

	/** Get Counter.
		@return Count Value
	  */
	public int getCounter () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Counter);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set  Moody_Score.
		@param Moody_Score  Moody_Score	  */
	public void setMoody_Score (String Moody_Score)
	{
		set_Value (COLUMNNAME_Moody_Score, Moody_Score);
	}

	/** Get  Moody_Score.
		@return  Moody_Score	  */
	public String getMoody_Score () 
	{
		return (String)get_Value(COLUMNNAME_Moody_Score);
	}

	/** Set Moody_Score_Changed.
		@param Moody_Score_Changed Moody_Score_Changed	  */
	public void setMoody_Score_Changed (String Moody_Score_Changed)
	{
		set_Value (COLUMNNAME_Moody_Score_Changed, Moody_Score_Changed);
	}

	/** Get Moody_Score_Changed.
		@return Moody_Score_Changed	  */
	public String getMoody_Score_Changed () 
	{
		return (String)get_Value(COLUMNNAME_Moody_Score_Changed);
	}

	/** Set PTC_SCORE.
		@param PTC_SCORE PTC_SCORE	  */
	public void setPTC_SCORE (String PTC_SCORE)
	{
		set_Value (COLUMNNAME_PTC_SCORE, PTC_SCORE);
	}

	/** Get PTC_SCORE.
		@return PTC_SCORE	  */
	public String getPTC_SCORE () 
	{
		return (String)get_Value(COLUMNNAME_PTC_SCORE);
	}

	/** Set PreliminaryScore.
		@param PreliminaryScore PreliminaryScore	  */
	public void setPreliminaryScore (String PreliminaryScore)
	{
		set_Value (COLUMNNAME_PreliminaryScore, PreliminaryScore);
	}

	/** Get PreliminaryScore.
		@return PreliminaryScore	  */
	public String getPreliminaryScore () 
	{
		return (String)get_Value(COLUMNNAME_PreliminaryScore);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set RateScore.
		@param RateScore RateScore	  */
	public void setRateScore (BigDecimal RateScore)
	{
		set_Value (COLUMNNAME_RateScore, RateScore);
	}

	/** Get RateScore.
		@return RateScore	  */
	public BigDecimal getRateScore () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RateScore);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set RateScoreChanged.
		@param RateScoreChanged RateScoreChanged	  */
	public void setRateScoreChanged (BigDecimal RateScoreChanged)
	{
		set_Value (COLUMNNAME_RateScoreChanged, RateScoreChanged);
	}

	/** Get RateScoreChanged.
		@return RateScoreChanged	  */
	public BigDecimal getRateScoreChanged () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RateScoreChanged);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ReleaseScore.
		@param ReleaseScore ReleaseScore	  */
	public void setReleaseScore (String ReleaseScore)
	{
		set_Value (COLUMNNAME_ReleaseScore, ReleaseScore);
	}

	/** Get ReleaseScore.
		@return ReleaseScore	  */
	public String getReleaseScore () 
	{
		return (String)get_Value(COLUMNNAME_ReleaseScore);
	}

	/** Set SP_Score.
		@param SP_Score SP_Score	  */
	public void setSP_Score (String SP_Score)
	{
		set_Value (COLUMNNAME_SP_Score, SP_Score);
	}

	/** Get SP_Score.
		@return SP_Score	  */
	public String getSP_Score () 
	{
		return (String)get_Value(COLUMNNAME_SP_Score);
	}

	/** Set SP_Score_Changed.
		@param SP_Score_Changed SP_Score_Changed	  */
	public void setSP_Score_Changed (String SP_Score_Changed)
	{
		set_Value (COLUMNNAME_SP_Score_Changed, SP_Score_Changed);
	}

	/** Get SP_Score_Changed.
		@return SP_Score_Changed	  */
	public String getSP_Score_Changed () 
	{
		return (String)get_Value(COLUMNNAME_SP_Score_Changed);
	}

	/** Set Score.
		@param Score Score	  */
	public void setScore (BigDecimal Score)
	{
		set_Value (COLUMNNAME_Score, Score);
	}

	/** Get Score.
		@return Score	  */
	public BigDecimal getScore () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Score);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TC_SCORE.
		@param TC_SCORE TC_SCORE	  */
	public void setTC_SCORE (String TC_SCORE)
	{
		set_Value (COLUMNNAME_TC_SCORE, TC_SCORE);
	}

	/** Get TC_SCORE.
		@return TC_SCORE	  */
	public String getTC_SCORE () 
	{
		return (String)get_Value(COLUMNNAME_TC_SCORE);
	}

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException
    {
		return (I_TDAB_Customer_Profile)MTable.get(getCtx(), I_TDAB_Customer_Profile.Table_Name)
			.getPO(getTDAB_Customer_Profile_ID(), get_TrxName());	}

	/** Set TDAB_Customer_Profile.
		@param TDAB_Customer_Profile_ID TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID)
	{
		if (TDAB_Customer_Profile_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Profile_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Profile_ID, Integer.valueOf(TDAB_Customer_Profile_ID));
	}

	/** Get TDAB_Customer_Profile.
		@return TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Customer_Profile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_TDAB_Customer_Score getTDAB_Customer_Score() throws RuntimeException
    {
		return (I_TDAB_Customer_Score)MTable.get(getCtx(), I_TDAB_Customer_Score.Table_Name)
			.getPO(getTDAB_Customer_Score_ID(), get_TrxName());	}

	/** Set TDAB_Customer_Score.
		@param TDAB_Customer_Score_ID TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID)
	{
		if (TDAB_Customer_Score_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Score_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Score_ID, Integer.valueOf(TDAB_Customer_Score_ID));
	}

	/** Get TDAB_Customer_Score.
		@return TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Customer_Score_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_SCORE.
		@param TDAB_SCORE_ID TDAB_SCORE	  */
	public void setTDAB_SCORE_ID (int TDAB_SCORE_ID)
	{
		if (TDAB_SCORE_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_ID, Integer.valueOf(TDAB_SCORE_ID));
	}

	/** Get TDAB_SCORE.
		@return TDAB_SCORE	  */
	public int getTDAB_SCORE_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_SCORE_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_SCORE_UU.
		@param TDAB_SCORE_UU TDAB_SCORE_UU	  */
	public void setTDAB_SCORE_UU (String TDAB_SCORE_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_UU, TDAB_SCORE_UU);
	}

	/** Get TDAB_SCORE_UU.
		@return TDAB_SCORE_UU	  */
	public String getTDAB_SCORE_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_SCORE_UU);
	}

	/** Set XSVN_Rate.
		@param XSVN_Rate XSVN_Rate	  */
	public void setXSVN_Rate (BigDecimal XSVN_Rate)
	{
		set_Value (COLUMNNAME_XSVN_Rate, XSVN_Rate);
	}

	/** Get XSVN_Rate.
		@return XSVN_Rate	  */
	public BigDecimal getXSVN_Rate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_XSVN_Rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}