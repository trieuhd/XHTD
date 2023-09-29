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
package org.idempiere.xhtd_ab.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for TDAB_Financial
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Financial 
{

    /** TableName=TDAB_Financial */
    public static final String Table_Name = "TDAB_Financial";

    /** AD_Table_ID=1000161 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name BCTC_B1_File */
    public static final String COLUMNNAME_BCTC_B1_File = "BCTC_B1_File";

	/** Set BCTC_B1_File	  */
	public void setBCTC_B1_File (String BCTC_B1_File);

	/** Get BCTC_B1_File	  */
	public String getBCTC_B1_File();

    /** Column name Bonus_And_Welfare_Fund */
    public static final String COLUMNNAME_Bonus_And_Welfare_Fund = "Bonus_And_Welfare_Fund";

	/** Set Bonus_And_Welfare_Fund.
	  * Nguồn kinh phí và quỹ khác
	  */
	public void setBonus_And_Welfare_Fund (BigDecimal Bonus_And_Welfare_Fund);

	/** Get Bonus_And_Welfare_Fund.
	  * Nguồn kinh phí và quỹ khác
	  */
	public BigDecimal getBonus_And_Welfare_Fund();

    /** Column name Bonus_And_Welfare_Fund_LY */
    public static final String COLUMNNAME_Bonus_And_Welfare_Fund_LY = "Bonus_And_Welfare_Fund_LY";

	/** Set Bonus_And_Welfare_Fund_LY	  */
	public void setBonus_And_Welfare_Fund_LY (BigDecimal Bonus_And_Welfare_Fund_LY);

	/** Get Bonus_And_Welfare_Fund_LY	  */
	public BigDecimal getBonus_And_Welfare_Fund_LY();

    /** Column name Btn_Download_BCTC_KSV */
    public static final String COLUMNNAME_Btn_Download_BCTC_KSV = "Btn_Download_BCTC_KSV";

	/** Set Btn_Download_BCTC_KSV	  */
	public void setBtn_Download_BCTC_KSV (String Btn_Download_BCTC_KSV);

	/** Get Btn_Download_BCTC_KSV	  */
	public String getBtn_Download_BCTC_KSV();

    /** Column name Btn_Download_BCTC_QHKH */
    public static final String COLUMNNAME_Btn_Download_BCTC_QHKH = "Btn_Download_BCTC_QHKH";

	/** Set Btn_Download_BCTC_QHKH.
	  * Btn_Download_BCTC_QHKH
	  */
	public void setBtn_Download_BCTC_QHKH (String Btn_Download_BCTC_QHKH);

	/** Get Btn_Download_BCTC_QHKH.
	  * Btn_Download_BCTC_QHKH
	  */
	public String getBtn_Download_BCTC_QHKH();

    /** Column name Btn_Download_BCTC_TDTD */
    public static final String COLUMNNAME_Btn_Download_BCTC_TDTD = "Btn_Download_BCTC_TDTD";

	/** Set Btn_Download_BCTC_TDTD	  */
	public void setBtn_Download_BCTC_TDTD (String Btn_Download_BCTC_TDTD);

	/** Get Btn_Download_BCTC_TDTD	  */
	public String getBtn_Download_BCTC_TDTD();

    /** Column name Btn_Download_Template */
    public static final String COLUMNNAME_Btn_Download_Template = "Btn_Download_Template";

	/** Set Btn_Download_Template	  */
	public void setBtn_Download_Template (String Btn_Download_Template);

	/** Get Btn_Download_Template	  */
	public String getBtn_Download_Template();

    /** Column name Cash_And_Cash_Equivalents */
    public static final String COLUMNNAME_Cash_And_Cash_Equivalents = "Cash_And_Cash_Equivalents";

	/** Set Cash_And_Cash_Equivalents.
	  * Tiền và các khoản tương đương tiền
	  */
	public void setCash_And_Cash_Equivalents (BigDecimal Cash_And_Cash_Equivalents);

	/** Get Cash_And_Cash_Equivalents.
	  * Tiền và các khoản tương đương tiền
	  */
	public BigDecimal getCash_And_Cash_Equivalents();

    /** Column name Cash_And_Cash_Equivalents_LY */
    public static final String COLUMNNAME_Cash_And_Cash_Equivalents_LY = "Cash_And_Cash_Equivalents_LY";

	/** Set Cash_And_Cash_Equivalents_LY	  */
	public void setCash_And_Cash_Equivalents_LY (BigDecimal Cash_And_Cash_Equivalents_LY);

	/** Get Cash_And_Cash_Equivalents_LY	  */
	public BigDecimal getCash_And_Cash_Equivalents_LY();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Current_Liabilities */
    public static final String COLUMNNAME_Current_Liabilities = "Current_Liabilities";

	/** Set Current_Liabilities.
	  * Nợ ngắn hạn
	  */
	public void setCurrent_Liabilities (BigDecimal Current_Liabilities);

	/** Get Current_Liabilities.
	  * Nợ ngắn hạn
	  */
	public BigDecimal getCurrent_Liabilities();

    /** Column name Current_Liabilities_LY */
    public static final String COLUMNNAME_Current_Liabilities_LY = "Current_Liabilities_LY";

	/** Set Current_Liabilities_LY	  */
	public void setCurrent_Liabilities_LY (BigDecimal Current_Liabilities_LY);

	/** Get Current_Liabilities_LY	  */
	public BigDecimal getCurrent_Liabilities_LY();

    /** Column name Fixed_Assets */
    public static final String COLUMNNAME_Fixed_Assets = "Fixed_Assets";

	/** Set Fixed_Assets.
	  * Tài sản cố định
	  */
	public void setFixed_Assets (BigDecimal Fixed_Assets);

	/** Get Fixed_Assets.
	  * Tài sản cố định
	  */
	public BigDecimal getFixed_Assets();

    /** Column name Fixed_Assets_LY */
    public static final String COLUMNNAME_Fixed_Assets_LY = "Fixed_Assets_LY";

	/** Set Fixed_Assets_LY	  */
	public void setFixed_Assets_LY (BigDecimal Fixed_Assets_LY);

	/** Get Fixed_Assets_LY	  */
	public BigDecimal getFixed_Assets_LY();

    /** Column name Inventories */
    public static final String COLUMNNAME_Inventories = "Inventories";

	/** Set Inventories.
	  * Hàng tồn kho
	  */
	public void setInventories (BigDecimal Inventories);

	/** Get Inventories.
	  * Hàng tồn kho
	  */
	public BigDecimal getInventories();

    /** Column name Inventories_LY */
    public static final String COLUMNNAME_Inventories_LY = "Inventories_LY";

	/** Set Inventories_LY	  */
	public void setInventories_LY (BigDecimal Inventories_LY);

	/** Get Inventories_LY	  */
	public BigDecimal getInventories_LY();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set IsActive.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get IsActive.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LONG_TERM_ASSETS */
    public static final String COLUMNNAME_LONG_TERM_ASSETS = "LONG_TERM_ASSETS";

	/** Set LONG_TERM_ASSETS	  */
	public void setLONG_TERM_ASSETS (BigDecimal LONG_TERM_ASSETS);

	/** Get LONG_TERM_ASSETS	  */
	public BigDecimal getLONG_TERM_ASSETS();

    /** Column name LONG_TERM_ASSETS_LY */
    public static final String COLUMNNAME_LONG_TERM_ASSETS_LY = "LONG_TERM_ASSETS_LY";

	/** Set LONG_TERM_ASSETS_LY	  */
	public void setLONG_TERM_ASSETS_LY (BigDecimal LONG_TERM_ASSETS_LY);

	/** Get LONG_TERM_ASSETS_LY	  */
	public BigDecimal getLONG_TERM_ASSETS_LY();

    /** Column name Liabilities */
    public static final String COLUMNNAME_Liabilities = "Liabilities";

	/** Set Liabilities	  */
	public void setLiabilities (BigDecimal Liabilities);

	/** Get Liabilities	  */
	public BigDecimal getLiabilities();

    /** Column name Liabilities_LY */
    public static final String COLUMNNAME_Liabilities_LY = "Liabilities_LY";

	/** Set Liabilities_LY	  */
	public void setLiabilities_LY (BigDecimal Liabilities_LY);

	/** Get Liabilities_LY	  */
	public BigDecimal getLiabilities_LY();

    /** Column name Long_Term_Financial_Invest_LY */
    public static final String COLUMNNAME_Long_Term_Financial_Invest_LY = "Long_Term_Financial_Invest_LY";

	/** Set Long_Term_Financial_Invest_LY	  */
	public void setLong_Term_Financial_Invest_LY (BigDecimal Long_Term_Financial_Invest_LY);

	/** Get Long_Term_Financial_Invest_LY	  */
	public BigDecimal getLong_Term_Financial_Invest_LY();

    /** Column name Long_Term_Financial_Investment */
    public static final String COLUMNNAME_Long_Term_Financial_Investment = "Long_Term_Financial_Investment";

	/** Set Long_Term_Financial_Investment.
	  * Đầu tư tài chính dài hạn
	  */
	public void setLong_Term_Financial_Investment (BigDecimal Long_Term_Financial_Investment);

	/** Get Long_Term_Financial_Investment.
	  * Đầu tư tài chính dài hạn
	  */
	public BigDecimal getLong_Term_Financial_Investment();

    /** Column name Long_Term_Liabilities */
    public static final String COLUMNNAME_Long_Term_Liabilities = "Long_Term_Liabilities";

	/** Set Long_Term_Liabilities.
	  * Nợ dài hạn
	  */
	public void setLong_Term_Liabilities (BigDecimal Long_Term_Liabilities);

	/** Get Long_Term_Liabilities.
	  * Nợ dài hạn
	  */
	public BigDecimal getLong_Term_Liabilities();

    /** Column name Long_Term_Liabilities_LY */
    public static final String COLUMNNAME_Long_Term_Liabilities_LY = "Long_Term_Liabilities_LY";

	/** Set Long_Term_Liabilities_LY	  */
	public void setLong_Term_Liabilities_LY (BigDecimal Long_Term_Liabilities_LY);

	/** Get Long_Term_Liabilities_LY	  */
	public BigDecimal getLong_Term_Liabilities_LY();

    /** Column name Long_Term_Receivables */
    public static final String COLUMNNAME_Long_Term_Receivables = "Long_Term_Receivables";

	/** Set Long_Term_Receivables.
	  * Các khoản phải thu dài hạn
	  */
	public void setLong_Term_Receivables (BigDecimal Long_Term_Receivables);

	/** Get Long_Term_Receivables.
	  * Các khoản phải thu dài hạn
	  */
	public BigDecimal getLong_Term_Receivables();

    /** Column name Long_Term_Receivables_LY */
    public static final String COLUMNNAME_Long_Term_Receivables_LY = "Long_Term_Receivables_LY";

	/** Set Long_Term_Receivables_LY	  */
	public void setLong_Term_Receivables_LY (BigDecimal Long_Term_Receivables_LY);

	/** Get Long_Term_Receivables_LY	  */
	public BigDecimal getLong_Term_Receivables_LY();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Net_Cash_Flow_Operating_LY */
    public static final String COLUMNNAME_Net_Cash_Flow_Operating_LY = "Net_Cash_Flow_Operating_LY";

	/** Set Net_Cash_Flow_Operating_LY	  */
	public void setNet_Cash_Flow_Operating_LY (BigDecimal Net_Cash_Flow_Operating_LY);

	/** Get Net_Cash_Flow_Operating_LY	  */
	public BigDecimal getNet_Cash_Flow_Operating_LY();

    /** Column name Net_Cash_Flow_Operating_activi */
    public static final String COLUMNNAME_Net_Cash_Flow_Operating_activi = "Net_Cash_Flow_Operating_activi";

	/** Set Net_Cash_Flow_Operating_activi.
	  * Lưu chuyển tiền thuần từ hoạt động kinh doanh
	  */
	public void setNet_Cash_Flow_Operating_activi (BigDecimal Net_Cash_Flow_Operating_activi);

	/** Get Net_Cash_Flow_Operating_activi.
	  * Lưu chuyển tiền thuần từ hoạt động kinh doanh
	  */
	public BigDecimal getNet_Cash_Flow_Operating_activi();

    /** Column name Note_Financial */
    public static final String COLUMNNAME_Note_Financial = "Note_Financial";

	/** Set Note_Financial	  */
	public void setNote_Financial (String Note_Financial);

	/** Get Note_Financial	  */
	public String getNote_Financial();

    /** Column name Operating_Profit */
    public static final String COLUMNNAME_Operating_Profit = "Operating_Profit";

	/** Set Operating_Profit.
	  * Lợi nhuận thuần từ hoạt động kinh doanh
	  */
	public void setOperating_Profit (BigDecimal Operating_Profit);

	/** Get Operating_Profit.
	  * Lợi nhuận thuần từ hoạt động kinh doanh
	  */
	public BigDecimal getOperating_Profit();

    /** Column name Operating_Profit_LY */
    public static final String COLUMNNAME_Operating_Profit_LY = "Operating_Profit_LY";

	/** Set Operating_Profit_LY	  */
	public void setOperating_Profit_LY (BigDecimal Operating_Profit_LY);

	/** Get Operating_Profit_LY	  */
	public BigDecimal getOperating_Profit_LY();

    /** Column name Other_Long_Term_Assets */
    public static final String COLUMNNAME_Other_Long_Term_Assets = "Other_Long_Term_Assets";

	/** Set Other_Long_Term_Assets.
	  * Tài sản dài hạn khác
	  */
	public void setOther_Long_Term_Assets (BigDecimal Other_Long_Term_Assets);

	/** Get Other_Long_Term_Assets.
	  * Tài sản dài hạn khác
	  */
	public BigDecimal getOther_Long_Term_Assets();

    /** Column name Other_Long_Term_Assets_LY */
    public static final String COLUMNNAME_Other_Long_Term_Assets_LY = "Other_Long_Term_Assets_LY";

	/** Set Other_Long_Term_Assets_LY	  */
	public void setOther_Long_Term_Assets_LY (BigDecimal Other_Long_Term_Assets_LY);

	/** Get Other_Long_Term_Assets_LY	  */
	public BigDecimal getOther_Long_Term_Assets_LY();

    /** Column name Other_Short_Term_Assets */
    public static final String COLUMNNAME_Other_Short_Term_Assets = "Other_Short_Term_Assets";

	/** Set Other_Short_Term_Assets.
	  * Tài sản ngắn hạn khác
	  */
	public void setOther_Short_Term_Assets (BigDecimal Other_Short_Term_Assets);

	/** Get Other_Short_Term_Assets.
	  * Tài sản ngắn hạn khác
	  */
	public BigDecimal getOther_Short_Term_Assets();

    /** Column name Other_Short_Term_Assets_LY */
    public static final String COLUMNNAME_Other_Short_Term_Assets_LY = "Other_Short_Term_Assets_LY";

	/** Set Other_Short_Term_Assets_LY	  */
	public void setOther_Short_Term_Assets_LY (BigDecimal Other_Short_Term_Assets_LY);

	/** Get Other_Short_Term_Assets_LY	  */
	public BigDecimal getOther_Short_Term_Assets_LY();

    /** Column name Owner_Equity */
    public static final String COLUMNNAME_Owner_Equity = "Owner_Equity";

	/** Set Owner_Equity.
	  * Vốn chủ sở hữu
	  */
	public void setOwner_Equity (BigDecimal Owner_Equity);

	/** Get Owner_Equity.
	  * Vốn chủ sở hữu
	  */
	public BigDecimal getOwner_Equity();

    /** Column name Owner_Equity_LY */
    public static final String COLUMNNAME_Owner_Equity_LY = "Owner_Equity_LY";

	/** Set Owner_Equity_LY	  */
	public void setOwner_Equity_LY (BigDecimal Owner_Equity_LY);

	/** Get Owner_Equity_LY	  */
	public BigDecimal getOwner_Equity_LY();

    /** Column name Profit_After_Tax */
    public static final String COLUMNNAME_Profit_After_Tax = "Profit_After_Tax";

	/** Set Profit_After_Tax.
	  * Lợi nhuận sau thuế thu nhập doanh nghiệp
	  */
	public void setProfit_After_Tax (BigDecimal Profit_After_Tax);

	/** Get Profit_After_Tax.
	  * Lợi nhuận sau thuế thu nhập doanh nghiệp
	  */
	public BigDecimal getProfit_After_Tax();

    /** Column name Profit_After_Tax_LY */
    public static final String COLUMNNAME_Profit_After_Tax_LY = "Profit_After_Tax_LY";

	/** Set Profit_After_Tax_LY	  */
	public void setProfit_After_Tax_LY (BigDecimal Profit_After_Tax_LY);

	/** Get Profit_After_Tax_LY	  */
	public BigDecimal getProfit_After_Tax_LY();

    /** Column name Profit_Before_Tax */
    public static final String COLUMNNAME_Profit_Before_Tax = "Profit_Before_Tax";

	/** Set Profit_Before_Tax.
	  * Tổng lợi nhuận kế toán trước thuế
	  */
	public void setProfit_Before_Tax (BigDecimal Profit_Before_Tax);

	/** Get Profit_Before_Tax.
	  * Tổng lợi nhuận kế toán trước thuế
	  */
	public BigDecimal getProfit_Before_Tax();

    /** Column name Profit_Before_Tax_LY */
    public static final String COLUMNNAME_Profit_Before_Tax_LY = "Profit_Before_Tax_LY";

	/** Set Profit_Before_Tax_LY	  */
	public void setProfit_Before_Tax_LY (BigDecimal Profit_Before_Tax_LY);

	/** Get Profit_Before_Tax_LY	  */
	public BigDecimal getProfit_Before_Tax_LY();

    /** Column name Profit_Goods_Sold_Service */
    public static final String COLUMNNAME_Profit_Goods_Sold_Service = "Profit_Goods_Sold_Service";

	/** Set Profit_Goods_Sold_Service .
	  * Lợi nhuận gộp về bán hàng và cung cấp dịch vụ
	  */
	public void setProfit_Goods_Sold_Service (BigDecimal Profit_Goods_Sold_Service);

	/** Get Profit_Goods_Sold_Service .
	  * Lợi nhuận gộp về bán hàng và cung cấp dịch vụ
	  */
	public BigDecimal getProfit_Goods_Sold_Service();

    /** Column name Profit_Goods_Sold_Service_LY */
    public static final String COLUMNNAME_Profit_Goods_Sold_Service_LY = "Profit_Goods_Sold_Service_LY";

	/** Set Profit_Goods_Sold_Service_LY	  */
	public void setProfit_Goods_Sold_Service_LY (BigDecimal Profit_Goods_Sold_Service_LY);

	/** Get Profit_Goods_Sold_Service_LY	  */
	public BigDecimal getProfit_Goods_Sold_Service_LY();

    /** Column name Profit_Other_Activities */
    public static final String COLUMNNAME_Profit_Other_Activities = "Profit_Other_Activities";

	/** Set Profit_Other_Activities.
	  * Lợi nhuận khác
	  */
	public void setProfit_Other_Activities (BigDecimal Profit_Other_Activities);

	/** Get Profit_Other_Activities.
	  * Lợi nhuận khác
	  */
	public BigDecimal getProfit_Other_Activities();

    /** Column name Profit_Other_Activities_LY */
    public static final String COLUMNNAME_Profit_Other_Activities_LY = "Profit_Other_Activities_LY";

	/** Set Profit_Other_Activities_LY	  */
	public void setProfit_Other_Activities_LY (BigDecimal Profit_Other_Activities_LY);

	/** Get Profit_Other_Activities_LY	  */
	public BigDecimal getProfit_Other_Activities_LY();

    /** Column name Real_Estate_Investment */
    public static final String COLUMNNAME_Real_Estate_Investment = "Real_Estate_Investment";

	/** Set Real_Estate_Investment.
	  * Bất động sản đầu tư
	  */
	public void setReal_Estate_Investment (BigDecimal Real_Estate_Investment);

	/** Get Real_Estate_Investment.
	  * Bất động sản đầu tư
	  */
	public BigDecimal getReal_Estate_Investment();

    /** Column name Real_Estate_Investment_LY */
    public static final String COLUMNNAME_Real_Estate_Investment_LY = "Real_Estate_Investment_LY";

	/** Set Real_Estate_Investment_LY	  */
	public void setReal_Estate_Investment_LY (BigDecimal Real_Estate_Investment_LY);

	/** Get Real_Estate_Investment_LY	  */
	public BigDecimal getReal_Estate_Investment_LY();

    /** Column name Revenue_Goods_Sold_Service */
    public static final String COLUMNNAME_Revenue_Goods_Sold_Service = "Revenue_Goods_Sold_Service";

	/** Set Revenue_Goods_Sold_Service.
	  * Doanh thu thuần về bán hàng và cung cấp dịch vụ
	  */
	public void setRevenue_Goods_Sold_Service (BigDecimal Revenue_Goods_Sold_Service);

	/** Get Revenue_Goods_Sold_Service.
	  * Doanh thu thuần về bán hàng và cung cấp dịch vụ
	  */
	public BigDecimal getRevenue_Goods_Sold_Service();

    /** Column name Revenue_Goods_Sold_Service_LY */
    public static final String COLUMNNAME_Revenue_Goods_Sold_Service_LY = "Revenue_Goods_Sold_Service_LY";

	/** Set Revenue_Goods_Sold_Service_LY	  */
	public void setRevenue_Goods_Sold_Service_LY (BigDecimal Revenue_Goods_Sold_Service_LY);

	/** Get Revenue_Goods_Sold_Service_LY	  */
	public BigDecimal getRevenue_Goods_Sold_Service_LY();

    /** Column name SHORT_TERM_ASSETS */
    public static final String COLUMNNAME_SHORT_TERM_ASSETS = "SHORT_TERM_ASSETS";

	/** Set SHORT_TERM_ASSETS	  */
	public void setSHORT_TERM_ASSETS (BigDecimal SHORT_TERM_ASSETS);

	/** Get SHORT_TERM_ASSETS	  */
	public BigDecimal getSHORT_TERM_ASSETS();

    /** Column name SHORT_TERM_ASSETS_LY */
    public static final String COLUMNNAME_SHORT_TERM_ASSETS_LY = "SHORT_TERM_ASSETS_LY";

	/** Set SHORT_TERM_ASSETS_LY	  */
	public void setSHORT_TERM_ASSETS_LY (BigDecimal SHORT_TERM_ASSETS_LY);

	/** Get SHORT_TERM_ASSETS_LY	  */
	public BigDecimal getSHORT_TERM_ASSETS_LY();

    /** Column name Short_Term_Receivable */
    public static final String COLUMNNAME_Short_Term_Receivable = "Short_Term_Receivable";

	/** Set Short_Term_Receivable.
	  * Các khoản phải thu ngắn hạn
	  */
	public void setShort_Term_Receivable (BigDecimal Short_Term_Receivable);

	/** Get Short_Term_Receivable.
	  * Các khoản phải thu ngắn hạn
	  */
	public BigDecimal getShort_Term_Receivable();

    /** Column name Short_Term_Receivable_LY */
    public static final String COLUMNNAME_Short_Term_Receivable_LY = "Short_Term_Receivable_LY";

	/** Set Short_Term_Receivable_LY	  */
	public void setShort_Term_Receivable_LY (BigDecimal Short_Term_Receivable_LY);

	/** Get Short_Term_Receivable_LY	  */
	public BigDecimal getShort_Term_Receivable_LY();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Customer_Score_ID */
    public static final String COLUMNNAME_TDAB_Customer_Score_ID = "TDAB_Customer_Score_ID";

	/** Set TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID);

	/** Get TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID();

	public I_TDAB_Customer_Score getTDAB_Customer_Score() throws RuntimeException;

    /** Column name TDAB_Financial_ID */
    public static final String COLUMNNAME_TDAB_Financial_ID = "TDAB_Financial_ID";

	/** Set TDAB_Financial	  */
	public void setTDAB_Financial_ID (int TDAB_Financial_ID);

	/** Get TDAB_Financial	  */
	public int getTDAB_Financial_ID();

    /** Column name TDAB_Financial_UU */
    public static final String COLUMNNAME_TDAB_Financial_UU = "TDAB_Financial_UU";

	/** Set TDAB_Financial_UU	  */
	public void setTDAB_Financial_UU (String TDAB_Financial_UU);

	/** Get TDAB_Financial_UU	  */
	public String getTDAB_Financial_UU();

    /** Column name Total_Assets */
    public static final String COLUMNNAME_Total_Assets = "Total_Assets";

	/** Set Total_Assets.
	  * Tổng tài sản
	  */
	public void setTotal_Assets (BigDecimal Total_Assets);

	/** Get Total_Assets.
	  * Tổng tài sản
	  */
	public BigDecimal getTotal_Assets();

    /** Column name Total_Assets_LY */
    public static final String COLUMNNAME_Total_Assets_LY = "Total_Assets_LY";

	/** Set Total_Assets_LY	  */
	public void setTotal_Assets_LY (BigDecimal Total_Assets_LY);

	/** Get Total_Assets_LY	  */
	public BigDecimal getTotal_Assets_LY();

    /** Column name Total_Resources */
    public static final String COLUMNNAME_Total_Resources = "Total_Resources";

	/** Set Total_Resources.
	  * Tổng nguồn vốn
	  */
	public void setTotal_Resources (BigDecimal Total_Resources);

	/** Get Total_Resources.
	  * Tổng nguồn vốn
	  */
	public BigDecimal getTotal_Resources();

    /** Column name Total_Resources_LY */
    public static final String COLUMNNAME_Total_Resources_LY = "Total_Resources_LY";

	/** Set Total_Resources_LY	  */
	public void setTotal_Resources_LY (BigDecimal Total_Resources_LY);

	/** Get Total_Resources_LY	  */
	public BigDecimal getTotal_Resources_LY();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name short_Term_Investment */
    public static final String COLUMNNAME_short_Term_Investment = "short_Term_Investment";

	/** Set short_Term_Investment.
	  * Đầu tư ngắn hạn
	  */
	public void setshort_Term_Investment (BigDecimal short_Term_Investment);

	/** Get short_Term_Investment.
	  * Đầu tư ngắn hạn
	  */
	public BigDecimal getshort_Term_Investment();

    /** Column name short_Term_Investment_LY */
    public static final String COLUMNNAME_short_Term_Investment_LY = "short_Term_Investment_LY";

	/** Set short_Term_Investment_LY	  */
	public void setshort_Term_Investment_LY (BigDecimal short_Term_Investment_LY);

	/** Get short_Term_Investment_LY	  */
	public BigDecimal getshort_Term_Investment_LY();
}
