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

/** Generated Interface for TDAB_Early_Warning_Question
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Early_Warning_Question 
{

    /** TableName=TDAB_Early_Warning_Question */
    public static final String Table_Name = "TDAB_Early_Warning_Question";

    /** AD_Table_ID=1000199 */
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

    /** Column name Action_Download */
    public static final String COLUMNNAME_Action_Download = "Action_Download";

	/** Set Action_Download	  */
	public void setAction_Download (String Action_Download);

	/** Get Action_Download	  */
	public String getAction_Download();

    /** Column name Active */
    public static final String COLUMNNAME_Active = "Active";

	/** Set Active	  */
	public void setActive (String Active);

	/** Get Active	  */
	public String getActive();

    /** Column name Code */
    public static final String COLUMNNAME_Code = "Code";

	/** Set Validation code.
	  * Mã tiêu chí
	  */
	public void setCode (String Code);

	/** Get Validation code.
	  * Mã tiêu chí
	  */
	public String getCode();

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

    /** Column name File_Name */
    public static final String COLUMNNAME_File_Name = "File_Name";

	/** Set File_Name	  */
	public void setFile_Name (String File_Name);

	/** Get File_Name	  */
	public String getFile_Name();

    /** Column name File_Path */
    public static final String COLUMNNAME_File_Path = "File_Path";

	/** Set File_Path	  */
	public void setFile_Path (String File_Path);

	/** Get File_Path	  */
	public String getFile_Path();

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

    /** Column name TDAB_Early_Warning_Question_ID */
    public static final String COLUMNNAME_TDAB_Early_Warning_Question_ID = "TDAB_Early_Warning_Question_ID";

	/** Set TDAB_Early_Warning_Question	  */
	public void setTDAB_Early_Warning_Question_ID (int TDAB_Early_Warning_Question_ID);

	/** Get TDAB_Early_Warning_Question	  */
	public int getTDAB_Early_Warning_Question_ID();

    /** Column name TDAB_Early_Warning_Question_UU */
    public static final String COLUMNNAME_TDAB_Early_Warning_Question_UU = "TDAB_Early_Warning_Question_UU";

	/** Set TDAB_Early_Warning_Question_UU	  */
	public void setTDAB_Early_Warning_Question_UU (String TDAB_Early_Warning_Question_UU);

	/** Get TDAB_Early_Warning_Question_UU	  */
	public String getTDAB_Early_Warning_Question_UU();

    /** Column name Template_Type */
    public static final String COLUMNNAME_Template_Type = "Template_Type";

	/** Set Template_Type	  */
	public void setTemplate_Type (String Template_Type);

	/** Get Template_Type	  */
	public String getTemplate_Type();

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

    /** Column name Warning_Question_Level */
    public static final String COLUMNNAME_Warning_Question_Level = "Warning_Question_Level";

	/** Set Warning_Question_Level.
	  * Mức độ
	  */
	public void setWarning_Question_Level (String Warning_Question_Level);

	/** Get Warning_Question_Level.
	  * Mức độ
	  */
	public String getWarning_Question_Level();
}
