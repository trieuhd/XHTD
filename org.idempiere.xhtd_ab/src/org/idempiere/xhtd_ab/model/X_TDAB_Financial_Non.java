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

/** Generated Model for TDAB_Financial_Non
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Financial_Non extends PO implements I_TDAB_Financial_Non, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230425L;

    /** Standard Constructor */
    public X_TDAB_Financial_Non (Properties ctx, int TDAB_Financial_Non_ID, String trxName)
    {
      super (ctx, TDAB_Financial_Non_ID, trxName);
      /** if (TDAB_Financial_Non_ID == 0)
        {
			setAverage_Balance_12_Month (Env.ZERO);
			setComment_On_Audit_Report (null);
			setDate_First_Business_Regist (new Timestamp( System.currentTimeMillis() ));
			setFinancial_Statements_Audited (null);
			setOwnership_Location_Business (null);
			setTDAB_Financial_Non_ID (0);
			setTDAB_Financial_Non_UU (null);
			setTDAB_List_Business_ID (0);
			setType_Business (null);
			setYears_Experience_CEO (Env.ZERO);
			setYears_Operation (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Financial_Non (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Financial_Non[")
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

	/** Set Average_Balance_12_Month_KS.
		@param Average_Balance_12_Month_KS Average_Balance_12_Month_KS	  */
	public void setAverage_Balance_12_Month_KS (BigDecimal Average_Balance_12_Month_KS)
	{
		set_Value (COLUMNNAME_Average_Balance_12_Month_KS, Average_Balance_12_Month_KS);
	}

	/** Get Average_Balance_12_Month_KS.
		@return Average_Balance_12_Month_KS	  */
	public BigDecimal getAverage_Balance_12_Month_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Average_Balance_12_Month_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Average_Balance_12_Month_TD.
		@param Average_Balance_12_Month_TD Average_Balance_12_Month_TD	  */
	public void setAverage_Balance_12_Month_TD (BigDecimal Average_Balance_12_Month_TD)
	{
		set_Value (COLUMNNAME_Average_Balance_12_Month_TD, Average_Balance_12_Month_TD);
	}

	/** Get Average_Balance_12_Month_TD.
		@return Average_Balance_12_Month_TD	  */
	public BigDecimal getAverage_Balance_12_Month_TD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Average_Balance_12_Month_TD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_TDAB_Business_Areas getBusiness_Profess() throws RuntimeException
    {
		return (I_TDAB_Business_Areas)MTable.get(getCtx(), I_TDAB_Business_Areas.Table_Name)
			.getPO(getBusiness_Profession(), get_TrxName());	}

	/** Set Business_Profession.
		@param Business_Profession 
		Ngành nghề kinh doanh
	  */
	public void setBusiness_Profession (int Business_Profession)
	{
		set_Value (COLUMNNAME_Business_Profession, Integer.valueOf(Business_Profession));
	}

	/** Get Business_Profession.
		@return Ngành nghề kinh doanh
	  */
	public int getBusiness_Profession () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Business_Profession);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** 1 = 1 */
	public static final String COMMENT_ON_AUDIT_REPORT_KS_1 = "1";
	/** 2 = 2 */
	public static final String COMMENT_ON_AUDIT_REPORT_KS_2 = "2";
	/** 3 = 3 */
	public static final String COMMENT_ON_AUDIT_REPORT_KS_3 = "3";
	/** 4 = 4 */
	public static final String COMMENT_ON_AUDIT_REPORT_KS_4 = "4";
	/** 5 = 5 */
	public static final String COMMENT_ON_AUDIT_REPORT_KS_5 = "5";
	/** Set Comment_On_Audit_Report_KS.
		@param Comment_On_Audit_Report_KS Comment_On_Audit_Report_KS	  */
	public void setComment_On_Audit_Report_KS (String Comment_On_Audit_Report_KS)
	{

		set_Value (COLUMNNAME_Comment_On_Audit_Report_KS, Comment_On_Audit_Report_KS);
	}

	/** Get Comment_On_Audit_Report_KS.
		@return Comment_On_Audit_Report_KS	  */
	public String getComment_On_Audit_Report_KS () 
	{
		return (String)get_Value(COLUMNNAME_Comment_On_Audit_Report_KS);
	}

	/** 1 = 1 */
	public static final String COMMENT_ON_AUDIT_REPORT_TD_1 = "1";
	/** 2 = 2 */
	public static final String COMMENT_ON_AUDIT_REPORT_TD_2 = "2";
	/** 3 = 3 */
	public static final String COMMENT_ON_AUDIT_REPORT_TD_3 = "3";
	/** 4 = 4 */
	public static final String COMMENT_ON_AUDIT_REPORT_TD_4 = "4";
	/** 5 = 5 */
	public static final String COMMENT_ON_AUDIT_REPORT_TD_5 = "5";
	/** Set Comment_On_Audit_Report_TD.
		@param Comment_On_Audit_Report_TD Comment_On_Audit_Report_TD	  */
	public void setComment_On_Audit_Report_TD (String Comment_On_Audit_Report_TD)
	{

		set_Value (COLUMNNAME_Comment_On_Audit_Report_TD, Comment_On_Audit_Report_TD);
	}

	/** Get Comment_On_Audit_Report_TD.
		@return Comment_On_Audit_Report_TD	  */
	public String getComment_On_Audit_Report_TD () 
	{
		return (String)get_Value(COLUMNNAME_Comment_On_Audit_Report_TD);
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

	/** Set Date_First_Business_Regist_KS.
		@param Date_First_Business_Regist_KS Date_First_Business_Regist_KS	  */
	public void setDate_First_Business_Regist_KS (Timestamp Date_First_Business_Regist_KS)
	{
		set_Value (COLUMNNAME_Date_First_Business_Regist_KS, Date_First_Business_Regist_KS);
	}

	/** Get Date_First_Business_Regist_KS.
		@return Date_First_Business_Regist_KS	  */
	public Timestamp getDate_First_Business_Regist_KS () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_First_Business_Regist_KS);
	}

	/** Set Date_First_Business_Regist_TD.
		@param Date_First_Business_Regist_TD Date_First_Business_Regist_TD	  */
	public void setDate_First_Business_Regist_TD (Timestamp Date_First_Business_Regist_TD)
	{
		set_Value (COLUMNNAME_Date_First_Business_Regist_TD, Date_First_Business_Regist_TD);
	}

	/** Get Date_First_Business_Regist_TD.
		@return Date_First_Business_Regist_TD	  */
	public Timestamp getDate_First_Business_Regist_TD () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_First_Business_Regist_TD);
	}

	/** 1 = 1 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_KS_1 = "1";
	/** 2 = 2 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_KS_2 = "2";
	/** 3 = 3 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_KS_3 = "3";
	/** 0 = 0 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_KS_0 = "0";
	/** Set Financial_Statements_Audit_KS.
		@param Financial_Statements_Audit_KS Financial_Statements_Audit_KS	  */
	public void setFinancial_Statements_Audit_KS (String Financial_Statements_Audit_KS)
	{

		set_Value (COLUMNNAME_Financial_Statements_Audit_KS, Financial_Statements_Audit_KS);
	}

	/** Get Financial_Statements_Audit_KS.
		@return Financial_Statements_Audit_KS	  */
	public String getFinancial_Statements_Audit_KS () 
	{
		return (String)get_Value(COLUMNNAME_Financial_Statements_Audit_KS);
	}

	/** 1 = 1 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_TD_1 = "1";
	/** 2 = 2 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_TD_2 = "2";
	/** 3 = 3 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_TD_3 = "3";
	/** 0 = 0 */
	public static final String FINANCIAL_STATEMENTS_AUDIT_TD_0 = "0";
	/** Set Financial_Statements_Audit_TD.
		@param Financial_Statements_Audit_TD Financial_Statements_Audit_TD	  */
	public void setFinancial_Statements_Audit_TD (String Financial_Statements_Audit_TD)
	{

		set_Value (COLUMNNAME_Financial_Statements_Audit_TD, Financial_Statements_Audit_TD);
	}

	/** Get Financial_Statements_Audit_TD.
		@return Financial_Statements_Audit_TD	  */
	public String getFinancial_Statements_Audit_TD () 
	{
		return (String)get_Value(COLUMNNAME_Financial_Statements_Audit_TD);
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

	/** Set Medium_Level.
		@param Medium_Level 
		Mức độ trung bình
	  */
	public void setMedium_Level (BigDecimal Medium_Level)
	{
		set_Value (COLUMNNAME_Medium_Level, Medium_Level);
	}

	/** Get Medium_Level.
		@return Mức độ trung bình
	  */
	public BigDecimal getMedium_Level () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Medium_Level);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** 1 = 1 */
	public static final String OWNER_LOCATION_KS_1 = "1";
	/** 2 = 2 */
	public static final String OWNER_LOCATION_KS_2 = "2";
	/** Set Owner_Location_KS.
		@param Owner_Location_KS Owner_Location_KS	  */
	public void setOwner_Location_KS (String Owner_Location_KS)
	{

		set_Value (COLUMNNAME_Owner_Location_KS, Owner_Location_KS);
	}

	/** Get Owner_Location_KS.
		@return Owner_Location_KS	  */
	public String getOwner_Location_KS () 
	{
		return (String)get_Value(COLUMNNAME_Owner_Location_KS);
	}

	/** 1 = 1 */
	public static final String OWNER_LOCATION_TD_1 = "1";
	/** 2 = 2 */
	public static final String OWNER_LOCATION_TD_2 = "2";
	/** Set Owner_Location_TD.
		@param Owner_Location_TD Owner_Location_TD	  */
	public void setOwner_Location_TD (String Owner_Location_TD)
	{

		set_Value (COLUMNNAME_Owner_Location_TD, Owner_Location_TD);
	}

	/** Get Owner_Location_TD.
		@return Owner_Location_TD	  */
	public String getOwner_Location_TD () 
	{
		return (String)get_Value(COLUMNNAME_Owner_Location_TD);
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

	/** Set ROCE_Index_KS.
		@param ROCE_Index_KS ROCE_Index_KS	  */
	public void setROCE_Index_KS (BigDecimal ROCE_Index_KS)
	{
		set_Value (COLUMNNAME_ROCE_Index_KS, ROCE_Index_KS);
	}

	/** Get ROCE_Index_KS.
		@return ROCE_Index_KS	  */
	public BigDecimal getROCE_Index_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ROCE_Index_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ROCE_Index_TD.
		@param ROCE_Index_TD ROCE_Index_TD	  */
	public void setROCE_Index_TD (String ROCE_Index_TD)
	{
		set_Value (COLUMNNAME_ROCE_Index_TD, ROCE_Index_TD);
	}

	/** Get ROCE_Index_TD.
		@return ROCE_Index_TD	  */
	public String getROCE_Index_TD () 
	{
		return (String)get_Value(COLUMNNAME_ROCE_Index_TD);
	}

	/** Set Severity_Level.
		@param Severity_Level 
		Mức độ nghiêm trọng
	  */
	public void setSeverity_Level (BigDecimal Severity_Level)
	{
		set_Value (COLUMNNAME_Severity_Level, Severity_Level);
	}

	/** Get Severity_Level.
		@return Mức độ nghiêm trọng
	  */
	public BigDecimal getSeverity_Level () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Severity_Level);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_TDAB_Business_Areas getTDAB_Business_Areas() throws RuntimeException
    {
		return (I_TDAB_Business_Areas)MTable.get(getCtx(), I_TDAB_Business_Areas.Table_Name)
			.getPO(getTDAB_Business_Areas_ID(), get_TrxName());	}

	/** Set TDAB_Business_Areas.
		@param TDAB_Business_Areas_ID TDAB_Business_Areas	  */
	public void setTDAB_Business_Areas_ID (int TDAB_Business_Areas_ID)
	{
		if (TDAB_Business_Areas_ID < 1) 
			set_Value (COLUMNNAME_TDAB_Business_Areas_ID, null);
		else 
			set_Value (COLUMNNAME_TDAB_Business_Areas_ID, Integer.valueOf(TDAB_Business_Areas_ID));
	}

	/** Get TDAB_Business_Areas.
		@return TDAB_Business_Areas	  */
	public int getTDAB_Business_Areas_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Business_Areas_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Customer_Profile.
		@param TDAB_Customer_Profile_ID TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID)
	{
		if (TDAB_Customer_Profile_ID < 1) 
			set_Value (COLUMNNAME_TDAB_Customer_Profile_ID, null);
		else 
			set_Value (COLUMNNAME_TDAB_Customer_Profile_ID, Integer.valueOf(TDAB_Customer_Profile_ID));
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

	/** Set TDAB_Customer_Score.
		@param TDAB_Customer_Score_ID TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID)
	{
		if (TDAB_Customer_Score_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Score_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Score_ID, Integer.valueOf(TDAB_Customer_Score_ID));
	}

	/** Get TDAB_Customer_Score.
		@return TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Customer_Score_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

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

	/** Set TDAB_Financial_Non_UU.
		@param TDAB_Financial_Non_UU TDAB_Financial_Non_UU	  */
	public void setTDAB_Financial_Non_UU (String TDAB_Financial_Non_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Financial_Non_UU, TDAB_Financial_Non_UU);
	}

	/** Get TDAB_Financial_Non_UU.
		@return TDAB_Financial_Non_UU	  */
	public String getTDAB_Financial_Non_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Financial_Non_UU);
	}

	public I_TDAB_Business_Areas getTDAB_List_Business() throws RuntimeException
    {
		return (I_TDAB_Business_Areas)MTable.get(getCtx(), I_TDAB_Business_Areas.Table_Name)
			.getPO(getTDAB_List_Business_ID(), get_TrxName());	}

	/** Set TDAB_List_Business.
		@param TDAB_List_Business_ID TDAB_List_Business	  */
	public void setTDAB_List_Business_ID (int TDAB_List_Business_ID)
	{
		if (TDAB_List_Business_ID < 1) 
			set_Value (COLUMNNAME_TDAB_List_Business_ID, null);
		else 
			set_Value (COLUMNNAME_TDAB_List_Business_ID, Integer.valueOf(TDAB_List_Business_ID));
	}

	/** Get TDAB_List_Business.
		@return TDAB_List_Business	  */
	public int getTDAB_List_Business_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_List_Business_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Years_Experience_CEO_KS.
		@param Years_Experience_CEO_KS Years_Experience_CEO_KS	  */
	public void setYears_Experience_CEO_KS (BigDecimal Years_Experience_CEO_KS)
	{
		set_Value (COLUMNNAME_Years_Experience_CEO_KS, Years_Experience_CEO_KS);
	}

	/** Get Years_Experience_CEO_KS.
		@return Years_Experience_CEO_KS	  */
	public BigDecimal getYears_Experience_CEO_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Years_Experience_CEO_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Years_Experience_CEO_TD.
		@param Years_Experience_CEO_TD Years_Experience_CEO_TD	  */
	public void setYears_Experience_CEO_TD (BigDecimal Years_Experience_CEO_TD)
	{
		set_Value (COLUMNNAME_Years_Experience_CEO_TD, Years_Experience_CEO_TD);
	}

	/** Get Years_Experience_CEO_TD.
		@return Years_Experience_CEO_TD	  */
	public BigDecimal getYears_Experience_CEO_TD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Years_Experience_CEO_TD);
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

	/** Set Years_Operation_KS.
		@param Years_Operation_KS Years_Operation_KS	  */
	public void setYears_Operation_KS (BigDecimal Years_Operation_KS)
	{
		set_Value (COLUMNNAME_Years_Operation_KS, Years_Operation_KS);
	}

	/** Get Years_Operation_KS.
		@return Years_Operation_KS	  */
	public BigDecimal getYears_Operation_KS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Years_Operation_KS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Years_Operation_TD.
		@param Years_Operation_TD Years_Operation_TD	  */
	public void setYears_Operation_TD (BigDecimal Years_Operation_TD)
	{
		set_Value (COLUMNNAME_Years_Operation_TD, Years_Operation_TD);
	}

	/** Get Years_Operation_TD.
		@return Years_Operation_TD	  */
	public BigDecimal getYears_Operation_TD () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Years_Operation_TD);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}