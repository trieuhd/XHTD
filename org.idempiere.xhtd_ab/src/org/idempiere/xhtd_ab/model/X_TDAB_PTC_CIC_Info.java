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

/** Generated Model for TDAB_PTC_CIC_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_PTC_CIC_Info extends PO implements I_TDAB_PTC_CIC_Info, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210316L;

    /** Standard Constructor */
    public X_TDAB_PTC_CIC_Info (Properties ctx, int TDAB_PTC_CIC_Info_ID, String trxName)
    {
      super (ctx, TDAB_PTC_CIC_Info_ID, trxName);
      /** if (TDAB_PTC_CIC_Info_ID == 0)
        {
			setTDAB_PTC_CIC_Info_ID (0);
			setTDAB_PTC_CIC_Info_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_PTC_CIC_Info (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_PTC_CIC_Info[")
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

	/** Set Mean_3.
		@param Mean_3 Mean_3	  */
	public void setMean_3 (BigDecimal Mean_3)
	{
		set_Value (COLUMNNAME_Mean_3, Mean_3);
	}

	/** Get Mean_3.
		@return Mean_3	  */
	public BigDecimal getMean_3 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Mean_3);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Mean_3_SD.
		@param Mean_3_SD Mean_3_SD	  */
	public void setMean_3_SD (BigDecimal Mean_3_SD)
	{
		set_Value (COLUMNNAME_Mean_3_SD, Mean_3_SD);
	}

	/** Get Mean_3_SD.
		@return Mean_3_SD	  */
	public BigDecimal getMean_3_SD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Mean_3_SD);
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

	/** Set SD.
		@param SD SD	  */
	public void setSD (BigDecimal SD)
	{
		set_Value (COLUMNNAME_SD, SD);
	}

	/** Get SD.
		@return SD	  */
	public BigDecimal getSD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TDAB_PTC_CIC.
		@param TDAB_PTC_CIC_ID TDAB_PTC_CIC	  */
	public void setTDAB_PTC_CIC_ID (int TDAB_PTC_CIC_ID)
	{
		if (TDAB_PTC_CIC_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_PTC_CIC_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_PTC_CIC_ID, Integer.valueOf(TDAB_PTC_CIC_ID));
	}

	/** Get TDAB_PTC_CIC.
		@return TDAB_PTC_CIC	  */
	public int getTDAB_PTC_CIC_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_PTC_CIC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_PTC_CIC_Info.
		@param TDAB_PTC_CIC_Info_ID TDAB_PTC_CIC_Info	  */
	public void setTDAB_PTC_CIC_Info_ID (int TDAB_PTC_CIC_Info_ID)
	{
		if (TDAB_PTC_CIC_Info_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_PTC_CIC_Info_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_PTC_CIC_Info_ID, Integer.valueOf(TDAB_PTC_CIC_Info_ID));
	}

	/** Get TDAB_PTC_CIC_Info.
		@return TDAB_PTC_CIC_Info	  */
	public int getTDAB_PTC_CIC_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_PTC_CIC_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_PTC_CIC_Info_UU.
		@param TDAB_PTC_CIC_Info_UU TDAB_PTC_CIC_Info_UU	  */
	public void setTDAB_PTC_CIC_Info_UU (String TDAB_PTC_CIC_Info_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_PTC_CIC_Info_UU, TDAB_PTC_CIC_Info_UU);
	}

	/** Get TDAB_PTC_CIC_Info_UU.
		@return TDAB_PTC_CIC_Info_UU	  */
	public String getTDAB_PTC_CIC_Info_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_PTC_CIC_Info_UU);
	}
}