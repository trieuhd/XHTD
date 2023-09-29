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

/** Generated Model for TDAB_Early_Warning_Question
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Early_Warning_Question extends PO implements I_TDAB_Early_Warning_Question, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210309L;

    /** Standard Constructor */
    public X_TDAB_Early_Warning_Question (Properties ctx, int TDAB_Early_Warning_Question_ID, String trxName)
    {
      super (ctx, TDAB_Early_Warning_Question_ID, trxName);
      /** if (TDAB_Early_Warning_Question_ID == 0)
        {
			setCode (null);
			setName (null);
			setTDAB_Early_Warning_Question_ID (0);
			setTDAB_Early_Warning_Question_UU (null);
			setWarning_Question_Level (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Early_Warning_Question (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Early_Warning_Question[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Action_Download.
		@param Action_Download Action_Download	  */
	public void setAction_Download (String Action_Download)
	{
		set_Value (COLUMNNAME_Action_Download, Action_Download);
	}

	/** Get Action_Download.
		@return Action_Download	  */
	public String getAction_Download () 
	{
		return (String)get_Value(COLUMNNAME_Action_Download);
	}

	/** Set Active.
		@param Active Active	  */
	public void setActive (String Active)
	{
		set_Value (COLUMNNAME_Active, Active);
	}

	/** Get Active.
		@return Active	  */
	public String getActive () 
	{
		return (String)get_Value(COLUMNNAME_Active);
	}

	/** Set Validation code.
		@param Code 
		Mã tiêu chí
	  */
	public void setCode (String Code)
	{
		set_ValueNoCheck (COLUMNNAME_Code, Code);
	}

	/** Get Validation code.
		@return Mã tiêu chí
	  */
	public String getCode () 
	{
		return (String)get_Value(COLUMNNAME_Code);
	}

	/** Set File_Name.
		@param File_Name File_Name	  */
	public void setFile_Name (String File_Name)
	{
		set_ValueNoCheck (COLUMNNAME_File_Name, File_Name);
	}

	/** Get File_Name.
		@return File_Name	  */
	public String getFile_Name () 
	{
		return (String)get_Value(COLUMNNAME_File_Name);
	}

	/** Set File_Path.
		@param File_Path File_Path	  */
	public void setFile_Path (String File_Path)
	{
		set_Value (COLUMNNAME_File_Path, File_Path);
	}

	/** Get File_Path.
		@return File_Path	  */
	public String getFile_Path () 
	{
		return (String)get_Value(COLUMNNAME_File_Path);
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

	/** Set TDAB_Early_Warning_Question.
		@param TDAB_Early_Warning_Question_ID TDAB_Early_Warning_Question	  */
	public void setTDAB_Early_Warning_Question_ID (int TDAB_Early_Warning_Question_ID)
	{
		if (TDAB_Early_Warning_Question_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Early_Warning_Question_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Early_Warning_Question_ID, Integer.valueOf(TDAB_Early_Warning_Question_ID));
	}

	/** Get TDAB_Early_Warning_Question.
		@return TDAB_Early_Warning_Question	  */
	public int getTDAB_Early_Warning_Question_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Early_Warning_Question_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Early_Warning_Question_UU.
		@param TDAB_Early_Warning_Question_UU TDAB_Early_Warning_Question_UU	  */
	public void setTDAB_Early_Warning_Question_UU (String TDAB_Early_Warning_Question_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Early_Warning_Question_UU, TDAB_Early_Warning_Question_UU);
	}

	/** Get TDAB_Early_Warning_Question_UU.
		@return TDAB_Early_Warning_Question_UU	  */
	public String getTDAB_Early_Warning_Question_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Early_Warning_Question_UU);
	}

	/** Type 1 = 1 */
	public static final String TEMPLATE_TYPE_Type1 = "1";
	/** Type 2 = 2 */
	public static final String TEMPLATE_TYPE_Type2 = "2";
	/** Type 3 = 3 */
	public static final String TEMPLATE_TYPE_Type3 = "3";
	/** Type 4 = 4 */
	public static final String TEMPLATE_TYPE_Type4 = "4";
	/** Type 5 = 5 */
	public static final String TEMPLATE_TYPE_Type5 = "5";
	/** Type 6 = 6 */
	public static final String TEMPLATE_TYPE_Type6 = "6";
	/** Set Template_Type.
		@param Template_Type Template_Type	  */
	public void setTemplate_Type (String Template_Type)
	{

		set_ValueNoCheck (COLUMNNAME_Template_Type, Template_Type);
	}

	/** Get Template_Type.
		@return Template_Type	  */
	public String getTemplate_Type () 
	{
		return (String)get_Value(COLUMNNAME_Template_Type);
	}

	/** 1 = 1 */
	public static final String WARNING_QUESTION_LEVEL_1 = "1";
	/** 2 = 2 */
	public static final String WARNING_QUESTION_LEVEL_2 = "2";
	/** Set Warning_Question_Level.
		@param Warning_Question_Level 
		Mức độ
	  */
	public void setWarning_Question_Level (String Warning_Question_Level)
	{

		set_Value (COLUMNNAME_Warning_Question_Level, Warning_Question_Level);
	}

	/** Get Warning_Question_Level.
		@return Mức độ
	  */
	public String getWarning_Question_Level () 
	{
		return (String)get_Value(COLUMNNAME_Warning_Question_Level);
	}
}