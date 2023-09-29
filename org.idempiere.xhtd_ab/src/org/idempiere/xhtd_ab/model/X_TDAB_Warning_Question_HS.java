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

/** Generated Model for TDAB_Warning_Question_HS
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Warning_Question_HS extends PO implements I_TDAB_Warning_Question_HS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220928L;

    /** Standard Constructor */
    public X_TDAB_Warning_Question_HS (Properties ctx, int TDAB_Warning_Question_HS_ID, String trxName)
    {
      super (ctx, TDAB_Warning_Question_HS_ID, trxName);
      /** if (TDAB_Warning_Question_HS_ID == 0)
        {
			setTDAB_Warning_Question_HS_ID (0);
			setTDAB_Warning_Question_HS_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Warning_Question_HS (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Warning_Question_HS[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Yes = Y */
	public static final String ANSWER_CV_Yes = "Y";
	/** No = N */
	public static final String ANSWER_CV_No = "N";
	/** Set Answer_CV.
		@param Answer_CV Answer_CV	  */
	public void setAnswer_CV (String Answer_CV)
	{

		set_Value (COLUMNNAME_Answer_CV, Answer_CV);
	}

	/** Get Answer_CV.
		@return Answer_CV	  */
	public String getAnswer_CV () 
	{
		return (String)get_Value(COLUMNNAME_Answer_CV);
	}

	/** Yes = Y */
	public static final String ANSWER_KS_Yes = "Y";
	/** No = N */
	public static final String ANSWER_KS_No = "N";
	/** Set Answer_KS.
		@param Answer_KS Answer_KS	  */
	public void setAnswer_KS (String Answer_KS)
	{

		set_Value (COLUMNNAME_Answer_KS, Answer_KS);
	}

	/** Get Answer_KS.
		@return Answer_KS	  */
	public String getAnswer_KS () 
	{
		return (String)get_Value(COLUMNNAME_Answer_KS);
	}

	/** Yes = Y */
	public static final String ANSWER_TDTD_Yes = "Y";
	/** No = N */
	public static final String ANSWER_TDTD_No = "N";
	/** Set Answer_TDTD.
		@param Answer_TDTD Answer_TDTD	  */
	public void setAnswer_TDTD (String Answer_TDTD)
	{

		set_Value (COLUMNNAME_Answer_TDTD, Answer_TDTD);
	}

	/** Get Answer_TDTD.
		@return Answer_TDTD	  */
	public String getAnswer_TDTD () 
	{
		return (String)get_Value(COLUMNNAME_Answer_TDTD);
	}

	/** Set IsRecordReject.
		@param IsRecordReject IsRecordReject	  */
	public void setIsRecordReject (String IsRecordReject)
	{
		set_Value (COLUMNNAME_IsRecordReject, IsRecordReject);
	}

	/** Get IsRecordReject.
		@return IsRecordReject	  */
	public String getIsRecordReject () 
	{
		return (String)get_Value(COLUMNNAME_IsRecordReject);
	}

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

	public I_TDAB_Early_Warning_Question getTDAB_Early_Warning_Question() throws RuntimeException
    {
		return (I_TDAB_Early_Warning_Question)MTable.get(getCtx(), I_TDAB_Early_Warning_Question.Table_Name)
			.getPO(getTDAB_Early_Warning_Question_ID(), get_TrxName());	}

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

	/** Set Bo cau hoi canh bao som.
		@param TDAB_Warning_Question_HS_ID Bo cau hoi canh bao som	  */
	public void setTDAB_Warning_Question_HS_ID (int TDAB_Warning_Question_HS_ID)
	{
		if (TDAB_Warning_Question_HS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Warning_Question_HS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Warning_Question_HS_ID, Integer.valueOf(TDAB_Warning_Question_HS_ID));
	}

	/** Get Bo cau hoi canh bao som.
		@return Bo cau hoi canh bao som	  */
	public int getTDAB_Warning_Question_HS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Warning_Question_HS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Warning_Question_HS_UU.
		@param TDAB_Warning_Question_HS_UU TDAB_Warning_Question_HS_UU	  */
	public void setTDAB_Warning_Question_HS_UU (String TDAB_Warning_Question_HS_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Warning_Question_HS_UU, TDAB_Warning_Question_HS_UU);
	}

	/** Get TDAB_Warning_Question_HS_UU.
		@return TDAB_Warning_Question_HS_UU	  */
	public String getTDAB_Warning_Question_HS_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Warning_Question_HS_UU);
	}

	/** Set Value.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Value.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	public I_TDAB_Warning_Question_Info getWarning_Question_Info() throws RuntimeException
    {
		return (I_TDAB_Warning_Question_Info)MTable.get(getCtx(), I_TDAB_Warning_Question_Info.Table_Name)
			.getPO(getWarning_Question_Info_ID(), get_TrxName());	}

	/** Set Warning_Question_Info_ID.
		@param Warning_Question_Info_ID Warning_Question_Info_ID	  */
	public void setWarning_Question_Info_ID (int Warning_Question_Info_ID)
	{
		if (Warning_Question_Info_ID < 1) 
			set_Value (COLUMNNAME_Warning_Question_Info_ID, null);
		else 
			set_Value (COLUMNNAME_Warning_Question_Info_ID, Integer.valueOf(Warning_Question_Info_ID));
	}

	/** Get Warning_Question_Info_ID.
		@return Warning_Question_Info_ID	  */
	public int getWarning_Question_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Warning_Question_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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