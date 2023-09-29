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

/** Generated Interface for TDAB_Business_Areas_TQ
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Business_Areas_TQ 
{

    /** TableName=TDAB_Business_Areas_TQ */
    public static final String Table_Name = "TDAB_Business_Areas_TQ";

    /** AD_Table_ID=1000244 */
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

    /** Column name DateScore */
    public static final String COLUMNNAME_DateScore = "DateScore";

	/** Set DateScore	  */
	public void setDateScore (Timestamp DateScore);

	/** Get DateScore	  */
	public Timestamp getDateScore();

    /** Column name Date_Approved */
    public static final String COLUMNNAME_Date_Approved = "Date_Approved";

	/** Set Date_Approved	  */
	public void setDate_Approved (Timestamp Date_Approved);

	/** Get Date_Approved	  */
	public Timestamp getDate_Approved();

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

    /** Column name Role_ID */
    public static final String COLUMNNAME_Role_ID = "Role_ID";

	/** Set Role_ID	  */
	public void setRole_ID (String Role_ID);

	/** Get Role_ID	  */
	public String getRole_ID();

    /** Column name Status_Check */
    public static final String COLUMNNAME_Status_Check = "Status_Check";

	/** Set Status_Check	  */
	public void setStatus_Check (String Status_Check);

	/** Get Status_Check	  */
	public String getStatus_Check();

    /** Column name TDAB_Business_Areas_TQ_ID */
    public static final String COLUMNNAME_TDAB_Business_Areas_TQ_ID = "TDAB_Business_Areas_TQ_ID";

	/** Set TDAB_Business_Areas_TQ	  */
	public void setTDAB_Business_Areas_TQ_ID (int TDAB_Business_Areas_TQ_ID);

	/** Get TDAB_Business_Areas_TQ	  */
	public int getTDAB_Business_Areas_TQ_ID();

    /** Column name TDAB_Business_Areas_TQ_UU */
    public static final String COLUMNNAME_TDAB_Business_Areas_TQ_UU = "TDAB_Business_Areas_TQ_UU";

	/** Set TDAB_Business_Areas_TQ_UU	  */
	public void setTDAB_Business_Areas_TQ_UU (String TDAB_Business_Areas_TQ_UU);

	/** Get TDAB_Business_Areas_TQ_UU	  */
	public String getTDAB_Business_Areas_TQ_UU();

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

    /** Column name User_Score_ID */
    public static final String COLUMNNAME_User_Score_ID = "User_Score_ID";

	/** Set User_Score_ID	  */
	public void setUser_Score_ID (int User_Score_ID);

	/** Get User_Score_ID	  */
	public int getUser_Score_ID();

	public org.compiere.model.I_AD_User getUser_Score() throws RuntimeException;

    /** Column name Version */
    public static final String COLUMNNAME_Version = "Version";

	/** Set Version.
	  * Version of the table definition
	  */
	public void setVersion (BigDecimal Version);

	/** Get Version.
	  * Version of the table definition
	  */
	public BigDecimal getVersion();

    /** Column name approval */
    public static final String COLUMNNAME_approval = "approval";

	/** Set approval	  */
	public void setapproval (String approval);

	/** Get approval	  */
	public String getapproval();

    /** Column name submit */
    public static final String COLUMNNAME_submit = "submit";

	/** Set submit	  */
	public void setsubmit (String submit);

	/** Get submit	  */
	public String getsubmit();
}
