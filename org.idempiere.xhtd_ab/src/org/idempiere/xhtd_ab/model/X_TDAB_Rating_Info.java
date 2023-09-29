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

/** Generated Model for TDAB_Rating_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Rating_Info extends PO implements I_TDAB_Rating_Info, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210317L;

    /** Standard Constructor */
    public X_TDAB_Rating_Info (Properties ctx, int TDAB_Rating_Info_ID, String trxName)
    {
      super (ctx, TDAB_Rating_Info_ID, trxName);
      /** if (TDAB_Rating_Info_ID == 0)
        {
			setTDAB_Rating_Info_ID (0);
			setTDAB_Rating_Info_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Rating_Info (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Rating_Info[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Internal_Rating.
		@param Internal_Rating Internal_Rating	  */
	public void setInternal_Rating (String Internal_Rating)
	{
		set_Value (COLUMNNAME_Internal_Rating, Internal_Rating);
	}

	/** Get Internal_Rating.
		@return Internal_Rating	  */
	public String getInternal_Rating () 
	{
		return (String)get_Value(COLUMNNAME_Internal_Rating);
	}

	/** Set Moodys_Rating.
		@param Moodys_Rating Moodys_Rating	  */
	public void setMoodys_Rating (String Moodys_Rating)
	{
		set_Value (COLUMNNAME_Moodys_Rating, Moodys_Rating);
	}

	/** Get Moodys_Rating.
		@return Moodys_Rating	  */
	public String getMoodys_Rating () 
	{
		return (String)get_Value(COLUMNNAME_Moodys_Rating);
	}

	/** Set PD_Cao.
		@param PD_Cao PD_Cao	  */
	public void setPD_Cao (BigDecimal PD_Cao)
	{
		set_Value (COLUMNNAME_PD_Cao, PD_Cao);
	}

	/** Get PD_Cao.
		@return PD_Cao	  */
	public BigDecimal getPD_Cao () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PD_Cao);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set PD_Thap.
		@param PD_Thap PD_Thap	  */
	public void setPD_Thap (BigDecimal PD_Thap)
	{
		set_Value (COLUMNNAME_PD_Thap, PD_Thap);
	}

	/** Get PD_Thap.
		@return PD_Thap	  */
	public BigDecimal getPD_Thap () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PD_Thap);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SP_Rating.
		@param SP_Rating SP_Rating	  */
	public void setSP_Rating (String SP_Rating)
	{
		set_Value (COLUMNNAME_SP_Rating, SP_Rating);
	}

	/** Get SP_Rating.
		@return SP_Rating	  */
	public String getSP_Rating () 
	{
		return (String)get_Value(COLUMNNAME_SP_Rating);
	}

	/** Set TDAB_Rating.
		@param TDAB_Rating_ID TDAB_Rating	  */
	public void setTDAB_Rating_ID (int TDAB_Rating_ID)
	{
		if (TDAB_Rating_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Rating_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Rating_ID, Integer.valueOf(TDAB_Rating_ID));
	}

	/** Get TDAB_Rating.
		@return TDAB_Rating	  */
	public int getTDAB_Rating_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Rating_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Rating_Info.
		@param TDAB_Rating_Info_ID TDAB_Rating_Info	  */
	public void setTDAB_Rating_Info_ID (int TDAB_Rating_Info_ID)
	{
		if (TDAB_Rating_Info_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Rating_Info_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Rating_Info_ID, Integer.valueOf(TDAB_Rating_Info_ID));
	}

	/** Get TDAB_Rating_Info.
		@return TDAB_Rating_Info	  */
	public int getTDAB_Rating_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Rating_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Rating_Info_UU.
		@param TDAB_Rating_Info_UU TDAB_Rating_Info_UU	  */
	public void setTDAB_Rating_Info_UU (String TDAB_Rating_Info_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Rating_Info_UU, TDAB_Rating_Info_UU);
	}

	/** Get TDAB_Rating_Info_UU.
		@return TDAB_Rating_Info_UU	  */
	public String getTDAB_Rating_Info_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Rating_Info_UU);
	}
}