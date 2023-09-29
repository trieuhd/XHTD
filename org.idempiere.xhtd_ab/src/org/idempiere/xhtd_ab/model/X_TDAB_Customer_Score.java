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

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for TDAB_Customer_Score
 *  @author iDempiere (generated) 
 *  @version Release 6.2 - $Id$ */
public class X_TDAB_Customer_Score extends PO implements I_TDAB_Customer_Score, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210112L;

    /** Standard Constructor */
    public X_TDAB_Customer_Score (Properties ctx, int TDAB_Customer_Score_ID, String trxName)
    {
      super (ctx, TDAB_Customer_Score_ID, trxName);
      /** if (TDAB_Customer_Score_ID == 0)
        {
			setTDAB_Customer_Score_ID (0);
			setTDAB_Customer_Score_UU (null);
        } */
    }

    /** Load Constructor */
    public X_TDAB_Customer_Score (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_TDAB_Customer_Score[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set ActionDel.
		@param ActionDel ActionDel	  */
	public void setActionDel (String ActionDel)
	{
		set_Value (COLUMNNAME_ActionDel, ActionDel);
	}

	/** Get ActionDel.
		@return ActionDel	  */
	public String getActionDel () 
	{
		return (String)get_Value(COLUMNNAME_ActionDel);
	}

	/** Set ActionDetalScore.
		@param ActionDetalScore ActionDetalScore	  */
	public void setActionDetalScore (String ActionDetalScore)
	{
		set_Value (COLUMNNAME_ActionDetalScore, ActionDetalScore);
	}

	/** Get ActionDetalScore.
		@return ActionDetalScore	  */
	public String getActionDetalScore () 
	{
		return (String)get_Value(COLUMNNAME_ActionDetalScore);
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

	/** Set Date_Checked.
		@param Date_Checked Date_Checked	  */
	public void setDate_Checked (Timestamp Date_Checked)
	{
		set_Value (COLUMNNAME_Date_Checked, Date_Checked);
	}

	/** Get Date_Checked.
		@return Date_Checked	  */
	public Timestamp getDate_Checked () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date_Checked);
	}

	/** Cancel delete = CAD */
	public static final String DELETESTATUS_CancelDelete = "CAD";
	/** Delete by it  = DBI */
	public static final String DELETESTATUS_DeleteByIt = "DBI";
	/** Delete succes = DEL */
	public static final String DELETESTATUS_DeleteSucces = "DEL";
	/** Offer To Delete = OTD */
	public static final String DELETESTATUS_OfferToDelete = "OTD";
	/** Default delete = DAF */
	public static final String DELETESTATUS_DefaultDelete = "DAF";
	/** Set DeleteStatus.
		@param DeleteStatus DeleteStatus	  */
	public void setDeleteStatus (String DeleteStatus)
	{

		set_Value (COLUMNNAME_DeleteStatus, DeleteStatus);
	}

	/** Get DeleteStatus.
		@return DeleteStatus	  */
	public String getDeleteStatus () 
	{
		return (String)get_Value(COLUMNNAME_DeleteStatus);
	}

	/** Has not submitted Control = LDR */
	public static final String DOCSTATUS_HasNotSubmittedControl = "LDR";
	/** Suggest Editing = KDR */
	public static final String DOCSTATUS_SuggestEditing = "KDR";
	/** PDR Suggest editing = PDR */
	public static final String DOCSTATUS_PDRSuggestEditing = "PDR";
	/** Edit Profile Unlocked = UDR */
	public static final String DOCSTATUS_EditProfileUnlocked = "UDR";
	/** Submit Control = DKS */
	public static final String DOCSTATUS_SubmitControl = "DKS";
	/** Submit Approval = DPD */
	public static final String DOCSTATUS_SubmitApproval = "DPD";
	/** Approved = DPA */
	public static final String DOCSTATUS_Approved = "DPA";
	/** Offer To Unlock = UPA */
	public static final String DOCSTATUS_OfferToUnlock = "UPA";
	/** Expired = EXP */
	public static final String DOCSTATUS_Expired = "EXP";
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

	/** Set DocumentNumber.
		@param DocumentNumber DocumentNumber	  */
	public void setDocumentNumber (String DocumentNumber)
	{
		set_Value (COLUMNNAME_DocumentNumber, DocumentNumber);
	}

	/** Get DocumentNumber.
		@return DocumentNumber	  */
	public String getDocumentNumber () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNumber);
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

	/** Success = DHT */
	public static final String STATUSPROFILE_Success = "DHT";
	/** NoSuccess = CHT */
	public static final String STATUSPROFILE_NoSuccess = "CHT";
	/** ProcessEdit = PED */
	public static final String STATUSPROFILE_ProcessEdit = "PED";
	/** Edited = DCS */
	public static final String STATUSPROFILE_Edited = "DCS";
	/** Set StatusProfile.
		@param StatusProfile StatusProfile	  */
	public void setStatusProfile (String StatusProfile)
	{

		set_Value (COLUMNNAME_StatusProfile, StatusProfile);
	}

	/** Get StatusProfile.
		@return StatusProfile	  */
	public String getStatusProfile () 
	{
		return (String)get_Value(COLUMNNAME_StatusProfile);
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

	/** Set TDAB_Customer_Score_UU.
		@param TDAB_Customer_Score_UU TDAB_Customer_Score_UU	  */
	public void setTDAB_Customer_Score_UU (String TDAB_Customer_Score_UU)
	{
		set_ValueNoCheck (COLUMNNAME_TDAB_Customer_Score_UU, TDAB_Customer_Score_UU);
	}

	/** Get TDAB_Customer_Score_UU.
		@return TDAB_Customer_Score_UU	  */
	public String getTDAB_Customer_Score_UU () 
	{
		return (String)get_Value(COLUMNNAME_TDAB_Customer_Score_UU);
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