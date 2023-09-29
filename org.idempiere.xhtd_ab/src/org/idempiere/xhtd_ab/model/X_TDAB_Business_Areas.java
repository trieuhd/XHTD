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

/** Generated Model for TDAB_Business_Areas
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Business_Areas extends PO implements I_TDAB_Business_Areas, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210410L;

    /** Standard Constructor */
    public X_TDAB_Business_Areas (Properties ctx, int TDAB_Business_Areas_ID, String trxName)
    {
      super (ctx, TDAB_Business_Areas_ID, trxName);
      /** if (TDAB_Business_Areas_ID == 0)
        {
			setTDAB_Business_Areas_ID (0);
			setTDAB_Business_Areas_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Business_Areas (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Business_Areas[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Active.
		@param Active Active	  */
	public void setActive (String Active)
	{
		set_Value (COLUMNNAME_Active, Active);
	}

	/** Get Active.
		@return Active	  */
	public String getActive () 
	{
		return (String)get_Value(COLUMNNAME_Active);
	}

	/** Set Business_Areas_Code.
		@param Business_Areas_Code 
		Mã ngành nghề kinh doanh
	  */
	public void setBusiness_Areas_Code (String Business_Areas_Code)
	{
		set_Value (COLUMNNAME_Business_Areas_Code, Business_Areas_Code);
	}

	/** Get Business_Areas_Code.
		@return Mã ngành nghề kinh doanh
	  */
	public String getBusiness_Areas_Code () 
	{
		return (String)get_Value(COLUMNNAME_Business_Areas_Code);
	}

	/** Set Business_Areas_Value.
		@param Business_Areas_Value 
		Giá trị ngành nghề kinh doanh
	  */
	public void setBusiness_Areas_Value (String Business_Areas_Value)
	{
		set_Value (COLUMNNAME_Business_Areas_Value, Business_Areas_Value);
	}

	/** Get Business_Areas_Value.
		@return Giá trị ngành nghề kinh doanh
	  */
	public String getBusiness_Areas_Value () 
	{
		return (String)get_Value(COLUMNNAME_Business_Areas_Value);
	}

	/** Set Business_Areas_Year.
		@param Business_Areas_Year 
		Năm
	  */
	public void setBusiness_Areas_Year (String Business_Areas_Year)
	{
		set_Value (COLUMNNAME_Business_Areas_Year, Business_Areas_Year);
	}

	/** Get Business_Areas_Year.
		@return Năm
	  */
	public String getBusiness_Areas_Year () 
	{
		return (String)get_Value(COLUMNNAME_Business_Areas_Year);
	}

	/** Set JobName.
		@param JobName JobName	  */
	public void setJobName (String JobName)
	{
		set_Value (COLUMNNAME_JobName, JobName);
	}

	/** Get JobName.
		@return JobName	  */
	public String getJobName () 
	{
		return (String)get_Value(COLUMNNAME_JobName);
	}

	/** Set TDAB_Business_Areas.
		@param TDAB_Business_Areas_ID TDAB_Business_Areas	  */
	public void setTDAB_Business_Areas_ID (int TDAB_Business_Areas_ID)
	{
		if (TDAB_Business_Areas_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Business_Areas_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Business_Areas_ID, Integer.valueOf(TDAB_Business_Areas_ID));
	}

	/** Get TDAB_Business_Areas.
		@return TDAB_Business_Areas	  */
	public int getTDAB_Business_Areas_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Business_Areas_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Business_Areas_TQ.
		@param TDAB_Business_Areas_TQ_ID TDAB_Business_Areas_TQ	  */
	public void setTDAB_Business_Areas_TQ_ID (int TDAB_Business_Areas_TQ_ID)
	{
		if (TDAB_Business_Areas_TQ_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Business_Areas_TQ_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Business_Areas_TQ_ID, Integer.valueOf(TDAB_Business_Areas_TQ_ID));
	}

	/** Get TDAB_Business_Areas_TQ.
		@return TDAB_Business_Areas_TQ	  */
	public int getTDAB_Business_Areas_TQ_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Business_Areas_TQ_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Business_Areas_UU.
		@param TDAB_Business_Areas_UU TDAB_Business_Areas_UU	  */
	public void setTDAB_Business_Areas_UU (String TDAB_Business_Areas_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Business_Areas_UU, TDAB_Business_Areas_UU);
	}

	/** Get TDAB_Business_Areas_UU.
		@return TDAB_Business_Areas_UU	  */
	public String getTDAB_Business_Areas_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Business_Areas_UU);
	}
}