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

/** Generated Model for TDAB_Financial_History
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Financial_History extends PO implements I_TDAB_Financial_History, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210303L;

    /** Standard Constructor */
    public X_TDAB_Financial_History (Properties ctx, int TDAB_Financial_History_ID, String trxName)
    {
      super (ctx, TDAB_Financial_History_ID, trxName);
      /** if (TDAB_Financial_History_ID == 0)
        {
			setRoleCreated (null);
			setTDAB_Financial_History_ID (0);
			setTDAB_Financial_History_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Financial_History (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Financial_History[")
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

	/** Set Btn_Download_BCTC.
		@param Btn_Download_BCTC Btn_Download_BCTC	  */
	public void setBtn_Download_BCTC (String Btn_Download_BCTC)
	{
		set_Value (COLUMNNAME_Btn_Download_BCTC, Btn_Download_BCTC);
	}

	/** Get Btn_Download_BCTC.
		@return Btn_Download_BCTC	  */
	public String getBtn_Download_BCTC () 
	{
		return (String)get_Value(COLUMNNAME_Btn_Download_BCTC);
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

	/** Set History_Change.
		@param History_Change History_Change	  */
	public void setHistory_Change (String History_Change)
	{
		set_Value (COLUMNNAME_History_Change, History_Change);
	}

	/** Get History_Change.
		@return History_Change	  */
	public String getHistory_Change () 
	{
		return (String)get_Value(COLUMNNAME_History_Change);
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

	/** CVQHKH = CVQHKH */
	public static final String ROLECREATED_CVQHKH = "CVQHKH";
	/** KSV = KSV */
	public static final String ROLECREATED_KSV = "KSV";
	/** TDTD = TDTD */
	public static final String ROLECREATED_TDTD = "TDTD";
	/** Set RoleCreated.
		@param RoleCreated RoleCreated	  */
	public void setRoleCreated (String RoleCreated)
	{

		set_Value (COLUMNNAME_RoleCreated, RoleCreated);
	}

	/** Get RoleCreated.
		@return RoleCreated	  */
	public String getRoleCreated () 
	{
		return (String)get_Value(COLUMNNAME_RoleCreated);
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

	/** Set TDAB_Financial_History.
		@param TDAB_Financial_History_ID TDAB_Financial_History	  */
	public void setTDAB_Financial_History_ID (int TDAB_Financial_History_ID)
	{
		if (TDAB_Financial_History_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_History_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_History_ID, Integer.valueOf(TDAB_Financial_History_ID));
	}

	/** Get TDAB_Financial_History.
		@return TDAB_Financial_History	  */
	public int getTDAB_Financial_History_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Financial_History_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Financial_History_UU.
		@param TDAB_Financial_History_UU TDAB_Financial_History_UU	  */
	public void setTDAB_Financial_History_UU (String TDAB_Financial_History_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Financial_History_UU, TDAB_Financial_History_UU);
	}

	/** Get TDAB_Financial_History_UU.
		@return TDAB_Financial_History_UU	  */
	public String getTDAB_Financial_History_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Financial_History_UU);
	}

	public I_TDAB_Financial getTDAB_Financial() throws RuntimeException
    {
		return (I_TDAB_Financial)MTable.get(getCtx(), I_TDAB_Financial.Table_Name)
			.getPO(getTDAB_Financial_ID(), get_TrxName());	}

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
}