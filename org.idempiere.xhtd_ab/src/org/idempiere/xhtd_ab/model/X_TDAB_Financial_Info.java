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

/** Generated Model for TDAB_Financial_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Financial_Info extends PO implements I_TDAB_Financial_Info, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230216L;

    /** Standard Constructor */
    public X_TDAB_Financial_Info (Properties ctx, int TDAB_Financial_Info_ID, String trxName)
    {
      super (ctx, TDAB_Financial_Info_ID, trxName);
      /** if (TDAB_Financial_Info_ID == 0)
        {
			setTDAB_Financial_Info_ID (0);
			setTDAB_Financial_Info_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Financial_Info (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Financial_Info[")
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

	/** Set CD100.
		@param CD100 CD100	  */
	public void setCD100 (BigDecimal CD100)
	{
		set_Value (COLUMNNAME_CD100, CD100);
	}

	/** Get CD100.
		@return CD100	  */
	public BigDecimal getCD100 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD100);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD100LY.
		@param CD100LY CD100LY	  */
	public void setCD100LY (BigDecimal CD100LY)
	{
		set_Value (COLUMNNAME_CD100LY, CD100LY);
	}

	/** Get CD100LY.
		@return CD100LY	  */
	public BigDecimal getCD100LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD100LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD110.
		@param CD110 CD110	  */
	public void setCD110 (BigDecimal CD110)
	{
		set_Value (COLUMNNAME_CD110, CD110);
	}

	/** Get CD110.
		@return CD110	  */
	public BigDecimal getCD110 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD110);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD110LY.
		@param CD110LY CD110LY	  */
	public void setCD110LY (BigDecimal CD110LY)
	{
		set_Value (COLUMNNAME_CD110LY, CD110LY);
	}

	/** Get CD110LY.
		@return CD110LY	  */
	public BigDecimal getCD110LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD110LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD111.
		@param CD111 CD111	  */
	public void setCD111 (BigDecimal CD111)
	{
		set_Value (COLUMNNAME_CD111, CD111);
	}

	/** Get CD111.
		@return CD111	  */
	public BigDecimal getCD111 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD111);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD111LY.
		@param CD111LY CD111LY	  */
	public void setCD111LY (BigDecimal CD111LY)
	{
		set_Value (COLUMNNAME_CD111LY, CD111LY);
	}

	/** Get CD111LY.
		@return CD111LY	  */
	public BigDecimal getCD111LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD111LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD112.
		@param CD112 CD112	  */
	public void setCD112 (BigDecimal CD112)
	{
		set_Value (COLUMNNAME_CD112, CD112);
	}

	/** Get CD112.
		@return CD112	  */
	public BigDecimal getCD112 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD112);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD112LY.
		@param CD112LY CD112LY	  */
	public void setCD112LY (BigDecimal CD112LY)
	{
		set_Value (COLUMNNAME_CD112LY, CD112LY);
	}

	/** Get CD112LY.
		@return CD112LY	  */
	public BigDecimal getCD112LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD112LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD120.
		@param CD120 CD120	  */
	public void setCD120 (BigDecimal CD120)
	{
		set_Value (COLUMNNAME_CD120, CD120);
	}

	/** Get CD120.
		@return CD120	  */
	public BigDecimal getCD120 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD120);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD120LY.
		@param CD120LY CD120LY	  */
	public void setCD120LY (BigDecimal CD120LY)
	{
		set_Value (COLUMNNAME_CD120LY, CD120LY);
	}

	/** Get CD120LY.
		@return CD120LY	  */
	public BigDecimal getCD120LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD120LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD121.
		@param CD121 CD121	  */
	public void setCD121 (BigDecimal CD121)
	{
		set_Value (COLUMNNAME_CD121, CD121);
	}

	/** Get CD121.
		@return CD121	  */
	public BigDecimal getCD121 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD121);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD121LY.
		@param CD121LY CD121LY	  */
	public void setCD121LY (BigDecimal CD121LY)
	{
		set_Value (COLUMNNAME_CD121LY, CD121LY);
	}

	/** Get CD121LY.
		@return CD121LY	  */
	public BigDecimal getCD121LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD121LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD122.
		@param CD122 CD122	  */
	public void setCD122 (BigDecimal CD122)
	{
		set_Value (COLUMNNAME_CD122, CD122);
	}

	/** Get CD122.
		@return CD122	  */
	public BigDecimal getCD122 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD122);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD122LY.
		@param CD122LY CD122LY	  */
	public void setCD122LY (BigDecimal CD122LY)
	{
		set_Value (COLUMNNAME_CD122LY, CD122LY);
	}

	/** Get CD122LY.
		@return CD122LY	  */
	public BigDecimal getCD122LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD122LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD123.
		@param CD123 CD123	  */
	public void setCD123 (BigDecimal CD123)
	{
		set_Value (COLUMNNAME_CD123, CD123);
	}

	/** Get CD123.
		@return CD123	  */
	public BigDecimal getCD123 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD123);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD123LY.
		@param CD123LY CD123LY	  */
	public void setCD123LY (BigDecimal CD123LY)
	{
		set_Value (COLUMNNAME_CD123LY, CD123LY);
	}

	/** Get CD123LY.
		@return CD123LY	  */
	public BigDecimal getCD123LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD123LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD124.
		@param CD124 CD124	  */
	public void setCD124 (BigDecimal CD124)
	{
		set_Value (COLUMNNAME_CD124, CD124);
	}

	/** Get CD124.
		@return CD124	  */
	public BigDecimal getCD124 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD124);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD124LY.
		@param CD124LY CD124LY	  */
	public void setCD124LY (BigDecimal CD124LY)
	{
		set_Value (COLUMNNAME_CD124LY, CD124LY);
	}

	/** Get CD124LY.
		@return CD124LY	  */
	public BigDecimal getCD124LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD124LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD130.
		@param CD130 CD130	  */
	public void setCD130 (BigDecimal CD130)
	{
		set_Value (COLUMNNAME_CD130, CD130);
	}

	/** Get CD130.
		@return CD130	  */
	public BigDecimal getCD130 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD130);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD130LY.
		@param CD130LY CD130LY	  */
	public void setCD130LY (BigDecimal CD130LY)
	{
		set_Value (COLUMNNAME_CD130LY, CD130LY);
	}

	/** Get CD130LY.
		@return CD130LY	  */
	public BigDecimal getCD130LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD130LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD131.
		@param CD131 CD131	  */
	public void setCD131 (BigDecimal CD131)
	{
		set_Value (COLUMNNAME_CD131, CD131);
	}

	/** Get CD131.
		@return CD131	  */
	public BigDecimal getCD131 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD131);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD131LY.
		@param CD131LY CD131LY	  */
	public void setCD131LY (BigDecimal CD131LY)
	{
		set_Value (COLUMNNAME_CD131LY, CD131LY);
	}

	/** Get CD131LY.
		@return CD131LY	  */
	public BigDecimal getCD131LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD131LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD132.
		@param CD132 CD132	  */
	public void setCD132 (BigDecimal CD132)
	{
		set_Value (COLUMNNAME_CD132, CD132);
	}

	/** Get CD132.
		@return CD132	  */
	public BigDecimal getCD132 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD132);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD132LY.
		@param CD132LY CD132LY	  */
	public void setCD132LY (BigDecimal CD132LY)
	{
		set_Value (COLUMNNAME_CD132LY, CD132LY);
	}

	/** Get CD132LY.
		@return CD132LY	  */
	public BigDecimal getCD132LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD132LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD133.
		@param CD133 CD133	  */
	public void setCD133 (BigDecimal CD133)
	{
		set_Value (COLUMNNAME_CD133, CD133);
	}

	/** Get CD133.
		@return CD133	  */
	public BigDecimal getCD133 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD133);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD133LY.
		@param CD133LY CD133LY	  */
	public void setCD133LY (BigDecimal CD133LY)
	{
		set_Value (COLUMNNAME_CD133LY, CD133LY);
	}

	/** Get CD133LY.
		@return CD133LY	  */
	public BigDecimal getCD133LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD133LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD134.
		@param CD134 CD134	  */
	public void setCD134 (BigDecimal CD134)
	{
		set_Value (COLUMNNAME_CD134, CD134);
	}

	/** Get CD134.
		@return CD134	  */
	public BigDecimal getCD134 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD134);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD134LY.
		@param CD134LY CD134LY	  */
	public void setCD134LY (BigDecimal CD134LY)
	{
		set_Value (COLUMNNAME_CD134LY, CD134LY);
	}

	/** Get CD134LY.
		@return CD134LY	  */
	public BigDecimal getCD134LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD134LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD135.
		@param CD135 CD135	  */
	public void setCD135 (BigDecimal CD135)
	{
		set_Value (COLUMNNAME_CD135, CD135);
	}

	/** Get CD135.
		@return CD135	  */
	public BigDecimal getCD135 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD135);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD135LY.
		@param CD135LY CD135LY	  */
	public void setCD135LY (BigDecimal CD135LY)
	{
		set_Value (COLUMNNAME_CD135LY, CD135LY);
	}

	/** Get CD135LY.
		@return CD135LY	  */
	public BigDecimal getCD135LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD135LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD136.
		@param CD136 CD136	  */
	public void setCD136 (BigDecimal CD136)
	{
		set_Value (COLUMNNAME_CD136, CD136);
	}

	/** Get CD136.
		@return CD136	  */
	public BigDecimal getCD136 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD136);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD136LY.
		@param CD136LY CD136LY	  */
	public void setCD136LY (BigDecimal CD136LY)
	{
		set_Value (COLUMNNAME_CD136LY, CD136LY);
	}

	/** Get CD136LY.
		@return CD136LY	  */
	public BigDecimal getCD136LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD136LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD137.
		@param CD137 CD137	  */
	public void setCD137 (BigDecimal CD137)
	{
		set_Value (COLUMNNAME_CD137, CD137);
	}

	/** Get CD137.
		@return CD137	  */
	public BigDecimal getCD137 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD137);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD137LY.
		@param CD137LY CD137LY	  */
	public void setCD137LY (BigDecimal CD137LY)
	{
		set_Value (COLUMNNAME_CD137LY, CD137LY);
	}

	/** Get CD137LY.
		@return CD137LY	  */
	public BigDecimal getCD137LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD137LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD139.
		@param CD139 CD139	  */
	public void setCD139 (BigDecimal CD139)
	{
		set_Value (COLUMNNAME_CD139, CD139);
	}

	/** Get CD139.
		@return CD139	  */
	public BigDecimal getCD139 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD139);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD139LY.
		@param CD139LY CD139LY	  */
	public void setCD139LY (BigDecimal CD139LY)
	{
		set_Value (COLUMNNAME_CD139LY, CD139LY);
	}

	/** Get CD139LY.
		@return CD139LY	  */
	public BigDecimal getCD139LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD139LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD140.
		@param CD140 CD140	  */
	public void setCD140 (BigDecimal CD140)
	{
		set_Value (COLUMNNAME_CD140, CD140);
	}

	/** Get CD140.
		@return CD140	  */
	public BigDecimal getCD140 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD140);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD140LY.
		@param CD140LY CD140LY	  */
	public void setCD140LY (BigDecimal CD140LY)
	{
		set_Value (COLUMNNAME_CD140LY, CD140LY);
	}

	/** Get CD140LY.
		@return CD140LY	  */
	public BigDecimal getCD140LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD140LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD141.
		@param CD141 CD141	  */
	public void setCD141 (BigDecimal CD141)
	{
		set_Value (COLUMNNAME_CD141, CD141);
	}

	/** Get CD141.
		@return CD141	  */
	public BigDecimal getCD141 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD141);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD141LY.
		@param CD141LY CD141LY	  */
	public void setCD141LY (BigDecimal CD141LY)
	{
		set_Value (COLUMNNAME_CD141LY, CD141LY);
	}

	/** Get CD141LY.
		@return CD141LY	  */
	public BigDecimal getCD141LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD141LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD149.
		@param CD149 CD149	  */
	public void setCD149 (BigDecimal CD149)
	{
		set_Value (COLUMNNAME_CD149, CD149);
	}

	/** Get CD149.
		@return CD149	  */
	public BigDecimal getCD149 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD149);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD149LY.
		@param CD149LY CD149LY	  */
	public void setCD149LY (BigDecimal CD149LY)
	{
		set_Value (COLUMNNAME_CD149LY, CD149LY);
	}

	/** Get CD149LY.
		@return CD149LY	  */
	public BigDecimal getCD149LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD149LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD150.
		@param CD150 CD150	  */
	public void setCD150 (BigDecimal CD150)
	{
		set_Value (COLUMNNAME_CD150, CD150);
	}

	/** Get CD150.
		@return CD150	  */
	public BigDecimal getCD150 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD150);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD150LY.
		@param CD150LY CD150LY	  */
	public void setCD150LY (BigDecimal CD150LY)
	{
		set_Value (COLUMNNAME_CD150LY, CD150LY);
	}

	/** Get CD150LY.
		@return CD150LY	  */
	public BigDecimal getCD150LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD150LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD151.
		@param CD151 CD151	  */
	public void setCD151 (BigDecimal CD151)
	{
		set_Value (COLUMNNAME_CD151, CD151);
	}

	/** Get CD151.
		@return CD151	  */
	public BigDecimal getCD151 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD151);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD151LY.
		@param CD151LY CD151LY	  */
	public void setCD151LY (BigDecimal CD151LY)
	{
		set_Value (COLUMNNAME_CD151LY, CD151LY);
	}

	/** Get CD151LY.
		@return CD151LY	  */
	public BigDecimal getCD151LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD151LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD152.
		@param CD152 CD152	  */
	public void setCD152 (BigDecimal CD152)
	{
		set_Value (COLUMNNAME_CD152, CD152);
	}

	/** Get CD152.
		@return CD152	  */
	public BigDecimal getCD152 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD152);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD152LY.
		@param CD152LY CD152LY	  */
	public void setCD152LY (BigDecimal CD152LY)
	{
		set_Value (COLUMNNAME_CD152LY, CD152LY);
	}

	/** Get CD152LY.
		@return CD152LY	  */
	public BigDecimal getCD152LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD152LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD153.
		@param CD153 CD153	  */
	public void setCD153 (BigDecimal CD153)
	{
		set_Value (COLUMNNAME_CD153, CD153);
	}

	/** Get CD153.
		@return CD153	  */
	public BigDecimal getCD153 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD153);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD153LY.
		@param CD153LY CD153LY	  */
	public void setCD153LY (BigDecimal CD153LY)
	{
		set_Value (COLUMNNAME_CD153LY, CD153LY);
	}

	/** Get CD153LY.
		@return CD153LY	  */
	public BigDecimal getCD153LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD153LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD154.
		@param CD154 CD154	  */
	public void setCD154 (BigDecimal CD154)
	{
		set_Value (COLUMNNAME_CD154, CD154);
	}

	/** Get CD154.
		@return CD154	  */
	public BigDecimal getCD154 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD154);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD154LY.
		@param CD154LY CD154LY	  */
	public void setCD154LY (BigDecimal CD154LY)
	{
		set_Value (COLUMNNAME_CD154LY, CD154LY);
	}

	/** Get CD154LY.
		@return CD154LY	  */
	public BigDecimal getCD154LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD154LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD155.
		@param CD155 CD155	  */
	public void setCD155 (BigDecimal CD155)
	{
		set_Value (COLUMNNAME_CD155, CD155);
	}

	/** Get CD155.
		@return CD155	  */
	public BigDecimal getCD155 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD155);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD155LY.
		@param CD155LY CD155LY	  */
	public void setCD155LY (BigDecimal CD155LY)
	{
		set_Value (COLUMNNAME_CD155LY, CD155LY);
	}

	/** Get CD155LY.
		@return CD155LY	  */
	public BigDecimal getCD155LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD155LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD200.
		@param CD200 CD200	  */
	public void setCD200 (BigDecimal CD200)
	{
		set_Value (COLUMNNAME_CD200, CD200);
	}

	/** Get CD200.
		@return CD200	  */
	public BigDecimal getCD200 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD200);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD200LY.
		@param CD200LY CD200LY	  */
	public void setCD200LY (BigDecimal CD200LY)
	{
		set_Value (COLUMNNAME_CD200LY, CD200LY);
	}

	/** Get CD200LY.
		@return CD200LY	  */
	public BigDecimal getCD200LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD200LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD210.
		@param CD210 CD210	  */
	public void setCD210 (BigDecimal CD210)
	{
		set_Value (COLUMNNAME_CD210, CD210);
	}

	/** Get CD210.
		@return CD210	  */
	public BigDecimal getCD210 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD210);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD210LY.
		@param CD210LY CD210LY	  */
	public void setCD210LY (BigDecimal CD210LY)
	{
		set_Value (COLUMNNAME_CD210LY, CD210LY);
	}

	/** Get CD210LY.
		@return CD210LY	  */
	public BigDecimal getCD210LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD210LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD211.
		@param CD211 CD211	  */
	public void setCD211 (BigDecimal CD211)
	{
		set_Value (COLUMNNAME_CD211, CD211);
	}

	/** Get CD211.
		@return CD211	  */
	public BigDecimal getCD211 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD211);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD211LY.
		@param CD211LY CD211LY	  */
	public void setCD211LY (BigDecimal CD211LY)
	{
		set_Value (COLUMNNAME_CD211LY, CD211LY);
	}

	/** Get CD211LY.
		@return CD211LY	  */
	public BigDecimal getCD211LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD211LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD212.
		@param CD212 CD212	  */
	public void setCD212 (BigDecimal CD212)
	{
		set_Value (COLUMNNAME_CD212, CD212);
	}

	/** Get CD212.
		@return CD212	  */
	public BigDecimal getCD212 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD212);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD212LY.
		@param CD212LY CD212LY	  */
	public void setCD212LY (BigDecimal CD212LY)
	{
		set_Value (COLUMNNAME_CD212LY, CD212LY);
	}

	/** Get CD212LY.
		@return CD212LY	  */
	public BigDecimal getCD212LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD212LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD213.
		@param CD213 CD213	  */
	public void setCD213 (BigDecimal CD213)
	{
		set_Value (COLUMNNAME_CD213, CD213);
	}

	/** Get CD213.
		@return CD213	  */
	public BigDecimal getCD213 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD213);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD213LY.
		@param CD213LY CD213LY	  */
	public void setCD213LY (BigDecimal CD213LY)
	{
		set_Value (COLUMNNAME_CD213LY, CD213LY);
	}

	/** Get CD213LY.
		@return CD213LY	  */
	public BigDecimal getCD213LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD213LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD214.
		@param CD214 CD214	  */
	public void setCD214 (BigDecimal CD214)
	{
		set_Value (COLUMNNAME_CD214, CD214);
	}

	/** Get CD214.
		@return CD214	  */
	public BigDecimal getCD214 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD214);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD214LY.
		@param CD214LY CD214LY	  */
	public void setCD214LY (BigDecimal CD214LY)
	{
		set_Value (COLUMNNAME_CD214LY, CD214LY);
	}

	/** Get CD214LY.
		@return CD214LY	  */
	public BigDecimal getCD214LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD214LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD215.
		@param CD215 CD215	  */
	public void setCD215 (BigDecimal CD215)
	{
		set_Value (COLUMNNAME_CD215, CD215);
	}

	/** Get CD215.
		@return CD215	  */
	public BigDecimal getCD215 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD215);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD215LY.
		@param CD215LY CD215LY	  */
	public void setCD215LY (BigDecimal CD215LY)
	{
		set_Value (COLUMNNAME_CD215LY, CD215LY);
	}

	/** Get CD215LY.
		@return CD215LY	  */
	public BigDecimal getCD215LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD215LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD216.
		@param CD216 CD216	  */
	public void setCD216 (BigDecimal CD216)
	{
		set_Value (COLUMNNAME_CD216, CD216);
	}

	/** Get CD216.
		@return CD216	  */
	public BigDecimal getCD216 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD216);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD216LY.
		@param CD216LY CD216LY	  */
	public void setCD216LY (BigDecimal CD216LY)
	{
		set_Value (COLUMNNAME_CD216LY, CD216LY);
	}

	/** Get CD216LY.
		@return CD216LY	  */
	public BigDecimal getCD216LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD216LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD219.
		@param CD219 CD219	  */
	public void setCD219 (BigDecimal CD219)
	{
		set_Value (COLUMNNAME_CD219, CD219);
	}

	/** Get CD219.
		@return CD219	  */
	public BigDecimal getCD219 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD219);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD219LY.
		@param CD219LY CD219LY	  */
	public void setCD219LY (BigDecimal CD219LY)
	{
		set_Value (COLUMNNAME_CD219LY, CD219LY);
	}

	/** Get CD219LY.
		@return CD219LY	  */
	public BigDecimal getCD219LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD219LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD220.
		@param CD220 CD220	  */
	public void setCD220 (BigDecimal CD220)
	{
		set_Value (COLUMNNAME_CD220, CD220);
	}

	/** Get CD220.
		@return CD220	  */
	public BigDecimal getCD220 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD220);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD220LY.
		@param CD220LY CD220LY	  */
	public void setCD220LY (BigDecimal CD220LY)
	{
		set_Value (COLUMNNAME_CD220LY, CD220LY);
	}

	/** Get CD220LY.
		@return CD220LY	  */
	public BigDecimal getCD220LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD220LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD221.
		@param CD221 CD221	  */
	public void setCD221 (BigDecimal CD221)
	{
		set_Value (COLUMNNAME_CD221, CD221);
	}

	/** Get CD221.
		@return CD221	  */
	public BigDecimal getCD221 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD221);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD221LY.
		@param CD221LY CD221LY	  */
	public void setCD221LY (BigDecimal CD221LY)
	{
		set_Value (COLUMNNAME_CD221LY, CD221LY);
	}

	/** Get CD221LY.
		@return CD221LY	  */
	public BigDecimal getCD221LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD221LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD222.
		@param CD222 CD222	  */
	public void setCD222 (BigDecimal CD222)
	{
		set_Value (COLUMNNAME_CD222, CD222);
	}

	/** Get CD222.
		@return CD222	  */
	public BigDecimal getCD222 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD222);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD222LY.
		@param CD222LY CD222LY	  */
	public void setCD222LY (BigDecimal CD222LY)
	{
		set_Value (COLUMNNAME_CD222LY, CD222LY);
	}

	/** Get CD222LY.
		@return CD222LY	  */
	public BigDecimal getCD222LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD222LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD223.
		@param CD223 CD223	  */
	public void setCD223 (BigDecimal CD223)
	{
		set_Value (COLUMNNAME_CD223, CD223);
	}

	/** Get CD223.
		@return CD223	  */
	public BigDecimal getCD223 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD223);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD223LY.
		@param CD223LY CD223LY	  */
	public void setCD223LY (BigDecimal CD223LY)
	{
		set_Value (COLUMNNAME_CD223LY, CD223LY);
	}

	/** Get CD223LY.
		@return CD223LY	  */
	public BigDecimal getCD223LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD223LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD224.
		@param CD224 CD224	  */
	public void setCD224 (BigDecimal CD224)
	{
		set_Value (COLUMNNAME_CD224, CD224);
	}

	/** Get CD224.
		@return CD224	  */
	public BigDecimal getCD224 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD224);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD224LY.
		@param CD224LY CD224LY	  */
	public void setCD224LY (BigDecimal CD224LY)
	{
		set_Value (COLUMNNAME_CD224LY, CD224LY);
	}

	/** Get CD224LY.
		@return CD224LY	  */
	public BigDecimal getCD224LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD224LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD225.
		@param CD225 CD225	  */
	public void setCD225 (BigDecimal CD225)
	{
		set_Value (COLUMNNAME_CD225, CD225);
	}

	/** Get CD225.
		@return CD225	  */
	public BigDecimal getCD225 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD225);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD225LY.
		@param CD225LY CD225LY	  */
	public void setCD225LY (BigDecimal CD225LY)
	{
		set_Value (COLUMNNAME_CD225LY, CD225LY);
	}

	/** Get CD225LY.
		@return CD225LY	  */
	public BigDecimal getCD225LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD225LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD226.
		@param CD226 CD226	  */
	public void setCD226 (BigDecimal CD226)
	{
		set_Value (COLUMNNAME_CD226, CD226);
	}

	/** Get CD226.
		@return CD226	  */
	public BigDecimal getCD226 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD226);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD226LY.
		@param CD226LY CD226LY	  */
	public void setCD226LY (BigDecimal CD226LY)
	{
		set_Value (COLUMNNAME_CD226LY, CD226LY);
	}

	/** Get CD226LY.
		@return CD226LY	  */
	public BigDecimal getCD226LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD226LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD227.
		@param CD227 CD227	  */
	public void setCD227 (BigDecimal CD227)
	{
		set_Value (COLUMNNAME_CD227, CD227);
	}

	/** Get CD227.
		@return CD227	  */
	public BigDecimal getCD227 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD227);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD227LY.
		@param CD227LY CD227LY	  */
	public void setCD227LY (BigDecimal CD227LY)
	{
		set_Value (COLUMNNAME_CD227LY, CD227LY);
	}

	/** Get CD227LY.
		@return CD227LY	  */
	public BigDecimal getCD227LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD227LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD228.
		@param CD228 CD228	  */
	public void setCD228 (BigDecimal CD228)
	{
		set_Value (COLUMNNAME_CD228, CD228);
	}

	/** Get CD228.
		@return CD228	  */
	public BigDecimal getCD228 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD228);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD228LY.
		@param CD228LY CD228LY	  */
	public void setCD228LY (BigDecimal CD228LY)
	{
		set_Value (COLUMNNAME_CD228LY, CD228LY);
	}

	/** Get CD228LY.
		@return CD228LY	  */
	public BigDecimal getCD228LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD228LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD229.
		@param CD229 CD229	  */
	public void setCD229 (BigDecimal CD229)
	{
		set_Value (COLUMNNAME_CD229, CD229);
	}

	/** Get CD229.
		@return CD229	  */
	public BigDecimal getCD229 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD229);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD229LY.
		@param CD229LY CD229LY	  */
	public void setCD229LY (BigDecimal CD229LY)
	{
		set_Value (COLUMNNAME_CD229LY, CD229LY);
	}

	/** Get CD229LY.
		@return CD229LY	  */
	public BigDecimal getCD229LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD229LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD230.
		@param CD230 CD230	  */
	public void setCD230 (BigDecimal CD230)
	{
		set_Value (COLUMNNAME_CD230, CD230);
	}

	/** Get CD230.
		@return CD230	  */
	public BigDecimal getCD230 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD230);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD230LY.
		@param CD230LY CD230LY	  */
	public void setCD230LY (BigDecimal CD230LY)
	{
		set_Value (COLUMNNAME_CD230LY, CD230LY);
	}

	/** Get CD230LY.
		@return CD230LY	  */
	public BigDecimal getCD230LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD230LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD231.
		@param CD231 CD231	  */
	public void setCD231 (BigDecimal CD231)
	{
		set_Value (COLUMNNAME_CD231, CD231);
	}

	/** Get CD231.
		@return CD231	  */
	public BigDecimal getCD231 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD231);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD231LY.
		@param CD231LY CD231LY	  */
	public void setCD231LY (BigDecimal CD231LY)
	{
		set_Value (COLUMNNAME_CD231LY, CD231LY);
	}

	/** Get CD231LY.
		@return CD231LY	  */
	public BigDecimal getCD231LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD231LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD232.
		@param CD232 CD232	  */
	public void setCD232 (BigDecimal CD232)
	{
		set_Value (COLUMNNAME_CD232, CD232);
	}

	/** Get CD232.
		@return CD232	  */
	public BigDecimal getCD232 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD232);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD232LY.
		@param CD232LY CD232LY	  */
	public void setCD232LY (BigDecimal CD232LY)
	{
		set_Value (COLUMNNAME_CD232LY, CD232LY);
	}

	/** Get CD232LY.
		@return CD232LY	  */
	public BigDecimal getCD232LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD232LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD240.
		@param CD240 CD240	  */
	public void setCD240 (BigDecimal CD240)
	{
		set_Value (COLUMNNAME_CD240, CD240);
	}

	/** Get CD240.
		@return CD240	  */
	public BigDecimal getCD240 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD240);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD240LY.
		@param CD240LY CD240LY	  */
	public void setCD240LY (BigDecimal CD240LY)
	{
		set_Value (COLUMNNAME_CD240LY, CD240LY);
	}

	/** Get CD240LY.
		@return CD240LY	  */
	public BigDecimal getCD240LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD240LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD241.
		@param CD241 CD241	  */
	public void setCD241 (BigDecimal CD241)
	{
		set_Value (COLUMNNAME_CD241, CD241);
	}

	/** Get CD241.
		@return CD241	  */
	public BigDecimal getCD241 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD241);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD241LY.
		@param CD241LY CD241LY	  */
	public void setCD241LY (BigDecimal CD241LY)
	{
		set_Value (COLUMNNAME_CD241LY, CD241LY);
	}

	/** Get CD241LY.
		@return CD241LY	  */
	public BigDecimal getCD241LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD241LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD242.
		@param CD242 CD242	  */
	public void setCD242 (BigDecimal CD242)
	{
		set_Value (COLUMNNAME_CD242, CD242);
	}

	/** Get CD242.
		@return CD242	  */
	public BigDecimal getCD242 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD242);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD242LY.
		@param CD242LY CD242LY	  */
	public void setCD242LY (BigDecimal CD242LY)
	{
		set_Value (COLUMNNAME_CD242LY, CD242LY);
	}

	/** Get CD242LY.
		@return CD242LY	  */
	public BigDecimal getCD242LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD242LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD250.
		@param CD250 CD250	  */
	public void setCD250 (BigDecimal CD250)
	{
		set_Value (COLUMNNAME_CD250, CD250);
	}

	/** Get CD250.
		@return CD250	  */
	public BigDecimal getCD250 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD250);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD250LY.
		@param CD250LY CD250LY	  */
	public void setCD250LY (BigDecimal CD250LY)
	{
		set_Value (COLUMNNAME_CD250LY, CD250LY);
	}

	/** Get CD250LY.
		@return CD250LY	  */
	public BigDecimal getCD250LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD250LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD251.
		@param CD251 CD251	  */
	public void setCD251 (BigDecimal CD251)
	{
		set_Value (COLUMNNAME_CD251, CD251);
	}

	/** Get CD251.
		@return CD251	  */
	public BigDecimal getCD251 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD251);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD251LY.
		@param CD251LY CD251LY	  */
	public void setCD251LY (BigDecimal CD251LY)
	{
		set_Value (COLUMNNAME_CD251LY, CD251LY);
	}

	/** Get CD251LY.
		@return CD251LY	  */
	public BigDecimal getCD251LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD251LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD252.
		@param CD252 CD252	  */
	public void setCD252 (BigDecimal CD252)
	{
		set_Value (COLUMNNAME_CD252, CD252);
	}

	/** Get CD252.
		@return CD252	  */
	public BigDecimal getCD252 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD252);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD252LY.
		@param CD252LY CD252LY	  */
	public void setCD252LY (BigDecimal CD252LY)
	{
		set_Value (COLUMNNAME_CD252LY, CD252LY);
	}

	/** Get CD252LY.
		@return CD252LY	  */
	public BigDecimal getCD252LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD252LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD253.
		@param CD253 CD253	  */
	public void setCD253 (BigDecimal CD253)
	{
		set_Value (COLUMNNAME_CD253, CD253);
	}

	/** Get CD253.
		@return CD253	  */
	public BigDecimal getCD253 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD253);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD253LY.
		@param CD253LY CD253LY	  */
	public void setCD253LY (BigDecimal CD253LY)
	{
		set_Value (COLUMNNAME_CD253LY, CD253LY);
	}

	/** Get CD253LY.
		@return CD253LY	  */
	public BigDecimal getCD253LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD253LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD254.
		@param CD254 CD254	  */
	public void setCD254 (BigDecimal CD254)
	{
		set_Value (COLUMNNAME_CD254, CD254);
	}

	/** Get CD254.
		@return CD254	  */
	public BigDecimal getCD254 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD254);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD254LY.
		@param CD254LY CD254LY	  */
	public void setCD254LY (BigDecimal CD254LY)
	{
		set_Value (COLUMNNAME_CD254LY, CD254LY);
	}

	/** Get CD254LY.
		@return CD254LY	  */
	public BigDecimal getCD254LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD254LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD255.
		@param CD255 CD255	  */
	public void setCD255 (BigDecimal CD255)
	{
		set_Value (COLUMNNAME_CD255, CD255);
	}

	/** Get CD255.
		@return CD255	  */
	public BigDecimal getCD255 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD255);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD255LY.
		@param CD255LY CD255LY	  */
	public void setCD255LY (BigDecimal CD255LY)
	{
		set_Value (COLUMNNAME_CD255LY, CD255LY);
	}

	/** Get CD255LY.
		@return CD255LY	  */
	public BigDecimal getCD255LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD255LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD260.
		@param CD260 CD260	  */
	public void setCD260 (BigDecimal CD260)
	{
		set_Value (COLUMNNAME_CD260, CD260);
	}

	/** Get CD260.
		@return CD260	  */
	public BigDecimal getCD260 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD260);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD260LY.
		@param CD260LY CD260LY	  */
	public void setCD260LY (BigDecimal CD260LY)
	{
		set_Value (COLUMNNAME_CD260LY, CD260LY);
	}

	/** Get CD260LY.
		@return CD260LY	  */
	public BigDecimal getCD260LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD260LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD261.
		@param CD261 CD261	  */
	public void setCD261 (BigDecimal CD261)
	{
		set_Value (COLUMNNAME_CD261, CD261);
	}

	/** Get CD261.
		@return CD261	  */
	public BigDecimal getCD261 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD261);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD261LY.
		@param CD261LY CD261LY	  */
	public void setCD261LY (BigDecimal CD261LY)
	{
		set_Value (COLUMNNAME_CD261LY, CD261LY);
	}

	/** Get CD261LY.
		@return CD261LY	  */
	public BigDecimal getCD261LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD261LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD262.
		@param CD262 CD262	  */
	public void setCD262 (BigDecimal CD262)
	{
		set_Value (COLUMNNAME_CD262, CD262);
	}

	/** Get CD262.
		@return CD262	  */
	public BigDecimal getCD262 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD262);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD262LY.
		@param CD262LY CD262LY	  */
	public void setCD262LY (BigDecimal CD262LY)
	{
		set_Value (COLUMNNAME_CD262LY, CD262LY);
	}

	/** Get CD262LY.
		@return CD262LY	  */
	public BigDecimal getCD262LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD262LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD263.
		@param CD263 CD263	  */
	public void setCD263 (BigDecimal CD263)
	{
		set_Value (COLUMNNAME_CD263, CD263);
	}

	/** Get CD263.
		@return CD263	  */
	public BigDecimal getCD263 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD263);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD263LY.
		@param CD263LY CD263LY	  */
	public void setCD263LY (BigDecimal CD263LY)
	{
		set_Value (COLUMNNAME_CD263LY, CD263LY);
	}

	/** Get CD263LY.
		@return CD263LY	  */
	public BigDecimal getCD263LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD263LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD268.
		@param CD268 CD268	  */
	public void setCD268 (BigDecimal CD268)
	{
		set_Value (COLUMNNAME_CD268, CD268);
	}

	/** Get CD268.
		@return CD268	  */
	public BigDecimal getCD268 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD268);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD268LY.
		@param CD268LY CD268LY	  */
	public void setCD268LY (BigDecimal CD268LY)
	{
		set_Value (COLUMNNAME_CD268LY, CD268LY);
	}

	/** Get CD268LY.
		@return CD268LY	  */
	public BigDecimal getCD268LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD268LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD269.
		@param CD269 CD269	  */
	public void setCD269 (BigDecimal CD269)
	{
		set_Value (COLUMNNAME_CD269, CD269);
	}

	/** Get CD269.
		@return CD269	  */
	public BigDecimal getCD269 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD269);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD269LY.
		@param CD269LY CD269LY	  */
	public void setCD269LY (BigDecimal CD269LY)
	{
		set_Value (COLUMNNAME_CD269LY, CD269LY);
	}

	/** Get CD269LY.
		@return CD269LY	  */
	public BigDecimal getCD269LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD269LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD270.
		@param CD270 CD270	  */
	public void setCD270 (BigDecimal CD270)
	{
		set_Value (COLUMNNAME_CD270, CD270);
	}

	/** Get CD270.
		@return CD270	  */
	public BigDecimal getCD270 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD270);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD270LY.
		@param CD270LY CD270LY	  */
	public void setCD270LY (BigDecimal CD270LY)
	{
		set_Value (COLUMNNAME_CD270LY, CD270LY);
	}

	/** Get CD270LY.
		@return CD270LY	  */
	public BigDecimal getCD270LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD270LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD300.
		@param CD300 CD300	  */
	public void setCD300 (BigDecimal CD300)
	{
		set_Value (COLUMNNAME_CD300, CD300);
	}

	/** Get CD300.
		@return CD300	  */
	public BigDecimal getCD300 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD300);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD300LY.
		@param CD300LY CD300LY	  */
	public void setCD300LY (BigDecimal CD300LY)
	{
		set_Value (COLUMNNAME_CD300LY, CD300LY);
	}

	/** Get CD300LY.
		@return CD300LY	  */
	public BigDecimal getCD300LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD300LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD310.
		@param CD310 CD310	  */
	public void setCD310 (BigDecimal CD310)
	{
		set_Value (COLUMNNAME_CD310, CD310);
	}

	/** Get CD310.
		@return CD310	  */
	public BigDecimal getCD310 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD310);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD310LY.
		@param CD310LY CD310LY	  */
	public void setCD310LY (BigDecimal CD310LY)
	{
		set_Value (COLUMNNAME_CD310LY, CD310LY);
	}

	/** Get CD310LY.
		@return CD310LY	  */
	public BigDecimal getCD310LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD310LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD311.
		@param CD311 CD311	  */
	public void setCD311 (BigDecimal CD311)
	{
		set_Value (COLUMNNAME_CD311, CD311);
	}

	/** Get CD311.
		@return CD311	  */
	public BigDecimal getCD311 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD311);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD311LY.
		@param CD311LY CD311LY	  */
	public void setCD311LY (BigDecimal CD311LY)
	{
		set_Value (COLUMNNAME_CD311LY, CD311LY);
	}

	/** Get CD311LY.
		@return CD311LY	  */
	public BigDecimal getCD311LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD311LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD312.
		@param CD312 CD312	  */
	public void setCD312 (BigDecimal CD312)
	{
		set_Value (COLUMNNAME_CD312, CD312);
	}

	/** Get CD312.
		@return CD312	  */
	public BigDecimal getCD312 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD312);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD312LY.
		@param CD312LY CD312LY	  */
	public void setCD312LY (BigDecimal CD312LY)
	{
		set_Value (COLUMNNAME_CD312LY, CD312LY);
	}

	/** Get CD312LY.
		@return CD312LY	  */
	public BigDecimal getCD312LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD312LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD313.
		@param CD313 CD313	  */
	public void setCD313 (BigDecimal CD313)
	{
		set_Value (COLUMNNAME_CD313, CD313);
	}

	/** Get CD313.
		@return CD313	  */
	public BigDecimal getCD313 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD313);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD313LY.
		@param CD313LY CD313LY	  */
	public void setCD313LY (BigDecimal CD313LY)
	{
		set_Value (COLUMNNAME_CD313LY, CD313LY);
	}

	/** Get CD313LY.
		@return CD313LY	  */
	public BigDecimal getCD313LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD313LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD314.
		@param CD314 CD314	  */
	public void setCD314 (BigDecimal CD314)
	{
		set_Value (COLUMNNAME_CD314, CD314);
	}

	/** Get CD314.
		@return CD314	  */
	public BigDecimal getCD314 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD314);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD314LY.
		@param CD314LY CD314LY	  */
	public void setCD314LY (BigDecimal CD314LY)
	{
		set_Value (COLUMNNAME_CD314LY, CD314LY);
	}

	/** Get CD314LY.
		@return CD314LY	  */
	public BigDecimal getCD314LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD314LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD315.
		@param CD315 CD315	  */
	public void setCD315 (BigDecimal CD315)
	{
		set_Value (COLUMNNAME_CD315, CD315);
	}

	/** Get CD315.
		@return CD315	  */
	public BigDecimal getCD315 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD315);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD315LY.
		@param CD315LY CD315LY	  */
	public void setCD315LY (BigDecimal CD315LY)
	{
		set_Value (COLUMNNAME_CD315LY, CD315LY);
	}

	/** Get CD315LY.
		@return CD315LY	  */
	public BigDecimal getCD315LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD315LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD316.
		@param CD316 CD316	  */
	public void setCD316 (BigDecimal CD316)
	{
		set_Value (COLUMNNAME_CD316, CD316);
	}

	/** Get CD316.
		@return CD316	  */
	public BigDecimal getCD316 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD316);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD316LY.
		@param CD316LY CD316LY	  */
	public void setCD316LY (BigDecimal CD316LY)
	{
		set_Value (COLUMNNAME_CD316LY, CD316LY);
	}

	/** Get CD316LY.
		@return CD316LY	  */
	public BigDecimal getCD316LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD316LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD317.
		@param CD317 CD317	  */
	public void setCD317 (BigDecimal CD317)
	{
		set_Value (COLUMNNAME_CD317, CD317);
	}

	/** Get CD317.
		@return CD317	  */
	public BigDecimal getCD317 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD317);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD317LY.
		@param CD317LY CD317LY	  */
	public void setCD317LY (BigDecimal CD317LY)
	{
		set_Value (COLUMNNAME_CD317LY, CD317LY);
	}

	/** Get CD317LY.
		@return CD317LY	  */
	public BigDecimal getCD317LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD317LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD318.
		@param CD318 CD318	  */
	public void setCD318 (BigDecimal CD318)
	{
		set_Value (COLUMNNAME_CD318, CD318);
	}

	/** Get CD318.
		@return CD318	  */
	public BigDecimal getCD318 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD318);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD318LY.
		@param CD318LY CD318LY	  */
	public void setCD318LY (BigDecimal CD318LY)
	{
		set_Value (COLUMNNAME_CD318LY, CD318LY);
	}

	/** Get CD318LY.
		@return CD318LY	  */
	public BigDecimal getCD318LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD318LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD319.
		@param CD319 CD319	  */
	public void setCD319 (BigDecimal CD319)
	{
		set_Value (COLUMNNAME_CD319, CD319);
	}

	/** Get CD319.
		@return CD319	  */
	public BigDecimal getCD319 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD319);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD319LY.
		@param CD319LY CD319LY	  */
	public void setCD319LY (BigDecimal CD319LY)
	{
		set_Value (COLUMNNAME_CD319LY, CD319LY);
	}

	/** Get CD319LY.
		@return CD319LY	  */
	public BigDecimal getCD319LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD319LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD320.
		@param CD320 CD320	  */
	public void setCD320 (BigDecimal CD320)
	{
		set_Value (COLUMNNAME_CD320, CD320);
	}

	/** Get CD320.
		@return CD320	  */
	public BigDecimal getCD320 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD320);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD320LY.
		@param CD320LY CD320LY	  */
	public void setCD320LY (BigDecimal CD320LY)
	{
		set_Value (COLUMNNAME_CD320LY, CD320LY);
	}

	/** Get CD320LY.
		@return CD320LY	  */
	public BigDecimal getCD320LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD320LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD321.
		@param CD321 CD321	  */
	public void setCD321 (BigDecimal CD321)
	{
		set_Value (COLUMNNAME_CD321, CD321);
	}

	/** Get CD321.
		@return CD321	  */
	public BigDecimal getCD321 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD321);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD321LY.
		@param CD321LY CD321LY	  */
	public void setCD321LY (BigDecimal CD321LY)
	{
		set_Value (COLUMNNAME_CD321LY, CD321LY);
	}

	/** Get CD321LY.
		@return CD321LY	  */
	public BigDecimal getCD321LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD321LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD322.
		@param CD322 CD322	  */
	public void setCD322 (BigDecimal CD322)
	{
		set_Value (COLUMNNAME_CD322, CD322);
	}

	/** Get CD322.
		@return CD322	  */
	public BigDecimal getCD322 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD322);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD322LY.
		@param CD322LY CD322LY	  */
	public void setCD322LY (BigDecimal CD322LY)
	{
		set_Value (COLUMNNAME_CD322LY, CD322LY);
	}

	/** Get CD322LY.
		@return CD322LY	  */
	public BigDecimal getCD322LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD322LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD323.
		@param CD323 CD323	  */
	public void setCD323 (BigDecimal CD323)
	{
		set_Value (COLUMNNAME_CD323, CD323);
	}

	/** Get CD323.
		@return CD323	  */
	public BigDecimal getCD323 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD323);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD323LY.
		@param CD323LY CD323LY	  */
	public void setCD323LY (BigDecimal CD323LY)
	{
		set_Value (COLUMNNAME_CD323LY, CD323LY);
	}

	/** Get CD323LY.
		@return CD323LY	  */
	public BigDecimal getCD323LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD323LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD324.
		@param CD324 CD324	  */
	public void setCD324 (BigDecimal CD324)
	{
		set_Value (COLUMNNAME_CD324, CD324);
	}

	/** Get CD324.
		@return CD324	  */
	public BigDecimal getCD324 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD324);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD324LY.
		@param CD324LY CD324LY	  */
	public void setCD324LY (BigDecimal CD324LY)
	{
		set_Value (COLUMNNAME_CD324LY, CD324LY);
	}

	/** Get CD324LY.
		@return CD324LY	  */
	public BigDecimal getCD324LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD324LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD330.
		@param CD330 CD330	  */
	public void setCD330 (BigDecimal CD330)
	{
		set_Value (COLUMNNAME_CD330, CD330);
	}

	/** Get CD330.
		@return CD330	  */
	public BigDecimal getCD330 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD330);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD330LY.
		@param CD330LY CD330LY	  */
	public void setCD330LY (BigDecimal CD330LY)
	{
		set_Value (COLUMNNAME_CD330LY, CD330LY);
	}

	/** Get CD330LY.
		@return CD330LY	  */
	public BigDecimal getCD330LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD330LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD331.
		@param CD331 CD331	  */
	public void setCD331 (BigDecimal CD331)
	{
		set_Value (COLUMNNAME_CD331, CD331);
	}

	/** Get CD331.
		@return CD331	  */
	public BigDecimal getCD331 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD331);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD331LY.
		@param CD331LY CD331LY	  */
	public void setCD331LY (BigDecimal CD331LY)
	{
		set_Value (COLUMNNAME_CD331LY, CD331LY);
	}

	/** Get CD331LY.
		@return CD331LY	  */
	public BigDecimal getCD331LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD331LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD332.
		@param CD332 CD332	  */
	public void setCD332 (BigDecimal CD332)
	{
		set_Value (COLUMNNAME_CD332, CD332);
	}

	/** Get CD332.
		@return CD332	  */
	public BigDecimal getCD332 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD332);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD332LY.
		@param CD332LY CD332LY	  */
	public void setCD332LY (BigDecimal CD332LY)
	{
		set_Value (COLUMNNAME_CD332LY, CD332LY);
	}

	/** Get CD332LY.
		@return CD332LY	  */
	public BigDecimal getCD332LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD332LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD333.
		@param CD333 CD333	  */
	public void setCD333 (BigDecimal CD333)
	{
		set_Value (COLUMNNAME_CD333, CD333);
	}

	/** Get CD333.
		@return CD333	  */
	public BigDecimal getCD333 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD333);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD333LY.
		@param CD333LY CD333LY	  */
	public void setCD333LY (BigDecimal CD333LY)
	{
		set_Value (COLUMNNAME_CD333LY, CD333LY);
	}

	/** Get CD333LY.
		@return CD333LY	  */
	public BigDecimal getCD333LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD333LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD334.
		@param CD334 CD334	  */
	public void setCD334 (BigDecimal CD334)
	{
		set_Value (COLUMNNAME_CD334, CD334);
	}

	/** Get CD334.
		@return CD334	  */
	public BigDecimal getCD334 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD334);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD334LY.
		@param CD334LY CD334LY	  */
	public void setCD334LY (BigDecimal CD334LY)
	{
		set_Value (COLUMNNAME_CD334LY, CD334LY);
	}

	/** Get CD334LY.
		@return CD334LY	  */
	public BigDecimal getCD334LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD334LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD335.
		@param CD335 CD335	  */
	public void setCD335 (BigDecimal CD335)
	{
		set_Value (COLUMNNAME_CD335, CD335);
	}

	/** Get CD335.
		@return CD335	  */
	public BigDecimal getCD335 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD335);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD335LY.
		@param CD335LY CD335LY	  */
	public void setCD335LY (BigDecimal CD335LY)
	{
		set_Value (COLUMNNAME_CD335LY, CD335LY);
	}

	/** Get CD335LY.
		@return CD335LY	  */
	public BigDecimal getCD335LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD335LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD336.
		@param CD336 CD336	  */
	public void setCD336 (BigDecimal CD336)
	{
		set_Value (COLUMNNAME_CD336, CD336);
	}

	/** Get CD336.
		@return CD336	  */
	public BigDecimal getCD336 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD336);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD336LY.
		@param CD336LY CD336LY	  */
	public void setCD336LY (BigDecimal CD336LY)
	{
		set_Value (COLUMNNAME_CD336LY, CD336LY);
	}

	/** Get CD336LY.
		@return CD336LY	  */
	public BigDecimal getCD336LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD336LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD337.
		@param CD337 CD337	  */
	public void setCD337 (BigDecimal CD337)
	{
		set_Value (COLUMNNAME_CD337, CD337);
	}

	/** Get CD337.
		@return CD337	  */
	public BigDecimal getCD337 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD337);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD337LY.
		@param CD337LY CD337LY	  */
	public void setCD337LY (BigDecimal CD337LY)
	{
		set_Value (COLUMNNAME_CD337LY, CD337LY);
	}

	/** Get CD337LY.
		@return CD337LY	  */
	public BigDecimal getCD337LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD337LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD338.
		@param CD338 CD338	  */
	public void setCD338 (BigDecimal CD338)
	{
		set_Value (COLUMNNAME_CD338, CD338);
	}

	/** Get CD338.
		@return CD338	  */
	public BigDecimal getCD338 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD338);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD338LY.
		@param CD338LY CD338LY	  */
	public void setCD338LY (BigDecimal CD338LY)
	{
		set_Value (COLUMNNAME_CD338LY, CD338LY);
	}

	/** Get CD338LY.
		@return CD338LY	  */
	public BigDecimal getCD338LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD338LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD339.
		@param CD339 CD339	  */
	public void setCD339 (BigDecimal CD339)
	{
		set_Value (COLUMNNAME_CD339, CD339);
	}

	/** Get CD339.
		@return CD339	  */
	public BigDecimal getCD339 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD339);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD339LY.
		@param CD339LY CD339LY	  */
	public void setCD339LY (BigDecimal CD339LY)
	{
		set_Value (COLUMNNAME_CD339LY, CD339LY);
	}

	/** Get CD339LY.
		@return CD339LY	  */
	public BigDecimal getCD339LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD339LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD340.
		@param CD340 CD340	  */
	public void setCD340 (BigDecimal CD340)
	{
		set_Value (COLUMNNAME_CD340, CD340);
	}

	/** Get CD340.
		@return CD340	  */
	public BigDecimal getCD340 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD340);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD340LY.
		@param CD340LY CD340LY	  */
	public void setCD340LY (BigDecimal CD340LY)
	{
		set_Value (COLUMNNAME_CD340LY, CD340LY);
	}

	/** Get CD340LY.
		@return CD340LY	  */
	public BigDecimal getCD340LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD340LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD341.
		@param CD341 CD341	  */
	public void setCD341 (BigDecimal CD341)
	{
		set_Value (COLUMNNAME_CD341, CD341);
	}

	/** Get CD341.
		@return CD341	  */
	public BigDecimal getCD341 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD341);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD341LY.
		@param CD341LY CD341LY	  */
	public void setCD341LY (BigDecimal CD341LY)
	{
		set_Value (COLUMNNAME_CD341LY, CD341LY);
	}

	/** Get CD341LY.
		@return CD341LY	  */
	public BigDecimal getCD341LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD341LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD342.
		@param CD342 CD342	  */
	public void setCD342 (BigDecimal CD342)
	{
		set_Value (COLUMNNAME_CD342, CD342);
	}

	/** Get CD342.
		@return CD342	  */
	public BigDecimal getCD342 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD342);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD342LY.
		@param CD342LY CD342LY	  */
	public void setCD342LY (BigDecimal CD342LY)
	{
		set_Value (COLUMNNAME_CD342LY, CD342LY);
	}

	/** Get CD342LY.
		@return CD342LY	  */
	public BigDecimal getCD342LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD342LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD343.
		@param CD343 CD343	  */
	public void setCD343 (BigDecimal CD343)
	{
		set_Value (COLUMNNAME_CD343, CD343);
	}

	/** Get CD343.
		@return CD343	  */
	public BigDecimal getCD343 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD343);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD343LY.
		@param CD343LY CD343LY	  */
	public void setCD343LY (BigDecimal CD343LY)
	{
		set_Value (COLUMNNAME_CD343LY, CD343LY);
	}

	/** Get CD343LY.
		@return CD343LY	  */
	public BigDecimal getCD343LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD343LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD400.
		@param CD400 CD400	  */
	public void setCD400 (BigDecimal CD400)
	{
		set_Value (COLUMNNAME_CD400, CD400);
	}

	/** Get CD400.
		@return CD400	  */
	public BigDecimal getCD400 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD400);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD400LY.
		@param CD400LY CD400LY	  */
	public void setCD400LY (BigDecimal CD400LY)
	{
		set_Value (COLUMNNAME_CD400LY, CD400LY);
	}

	/** Get CD400LY.
		@return CD400LY	  */
	public BigDecimal getCD400LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD400LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD410.
		@param CD410 CD410	  */
	public void setCD410 (BigDecimal CD410)
	{
		set_Value (COLUMNNAME_CD410, CD410);
	}

	/** Get CD410.
		@return CD410	  */
	public BigDecimal getCD410 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD410);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD410LY.
		@param CD410LY CD410LY	  */
	public void setCD410LY (BigDecimal CD410LY)
	{
		set_Value (COLUMNNAME_CD410LY, CD410LY);
	}

	/** Get CD410LY.
		@return CD410LY	  */
	public BigDecimal getCD410LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD410LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD411.
		@param CD411 CD411	  */
	public void setCD411 (BigDecimal CD411)
	{
		set_Value (COLUMNNAME_CD411, CD411);
	}

	/** Get CD411.
		@return CD411	  */
	public BigDecimal getCD411 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD411);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD411LY.
		@param CD411LY CD411LY	  */
	public void setCD411LY (BigDecimal CD411LY)
	{
		set_Value (COLUMNNAME_CD411LY, CD411LY);
	}

	/** Get CD411LY.
		@return CD411LY	  */
	public BigDecimal getCD411LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD411LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD411a.
		@param CD411a CD411a	  */
	public void setCD411a (BigDecimal CD411a)
	{
		set_Value (COLUMNNAME_CD411a, CD411a);
	}

	/** Get CD411a.
		@return CD411a	  */
	public BigDecimal getCD411a () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD411a);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD411aLY.
		@param CD411aLY CD411aLY	  */
	public void setCD411aLY (BigDecimal CD411aLY)
	{
		set_Value (COLUMNNAME_CD411aLY, CD411aLY);
	}

	/** Get CD411aLY.
		@return CD411aLY	  */
	public BigDecimal getCD411aLY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD411aLY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD411b.
		@param CD411b CD411b	  */
	public void setCD411b (BigDecimal CD411b)
	{
		set_Value (COLUMNNAME_CD411b, CD411b);
	}

	/** Get CD411b.
		@return CD411b	  */
	public BigDecimal getCD411b () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD411b);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD411bLY.
		@param CD411bLY CD411bLY	  */
	public void setCD411bLY (BigDecimal CD411bLY)
	{
		set_Value (COLUMNNAME_CD411bLY, CD411bLY);
	}

	/** Get CD411bLY.
		@return CD411bLY	  */
	public BigDecimal getCD411bLY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD411bLY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD412.
		@param CD412 CD412	  */
	public void setCD412 (BigDecimal CD412)
	{
		set_Value (COLUMNNAME_CD412, CD412);
	}

	/** Get CD412.
		@return CD412	  */
	public BigDecimal getCD412 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD412);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD412LY.
		@param CD412LY CD412LY	  */
	public void setCD412LY (BigDecimal CD412LY)
	{
		set_Value (COLUMNNAME_CD412LY, CD412LY);
	}

	/** Get CD412LY.
		@return CD412LY	  */
	public BigDecimal getCD412LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD412LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD413.
		@param CD413 CD413	  */
	public void setCD413 (BigDecimal CD413)
	{
		set_Value (COLUMNNAME_CD413, CD413);
	}

	/** Get CD413.
		@return CD413	  */
	public BigDecimal getCD413 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD413);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD413LY.
		@param CD413LY CD413LY	  */
	public void setCD413LY (BigDecimal CD413LY)
	{
		set_Value (COLUMNNAME_CD413LY, CD413LY);
	}

	/** Get CD413LY.
		@return CD413LY	  */
	public BigDecimal getCD413LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD413LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD414.
		@param CD414 CD414	  */
	public void setCD414 (BigDecimal CD414)
	{
		set_Value (COLUMNNAME_CD414, CD414);
	}

	/** Get CD414.
		@return CD414	  */
	public BigDecimal getCD414 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD414);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD414LY.
		@param CD414LY CD414LY	  */
	public void setCD414LY (BigDecimal CD414LY)
	{
		set_Value (COLUMNNAME_CD414LY, CD414LY);
	}

	/** Get CD414LY.
		@return CD414LY	  */
	public BigDecimal getCD414LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD414LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD415.
		@param CD415 CD415	  */
	public void setCD415 (BigDecimal CD415)
	{
		set_Value (COLUMNNAME_CD415, CD415);
	}

	/** Get CD415.
		@return CD415	  */
	public BigDecimal getCD415 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD415);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD415LY.
		@param CD415LY CD415LY	  */
	public void setCD415LY (BigDecimal CD415LY)
	{
		set_Value (COLUMNNAME_CD415LY, CD415LY);
	}

	/** Get CD415LY.
		@return CD415LY	  */
	public BigDecimal getCD415LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD415LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD416.
		@param CD416 CD416	  */
	public void setCD416 (BigDecimal CD416)
	{
		set_Value (COLUMNNAME_CD416, CD416);
	}

	/** Get CD416.
		@return CD416	  */
	public BigDecimal getCD416 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD416);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD416LY.
		@param CD416LY CD416LY	  */
	public void setCD416LY (BigDecimal CD416LY)
	{
		set_Value (COLUMNNAME_CD416LY, CD416LY);
	}

	/** Get CD416LY.
		@return CD416LY	  */
	public BigDecimal getCD416LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD416LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD417.
		@param CD417 CD417	  */
	public void setCD417 (BigDecimal CD417)
	{
		set_Value (COLUMNNAME_CD417, CD417);
	}

	/** Get CD417.
		@return CD417	  */
	public BigDecimal getCD417 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD417);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD417LY.
		@param CD417LY CD417LY	  */
	public void setCD417LY (BigDecimal CD417LY)
	{
		set_Value (COLUMNNAME_CD417LY, CD417LY);
	}

	/** Get CD417LY.
		@return CD417LY	  */
	public BigDecimal getCD417LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD417LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD418.
		@param CD418 CD418	  */
	public void setCD418 (BigDecimal CD418)
	{
		set_Value (COLUMNNAME_CD418, CD418);
	}

	/** Get CD418.
		@return CD418	  */
	public BigDecimal getCD418 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD418);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD418LY.
		@param CD418LY CD418LY	  */
	public void setCD418LY (BigDecimal CD418LY)
	{
		set_Value (COLUMNNAME_CD418LY, CD418LY);
	}

	/** Get CD418LY.
		@return CD418LY	  */
	public BigDecimal getCD418LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD418LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD419.
		@param CD419 CD419	  */
	public void setCD419 (BigDecimal CD419)
	{
		set_Value (COLUMNNAME_CD419, CD419);
	}

	/** Get CD419.
		@return CD419	  */
	public BigDecimal getCD419 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD419);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD419LY.
		@param CD419LY CD419LY	  */
	public void setCD419LY (BigDecimal CD419LY)
	{
		set_Value (COLUMNNAME_CD419LY, CD419LY);
	}

	/** Get CD419LY.
		@return CD419LY	  */
	public BigDecimal getCD419LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD419LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD420.
		@param CD420 CD420	  */
	public void setCD420 (BigDecimal CD420)
	{
		set_Value (COLUMNNAME_CD420, CD420);
	}

	/** Get CD420.
		@return CD420	  */
	public BigDecimal getCD420 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD420);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD420LY.
		@param CD420LY CD420LY	  */
	public void setCD420LY (BigDecimal CD420LY)
	{
		set_Value (COLUMNNAME_CD420LY, CD420LY);
	}

	/** Get CD420LY.
		@return CD420LY	  */
	public BigDecimal getCD420LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD420LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD421.
		@param CD421 CD421	  */
	public void setCD421 (BigDecimal CD421)
	{
		set_Value (COLUMNNAME_CD421, CD421);
	}

	/** Get CD421.
		@return CD421	  */
	public BigDecimal getCD421 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD421);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD421LY.
		@param CD421LY CD421LY	  */
	public void setCD421LY (BigDecimal CD421LY)
	{
		set_Value (COLUMNNAME_CD421LY, CD421LY);
	}

	/** Get CD421LY.
		@return CD421LY	  */
	public BigDecimal getCD421LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD421LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD421a.
		@param CD421a CD421a	  */
	public void setCD421a (BigDecimal CD421a)
	{
		set_Value (COLUMNNAME_CD421a, CD421a);
	}

	/** Get CD421a.
		@return CD421a	  */
	public BigDecimal getCD421a () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD421a);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD421aLY.
		@param CD421aLY CD421aLY	  */
	public void setCD421aLY (BigDecimal CD421aLY)
	{
		set_Value (COLUMNNAME_CD421aLY, CD421aLY);
	}

	/** Get CD421aLY.
		@return CD421aLY	  */
	public BigDecimal getCD421aLY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD421aLY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD421b.
		@param CD421b CD421b	  */
	public void setCD421b (BigDecimal CD421b)
	{
		set_Value (COLUMNNAME_CD421b, CD421b);
	}

	/** Get CD421b.
		@return CD421b	  */
	public BigDecimal getCD421b () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD421b);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD421bLY.
		@param CD421bLY CD421bLY	  */
	public void setCD421bLY (BigDecimal CD421bLY)
	{
		set_Value (COLUMNNAME_CD421bLY, CD421bLY);
	}

	/** Get CD421bLY.
		@return CD421bLY	  */
	public BigDecimal getCD421bLY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD421bLY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD422.
		@param CD422 CD422	  */
	public void setCD422 (BigDecimal CD422)
	{
		set_Value (COLUMNNAME_CD422, CD422);
	}

	/** Get CD422.
		@return CD422	  */
	public BigDecimal getCD422 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD422);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD422LY.
		@param CD422LY CD422LY	  */
	public void setCD422LY (BigDecimal CD422LY)
	{
		set_Value (COLUMNNAME_CD422LY, CD422LY);
	}

	/** Get CD422LY.
		@return CD422LY	  */
	public BigDecimal getCD422LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD422LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD429.
		@param CD429 CD429	  */
	public void setCD429 (BigDecimal CD429)
	{
		set_Value (COLUMNNAME_CD429, CD429);
	}

	/** Get CD429.
		@return CD429	  */
	public BigDecimal getCD429 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD429);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD429LY.
		@param CD429LY CD429LY	  */
	public void setCD429LY (BigDecimal CD429LY)
	{
		set_Value (COLUMNNAME_CD429LY, CD429LY);
	}

	/** Get CD429LY.
		@return CD429LY	  */
	public BigDecimal getCD429LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD429LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD430.
		@param CD430 CD430	  */
	public void setCD430 (BigDecimal CD430)
	{
		set_Value (COLUMNNAME_CD430, CD430);
	}

	/** Get CD430.
		@return CD430	  */
	public BigDecimal getCD430 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD430);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD430LY.
		@param CD430LY CD430LY	  */
	public void setCD430LY (BigDecimal CD430LY)
	{
		set_Value (COLUMNNAME_CD430LY, CD430LY);
	}

	/** Get CD430LY.
		@return CD430LY	  */
	public BigDecimal getCD430LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD430LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD431.
		@param CD431 CD431	  */
	public void setCD431 (BigDecimal CD431)
	{
		set_Value (COLUMNNAME_CD431, CD431);
	}

	/** Get CD431.
		@return CD431	  */
	public BigDecimal getCD431 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD431);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD431LY.
		@param CD431LY CD431LY	  */
	public void setCD431LY (BigDecimal CD431LY)
	{
		set_Value (COLUMNNAME_CD431LY, CD431LY);
	}

	/** Get CD431LY.
		@return CD431LY	  */
	public BigDecimal getCD431LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD431LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD432.
		@param CD432 CD432	  */
	public void setCD432 (BigDecimal CD432)
	{
		set_Value (COLUMNNAME_CD432, CD432);
	}

	/** Get CD432.
		@return CD432	  */
	public BigDecimal getCD432 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD432);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD432LY.
		@param CD432LY CD432LY	  */
	public void setCD432LY (BigDecimal CD432LY)
	{
		set_Value (COLUMNNAME_CD432LY, CD432LY);
	}

	/** Get CD432LY.
		@return CD432LY	  */
	public BigDecimal getCD432LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD432LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD440.
		@param CD440 CD440	  */
	public void setCD440 (BigDecimal CD440)
	{
		set_Value (COLUMNNAME_CD440, CD440);
	}

	/** Get CD440.
		@return CD440	  */
	public BigDecimal getCD440 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD440);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CD440LY.
		@param CD440LY CD440LY	  */
	public void setCD440LY (BigDecimal CD440LY)
	{
		set_Value (COLUMNNAME_CD440LY, CD440LY);
	}

	/** Get CD440LY.
		@return CD440LY	  */
	public BigDecimal getCD440LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CD440LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Check_Hand_Input.
		@param Check_Hand_Input Check_Hand_Input	  */
	public void setCheck_Hand_Input (boolean Check_Hand_Input)
	{
		set_Value (COLUMNNAME_Check_Hand_Input, Boolean.valueOf(Check_Hand_Input));
	}

	/** Get Check_Hand_Input.
		@return Check_Hand_Input	  */
	public boolean isCheck_Hand_Input () 
	{
		Object oo = get_Value(COLUMNNAME_Check_Hand_Input);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Check_Upload_Excel.
		@param Check_Upload_Excel Check_Upload_Excel	  */
	public void setCheck_Upload_Excel (boolean Check_Upload_Excel)
	{
		set_Value (COLUMNNAME_Check_Upload_Excel, Boolean.valueOf(Check_Upload_Excel));
	}

	/** Get Check_Upload_Excel.
		@return Check_Upload_Excel	  */
	public boolean isCheck_Upload_Excel () 
	{
		Object oo = get_Value(COLUMNNAME_Check_Upload_Excel);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set KQ01.
		@param KQ01 KQ01	  */
	public void setKQ01 (BigDecimal KQ01)
	{
		set_Value (COLUMNNAME_KQ01, KQ01);
	}

	/** Get KQ01.
		@return KQ01	  */
	public BigDecimal getKQ01 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ01);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ01LY.
		@param KQ01LY KQ01LY	  */
	public void setKQ01LY (BigDecimal KQ01LY)
	{
		set_Value (COLUMNNAME_KQ01LY, KQ01LY);
	}

	/** Get KQ01LY.
		@return KQ01LY	  */
	public BigDecimal getKQ01LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ01LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ02.
		@param KQ02 KQ02	  */
	public void setKQ02 (BigDecimal KQ02)
	{
		set_Value (COLUMNNAME_KQ02, KQ02);
	}

	/** Get KQ02.
		@return KQ02	  */
	public BigDecimal getKQ02 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ02);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ02LY.
		@param KQ02LY KQ02LY	  */
	public void setKQ02LY (BigDecimal KQ02LY)
	{
		set_Value (COLUMNNAME_KQ02LY, KQ02LY);
	}

	/** Get KQ02LY.
		@return KQ02LY	  */
	public BigDecimal getKQ02LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ02LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ10.
		@param KQ10 KQ10	  */
	public void setKQ10 (BigDecimal KQ10)
	{
		set_Value (COLUMNNAME_KQ10, KQ10);
	}

	/** Get KQ10.
		@return KQ10	  */
	public BigDecimal getKQ10 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ10);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ10LY.
		@param KQ10LY KQ10LY	  */
	public void setKQ10LY (BigDecimal KQ10LY)
	{
		set_Value (COLUMNNAME_KQ10LY, KQ10LY);
	}

	/** Get KQ10LY.
		@return KQ10LY	  */
	public BigDecimal getKQ10LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ10LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ11.
		@param KQ11 KQ11	  */
	public void setKQ11 (BigDecimal KQ11)
	{
		set_Value (COLUMNNAME_KQ11, KQ11);
	}

	/** Get KQ11.
		@return KQ11	  */
	public BigDecimal getKQ11 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ11);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ11LY.
		@param KQ11LY KQ11LY	  */
	public void setKQ11LY (BigDecimal KQ11LY)
	{
		set_Value (COLUMNNAME_KQ11LY, KQ11LY);
	}

	/** Get KQ11LY.
		@return KQ11LY	  */
	public BigDecimal getKQ11LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ11LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ20.
		@param KQ20 KQ20	  */
	public void setKQ20 (BigDecimal KQ20)
	{
		set_Value (COLUMNNAME_KQ20, KQ20);
	}

	/** Get KQ20.
		@return KQ20	  */
	public BigDecimal getKQ20 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ20);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ20LY.
		@param KQ20LY KQ20LY	  */
	public void setKQ20LY (BigDecimal KQ20LY)
	{
		set_Value (COLUMNNAME_KQ20LY, KQ20LY);
	}

	/** Get KQ20LY.
		@return KQ20LY	  */
	public BigDecimal getKQ20LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ20LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ21.
		@param KQ21 KQ21	  */
	public void setKQ21 (BigDecimal KQ21)
	{
		set_Value (COLUMNNAME_KQ21, KQ21);
	}

	/** Get KQ21.
		@return KQ21	  */
	public BigDecimal getKQ21 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ21);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ21LY.
		@param KQ21LY KQ21LY	  */
	public void setKQ21LY (BigDecimal KQ21LY)
	{
		set_Value (COLUMNNAME_KQ21LY, KQ21LY);
	}

	/** Get KQ21LY.
		@return KQ21LY	  */
	public BigDecimal getKQ21LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ21LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ22.
		@param KQ22 KQ22	  */
	public void setKQ22 (BigDecimal KQ22)
	{
		set_Value (COLUMNNAME_KQ22, KQ22);
	}

	/** Get KQ22.
		@return KQ22	  */
	public BigDecimal getKQ22 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ22);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ22LY.
		@param KQ22LY KQ22LY	  */
	public void setKQ22LY (BigDecimal KQ22LY)
	{
		set_Value (COLUMNNAME_KQ22LY, KQ22LY);
	}

	/** Get KQ22LY.
		@return KQ22LY	  */
	public BigDecimal getKQ22LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ22LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ23.
		@param KQ23 KQ23	  */
	public void setKQ23 (BigDecimal KQ23)
	{
		set_Value (COLUMNNAME_KQ23, KQ23);
	}

	/** Get KQ23.
		@return KQ23	  */
	public BigDecimal getKQ23 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ23);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ23LY.
		@param KQ23LY KQ23LY	  */
	public void setKQ23LY (BigDecimal KQ23LY)
	{
		set_Value (COLUMNNAME_KQ23LY, KQ23LY);
	}

	/** Get KQ23LY.
		@return KQ23LY	  */
	public BigDecimal getKQ23LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ23LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ24.
		@param KQ24 KQ24	  */
	public void setKQ24 (BigDecimal KQ24)
	{
		set_Value (COLUMNNAME_KQ24, KQ24);
	}

	/** Get KQ24.
		@return KQ24	  */
	public BigDecimal getKQ24 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ24);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ24LY.
		@param KQ24LY KQ24LY	  */
	public void setKQ24LY (BigDecimal KQ24LY)
	{
		set_Value (COLUMNNAME_KQ24LY, KQ24LY);
	}

	/** Get KQ24LY.
		@return KQ24LY	  */
	public BigDecimal getKQ24LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ24LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ25.
		@param KQ25 KQ25	  */
	public void setKQ25 (BigDecimal KQ25)
	{
		set_Value (COLUMNNAME_KQ25, KQ25);
	}

	/** Get KQ25.
		@return KQ25	  */
	public BigDecimal getKQ25 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ25);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ25LY.
		@param KQ25LY KQ25LY	  */
	public void setKQ25LY (BigDecimal KQ25LY)
	{
		set_Value (COLUMNNAME_KQ25LY, KQ25LY);
	}

	/** Get KQ25LY.
		@return KQ25LY	  */
	public BigDecimal getKQ25LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ25LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ26.
		@param KQ26 KQ26	  */
	public void setKQ26 (BigDecimal KQ26)
	{
		set_Value (COLUMNNAME_KQ26, KQ26);
	}

	/** Get KQ26.
		@return KQ26	  */
	public BigDecimal getKQ26 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ26);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ26LY.
		@param KQ26LY KQ26LY	  */
	public void setKQ26LY (BigDecimal KQ26LY)
	{
		set_Value (COLUMNNAME_KQ26LY, KQ26LY);
	}

	/** Get KQ26LY.
		@return KQ26LY	  */
	public BigDecimal getKQ26LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ26LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ30.
		@param KQ30 KQ30	  */
	public void setKQ30 (BigDecimal KQ30)
	{
		set_Value (COLUMNNAME_KQ30, KQ30);
	}

	/** Get KQ30.
		@return KQ30	  */
	public BigDecimal getKQ30 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ30);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ30LY.
		@param KQ30LY KQ30LY	  */
	public void setKQ30LY (BigDecimal KQ30LY)
	{
		set_Value (COLUMNNAME_KQ30LY, KQ30LY);
	}

	/** Get KQ30LY.
		@return KQ30LY	  */
	public BigDecimal getKQ30LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ30LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ31.
		@param KQ31 KQ31	  */
	public void setKQ31 (BigDecimal KQ31)
	{
		set_Value (COLUMNNAME_KQ31, KQ31);
	}

	/** Get KQ31.
		@return KQ31	  */
	public BigDecimal getKQ31 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ31);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ31LY.
		@param KQ31LY KQ31LY	  */
	public void setKQ31LY (BigDecimal KQ31LY)
	{
		set_Value (COLUMNNAME_KQ31LY, KQ31LY);
	}

	/** Get KQ31LY.
		@return KQ31LY	  */
	public BigDecimal getKQ31LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ31LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ32.
		@param KQ32 KQ32	  */
	public void setKQ32 (BigDecimal KQ32)
	{
		set_Value (COLUMNNAME_KQ32, KQ32);
	}

	/** Get KQ32.
		@return KQ32	  */
	public BigDecimal getKQ32 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ32);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ32LY.
		@param KQ32LY KQ32LY	  */
	public void setKQ32LY (BigDecimal KQ32LY)
	{
		set_Value (COLUMNNAME_KQ32LY, KQ32LY);
	}

	/** Get KQ32LY.
		@return KQ32LY	  */
	public BigDecimal getKQ32LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ32LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ40.
		@param KQ40 KQ40	  */
	public void setKQ40 (BigDecimal KQ40)
	{
		set_Value (COLUMNNAME_KQ40, KQ40);
	}

	/** Get KQ40.
		@return KQ40	  */
	public BigDecimal getKQ40 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ40);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ40LY.
		@param KQ40LY KQ40LY	  */
	public void setKQ40LY (BigDecimal KQ40LY)
	{
		set_Value (COLUMNNAME_KQ40LY, KQ40LY);
	}

	/** Get KQ40LY.
		@return KQ40LY	  */
	public BigDecimal getKQ40LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ40LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ50.
		@param KQ50 KQ50	  */
	public void setKQ50 (BigDecimal KQ50)
	{
		set_Value (COLUMNNAME_KQ50, KQ50);
	}

	/** Get KQ50.
		@return KQ50	  */
	public BigDecimal getKQ50 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ50);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ50LY.
		@param KQ50LY KQ50LY	  */
	public void setKQ50LY (BigDecimal KQ50LY)
	{
		set_Value (COLUMNNAME_KQ50LY, KQ50LY);
	}

	/** Get KQ50LY.
		@return KQ50LY	  */
	public BigDecimal getKQ50LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ50LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ51.
		@param KQ51 KQ51	  */
	public void setKQ51 (BigDecimal KQ51)
	{
		set_Value (COLUMNNAME_KQ51, KQ51);
	}

	/** Get KQ51.
		@return KQ51	  */
	public BigDecimal getKQ51 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ51);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ51LY.
		@param KQ51LY KQ51LY	  */
	public void setKQ51LY (BigDecimal KQ51LY)
	{
		set_Value (COLUMNNAME_KQ51LY, KQ51LY);
	}

	/** Get KQ51LY.
		@return KQ51LY	  */
	public BigDecimal getKQ51LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ51LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ52.
		@param KQ52 KQ52	  */
	public void setKQ52 (BigDecimal KQ52)
	{
		set_Value (COLUMNNAME_KQ52, KQ52);
	}

	/** Get KQ52.
		@return KQ52	  */
	public BigDecimal getKQ52 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ52);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ52LY.
		@param KQ52LY KQ52LY	  */
	public void setKQ52LY (BigDecimal KQ52LY)
	{
		set_Value (COLUMNNAME_KQ52LY, KQ52LY);
	}

	/** Get KQ52LY.
		@return KQ52LY	  */
	public BigDecimal getKQ52LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ52LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ60.
		@param KQ60 KQ60	  */
	public void setKQ60 (BigDecimal KQ60)
	{
		set_Value (COLUMNNAME_KQ60, KQ60);
	}

	/** Get KQ60.
		@return KQ60	  */
	public BigDecimal getKQ60 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ60);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ60LY.
		@param KQ60LY KQ60LY	  */
	public void setKQ60LY (BigDecimal KQ60LY)
	{
		set_Value (COLUMNNAME_KQ60LY, KQ60LY);
	}

	/** Get KQ60LY.
		@return KQ60LY	  */
	public BigDecimal getKQ60LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ60LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ61.
		@param KQ61 KQ61	  */
	public void setKQ61 (BigDecimal KQ61)
	{
		set_Value (COLUMNNAME_KQ61, KQ61);
	}

	/** Get KQ61.
		@return KQ61	  */
	public BigDecimal getKQ61 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ61);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ61LY.
		@param KQ61LY KQ61LY	  */
	public void setKQ61LY (BigDecimal KQ61LY)
	{
		set_Value (COLUMNNAME_KQ61LY, KQ61LY);
	}

	/** Get KQ61LY.
		@return KQ61LY	  */
	public BigDecimal getKQ61LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ61LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ62.
		@param KQ62 KQ62	  */
	public void setKQ62 (BigDecimal KQ62)
	{
		set_Value (COLUMNNAME_KQ62, KQ62);
	}

	/** Get KQ62.
		@return KQ62	  */
	public BigDecimal getKQ62 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ62);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ62LY.
		@param KQ62LY KQ62LY	  */
	public void setKQ62LY (BigDecimal KQ62LY)
	{
		set_Value (COLUMNNAME_KQ62LY, KQ62LY);
	}

	/** Get KQ62LY.
		@return KQ62LY	  */
	public BigDecimal getKQ62LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ62LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ70.
		@param KQ70 KQ70	  */
	public void setKQ70 (BigDecimal KQ70)
	{
		set_Value (COLUMNNAME_KQ70, KQ70);
	}

	/** Get KQ70.
		@return KQ70	  */
	public BigDecimal getKQ70 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ70);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ70LY.
		@param KQ70LY KQ70LY	  */
	public void setKQ70LY (BigDecimal KQ70LY)
	{
		set_Value (COLUMNNAME_KQ70LY, KQ70LY);
	}

	/** Get KQ70LY.
		@return KQ70LY	  */
	public BigDecimal getKQ70LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ70LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ71.
		@param KQ71 KQ71	  */
	public void setKQ71 (BigDecimal KQ71)
	{
		set_Value (COLUMNNAME_KQ71, KQ71);
	}

	/** Get KQ71.
		@return KQ71	  */
	public BigDecimal getKQ71 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ71);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set KQ71LY.
		@param KQ71LY KQ71LY	  */
	public void setKQ71LY (BigDecimal KQ71LY)
	{
		set_Value (COLUMNNAME_KQ71LY, KQ71LY);
	}

	/** Get KQ71LY.
		@return KQ71LY	  */
	public BigDecimal getKQ71LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_KQ71LY);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LTC_20.
		@param LTC_20 LTC_20	  */
	public void setLTC_20 (BigDecimal LTC_20)
	{
		set_Value (COLUMNNAME_LTC_20, LTC_20);
	}

	/** Get LTC_20.
		@return LTC_20	  */
	public BigDecimal getLTC_20 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LTC_20);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set LTC_20LY.
		@param LTC_20LY LTC_20LY	  */
	public void setLTC_20LY (BigDecimal LTC_20LY)
	{
		set_Value (COLUMNNAME_LTC_20LY, LTC_20LY);
	}

	/** Get LTC_20LY.
		@return LTC_20LY	  */
	public BigDecimal getLTC_20LY () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LTC_20LY);
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

	/** Set TDAB_Financial_Info.
		@param TDAB_Financial_Info_ID TDAB_Financial_Info	  */
	public void setTDAB_Financial_Info_ID (int TDAB_Financial_Info_ID)
	{
		if (TDAB_Financial_Info_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_Info_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Financial_Info_ID, Integer.valueOf(TDAB_Financial_Info_ID));
	}

	/** Get TDAB_Financial_Info.
		@return TDAB_Financial_Info	  */
	public int getTDAB_Financial_Info_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Financial_Info_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Financial_Info_UU.
		@param TDAB_Financial_Info_UU TDAB_Financial_Info_UU	  */
	public void setTDAB_Financial_Info_UU (String TDAB_Financial_Info_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Financial_Info_UU, TDAB_Financial_Info_UU);
	}

	/** Get TDAB_Financial_Info_UU.
		@return TDAB_Financial_Info_UU	  */
	public String getTDAB_Financial_Info_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Financial_Info_UU);
	}

	/** Set Year_Report.
		@param Year_Report 
		Năm báo cáo tài chính
	  */
	public void setYear_Report (String Year_Report)
	{
		set_Value (COLUMNNAME_Year_Report, Year_Report);
	}

	/** Get Year_Report.
		@return Năm báo cáo tài chính
	  */
	public String getYear_Report () 
	{
		return (String)get_Value(COLUMNNAME_Year_Report);
	}

	/** Set Year_Report_Ly.
		@param Year_Report_Ly 
		Năm trước năm báo cáo tài chính
	  */
	public void setYear_Report_Ly (String Year_Report_Ly)
	{
		set_Value (COLUMNNAME_Year_Report_Ly, Year_Report_Ly);
	}

	/** Get Year_Report_Ly.
		@return Năm trước năm báo cáo tài chính
	  */
	public String getYear_Report_Ly () 
	{
		return (String)get_Value(COLUMNNAME_Year_Report_Ly);
	}
}