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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for TDAB_SET_OF_STANDARD
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_SET_OF_STANDARD extends PO implements I_TDAB_SET_OF_STANDARD, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20201228L;

    /** Standard Constructor */
    public X_TDAB_SET_OF_STANDARD (Properties ctx, int TDAB_SET_OF_STANDARD_ID, String trxName)
    {
      super (ctx, TDAB_SET_OF_STANDARD_ID, trxName);
      /** if (TDAB_SET_OF_STANDARD_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_TDAB_SET_OF_STANDARD (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_SET_OF_STANDARD[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Has not submitted Control = LDR */
	public static final String ACTIONAP_HasNotSubmittedControl = "LDR";
	/** Suggest Editing = KDR */
	public static final String ACTIONAP_SuggestEditing = "KDR";
	/** PDR Suggest editing = PDR */
	public static final String ACTIONAP_PDRSuggestEditing = "PDR";
	/** Edit Profile Unlocked = UDR */
	public static final String ACTIONAP_EditProfileUnlocked = "UDR";
	/** Submit Control = DKS */
	public static final String ACTIONAP_SubmitControl = "DKS";
	/** Submit Approval = DPD */
	public static final String ACTIONAP_SubmitApproval = "DPD";
	/** Approved = DPA */
	public static final String ACTIONAP_Approved = "DPA";
	/** Offer To Unlock = UPA */
	public static final String ACTIONAP_OfferToUnlock = "UPA";
	/** Expired = EXP */
	public static final String ACTIONAP_Expired = "EXP";
	/** Set ActionAp.
		@param ActionAp ActionAp	  */
	public void setActionAp (String ActionAp)
	{

		set_Value (COLUMNNAME_ActionAp, ActionAp);
	}

	/** Get ActionAp.
		@return ActionAp	  */
	public String getActionAp () 
	{
		return (String)get_Value(COLUMNNAME_ActionAp);
	}

	/** Set ActionCd.
		@param ActionCd ActionCd	  */
	public void setActionCd (String ActionCd)
	{
		set_Value (COLUMNNAME_ActionCd, ActionCd);
	}

	/** Get ActionCd.
		@return ActionCd	  */
	public String getActionCd () 
	{
		return (String)get_Value(COLUMNNAME_ActionCd);
	}

	/** Set ActionKs.
		@param ActionKs ActionKs	  */
	public void setActionKs (String ActionKs)
	{
		set_Value (COLUMNNAME_ActionKs, ActionKs);
	}

	/** Get ActionKs.
		@return ActionKs	  */
	public String getActionKs () 
	{
		return (String)get_Value(COLUMNNAME_ActionKs);
	}

	/** Set ActionUnlock.
		@param ActionUnlock ActionUnlock	  */
	public void setActionUnlock (String ActionUnlock)
	{
		set_Value (COLUMNNAME_ActionUnlock, ActionUnlock);
	}

	/** Get ActionUnlock.
		@return ActionUnlock	  */
	public String getActionUnlock () 
	{
		return (String)get_Value(COLUMNNAME_ActionUnlock);
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

	/** Set EXPIRED_DATE.
		@param EXPIRED_DATE EXPIRED_DATE	  */
	public void setEXPIRED_DATE (Timestamp EXPIRED_DATE)
	{
		set_ValueNoCheck (COLUMNNAME_EXPIRED_DATE, EXPIRED_DATE);
	}

	/** Get EXPIRED_DATE.
		@return EXPIRED_DATE	  */
	public Timestamp getEXPIRED_DATE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EXPIRED_DATE);
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

	/** Set Start Date.
		@param StartDate 
		First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
	}

	/** Set TDAB_SET_OF_STANDARD.
		@param TDAB_SET_OF_STANDARD_ID TDAB_SET_OF_STANDARD	  */
	public void setTDAB_SET_OF_STANDARD_ID (int TDAB_SET_OF_STANDARD_ID)
	{
		if (TDAB_SET_OF_STANDARD_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_SET_OF_STANDARD_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_SET_OF_STANDARD_ID, Integer.valueOf(TDAB_SET_OF_STANDARD_ID));
	}

	/** Get TDAB_SET_OF_STANDARD.
		@return TDAB_SET_OF_STANDARD	  */
	public int getTDAB_SET_OF_STANDARD_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_SET_OF_STANDARD_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_SET_OF_STANDARD_UU.
		@param TDAB_SET_OF_STANDARD_UU TDAB_SET_OF_STANDARD_UU	  */
	public void setTDAB_SET_OF_STANDARD_UU (String TDAB_SET_OF_STANDARD_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_SET_OF_STANDARD_UU, TDAB_SET_OF_STANDARD_UU);
	}

	/** Get TDAB_SET_OF_STANDARD_UU.
		@return TDAB_SET_OF_STANDARD_UU	  */
	public String getTDAB_SET_OF_STANDARD_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_SET_OF_STANDARD_UU);
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