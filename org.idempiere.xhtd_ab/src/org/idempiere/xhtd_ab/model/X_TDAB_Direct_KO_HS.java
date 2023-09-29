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

/** Generated Model for TDAB_Direct_KO_HS
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Direct_KO_HS extends PO implements I_TDAB_Direct_KO_HS, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220928L;

    /** Standard Constructor */
    public X_TDAB_Direct_KO_HS (Properties ctx, int TDAB_Direct_KO_HS_ID, String trxName)
    {
      super (ctx, TDAB_Direct_KO_HS_ID, trxName);
      /** if (TDAB_Direct_KO_HS_ID == 0)
        {
			setTDAB_Direct_KO_HS_ID (0);
			setTDAB_Direct_KO_HS_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Direct_KO_HS (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Direct_KO_HS[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

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

	/** Set Answer_TD.
		@param Answer_TD Answer_TD	  */
	public void setAnswer_TD (String Answer_TD)
	{
		set_Value (COLUMNNAME_Answer_TD, Answer_TD);
	}

	/** Get Answer_TD.
		@return Answer_TD	  */
	public String getAnswer_TD () 
	{
		return (String)get_Value(COLUMNNAME_Answer_TD);
	}

	public I_TDAB_Direct_KO_Info getDirect_KO_Info() throws RuntimeException
    {
		return (I_TDAB_Direct_KO_Info)MTable.get(getCtx(), I_TDAB_Direct_KO_Info.Table_Name)
			.getPO(getDirect_KO_Info_ID(), get_TrxName());	}

	/** Set Direct_KO_Info_ID.
		@param Direct_KO_Info_ID Direct_KO_Info_ID	  */
	public void setDirect_KO_Info_ID (int Direct_KO_Info_ID)
	{
		if (Direct_KO_Info_ID < 1) 
			set_Value (COLUMNNAME_Direct_KO_Info_ID, null);
		else 
			set_Value (COLUMNNAME_Direct_KO_Info_ID, Integer.valueOf(Direct_KO_Info_ID));
	}

	/** Get Direct_KO_Info_ID.
		@return Direct_KO_Info_ID	  */
	public int getDirect_KO_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Direct_KO_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Max Value.
		@param MaxValue Max Value	  */
	public void setMaxValue (BigDecimal MaxValue)
	{
		set_Value (COLUMNNAME_MaxValue, MaxValue);
	}

	/** Get Max Value.
		@return Max Value	  */
	public BigDecimal getMaxValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MaxValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Min Value.
		@param MinValue Min Value	  */
	public void setMinValue (BigDecimal MinValue)
	{
		set_Value (COLUMNNAME_MinValue, MinValue);
	}

	/** Get Min Value.
		@return Min Value	  */
	public BigDecimal getMinValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MinValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Quan ly bien loai truc tiep KO.
		@param TDAB_Direct_KO_HS_ID Quan ly bien loai truc tiep KO	  */
	public void setTDAB_Direct_KO_HS_ID (int TDAB_Direct_KO_HS_ID)
	{
		if (TDAB_Direct_KO_HS_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_HS_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_HS_ID, Integer.valueOf(TDAB_Direct_KO_HS_ID));
	}

	/** Get Quan ly bien loai truc tiep KO.
		@return Quan ly bien loai truc tiep KO	  */
	public int getTDAB_Direct_KO_HS_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Direct_KO_HS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Direct_KO_HS_UU.
		@param TDAB_Direct_KO_HS_UU TDAB_Direct_KO_HS_UU	  */
	public void setTDAB_Direct_KO_HS_UU (String TDAB_Direct_KO_HS_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Direct_KO_HS_UU, TDAB_Direct_KO_HS_UU);
	}

	/** Get TDAB_Direct_KO_HS_UU.
		@return TDAB_Direct_KO_HS_UU	  */
	public String getTDAB_Direct_KO_HS_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Direct_KO_HS_UU);
	}

	public I_TDAB_Direct_KO getTDAB_Direct_KO() throws RuntimeException
    {
		return (I_TDAB_Direct_KO)MTable.get(getCtx(), I_TDAB_Direct_KO.Table_Name)
			.getPO(getTDAB_Direct_KO_ID(), get_TrxName());	}

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
}