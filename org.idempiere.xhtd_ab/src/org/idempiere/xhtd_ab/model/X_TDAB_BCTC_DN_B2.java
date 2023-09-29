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

/** Generated Model for TDAB_BCTC_DN_B2
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_BCTC_DN_B2 extends PO implements I_TDAB_BCTC_DN_B2, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210130L;

    /** Standard Constructor */
    public X_TDAB_BCTC_DN_B2 (Properties ctx, int TDAB_BCTC_DN_B2_ID, String trxName)
    {
      super (ctx, TDAB_BCTC_DN_B2_ID, trxName);
      /** if (TDAB_BCTC_DN_B2_ID == 0)
        {
			setTDAB_BCTC_DN_B2_ID (0);
			setTDAB_BCTC_DN_B2_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_BCTC_DN_B2 (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_BCTC_DN_B2[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set TDAB_BCTC_DN_B2_ID.
		@param TDAB_BCTC_DN_B2_ID TDAB_BCTC_DN_B2_ID	  */
	public void setTDAB_BCTC_DN_B2_ID (int TDAB_BCTC_DN_B2_ID)
	{
		if (TDAB_BCTC_DN_B2_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_DN_B2_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_DN_B2_ID, Integer.valueOf(TDAB_BCTC_DN_B2_ID));
	}

	/** Get TDAB_BCTC_DN_B2_ID.
		@return TDAB_BCTC_DN_B2_ID	  */
	public int getTDAB_BCTC_DN_B2_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_BCTC_DN_B2_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_BCTC_DN_B2_UU.
		@param TDAB_BCTC_DN_B2_UU TDAB_BCTC_DN_B2_UU	  */
	public void setTDAB_BCTC_DN_B2_UU (String TDAB_BCTC_DN_B2_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_BCTC_DN_B2_UU, TDAB_BCTC_DN_B2_UU);
	}

	/** Get TDAB_BCTC_DN_B2_UU.
		@return TDAB_BCTC_DN_B2_UU	  */
	public String getTDAB_BCTC_DN_B2_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_BCTC_DN_B2_UU);
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
}