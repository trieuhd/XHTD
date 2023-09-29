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

/** Generated Model for TDAB_Non_Financial_History
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Non_Financial_History extends PO implements I_TDAB_Non_Financial_History, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230425L;

    /** Standard Constructor */
    public X_TDAB_Non_Financial_History (Properties ctx, int TDAB_Non_Financial_History_ID, String trxName)
    {
      super (ctx, TDAB_Non_Financial_History_ID, trxName);
      /** if (TDAB_Non_Financial_History_ID == 0)
        {
			setTDAB_Non_Financial_History_ID (0);
			setTDAB_Non_Financial_History_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Non_Financial_History (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Non_Financial_History[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Average_Balance_12_Month.
		@param Average_Balance_12_Month 
		Số dư bình quân tài khoản thanh toán tại ABBANK trong vòng 12 tháng gần nhất (VNĐ)
	  */
	public void setAverage_Balance_12_Month (BigDecimal Average_Balance_12_Month)
	{
		set_Value (COLUMNNAME_Average_Balance_12_Month, Average_Balance_12_Month);
	}

	/** Get Average_Balance_12_Month.
		@return Số dư bình quân tài khoản thanh toán tại ABBANK trong vòng 12 tháng gần nhất (VNĐ)
	  */
	public BigDecimal getAverage_Balance_12_Month () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Average_Balance_12_Month);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Business_Profession_His.
		@param Business_Profession_His Business_Profession_His	  */
	public void setBusiness_Profession_His (String Business_Profession_His)
	{
		set_Value (COLUMNNAME_Business_Profession_His, Business_Profession_His);
	}

	/** Get Business_Profession_His.
		@return Business_Profession_His	  */
	public String getBusiness_Profession_His () 
	{
		return (String)get_Value(COLUMNNAME_Business_Profession_His);
	}

	/** 1 = 1 */
	public static final String COMMENT_ON_AUDIT_REPORT_1 = "1";
	/** 2 = 2 */
	public static final String COMMENT_ON_AUDIT_REPORT_2 = "2";
	/** 3 = 3 */
	public static final String COMMENT_ON_AUDIT_REPORT_3 = "3";
	/** 4 = 4 */
	public static final String COMMENT_ON_AUDIT_REPORT_4 = "4";
	/** 5 = 5 */
	public static final String COMMENT_ON_AUDIT_REPORT_5 = "5";
	/** Set Comment_On_Audit_Report.
		@param Comment_On_Audit_Report 
		Ý kiến trên báo cáo kiểm toán
	  */
	public void setComment_On_Audit_Report (String Comment_On_Audit_Report)
	{

		set_Value (COLUMNNAME_Comment_On_Audit_Report, Comment_On_Audit_Report);
	}

	/** Get Comment_On_Audit_Report.
		@return Ý kiến trên báo cáo kiểm toán
	  */
	public String getComment_On_Audit_Report () 
	{
		return (String)get_Value(COLUMNNAME_Comment_On_Audit_Report);
	}

	/** Set Date_First_Business_Regist.
		@param Date_First_Business_Regist 
		Ngày cấp đăng kí kinh doanh đầu tiên
	  */
	public void setDate_First_Business_Regist (Timestamp Date_First_Business_Regist)
	{
		set_Value (COLUMNNAME_Date_First_Business_Regist, Date_First_Business_Regist);
	}

	/** Get Date_First_Business_Regist.
		@return Ngày cấp đăng kí kinh doanh đầu tiên
	  */
	public Timestamp getDate_First_Business_Regist () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_First_Business_Regist);
	}

	/** 1 = 1 */
	public static final String FINANCIAL_STATEMENTS_AUDITED_1 = "1";
	/** 2 = 2 */
	public static final String FINANCIAL_STATEMENTS_AUDITED_2 = "2";
	/** 3 = 3 */
	public static final String FINANCIAL_STATEMENTS_AUDITED_3 = "3";
	/** 0 = 0 */
	public static final String FINANCIAL_STATEMENTS_AUDITED_0 = "0";
	/** Set Financial_Statements_Audited.
		@param Financial_Statements_Audited 
		BCTC có được kiểm toán không?
	  */
	public void setFinancial_Statements_Audited (String Financial_Statements_Audited)
	{

		set_Value (COLUMNNAME_Financial_Statements_Audited, Financial_Statements_Audited);
	}

	/** Get Financial_Statements_Audited.
		@return BCTC có được kiểm toán không?
	  */
	public String getFinancial_Statements_Audited () 
	{
		return (String)get_Value(COLUMNNAME_Financial_Statements_Audited);
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

	/** Set Number_Of_Work.
		@param Number_Of_Work 
		Số lượng lao động
	  */
	public void setNumber_Of_Work (BigDecimal Number_Of_Work)
	{
		set_Value (COLUMNNAME_Number_Of_Work, Number_Of_Work);
	}

	/** Get Number_Of_Work.
		@return Số lượng lao động
	  */
	public BigDecimal getNumber_Of_Work () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Number_Of_Work);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** SH = SH */
	public static final String OWNERSHIP_LOCATION_BUSINESS_SH = "SH";
	/** T = T */
	public static final String OWNERSHIP_LOCATION_BUSINESS_T = "T";
	/** Set Ownership_Location_Business.
		@param Ownership_Location_Business 
		Quyền sở hữu địa điểm kinh doanh
	  */
	public void setOwnership_Location_Business (String Ownership_Location_Business)
	{

		set_Value (COLUMNNAME_Ownership_Location_Business, Ownership_Location_Business);
	}

	/** Get Ownership_Location_Business.
		@return Quyền sở hữu địa điểm kinh doanh
	  */
	public String getOwnership_Location_Business () 
	{
		return (String)get_Value(COLUMNNAME_Ownership_Location_Business);
	}

	/** Set ROCE_Index.
		@param ROCE_Index 
		Chỉ số ROCE của ngành
	  */
	public void setROCE_Index (String ROCE_Index)
	{
		set_Value (COLUMNNAME_ROCE_Index, ROCE_Index);
	}

	/** Get ROCE_Index.
		@return Chỉ số ROCE của ngành
	  */
	public String getROCE_Index () 
	{
		return (String)get_Value(COLUMNNAME_ROCE_Index);
	}

	public I_TDAB_Financial_Non getTDAB_Financial_Non() throws RuntimeException
    {
		return (I_TDAB_Financial_Non)MTable.get(getCtx(), I_TDAB_Financial_Non.Table_Name)
			.getPO(getTDAB_Financial_Non_ID(), get_TrxName());	}

	/** Set TDAB_Financial_Non.
		@param TDAB_Financial_Non_ID TDAB_Financial_Non	  */
	public void setTDAB_Financial_Non_ID (int TDAB_Financial_Non_ID)
	{
		if (TDAB_Financial_Non_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_Non_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_Non_ID, Integer.valueOf(TDAB_Financial_Non_ID));
	}

	/** Get TDAB_Financial_Non.
		@return TDAB_Financial_Non	  */
	public int getTDAB_Financial_Non_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Financial_Non_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Non_Financial_History.
		@param TDAB_Non_Financial_History_ID TDAB_Non_Financial_History	  */
	public void setTDAB_Non_Financial_History_ID (int TDAB_Non_Financial_History_ID)
	{
		if (TDAB_Non_Financial_History_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Non_Financial_History_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Non_Financial_History_ID, Integer.valueOf(TDAB_Non_Financial_History_ID));
	}

	/** Get TDAB_Non_Financial_History.
		@return TDAB_Non_Financial_History	  */
	public int getTDAB_Non_Financial_History_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Non_Financial_History_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Non_Financial_History_UU.
		@param TDAB_Non_Financial_History_UU TDAB_Non_Financial_History_UU	  */
	public void setTDAB_Non_Financial_History_UU (String TDAB_Non_Financial_History_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Non_Financial_History_UU, TDAB_Non_Financial_History_UU);
	}

	/** Get TDAB_Non_Financial_History_UU.
		@return TDAB_Non_Financial_History_UU	  */
	public String getTDAB_Non_Financial_History_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Non_Financial_History_UU);
	}

	/** 1 = 1 */
	public static final String TYPE_BUSINESS_1 = "1";
	/** 2 = 2 */
	public static final String TYPE_BUSINESS_2 = "2";
	/** 3 = 3 */
	public static final String TYPE_BUSINESS_3 = "3";
	/** Set Type_Business.
		@param Type_Business 
		Loại doanh nghiệp
	  */
	public void setType_Business (String Type_Business)
	{

		set_Value (COLUMNNAME_Type_Business, Type_Business);
	}

	/** Get Type_Business.
		@return Loại doanh nghiệp
	  */
	public String getType_Business () 
	{
		return (String)get_Value(COLUMNNAME_Type_Business);
	}

	/** Set Years_Experience_CEO.
		@param Years_Experience_CEO 
		Số năm kinh nghiệm của người điều hành chính
	  */
	public void setYears_Experience_CEO (BigDecimal Years_Experience_CEO)
	{
		set_Value (COLUMNNAME_Years_Experience_CEO, Years_Experience_CEO);
	}

	/** Get Years_Experience_CEO.
		@return Số năm kinh nghiệm của người điều hành chính
	  */
	public BigDecimal getYears_Experience_CEO () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Years_Experience_CEO);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Years_Operation.
		@param Years_Operation 
		Số năm hoạt động (tính từ khi được cấp giấy phép ĐKKD)
	  */
	public void setYears_Operation (BigDecimal Years_Operation)
	{
		set_Value (COLUMNNAME_Years_Operation, Years_Operation);
	}

	/** Get Years_Operation.
		@return Số năm hoạt động (tính từ khi được cấp giấy phép ĐKKD)
	  */
	public BigDecimal getYears_Operation () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Years_Operation);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}