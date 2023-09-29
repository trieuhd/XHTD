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

/** Generated Model for TDAB_Warning_Question_His
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Warning_Question_His extends PO implements I_TDAB_Warning_Question_His, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210327L;

    /** Standard Constructor */
    public X_TDAB_Warning_Question_His (Properties ctx, int TDAB_Warning_Question_His_ID, String trxName)
    {
      super (ctx, TDAB_Warning_Question_His_ID, trxName);
      /** if (TDAB_Warning_Question_His_ID == 0)
        {
			setTDAB_Warning_Question_His_ID (0);
			setTDAB_Warning_Question_His_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Warning_Question_His (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Warning_Question_His[")
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

	/** Set HisUpdateAt.
		@param HisUpdateAt HisUpdateAt	  */
	public void setHisUpdateAt (Timestamp HisUpdateAt)
	{
		set_Value (COLUMNNAME_HisUpdateAt, HisUpdateAt);
	}

	/** Get HisUpdateAt.
		@return HisUpdateAt	  */
	public Timestamp getHisUpdateAt () 
	{
		return (Timestamp)get_Value(COLUMNNAME_HisUpdateAt);
	}

	/** Set HisUpdateBy.
		@param HisUpdateBy HisUpdateBy	  */
	public void setHisUpdateBy (String HisUpdateBy)
	{
		set_Value (COLUMNNAME_HisUpdateBy, HisUpdateBy);
	}

	/** Get HisUpdateBy.
		@return HisUpdateBy	  */
	public String getHisUpdateBy () 
	{
		return (String)get_Value(COLUMNNAME_HisUpdateBy);
	}

	public I_TDAB_Warning_Question_HS getTDAB_Warning_Question_HS() throws RuntimeException
    {
		return (I_TDAB_Warning_Question_HS)MTable.get(getCtx(), I_TDAB_Warning_Question_HS.Table_Name)
			.getPO(getTDAB_Warning_Question_HS_ID(), get_TrxName());	}

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

	/** Set TDAB_Warning_Question_His.
		@param TDAB_Warning_Question_His_ID TDAB_Warning_Question_His	  */
	public void setTDAB_Warning_Question_His_ID (int TDAB_Warning_Question_His_ID)
	{
		if (TDAB_Warning_Question_His_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Warning_Question_His_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Warning_Question_His_ID, Integer.valueOf(TDAB_Warning_Question_His_ID));
	}

	/** Get TDAB_Warning_Question_His.
		@return TDAB_Warning_Question_His	  */
	public int getTDAB_Warning_Question_His_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Warning_Question_His_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Warning_Question_His_UU.
		@param TDAB_Warning_Question_His_UU TDAB_Warning_Question_His_UU	  */
	public void setTDAB_Warning_Question_His_UU (String TDAB_Warning_Question_His_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Warning_Question_His_UU, TDAB_Warning_Question_His_UU);
	}

	/** Get TDAB_Warning_Question_His_UU.
		@return TDAB_Warning_Question_His_UU	  */
	public String getTDAB_Warning_Question_His_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Warning_Question_His_UU);
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
}