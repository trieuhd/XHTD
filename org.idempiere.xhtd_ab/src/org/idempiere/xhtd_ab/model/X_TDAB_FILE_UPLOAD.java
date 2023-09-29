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

/** Generated Model for TDAB_FILE_UPLOAD
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_FILE_UPLOAD extends PO implements I_TDAB_FILE_UPLOAD, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230314L;

    /** Standard Constructor */
    public X_TDAB_FILE_UPLOAD (Properties ctx, int TDAB_FILE_UPLOAD_ID, String trxName)
    {
      super (ctx, TDAB_FILE_UPLOAD_ID, trxName);
      /** if (TDAB_FILE_UPLOAD_ID == 0)
        {
			setTDAB_FILE_UPLOAD_ID (0);
			setTDAB_FILE_UPLOAD_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_FILE_UPLOAD (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_FILE_UPLOAD[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set File_Upload.
		@param File_Upload File_Upload	  */
	public void setFile_Upload (String File_Upload)
	{
		set_Value (COLUMNNAME_File_Upload, File_Upload);
	}

	/** Get File_Upload.
		@return File_Upload	  */
	public String getFile_Upload () 
	{
		return (String)get_Value(COLUMNNAME_File_Upload);
	}

	/** Set TDAB_FILE_UPLOAD.
		@param TDAB_FILE_UPLOAD_ID TDAB_FILE_UPLOAD	  */
	public void setTDAB_FILE_UPLOAD_ID (int TDAB_FILE_UPLOAD_ID)
	{
		if (TDAB_FILE_UPLOAD_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_FILE_UPLOAD_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_FILE_UPLOAD_ID, Integer.valueOf(TDAB_FILE_UPLOAD_ID));
	}

	/** Get TDAB_FILE_UPLOAD.
		@return TDAB_FILE_UPLOAD	  */
	public int getTDAB_FILE_UPLOAD_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_FILE_UPLOAD_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_FILE_UPLOAD_UU.
		@param TDAB_FILE_UPLOAD_UU TDAB_FILE_UPLOAD_UU	  */
	public void setTDAB_FILE_UPLOAD_UU (String TDAB_FILE_UPLOAD_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_FILE_UPLOAD_UU, TDAB_FILE_UPLOAD_UU);
	}

	/** Get TDAB_FILE_UPLOAD_UU.
		@return TDAB_FILE_UPLOAD_UU	  */
	public String getTDAB_FILE_UPLOAD_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_FILE_UPLOAD_UU);
	}
}