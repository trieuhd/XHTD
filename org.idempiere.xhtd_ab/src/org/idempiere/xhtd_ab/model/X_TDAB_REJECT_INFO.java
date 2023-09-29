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

/** Generated Model for TDAB_REJECT_INFO
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_REJECT_INFO extends PO implements I_TDAB_REJECT_INFO, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210125L;

    /** Standard Constructor */
    public X_TDAB_REJECT_INFO (Properties ctx, int TDAB_REJECT_INFO_ID, String trxName)
    {
      super (ctx, TDAB_REJECT_INFO_ID, trxName);
      /** if (TDAB_REJECT_INFO_ID == 0)
        {
			setAD_User_ID (0);
			setTDAB_REJECT_INFO_ID (0);
			setTDAB_REJECT_INFO_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_REJECT_INFO (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_REJECT_INFO[")
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

	/** Set DATE_REFUSE.
		@param DATE_REFUSE DATE_REFUSE	  */
	public void setDATE_REFUSE (Timestamp DATE_REFUSE)
	{
		set_Value (COLUMNNAME_DATE_REFUSE, DATE_REFUSE);
	}

	/** Get DATE_REFUSE.
		@return DATE_REFUSE	  */
	public Timestamp getDATE_REFUSE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DATE_REFUSE);
	}

	/** Set NREFUSE.
		@param NREFUSE NREFUSE	  */
	public void setNREFUSE (int NREFUSE)
	{
		set_Value (COLUMNNAME_NREFUSE, Integer.valueOf(NREFUSE));
	}

	/** Get NREFUSE.
		@return NREFUSE	  */
	public int getNREFUSE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NREFUSE);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Note.
		@param Note 
		Optional additional user defined information
	  */
	public void setNote (String Note)
	{
		set_Value (COLUMNNAME_Note, Note);
	}

	/** Get Note.
		@return Optional additional user defined information
	  */
	public String getNote () 
	{
		return (String)get_Value(COLUMNNAME_Note);
	}

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException
    {
		return (I_TDAB_Customer_Profile)MTable.get(getCtx(), I_TDAB_Customer_Profile.Table_Name)
			.getPO(getTDAB_Customer_Profile_ID(), get_TrxName());	}

	/** Set TDAB_Customer_Profile.
		@param TDAB_Customer_Profile_ID TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID)
	{
		if (TDAB_Customer_Profile_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Profile_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Profile_ID, Integer.valueOf(TDAB_Customer_Profile_ID));
	}

	/** Get TDAB_Customer_Profile.
		@return TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Customer_Profile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Lich su tu choi.
		@param TDAB_REJECT_INFO_ID Lich su tu choi	  */
	public void setTDAB_REJECT_INFO_ID (int TDAB_REJECT_INFO_ID)
	{
		if (TDAB_REJECT_INFO_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_REJECT_INFO_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_REJECT_INFO_ID, Integer.valueOf(TDAB_REJECT_INFO_ID));
	}

	/** Get Lich su tu choi.
		@return Lich su tu choi	  */
	public int getTDAB_REJECT_INFO_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_REJECT_INFO_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_REJECT_INFO_UU.
		@param TDAB_REJECT_INFO_UU TDAB_REJECT_INFO_UU	  */
	public void setTDAB_REJECT_INFO_UU (String TDAB_REJECT_INFO_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_REJECT_INFO_UU, TDAB_REJECT_INFO_UU);
	}

	/** Get TDAB_REJECT_INFO_UU.
		@return TDAB_REJECT_INFO_UU	  */
	public String getTDAB_REJECT_INFO_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_REJECT_INFO_UU);
	}

	public org.compiere.model.I_AD_User getUser_Checked() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser_Checked_ID(), get_TrxName());	}

	/** Set User_Checked_ID.
		@param User_Checked_ID User_Checked_ID	  */
	public void setUser_Checked_ID (int User_Checked_ID)
	{
		if (User_Checked_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_User_Checked_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_User_Checked_ID, Integer.valueOf(User_Checked_ID));
	}

	/** Get User_Checked_ID.
		@return User_Checked_ID	  */
	public int getUser_Checked_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User_Checked_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}