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

/** Generated Model for TDAB_ORG_DETAIL
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_ORG_DETAIL extends PO implements I_TDAB_ORG_DETAIL, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210425L;

    /** Standard Constructor */
    public X_TDAB_ORG_DETAIL (Properties ctx, int TDAB_ORG_DETAIL_ID, String trxName)
    {
      super (ctx, TDAB_ORG_DETAIL_ID, trxName);
      /** if (TDAB_ORG_DETAIL_ID == 0)
        {
			setTDAB_ORG_DETAIL_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TDAB_ORG_DETAIL (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_ORG_DETAIL[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Active.
		@param Active Active	  */
	public void setActive (boolean Active)
	{
		set_Value (COLUMNNAME_Active, Boolean.valueOf(Active));
	}

	/** Get Active.
		@return Active	  */

	/** Set Area Code.
		@param AreaCode 
		Phone Area Code
	  */
	public void setAreaCode (String AreaCode)
	{
		set_Value (COLUMNNAME_AreaCode, AreaCode);
	}

	/** Get Area Code.
		@return Phone Area Code
	  */
	public String getAreaCode () 
	{
		return (String)get_Value(COLUMNNAME_AreaCode);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
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

	/** Set S_Org_ID.
		@param S_Org_ID S_Org_ID	  */
	public void setS_Org_ID (int S_Org_ID)
	{
		if (S_Org_ID < 1) 
			set_Value (COLUMNNAME_S_Org_ID, null);
		else 
			set_Value (COLUMNNAME_S_Org_ID, Integer.valueOf(S_Org_ID));
	}

	/** Get S_Org_ID.
		@return S_Org_ID	  */
	public int getS_Org_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_S_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_ORG_DETAIL.
		@param TDAB_ORG_DETAIL_ID TDAB_ORG_DETAIL	  */
	public void setTDAB_ORG_DETAIL_ID (int TDAB_ORG_DETAIL_ID)
	{
		if (TDAB_ORG_DETAIL_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_ORG_DETAIL_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_ORG_DETAIL_ID, Integer.valueOf(TDAB_ORG_DETAIL_ID));
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

	/** Set TDAB_ORG_DETAIL_UU.
		@param TDAB_ORG_DETAIL_UU TDAB_ORG_DETAIL_UU	  */
	public void setTDAB_ORG_DETAIL_UU (String TDAB_ORG_DETAIL_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_ORG_DETAIL_UU, TDAB_ORG_DETAIL_UU);
	}

	/** Get TDAB_ORG_DETAIL_UU.
		@return TDAB_ORG_DETAIL_UU	  */
	public String getTDAB_ORG_DETAIL_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_ORG_DETAIL_UU);
	}

	public I_TDAB_Org getTDAB_Org() throws RuntimeException
    {
		return (I_TDAB_Org)MTable.get(getCtx(), I_TDAB_Org.Table_Name)
			.getPO(getTDAB_Org_ID(), get_TrxName());	}

	/** Set TDAB_Org.
		@param TDAB_Org_ID TDAB_Org	  */
	public void setTDAB_Org_ID (int TDAB_Org_ID)
	{
		if (TDAB_Org_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Org_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Org_ID, Integer.valueOf(TDAB_Org_ID));
	}

	/** Get TDAB_Org.
		@return TDAB_Org	  */
	public int getTDAB_Org_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
}