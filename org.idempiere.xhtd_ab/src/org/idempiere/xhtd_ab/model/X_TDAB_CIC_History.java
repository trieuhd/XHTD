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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TDAB_CIC_History
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_CIC_History extends PO implements I_TDAB_CIC_History, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210312L;

    /** Standard Constructor */
    public X_TDAB_CIC_History (Properties ctx, int TDAB_CIC_History_ID, String trxName)
    {
      super (ctx, TDAB_CIC_History_ID, trxName);
      /** if (TDAB_CIC_History_ID == 0)
        {
			setTDAB_CIC_History_ID (0);
			setTDAB_CIC_History_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_CIC_History (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_CIC_History[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Number_CIC_Request_12m.
		@param Number_CIC_Request_12m 
		Số lần hỏi tin CIC trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setNumber_CIC_Request_12m (BigDecimal Number_CIC_Request_12m)
	{
		set_Value (COLUMNNAME_Number_CIC_Request_12m, Number_CIC_Request_12m);
	}

	/** Get Number_CIC_Request_12m.
		@return Số lần hỏi tin CIC trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_CIC_Request_12m () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_CIC_Request_12m);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Number_loan_2_12m.
		@param Number_loan_2_12m 
		Số lần rơi vào nợ nhóm 2 trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setNumber_loan_2_12m (BigDecimal Number_loan_2_12m)
	{
		set_Value (COLUMNNAME_Number_loan_2_12m, Number_loan_2_12m);
	}

	/** Get Number_loan_2_12m.
		@return Số lần rơi vào nợ nhóm 2 trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_loan_2_12m () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_loan_2_12m);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TDAB_CIC_History.
		@param TDAB_CIC_History_ID TDAB_CIC_History	  */
	public void setTDAB_CIC_History_ID (int TDAB_CIC_History_ID)
	{
		if (TDAB_CIC_History_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_CIC_History_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_CIC_History_ID, Integer.valueOf(TDAB_CIC_History_ID));
	}

	/** Get TDAB_CIC_History.
		@return TDAB_CIC_History	  */
	public int getTDAB_CIC_History_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_CIC_History_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_CIC_History_UU.
		@param TDAB_CIC_History_UU TDAB_CIC_History_UU	  */
	public void setTDAB_CIC_History_UU (String TDAB_CIC_History_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_CIC_History_UU, TDAB_CIC_History_UU);
	}

	/** Get TDAB_CIC_History_UU.
		@return TDAB_CIC_History_UU	  */
	public String getTDAB_CIC_History_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_CIC_History_UU);
	}

	public I_TDAB_Info_CIC getTDAB_Info_CIC() throws RuntimeException
    {
		return (I_TDAB_Info_CIC)MTable.get(getCtx(), I_TDAB_Info_CIC.Table_Name)
			.getPO(getTDAB_Info_CIC_ID(), get_TrxName());	}

	/** Set TDAB_Info_CIC.
		@param TDAB_Info_CIC_ID TDAB_Info_CIC	  */
	public void setTDAB_Info_CIC_ID (int TDAB_Info_CIC_ID)
	{
		if (TDAB_Info_CIC_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Info_CIC_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Info_CIC_ID, Integer.valueOf(TDAB_Info_CIC_ID));
	}

	/** Get TDAB_Info_CIC.
		@return TDAB_Info_CIC	  */
	public int getTDAB_Info_CIC_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Info_CIC_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total_Loan_Arising_Date.
		@param Total_Loan_Arising_Date 
		Tổng dư nợ tại ngày phát sinh (ĐVT: VND)
	  */
	public void setTotal_Loan_Arising_Date (BigDecimal Total_Loan_Arising_Date)
	{
		set_Value (COLUMNNAME_Total_Loan_Arising_Date, Total_Loan_Arising_Date);
	}

	/** Get Total_Loan_Arising_Date.
		@return Tổng dư nợ tại ngày phát sinh (ĐVT: VND)
	  */
	public BigDecimal getTotal_Loan_Arising_Date () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Loan_Arising_Date);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}