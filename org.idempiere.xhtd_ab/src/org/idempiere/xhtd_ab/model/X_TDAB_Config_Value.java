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

/** Generated Model for TDAB_Config_Value
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Config_Value extends PO implements I_TDAB_Config_Value, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210317L;

    /** Standard Constructor */
    public X_TDAB_Config_Value (Properties ctx, int TDAB_Config_Value_ID, String trxName)
    {
      super (ctx, TDAB_Config_Value_ID, trxName);
      /** if (TDAB_Config_Value_ID == 0)
        {
			setTDAB_Config_Value_ID (0);
			setTDAB_Config_Value_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Config_Value (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Config_Value[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** SH = SH */
	public static final String PTC39_SH = "SH";
	/** T = T */
	public static final String PTC39_T = "T";
	/** Set PTC39.
		@param PTC39 PTC39	  */
	public void setPTC39 (String PTC39)
	{

		set_Value (COLUMNNAME_PTC39, PTC39);
	}

	/** Get PTC39.
		@return PTC39	  */
	public String getPTC39 () 
	{
		return (String)get_Value(COLUMNNAME_PTC39);
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

	/** Set TDAB_Config_Value.
		@param TDAB_Config_Value_ID TDAB_Config_Value	  */
	public void setTDAB_Config_Value_ID (int TDAB_Config_Value_ID)
	{
		if (TDAB_Config_Value_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Config_Value_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Config_Value_ID, Integer.valueOf(TDAB_Config_Value_ID));
	}

	/** Get TDAB_Config_Value.
		@return TDAB_Config_Value	  */
	public int getTDAB_Config_Value_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Config_Value_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Config_Value_TQ.
		@param TDAB_Config_Value_TQ_ID TDAB_Config_Value_TQ	  */
	public void setTDAB_Config_Value_TQ_ID (int TDAB_Config_Value_TQ_ID)
	{
		if (TDAB_Config_Value_TQ_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Config_Value_TQ_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Config_Value_TQ_ID, Integer.valueOf(TDAB_Config_Value_TQ_ID));
	}

	/** Get TDAB_Config_Value_TQ.
		@return TDAB_Config_Value_TQ	  */
	public int getTDAB_Config_Value_TQ_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Config_Value_TQ_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Config_Value_UU.
		@param TDAB_Config_Value_UU TDAB_Config_Value_UU	  */
	public void setTDAB_Config_Value_UU (String TDAB_Config_Value_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Config_Value_UU, TDAB_Config_Value_UU);
	}

	/** Get TDAB_Config_Value_UU.
		@return TDAB_Config_Value_UU	  */
	public String getTDAB_Config_Value_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Config_Value_UU);
	}
}