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

/** Generated Model for TDAB_User_Org
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_User_Org extends PO implements I_TDAB_User_Org, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210328L;

    /** Standard Constructor */
    public X_TDAB_User_Org (Properties ctx, int TDAB_User_Org_ID, String trxName)
    {
      super (ctx, TDAB_User_Org_ID, trxName);
      /** if (TDAB_User_Org_ID == 0)
        {
			setTDAB_ORG_DETAIL_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TDAB_User_Org (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_User_Org[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Parent link column.
		@param IsParent 
		This column is a link to the parent table (e.g. header from lines) - incl. Association key columns
	  */
	public void setIsParent (boolean IsParent)
	{
		set_Value (COLUMNNAME_IsParent, Boolean.valueOf(IsParent));
	}

	/** Get Parent link column.
		@return This column is a link to the parent table (e.g. header from lines) - incl. Association key columns
	  */
	public boolean isParent () 
	{
		Object oo = get_Value(COLUMNNAME_IsParent);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set ReadAndWrite.
		@param ReadAndWrite ReadAndWrite	  */
	public void setReadAndWrite (boolean ReadAndWrite)
	{
		set_Value (COLUMNNAME_ReadAndWrite, Boolean.valueOf(ReadAndWrite));
	}

	/** Get ReadAndWrite.
		@return ReadAndWrite	  */
	public boolean isReadAndWrite () 
	{
		Object oo = get_Value(COLUMNNAME_ReadAndWrite);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_TDAB_ORG_DETAIL getTDAB_ORG_DETAIL() throws RuntimeException
    {
		return (I_TDAB_ORG_DETAIL)MTable.get(getCtx(), I_TDAB_ORG_DETAIL.Table_Name)
			.getPO(getTDAB_ORG_DETAIL_ID(), get_TrxName());	}

	/** Set TDAB_ORG_DETAIL.
		@param TDAB_ORG_DETAIL_ID TDAB_ORG_DETAIL	  */
	public void setTDAB_ORG_DETAIL_ID (int TDAB_ORG_DETAIL_ID)
	{
		if (TDAB_ORG_DETAIL_ID < 1) 
			set_Value (COLUMNNAME_TDAB_ORG_DETAIL_ID, null);
		else 
			set_Value (COLUMNNAME_TDAB_ORG_DETAIL_ID, Integer.valueOf(TDAB_ORG_DETAIL_ID));
	}

	/** Get TDAB_ORG_DETAIL.
		@return TDAB_ORG_DETAIL	  */
	public int getTDAB_ORG_DETAIL_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_ORG_DETAIL_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_User_Org.
		@param TDAB_User_Org_ID TDAB_User_Org	  */
	public void setTDAB_User_Org_ID (int TDAB_User_Org_ID)
	{
		if (TDAB_User_Org_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_User_Org_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_User_Org_ID, Integer.valueOf(TDAB_User_Org_ID));
	}

	/** Get TDAB_User_Org.
		@return TDAB_User_Org	  */
	public int getTDAB_User_Org_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_User_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_User_Org_UU.
		@param TDAB_User_Org_UU TDAB_User_Org_UU	  */
	public void setTDAB_User_Org_UU (String TDAB_User_Org_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_User_Org_UU, TDAB_User_Org_UU);
	}

	/** Get TDAB_User_Org_UU.
		@return TDAB_User_Org_UU	  */
	public String getTDAB_User_Org_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_User_Org_UU);
	}
}