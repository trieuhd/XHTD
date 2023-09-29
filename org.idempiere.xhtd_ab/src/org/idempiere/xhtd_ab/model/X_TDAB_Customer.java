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

/** Generated Model for TDAB_Customer
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Customer extends PO implements I_TDAB_Customer, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210411L;

    /** Standard Constructor */
    public X_TDAB_Customer (Properties ctx, int TDAB_Customer_ID, String trxName)
    {
      super (ctx, TDAB_Customer_ID, trxName);
      /** if (TDAB_Customer_ID == 0)
        {
			setCIC_ID (null);
			setCompanyName (null);
			setName (null);
			setNumberBusiness (null);
			setRevenue (Env.ZERO);
			setTDAB_Customer_ID (0);
			setTDAB_Customer_UU (null);
			setTaxCode (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Customer (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Customer[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set ActionChangeUser.
		@param ActionChangeUser ActionChangeUser	  */
	public void setActionChangeUser (String ActionChangeUser)
	{
		set_Value (COLUMNNAME_ActionChangeUser, ActionChangeUser);
	}

	/** Get ActionChangeUser.
		@return ActionChangeUser	  */
	public String getActionChangeUser () 
	{
		return (String)get_Value(COLUMNNAME_ActionChangeUser);
	}

	/** Set ActionUpdate.
		@param ActionUpdate ActionUpdate	  */
	public void setActionUpdate (String ActionUpdate)
	{
		set_Value (COLUMNNAME_ActionUpdate, ActionUpdate);
	}

	/** Get ActionUpdate.
		@return ActionUpdate	  */
	public String getActionUpdate () 
	{
		return (String)get_Value(COLUMNNAME_ActionUpdate);
	}

	/** Set Business_Unit.
		@param Business_Unit Business_Unit	  */
	public void setBusiness_Unit (String Business_Unit)
	{
		set_Value (COLUMNNAME_Business_Unit, Business_Unit);
	}

	/** Get Business_Unit.
		@return Business_Unit	  */
	public String getBusiness_Unit () 
	{
		return (String)get_Value(COLUMNNAME_Business_Unit);
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

	/** Set Check_T24.
		@param Check_T24 
		Check_T24
	  */
	public void setCheck_T24 (String Check_T24)
	{
		set_Value (COLUMNNAME_Check_T24, Check_T24);
	}

	/** Get Check_T24.
		@return Check_T24
	  */
	public String getCheck_T24 () 
	{
		return (String)get_Value(COLUMNNAME_Check_T24);
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

	/** Set New.
		@param New New	  */
	public void setNew (String New)
	{
		set_Value (COLUMNNAME_New, New);
	}

	/** Get New.
		@return New	  */
	public String getNew () 
	{
		return (String)get_Value(COLUMNNAME_New);
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

	/** Set Note_HandOver.
		@param Note_HandOver Note_HandOver	  */
	public void setNote_HandOver (String Note_HandOver)
	{
		set_Value (COLUMNNAME_Note_HandOver, Note_HandOver);
	}

	/** Get Note_HandOver.
		@return Note_HandOver	  */
	public String getNote_HandOver () 
	{
		return (String)get_Value(COLUMNNAME_Note_HandOver);
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

	/** HD = HD */
	public static final String STATUS_HD = "HD";
	/** K = K */
	public static final String STATUS_K = "K";
	/** KT = KT */
	public static final String STATUS_KT = "KT";
	/** Set Status.
		@param Status 
		Status of the currently running check
	  */
	public void setStatus (String Status)
	{

		set_Value (COLUMNNAME_Status, Status);
	}

	/** Get Status.
		@return Status of the currently running check
	  */
	public String getStatus () 
	{
		return (String)get_Value(COLUMNNAME_Status);
	}

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

	/** Set TDAB_Customer_UU.
		@param TDAB_Customer_UU TDAB_Customer_UU	  */
	public void setTDAB_Customer_UU (String TDAB_Customer_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Customer_UU, TDAB_Customer_UU);
	}

	/** Get TDAB_Customer_UU.
		@return TDAB_Customer_UU	  */
	public String getTDAB_Customer_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Customer_UU);
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

	/** Set UnLockProfile.
		@param UnLockProfile UnLockProfile	  */
	public void setUnLockProfile (String UnLockProfile)
	{
		set_Value (COLUMNNAME_UnLockProfile, UnLockProfile);
	}

	/** Get UnLockProfile.
		@return UnLockProfile	  */
	public String getUnLockProfile () 
	{
		return (String)get_Value(COLUMNNAME_UnLockProfile);
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