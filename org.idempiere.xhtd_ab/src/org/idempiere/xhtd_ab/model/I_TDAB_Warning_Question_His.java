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

/** Generated Interface for TDAB_Warning_Question_His
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Warning_Question_His 
{

    /** TableName=TDAB_Warning_Question_His */
    public static final String Table_Name = "TDAB_Warning_Question_His";

    /** AD_Table_ID=1000245 */
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

    /** Column name Answer_CV */
    public static final String COLUMNNAME_Answer_CV = "Answer_CV";

	/** Set Answer_CV	  */
	public void setAnswer_CV (String Answer_CV);

	/** Get Answer_CV	  */
	public String getAnswer_CV();

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

    /** Column name HisCreatedAt */
    public static final String COLUMNNAME_HisCreatedAt = "HisCreatedAt";

	/** Set HisCreatedAt	  */
	public void setHisCreatedAt (Timestamp HisCreatedAt);

	/** Get HisCreatedAt	  */
	public Timestamp getHisCreatedAt();

    /** Column name HisCreatedBy */
    public static final String COLUMNNAME_HisCreatedBy = "HisCreatedBy";

	/** Set HisCreatedBy	  */
	public void setHisCreatedBy (String HisCreatedBy);

	/** Get HisCreatedBy	  */
	public String getHisCreatedBy();

    /** Column name HisUpdateAt */
    public static final String COLUMNNAME_HisUpdateAt = "HisUpdateAt";

	/** Set HisUpdateAt	  */
	public void setHisUpdateAt (Timestamp HisUpdateAt);

	/** Get HisUpdateAt	  */
	public Timestamp getHisUpdateAt();

    /** Column name HisUpdateBy */
    public static final String COLUMNNAME_HisUpdateBy = "HisUpdateBy";

	/** Set HisUpdateBy	  */
	public void setHisUpdateBy (String HisUpdateBy);

	/** Get HisUpdateBy	  */
	public String getHisUpdateBy();

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

    /** Column name TDAB_Warning_Question_HS_ID */
    public static final String COLUMNNAME_TDAB_Warning_Question_HS_ID = "TDAB_Warning_Question_HS_ID";

	/** Set Bo cau hoi canh bao som	  */
	public void setTDAB_Warning_Question_HS_ID (int TDAB_Warning_Question_HS_ID);

	/** Get Bo cau hoi canh bao som	  */
	public int getTDAB_Warning_Question_HS_ID();

	public I_TDAB_Warning_Question_HS getTDAB_Warning_Question_HS() throws RuntimeException;

    /** Column name TDAB_Warning_Question_His_ID */
    public static final String COLUMNNAME_TDAB_Warning_Question_His_ID = "TDAB_Warning_Question_His_ID";

	/** Set TDAB_Warning_Question_His	  */
	public void setTDAB_Warning_Question_His_ID (int TDAB_Warning_Question_His_ID);

	/** Get TDAB_Warning_Question_His	  */
	public int getTDAB_Warning_Question_His_ID();

    /** Column name TDAB_Warning_Question_His_UU */
    public static final String COLUMNNAME_TDAB_Warning_Question_His_UU = "TDAB_Warning_Question_His_UU";

	/** Set TDAB_Warning_Question_His_UU	  */
	public void setTDAB_Warning_Question_His_UU (String TDAB_Warning_Question_His_UU);

	/** Get TDAB_Warning_Question_His_UU	  */
	public String getTDAB_Warning_Question_His_UU();

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Value.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Value.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name Warning_Question_Info_ID */
    public static final String COLUMNNAME_Warning_Question_Info_ID = "Warning_Question_Info_ID";

	/** Set Warning_Question_Info_ID	  */
	public void setWarning_Question_Info_ID (int Warning_Question_Info_ID);

	/** Get Warning_Question_Info_ID	  */
	public int getWarning_Question_Info_ID();

	public I_TDAB_Warning_Question_Info getWarning_Question_Info() throws RuntimeException;
}
