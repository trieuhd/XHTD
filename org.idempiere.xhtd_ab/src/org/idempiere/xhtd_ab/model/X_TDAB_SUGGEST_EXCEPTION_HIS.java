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

/** Generated Model for TDAB_SUGGEST_EXCEPTION_HIS
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_SUGGEST_EXCEPTION_HIS extends PO implements I_TDAB_SUGGEST_EXCEPTION_HIS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210327L;

    /** Standard Constructor */
    public X_TDAB_SUGGEST_EXCEPTION_HIS (Properties ctx, int TDAB_SUGGEST_EXCEPTION_HIS_ID, String trxName)
    {
      super (ctx, TDAB_SUGGEST_EXCEPTION_HIS_ID, trxName);
      /** if (TDAB_SUGGEST_EXCEPTION_HIS_ID == 0)
        {
			setTDAB_SUGGEST_EXCEPTION_HIS_ID (0);
			setTDAB_SUGGEST_EXCEPTION_HIS_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_SUGGEST_EXCEPTION_HIS (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_SUGGEST_EXCEPTION_HIS[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set DownloadExceptionFile.
		@param DownloadExceptionFile DownloadExceptionFile	  */
	public void setDownloadExceptionFile (String DownloadExceptionFile)
	{
		set_Value (COLUMNNAME_DownloadExceptionFile, DownloadExceptionFile);
	}

	/** Get DownloadExceptionFile.
		@return DownloadExceptionFile	  */
	public String getDownloadExceptionFile () 
	{
		return (String)get_Value(COLUMNNAME_DownloadExceptionFile);
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

	/** Set HisCreatedAt.
		@param HisCreatedAt HisCreatedAt	  */
	public void setHisCreatedAt (Timestamp HisCreatedAt)
	{
		set_Value (COLUMNNAME_HisCreatedAt, HisCreatedAt);
	}

	/** Get HisCreatedAt.
		@return HisCreatedAt	  */
	public Timestamp getHisCreatedAt () 
	{
		return (Timestamp)get_Value(COLUMNNAME_HisCreatedAt);
	}

	/** Set HisCreatedBy.
		@param HisCreatedBy HisCreatedBy	  */
	public void setHisCreatedBy (String HisCreatedBy)
	{
		set_Value (COLUMNNAME_HisCreatedBy, HisCreatedBy);
	}

	/** Get HisCreatedBy.
		@return HisCreatedBy	  */
	public String getHisCreatedBy () 
	{
		return (String)get_Value(COLUMNNAME_HisCreatedBy);
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

	/** Set TDAB_SUGGEST_EXCEPTION_HIS.
		@param TDAB_SUGGEST_EXCEPTION_HIS_ID TDAB_SUGGEST_EXCEPTION_HIS	  */
	public void setTDAB_SUGGEST_EXCEPTION_HIS_ID (int TDAB_SUGGEST_EXCEPTION_HIS_ID)
	{
		if (TDAB_SUGGEST_EXCEPTION_HIS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_SUGGEST_EXCEPTION_HIS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_SUGGEST_EXCEPTION_HIS_ID, Integer.valueOf(TDAB_SUGGEST_EXCEPTION_HIS_ID));
	}

	/** Get TDAB_SUGGEST_EXCEPTION_HIS.
		@return TDAB_SUGGEST_EXCEPTION_HIS	  */
	public int getTDAB_SUGGEST_EXCEPTION_HIS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_SUGGEST_EXCEPTION_HIS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_SUGGEST_EXCEPTION_HIS_UU.
		@param TDAB_SUGGEST_EXCEPTION_HIS_UU TDAB_SUGGEST_EXCEPTION_HIS_UU	  */
	public void setTDAB_SUGGEST_EXCEPTION_HIS_UU (String TDAB_SUGGEST_EXCEPTION_HIS_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_SUGGEST_EXCEPTION_HIS_UU, TDAB_SUGGEST_EXCEPTION_HIS_UU);
	}

	/** Get TDAB_SUGGEST_EXCEPTION_HIS_UU.
		@return TDAB_SUGGEST_EXCEPTION_HIS_UU	  */
	public String getTDAB_SUGGEST_EXCEPTION_HIS_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_SUGGEST_EXCEPTION_HIS_UU);
	}

	public I_TDAB_Suggest_Exception getTDAB_Suggest_Exception() throws RuntimeException
    {
		return (I_TDAB_Suggest_Exception)MTable.get(getCtx(), I_TDAB_Suggest_Exception.Table_Name)
			.getPO(getTDAB_Suggest_Exception_ID(), get_TrxName());	}

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