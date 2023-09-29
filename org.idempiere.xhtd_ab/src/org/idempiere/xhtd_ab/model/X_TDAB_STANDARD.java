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

/** Generated Model for TDAB_STANDARD
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_STANDARD extends PO implements I_TDAB_STANDARD, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20201228L;

    /** Standard Constructor */
    public X_TDAB_STANDARD (Properties ctx, int TDAB_STANDARD_ID, String trxName)
    {
      super (ctx, TDAB_STANDARD_ID, trxName);
      /** if (TDAB_STANDARD_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_TDAB_STANDARD (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_STANDARD[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** + = 1 */
	public static final String RATE_Plus = "1";
	/** - = 2 */
	public static final String RATE__ = "2";
	/** Set Rate.
		@param Rate 
		Rate or Tax or Exchange
	  */
	public void setRate (String Rate)
	{

		set_ValueNoCheck (COLUMNNAME_Rate, Rate);
	}

	/** Get Rate.
		@return Rate or Tax or Exchange
	  */
	public String getRate () 
	{
		return (String)get_Value(COLUMNNAME_Rate);
	}

	public I_TDAB_GROUP_STANDARD getTDAB_GROUP_STANDARD() throws RuntimeException
    {
		return (I_TDAB_GROUP_STANDARD)MTable.get(getCtx(), I_TDAB_GROUP_STANDARD.Table_Name)
			.getPO(getTDAB_GROUP_STANDARD_ID(), get_TrxName());	}

	/** Set TDAB_GROUP_STANDARD.
		@param TDAB_GROUP_STANDARD_ID TDAB_GROUP_STANDARD	  */
	public void setTDAB_GROUP_STANDARD_ID (int TDAB_GROUP_STANDARD_ID)
	{
		if (TDAB_GROUP_STANDARD_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_GROUP_STANDARD_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_GROUP_STANDARD_ID, Integer.valueOf(TDAB_GROUP_STANDARD_ID));
	}

	/** Get TDAB_GROUP_STANDARD.
		@return TDAB_GROUP_STANDARD	  */
	public int getTDAB_GROUP_STANDARD_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_GROUP_STANDARD_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	/** Set TDAB_STANDARD_UU.
		@param TDAB_STANDARD_UU TDAB_STANDARD_UU	  */
	public void setTDAB_STANDARD_UU (String TDAB_STANDARD_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_STANDARD_UU, TDAB_STANDARD_UU);
	}

	/** Get TDAB_STANDARD_UU.
		@return TDAB_STANDARD_UU	  */
	public String getTDAB_STANDARD_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_STANDARD_UU);
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

	/** Set W_AUDITER.
		@param W_AUDITER W_AUDITER	  */
	public void setW_AUDITER (BigDecimal W_AUDITER)
	{
		set_Value (COLUMNNAME_W_AUDITER, W_AUDITER);
	}

	/** Get W_AUDITER.
		@return W_AUDITER	  */
	public BigDecimal getW_AUDITER () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_W_AUDITER);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set W_UNAUDITER.
		@param W_UNAUDITER W_UNAUDITER	  */
	public void setW_UNAUDITER (BigDecimal W_UNAUDITER)
	{
		set_Value (COLUMNNAME_W_UNAUDITER, W_UNAUDITER);
	}

	/** Get W_UNAUDITER.
		@return W_UNAUDITER	  */
	public BigDecimal getW_UNAUDITER () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_W_UNAUDITER);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}