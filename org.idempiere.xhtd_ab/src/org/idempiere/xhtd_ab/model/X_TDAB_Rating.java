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

/** Generated Model for TDAB_Rating
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Rating extends PO implements I_TDAB_Rating, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210317L;

    /** Standard Constructor */
    public X_TDAB_Rating (Properties ctx, int TDAB_Rating_ID, String trxName)
    {
      super (ctx, TDAB_Rating_ID, trxName);
      /** if (TDAB_Rating_ID == 0)
        {
			setTDAB_Rating_ID (0);
			setTDAB_Rating_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Rating (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Rating[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set DateScore.
		@param DateScore DateScore	  */
	public void setDateScore (Timestamp DateScore)
	{
		set_Value (COLUMNNAME_DateScore, DateScore);
	}

	/** Get DateScore.
		@return DateScore	  */
	public Timestamp getDateScore () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateScore);
	}

	/** Set Date_Approved.
		@param Date_Approved Date_Approved	  */
	public void setDate_Approved (Timestamp Date_Approved)
	{
		set_Value (COLUMNNAME_Date_Approved, Date_Approved);
	}

	/** Get Date_Approved.
		@return Date_Approved	  */
	public Timestamp getDate_Approved () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Approved);
	}

	/** Set Role_ID.
		@param Role_ID Role_ID	  */
	public void setRole_ID (String Role_ID)
	{
		set_Value (COLUMNNAME_Role_ID, Role_ID);
	}

	/** Get Role_ID.
		@return Role_ID	  */
	public String getRole_ID () 
	{
		return (String)get_Value(COLUMNNAME_Role_ID);
	}

	/** K = K */
	public static final String STATUS_CHECK_K = "K";
	/** HD = HD */
	public static final String STATUS_CHECK_HD = "HD";
	/** CD = CD */
	public static final String STATUS_CHECK_CD = "CD";
	/** TC = TC */
	public static final String STATUS_CHECK_TC = "TC";
	/** KT = KT */
	public static final String STATUS_CHECK_KT = "KT";
	/** Set Status_Check.
		@param Status_Check Status_Check	  */
	public void setStatus_Check (String Status_Check)
	{

		set_Value (COLUMNNAME_Status_Check, Status_Check);
	}

	/** Get Status_Check.
		@return Status_Check	  */
	public String getStatus_Check () 
	{
		return (String)get_Value(COLUMNNAME_Status_Check);
	}

	/** Set TDAB_Rating.
		@param TDAB_Rating_ID TDAB_Rating	  */
	public void setTDAB_Rating_ID (int TDAB_Rating_ID)
	{
		if (TDAB_Rating_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TDAB_Rating_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TDAB_Rating_ID, Integer.valueOf(TDAB_Rating_ID));
	}

	/** Get TDAB_Rating.
		@return TDAB_Rating	  */
	public int getTDAB_Rating_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TDAB_Rating_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TDAB_Rating_UU.
		@param TDAB_Rating_UU TDAB_Rating_UU	  */
	public void setTDAB_Rating_UU (String TDAB_Rating_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Rating_UU, TDAB_Rating_UU);
	}

	/** Get TDAB_Rating_UU.
		@return TDAB_Rating_UU	  */
	public String getTDAB_Rating_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Rating_UU);
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

	/** Set Version.
		@param Version 
		Version of the table definition
	  */
	public void setVersion (BigDecimal Version)
	{
		set_Value (COLUMNNAME_Version, Version);
	}

	/** Get Version.
		@return Version of the table definition
	  */
	public BigDecimal getVersion () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Version);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set approval.
		@param approval approval	  */
	public void setapproval (String approval)
	{
		set_Value (COLUMNNAME_approval, approval);
	}

	/** Get approval.
		@return approval	  */
	public String getapproval () 
	{
		return (String)get_Value(COLUMNNAME_approval);
	}

	/** Set refuse.
		@param refuse refuse	  */
	public void setrefuse (String refuse)
	{
		set_Value (COLUMNNAME_refuse, refuse);
	}

	/** Get refuse.
		@return refuse	  */
	public String getrefuse () 
	{
		return (String)get_Value(COLUMNNAME_refuse);
	}

	/** Set submit.
		@param submit submit	  */
	public void setsubmit (String submit)
	{
		set_Value (COLUMNNAME_submit, submit);
	}

	/** Get submit.
		@return submit	  */
	public String getsubmit () 
	{
		return (String)get_Value(COLUMNNAME_submit);
	}
}