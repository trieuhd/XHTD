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

/** Generated Model for TDAB_PC
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_PC extends PO implements I_TDAB_PC, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210317L;

    /** Standard Constructor */
    public X_TDAB_PC (Properties ctx, int TDAB_PC_ID, String trxName)
    {
      super (ctx, TDAB_PC_ID, trxName);
      /** if (TDAB_PC_ID == 0)
        {
			setTDAB_PC_ID (0);
			setTDAB_PC_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_PC (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_PC[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Alpha.
		@param Alpha 
		Color Alpha value 0-255
	  */
	public void setAlpha (BigDecimal Alpha)
	{
		set_Value (COLUMNNAME_Alpha, Alpha);
	}

	/** Get Alpha.
		@return Color Alpha value 0-255
	  */
	public BigDecimal getAlpha () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Alpha);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TDAB_PC.
		@param TDAB_PC_ID TDAB_PC	  */
	public void setTDAB_PC_ID (int TDAB_PC_ID)
	{
		if (TDAB_PC_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_PC_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_PC_ID, Integer.valueOf(TDAB_PC_ID));
	}

	/** Get TDAB_PC.
		@return TDAB_PC	  */
	public int getTDAB_PC_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_PC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_PC_TQ.
		@param TDAB_PC_TQ_ID TDAB_PC_TQ	  */
	public void setTDAB_PC_TQ_ID (int TDAB_PC_TQ_ID)
	{
		if (TDAB_PC_TQ_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_PC_TQ_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_PC_TQ_ID, Integer.valueOf(TDAB_PC_TQ_ID));
	}

	/** Get TDAB_PC_TQ.
		@return TDAB_PC_TQ	  */
	public int getTDAB_PC_TQ_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_PC_TQ_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_PC_UU.
		@param TDAB_PC_UU TDAB_PC_UU	  */
	public void setTDAB_PC_UU (String TDAB_PC_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_PC_UU, TDAB_PC_UU);
	}

	/** Get TDAB_PC_UU.
		@return TDAB_PC_UU	  */
	public String getTDAB_PC_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_PC_UU);
	}

	/** Set beta.
		@param beta beta	  */
	public void setbeta (BigDecimal beta)
	{
		set_Value (COLUMNNAME_beta, beta);
	}

	/** Get beta.
		@return beta	  */
	public BigDecimal getbeta () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_beta);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set k.
		@param k k	  */
	public void setk (BigDecimal k)
	{
		set_Value (COLUMNNAME_k, k);
	}

	/** Get k.
		@return k	  */
	public BigDecimal getk () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_k);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}