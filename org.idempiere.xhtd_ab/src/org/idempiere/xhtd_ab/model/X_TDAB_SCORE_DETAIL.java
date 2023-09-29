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

/** Generated Model for TDAB_SCORE_DETAIL
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_SCORE_DETAIL extends PO implements I_TDAB_SCORE_DETAIL, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210311L;

    /** Standard Constructor */
    public X_TDAB_SCORE_DETAIL (Properties ctx, int TDAB_SCORE_DETAIL_ID, String trxName)
    {
      super (ctx, TDAB_SCORE_DETAIL_ID, trxName);
      /** if (TDAB_SCORE_DETAIL_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_TDAB_SCORE_DETAIL (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_SCORE_DETAIL[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set ExceptionValue.
		@param ExceptionValue ExceptionValue	  */
	public void setExceptionValue (String ExceptionValue)
	{
		set_Value (COLUMNNAME_ExceptionValue, ExceptionValue);
	}

	/** Get ExceptionValue.
		@return ExceptionValue	  */
	public String getExceptionValue () 
	{
		return (String)get_Value(COLUMNNAME_ExceptionValue);
	}

	/** Set LogisticValue.
		@param LogisticValue LogisticValue	  */
	public void setLogisticValue (String LogisticValue)
	{
		set_Value (COLUMNNAME_LogisticValue, LogisticValue);
	}

	/** Get LogisticValue.
		@return LogisticValue	  */
	public String getLogisticValue () 
	{
		return (String)get_Value(COLUMNNAME_LogisticValue);
	}

	/** Set MinMaxValue.
		@param MinMaxValue MinMaxValue	  */
	public void setMinMaxValue (String MinMaxValue)
	{
		set_Value (COLUMNNAME_MinMaxValue, MinMaxValue);
	}

	/** Get MinMaxValue.
		@return MinMaxValue	  */
	public String getMinMaxValue () 
	{
		return (String)get_Value(COLUMNNAME_MinMaxValue);
	}

	/** Set NaValue.
		@param NaValue NaValue	  */
	public void setNaValue (String NaValue)
	{
		set_Value (COLUMNNAME_NaValue, NaValue);
	}

	/** Get NaValue.
		@return NaValue	  */
	public String getNaValue () 
	{
		return (String)get_Value(COLUMNNAME_NaValue);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set OutliersValue.
		@param OutliersValue OutliersValue	  */
	public void setOutliersValue (String OutliersValue)
	{
		set_Value (COLUMNNAME_OutliersValue, OutliersValue);
	}

	/** Get OutliersValue.
		@return OutliersValue	  */
	public String getOutliersValue () 
	{
		return (String)get_Value(COLUMNNAME_OutliersValue);
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

	/** Set Rate.
		@param Rate 
		Rate or Tax or Exchange
	  */
	public void setRate (BigDecimal Rate)
	{
		set_ValueNoCheck (COLUMNNAME_Rate, Rate);
	}

	/** Get Rate.
		@return Rate or Tax or Exchange
	  */
	public BigDecimal getRate () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Rate);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Score_Changed.
		@param Score_Changed Score_Changed	  */
	public void setScore_Changed (BigDecimal Score_Changed)
	{
		set_Value (COLUMNNAME_Score_Changed, Score_Changed);
	}

	/** Get Score_Changed.
		@return Score_Changed	  */
	public BigDecimal getScore_Changed () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Score_Changed);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SourceValue.
		@param SourceValue SourceValue	  */
	public void setSourceValue (String SourceValue)
	{
		set_Value (COLUMNNAME_SourceValue, SourceValue);
	}

	/** Get SourceValue.
		@return SourceValue	  */
	public String getSourceValue () 
	{
		return (String)get_Value(COLUMNNAME_SourceValue);
	}

	/** Set TDAB_SCORE_DETAIL.
		@param TDAB_SCORE_DETAIL_ID TDAB_SCORE_DETAIL	  */
	public void setTDAB_SCORE_DETAIL_ID (int TDAB_SCORE_DETAIL_ID)
	{
		if (TDAB_SCORE_DETAIL_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_DETAIL_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_DETAIL_ID, Integer.valueOf(TDAB_SCORE_DETAIL_ID));
	}

	/** Get TDAB_SCORE_DETAIL.
		@return TDAB_SCORE_DETAIL	  */
	public int getTDAB_SCORE_DETAIL_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_SCORE_DETAIL_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_SCORE_DETAIL_UU.
		@param TDAB_SCORE_DETAIL_UU TDAB_SCORE_DETAIL_UU	  */
	public void setTDAB_SCORE_DETAIL_UU (String TDAB_SCORE_DETAIL_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_DETAIL_UU, TDAB_SCORE_DETAIL_UU);
	}

	/** Get TDAB_SCORE_DETAIL_UU.
		@return TDAB_SCORE_DETAIL_UU	  */
	public String getTDAB_SCORE_DETAIL_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_SCORE_DETAIL_UU);
	}

	public I_TDAB_SCORE getTDAB_SCORE() throws RuntimeException
    {
		return (I_TDAB_SCORE)MTable.get(getCtx(), I_TDAB_SCORE.Table_Name)
			.getPO(getTDAB_SCORE_ID(), get_TrxName());	}

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

	public I_TDAB_STANDARD getTDAB_STANDARD() throws RuntimeException
    {
		return (I_TDAB_STANDARD)MTable.get(getCtx(), I_TDAB_STANDARD.Table_Name)
			.getPO(getTDAB_STANDARD_ID(), get_TrxName());	}

	/** Set TDAB_STANDARD.
		@param TDAB_STANDARD_ID TDAB_STANDARD	  */
	public void setTDAB_STANDARD_ID (int TDAB_STANDARD_ID)
	{
		if (TDAB_STANDARD_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_STANDARD_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_STANDARD_ID, Integer.valueOf(TDAB_STANDARD_ID));
	}

	/** Get TDAB_STANDARD.
		@return TDAB_STANDARD	  */
	public int getTDAB_STANDARD_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_STANDARD_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Value.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Value.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}