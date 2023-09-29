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

/** Generated Model for TDAB_FILE_IMPORT_USER
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_FILE_IMPORT_USER extends PO implements I_TDAB_FILE_IMPORT_USER, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210811L;

    /** Standard Constructor */
    public X_TDAB_FILE_IMPORT_USER (Properties ctx, int TDAB_FILE_IMPORT_USER_ID, String trxName)
    {
      super (ctx, TDAB_FILE_IMPORT_USER_ID, trxName);
      /** if (TDAB_FILE_IMPORT_USER_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_TDAB_FILE_IMPORT_USER (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_FILE_IMPORT_USER[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_Role getAD_Role() throws RuntimeException
    {
		return (org.compiere.model.I_AD_Role)MTable.get(getCtx(), org.compiere.model.I_AD_Role.Table_Name)
			.getPO(getAD_Role_ID(), get_TrxName());	}

	/** Set Role.
		@param AD_Role_ID 
		Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID)
	{
		if (AD_Role_ID < 0) 
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Role_ID, Integer.valueOf(AD_Role_ID));
	}

	/** Get Role.
		@return Responsibility Role
	  */
	public int getAD_Role_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Role_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
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

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set Error_Log.
		@param Error_Log Error_Log	  */
	public void setError_Log (String Error_Log)
	{
		set_Value (COLUMNNAME_Error_Log, Error_Log);
	}

	/** Get Error_Log.
		@return Error_Log	  */
	public String getError_Log () 
	{
		return (String)get_Value(COLUMNNAME_Error_Log);
	}

	/** Set LDAP User Name.
		@param LDAPUser 
		User Name used for authorization via LDAP (directory) services
	  */
	public void setLDAPUser (String LDAPUser)
	{
		set_Value (COLUMNNAME_LDAPUser, LDAPUser);
	}

	/** Get LDAP User Name.
		@return User Name used for authorization via LDAP (directory) services
	  */
	public String getLDAPUser () 
	{
		return (String)get_Value(COLUMNNAME_LDAPUser);
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

	/** Set Org_Value.
		@param Org_Value Org_Value	  */
	public void setOrg_Value (String Org_Value)
	{
		set_Value (COLUMNNAME_Org_Value, Org_Value);
	}

	/** Get Org_Value.
		@return Org_Value	  */
	public String getOrg_Value () 
	{
		return (String)get_Value(COLUMNNAME_Org_Value);
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

	/** Set Status.
		@param Status 
		Status of the currently running check
	  */
	public void setStatus (String Status)
	{
		set_Value (COLUMNNAME_Status, Status);
	}

	/** Get Status.
		@return Status of the currently running check
	  */
	public String getStatus () 
	{
		return (String)get_Value(COLUMNNAME_Status);
	}

	public I_TDAB_FILE_IMPORT getTDAB_FILE_IMPORT() throws RuntimeException
    {
		return (I_TDAB_FILE_IMPORT)MTable.get(getCtx(), I_TDAB_FILE_IMPORT.Table_Name)
			.getPO(getTDAB_FILE_IMPORT_ID(), get_TrxName());	}

	/** Set TDAB_FILE_IMPORT.
		@param TDAB_FILE_IMPORT_ID TDAB_FILE_IMPORT	  */
	public void setTDAB_FILE_IMPORT_ID (int TDAB_FILE_IMPORT_ID)
	{
		if (TDAB_FILE_IMPORT_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_FILE_IMPORT_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_FILE_IMPORT_ID, Integer.valueOf(TDAB_FILE_IMPORT_ID));
	}

	/** Get TDAB_FILE_IMPORT.
		@return TDAB_FILE_IMPORT	  */
	public int getTDAB_FILE_IMPORT_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_FILE_IMPORT_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_FILE_IMPORT_USER.
		@param TDAB_FILE_IMPORT_USER_ID TDAB_FILE_IMPORT_USER	  */
	public void setTDAB_FILE_IMPORT_USER_ID (int TDAB_FILE_IMPORT_USER_ID)
	{
		if (TDAB_FILE_IMPORT_USER_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_FILE_IMPORT_USER_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_FILE_IMPORT_USER_ID, Integer.valueOf(TDAB_FILE_IMPORT_USER_ID));
	}

	/** Get TDAB_FILE_IMPORT_USER.
		@return TDAB_FILE_IMPORT_USER	  */
	public int getTDAB_FILE_IMPORT_USER_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_FILE_IMPORT_USER_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_FILE_IMPORT_USER_UU.
		@param TDAB_FILE_IMPORT_USER_UU TDAB_FILE_IMPORT_USER_UU	  */
	public void setTDAB_FILE_IMPORT_USER_UU (String TDAB_FILE_IMPORT_USER_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_FILE_IMPORT_USER_UU, TDAB_FILE_IMPORT_USER_UU);
	}

	/** Get TDAB_FILE_IMPORT_USER_UU.
		@return TDAB_FILE_IMPORT_USER_UU	  */
	public String getTDAB_FILE_IMPORT_USER_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_FILE_IMPORT_USER_UU);
	}

	/** Set Title.
		@param Title 
		Name this entity is referred to as
	  */
	public void setTitle (String Title)
	{
		set_ValueNoCheck (COLUMNNAME_Title, Title);
	}

	/** Get Title.
		@return Name this entity is referred to as
	  */
	public String getTitle () 
	{
		return (String)get_Value(COLUMNNAME_Title);
	}
}