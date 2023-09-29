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

/** Generated Model for TDAB_Median_Mean_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Median_Mean_Info extends PO implements I_TDAB_Median_Mean_Info, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210316L;

    /** Standard Constructor */
    public X_TDAB_Median_Mean_Info (Properties ctx, int TDAB_Median_Mean_Info_ID, String trxName)
    {
      super (ctx, TDAB_Median_Mean_Info_ID, trxName);
      /** if (TDAB_Median_Mean_Info_ID == 0)
        {
			setTDAB_Median_Mean_Info_ID (0);
			setTDAB_Median_Mean_Info_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Median_Mean_Info (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Median_Mean_Info[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Mean.
		@param Mean Mean	  */
	public void setMean (BigDecimal Mean)
	{
		set_Value (COLUMNNAME_Mean, Mean);
	}

	/** Get Mean.
		@return Mean	  */
	public BigDecimal getMean () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Mean);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Median.
		@param Median Median	  */
	public void setMedian (BigDecimal Median)
	{
		set_Value (COLUMNNAME_Median, Median);
	}

	/** Get Median.
		@return Median	  */
	public BigDecimal getMedian () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Median);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set TDAB_Median_Mean.
		@param TDAB_Median_Mean_ID TDAB_Median_Mean	  */
	public void setTDAB_Median_Mean_ID (int TDAB_Median_Mean_ID)
	{
		if (TDAB_Median_Mean_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Median_Mean_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Median_Mean_ID, Integer.valueOf(TDAB_Median_Mean_ID));
	}

	/** Get TDAB_Median_Mean.
		@return TDAB_Median_Mean	  */
	public int getTDAB_Median_Mean_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Median_Mean_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Median_Mean_Info.
		@param TDAB_Median_Mean_Info_ID TDAB_Median_Mean_Info	  */
	public void setTDAB_Median_Mean_Info_ID (int TDAB_Median_Mean_Info_ID)
	{
		if (TDAB_Median_Mean_Info_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Median_Mean_Info_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Median_Mean_Info_ID, Integer.valueOf(TDAB_Median_Mean_Info_ID));
	}

	/** Get TDAB_Median_Mean_Info.
		@return TDAB_Median_Mean_Info	  */
	public int getTDAB_Median_Mean_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Median_Mean_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Median_Mean_Info_UU.
		@param TDAB_Median_Mean_Info_UU TDAB_Median_Mean_Info_UU	  */
	public void setTDAB_Median_Mean_Info_UU (String TDAB_Median_Mean_Info_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Median_Mean_Info_UU, TDAB_Median_Mean_Info_UU);
	}

	/** Get TDAB_Median_Mean_Info_UU.
		@return TDAB_Median_Mean_Info_UU	  */
	public String getTDAB_Median_Mean_Info_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Median_Mean_Info_UU);
	}
}