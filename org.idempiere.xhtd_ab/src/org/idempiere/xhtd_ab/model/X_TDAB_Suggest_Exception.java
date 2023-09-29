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

/** Generated Model for TDAB_Suggest_Exception
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Suggest_Exception extends PO implements I_TDAB_Suggest_Exception, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210404L;

    /** Standard Constructor */
    public X_TDAB_Suggest_Exception (Properties ctx, int TDAB_Suggest_Exception_ID, String trxName)
    {
      super (ctx, TDAB_Suggest_Exception_ID, trxName);
      /** if (TDAB_Suggest_Exception_ID == 0)
        {
			setAD_User_ID (0);
			setNote (null);
			setTDAB_Suggest_Exception_ID (0);
			setTDAB_Suggest_Exception_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Suggest_Exception (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Suggest_Exception[")
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

	/** Set BtnDownloadSuggestException.
		@param BtnDownloadSuggestException BtnDownloadSuggestException	  */
	public void setBtnDownloadSuggestException (String BtnDownloadSuggestException)
	{
		set_Value (COLUMNNAME_BtnDownloadSuggestException, BtnDownloadSuggestException);
	}

	/** Get BtnDownloadSuggestException.
		@return BtnDownloadSuggestException	  */
	public String getBtnDownloadSuggestException () 
	{
		return (String)get_Value(COLUMNNAME_BtnDownloadSuggestException);
	}

	/** Set Date_Suggest.
		@param Date_Suggest Date_Suggest	  */
	public void setDate_Suggest (Timestamp Date_Suggest)
	{
		set_Value (COLUMNNAME_Date_Suggest, Date_Suggest);
	}

	/** Get Date_Suggest.
		@return Date_Suggest	  */
	public Timestamp getDate_Suggest () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Suggest);
	}

	/** Set File_Suggest_CV.
		@param File_Suggest_CV File_Suggest_CV	  */
	public void setFile_Suggest_CV (String File_Suggest_CV)
	{
		set_Value (COLUMNNAME_File_Suggest_CV, File_Suggest_CV);
	}

	/** Get File_Suggest_CV.
		@return File_Suggest_CV	  */
	public String getFile_Suggest_CV () 
	{
		return (String)get_Value(COLUMNNAME_File_Suggest_CV);
	}

	/** Set File_Suggest_KS.
		@param File_Suggest_KS File_Suggest_KS	  */
	public void setFile_Suggest_KS (String File_Suggest_KS)
	{
		set_Value (COLUMNNAME_File_Suggest_KS, File_Suggest_KS);
	}

	/** Get File_Suggest_KS.
		@return File_Suggest_KS	  */
	public String getFile_Suggest_KS () 
	{
		return (String)get_Value(COLUMNNAME_File_Suggest_KS);
	}

	/** Set File_Suggest_TD.
		@param File_Suggest_TD File_Suggest_TD	  */
	public void setFile_Suggest_TD (String File_Suggest_TD)
	{
		set_Value (COLUMNNAME_File_Suggest_TD, File_Suggest_TD);
	}

	/** Get File_Suggest_TD.
		@return File_Suggest_TD	  */
	public String getFile_Suggest_TD () 
	{
		return (String)get_Value(COLUMNNAME_File_Suggest_TD);
	}

	/** Set NSuggest.
		@param NSuggest NSuggest	  */
	public void setNSuggest (int NSuggest)
	{
		set_Value (COLUMNNAME_NSuggest, Integer.valueOf(NSuggest));
	}

	/** Get NSuggest.
		@return NSuggest	  */
	public int getNSuggest () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NSuggest);
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

	/** Set De xuat ngoai le.
		@param TDAB_Suggest_Exception_ID De xuat ngoai le	  */
	public void setTDAB_Suggest_Exception_ID (int TDAB_Suggest_Exception_ID)
	{
		if (TDAB_Suggest_Exception_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Suggest_Exception_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Suggest_Exception_ID, Integer.valueOf(TDAB_Suggest_Exception_ID));
	}

	/** Get De xuat ngoai le.
		@return De xuat ngoai le	  */
	public int getTDAB_Suggest_Exception_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Suggest_Exception_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Suggest_Exception_UU.
		@param TDAB_Suggest_Exception_UU TDAB_Suggest_Exception_UU	  */
	public void setTDAB_Suggest_Exception_UU (String TDAB_Suggest_Exception_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Suggest_Exception_UU, TDAB_Suggest_Exception_UU);
	}

	/** Get TDAB_Suggest_Exception_UU.
		@return TDAB_Suggest_Exception_UU	  */
	public String getTDAB_Suggest_Exception_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Suggest_Exception_UU);
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