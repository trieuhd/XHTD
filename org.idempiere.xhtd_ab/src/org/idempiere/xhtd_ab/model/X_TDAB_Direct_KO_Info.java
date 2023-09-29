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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TDAB_Direct_KO_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Direct_KO_Info extends PO implements I_TDAB_Direct_KO_Info, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210319L;

    /** Standard Constructor */
    public X_TDAB_Direct_KO_Info (Properties ctx, int TDAB_Direct_KO_Info_ID, String trxName)
    {
      super (ctx, TDAB_Direct_KO_Info_ID, trxName);
      /** if (TDAB_Direct_KO_Info_ID == 0)
        {
			setTDAB_Direct_KO_Info_ID (0);
			setTDAB_Direct_KO_Info_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Direct_KO_Info (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Direct_KO_Info[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Bigger_KO.
		@param Bigger_KO Bigger_KO	  */
	public void setBigger_KO (BigDecimal Bigger_KO)
	{
		set_Value (COLUMNNAME_Bigger_KO, Bigger_KO);
	}

	/** Get Bigger_KO.
		@return Bigger_KO	  */
	public BigDecimal getBigger_KO () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Bigger_KO);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Smaller_KO.
		@param Smaller_KO Smaller_KO	  */
	public void setSmaller_KO (BigDecimal Smaller_KO)
	{
		set_Value (COLUMNNAME_Smaller_KO, Smaller_KO);
	}

	/** Get Smaller_KO.
		@return Smaller_KO	  */
	public BigDecimal getSmaller_KO () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Smaller_KO);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TDAB_Direct_KO_Info.
		@param TDAB_Direct_KO_Info_ID TDAB_Direct_KO_Info	  */
	public void setTDAB_Direct_KO_Info_ID (int TDAB_Direct_KO_Info_ID)
	{
		if (TDAB_Direct_KO_Info_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_Info_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_Info_ID, Integer.valueOf(TDAB_Direct_KO_Info_ID));
	}

	/** Get TDAB_Direct_KO_Info.
		@return TDAB_Direct_KO_Info	  */
	public int getTDAB_Direct_KO_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Direct_KO_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Direct_KO_Info_UU.
		@param TDAB_Direct_KO_Info_UU TDAB_Direct_KO_Info_UU	  */
	public void setTDAB_Direct_KO_Info_UU (String TDAB_Direct_KO_Info_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_Info_UU, TDAB_Direct_KO_Info_UU);
	}

	/** Get TDAB_Direct_KO_Info_UU.
		@return TDAB_Direct_KO_Info_UU	  */
	public String getTDAB_Direct_KO_Info_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Direct_KO_Info_UU);
	}

	/** Set TDAB_Direct_KO_QL.
		@param TDAB_Direct_KO_QL_ID TDAB_Direct_KO_QL	  */
	public void setTDAB_Direct_KO_QL_ID (int TDAB_Direct_KO_QL_ID)
	{
		if (TDAB_Direct_KO_QL_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_QL_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_QL_ID, Integer.valueOf(TDAB_Direct_KO_QL_ID));
	}

	/** Get TDAB_Direct_KO_QL.
		@return TDAB_Direct_KO_QL	  */
	public int getTDAB_Direct_KO_QL_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Direct_KO_QL_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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