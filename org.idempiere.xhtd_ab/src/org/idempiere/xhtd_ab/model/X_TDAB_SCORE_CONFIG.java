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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for TDAB_SCORE_CONFIG
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_SCORE_CONFIG extends PO implements I_TDAB_SCORE_CONFIG, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210311L;

    /** Standard Constructor */
    public X_TDAB_SCORE_CONFIG (Properties ctx, int TDAB_SCORE_CONFIG_ID, String trxName)
    {
      super (ctx, TDAB_SCORE_CONFIG_ID, trxName);
      /** if (TDAB_SCORE_CONFIG_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_TDAB_SCORE_CONFIG (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_SCORE_CONFIG[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CV_Mean.
		@param CV_Mean CV_Mean	  */
	public void setCV_Mean (String CV_Mean)
	{
		set_Value (COLUMNNAME_CV_Mean, CV_Mean);
	}

	/** Get CV_Mean.
		@return CV_Mean	  */
	public String getCV_Mean () 
	{
		return (String)get_Value(COLUMNNAME_CV_Mean);
	}

	/** Set CV_SD.
		@param CV_SD CV_SD	  */
	public void setCV_SD (String CV_SD)
	{
		set_Value (COLUMNNAME_CV_SD, CV_SD);
	}

	/** Get CV_SD.
		@return CV_SD	  */
	public String getCV_SD () 
	{
		return (String)get_Value(COLUMNNAME_CV_SD);
	}

	/** Set FieldValue.
		@param FieldValue FieldValue	  */
	public void setFieldValue (String FieldValue)
	{
		set_Value (COLUMNNAME_FieldValue, FieldValue);
	}

	/** Get FieldValue.
		@return FieldValue	  */
	public String getFieldValue () 
	{
		return (String)get_Value(COLUMNNAME_FieldValue);
	}

	/** Set Logistic_A.
		@param Logistic_A Logistic_A	  */
	public void setLogistic_A (String Logistic_A)
	{
		set_Value (COLUMNNAME_Logistic_A, Logistic_A);
	}

	/** Get Logistic_A.
		@return Logistic_A	  */
	public String getLogistic_A () 
	{
		return (String)get_Value(COLUMNNAME_Logistic_A);
	}

	/** Set Logistic_B.
		@param Logistic_B Logistic_B	  */
	public void setLogistic_B (String Logistic_B)
	{
		set_Value (COLUMNNAME_Logistic_B, Logistic_B);
	}

	/** Get Logistic_B.
		@return Logistic_B	  */
	public String getLogistic_B () 
	{
		return (String)get_Value(COLUMNNAME_Logistic_B);
	}

	/** Set NA_Max.
		@param NA_Max NA_Max	  */
	public void setNA_Max (String NA_Max)
	{
		set_Value (COLUMNNAME_NA_Max, NA_Max);
	}

	/** Get NA_Max.
		@return NA_Max	  */
	public String getNA_Max () 
	{
		return (String)get_Value(COLUMNNAME_NA_Max);
	}

	/** Set NA_Min.
		@param NA_Min NA_Min	  */
	public void setNA_Min (String NA_Min)
	{
		set_Value (COLUMNNAME_NA_Min, NA_Min);
	}

	/** Get NA_Min.
		@return NA_Min	  */
	public String getNA_Min () 
	{
		return (String)get_Value(COLUMNNAME_NA_Min);
	}

	/** Set NA_Value.
		@param NA_Value NA_Value	  */
	public void setNA_Value (String NA_Value)
	{
		set_Value (COLUMNNAME_NA_Value, NA_Value);
	}

	/** Get NA_Value.
		@return NA_Value	  */
	public String getNA_Value () 
	{
		return (String)get_Value(COLUMNNAME_NA_Value);
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

	/** Set StandardValue.
		@param StandardValue StandardValue	  */
	public void setStandardValue (String StandardValue)
	{
		set_Value (COLUMNNAME_StandardValue, StandardValue);
	}

	/** Get StandardValue.
		@return StandardValue	  */
	public String getStandardValue () 
	{
		return (String)get_Value(COLUMNNAME_StandardValue);
	}

	/** Set Str_Mean.
		@param Str_Mean Str_Mean	  */
	public void setStr_Mean (String Str_Mean)
	{
		set_Value (COLUMNNAME_Str_Mean, Str_Mean);
	}

	/** Get Str_Mean.
		@return Str_Mean	  */
	public String getStr_Mean () 
	{
		return (String)get_Value(COLUMNNAME_Str_Mean);
	}

	/** Set Str_Mean_SD.
		@param Str_Mean_SD Str_Mean_SD	  */
	public void setStr_Mean_SD (String Str_Mean_SD)
	{
		set_Value (COLUMNNAME_Str_Mean_SD, Str_Mean_SD);
	}

	/** Get Str_Mean_SD.
		@return Str_Mean_SD	  */
	public String getStr_Mean_SD () 
	{
		return (String)get_Value(COLUMNNAME_Str_Mean_SD);
	}

	/** Set Str_Mean_SD_Plus.
		@param Str_Mean_SD_Plus Str_Mean_SD_Plus	  */
	public void setStr_Mean_SD_Plus (String Str_Mean_SD_Plus)
	{
		set_Value (COLUMNNAME_Str_Mean_SD_Plus, Str_Mean_SD_Plus);
	}

	/** Get Str_Mean_SD_Plus.
		@return Str_Mean_SD_Plus	  */
	public String getStr_Mean_SD_Plus () 
	{
		return (String)get_Value(COLUMNNAME_Str_Mean_SD_Plus);
	}

	/** Set Str_SD.
		@param Str_SD Str_SD	  */
	public void setStr_SD (String Str_SD)
	{
		set_Value (COLUMNNAME_Str_SD, Str_SD);
	}

	/** Get Str_SD.
		@return Str_SD	  */
	public String getStr_SD () 
	{
		return (String)get_Value(COLUMNNAME_Str_SD);
	}

	/** Set TDAB_SCORE_CONFIG.
		@param TDAB_SCORE_CONFIG_ID TDAB_SCORE_CONFIG	  */
	public void setTDAB_SCORE_CONFIG_ID (int TDAB_SCORE_CONFIG_ID)
	{
		if (TDAB_SCORE_CONFIG_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_CONFIG_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_CONFIG_ID, Integer.valueOf(TDAB_SCORE_CONFIG_ID));
	}

	/** Get TDAB_SCORE_CONFIG.
		@return TDAB_SCORE_CONFIG	  */
	public int getTDAB_SCORE_CONFIG_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_SCORE_CONFIG_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_SCORE_CONFIG_UU.
		@param TDAB_SCORE_CONFIG_UU TDAB_SCORE_CONFIG_UU	  */
	public void setTDAB_SCORE_CONFIG_UU (String TDAB_SCORE_CONFIG_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_SCORE_CONFIG_UU, TDAB_SCORE_CONFIG_UU);
	}

	/** Get TDAB_SCORE_CONFIG_UU.
		@return TDAB_SCORE_CONFIG_UU	  */
	public String getTDAB_SCORE_CONFIG_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_SCORE_CONFIG_UU);
	}
}