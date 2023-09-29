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

/** Generated Model for TDAB_BCTC
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_BCTC extends PO implements I_TDAB_BCTC, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210317L;

    /** Standard Constructor */
    public X_TDAB_BCTC (Properties ctx, int TDAB_BCTC_ID, String trxName)
    {
      super (ctx, TDAB_BCTC_ID, trxName);
      /** if (TDAB_BCTC_ID == 0)
        {
			setTDAB_BCTC_ID (0);
			setTDAB_BCTC_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_BCTC (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_BCTC[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** KT = KT */
	public static final String NAME_KT = "KT";
	/** KTT = KTT */
	public static final String NAME_KTT = "KTT";
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

	/** Set Smax.
		@param Smax Smax	  */
	public void setSmax (BigDecimal Smax)
	{
		set_Value (COLUMNNAME_Smax, Smax);
	}

	/** Get Smax.
		@return Smax	  */
	public BigDecimal getSmax () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Smax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Smin.
		@param Smin Smin	  */
	public void setSmin (BigDecimal Smin)
	{
		set_Value (COLUMNNAME_Smin, Smin);
	}

	/** Get Smin.
		@return Smin	  */
	public BigDecimal getSmin () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Smin);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TDAB_BCTC.
		@param TDAB_BCTC_ID TDAB_BCTC	  */
	public void setTDAB_BCTC_ID (int TDAB_BCTC_ID)
	{
		if (TDAB_BCTC_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_ID, Integer.valueOf(TDAB_BCTC_ID));
	}

	/** Get TDAB_BCTC.
		@return TDAB_BCTC	  */
	public int getTDAB_BCTC_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_BCTC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_BCTC_TQ.
		@param TDAB_BCTC_TQ_ID TDAB_BCTC_TQ	  */
	public void setTDAB_BCTC_TQ_ID (int TDAB_BCTC_TQ_ID)
	{
		if (TDAB_BCTC_TQ_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_TQ_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_TQ_ID, Integer.valueOf(TDAB_BCTC_TQ_ID));
	}

	/** Get TDAB_BCTC_TQ.
		@return TDAB_BCTC_TQ	  */
	public int getTDAB_BCTC_TQ_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_BCTC_TQ_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_BCTC_UU.
		@param TDAB_BCTC_UU TDAB_BCTC_UU	  */
	public void setTDAB_BCTC_UU (String TDAB_BCTC_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_UU, TDAB_BCTC_UU);
	}

	/** Get TDAB_BCTC_UU.
		@return TDAB_BCTC_UU	  */
	public String getTDAB_BCTC_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_BCTC_UU);
	}
}