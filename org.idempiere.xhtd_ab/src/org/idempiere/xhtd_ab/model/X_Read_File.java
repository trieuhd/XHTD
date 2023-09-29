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

/** Generated Model for Read_File
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_Read_File extends PO implements I_Read_File, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230210L;

    /** Standard Constructor */
    public X_Read_File (Properties ctx, int Read_File_ID, String trxName)
    {
      super (ctx, Read_File_ID, trxName);
      /** if (Read_File_ID == 0)
        {
			setRead_File_ID (0);
			setRead_File_UU (null);
        } */
    }

    /** Load Constructor */
    public X_Read_File (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Read_File[")
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

	/** Set Read_File.
		@param Read_File_ID Read_File	  */
	public void setRead_File_ID (int Read_File_ID)
	{
		if (Read_File_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Read_File_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Read_File_ID, Integer.valueOf(Read_File_ID));
	}

	/** Get Read_File.
		@return Read_File	  */
	public int getRead_File_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Read_File_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Read_File_UU.
		@param Read_File_UU Read_File_UU	  */
	public void setRead_File_UU (String Read_File_UU)
	{
		set_ValueNoCheck (COLUMNNAME_Read_File_UU, Read_File_UU);
	}

	/** Get Read_File_UU.
		@return Read_File_UU	  */
	public String getRead_File_UU () 
	{
		return (String)get_Value(COLUMNNAME_Read_File_UU);
	}
}