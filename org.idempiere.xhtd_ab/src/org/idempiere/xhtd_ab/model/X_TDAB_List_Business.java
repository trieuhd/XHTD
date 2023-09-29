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

/** Generated Model for TDAB_List_Business
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_List_Business extends PO implements I_TDAB_List_Business, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210130L;

    /** Standard Constructor */
    public X_TDAB_List_Business (Properties ctx, int TDAB_List_Business_ID, String trxName)
    {
      super (ctx, TDAB_List_Business_ID, trxName);
      /** if (TDAB_List_Business_ID == 0)
        {
			setName (null);
			setTDAB_List_Business_ID (0);
			setTDAB_List_Business_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_List_Business (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_List_Business[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Validation code.
		@param Code 
		Validation Code
	  */
	public void setCode (String Code)
	{
		set_Value (COLUMNNAME_Code, Code);
	}

	/** Get Validation code.
		@return Validation Code
	  */
	public String getCode () 
	{
		return (String)get_Value(COLUMNNAME_Code);
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

	/** Set TDAB_List_Business.
		@param TDAB_List_Business_ID TDAB_List_Business	  */
	public void setTDAB_List_Business_ID (int TDAB_List_Business_ID)
	{
		if (TDAB_List_Business_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_List_Business_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_List_Business_ID, Integer.valueOf(TDAB_List_Business_ID));
	}

	/** Get TDAB_List_Business.
		@return TDAB_List_Business	  */
	public int getTDAB_List_Business_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_List_Business_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_List_Business_UU.
		@param TDAB_List_Business_UU TDAB_List_Business_UU	  */
	public void setTDAB_List_Business_UU (String TDAB_List_Business_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_List_Business_UU, TDAB_List_Business_UU);
	}

	/** Get TDAB_List_Business_UU.
		@return TDAB_List_Business_UU	  */
	public String getTDAB_List_Business_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_List_Business_UU);
	}
}