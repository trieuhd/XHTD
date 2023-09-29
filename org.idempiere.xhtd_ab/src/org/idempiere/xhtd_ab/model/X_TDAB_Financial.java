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

/** Generated Model for TDAB_Financial
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Financial extends PO implements I_TDAB_Financial, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210320L;

    /** Standard Constructor */
    public X_TDAB_Financial (Properties ctx, int TDAB_Financial_ID, String trxName)
    {
      super (ctx, TDAB_Financial_ID, trxName);
      /** if (TDAB_Financial_ID == 0)
        {
			setBCTC_B1_File (null);
			setTDAB_Financial_ID (0);
			setTDAB_Financial_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Financial (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Financial[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set BCTC_B1_File.
		@param BCTC_B1_File BCTC_B1_File	  */
	public void setBCTC_B1_File (String BCTC_B1_File)
	{
		set_Value (COLUMNNAME_BCTC_B1_File, BCTC_B1_File);
	}

	/** Get BCTC_B1_File.
		@return BCTC_B1_File	  */
	public String getBCTC_B1_File () 
	{
		return (String)get_Value(COLUMNNAME_BCTC_B1_File);
	}

	/** Set Bonus_And_Welfare_Fund.
		@param Bonus_And_Welfare_Fund 
		Nguồn kinh phí và quỹ khác
	  */
	public void setBonus_And_Welfare_Fund (BigDecimal Bonus_And_Welfare_Fund)
	{
		set_Value (COLUMNNAME_Bonus_And_Welfare_Fund, Bonus_And_Welfare_Fund);
	}

	/** Get Bonus_And_Welfare_Fund.
		@return Nguồn kinh phí và quỹ khác
	  */
	public BigDecimal getBonus_And_Welfare_Fund () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Bonus_And_Welfare_Fund);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Bonus_And_Welfare_Fund_LY.
		@param Bonus_And_Welfare_Fund_LY Bonus_And_Welfare_Fund_LY	  */
	public void setBonus_And_Welfare_Fund_LY (BigDecimal Bonus_And_Welfare_Fund_LY)
	{
		set_Value (COLUMNNAME_Bonus_And_Welfare_Fund_LY, Bonus_And_Welfare_Fund_LY);
	}

	/** Get Bonus_And_Welfare_Fund_LY.
		@return Bonus_And_Welfare_Fund_LY	  */
	public BigDecimal getBonus_And_Welfare_Fund_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Bonus_And_Welfare_Fund_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Btn_Download_BCTC_KSV.
		@param Btn_Download_BCTC_KSV Btn_Download_BCTC_KSV	  */
	public void setBtn_Download_BCTC_KSV (String Btn_Download_BCTC_KSV)
	{
		set_Value (COLUMNNAME_Btn_Download_BCTC_KSV, Btn_Download_BCTC_KSV);
	}

	/** Get Btn_Download_BCTC_KSV.
		@return Btn_Download_BCTC_KSV	  */
	public String getBtn_Download_BCTC_KSV () 
	{
		return (String)get_Value(COLUMNNAME_Btn_Download_BCTC_KSV);
	}

	/** Set Btn_Download_BCTC_QHKH.
		@param Btn_Download_BCTC_QHKH 
		Btn_Download_BCTC_QHKH
	  */
	public void setBtn_Download_BCTC_QHKH (String Btn_Download_BCTC_QHKH)
	{
		set_Value (COLUMNNAME_Btn_Download_BCTC_QHKH, Btn_Download_BCTC_QHKH);
	}

	/** Get Btn_Download_BCTC_QHKH.
		@return Btn_Download_BCTC_QHKH
	  */
	public String getBtn_Download_BCTC_QHKH () 
	{
		return (String)get_Value(COLUMNNAME_Btn_Download_BCTC_QHKH);
	}

	/** Set Btn_Download_BCTC_TDTD.
		@param Btn_Download_BCTC_TDTD Btn_Download_BCTC_TDTD	  */
	public void setBtn_Download_BCTC_TDTD (String Btn_Download_BCTC_TDTD)
	{
		set_Value (COLUMNNAME_Btn_Download_BCTC_TDTD, Btn_Download_BCTC_TDTD);
	}

	/** Get Btn_Download_BCTC_TDTD.
		@return Btn_Download_BCTC_TDTD	  */
	public String getBtn_Download_BCTC_TDTD () 
	{
		return (String)get_Value(COLUMNNAME_Btn_Download_BCTC_TDTD);
	}

	/** Set Btn_Download_Template.
		@param Btn_Download_Template Btn_Download_Template	  */
	public void setBtn_Download_Template (String Btn_Download_Template)
	{
		set_Value (COLUMNNAME_Btn_Download_Template, Btn_Download_Template);
	}

	/** Get Btn_Download_Template.
		@return Btn_Download_Template	  */
	public String getBtn_Download_Template () 
	{
		return (String)get_Value(COLUMNNAME_Btn_Download_Template);
	}

	/** Set Cash_And_Cash_Equivalents.
		@param Cash_And_Cash_Equivalents 
		Tiền và các khoản tương đương tiền
	  */
	public void setCash_And_Cash_Equivalents (BigDecimal Cash_And_Cash_Equivalents)
	{
		set_Value (COLUMNNAME_Cash_And_Cash_Equivalents, Cash_And_Cash_Equivalents);
	}

	/** Get Cash_And_Cash_Equivalents.
		@return Tiền và các khoản tương đương tiền
	  */
	public BigDecimal getCash_And_Cash_Equivalents () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cash_And_Cash_Equivalents);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Cash_And_Cash_Equivalents_LY.
		@param Cash_And_Cash_Equivalents_LY Cash_And_Cash_Equivalents_LY	  */
	public void setCash_And_Cash_Equivalents_LY (BigDecimal Cash_And_Cash_Equivalents_LY)
	{
		set_Value (COLUMNNAME_Cash_And_Cash_Equivalents_LY, Cash_And_Cash_Equivalents_LY);
	}

	/** Get Cash_And_Cash_Equivalents_LY.
		@return Cash_And_Cash_Equivalents_LY	  */
	public BigDecimal getCash_And_Cash_Equivalents_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Cash_And_Cash_Equivalents_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current_Liabilities.
		@param Current_Liabilities 
		Nợ ngắn hạn
	  */
	public void setCurrent_Liabilities (BigDecimal Current_Liabilities)
	{
		set_Value (COLUMNNAME_Current_Liabilities, Current_Liabilities);
	}

	/** Get Current_Liabilities.
		@return Nợ ngắn hạn
	  */
	public BigDecimal getCurrent_Liabilities () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Current_Liabilities);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Current_Liabilities_LY.
		@param Current_Liabilities_LY Current_Liabilities_LY	  */
	public void setCurrent_Liabilities_LY (BigDecimal Current_Liabilities_LY)
	{
		set_Value (COLUMNNAME_Current_Liabilities_LY, Current_Liabilities_LY);
	}

	/** Get Current_Liabilities_LY.
		@return Current_Liabilities_LY	  */
	public BigDecimal getCurrent_Liabilities_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Current_Liabilities_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Fixed_Assets.
		@param Fixed_Assets 
		Tài sản cố định
	  */
	public void setFixed_Assets (BigDecimal Fixed_Assets)
	{
		set_Value (COLUMNNAME_Fixed_Assets, Fixed_Assets);
	}

	/** Get Fixed_Assets.
		@return Tài sản cố định
	  */
	public BigDecimal getFixed_Assets () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Fixed_Assets);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Fixed_Assets_LY.
		@param Fixed_Assets_LY Fixed_Assets_LY	  */
	public void setFixed_Assets_LY (BigDecimal Fixed_Assets_LY)
	{
		set_Value (COLUMNNAME_Fixed_Assets_LY, Fixed_Assets_LY);
	}

	/** Get Fixed_Assets_LY.
		@return Fixed_Assets_LY	  */
	public BigDecimal getFixed_Assets_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Fixed_Assets_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Inventories.
		@param Inventories 
		Hàng tồn kho
	  */
	public void setInventories (BigDecimal Inventories)
	{
		set_Value (COLUMNNAME_Inventories, Inventories);
	}

	/** Get Inventories.
		@return Hàng tồn kho
	  */
	public BigDecimal getInventories () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Inventories);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Inventories_LY.
		@param Inventories_LY Inventories_LY	  */
	public void setInventories_LY (BigDecimal Inventories_LY)
	{
		set_Value (COLUMNNAME_Inventories_LY, Inventories_LY);
	}

	/** Get Inventories_LY.
		@return Inventories_LY	  */
	public BigDecimal getInventories_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Inventories_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LONG_TERM_ASSETS.
		@param LONG_TERM_ASSETS LONG_TERM_ASSETS	  */
	public void setLONG_TERM_ASSETS (BigDecimal LONG_TERM_ASSETS)
	{
		set_Value (COLUMNNAME_LONG_TERM_ASSETS, LONG_TERM_ASSETS);
	}

	/** Get LONG_TERM_ASSETS.
		@return LONG_TERM_ASSETS	  */
	public BigDecimal getLONG_TERM_ASSETS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LONG_TERM_ASSETS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LONG_TERM_ASSETS_LY.
		@param LONG_TERM_ASSETS_LY LONG_TERM_ASSETS_LY	  */
	public void setLONG_TERM_ASSETS_LY (BigDecimal LONG_TERM_ASSETS_LY)
	{
		set_Value (COLUMNNAME_LONG_TERM_ASSETS_LY, LONG_TERM_ASSETS_LY);
	}

	/** Get LONG_TERM_ASSETS_LY.
		@return LONG_TERM_ASSETS_LY	  */
	public BigDecimal getLONG_TERM_ASSETS_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LONG_TERM_ASSETS_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Liabilities.
		@param Liabilities Liabilities	  */
	public void setLiabilities (BigDecimal Liabilities)
	{
		set_Value (COLUMNNAME_Liabilities, Liabilities);
	}

	/** Get Liabilities.
		@return Liabilities	  */
	public BigDecimal getLiabilities () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Liabilities);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Liabilities_LY.
		@param Liabilities_LY Liabilities_LY	  */
	public void setLiabilities_LY (BigDecimal Liabilities_LY)
	{
		set_Value (COLUMNNAME_Liabilities_LY, Liabilities_LY);
	}

	/** Get Liabilities_LY.
		@return Liabilities_LY	  */
	public BigDecimal getLiabilities_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Liabilities_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Long_Term_Financial_Invest_LY.
		@param Long_Term_Financial_Invest_LY Long_Term_Financial_Invest_LY	  */
	public void setLong_Term_Financial_Invest_LY (BigDecimal Long_Term_Financial_Invest_LY)
	{
		set_Value (COLUMNNAME_Long_Term_Financial_Invest_LY, Long_Term_Financial_Invest_LY);
	}

	/** Get Long_Term_Financial_Invest_LY.
		@return Long_Term_Financial_Invest_LY	  */
	public BigDecimal getLong_Term_Financial_Invest_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Long_Term_Financial_Invest_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Long_Term_Financial_Investment.
		@param Long_Term_Financial_Investment 
		Đầu tư tài chính dài hạn
	  */
	public void setLong_Term_Financial_Investment (BigDecimal Long_Term_Financial_Investment)
	{
		set_Value (COLUMNNAME_Long_Term_Financial_Investment, Long_Term_Financial_Investment);
	}

	/** Get Long_Term_Financial_Investment.
		@return Đầu tư tài chính dài hạn
	  */
	public BigDecimal getLong_Term_Financial_Investment () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Long_Term_Financial_Investment);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Long_Term_Liabilities.
		@param Long_Term_Liabilities 
		Nợ dài hạn
	  */
	public void setLong_Term_Liabilities (BigDecimal Long_Term_Liabilities)
	{
		set_Value (COLUMNNAME_Long_Term_Liabilities, Long_Term_Liabilities);
	}

	/** Get Long_Term_Liabilities.
		@return Nợ dài hạn
	  */
	public BigDecimal getLong_Term_Liabilities () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Long_Term_Liabilities);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Long_Term_Liabilities_LY.
		@param Long_Term_Liabilities_LY Long_Term_Liabilities_LY	  */
	public void setLong_Term_Liabilities_LY (BigDecimal Long_Term_Liabilities_LY)
	{
		set_Value (COLUMNNAME_Long_Term_Liabilities_LY, Long_Term_Liabilities_LY);
	}

	/** Get Long_Term_Liabilities_LY.
		@return Long_Term_Liabilities_LY	  */
	public BigDecimal getLong_Term_Liabilities_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Long_Term_Liabilities_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Long_Term_Receivables.
		@param Long_Term_Receivables 
		Các khoản phải thu dài hạn
	  */
	public void setLong_Term_Receivables (BigDecimal Long_Term_Receivables)
	{
		set_Value (COLUMNNAME_Long_Term_Receivables, Long_Term_Receivables);
	}

	/** Get Long_Term_Receivables.
		@return Các khoản phải thu dài hạn
	  */
	public BigDecimal getLong_Term_Receivables () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Long_Term_Receivables);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Long_Term_Receivables_LY.
		@param Long_Term_Receivables_LY Long_Term_Receivables_LY	  */
	public void setLong_Term_Receivables_LY (BigDecimal Long_Term_Receivables_LY)
	{
		set_Value (COLUMNNAME_Long_Term_Receivables_LY, Long_Term_Receivables_LY);
	}

	/** Get Long_Term_Receivables_LY.
		@return Long_Term_Receivables_LY	  */
	public BigDecimal getLong_Term_Receivables_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Long_Term_Receivables_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Net_Cash_Flow_Operating_LY.
		@param Net_Cash_Flow_Operating_LY Net_Cash_Flow_Operating_LY	  */
	public void setNet_Cash_Flow_Operating_LY (BigDecimal Net_Cash_Flow_Operating_LY)
	{
		set_Value (COLUMNNAME_Net_Cash_Flow_Operating_LY, Net_Cash_Flow_Operating_LY);
	}

	/** Get Net_Cash_Flow_Operating_LY.
		@return Net_Cash_Flow_Operating_LY	  */
	public BigDecimal getNet_Cash_Flow_Operating_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Net_Cash_Flow_Operating_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Net_Cash_Flow_Operating_activi.
		@param Net_Cash_Flow_Operating_activi 
		Lưu chuyển tiền thuần từ hoạt động kinh doanh
	  */
	public void setNet_Cash_Flow_Operating_activi (BigDecimal Net_Cash_Flow_Operating_activi)
	{
		set_Value (COLUMNNAME_Net_Cash_Flow_Operating_activi, Net_Cash_Flow_Operating_activi);
	}

	/** Get Net_Cash_Flow_Operating_activi.
		@return Lưu chuyển tiền thuần từ hoạt động kinh doanh
	  */
	public BigDecimal getNet_Cash_Flow_Operating_activi () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Net_Cash_Flow_Operating_activi);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Note_Financial.
		@param Note_Financial Note_Financial	  */
	public void setNote_Financial (String Note_Financial)
	{
		set_Value (COLUMNNAME_Note_Financial, Note_Financial);
	}

	/** Get Note_Financial.
		@return Note_Financial	  */
	public String getNote_Financial () 
	{
		return (String)get_Value(COLUMNNAME_Note_Financial);
	}

	/** Set Operating_Profit.
		@param Operating_Profit 
		Lợi nhuận thuần từ hoạt động kinh doanh
	  */
	public void setOperating_Profit (BigDecimal Operating_Profit)
	{
		set_Value (COLUMNNAME_Operating_Profit, Operating_Profit);
	}

	/** Get Operating_Profit.
		@return Lợi nhuận thuần từ hoạt động kinh doanh
	  */
	public BigDecimal getOperating_Profit () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Operating_Profit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Operating_Profit_LY.
		@param Operating_Profit_LY Operating_Profit_LY	  */
	public void setOperating_Profit_LY (BigDecimal Operating_Profit_LY)
	{
		set_Value (COLUMNNAME_Operating_Profit_LY, Operating_Profit_LY);
	}

	/** Get Operating_Profit_LY.
		@return Operating_Profit_LY	  */
	public BigDecimal getOperating_Profit_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Operating_Profit_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Other_Long_Term_Assets.
		@param Other_Long_Term_Assets 
		Tài sản dài hạn khác
	  */
	public void setOther_Long_Term_Assets (BigDecimal Other_Long_Term_Assets)
	{
		set_Value (COLUMNNAME_Other_Long_Term_Assets, Other_Long_Term_Assets);
	}

	/** Get Other_Long_Term_Assets.
		@return Tài sản dài hạn khác
	  */
	public BigDecimal getOther_Long_Term_Assets () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Other_Long_Term_Assets);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Other_Long_Term_Assets_LY.
		@param Other_Long_Term_Assets_LY Other_Long_Term_Assets_LY	  */
	public void setOther_Long_Term_Assets_LY (BigDecimal Other_Long_Term_Assets_LY)
	{
		set_Value (COLUMNNAME_Other_Long_Term_Assets_LY, Other_Long_Term_Assets_LY);
	}

	/** Get Other_Long_Term_Assets_LY.
		@return Other_Long_Term_Assets_LY	  */
	public BigDecimal getOther_Long_Term_Assets_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Other_Long_Term_Assets_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Other_Short_Term_Assets.
		@param Other_Short_Term_Assets 
		Tài sản ngắn hạn khác
	  */
	public void setOther_Short_Term_Assets (BigDecimal Other_Short_Term_Assets)
	{
		set_Value (COLUMNNAME_Other_Short_Term_Assets, Other_Short_Term_Assets);
	}

	/** Get Other_Short_Term_Assets.
		@return Tài sản ngắn hạn khác
	  */
	public BigDecimal getOther_Short_Term_Assets () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Other_Short_Term_Assets);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Other_Short_Term_Assets_LY.
		@param Other_Short_Term_Assets_LY Other_Short_Term_Assets_LY	  */
	public void setOther_Short_Term_Assets_LY (BigDecimal Other_Short_Term_Assets_LY)
	{
		set_Value (COLUMNNAME_Other_Short_Term_Assets_LY, Other_Short_Term_Assets_LY);
	}

	/** Get Other_Short_Term_Assets_LY.
		@return Other_Short_Term_Assets_LY	  */
	public BigDecimal getOther_Short_Term_Assets_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Other_Short_Term_Assets_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Owner_Equity.
		@param Owner_Equity 
		Vốn chủ sở hữu
	  */
	public void setOwner_Equity (BigDecimal Owner_Equity)
	{
		set_Value (COLUMNNAME_Owner_Equity, Owner_Equity);
	}

	/** Get Owner_Equity.
		@return Vốn chủ sở hữu
	  */
	public BigDecimal getOwner_Equity () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Owner_Equity);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Owner_Equity_LY.
		@param Owner_Equity_LY Owner_Equity_LY	  */
	public void setOwner_Equity_LY (BigDecimal Owner_Equity_LY)
	{
		set_Value (COLUMNNAME_Owner_Equity_LY, Owner_Equity_LY);
	}

	/** Get Owner_Equity_LY.
		@return Owner_Equity_LY	  */
	public BigDecimal getOwner_Equity_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Owner_Equity_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_After_Tax.
		@param Profit_After_Tax 
		Lợi nhuận sau thuế thu nhập doanh nghiệp
	  */
	public void setProfit_After_Tax (BigDecimal Profit_After_Tax)
	{
		set_Value (COLUMNNAME_Profit_After_Tax, Profit_After_Tax);
	}

	/** Get Profit_After_Tax.
		@return Lợi nhuận sau thuế thu nhập doanh nghiệp
	  */
	public BigDecimal getProfit_After_Tax () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_After_Tax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_After_Tax_LY.
		@param Profit_After_Tax_LY Profit_After_Tax_LY	  */
	public void setProfit_After_Tax_LY (BigDecimal Profit_After_Tax_LY)
	{
		set_Value (COLUMNNAME_Profit_After_Tax_LY, Profit_After_Tax_LY);
	}

	/** Get Profit_After_Tax_LY.
		@return Profit_After_Tax_LY	  */
	public BigDecimal getProfit_After_Tax_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_After_Tax_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_Before_Tax.
		@param Profit_Before_Tax 
		Tổng lợi nhuận kế toán trước thuế
	  */
	public void setProfit_Before_Tax (BigDecimal Profit_Before_Tax)
	{
		set_Value (COLUMNNAME_Profit_Before_Tax, Profit_Before_Tax);
	}

	/** Get Profit_Before_Tax.
		@return Tổng lợi nhuận kế toán trước thuế
	  */
	public BigDecimal getProfit_Before_Tax () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_Before_Tax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_Before_Tax_LY.
		@param Profit_Before_Tax_LY Profit_Before_Tax_LY	  */
	public void setProfit_Before_Tax_LY (BigDecimal Profit_Before_Tax_LY)
	{
		set_Value (COLUMNNAME_Profit_Before_Tax_LY, Profit_Before_Tax_LY);
	}

	/** Get Profit_Before_Tax_LY.
		@return Profit_Before_Tax_LY	  */
	public BigDecimal getProfit_Before_Tax_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_Before_Tax_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_Goods_Sold_Service .
		@param Profit_Goods_Sold_Service 
		Lợi nhuận gộp về bán hàng và cung cấp dịch vụ
	  */
	public void setProfit_Goods_Sold_Service (BigDecimal Profit_Goods_Sold_Service)
	{
		set_Value (COLUMNNAME_Profit_Goods_Sold_Service, Profit_Goods_Sold_Service);
	}

	/** Get Profit_Goods_Sold_Service .
		@return Lợi nhuận gộp về bán hàng và cung cấp dịch vụ
	  */
	public BigDecimal getProfit_Goods_Sold_Service () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_Goods_Sold_Service);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_Goods_Sold_Service_LY.
		@param Profit_Goods_Sold_Service_LY Profit_Goods_Sold_Service_LY	  */
	public void setProfit_Goods_Sold_Service_LY (BigDecimal Profit_Goods_Sold_Service_LY)
	{
		set_Value (COLUMNNAME_Profit_Goods_Sold_Service_LY, Profit_Goods_Sold_Service_LY);
	}

	/** Get Profit_Goods_Sold_Service_LY.
		@return Profit_Goods_Sold_Service_LY	  */
	public BigDecimal getProfit_Goods_Sold_Service_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_Goods_Sold_Service_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_Other_Activities.
		@param Profit_Other_Activities 
		Lợi nhuận khác
	  */
	public void setProfit_Other_Activities (BigDecimal Profit_Other_Activities)
	{
		set_Value (COLUMNNAME_Profit_Other_Activities, Profit_Other_Activities);
	}

	/** Get Profit_Other_Activities.
		@return Lợi nhuận khác
	  */
	public BigDecimal getProfit_Other_Activities () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_Other_Activities);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Profit_Other_Activities_LY.
		@param Profit_Other_Activities_LY Profit_Other_Activities_LY	  */
	public void setProfit_Other_Activities_LY (BigDecimal Profit_Other_Activities_LY)
	{
		set_Value (COLUMNNAME_Profit_Other_Activities_LY, Profit_Other_Activities_LY);
	}

	/** Get Profit_Other_Activities_LY.
		@return Profit_Other_Activities_LY	  */
	public BigDecimal getProfit_Other_Activities_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Profit_Other_Activities_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Real_Estate_Investment.
		@param Real_Estate_Investment 
		Bất động sản đầu tư
	  */
	public void setReal_Estate_Investment (BigDecimal Real_Estate_Investment)
	{
		set_Value (COLUMNNAME_Real_Estate_Investment, Real_Estate_Investment);
	}

	/** Get Real_Estate_Investment.
		@return Bất động sản đầu tư
	  */
	public BigDecimal getReal_Estate_Investment () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Real_Estate_Investment);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Real_Estate_Investment_LY.
		@param Real_Estate_Investment_LY Real_Estate_Investment_LY	  */
	public void setReal_Estate_Investment_LY (BigDecimal Real_Estate_Investment_LY)
	{
		set_Value (COLUMNNAME_Real_Estate_Investment_LY, Real_Estate_Investment_LY);
	}

	/** Get Real_Estate_Investment_LY.
		@return Real_Estate_Investment_LY	  */
	public BigDecimal getReal_Estate_Investment_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Real_Estate_Investment_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Revenue_Goods_Sold_Service.
		@param Revenue_Goods_Sold_Service 
		Doanh thu thuần về bán hàng và cung cấp dịch vụ
	  */
	public void setRevenue_Goods_Sold_Service (BigDecimal Revenue_Goods_Sold_Service)
	{
		set_Value (COLUMNNAME_Revenue_Goods_Sold_Service, Revenue_Goods_Sold_Service);
	}

	/** Get Revenue_Goods_Sold_Service.
		@return Doanh thu thuần về bán hàng và cung cấp dịch vụ
	  */
	public BigDecimal getRevenue_Goods_Sold_Service () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Revenue_Goods_Sold_Service);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Revenue_Goods_Sold_Service_LY.
		@param Revenue_Goods_Sold_Service_LY Revenue_Goods_Sold_Service_LY	  */
	public void setRevenue_Goods_Sold_Service_LY (BigDecimal Revenue_Goods_Sold_Service_LY)
	{
		set_Value (COLUMNNAME_Revenue_Goods_Sold_Service_LY, Revenue_Goods_Sold_Service_LY);
	}

	/** Get Revenue_Goods_Sold_Service_LY.
		@return Revenue_Goods_Sold_Service_LY	  */
	public BigDecimal getRevenue_Goods_Sold_Service_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Revenue_Goods_Sold_Service_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SHORT_TERM_ASSETS.
		@param SHORT_TERM_ASSETS SHORT_TERM_ASSETS	  */
	public void setSHORT_TERM_ASSETS (BigDecimal SHORT_TERM_ASSETS)
	{
		set_Value (COLUMNNAME_SHORT_TERM_ASSETS, SHORT_TERM_ASSETS);
	}

	/** Get SHORT_TERM_ASSETS.
		@return SHORT_TERM_ASSETS	  */
	public BigDecimal getSHORT_TERM_ASSETS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SHORT_TERM_ASSETS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SHORT_TERM_ASSETS_LY.
		@param SHORT_TERM_ASSETS_LY SHORT_TERM_ASSETS_LY	  */
	public void setSHORT_TERM_ASSETS_LY (BigDecimal SHORT_TERM_ASSETS_LY)
	{
		set_Value (COLUMNNAME_SHORT_TERM_ASSETS_LY, SHORT_TERM_ASSETS_LY);
	}

	/** Get SHORT_TERM_ASSETS_LY.
		@return SHORT_TERM_ASSETS_LY	  */
	public BigDecimal getSHORT_TERM_ASSETS_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SHORT_TERM_ASSETS_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Short_Term_Receivable.
		@param Short_Term_Receivable 
		Các khoản phải thu ngắn hạn
	  */
	public void setShort_Term_Receivable (BigDecimal Short_Term_Receivable)
	{
		set_Value (COLUMNNAME_Short_Term_Receivable, Short_Term_Receivable);
	}

	/** Get Short_Term_Receivable.
		@return Các khoản phải thu ngắn hạn
	  */
	public BigDecimal getShort_Term_Receivable () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Short_Term_Receivable);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Short_Term_Receivable_LY.
		@param Short_Term_Receivable_LY Short_Term_Receivable_LY	  */
	public void setShort_Term_Receivable_LY (BigDecimal Short_Term_Receivable_LY)
	{
		set_Value (COLUMNNAME_Short_Term_Receivable_LY, Short_Term_Receivable_LY);
	}

	/** Get Short_Term_Receivable_LY.
		@return Short_Term_Receivable_LY	  */
	public BigDecimal getShort_Term_Receivable_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Short_Term_Receivable_LY);
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

	public I_TDAB_Customer_Score getTDAB_Customer_Score() throws RuntimeException
    {
		return (I_TDAB_Customer_Score)MTable.get(getCtx(), I_TDAB_Customer_Score.Table_Name)
			.getPO(getTDAB_Customer_Score_ID(), get_TrxName());	}

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

	/** Set TDAB_Financial.
		@param TDAB_Financial_ID TDAB_Financial	  */
	public void setTDAB_Financial_ID (int TDAB_Financial_ID)
	{
		if (TDAB_Financial_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_ID, Integer.valueOf(TDAB_Financial_ID));
	}

	/** Get TDAB_Financial.
		@return TDAB_Financial	  */
	public int getTDAB_Financial_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Financial_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Financial_UU.
		@param TDAB_Financial_UU TDAB_Financial_UU	  */
	public void setTDAB_Financial_UU (String TDAB_Financial_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Financial_UU, TDAB_Financial_UU);
	}

	/** Get TDAB_Financial_UU.
		@return TDAB_Financial_UU	  */
	public String getTDAB_Financial_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Financial_UU);
	}

	/** Set Total_Assets.
		@param Total_Assets 
		Tổng tài sản
	  */
	public void setTotal_Assets (BigDecimal Total_Assets)
	{
		set_Value (COLUMNNAME_Total_Assets, Total_Assets);
	}

	/** Get Total_Assets.
		@return Tổng tài sản
	  */
	public BigDecimal getTotal_Assets () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Assets);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total_Assets_LY.
		@param Total_Assets_LY Total_Assets_LY	  */
	public void setTotal_Assets_LY (BigDecimal Total_Assets_LY)
	{
		set_Value (COLUMNNAME_Total_Assets_LY, Total_Assets_LY);
	}

	/** Get Total_Assets_LY.
		@return Total_Assets_LY	  */
	public BigDecimal getTotal_Assets_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Assets_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total_Resources.
		@param Total_Resources 
		Tổng nguồn vốn
	  */
	public void setTotal_Resources (BigDecimal Total_Resources)
	{
		set_Value (COLUMNNAME_Total_Resources, Total_Resources);
	}

	/** Get Total_Resources.
		@return Tổng nguồn vốn
	  */
	public BigDecimal getTotal_Resources () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Resources);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total_Resources_LY.
		@param Total_Resources_LY Total_Resources_LY	  */
	public void setTotal_Resources_LY (BigDecimal Total_Resources_LY)
	{
		set_Value (COLUMNNAME_Total_Resources_LY, Total_Resources_LY);
	}

	/** Get Total_Resources_LY.
		@return Total_Resources_LY	  */
	public BigDecimal getTotal_Resources_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Total_Resources_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set short_Term_Investment.
		@param short_Term_Investment 
		Đầu tư ngắn hạn
	  */
	public void setshort_Term_Investment (BigDecimal short_Term_Investment)
	{
		set_Value (COLUMNNAME_short_Term_Investment, short_Term_Investment);
	}

	/** Get short_Term_Investment.
		@return Đầu tư ngắn hạn
	  */
	public BigDecimal getshort_Term_Investment () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_short_Term_Investment);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set short_Term_Investment_LY.
		@param short_Term_Investment_LY short_Term_Investment_LY	  */
	public void setshort_Term_Investment_LY (BigDecimal short_Term_Investment_LY)
	{
		set_Value (COLUMNNAME_short_Term_Investment_LY, short_Term_Investment_LY);
	}

	/** Get short_Term_Investment_LY.
		@return short_Term_Investment_LY	  */
	public BigDecimal getshort_Term_Investment_LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_short_Term_Investment_LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}