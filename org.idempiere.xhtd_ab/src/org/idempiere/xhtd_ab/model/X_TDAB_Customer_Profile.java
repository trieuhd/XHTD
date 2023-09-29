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

/** Generated Model for TDAB_Customer_Profile
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Customer_Profile extends PO implements I_TDAB_Customer_Profile, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220927L;

    /** Standard Constructor */
    public X_TDAB_Customer_Profile (Properties ctx, int TDAB_Customer_Profile_ID, String trxName)
    {
      super (ctx, TDAB_Customer_Profile_ID, trxName);
      /** if (TDAB_Customer_Profile_ID == 0)
        {
			setDate_Loan (new Timestamp( System.currentTimeMillis() ));
// SYSDATE
			setName (null);
			setNumberBusiness (null);
			setTDAB_Customer_Profile_ID (0);
			setTDAB_Customer_Profile_UU (null);
			setTDAB_Profile_Status_ID (0);
// 1
			setTaxCode (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Customer_Profile (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Customer_Profile[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ACTION_UPL.
		@param ACTION_UPL ACTION_UPL	  */
	public void setACTION_UPL (String ACTION_UPL)
	{
		set_Value (COLUMNNAME_ACTION_UPL, ACTION_UPL);
	}

	/** Get ACTION_UPL.
		@return ACTION_UPL	  */
	public String getACTION_UPL () 
	{
		return (String)get_Value(COLUMNNAME_ACTION_UPL);
	}

	/** Set AD_Org_ID_Hander.
		@param AD_Org_ID_Hander AD_Org_ID_Hander	  */
	public void setAD_Org_ID_Hander (int AD_Org_ID_Hander)
	{
		set_Value (COLUMNNAME_AD_Org_ID_Hander, Integer.valueOf(AD_Org_ID_Hander));
	}

	/** Get AD_Org_ID_Hander.
		@return AD_Org_ID_Hander	  */
	public int getAD_Org_ID_Hander () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Org_ID_Hander);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Org_ID_KS.
		@param AD_Org_ID_KS AD_Org_ID_KS	  */
	public void setAD_Org_ID_KS (int AD_Org_ID_KS)
	{
		set_Value (COLUMNNAME_AD_Org_ID_KS, Integer.valueOf(AD_Org_ID_KS));
	}

	/** Get AD_Org_ID_KS.
		@return AD_Org_ID_KS	  */
	public int getAD_Org_ID_KS () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Org_ID_KS);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_Org_ID_TD.
		@param AD_Org_ID_TD AD_Org_ID_TD	  */
	public void setAD_Org_ID_TD (int AD_Org_ID_TD)
	{
		set_Value (COLUMNNAME_AD_Org_ID_TD, Integer.valueOf(AD_Org_ID_TD));
	}

	/** Get AD_Org_ID_TD.
		@return AD_Org_ID_TD	  */
	public int getAD_Org_ID_TD () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Org_ID_TD);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ActionAp.
		@param ActionAp ActionAp	  */
	public void setActionAp (String ActionAp)
	{
		set_Value (COLUMNNAME_ActionAp, ActionAp);
	}

	/** Get ActionAp.
		@return ActionAp	  */
	public String getActionAp () 
	{
		return (String)get_Value(COLUMNNAME_ActionAp);
	}

	/** Set ActionCancel.
		@param ActionCancel ActionCancel	  */
	public void setActionCancel (String ActionCancel)
	{
		set_Value (COLUMNNAME_ActionCancel, ActionCancel);
	}

	/** Get ActionCancel.
		@return ActionCancel	  */
	public String getActionCancel () 
	{
		return (String)get_Value(COLUMNNAME_ActionCancel);
	}

	/** Set ActionCd.
		@param ActionCd ActionCd	  */
	public void setActionCd (String ActionCd)
	{
		set_Value (COLUMNNAME_ActionCd, ActionCd);
	}

	/** Get ActionCd.
		@return ActionCd	  */
	public String getActionCd () 
	{
		return (String)get_Value(COLUMNNAME_ActionCd);
	}

	/** Set ActionEdit.
		@param ActionEdit ActionEdit	  */
	public void setActionEdit (String ActionEdit)
	{
		set_Value (COLUMNNAME_ActionEdit, ActionEdit);
	}

	/** Get ActionEdit.
		@return ActionEdit	  */
	public String getActionEdit () 
	{
		return (String)get_Value(COLUMNNAME_ActionEdit);
	}

	/** Set ActionKs.
		@param ActionKs ActionKs	  */
	public void setActionKs (String ActionKs)
	{
		set_Value (COLUMNNAME_ActionKs, ActionKs);
	}

	/** Get ActionKs.
		@return ActionKs	  */
	public String getActionKs () 
	{
		return (String)get_Value(COLUMNNAME_ActionKs);
	}

	/** Set ActionViewScore.
		@param ActionViewScore ActionViewScore	  */
	public void setActionViewScore (String ActionViewScore)
	{
		set_Value (COLUMNNAME_ActionViewScore, ActionViewScore);
	}

	/** Get ActionViewScore.
		@return ActionViewScore	  */
	public String getActionViewScore () 
	{
		return (String)get_Value(COLUMNNAME_ActionViewScore);
	}

	/** Set Action_Suggest.
		@param Action_Suggest Action_Suggest	  */
	public void setAction_Suggest (String Action_Suggest)
	{
		set_Value (COLUMNNAME_Action_Suggest, Action_Suggest);
	}

	/** Get Action_Suggest.
		@return Action_Suggest	  */
	public String getAction_Suggest () 
	{
		return (String)get_Value(COLUMNNAME_Action_Suggest);
	}

	/** CKT = CKT */
	public static final String BUSINESSTYPE_CKT = "CKT";
	/** CQH = CQH */
	public static final String BUSINESSTYPE_CQH = "CQH";
	/** DQH = DQH */
	public static final String BUSINESSTYPE_DQH = "DQH";
	/** Set BusinessType.
		@param BusinessType BusinessType	  */
	public void setBusinessType (String BusinessType)
	{

		set_Value (COLUMNNAME_BusinessType, BusinessType);
	}

	/** Get BusinessType.
		@return BusinessType	  */
	public String getBusinessType () 
	{
		return (String)get_Value(COLUMNNAME_BusinessType);
	}

	/** Set Business_Name.
		@param Business_Name Business_Name	  */
	public void setBusiness_Name (String Business_Name)
	{
		set_Value (COLUMNNAME_Business_Name, Business_Name);
	}

	/** Get Business_Name.
		@return Business_Name	  */
	public String getBusiness_Name () 
	{
		return (String)get_Value(COLUMNNAME_Business_Name);
	}

	/** Set CIC_ID.
		@param CIC_ID CIC_ID	  */
	public void setCIC_ID (String CIC_ID)
	{
		set_Value (COLUMNNAME_CIC_ID, CIC_ID);
	}

	/** Get CIC_ID.
		@return CIC_ID	  */
	public String getCIC_ID () 
	{
		return (String)get_Value(COLUMNNAME_CIC_ID);
	}

	/** Set CIC_Score.
		@param CIC_Score CIC_Score	  */
	public void setCIC_Score (String CIC_Score)
	{
		set_Value (COLUMNNAME_CIC_Score, CIC_Score);
	}

	/** Get CIC_Score.
		@return CIC_Score	  */
	public String getCIC_Score () 
	{
		return (String)get_Value(COLUMNNAME_CIC_Score);
	}

	/** Set CIF.
		@param CIF CIF	  */
	public void setCIF (String CIF)
	{
		set_Value (COLUMNNAME_CIF, CIF);
	}

	/** Get CIF.
		@return CIF	  */
	public String getCIF () 
	{
		return (String)get_Value(COLUMNNAME_CIF);
	}

	/** Set CompanyName.
		@param CompanyName CompanyName	  */
	public void setCompanyName (String CompanyName)
	{
		set_Value (COLUMNNAME_CompanyName, CompanyName);
	}

	/** Get CompanyName.
		@return CompanyName	  */
	public String getCompanyName () 
	{
		return (String)get_Value(COLUMNNAME_CompanyName);
	}

	/** Set DATE_OFFER.
		@param DATE_OFFER DATE_OFFER	  */
	public void setDATE_OFFER (Timestamp DATE_OFFER)
	{
		set_Value (COLUMNNAME_DATE_OFFER, DATE_OFFER);
	}

	/** Get DATE_OFFER.
		@return DATE_OFFER	  */
	public Timestamp getDATE_OFFER () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DATE_OFFER);
	}

	/** Set DATE_REFUSE.
		@param DATE_REFUSE DATE_REFUSE	  */
	public void setDATE_REFUSE (Timestamp DATE_REFUSE)
	{
		set_Value (COLUMNNAME_DATE_REFUSE, DATE_REFUSE);
	}

	/** Get DATE_REFUSE.
		@return DATE_REFUSE	  */
	public Timestamp getDATE_REFUSE () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DATE_REFUSE);
	}

	/** Set Date_CIC_KS.
		@param Date_CIC_KS Date_CIC_KS	  */
	public void setDate_CIC_KS (Timestamp Date_CIC_KS)
	{
		set_Value (COLUMNNAME_Date_CIC_KS, Date_CIC_KS);
	}

	/** Get Date_CIC_KS.
		@return Date_CIC_KS	  */
	public Timestamp getDate_CIC_KS () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_CIC_KS);
	}

	/** Set Date_CIC_TD.
		@param Date_CIC_TD Date_CIC_TD	  */
	public void setDate_CIC_TD (int Date_CIC_TD)
	{
		set_Value (COLUMNNAME_Date_CIC_TD, Integer.valueOf(Date_CIC_TD));
	}

	/** Get Date_CIC_TD.
		@return Date_CIC_TD	  */
	public int getDate_CIC_TD () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Date_CIC_TD);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date_CiC.
		@param Date_CiC Date_CiC	  */
	public void setDate_CiC (Timestamp Date_CiC)
	{
		set_Value (COLUMNNAME_Date_CiC, Date_CiC);
	}

	/** Get Date_CiC.
		@return Date_CiC	  */
	public Timestamp getDate_CiC () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_CiC);
	}

	/** Set Date_Create.
		@param Date_Create Date_Create	  */
	public void setDate_Create (Timestamp Date_Create)
	{
		set_Value (COLUMNNAME_Date_Create, Date_Create);
	}

	/** Get Date_Create.
		@return Date_Create	  */
	public Timestamp getDate_Create () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Create);
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

	/** Set Date_Loan.
		@param Date_Loan Date_Loan	  */
	public void setDate_Loan (Timestamp Date_Loan)
	{
		set_Value (COLUMNNAME_Date_Loan, Date_Loan);
	}

	/** Get Date_Loan.
		@return Date_Loan	  */
	public Timestamp getDate_Loan () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Loan);
	}

	/** Set Date_Loan_KS.
		@param Date_Loan_KS Date_Loan_KS	  */
	public void setDate_Loan_KS (Timestamp Date_Loan_KS)
	{
		set_Value (COLUMNNAME_Date_Loan_KS, Date_Loan_KS);
	}

	/** Get Date_Loan_KS.
		@return Date_Loan_KS	  */
	public Timestamp getDate_Loan_KS () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Loan_KS);
	}

	/** Set Date_Loan_TD.
		@param Date_Loan_TD Date_Loan_TD	  */
	public void setDate_Loan_TD (Timestamp Date_Loan_TD)
	{
		set_Value (COLUMNNAME_Date_Loan_TD, Date_Loan_TD);
	}

	/** Get Date_Loan_TD.
		@return Date_Loan_TD	  */
	public Timestamp getDate_Loan_TD () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Loan_TD);
	}

	/** Set Date_Update.
		@param Date_Update Date_Update	  */
	public void setDate_Update (Timestamp Date_Update)
	{
		set_Value (COLUMNNAME_Date_Update, Date_Update);
	}

	/** Get Date_Update.
		@return Date_Update	  */
	public Timestamp getDate_Update () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Update);
	}

	/** Khoi tao = CKT */
	public static final String DOCSTATUS_KhoiTao = "CKT";
	/** vi pham KO = CKO */
	public static final String DOCSTATUS_ViPhamKO = "CKO";
	/** Kiem soat tu choi = CKS */
	public static final String DOCSTATUS_KiemSoatTuChoi = "CKS";
	/** Loai ho so = CNO */
	public static final String DOCSTATUS_LoaiHoSo = "CNO";
	/** Cho duyet = DKS */
	public static final String DOCSTATUS_ChoDuyet = "DKS";
	/** de xuat ngoai le = RKO */
	public static final String DOCSTATUS_DeXuatNgoaiLe = "RKO";
	/** Kiem soat duyet = CTD */
	public static final String DOCSTATUS_KiemSoatDuyet = "CTD";
	/** Tham dinh tin dung = CGN */
	public static final String DOCSTATUS_ThamDinhTinDung = "CGN";
	/** Ra quyet dinh tin dung = DGN */
	public static final String DOCSTATUS_RaQuyetDinhTinDung = "DGN";
	/** Tham dinh tu choi = TDC */
	public static final String DOCSTATUS_ThamDinhTuChoi = "TDC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set INFO_OFFER.
		@param INFO_OFFER INFO_OFFER	  */
	public void setINFO_OFFER (String INFO_OFFER)
	{
		set_Value (COLUMNNAME_INFO_OFFER, INFO_OFFER);
	}

	/** Get INFO_OFFER.
		@return INFO_OFFER	  */
	public String getINFO_OFFER () 
	{
		return (String)get_Value(COLUMNNAME_INFO_OFFER);
	}

	/** Set INFO_REFUSE.
		@param INFO_REFUSE INFO_REFUSE	  */
	public void setINFO_REFUSE (String INFO_REFUSE)
	{
		set_Value (COLUMNNAME_INFO_REFUSE, INFO_REFUSE);
	}

	/** Get INFO_REFUSE.
		@return INFO_REFUSE	  */
	public String getINFO_REFUSE () 
	{
		return (String)get_Value(COLUMNNAME_INFO_REFUSE);
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

	/** Set LockProfile.
		@param LockProfile LockProfile	  */
	public void setLockProfile (String LockProfile)
	{
		set_Value (COLUMNNAME_LockProfile, LockProfile);
	}

	/** Get LockProfile.
		@return LockProfile	  */
	public String getLockProfile () 
	{
		return (String)get_Value(COLUMNNAME_LockProfile);
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

	/** Set NOFFER.
		@param NOFFER NOFFER	  */
	public void setNOFFER (int NOFFER)
	{
		set_Value (COLUMNNAME_NOFFER, Integer.valueOf(NOFFER));
	}

	/** Get NOFFER.
		@return NOFFER	  */
	public int getNOFFER () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NOFFER);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NREFUSE.
		@param NREFUSE NREFUSE	  */
	public void setNREFUSE (int NREFUSE)
	{
		set_Value (COLUMNNAME_NREFUSE, Integer.valueOf(NREFUSE));
	}

	/** Get NREFUSE.
		@return NREFUSE	  */
	public int getNREFUSE () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NREFUSE);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Name_Ids.
		@param Name_Ids Name_Ids	  */
	public void setName_Ids (String Name_Ids)
	{
		set_Value (COLUMNNAME_Name_Ids, Name_Ids);
	}

	/** Get Name_Ids.
		@return Name_Ids	  */
	public String getName_Ids () 
	{
		return (String)get_Value(COLUMNNAME_Name_Ids);
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

	/** Set Note_CV.
		@param Note_CV Note_CV	  */
	public void setNote_CV (String Note_CV)
	{
		set_Value (COLUMNNAME_Note_CV, Note_CV);
	}

	/** Get Note_CV.
		@return Note_CV	  */
	public String getNote_CV () 
	{
		return (String)get_Value(COLUMNNAME_Note_CV);
	}

	/** Set Note_KS.
		@param Note_KS Note_KS	  */
	public void setNote_KS (String Note_KS)
	{
		set_Value (COLUMNNAME_Note_KS, Note_KS);
	}

	/** Get Note_KS.
		@return Note_KS	  */
	public String getNote_KS () 
	{
		return (String)get_Value(COLUMNNAME_Note_KS);
	}

	/** Set Note_TD.
		@param Note_TD Note_TD	  */
	public void setNote_TD (String Note_TD)
	{
		set_Value (COLUMNNAME_Note_TD, Note_TD);
	}

	/** Get Note_TD.
		@return Note_TD	  */
	public String getNote_TD () 
	{
		return (String)get_Value(COLUMNNAME_Note_TD);
	}

	/** Set NumberBusiness.
		@param NumberBusiness NumberBusiness	  */
	public void setNumberBusiness (String NumberBusiness)
	{
		set_Value (COLUMNNAME_NumberBusiness, NumberBusiness);
	}

	/** Get NumberBusiness.
		@return NumberBusiness	  */
	public String getNumberBusiness () 
	{
		return (String)get_Value(COLUMNNAME_NumberBusiness);
	}

	/** Set PTC_SCORE.
		@param PTC_SCORE PTC_SCORE	  */
	public void setPTC_SCORE (String PTC_SCORE)
	{
		set_Value (COLUMNNAME_PTC_SCORE, PTC_SCORE);
	}

	/** Get PTC_SCORE.
		@return PTC_SCORE	  */
	public String getPTC_SCORE () 
	{
		return (String)get_Value(COLUMNNAME_PTC_SCORE);
	}

	/** Set Rank.
		@param Rank Rank	  */
	public void setRank (String Rank)
	{
		set_Value (COLUMNNAME_Rank, Rank);
	}

	/** Get Rank.
		@return Rank	  */
	public String getRank () 
	{
		return (String)get_Value(COLUMNNAME_Rank);
	}

	/** Set Rank_KS.
		@param Rank_KS Rank_KS	  */
	public void setRank_KS (String Rank_KS)
	{
		set_Value (COLUMNNAME_Rank_KS, Rank_KS);
	}

	/** Get Rank_KS.
		@return Rank_KS	  */
	public String getRank_KS () 
	{
		return (String)get_Value(COLUMNNAME_Rank_KS);
	}

	/** Set Rank_PD.
		@param Rank_PD Rank_PD	  */
	public void setRank_PD (String Rank_PD)
	{
		set_Value (COLUMNNAME_Rank_PD, Rank_PD);
	}

	/** Get Rank_PD.
		@return Rank_PD	  */
	public String getRank_PD () 
	{
		return (String)get_Value(COLUMNNAME_Rank_PD);
	}

	/** Set Rate_Debt.
		@param Rate_Debt Rate_Debt	  */
	public void setRate_Debt (String Rate_Debt)
	{
		set_Value (COLUMNNAME_Rate_Debt, Rate_Debt);
	}

	/** Get Rate_Debt.
		@return Rate_Debt	  */
	public String getRate_Debt () 
	{
		return (String)get_Value(COLUMNNAME_Rate_Debt);
	}

	/** Set Rate_Debt_KS.
		@param Rate_Debt_KS Rate_Debt_KS	  */
	public void setRate_Debt_KS (String Rate_Debt_KS)
	{
		set_Value (COLUMNNAME_Rate_Debt_KS, Rate_Debt_KS);
	}

	/** Get Rate_Debt_KS.
		@return Rate_Debt_KS	  */
	public String getRate_Debt_KS () 
	{
		return (String)get_Value(COLUMNNAME_Rate_Debt_KS);
	}

	/** Set Rate_Debt_PD.
		@param Rate_Debt_PD Rate_Debt_PD	  */
	public void setRate_Debt_PD (String Rate_Debt_PD)
	{
		set_Value (COLUMNNAME_Rate_Debt_PD, Rate_Debt_PD);
	}

	/** Get Rate_Debt_PD.
		@return Rate_Debt_PD	  */
	public String getRate_Debt_PD () 
	{
		return (String)get_Value(COLUMNNAME_Rate_Debt_PD);
	}

	/** Set Report_Btn.
		@param Report_Btn Report_Btn	  */
	public void setReport_Btn (String Report_Btn)
	{
		set_Value (COLUMNNAME_Report_Btn, Report_Btn);
	}

	/** Get Report_Btn.
		@return Report_Btn	  */
	public String getReport_Btn () 
	{
		return (String)get_Value(COLUMNNAME_Report_Btn);
	}

	/** Set Report_Btn_Cus.
		@param Report_Btn_Cus Report_Btn_Cus	  */
	public void setReport_Btn_Cus (String Report_Btn_Cus)
	{
		set_Value (COLUMNNAME_Report_Btn_Cus, Report_Btn_Cus);
	}

	/** Get Report_Btn_Cus.
		@return Report_Btn_Cus	  */
	public String getReport_Btn_Cus () 
	{
		return (String)get_Value(COLUMNNAME_Report_Btn_Cus);
	}

	/** Set Report_Btn_Detail.
		@param Report_Btn_Detail Report_Btn_Detail	  */
	public void setReport_Btn_Detail (String Report_Btn_Detail)
	{
		set_Value (COLUMNNAME_Report_Btn_Detail, Report_Btn_Detail);
	}

	/** Get Report_Btn_Detail.
		@return Report_Btn_Detail	  */
	public String getReport_Btn_Detail () 
	{
		return (String)get_Value(COLUMNNAME_Report_Btn_Detail);
	}

	/** CTD = CTD */
	public static final String REQUEST_PURPOSES_CTD = "CTD";
	/** TDG = TDG */
	public static final String REQUEST_PURPOSES_TDG = "TDG";
	/** Set Request_Purposes.
		@param Request_Purposes 
		Mục đích chấm điểm
	  */
	public void setRequest_Purposes (String Request_Purposes)
	{

		set_Value (COLUMNNAME_Request_Purposes, Request_Purposes);
	}

	/** Get Request_Purposes.
		@return Mục đích chấm điểm
	  */
	public String getRequest_Purposes () 
	{
		return (String)get_Value(COLUMNNAME_Request_Purposes);
	}

	/** Set Revenue.
		@param Revenue Revenue	  */
	public void setRevenue (BigDecimal Revenue)
	{
		set_Value (COLUMNNAME_Revenue, Revenue);
	}

	/** Get Revenue.
		@return Revenue	  */
	public BigDecimal getRevenue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Revenue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Success = DHT */
	public static final String STATUSCIC_Success = "DHT";
	/** NoSuccess = CHT */
	public static final String STATUSCIC_NoSuccess = "CHT";
	/** ProcessEdit = PED */
	public static final String STATUSCIC_ProcessEdit = "PED";
	/** Edited = DCS */
	public static final String STATUSCIC_Edited = "DCS";
	/** Set StatusCIC.
		@param StatusCIC StatusCIC	  */
	public void setStatusCIC (String StatusCIC)
	{

		set_Value (COLUMNNAME_StatusCIC, StatusCIC);
	}

	/** Get StatusCIC.
		@return StatusCIC	  */
	public String getStatusCIC () 
	{
		return (String)get_Value(COLUMNNAME_StatusCIC);
	}

	/** Success = DHT */
	public static final String STATUSFINANCE_Success = "DHT";
	/** NoSuccess = CHT */
	public static final String STATUSFINANCE_NoSuccess = "CHT";
	/** ProcessEdit = PED */
	public static final String STATUSFINANCE_ProcessEdit = "PED";
	/** Edited = DCS */
	public static final String STATUSFINANCE_Edited = "DCS";
	/** Set StatusFinance.
		@param StatusFinance StatusFinance	  */
	public void setStatusFinance (String StatusFinance)
	{

		set_Value (COLUMNNAME_StatusFinance, StatusFinance);
	}

	/** Get StatusFinance.
		@return StatusFinance	  */
	public String getStatusFinance () 
	{
		return (String)get_Value(COLUMNNAME_StatusFinance);
	}

	/** Success = DHT */
	public static final String STATUSNONFINANCE_Success = "DHT";
	/** NoSuccess = CHT */
	public static final String STATUSNONFINANCE_NoSuccess = "CHT";
	/** ProcessEdit = PED */
	public static final String STATUSNONFINANCE_ProcessEdit = "PED";
	/** Edited = DCS */
	public static final String STATUSNONFINANCE_Edited = "DCS";
	/** Set StatusNonFinance.
		@param StatusNonFinance StatusNonFinance	  */
	public void setStatusNonFinance (String StatusNonFinance)
	{

		set_Value (COLUMNNAME_StatusNonFinance, StatusNonFinance);
	}

	/** Get StatusNonFinance.
		@return StatusNonFinance	  */
	public String getStatusNonFinance () 
	{
		return (String)get_Value(COLUMNNAME_StatusNonFinance);
	}

	/** HD = HD */
	public static final String STATUS_DN_HD = "HD";
	/** K = K */
	public static final String STATUS_DN_K = "K";
	/** KT = KT */
	public static final String STATUS_DN_KT = "KT";
	/** Set Status_DN.
		@param Status_DN Status_DN	  */
	public void setStatus_DN (String Status_DN)
	{

		set_Value (COLUMNNAME_Status_DN, Status_DN);
	}

	/** Get Status_DN.
		@return Status_DN	  */
	public String getStatus_DN () 
	{
		return (String)get_Value(COLUMNNAME_Status_DN);
	}

	/** Yes = Y */
	public static final String STATUS_KO_Yes = "Y";
	/** No = N */
	public static final String STATUS_KO_No = "N";
	/** Set Status_KO.
		@param Status_KO Status_KO	  */
	public void setStatus_KO (String Status_KO)
	{

		set_Value (COLUMNNAME_Status_KO, Status_KO);
	}

	/** Get Status_KO.
		@return Status_KO	  */
	public String getStatus_KO () 
	{
		return (String)get_Value(COLUMNNAME_Status_KO);
	}

	/** Success = DHT */
	public static final String STATUS_SUGGEST_Success = "DHT";
	/** NoSuccess = CHT */
	public static final String STATUS_SUGGEST_NoSuccess = "CHT";
	/** ProcessEdit = PED */
	public static final String STATUS_SUGGEST_ProcessEdit = "PED";
	/** Edited = DCS */
	public static final String STATUS_SUGGEST_Edited = "DCS";
	/** Set Status_Suggest.
		@param Status_Suggest Status_Suggest	  */
	public void setStatus_Suggest (String Status_Suggest)
	{

		set_Value (COLUMNNAME_Status_Suggest, Status_Suggest);
	}

	/** Get Status_Suggest.
		@return Status_Suggest	  */
	public String getStatus_Suggest () 
	{
		return (String)get_Value(COLUMNNAME_Status_Suggest);
	}

	/** Set TC_SCORE.
		@param TC_SCORE TC_SCORE	  */
	public void setTC_SCORE (String TC_SCORE)
	{
		set_Value (COLUMNNAME_TC_SCORE, TC_SCORE);
	}

	/** Get TC_SCORE.
		@return TC_SCORE	  */
	public String getTC_SCORE () 
	{
		return (String)get_Value(COLUMNNAME_TC_SCORE);
	}

	public I_TDAB_Customer getTDAB_Customer() throws RuntimeException
    {
		return (I_TDAB_Customer)MTable.get(getCtx(), I_TDAB_Customer.Table_Name)
			.getPO(getTDAB_Customer_ID(), get_TrxName());	}

	/** Set TDAB_Customer.
		@param TDAB_Customer_ID TDAB_Customer	  */
	public void setTDAB_Customer_ID (int TDAB_Customer_ID)
	{
		if (TDAB_Customer_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Customer_ID, Integer.valueOf(TDAB_Customer_ID));
	}

	/** Get TDAB_Customer.
		@return TDAB_Customer	  */
	public int getTDAB_Customer_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Customer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set TDAB_Customer_Profile_UU.
		@param TDAB_Customer_Profile_UU TDAB_Customer_Profile_UU	  */
	public void setTDAB_Customer_Profile_UU (String TDAB_Customer_Profile_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Profile_UU, TDAB_Customer_Profile_UU);
	}

	/** Get TDAB_Customer_Profile_UU.
		@return TDAB_Customer_Profile_UU	  */
	public String getTDAB_Customer_Profile_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Customer_Profile_UU);
	}

	public I_TDAB_Profile_Status getTDAB_Profile_Status() throws RuntimeException
    {
		return (I_TDAB_Profile_Status)MTable.get(getCtx(), I_TDAB_Profile_Status.Table_Name)
			.getPO(getTDAB_Profile_Status_ID(), get_TrxName());	}

	/** Set TDAB_Profile_Status.
		@param TDAB_Profile_Status_ID TDAB_Profile_Status	  */
	public void setTDAB_Profile_Status_ID (int TDAB_Profile_Status_ID)
	{
		if (TDAB_Profile_Status_ID < 1) 
			set_Value (COLUMNNAME_TDAB_Profile_Status_ID, null);
		else 
			set_Value (COLUMNNAME_TDAB_Profile_Status_ID, Integer.valueOf(TDAB_Profile_Status_ID));
	}

	/** Get TDAB_Profile_Status.
		@return TDAB_Profile_Status	  */
	public int getTDAB_Profile_Status_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Profile_Status_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** 1 = 1 */
	public static final String TYPE_BCTC_1 = "1";
	/** 2 = 2 */
	public static final String TYPE_BCTC_2 = "2";
	/** 3 = 3 */
	public static final String TYPE_BCTC_3 = "3";
	/** 0 = 0 */
	public static final String TYPE_BCTC_0 = "0";
	/** Set TYPE_BCTC.
		@param TYPE_BCTC TYPE_BCTC	  */
	public void setTYPE_BCTC (String TYPE_BCTC)
	{

		set_Value (COLUMNNAME_TYPE_BCTC, TYPE_BCTC);
	}

	/** Get TYPE_BCTC.
		@return TYPE_BCTC	  */
	public String getTYPE_BCTC () 
	{
		return (String)get_Value(COLUMNNAME_TYPE_BCTC);
	}

	/** Set TaxCode.
		@param TaxCode TaxCode	  */
	public void setTaxCode (String TaxCode)
	{
		set_Value (COLUMNNAME_TaxCode, TaxCode);
	}

	/** Get TaxCode.
		@return TaxCode	  */
	public String getTaxCode () 
	{
		return (String)get_Value(COLUMNNAME_TaxCode);
	}

	/** Set TotalScore.
		@param TotalScore TotalScore	  */
	public void setTotalScore (String TotalScore)
	{
		set_Value (COLUMNNAME_TotalScore, TotalScore);
	}

	/** Get TotalScore.
		@return TotalScore	  */
	public String getTotalScore () 
	{
		return (String)get_Value(COLUMNNAME_TotalScore);
	}

	/** Set TotalScoreKS.
		@param TotalScoreKS TotalScoreKS	  */
	public void setTotalScoreKS (String TotalScoreKS)
	{
		set_Value (COLUMNNAME_TotalScoreKS, TotalScoreKS);
	}

	/** Get TotalScoreKS.
		@return TotalScoreKS	  */
	public String getTotalScoreKS () 
	{
		return (String)get_Value(COLUMNNAME_TotalScoreKS);
	}

	/** Set TotalScorePD.
		@param TotalScorePD TotalScorePD	  */
	public void setTotalScorePD (String TotalScorePD)
	{
		set_Value (COLUMNNAME_TotalScorePD, TotalScorePD);
	}

	/** Get TotalScorePD.
		@return TotalScorePD	  */
	public String getTotalScorePD () 
	{
		return (String)get_Value(COLUMNNAME_TotalScorePD);
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

	public org.compiere.model.I_AD_User getUser_Appraiser() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser_Appraiser_ID(), get_TrxName());	}

	/** Set User_Appraiser_ID.
		@param User_Appraiser_ID User_Appraiser_ID	  */
	public void setUser_Appraiser_ID (int User_Appraiser_ID)
	{
		if (User_Appraiser_ID < 1) 
			set_Value (COLUMNNAME_User_Appraiser_ID, null);
		else 
			set_Value (COLUMNNAME_User_Appraiser_ID, Integer.valueOf(User_Appraiser_ID));
	}

	/** Get User_Appraiser_ID.
		@return User_Appraiser_ID	  */
	public int getUser_Appraiser_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User_Appraiser_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getUser_Approved() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser_Approved_ID(), get_TrxName());	}

	/** Set User_Approved_ID.
		@param User_Approved_ID User_Approved_ID	  */
	public void setUser_Approved_ID (int User_Approved_ID)
	{
		if (User_Approved_ID < 1) 
			set_Value (COLUMNNAME_User_Approved_ID, null);
		else 
			set_Value (COLUMNNAME_User_Approved_ID, Integer.valueOf(User_Approved_ID));
	}

	/** Get User_Approved_ID.
		@return User_Approved_ID	  */
	public int getUser_Approved_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User_Approved_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getUser_Checked() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser_Checked_ID(), get_TrxName());	}

	/** Set User_Checked_ID.
		@param User_Checked_ID User_Checked_ID	  */
	public void setUser_Checked_ID (int User_Checked_ID)
	{
		if (User_Checked_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_User_Checked_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_User_Checked_ID, Integer.valueOf(User_Checked_ID));
	}

	/** Get User_Checked_ID.
		@return User_Checked_ID	  */
	public int getUser_Checked_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User_Checked_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getUser_Handover() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser_Handover_ID(), get_TrxName());	}

	/** Set User_Handover_ID.
		@param User_Handover_ID User_Handover_ID	  */
	public void setUser_Handover_ID (int User_Handover_ID)
	{
		if (User_Handover_ID < 1) 
			set_Value (COLUMNNAME_User_Handover_ID, null);
		else 
			set_Value (COLUMNNAME_User_Handover_ID, Integer.valueOf(User_Handover_ID));
	}

	/** Get User_Handover_ID.
		@return User_Handover_ID	  */
	public int getUser_Handover_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User_Handover_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getUser_Score() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser_Score_ID(), get_TrxName());	}

	/** Set User_Score_ID.
		@param User_Score_ID User_Score_ID	  */
	public void setUser_Score_ID (int User_Score_ID)
	{
		if (User_Score_ID < 1) 
			set_Value (COLUMNNAME_User_Score_ID, null);
		else 
			set_Value (COLUMNNAME_User_Score_ID, Integer.valueOf(User_Score_ID));
	}

	/** Get User_Score_ID.
		@return User_Score_ID	  */
	public int getUser_Score_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User_Score_ID);
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