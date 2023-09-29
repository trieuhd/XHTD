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

/** Generated Model for TDAB_Warning
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Warning extends PO implements I_TDAB_Warning, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210131L;

    /** Standard Constructor */
    public X_TDAB_Warning (Properties ctx, int TDAB_Warning_ID, String trxName)
    {
      super (ctx, TDAB_Warning_ID, trxName);
      /** if (TDAB_Warning_ID == 0)
        {
			setTDAB_Warning_ID (0);
			setTDAB_Warning_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Warning (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Warning[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Answer.
		@param Answer Answer	  */
	public void setAnswer (String Answer)
	{
		set_Value (COLUMNNAME_Answer, Answer);
	}

	/** Get Answer.
		@return Answer	  */
	public String getAnswer () 
	{
		return (String)get_Value(COLUMNNAME_Answer);
	}

	/** Set Validation code.
		@param Code 
		Validation Code
	  */
	public void setCode (String Code)
	{
		set_Value (COLUMNNAME_Code, Code);
	}

	/** Get Validation code.
		@return Validation Code
	  */
	public String getCode () 
	{
		return (String)get_Value(COLUMNNAME_Code);
	}

	public I_TDAB_Early_Warning_Question getName() throws RuntimeException
    {
		return (I_TDAB_Early_Warning_Question)MTable.get(getCtx(), I_TDAB_Early_Warning_Question.Table_Name)
			.getPO(getName_ID(), get_TrxName());	}

	/** Set Name_ID.
		@param Name_ID Name_ID	  */
	public void setName_ID (int Name_ID)
	{
		if (Name_ID < 1) 
			set_Value (COLUMNNAME_Name_ID, null);
		else 
			set_Value (COLUMNNAME_Name_ID, Integer.valueOf(Name_ID));
	}

	/** Get Name_ID.
		@return Name_ID	  */
	public int getName_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Name_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Set_Indicator.
		@param TDAB_Set_Indicator_ID TDAB_Set_Indicator	  */
	public void setTDAB_Set_Indicator_ID (int TDAB_Set_Indicator_ID)
	{
		if (TDAB_Set_Indicator_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Set_Indicator_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Set_Indicator_ID, Integer.valueOf(TDAB_Set_Indicator_ID));
	}

	/** Get TDAB_Set_Indicator.
		@return TDAB_Set_Indicator	  */
	public int getTDAB_Set_Indicator_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Set_Indicator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Warning.
		@param TDAB_Warning_ID TDAB_Warning	  */
	public void setTDAB_Warning_ID (int TDAB_Warning_ID)
	{
		if (TDAB_Warning_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Warning_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Warning_ID, Integer.valueOf(TDAB_Warning_ID));
	}

	/** Get TDAB_Warning.
		@return TDAB_Warning	  */
	public int getTDAB_Warning_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Warning_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Warning_UU.
		@param TDAB_Warning_UU TDAB_Warning_UU	  */
	public void setTDAB_Warning_UU (String TDAB_Warning_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Warning_UU, TDAB_Warning_UU);
	}

	/** Get TDAB_Warning_UU.
		@return TDAB_Warning_UU	  */
	public String getTDAB_Warning_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Warning_UU);
	}

	/** Value = 1 */
	public static final String TYPE_ANSWER_Value = "1";
	/** Choose = 2 */
	public static final String TYPE_ANSWER_Choose = "2";
	/** Set Type_Answer.
		@param Type_Answer Type_Answer	  */
	public void setType_Answer (String Type_Answer)
	{

		set_Value (COLUMNNAME_Type_Answer, Type_Answer);
	}

	/** Get Type_Answer.
		@return Type_Answer	  */
	public String getType_Answer () 
	{
		return (String)get_Value(COLUMNNAME_Type_Answer);
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

		set_ValueNoCheck (COLUMNNAME_Warning_Question_Level, Warning_Question_Level);
	}

	/** Get Warning_Question_Level.
		@return Mức độ
	  */
	public String getWarning_Question_Level () 
	{
		return (String)get_Value(COLUMNNAME_Warning_Question_Level);
	}
}