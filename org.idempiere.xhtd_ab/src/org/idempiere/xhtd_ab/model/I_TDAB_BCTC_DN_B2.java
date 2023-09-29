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

/** Generated Interface for TDAB_BCTC_DN_B2
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_BCTC_DN_B2 
{

    /** TableName=TDAB_BCTC_DN_B2 */
    public static final String Table_Name = "TDAB_BCTC_DN_B2";

    /** AD_Table_ID=1000160 */
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

    /** Column name KQ01 */
    public static final String COLUMNNAME_KQ01 = "KQ01";

	/** Set KQ01	  */
	public void setKQ01 (BigDecimal KQ01);

	/** Get KQ01	  */
	public BigDecimal getKQ01();

    /** Column name KQ01LY */
    public static final String COLUMNNAME_KQ01LY = "KQ01LY";

	/** Set KQ01LY	  */
	public void setKQ01LY (BigDecimal KQ01LY);

	/** Get KQ01LY	  */
	public BigDecimal getKQ01LY();

    /** Column name KQ02 */
    public static final String COLUMNNAME_KQ02 = "KQ02";

	/** Set KQ02	  */
	public void setKQ02 (BigDecimal KQ02);

	/** Get KQ02	  */
	public BigDecimal getKQ02();

    /** Column name KQ02LY */
    public static final String COLUMNNAME_KQ02LY = "KQ02LY";

	/** Set KQ02LY	  */
	public void setKQ02LY (BigDecimal KQ02LY);

	/** Get KQ02LY	  */
	public BigDecimal getKQ02LY();

    /** Column name KQ10 */
    public static final String COLUMNNAME_KQ10 = "KQ10";

	/** Set KQ10	  */
	public void setKQ10 (BigDecimal KQ10);

	/** Get KQ10	  */
	public BigDecimal getKQ10();

    /** Column name KQ10LY */
    public static final String COLUMNNAME_KQ10LY = "KQ10LY";

	/** Set KQ10LY	  */
	public void setKQ10LY (BigDecimal KQ10LY);

	/** Get KQ10LY	  */
	public BigDecimal getKQ10LY();

    /** Column name KQ11 */
    public static final String COLUMNNAME_KQ11 = "KQ11";

	/** Set KQ11	  */
	public void setKQ11 (BigDecimal KQ11);

	/** Get KQ11	  */
	public BigDecimal getKQ11();

    /** Column name KQ11LY */
    public static final String COLUMNNAME_KQ11LY = "KQ11LY";

	/** Set KQ11LY	  */
	public void setKQ11LY (BigDecimal KQ11LY);

	/** Get KQ11LY	  */
	public BigDecimal getKQ11LY();

    /** Column name KQ20 */
    public static final String COLUMNNAME_KQ20 = "KQ20";

	/** Set KQ20	  */
	public void setKQ20 (BigDecimal KQ20);

	/** Get KQ20	  */
	public BigDecimal getKQ20();

    /** Column name KQ20LY */
    public static final String COLUMNNAME_KQ20LY = "KQ20LY";

	/** Set KQ20LY	  */
	public void setKQ20LY (BigDecimal KQ20LY);

	/** Get KQ20LY	  */
	public BigDecimal getKQ20LY();

    /** Column name KQ21 */
    public static final String COLUMNNAME_KQ21 = "KQ21";

	/** Set KQ21	  */
	public void setKQ21 (BigDecimal KQ21);

	/** Get KQ21	  */
	public BigDecimal getKQ21();

    /** Column name KQ21LY */
    public static final String COLUMNNAME_KQ21LY = "KQ21LY";

	/** Set KQ21LY	  */
	public void setKQ21LY (BigDecimal KQ21LY);

	/** Get KQ21LY	  */
	public BigDecimal getKQ21LY();

    /** Column name KQ22 */
    public static final String COLUMNNAME_KQ22 = "KQ22";

	/** Set KQ22	  */
	public void setKQ22 (BigDecimal KQ22);

	/** Get KQ22	  */
	public BigDecimal getKQ22();

    /** Column name KQ22LY */
    public static final String COLUMNNAME_KQ22LY = "KQ22LY";

	/** Set KQ22LY	  */
	public void setKQ22LY (BigDecimal KQ22LY);

	/** Get KQ22LY	  */
	public BigDecimal getKQ22LY();

    /** Column name KQ23 */
    public static final String COLUMNNAME_KQ23 = "KQ23";

	/** Set KQ23	  */
	public void setKQ23 (BigDecimal KQ23);

	/** Get KQ23	  */
	public BigDecimal getKQ23();

    /** Column name KQ23LY */
    public static final String COLUMNNAME_KQ23LY = "KQ23LY";

	/** Set KQ23LY	  */
	public void setKQ23LY (BigDecimal KQ23LY);

	/** Get KQ23LY	  */
	public BigDecimal getKQ23LY();

    /** Column name KQ24 */
    public static final String COLUMNNAME_KQ24 = "KQ24";

	/** Set KQ24	  */
	public void setKQ24 (BigDecimal KQ24);

	/** Get KQ24	  */
	public BigDecimal getKQ24();

    /** Column name KQ24LY */
    public static final String COLUMNNAME_KQ24LY = "KQ24LY";

	/** Set KQ24LY	  */
	public void setKQ24LY (BigDecimal KQ24LY);

	/** Get KQ24LY	  */
	public BigDecimal getKQ24LY();

    /** Column name KQ25 */
    public static final String COLUMNNAME_KQ25 = "KQ25";

	/** Set KQ25	  */
	public void setKQ25 (BigDecimal KQ25);

	/** Get KQ25	  */
	public BigDecimal getKQ25();

    /** Column name KQ25LY */
    public static final String COLUMNNAME_KQ25LY = "KQ25LY";

	/** Set KQ25LY	  */
	public void setKQ25LY (BigDecimal KQ25LY);

	/** Get KQ25LY	  */
	public BigDecimal getKQ25LY();

    /** Column name KQ26 */
    public static final String COLUMNNAME_KQ26 = "KQ26";

	/** Set KQ26	  */
	public void setKQ26 (BigDecimal KQ26);

	/** Get KQ26	  */
	public BigDecimal getKQ26();

    /** Column name KQ26LY */
    public static final String COLUMNNAME_KQ26LY = "KQ26LY";

	/** Set KQ26LY	  */
	public void setKQ26LY (BigDecimal KQ26LY);

	/** Get KQ26LY	  */
	public BigDecimal getKQ26LY();

    /** Column name KQ30 */
    public static final String COLUMNNAME_KQ30 = "KQ30";

	/** Set KQ30	  */
	public void setKQ30 (BigDecimal KQ30);

	/** Get KQ30	  */
	public BigDecimal getKQ30();

    /** Column name KQ30LY */
    public static final String COLUMNNAME_KQ30LY = "KQ30LY";

	/** Set KQ30LY	  */
	public void setKQ30LY (BigDecimal KQ30LY);

	/** Get KQ30LY	  */
	public BigDecimal getKQ30LY();

    /** Column name KQ31 */
    public static final String COLUMNNAME_KQ31 = "KQ31";

	/** Set KQ31	  */
	public void setKQ31 (BigDecimal KQ31);

	/** Get KQ31	  */
	public BigDecimal getKQ31();

    /** Column name KQ31LY */
    public static final String COLUMNNAME_KQ31LY = "KQ31LY";

	/** Set KQ31LY	  */
	public void setKQ31LY (BigDecimal KQ31LY);

	/** Get KQ31LY	  */
	public BigDecimal getKQ31LY();

    /** Column name KQ32 */
    public static final String COLUMNNAME_KQ32 = "KQ32";

	/** Set KQ32	  */
	public void setKQ32 (BigDecimal KQ32);

	/** Get KQ32	  */
	public BigDecimal getKQ32();

    /** Column name KQ32LY */
    public static final String COLUMNNAME_KQ32LY = "KQ32LY";

	/** Set KQ32LY	  */
	public void setKQ32LY (BigDecimal KQ32LY);

	/** Get KQ32LY	  */
	public BigDecimal getKQ32LY();

    /** Column name KQ40 */
    public static final String COLUMNNAME_KQ40 = "KQ40";

	/** Set KQ40	  */
	public void setKQ40 (BigDecimal KQ40);

	/** Get KQ40	  */
	public BigDecimal getKQ40();

    /** Column name KQ40LY */
    public static final String COLUMNNAME_KQ40LY = "KQ40LY";

	/** Set KQ40LY	  */
	public void setKQ40LY (BigDecimal KQ40LY);

	/** Get KQ40LY	  */
	public BigDecimal getKQ40LY();

    /** Column name KQ50 */
    public static final String COLUMNNAME_KQ50 = "KQ50";

	/** Set KQ50	  */
	public void setKQ50 (BigDecimal KQ50);

	/** Get KQ50	  */
	public BigDecimal getKQ50();

    /** Column name KQ50LY */
    public static final String COLUMNNAME_KQ50LY = "KQ50LY";

	/** Set KQ50LY	  */
	public void setKQ50LY (BigDecimal KQ50LY);

	/** Get KQ50LY	  */
	public BigDecimal getKQ50LY();

    /** Column name KQ51 */
    public static final String COLUMNNAME_KQ51 = "KQ51";

	/** Set KQ51	  */
	public void setKQ51 (BigDecimal KQ51);

	/** Get KQ51	  */
	public BigDecimal getKQ51();

    /** Column name KQ51LY */
    public static final String COLUMNNAME_KQ51LY = "KQ51LY";

	/** Set KQ51LY	  */
	public void setKQ51LY (BigDecimal KQ51LY);

	/** Get KQ51LY	  */
	public BigDecimal getKQ51LY();

    /** Column name KQ52 */
    public static final String COLUMNNAME_KQ52 = "KQ52";

	/** Set KQ52	  */
	public void setKQ52 (BigDecimal KQ52);

	/** Get KQ52	  */
	public BigDecimal getKQ52();

    /** Column name KQ52LY */
    public static final String COLUMNNAME_KQ52LY = "KQ52LY";

	/** Set KQ52LY	  */
	public void setKQ52LY (BigDecimal KQ52LY);

	/** Get KQ52LY	  */
	public BigDecimal getKQ52LY();

    /** Column name KQ60 */
    public static final String COLUMNNAME_KQ60 = "KQ60";

	/** Set KQ60	  */
	public void setKQ60 (BigDecimal KQ60);

	/** Get KQ60	  */
	public BigDecimal getKQ60();

    /** Column name KQ60LY */
    public static final String COLUMNNAME_KQ60LY = "KQ60LY";

	/** Set KQ60LY	  */
	public void setKQ60LY (BigDecimal KQ60LY);

	/** Get KQ60LY	  */
	public BigDecimal getKQ60LY();

    /** Column name KQ61 */
    public static final String COLUMNNAME_KQ61 = "KQ61";

	/** Set KQ61	  */
	public void setKQ61 (BigDecimal KQ61);

	/** Get KQ61	  */
	public BigDecimal getKQ61();

    /** Column name KQ61LY */
    public static final String COLUMNNAME_KQ61LY = "KQ61LY";

	/** Set KQ61LY	  */
	public void setKQ61LY (BigDecimal KQ61LY);

	/** Get KQ61LY	  */
	public BigDecimal getKQ61LY();

    /** Column name KQ62 */
    public static final String COLUMNNAME_KQ62 = "KQ62";

	/** Set KQ62	  */
	public void setKQ62 (BigDecimal KQ62);

	/** Get KQ62	  */
	public BigDecimal getKQ62();

    /** Column name KQ62LY */
    public static final String COLUMNNAME_KQ62LY = "KQ62LY";

	/** Set KQ62LY	  */
	public void setKQ62LY (BigDecimal KQ62LY);

	/** Get KQ62LY	  */
	public BigDecimal getKQ62LY();

    /** Column name KQ70 */
    public static final String COLUMNNAME_KQ70 = "KQ70";

	/** Set KQ70	  */
	public void setKQ70 (BigDecimal KQ70);

	/** Get KQ70	  */
	public BigDecimal getKQ70();

    /** Column name KQ70LY */
    public static final String COLUMNNAME_KQ70LY = "KQ70LY";

	/** Set KQ70LY	  */
	public void setKQ70LY (BigDecimal KQ70LY);

	/** Get KQ70LY	  */
	public BigDecimal getKQ70LY();

    /** Column name KQ71 */
    public static final String COLUMNNAME_KQ71 = "KQ71";

	/** Set KQ71	  */
	public void setKQ71 (BigDecimal KQ71);

	/** Get KQ71	  */
	public BigDecimal getKQ71();

    /** Column name KQ71LY */
    public static final String COLUMNNAME_KQ71LY = "KQ71LY";

	/** Set KQ71LY	  */
	public void setKQ71LY (BigDecimal KQ71LY);

	/** Get KQ71LY	  */
	public BigDecimal getKQ71LY();

    /** Column name TDAB_BCTC_DN_B2_ID */
    public static final String COLUMNNAME_TDAB_BCTC_DN_B2_ID = "TDAB_BCTC_DN_B2_ID";

	/** Set TDAB_BCTC_DN_B2_ID	  */
	public void setTDAB_BCTC_DN_B2_ID (int TDAB_BCTC_DN_B2_ID);

	/** Get TDAB_BCTC_DN_B2_ID	  */
	public int getTDAB_BCTC_DN_B2_ID();

    /** Column name TDAB_BCTC_DN_B2_UU */
    public static final String COLUMNNAME_TDAB_BCTC_DN_B2_UU = "TDAB_BCTC_DN_B2_UU";

	/** Set TDAB_BCTC_DN_B2_UU	  */
	public void setTDAB_BCTC_DN_B2_UU (String TDAB_BCTC_DN_B2_UU);

	/** Get TDAB_BCTC_DN_B2_UU	  */
	public String getTDAB_BCTC_DN_B2_UU();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Financial_ID */
    public static final String COLUMNNAME_TDAB_Financial_ID = "TDAB_Financial_ID";

	/** Set TDAB_Financial	  */
	public void setTDAB_Financial_ID (int TDAB_Financial_ID);

	/** Get TDAB_Financial	  */
	public int getTDAB_Financial_ID();

	public I_TDAB_Financial getTDAB_Financial() throws RuntimeException;
}
