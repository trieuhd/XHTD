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

/** Generated Model for TDAB_Direct_KO
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Direct_KO extends PO implements I_TDAB_Direct_KO, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210131L;

    /** Standard Constructor */
    public X_TDAB_Direct_KO (Properties ctx, int TDAB_Direct_KO_ID, String trxName)
    {
      super (ctx, TDAB_Direct_KO_ID, trxName);
      /** if (TDAB_Direct_KO_ID == 0)
        {
			setTDAB_Direct_KO_ID (0);
			setTDAB_Direct_KO_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Direct_KO (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Direct_KO[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** 1 = 1 */
	public static final String ANSWER_REPLY_1 = "1";
	/** 2 = 2 */
	public static final String ANSWER_REPLY_2 = "2";
	/** 3 = 3 */
	public static final String ANSWER_REPLY_3 = "3";
	/** 4 = 4 */
	public static final String ANSWER_REPLY_4 = "4";
	/** 5 = 5 */
	public static final String ANSWER_REPLY_5 = "5";
	/** Set Answer_Reply.
		@param Answer_Reply Answer_Reply	  */
	public void setAnswer_Reply (String Answer_Reply)
	{

		set_Value (COLUMNNAME_Answer_Reply, Answer_Reply);
	}

	/** Get Answer_Reply.
		@return Answer_Reply	  */
	public String getAnswer_Reply () 
	{
		return (String)get_Value(COLUMNNAME_Answer_Reply);
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

	/** Set Criteria_Code.
		@param Criteria_Code Criteria_Code	  */
	public void setCriteria_Code (String Criteria_Code)
	{
		set_Value (COLUMNNAME_Criteria_Code, Criteria_Code);
	}

	/** Get Criteria_Code.
		@return Criteria_Code	  */
	public String getCriteria_Code () 
	{
		return (String)get_Value(COLUMNNAME_Criteria_Code);
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

	/** Set TDAB_Direct_KO.
		@param TDAB_Direct_KO_ID TDAB_Direct_KO	  */
	public void setTDAB_Direct_KO_ID (int TDAB_Direct_KO_ID)
	{
		if (TDAB_Direct_KO_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_ID, Integer.valueOf(TDAB_Direct_KO_ID));
	}

	/** Get TDAB_Direct_KO.
		@return TDAB_Direct_KO	  */
	public int getTDAB_Direct_KO_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Direct_KO_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Direct_KO_UU.
		@param TDAB_Direct_KO_UU TDAB_Direct_KO_UU	  */
	public void setTDAB_Direct_KO_UU (String TDAB_Direct_KO_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_UU, TDAB_Direct_KO_UU);
	}

	/** Get TDAB_Direct_KO_UU.
		@return TDAB_Direct_KO_UU	  */
	public String getTDAB_Direct_KO_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Direct_KO_UU);
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
}