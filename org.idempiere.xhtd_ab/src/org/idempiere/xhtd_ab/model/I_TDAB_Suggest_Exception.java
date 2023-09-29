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

/** Generated Interface for TDAB_Suggest_Exception
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Suggest_Exception 
{

    /** TableName=TDAB_Suggest_Exception */
    public static final String Table_Name = "TDAB_Suggest_Exception";

    /** AD_Table_ID=1000206 */
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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name BtnDownloadSuggestException */
    public static final String COLUMNNAME_BtnDownloadSuggestException = "BtnDownloadSuggestException";

	/** Set BtnDownloadSuggestException	  */
	public void setBtnDownloadSuggestException (String BtnDownloadSuggestException);

	/** Get BtnDownloadSuggestException	  */
	public String getBtnDownloadSuggestException();

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

    /** Column name Date_Suggest */
    public static final String COLUMNNAME_Date_Suggest = "Date_Suggest";

	/** Set Date_Suggest	  */
	public void setDate_Suggest (Timestamp Date_Suggest);

	/** Get Date_Suggest	  */
	public Timestamp getDate_Suggest();

    /** Column name File_Suggest_CV */
    public static final String COLUMNNAME_File_Suggest_CV = "File_Suggest_CV";

	/** Set File_Suggest_CV	  */
	public void setFile_Suggest_CV (String File_Suggest_CV);

	/** Get File_Suggest_CV	  */
	public String getFile_Suggest_CV();

    /** Column name File_Suggest_KS */
    public static final String COLUMNNAME_File_Suggest_KS = "File_Suggest_KS";

	/** Set File_Suggest_KS	  */
	public void setFile_Suggest_KS (String File_Suggest_KS);

	/** Get File_Suggest_KS	  */
	public String getFile_Suggest_KS();

    /** Column name File_Suggest_TD */
    public static final String COLUMNNAME_File_Suggest_TD = "File_Suggest_TD";

	/** Set File_Suggest_TD	  */
	public void setFile_Suggest_TD (String File_Suggest_TD);

	/** Get File_Suggest_TD	  */
	public String getFile_Suggest_TD();

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

    /** Column name NSuggest */
    public static final String COLUMNNAME_NSuggest = "NSuggest";

	/** Set NSuggest	  */
	public void setNSuggest (int NSuggest);

	/** Get NSuggest	  */
	public int getNSuggest();

    /** Column name Note */
    public static final String COLUMNNAME_Note = "Note";

	/** Set Note.
	  * Optional additional user defined information
	  */
	public void setNote (String Note);

	/** Get Note.
	  * Optional additional user defined information
	  */
	public String getNote();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Suggest_Exception_ID */
    public static final String COLUMNNAME_TDAB_Suggest_Exception_ID = "TDAB_Suggest_Exception_ID";

	/** Set De xuat ngoai le	  */
	public void setTDAB_Suggest_Exception_ID (int TDAB_Suggest_Exception_ID);

	/** Get De xuat ngoai le	  */
	public int getTDAB_Suggest_Exception_ID();

    /** Column name TDAB_Suggest_Exception_UU */
    public static final String COLUMNNAME_TDAB_Suggest_Exception_UU = "TDAB_Suggest_Exception_UU";

	/** Set TDAB_Suggest_Exception_UU	  */
	public void setTDAB_Suggest_Exception_UU (String TDAB_Suggest_Exception_UU);

	/** Get TDAB_Suggest_Exception_UU	  */
	public String getTDAB_Suggest_Exception_UU();

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

    /** Column name User_Checked_ID */
    public static final String COLUMNNAME_User_Checked_ID = "User_Checked_ID";

	/** Set User_Checked_ID	  */
	public void setUser_Checked_ID (int User_Checked_ID);

	/** Get User_Checked_ID	  */
	public int getUser_Checked_ID();

	public org.compiere.model.I_AD_User getUser_Checked() throws RuntimeException;
}
