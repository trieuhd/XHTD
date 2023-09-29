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

/** Generated Model for TDAB_Info_CIC
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Info_CIC extends PO implements I_TDAB_Info_CIC, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220927L;

    /** Standard Constructor */
    public X_TDAB_Info_CIC (Properties ctx, int TDAB_Info_CIC_ID, String trxName)
    {
      super (ctx, TDAB_Info_CIC_ID, trxName);
      /** if (TDAB_Info_CIC_ID == 0)
        {
			setNumber_CIC_Request_12m (Env.ZERO);
			setNumber_loan_2_12m (Env.ZERO);
			setTDAB_Info_CIC_ID (0);
			setTDAB_Info_CIC_UU (null);
			setTotal_Loan_Arising_Date (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Info_CIC (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Info_CIC[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Debt_345_Arising_Date.
		@param Debt_345_Arising_Date 
		Số lượng khoản nợ nhóm 3, 4, 5 tại ngày phát sinh
	  */
	public void setDebt_345_Arising_Date (BigDecimal Debt_345_Arising_Date)
	{
		set_Value (COLUMNNAME_Debt_345_Arising_Date, Debt_345_Arising_Date);
	}

	/** Get Debt_345_Arising_Date.
		@return Số lượng khoản nợ nhóm 3, 4, 5 tại ngày phát sinh
	  */
	public BigDecimal getDebt_345_Arising_Date () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Debt_345_Arising_Date);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** 1 = 1 */
	public static final String HIGHEST_DEBT_12M_1 = "1";
	/** 2 = 2 */
	public static final String HIGHEST_DEBT_12M_2 = "2";
	/** 3 = 3 */
	public static final String HIGHEST_DEBT_12M_3 = "3";
	/** 4 = 4 */
	public static final String HIGHEST_DEBT_12M_4 = "4";
	/** 5 = 5 */
	public static final String HIGHEST_DEBT_12M_5 = "5";
	/** Set Highest_Debt_12m.
		@param Highest_Debt_12m 
		Nhóm nợ cao nhất trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setHighest_Debt_12m (String Highest_Debt_12m)
	{

		set_Value (COLUMNNAME_Highest_Debt_12m, Highest_Debt_12m);
	}

	/** Get Highest_Debt_12m.
		@return Nhóm nợ cao nhất trong vòng 12 tháng trước ngày phát sinh
	  */
	public String getHighest_Debt_12m () 
	{
		return (String)get_Value(COLUMNNAME_Highest_Debt_12m);
	}

	/** 1 = 1 */
	public static final String HIGHEST_DEBT_ARISING_DATE_1 = "1";
	/** 2 = 2 */
	public static final String HIGHEST_DEBT_ARISING_DATE_2 = "2";
	/** 3 = 3 */
	public static final String HIGHEST_DEBT_ARISING_DATE_3 = "3";
	/** 4 = 4 */
	public static final String HIGHEST_DEBT_ARISING_DATE_4 = "4";
	/** 5 = 5 */
	public static final String HIGHEST_DEBT_ARISING_DATE_5 = "5";
	/** Set Highest_Debt_Arising_Date.
		@param Highest_Debt_Arising_Date 
		Nhóm nợ cao nhất tại ngày phát sinh
	  */
	public void setHighest_Debt_Arising_Date (String Highest_Debt_Arising_Date)
	{

		set_Value (COLUMNNAME_Highest_Debt_Arising_Date, Highest_Debt_Arising_Date);
	}

	/** Get Highest_Debt_Arising_Date.
		@return Nhóm nợ cao nhất tại ngày phát sinh
	  */
	public String getHighest_Debt_Arising_Date () 
	{
		return (String)get_Value(COLUMNNAME_Highest_Debt_Arising_Date);
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

	/** Set Number_CIC_Request_12m_KS.
		@param Number_CIC_Request_12m_KS Number_CIC_Request_12m_KS	  */
	public void setNumber_CIC_Request_12m_KS (BigDecimal Number_CIC_Request_12m_KS)
	{
		set_Value (COLUMNNAME_Number_CIC_Request_12m_KS, Number_CIC_Request_12m_KS);
	}

	/** Get Number_CIC_Request_12m_KS.
		@return Number_CIC_Request_12m_KS	  */
	public BigDecimal getNumber_CIC_Request_12m_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_CIC_Request_12m_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Number_CIC_Request_12m_TD.
		@param Number_CIC_Request_12m_TD Number_CIC_Request_12m_TD	  */
	public void setNumber_CIC_Request_12m_TD (BigDecimal Number_CIC_Request_12m_TD)
	{
		set_Value (COLUMNNAME_Number_CIC_Request_12m_TD, Number_CIC_Request_12m_TD);
	}

	/** Get Number_CIC_Request_12m_TD.
		@return Number_CIC_Request_12m_TD	  */
	public BigDecimal getNumber_CIC_Request_12m_TD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_CIC_Request_12m_TD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Number_Debt_345_12m.
		@param Number_Debt_345_12m 
		Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setNumber_Debt_345_12m (BigDecimal Number_Debt_345_12m)
	{
		set_Value (COLUMNNAME_Number_Debt_345_12m, Number_Debt_345_12m);
	}

	/** Get Number_Debt_345_12m.
		@return Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_Debt_345_12m () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_Debt_345_12m);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Number_Debt_345_24m.
		@param Number_Debt_345_24m 
		Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public void setNumber_Debt_345_24m (BigDecimal Number_Debt_345_24m)
	{
		set_Value (COLUMNNAME_Number_Debt_345_24m, Number_Debt_345_24m);
	}

	/** Get Number_Debt_345_24m.
		@return Số lần rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public BigDecimal getNumber_Debt_345_24m () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_Debt_345_24m);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Number_Month_Expired_Debit_345.
		@param Number_Month_Expired_Debit_345 
		Số tháng tính từ lúc kết thúc trạng thái nợ nhóm 3, 4, 5 tới ngày phát sinh
	  */
	public void setNumber_Month_Expired_Debit_345 (BigDecimal Number_Month_Expired_Debit_345)
	{
		set_Value (COLUMNNAME_Number_Month_Expired_Debit_345, Number_Month_Expired_Debit_345);
	}

	/** Get Number_Month_Expired_Debit_345.
		@return Số tháng tính từ lúc kết thúc trạng thái nợ nhóm 3, 4, 5 tới ngày phát sinh
	  */
	public BigDecimal getNumber_Month_Expired_Debit_345 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_Month_Expired_Debit_345);
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

	/** Set Number_loan_2_12m_KS.
		@param Number_loan_2_12m_KS Number_loan_2_12m_KS	  */
	public void setNumber_loan_2_12m_KS (BigDecimal Number_loan_2_12m_KS)
	{
		set_Value (COLUMNNAME_Number_loan_2_12m_KS, Number_loan_2_12m_KS);
	}

	/** Get Number_loan_2_12m_KS.
		@return Number_loan_2_12m_KS	  */
	public BigDecimal getNumber_loan_2_12m_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_loan_2_12m_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Number_loan_2_12m_TD.
		@param Number_loan_2_12m_TD Number_loan_2_12m_TD	  */
	public void setNumber_loan_2_12m_TD (BigDecimal Number_loan_2_12m_TD)
	{
		set_Value (COLUMNNAME_Number_loan_2_12m_TD, Number_loan_2_12m_TD);
	}

	/** Get Number_loan_2_12m_TD.
		@return Number_loan_2_12m_TD	  */
	public BigDecimal getNumber_loan_2_12m_TD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_loan_2_12m_TD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set TDAB_Info_CIC_UU.
		@param TDAB_Info_CIC_UU TDAB_Info_CIC_UU	  */
	public void setTDAB_Info_CIC_UU (String TDAB_Info_CIC_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Info_CIC_UU, TDAB_Info_CIC_UU);
	}

	/** Get TDAB_Info_CIC_UU.
		@return TDAB_Info_CIC_UU	  */
	public String getTDAB_Info_CIC_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Info_CIC_UU);
	}

	/** Set Total_Loan_345_12m_prior_arisi.
		@param Total_Loan_345_12m_prior_arisi 
		Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public void setTotal_Loan_345_12m_prior_arisi (BigDecimal Total_Loan_345_12m_prior_arisi)
	{
		set_Value (COLUMNNAME_Total_Loan_345_12m_prior_arisi, Total_Loan_345_12m_prior_arisi);
	}

	/** Get Total_Loan_345_12m_prior_arisi.
		@return Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 12 tháng trước ngày phát sinh
	  */
	public BigDecimal getTotal_Loan_345_12m_prior_arisi () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Loan_345_12m_prior_arisi);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total_Loan_345_24m_prior_arisi.
		@param Total_Loan_345_24m_prior_arisi 
		Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public void setTotal_Loan_345_24m_prior_arisi (BigDecimal Total_Loan_345_24m_prior_arisi)
	{
		set_Value (COLUMNNAME_Total_Loan_345_24m_prior_arisi, Total_Loan_345_24m_prior_arisi);
	}

	/** Get Total_Loan_345_24m_prior_arisi.
		@return Tổng số dư nợ rơi vào nợ nhóm 3, 4, 5 trong vòng 24 tháng trước ngày phát sinh
	  */
	public BigDecimal getTotal_Loan_345_24m_prior_arisi () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Loan_345_24m_prior_arisi);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Total_Loan_Arising_Date_KS.
		@param Total_Loan_Arising_Date_KS Total_Loan_Arising_Date_KS	  */
	public void setTotal_Loan_Arising_Date_KS (BigDecimal Total_Loan_Arising_Date_KS)
	{
		set_Value (COLUMNNAME_Total_Loan_Arising_Date_KS, Total_Loan_Arising_Date_KS);
	}

	/** Get Total_Loan_Arising_Date_KS.
		@return Total_Loan_Arising_Date_KS	  */
	public BigDecimal getTotal_Loan_Arising_Date_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Loan_Arising_Date_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total_Loan_Arising_Date_TD.
		@param Total_Loan_Arising_Date_TD Total_Loan_Arising_Date_TD	  */
	public void setTotal_Loan_Arising_Date_TD (BigDecimal Total_Loan_Arising_Date_TD)
	{
		set_Value (COLUMNNAME_Total_Loan_Arising_Date_TD, Total_Loan_Arising_Date_TD);
	}

	/** Get Total_Loan_Arising_Date_TD.
		@return Total_Loan_Arising_Date_TD	  */
	public BigDecimal getTotal_Loan_Arising_Date_TD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Loan_Arising_Date_TD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}