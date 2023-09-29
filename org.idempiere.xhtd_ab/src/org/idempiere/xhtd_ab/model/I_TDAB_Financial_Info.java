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

/** Generated Interface for TDAB_Financial_Info
 *  @author iDempiere (generated) 
 *  @version Release 6.2
 */
@SuppressWarnings("all")
public interface I_TDAB_Financial_Info 
{

    /** TableName=TDAB_Financial_Info */
    public static final String Table_Name = "TDAB_Financial_Info";

    /** AD_Table_ID=1000266 */
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

    /** Column name BCTC_B1_File */
    public static final String COLUMNNAME_BCTC_B1_File = "BCTC_B1_File";

	/** Set BCTC_B1_File	  */
	public void setBCTC_B1_File (String BCTC_B1_File);

	/** Get BCTC_B1_File	  */
	public String getBCTC_B1_File();

    /** Column name Btn_Download_BCTC_KSV */
    public static final String COLUMNNAME_Btn_Download_BCTC_KSV = "Btn_Download_BCTC_KSV";

	/** Set Btn_Download_BCTC_KSV	  */
	public void setBtn_Download_BCTC_KSV (String Btn_Download_BCTC_KSV);

	/** Get Btn_Download_BCTC_KSV	  */
	public String getBtn_Download_BCTC_KSV();

    /** Column name Btn_Download_BCTC_QHKH */
    public static final String COLUMNNAME_Btn_Download_BCTC_QHKH = "Btn_Download_BCTC_QHKH";

	/** Set Btn_Download_BCTC_QHKH.
	  * Btn_Download_BCTC_QHKH
	  */
	public void setBtn_Download_BCTC_QHKH (String Btn_Download_BCTC_QHKH);

	/** Get Btn_Download_BCTC_QHKH.
	  * Btn_Download_BCTC_QHKH
	  */
	public String getBtn_Download_BCTC_QHKH();

    /** Column name Btn_Download_BCTC_TDTD */
    public static final String COLUMNNAME_Btn_Download_BCTC_TDTD = "Btn_Download_BCTC_TDTD";

	/** Set Btn_Download_BCTC_TDTD	  */
	public void setBtn_Download_BCTC_TDTD (String Btn_Download_BCTC_TDTD);

	/** Get Btn_Download_BCTC_TDTD	  */
	public String getBtn_Download_BCTC_TDTD();

    /** Column name Btn_Download_Template */
    public static final String COLUMNNAME_Btn_Download_Template = "Btn_Download_Template";

	/** Set Btn_Download_Template	  */
	public void setBtn_Download_Template (String Btn_Download_Template);

	/** Get Btn_Download_Template	  */
	public String getBtn_Download_Template();

    /** Column name CD100 */
    public static final String COLUMNNAME_CD100 = "CD100";

	/** Set CD100	  */
	public void setCD100 (BigDecimal CD100);

	/** Get CD100	  */
	public BigDecimal getCD100();

    /** Column name CD100LY */
    public static final String COLUMNNAME_CD100LY = "CD100LY";

	/** Set CD100LY	  */
	public void setCD100LY (BigDecimal CD100LY);

	/** Get CD100LY	  */
	public BigDecimal getCD100LY();

    /** Column name CD110 */
    public static final String COLUMNNAME_CD110 = "CD110";

	/** Set CD110	  */
	public void setCD110 (BigDecimal CD110);

	/** Get CD110	  */
	public BigDecimal getCD110();

    /** Column name CD110LY */
    public static final String COLUMNNAME_CD110LY = "CD110LY";

	/** Set CD110LY	  */
	public void setCD110LY (BigDecimal CD110LY);

	/** Get CD110LY	  */
	public BigDecimal getCD110LY();

    /** Column name CD111 */
    public static final String COLUMNNAME_CD111 = "CD111";

	/** Set CD111	  */
	public void setCD111 (BigDecimal CD111);

	/** Get CD111	  */
	public BigDecimal getCD111();

    /** Column name CD111LY */
    public static final String COLUMNNAME_CD111LY = "CD111LY";

	/** Set CD111LY	  */
	public void setCD111LY (BigDecimal CD111LY);

	/** Get CD111LY	  */
	public BigDecimal getCD111LY();

    /** Column name CD112 */
    public static final String COLUMNNAME_CD112 = "CD112";

	/** Set CD112	  */
	public void setCD112 (BigDecimal CD112);

	/** Get CD112	  */
	public BigDecimal getCD112();

    /** Column name CD112LY */
    public static final String COLUMNNAME_CD112LY = "CD112LY";

	/** Set CD112LY	  */
	public void setCD112LY (BigDecimal CD112LY);

	/** Get CD112LY	  */
	public BigDecimal getCD112LY();

    /** Column name CD120 */
    public static final String COLUMNNAME_CD120 = "CD120";

	/** Set CD120	  */
	public void setCD120 (BigDecimal CD120);

	/** Get CD120	  */
	public BigDecimal getCD120();

    /** Column name CD120LY */
    public static final String COLUMNNAME_CD120LY = "CD120LY";

	/** Set CD120LY	  */
	public void setCD120LY (BigDecimal CD120LY);

	/** Get CD120LY	  */
	public BigDecimal getCD120LY();

    /** Column name CD121 */
    public static final String COLUMNNAME_CD121 = "CD121";

	/** Set CD121	  */
	public void setCD121 (BigDecimal CD121);

	/** Get CD121	  */
	public BigDecimal getCD121();

    /** Column name CD121LY */
    public static final String COLUMNNAME_CD121LY = "CD121LY";

	/** Set CD121LY	  */
	public void setCD121LY (BigDecimal CD121LY);

	/** Get CD121LY	  */
	public BigDecimal getCD121LY();

    /** Column name CD122 */
    public static final String COLUMNNAME_CD122 = "CD122";

	/** Set CD122	  */
	public void setCD122 (BigDecimal CD122);

	/** Get CD122	  */
	public BigDecimal getCD122();

    /** Column name CD122LY */
    public static final String COLUMNNAME_CD122LY = "CD122LY";

	/** Set CD122LY	  */
	public void setCD122LY (BigDecimal CD122LY);

	/** Get CD122LY	  */
	public BigDecimal getCD122LY();

    /** Column name CD123 */
    public static final String COLUMNNAME_CD123 = "CD123";

	/** Set CD123	  */
	public void setCD123 (BigDecimal CD123);

	/** Get CD123	  */
	public BigDecimal getCD123();

    /** Column name CD123LY */
    public static final String COLUMNNAME_CD123LY = "CD123LY";

	/** Set CD123LY	  */
	public void setCD123LY (BigDecimal CD123LY);

	/** Get CD123LY	  */
	public BigDecimal getCD123LY();

    /** Column name CD124 */
    public static final String COLUMNNAME_CD124 = "CD124";

	/** Set CD124	  */
	public void setCD124 (BigDecimal CD124);

	/** Get CD124	  */
	public BigDecimal getCD124();

    /** Column name CD124LY */
    public static final String COLUMNNAME_CD124LY = "CD124LY";

	/** Set CD124LY	  */
	public void setCD124LY (BigDecimal CD124LY);

	/** Get CD124LY	  */
	public BigDecimal getCD124LY();

    /** Column name CD130 */
    public static final String COLUMNNAME_CD130 = "CD130";

	/** Set CD130	  */
	public void setCD130 (BigDecimal CD130);

	/** Get CD130	  */
	public BigDecimal getCD130();

    /** Column name CD130LY */
    public static final String COLUMNNAME_CD130LY = "CD130LY";

	/** Set CD130LY	  */
	public void setCD130LY (BigDecimal CD130LY);

	/** Get CD130LY	  */
	public BigDecimal getCD130LY();

    /** Column name CD131 */
    public static final String COLUMNNAME_CD131 = "CD131";

	/** Set CD131	  */
	public void setCD131 (BigDecimal CD131);

	/** Get CD131	  */
	public BigDecimal getCD131();

    /** Column name CD131LY */
    public static final String COLUMNNAME_CD131LY = "CD131LY";

	/** Set CD131LY	  */
	public void setCD131LY (BigDecimal CD131LY);

	/** Get CD131LY	  */
	public BigDecimal getCD131LY();

    /** Column name CD132 */
    public static final String COLUMNNAME_CD132 = "CD132";

	/** Set CD132	  */
	public void setCD132 (BigDecimal CD132);

	/** Get CD132	  */
	public BigDecimal getCD132();

    /** Column name CD132LY */
    public static final String COLUMNNAME_CD132LY = "CD132LY";

	/** Set CD132LY	  */
	public void setCD132LY (BigDecimal CD132LY);

	/** Get CD132LY	  */
	public BigDecimal getCD132LY();

    /** Column name CD133 */
    public static final String COLUMNNAME_CD133 = "CD133";

	/** Set CD133	  */
	public void setCD133 (BigDecimal CD133);

	/** Get CD133	  */
	public BigDecimal getCD133();

    /** Column name CD133LY */
    public static final String COLUMNNAME_CD133LY = "CD133LY";

	/** Set CD133LY	  */
	public void setCD133LY (BigDecimal CD133LY);

	/** Get CD133LY	  */
	public BigDecimal getCD133LY();

    /** Column name CD134 */
    public static final String COLUMNNAME_CD134 = "CD134";

	/** Set CD134	  */
	public void setCD134 (BigDecimal CD134);

	/** Get CD134	  */
	public BigDecimal getCD134();

    /** Column name CD134LY */
    public static final String COLUMNNAME_CD134LY = "CD134LY";

	/** Set CD134LY	  */
	public void setCD134LY (BigDecimal CD134LY);

	/** Get CD134LY	  */
	public BigDecimal getCD134LY();

    /** Column name CD135 */
    public static final String COLUMNNAME_CD135 = "CD135";

	/** Set CD135	  */
	public void setCD135 (BigDecimal CD135);

	/** Get CD135	  */
	public BigDecimal getCD135();

    /** Column name CD135LY */
    public static final String COLUMNNAME_CD135LY = "CD135LY";

	/** Set CD135LY	  */
	public void setCD135LY (BigDecimal CD135LY);

	/** Get CD135LY	  */
	public BigDecimal getCD135LY();

    /** Column name CD136 */
    public static final String COLUMNNAME_CD136 = "CD136";

	/** Set CD136	  */
	public void setCD136 (BigDecimal CD136);

	/** Get CD136	  */
	public BigDecimal getCD136();

    /** Column name CD136LY */
    public static final String COLUMNNAME_CD136LY = "CD136LY";

	/** Set CD136LY	  */
	public void setCD136LY (BigDecimal CD136LY);

	/** Get CD136LY	  */
	public BigDecimal getCD136LY();

    /** Column name CD137 */
    public static final String COLUMNNAME_CD137 = "CD137";

	/** Set CD137	  */
	public void setCD137 (BigDecimal CD137);

	/** Get CD137	  */
	public BigDecimal getCD137();

    /** Column name CD137LY */
    public static final String COLUMNNAME_CD137LY = "CD137LY";

	/** Set CD137LY	  */
	public void setCD137LY (BigDecimal CD137LY);

	/** Get CD137LY	  */
	public BigDecimal getCD137LY();

    /** Column name CD139 */
    public static final String COLUMNNAME_CD139 = "CD139";

	/** Set CD139	  */
	public void setCD139 (BigDecimal CD139);

	/** Get CD139	  */
	public BigDecimal getCD139();

    /** Column name CD139LY */
    public static final String COLUMNNAME_CD139LY = "CD139LY";

	/** Set CD139LY	  */
	public void setCD139LY (BigDecimal CD139LY);

	/** Get CD139LY	  */
	public BigDecimal getCD139LY();

    /** Column name CD140 */
    public static final String COLUMNNAME_CD140 = "CD140";

	/** Set CD140	  */
	public void setCD140 (BigDecimal CD140);

	/** Get CD140	  */
	public BigDecimal getCD140();

    /** Column name CD140LY */
    public static final String COLUMNNAME_CD140LY = "CD140LY";

	/** Set CD140LY	  */
	public void setCD140LY (BigDecimal CD140LY);

	/** Get CD140LY	  */
	public BigDecimal getCD140LY();

    /** Column name CD141 */
    public static final String COLUMNNAME_CD141 = "CD141";

	/** Set CD141	  */
	public void setCD141 (BigDecimal CD141);

	/** Get CD141	  */
	public BigDecimal getCD141();

    /** Column name CD141LY */
    public static final String COLUMNNAME_CD141LY = "CD141LY";

	/** Set CD141LY	  */
	public void setCD141LY (BigDecimal CD141LY);

	/** Get CD141LY	  */
	public BigDecimal getCD141LY();

    /** Column name CD149 */
    public static final String COLUMNNAME_CD149 = "CD149";

	/** Set CD149	  */
	public void setCD149 (BigDecimal CD149);

	/** Get CD149	  */
	public BigDecimal getCD149();

    /** Column name CD149LY */
    public static final String COLUMNNAME_CD149LY = "CD149LY";

	/** Set CD149LY	  */
	public void setCD149LY (BigDecimal CD149LY);

	/** Get CD149LY	  */
	public BigDecimal getCD149LY();

    /** Column name CD150 */
    public static final String COLUMNNAME_CD150 = "CD150";

	/** Set CD150	  */
	public void setCD150 (BigDecimal CD150);

	/** Get CD150	  */
	public BigDecimal getCD150();

    /** Column name CD150LY */
    public static final String COLUMNNAME_CD150LY = "CD150LY";

	/** Set CD150LY	  */
	public void setCD150LY (BigDecimal CD150LY);

	/** Get CD150LY	  */
	public BigDecimal getCD150LY();

    /** Column name CD151 */
    public static final String COLUMNNAME_CD151 = "CD151";

	/** Set CD151	  */
	public void setCD151 (BigDecimal CD151);

	/** Get CD151	  */
	public BigDecimal getCD151();

    /** Column name CD151LY */
    public static final String COLUMNNAME_CD151LY = "CD151LY";

	/** Set CD151LY	  */
	public void setCD151LY (BigDecimal CD151LY);

	/** Get CD151LY	  */
	public BigDecimal getCD151LY();

    /** Column name CD152 */
    public static final String COLUMNNAME_CD152 = "CD152";

	/** Set CD152	  */
	public void setCD152 (BigDecimal CD152);

	/** Get CD152	  */
	public BigDecimal getCD152();

    /** Column name CD152LY */
    public static final String COLUMNNAME_CD152LY = "CD152LY";

	/** Set CD152LY	  */
	public void setCD152LY (BigDecimal CD152LY);

	/** Get CD152LY	  */
	public BigDecimal getCD152LY();

    /** Column name CD153 */
    public static final String COLUMNNAME_CD153 = "CD153";

	/** Set CD153	  */
	public void setCD153 (BigDecimal CD153);

	/** Get CD153	  */
	public BigDecimal getCD153();

    /** Column name CD153LY */
    public static final String COLUMNNAME_CD153LY = "CD153LY";

	/** Set CD153LY	  */
	public void setCD153LY (BigDecimal CD153LY);

	/** Get CD153LY	  */
	public BigDecimal getCD153LY();

    /** Column name CD154 */
    public static final String COLUMNNAME_CD154 = "CD154";

	/** Set CD154	  */
	public void setCD154 (BigDecimal CD154);

	/** Get CD154	  */
	public BigDecimal getCD154();

    /** Column name CD154LY */
    public static final String COLUMNNAME_CD154LY = "CD154LY";

	/** Set CD154LY	  */
	public void setCD154LY (BigDecimal CD154LY);

	/** Get CD154LY	  */
	public BigDecimal getCD154LY();

    /** Column name CD155 */
    public static final String COLUMNNAME_CD155 = "CD155";

	/** Set CD155	  */
	public void setCD155 (BigDecimal CD155);

	/** Get CD155	  */
	public BigDecimal getCD155();

    /** Column name CD155LY */
    public static final String COLUMNNAME_CD155LY = "CD155LY";

	/** Set CD155LY	  */
	public void setCD155LY (BigDecimal CD155LY);

	/** Get CD155LY	  */
	public BigDecimal getCD155LY();

    /** Column name CD200 */
    public static final String COLUMNNAME_CD200 = "CD200";

	/** Set CD200	  */
	public void setCD200 (BigDecimal CD200);

	/** Get CD200	  */
	public BigDecimal getCD200();

    /** Column name CD200LY */
    public static final String COLUMNNAME_CD200LY = "CD200LY";

	/** Set CD200LY	  */
	public void setCD200LY (BigDecimal CD200LY);

	/** Get CD200LY	  */
	public BigDecimal getCD200LY();

    /** Column name CD210 */
    public static final String COLUMNNAME_CD210 = "CD210";

	/** Set CD210	  */
	public void setCD210 (BigDecimal CD210);

	/** Get CD210	  */
	public BigDecimal getCD210();

    /** Column name CD210LY */
    public static final String COLUMNNAME_CD210LY = "CD210LY";

	/** Set CD210LY	  */
	public void setCD210LY (BigDecimal CD210LY);

	/** Get CD210LY	  */
	public BigDecimal getCD210LY();

    /** Column name CD211 */
    public static final String COLUMNNAME_CD211 = "CD211";

	/** Set CD211	  */
	public void setCD211 (BigDecimal CD211);

	/** Get CD211	  */
	public BigDecimal getCD211();

    /** Column name CD211LY */
    public static final String COLUMNNAME_CD211LY = "CD211LY";

	/** Set CD211LY	  */
	public void setCD211LY (BigDecimal CD211LY);

	/** Get CD211LY	  */
	public BigDecimal getCD211LY();

    /** Column name CD212 */
    public static final String COLUMNNAME_CD212 = "CD212";

	/** Set CD212	  */
	public void setCD212 (BigDecimal CD212);

	/** Get CD212	  */
	public BigDecimal getCD212();

    /** Column name CD212LY */
    public static final String COLUMNNAME_CD212LY = "CD212LY";

	/** Set CD212LY	  */
	public void setCD212LY (BigDecimal CD212LY);

	/** Get CD212LY	  */
	public BigDecimal getCD212LY();

    /** Column name CD213 */
    public static final String COLUMNNAME_CD213 = "CD213";

	/** Set CD213	  */
	public void setCD213 (BigDecimal CD213);

	/** Get CD213	  */
	public BigDecimal getCD213();

    /** Column name CD213LY */
    public static final String COLUMNNAME_CD213LY = "CD213LY";

	/** Set CD213LY	  */
	public void setCD213LY (BigDecimal CD213LY);

	/** Get CD213LY	  */
	public BigDecimal getCD213LY();

    /** Column name CD214 */
    public static final String COLUMNNAME_CD214 = "CD214";

	/** Set CD214	  */
	public void setCD214 (BigDecimal CD214);

	/** Get CD214	  */
	public BigDecimal getCD214();

    /** Column name CD214LY */
    public static final String COLUMNNAME_CD214LY = "CD214LY";

	/** Set CD214LY	  */
	public void setCD214LY (BigDecimal CD214LY);

	/** Get CD214LY	  */
	public BigDecimal getCD214LY();

    /** Column name CD215 */
    public static final String COLUMNNAME_CD215 = "CD215";

	/** Set CD215	  */
	public void setCD215 (BigDecimal CD215);

	/** Get CD215	  */
	public BigDecimal getCD215();

    /** Column name CD215LY */
    public static final String COLUMNNAME_CD215LY = "CD215LY";

	/** Set CD215LY	  */
	public void setCD215LY (BigDecimal CD215LY);

	/** Get CD215LY	  */
	public BigDecimal getCD215LY();

    /** Column name CD216 */
    public static final String COLUMNNAME_CD216 = "CD216";

	/** Set CD216	  */
	public void setCD216 (BigDecimal CD216);

	/** Get CD216	  */
	public BigDecimal getCD216();

    /** Column name CD216LY */
    public static final String COLUMNNAME_CD216LY = "CD216LY";

	/** Set CD216LY	  */
	public void setCD216LY (BigDecimal CD216LY);

	/** Get CD216LY	  */
	public BigDecimal getCD216LY();

    /** Column name CD219 */
    public static final String COLUMNNAME_CD219 = "CD219";

	/** Set CD219	  */
	public void setCD219 (BigDecimal CD219);

	/** Get CD219	  */
	public BigDecimal getCD219();

    /** Column name CD219LY */
    public static final String COLUMNNAME_CD219LY = "CD219LY";

	/** Set CD219LY	  */
	public void setCD219LY (BigDecimal CD219LY);

	/** Get CD219LY	  */
	public BigDecimal getCD219LY();

    /** Column name CD220 */
    public static final String COLUMNNAME_CD220 = "CD220";

	/** Set CD220	  */
	public void setCD220 (BigDecimal CD220);

	/** Get CD220	  */
	public BigDecimal getCD220();

    /** Column name CD220LY */
    public static final String COLUMNNAME_CD220LY = "CD220LY";

	/** Set CD220LY	  */
	public void setCD220LY (BigDecimal CD220LY);

	/** Get CD220LY	  */
	public BigDecimal getCD220LY();

    /** Column name CD221 */
    public static final String COLUMNNAME_CD221 = "CD221";

	/** Set CD221	  */
	public void setCD221 (BigDecimal CD221);

	/** Get CD221	  */
	public BigDecimal getCD221();

    /** Column name CD221LY */
    public static final String COLUMNNAME_CD221LY = "CD221LY";

	/** Set CD221LY	  */
	public void setCD221LY (BigDecimal CD221LY);

	/** Get CD221LY	  */
	public BigDecimal getCD221LY();

    /** Column name CD222 */
    public static final String COLUMNNAME_CD222 = "CD222";

	/** Set CD222	  */
	public void setCD222 (BigDecimal CD222);

	/** Get CD222	  */
	public BigDecimal getCD222();

    /** Column name CD222LY */
    public static final String COLUMNNAME_CD222LY = "CD222LY";

	/** Set CD222LY	  */
	public void setCD222LY (BigDecimal CD222LY);

	/** Get CD222LY	  */
	public BigDecimal getCD222LY();

    /** Column name CD223 */
    public static final String COLUMNNAME_CD223 = "CD223";

	/** Set CD223	  */
	public void setCD223 (BigDecimal CD223);

	/** Get CD223	  */
	public BigDecimal getCD223();

    /** Column name CD223LY */
    public static final String COLUMNNAME_CD223LY = "CD223LY";

	/** Set CD223LY	  */
	public void setCD223LY (BigDecimal CD223LY);

	/** Get CD223LY	  */
	public BigDecimal getCD223LY();

    /** Column name CD224 */
    public static final String COLUMNNAME_CD224 = "CD224";

	/** Set CD224	  */
	public void setCD224 (BigDecimal CD224);

	/** Get CD224	  */
	public BigDecimal getCD224();

    /** Column name CD224LY */
    public static final String COLUMNNAME_CD224LY = "CD224LY";

	/** Set CD224LY	  */
	public void setCD224LY (BigDecimal CD224LY);

	/** Get CD224LY	  */
	public BigDecimal getCD224LY();

    /** Column name CD225 */
    public static final String COLUMNNAME_CD225 = "CD225";

	/** Set CD225	  */
	public void setCD225 (BigDecimal CD225);

	/** Get CD225	  */
	public BigDecimal getCD225();

    /** Column name CD225LY */
    public static final String COLUMNNAME_CD225LY = "CD225LY";

	/** Set CD225LY	  */
	public void setCD225LY (BigDecimal CD225LY);

	/** Get CD225LY	  */
	public BigDecimal getCD225LY();

    /** Column name CD226 */
    public static final String COLUMNNAME_CD226 = "CD226";

	/** Set CD226	  */
	public void setCD226 (BigDecimal CD226);

	/** Get CD226	  */
	public BigDecimal getCD226();

    /** Column name CD226LY */
    public static final String COLUMNNAME_CD226LY = "CD226LY";

	/** Set CD226LY	  */
	public void setCD226LY (BigDecimal CD226LY);

	/** Get CD226LY	  */
	public BigDecimal getCD226LY();

    /** Column name CD227 */
    public static final String COLUMNNAME_CD227 = "CD227";

	/** Set CD227	  */
	public void setCD227 (BigDecimal CD227);

	/** Get CD227	  */
	public BigDecimal getCD227();

    /** Column name CD227LY */
    public static final String COLUMNNAME_CD227LY = "CD227LY";

	/** Set CD227LY	  */
	public void setCD227LY (BigDecimal CD227LY);

	/** Get CD227LY	  */
	public BigDecimal getCD227LY();

    /** Column name CD228 */
    public static final String COLUMNNAME_CD228 = "CD228";

	/** Set CD228	  */
	public void setCD228 (BigDecimal CD228);

	/** Get CD228	  */
	public BigDecimal getCD228();

    /** Column name CD228LY */
    public static final String COLUMNNAME_CD228LY = "CD228LY";

	/** Set CD228LY	  */
	public void setCD228LY (BigDecimal CD228LY);

	/** Get CD228LY	  */
	public BigDecimal getCD228LY();

    /** Column name CD229 */
    public static final String COLUMNNAME_CD229 = "CD229";

	/** Set CD229	  */
	public void setCD229 (BigDecimal CD229);

	/** Get CD229	  */
	public BigDecimal getCD229();

    /** Column name CD229LY */
    public static final String COLUMNNAME_CD229LY = "CD229LY";

	/** Set CD229LY	  */
	public void setCD229LY (BigDecimal CD229LY);

	/** Get CD229LY	  */
	public BigDecimal getCD229LY();

    /** Column name CD230 */
    public static final String COLUMNNAME_CD230 = "CD230";

	/** Set CD230	  */
	public void setCD230 (BigDecimal CD230);

	/** Get CD230	  */
	public BigDecimal getCD230();

    /** Column name CD230LY */
    public static final String COLUMNNAME_CD230LY = "CD230LY";

	/** Set CD230LY	  */
	public void setCD230LY (BigDecimal CD230LY);

	/** Get CD230LY	  */
	public BigDecimal getCD230LY();

    /** Column name CD231 */
    public static final String COLUMNNAME_CD231 = "CD231";

	/** Set CD231	  */
	public void setCD231 (BigDecimal CD231);

	/** Get CD231	  */
	public BigDecimal getCD231();

    /** Column name CD231LY */
    public static final String COLUMNNAME_CD231LY = "CD231LY";

	/** Set CD231LY	  */
	public void setCD231LY (BigDecimal CD231LY);

	/** Get CD231LY	  */
	public BigDecimal getCD231LY();

    /** Column name CD232 */
    public static final String COLUMNNAME_CD232 = "CD232";

	/** Set CD232	  */
	public void setCD232 (BigDecimal CD232);

	/** Get CD232	  */
	public BigDecimal getCD232();

    /** Column name CD232LY */
    public static final String COLUMNNAME_CD232LY = "CD232LY";

	/** Set CD232LY	  */
	public void setCD232LY (BigDecimal CD232LY);

	/** Get CD232LY	  */
	public BigDecimal getCD232LY();

    /** Column name CD240 */
    public static final String COLUMNNAME_CD240 = "CD240";

	/** Set CD240	  */
	public void setCD240 (BigDecimal CD240);

	/** Get CD240	  */
	public BigDecimal getCD240();

    /** Column name CD240LY */
    public static final String COLUMNNAME_CD240LY = "CD240LY";

	/** Set CD240LY	  */
	public void setCD240LY (BigDecimal CD240LY);

	/** Get CD240LY	  */
	public BigDecimal getCD240LY();

    /** Column name CD241 */
    public static final String COLUMNNAME_CD241 = "CD241";

	/** Set CD241	  */
	public void setCD241 (BigDecimal CD241);

	/** Get CD241	  */
	public BigDecimal getCD241();

    /** Column name CD241LY */
    public static final String COLUMNNAME_CD241LY = "CD241LY";

	/** Set CD241LY	  */
	public void setCD241LY (BigDecimal CD241LY);

	/** Get CD241LY	  */
	public BigDecimal getCD241LY();

    /** Column name CD242 */
    public static final String COLUMNNAME_CD242 = "CD242";

	/** Set CD242	  */
	public void setCD242 (BigDecimal CD242);

	/** Get CD242	  */
	public BigDecimal getCD242();

    /** Column name CD242LY */
    public static final String COLUMNNAME_CD242LY = "CD242LY";

	/** Set CD242LY	  */
	public void setCD242LY (BigDecimal CD242LY);

	/** Get CD242LY	  */
	public BigDecimal getCD242LY();

    /** Column name CD250 */
    public static final String COLUMNNAME_CD250 = "CD250";

	/** Set CD250	  */
	public void setCD250 (BigDecimal CD250);

	/** Get CD250	  */
	public BigDecimal getCD250();

    /** Column name CD250LY */
    public static final String COLUMNNAME_CD250LY = "CD250LY";

	/** Set CD250LY	  */
	public void setCD250LY (BigDecimal CD250LY);

	/** Get CD250LY	  */
	public BigDecimal getCD250LY();

    /** Column name CD251 */
    public static final String COLUMNNAME_CD251 = "CD251";

	/** Set CD251	  */
	public void setCD251 (BigDecimal CD251);

	/** Get CD251	  */
	public BigDecimal getCD251();

    /** Column name CD251LY */
    public static final String COLUMNNAME_CD251LY = "CD251LY";

	/** Set CD251LY	  */
	public void setCD251LY (BigDecimal CD251LY);

	/** Get CD251LY	  */
	public BigDecimal getCD251LY();

    /** Column name CD252 */
    public static final String COLUMNNAME_CD252 = "CD252";

	/** Set CD252	  */
	public void setCD252 (BigDecimal CD252);

	/** Get CD252	  */
	public BigDecimal getCD252();

    /** Column name CD252LY */
    public static final String COLUMNNAME_CD252LY = "CD252LY";

	/** Set CD252LY	  */
	public void setCD252LY (BigDecimal CD252LY);

	/** Get CD252LY	  */
	public BigDecimal getCD252LY();

    /** Column name CD253 */
    public static final String COLUMNNAME_CD253 = "CD253";

	/** Set CD253	  */
	public void setCD253 (BigDecimal CD253);

	/** Get CD253	  */
	public BigDecimal getCD253();

    /** Column name CD253LY */
    public static final String COLUMNNAME_CD253LY = "CD253LY";

	/** Set CD253LY	  */
	public void setCD253LY (BigDecimal CD253LY);

	/** Get CD253LY	  */
	public BigDecimal getCD253LY();

    /** Column name CD254 */
    public static final String COLUMNNAME_CD254 = "CD254";

	/** Set CD254	  */
	public void setCD254 (BigDecimal CD254);

	/** Get CD254	  */
	public BigDecimal getCD254();

    /** Column name CD254LY */
    public static final String COLUMNNAME_CD254LY = "CD254LY";

	/** Set CD254LY	  */
	public void setCD254LY (BigDecimal CD254LY);

	/** Get CD254LY	  */
	public BigDecimal getCD254LY();

    /** Column name CD255 */
    public static final String COLUMNNAME_CD255 = "CD255";

	/** Set CD255	  */
	public void setCD255 (BigDecimal CD255);

	/** Get CD255	  */
	public BigDecimal getCD255();

    /** Column name CD255LY */
    public static final String COLUMNNAME_CD255LY = "CD255LY";

	/** Set CD255LY	  */
	public void setCD255LY (BigDecimal CD255LY);

	/** Get CD255LY	  */
	public BigDecimal getCD255LY();

    /** Column name CD260 */
    public static final String COLUMNNAME_CD260 = "CD260";

	/** Set CD260	  */
	public void setCD260 (BigDecimal CD260);

	/** Get CD260	  */
	public BigDecimal getCD260();

    /** Column name CD260LY */
    public static final String COLUMNNAME_CD260LY = "CD260LY";

	/** Set CD260LY	  */
	public void setCD260LY (BigDecimal CD260LY);

	/** Get CD260LY	  */
	public BigDecimal getCD260LY();

    /** Column name CD261 */
    public static final String COLUMNNAME_CD261 = "CD261";

	/** Set CD261	  */
	public void setCD261 (BigDecimal CD261);

	/** Get CD261	  */
	public BigDecimal getCD261();

    /** Column name CD261LY */
    public static final String COLUMNNAME_CD261LY = "CD261LY";

	/** Set CD261LY	  */
	public void setCD261LY (BigDecimal CD261LY);

	/** Get CD261LY	  */
	public BigDecimal getCD261LY();

    /** Column name CD262 */
    public static final String COLUMNNAME_CD262 = "CD262";

	/** Set CD262	  */
	public void setCD262 (BigDecimal CD262);

	/** Get CD262	  */
	public BigDecimal getCD262();

    /** Column name CD262LY */
    public static final String COLUMNNAME_CD262LY = "CD262LY";

	/** Set CD262LY	  */
	public void setCD262LY (BigDecimal CD262LY);

	/** Get CD262LY	  */
	public BigDecimal getCD262LY();

    /** Column name CD263 */
    public static final String COLUMNNAME_CD263 = "CD263";

	/** Set CD263	  */
	public void setCD263 (BigDecimal CD263);

	/** Get CD263	  */
	public BigDecimal getCD263();

    /** Column name CD263LY */
    public static final String COLUMNNAME_CD263LY = "CD263LY";

	/** Set CD263LY	  */
	public void setCD263LY (BigDecimal CD263LY);

	/** Get CD263LY	  */
	public BigDecimal getCD263LY();

    /** Column name CD268 */
    public static final String COLUMNNAME_CD268 = "CD268";

	/** Set CD268	  */
	public void setCD268 (BigDecimal CD268);

	/** Get CD268	  */
	public BigDecimal getCD268();

    /** Column name CD268LY */
    public static final String COLUMNNAME_CD268LY = "CD268LY";

	/** Set CD268LY	  */
	public void setCD268LY (BigDecimal CD268LY);

	/** Get CD268LY	  */
	public BigDecimal getCD268LY();

    /** Column name CD269 */
    public static final String COLUMNNAME_CD269 = "CD269";

	/** Set CD269	  */
	public void setCD269 (BigDecimal CD269);

	/** Get CD269	  */
	public BigDecimal getCD269();

    /** Column name CD269LY */
    public static final String COLUMNNAME_CD269LY = "CD269LY";

	/** Set CD269LY	  */
	public void setCD269LY (BigDecimal CD269LY);

	/** Get CD269LY	  */
	public BigDecimal getCD269LY();

    /** Column name CD270 */
    public static final String COLUMNNAME_CD270 = "CD270";

	/** Set CD270	  */
	public void setCD270 (BigDecimal CD270);

	/** Get CD270	  */
	public BigDecimal getCD270();

    /** Column name CD270LY */
    public static final String COLUMNNAME_CD270LY = "CD270LY";

	/** Set CD270LY	  */
	public void setCD270LY (BigDecimal CD270LY);

	/** Get CD270LY	  */
	public BigDecimal getCD270LY();

    /** Column name CD300 */
    public static final String COLUMNNAME_CD300 = "CD300";

	/** Set CD300	  */
	public void setCD300 (BigDecimal CD300);

	/** Get CD300	  */
	public BigDecimal getCD300();

    /** Column name CD300LY */
    public static final String COLUMNNAME_CD300LY = "CD300LY";

	/** Set CD300LY	  */
	public void setCD300LY (BigDecimal CD300LY);

	/** Get CD300LY	  */
	public BigDecimal getCD300LY();

    /** Column name CD310 */
    public static final String COLUMNNAME_CD310 = "CD310";

	/** Set CD310	  */
	public void setCD310 (BigDecimal CD310);

	/** Get CD310	  */
	public BigDecimal getCD310();

    /** Column name CD310LY */
    public static final String COLUMNNAME_CD310LY = "CD310LY";

	/** Set CD310LY	  */
	public void setCD310LY (BigDecimal CD310LY);

	/** Get CD310LY	  */
	public BigDecimal getCD310LY();

    /** Column name CD311 */
    public static final String COLUMNNAME_CD311 = "CD311";

	/** Set CD311	  */
	public void setCD311 (BigDecimal CD311);

	/** Get CD311	  */
	public BigDecimal getCD311();

    /** Column name CD311LY */
    public static final String COLUMNNAME_CD311LY = "CD311LY";

	/** Set CD311LY	  */
	public void setCD311LY (BigDecimal CD311LY);

	/** Get CD311LY	  */
	public BigDecimal getCD311LY();

    /** Column name CD312 */
    public static final String COLUMNNAME_CD312 = "CD312";

	/** Set CD312	  */
	public void setCD312 (BigDecimal CD312);

	/** Get CD312	  */
	public BigDecimal getCD312();

    /** Column name CD312LY */
    public static final String COLUMNNAME_CD312LY = "CD312LY";

	/** Set CD312LY	  */
	public void setCD312LY (BigDecimal CD312LY);

	/** Get CD312LY	  */
	public BigDecimal getCD312LY();

    /** Column name CD313 */
    public static final String COLUMNNAME_CD313 = "CD313";

	/** Set CD313	  */
	public void setCD313 (BigDecimal CD313);

	/** Get CD313	  */
	public BigDecimal getCD313();

    /** Column name CD313LY */
    public static final String COLUMNNAME_CD313LY = "CD313LY";

	/** Set CD313LY	  */
	public void setCD313LY (BigDecimal CD313LY);

	/** Get CD313LY	  */
	public BigDecimal getCD313LY();

    /** Column name CD314 */
    public static final String COLUMNNAME_CD314 = "CD314";

	/** Set CD314	  */
	public void setCD314 (BigDecimal CD314);

	/** Get CD314	  */
	public BigDecimal getCD314();

    /** Column name CD314LY */
    public static final String COLUMNNAME_CD314LY = "CD314LY";

	/** Set CD314LY	  */
	public void setCD314LY (BigDecimal CD314LY);

	/** Get CD314LY	  */
	public BigDecimal getCD314LY();

    /** Column name CD315 */
    public static final String COLUMNNAME_CD315 = "CD315";

	/** Set CD315	  */
	public void setCD315 (BigDecimal CD315);

	/** Get CD315	  */
	public BigDecimal getCD315();

    /** Column name CD315LY */
    public static final String COLUMNNAME_CD315LY = "CD315LY";

	/** Set CD315LY	  */
	public void setCD315LY (BigDecimal CD315LY);

	/** Get CD315LY	  */
	public BigDecimal getCD315LY();

    /** Column name CD316 */
    public static final String COLUMNNAME_CD316 = "CD316";

	/** Set CD316	  */
	public void setCD316 (BigDecimal CD316);

	/** Get CD316	  */
	public BigDecimal getCD316();

    /** Column name CD316LY */
    public static final String COLUMNNAME_CD316LY = "CD316LY";

	/** Set CD316LY	  */
	public void setCD316LY (BigDecimal CD316LY);

	/** Get CD316LY	  */
	public BigDecimal getCD316LY();

    /** Column name CD317 */
    public static final String COLUMNNAME_CD317 = "CD317";

	/** Set CD317	  */
	public void setCD317 (BigDecimal CD317);

	/** Get CD317	  */
	public BigDecimal getCD317();

    /** Column name CD317LY */
    public static final String COLUMNNAME_CD317LY = "CD317LY";

	/** Set CD317LY	  */
	public void setCD317LY (BigDecimal CD317LY);

	/** Get CD317LY	  */
	public BigDecimal getCD317LY();

    /** Column name CD318 */
    public static final String COLUMNNAME_CD318 = "CD318";

	/** Set CD318	  */
	public void setCD318 (BigDecimal CD318);

	/** Get CD318	  */
	public BigDecimal getCD318();

    /** Column name CD318LY */
    public static final String COLUMNNAME_CD318LY = "CD318LY";

	/** Set CD318LY	  */
	public void setCD318LY (BigDecimal CD318LY);

	/** Get CD318LY	  */
	public BigDecimal getCD318LY();

    /** Column name CD319 */
    public static final String COLUMNNAME_CD319 = "CD319";

	/** Set CD319	  */
	public void setCD319 (BigDecimal CD319);

	/** Get CD319	  */
	public BigDecimal getCD319();

    /** Column name CD319LY */
    public static final String COLUMNNAME_CD319LY = "CD319LY";

	/** Set CD319LY	  */
	public void setCD319LY (BigDecimal CD319LY);

	/** Get CD319LY	  */
	public BigDecimal getCD319LY();

    /** Column name CD320 */
    public static final String COLUMNNAME_CD320 = "CD320";

	/** Set CD320	  */
	public void setCD320 (BigDecimal CD320);

	/** Get CD320	  */
	public BigDecimal getCD320();

    /** Column name CD320LY */
    public static final String COLUMNNAME_CD320LY = "CD320LY";

	/** Set CD320LY	  */
	public void setCD320LY (BigDecimal CD320LY);

	/** Get CD320LY	  */
	public BigDecimal getCD320LY();

    /** Column name CD321 */
    public static final String COLUMNNAME_CD321 = "CD321";

	/** Set CD321	  */
	public void setCD321 (BigDecimal CD321);

	/** Get CD321	  */
	public BigDecimal getCD321();

    /** Column name CD321LY */
    public static final String COLUMNNAME_CD321LY = "CD321LY";

	/** Set CD321LY	  */
	public void setCD321LY (BigDecimal CD321LY);

	/** Get CD321LY	  */
	public BigDecimal getCD321LY();

    /** Column name CD322 */
    public static final String COLUMNNAME_CD322 = "CD322";

	/** Set CD322	  */
	public void setCD322 (BigDecimal CD322);

	/** Get CD322	  */
	public BigDecimal getCD322();

    /** Column name CD322LY */
    public static final String COLUMNNAME_CD322LY = "CD322LY";

	/** Set CD322LY	  */
	public void setCD322LY (BigDecimal CD322LY);

	/** Get CD322LY	  */
	public BigDecimal getCD322LY();

    /** Column name CD323 */
    public static final String COLUMNNAME_CD323 = "CD323";

	/** Set CD323	  */
	public void setCD323 (BigDecimal CD323);

	/** Get CD323	  */
	public BigDecimal getCD323();

    /** Column name CD323LY */
    public static final String COLUMNNAME_CD323LY = "CD323LY";

	/** Set CD323LY	  */
	public void setCD323LY (BigDecimal CD323LY);

	/** Get CD323LY	  */
	public BigDecimal getCD323LY();

    /** Column name CD324 */
    public static final String COLUMNNAME_CD324 = "CD324";

	/** Set CD324	  */
	public void setCD324 (BigDecimal CD324);

	/** Get CD324	  */
	public BigDecimal getCD324();

    /** Column name CD324LY */
    public static final String COLUMNNAME_CD324LY = "CD324LY";

	/** Set CD324LY	  */
	public void setCD324LY (BigDecimal CD324LY);

	/** Get CD324LY	  */
	public BigDecimal getCD324LY();

    /** Column name CD330 */
    public static final String COLUMNNAME_CD330 = "CD330";

	/** Set CD330	  */
	public void setCD330 (BigDecimal CD330);

	/** Get CD330	  */
	public BigDecimal getCD330();

    /** Column name CD330LY */
    public static final String COLUMNNAME_CD330LY = "CD330LY";

	/** Set CD330LY	  */
	public void setCD330LY (BigDecimal CD330LY);

	/** Get CD330LY	  */
	public BigDecimal getCD330LY();

    /** Column name CD331 */
    public static final String COLUMNNAME_CD331 = "CD331";

	/** Set CD331	  */
	public void setCD331 (BigDecimal CD331);

	/** Get CD331	  */
	public BigDecimal getCD331();

    /** Column name CD331LY */
    public static final String COLUMNNAME_CD331LY = "CD331LY";

	/** Set CD331LY	  */
	public void setCD331LY (BigDecimal CD331LY);

	/** Get CD331LY	  */
	public BigDecimal getCD331LY();

    /** Column name CD332 */
    public static final String COLUMNNAME_CD332 = "CD332";

	/** Set CD332	  */
	public void setCD332 (BigDecimal CD332);

	/** Get CD332	  */
	public BigDecimal getCD332();

    /** Column name CD332LY */
    public static final String COLUMNNAME_CD332LY = "CD332LY";

	/** Set CD332LY	  */
	public void setCD332LY (BigDecimal CD332LY);

	/** Get CD332LY	  */
	public BigDecimal getCD332LY();

    /** Column name CD333 */
    public static final String COLUMNNAME_CD333 = "CD333";

	/** Set CD333	  */
	public void setCD333 (BigDecimal CD333);

	/** Get CD333	  */
	public BigDecimal getCD333();

    /** Column name CD333LY */
    public static final String COLUMNNAME_CD333LY = "CD333LY";

	/** Set CD333LY	  */
	public void setCD333LY (BigDecimal CD333LY);

	/** Get CD333LY	  */
	public BigDecimal getCD333LY();

    /** Column name CD334 */
    public static final String COLUMNNAME_CD334 = "CD334";

	/** Set CD334	  */
	public void setCD334 (BigDecimal CD334);

	/** Get CD334	  */
	public BigDecimal getCD334();

    /** Column name CD334LY */
    public static final String COLUMNNAME_CD334LY = "CD334LY";

	/** Set CD334LY	  */
	public void setCD334LY (BigDecimal CD334LY);

	/** Get CD334LY	  */
	public BigDecimal getCD334LY();

    /** Column name CD335 */
    public static final String COLUMNNAME_CD335 = "CD335";

	/** Set CD335	  */
	public void setCD335 (BigDecimal CD335);

	/** Get CD335	  */
	public BigDecimal getCD335();

    /** Column name CD335LY */
    public static final String COLUMNNAME_CD335LY = "CD335LY";

	/** Set CD335LY	  */
	public void setCD335LY (BigDecimal CD335LY);

	/** Get CD335LY	  */
	public BigDecimal getCD335LY();

    /** Column name CD336 */
    public static final String COLUMNNAME_CD336 = "CD336";

	/** Set CD336	  */
	public void setCD336 (BigDecimal CD336);

	/** Get CD336	  */
	public BigDecimal getCD336();

    /** Column name CD336LY */
    public static final String COLUMNNAME_CD336LY = "CD336LY";

	/** Set CD336LY	  */
	public void setCD336LY (BigDecimal CD336LY);

	/** Get CD336LY	  */
	public BigDecimal getCD336LY();

    /** Column name CD337 */
    public static final String COLUMNNAME_CD337 = "CD337";

	/** Set CD337	  */
	public void setCD337 (BigDecimal CD337);

	/** Get CD337	  */
	public BigDecimal getCD337();

    /** Column name CD337LY */
    public static final String COLUMNNAME_CD337LY = "CD337LY";

	/** Set CD337LY	  */
	public void setCD337LY (BigDecimal CD337LY);

	/** Get CD337LY	  */
	public BigDecimal getCD337LY();

    /** Column name CD338 */
    public static final String COLUMNNAME_CD338 = "CD338";

	/** Set CD338	  */
	public void setCD338 (BigDecimal CD338);

	/** Get CD338	  */
	public BigDecimal getCD338();

    /** Column name CD338LY */
    public static final String COLUMNNAME_CD338LY = "CD338LY";

	/** Set CD338LY	  */
	public void setCD338LY (BigDecimal CD338LY);

	/** Get CD338LY	  */
	public BigDecimal getCD338LY();

    /** Column name CD339 */
    public static final String COLUMNNAME_CD339 = "CD339";

	/** Set CD339	  */
	public void setCD339 (BigDecimal CD339);

	/** Get CD339	  */
	public BigDecimal getCD339();

    /** Column name CD339LY */
    public static final String COLUMNNAME_CD339LY = "CD339LY";

	/** Set CD339LY	  */
	public void setCD339LY (BigDecimal CD339LY);

	/** Get CD339LY	  */
	public BigDecimal getCD339LY();

    /** Column name CD340 */
    public static final String COLUMNNAME_CD340 = "CD340";

	/** Set CD340	  */
	public void setCD340 (BigDecimal CD340);

	/** Get CD340	  */
	public BigDecimal getCD340();

    /** Column name CD340LY */
    public static final String COLUMNNAME_CD340LY = "CD340LY";

	/** Set CD340LY	  */
	public void setCD340LY (BigDecimal CD340LY);

	/** Get CD340LY	  */
	public BigDecimal getCD340LY();

    /** Column name CD341 */
    public static final String COLUMNNAME_CD341 = "CD341";

	/** Set CD341	  */
	public void setCD341 (BigDecimal CD341);

	/** Get CD341	  */
	public BigDecimal getCD341();

    /** Column name CD341LY */
    public static final String COLUMNNAME_CD341LY = "CD341LY";

	/** Set CD341LY	  */
	public void setCD341LY (BigDecimal CD341LY);

	/** Get CD341LY	  */
	public BigDecimal getCD341LY();

    /** Column name CD342 */
    public static final String COLUMNNAME_CD342 = "CD342";

	/** Set CD342	  */
	public void setCD342 (BigDecimal CD342);

	/** Get CD342	  */
	public BigDecimal getCD342();

    /** Column name CD342LY */
    public static final String COLUMNNAME_CD342LY = "CD342LY";

	/** Set CD342LY	  */
	public void setCD342LY (BigDecimal CD342LY);

	/** Get CD342LY	  */
	public BigDecimal getCD342LY();

    /** Column name CD343 */
    public static final String COLUMNNAME_CD343 = "CD343";

	/** Set CD343	  */
	public void setCD343 (BigDecimal CD343);

	/** Get CD343	  */
	public BigDecimal getCD343();

    /** Column name CD343LY */
    public static final String COLUMNNAME_CD343LY = "CD343LY";

	/** Set CD343LY	  */
	public void setCD343LY (BigDecimal CD343LY);

	/** Get CD343LY	  */
	public BigDecimal getCD343LY();

    /** Column name CD400 */
    public static final String COLUMNNAME_CD400 = "CD400";

	/** Set CD400	  */
	public void setCD400 (BigDecimal CD400);

	/** Get CD400	  */
	public BigDecimal getCD400();

    /** Column name CD400LY */
    public static final String COLUMNNAME_CD400LY = "CD400LY";

	/** Set CD400LY	  */
	public void setCD400LY (BigDecimal CD400LY);

	/** Get CD400LY	  */
	public BigDecimal getCD400LY();

    /** Column name CD410 */
    public static final String COLUMNNAME_CD410 = "CD410";

	/** Set CD410	  */
	public void setCD410 (BigDecimal CD410);

	/** Get CD410	  */
	public BigDecimal getCD410();

    /** Column name CD410LY */
    public static final String COLUMNNAME_CD410LY = "CD410LY";

	/** Set CD410LY	  */
	public void setCD410LY (BigDecimal CD410LY);

	/** Get CD410LY	  */
	public BigDecimal getCD410LY();

    /** Column name CD411 */
    public static final String COLUMNNAME_CD411 = "CD411";

	/** Set CD411	  */
	public void setCD411 (BigDecimal CD411);

	/** Get CD411	  */
	public BigDecimal getCD411();

    /** Column name CD411LY */
    public static final String COLUMNNAME_CD411LY = "CD411LY";

	/** Set CD411LY	  */
	public void setCD411LY (BigDecimal CD411LY);

	/** Get CD411LY	  */
	public BigDecimal getCD411LY();

    /** Column name CD411a */
    public static final String COLUMNNAME_CD411a = "CD411a";

	/** Set CD411a	  */
	public void setCD411a (BigDecimal CD411a);

	/** Get CD411a	  */
	public BigDecimal getCD411a();

    /** Column name CD411aLY */
    public static final String COLUMNNAME_CD411aLY = "CD411aLY";

	/** Set CD411aLY	  */
	public void setCD411aLY (BigDecimal CD411aLY);

	/** Get CD411aLY	  */
	public BigDecimal getCD411aLY();

    /** Column name CD411b */
    public static final String COLUMNNAME_CD411b = "CD411b";

	/** Set CD411b	  */
	public void setCD411b (BigDecimal CD411b);

	/** Get CD411b	  */
	public BigDecimal getCD411b();

    /** Column name CD411bLY */
    public static final String COLUMNNAME_CD411bLY = "CD411bLY";

	/** Set CD411bLY	  */
	public void setCD411bLY (BigDecimal CD411bLY);

	/** Get CD411bLY	  */
	public BigDecimal getCD411bLY();

    /** Column name CD412 */
    public static final String COLUMNNAME_CD412 = "CD412";

	/** Set CD412	  */
	public void setCD412 (BigDecimal CD412);

	/** Get CD412	  */
	public BigDecimal getCD412();

    /** Column name CD412LY */
    public static final String COLUMNNAME_CD412LY = "CD412LY";

	/** Set CD412LY	  */
	public void setCD412LY (BigDecimal CD412LY);

	/** Get CD412LY	  */
	public BigDecimal getCD412LY();

    /** Column name CD413 */
    public static final String COLUMNNAME_CD413 = "CD413";

	/** Set CD413	  */
	public void setCD413 (BigDecimal CD413);

	/** Get CD413	  */
	public BigDecimal getCD413();

    /** Column name CD413LY */
    public static final String COLUMNNAME_CD413LY = "CD413LY";

	/** Set CD413LY	  */
	public void setCD413LY (BigDecimal CD413LY);

	/** Get CD413LY	  */
	public BigDecimal getCD413LY();

    /** Column name CD414 */
    public static final String COLUMNNAME_CD414 = "CD414";

	/** Set CD414	  */
	public void setCD414 (BigDecimal CD414);

	/** Get CD414	  */
	public BigDecimal getCD414();

    /** Column name CD414LY */
    public static final String COLUMNNAME_CD414LY = "CD414LY";

	/** Set CD414LY	  */
	public void setCD414LY (BigDecimal CD414LY);

	/** Get CD414LY	  */
	public BigDecimal getCD414LY();

    /** Column name CD415 */
    public static final String COLUMNNAME_CD415 = "CD415";

	/** Set CD415	  */
	public void setCD415 (BigDecimal CD415);

	/** Get CD415	  */
	public BigDecimal getCD415();

    /** Column name CD415LY */
    public static final String COLUMNNAME_CD415LY = "CD415LY";

	/** Set CD415LY	  */
	public void setCD415LY (BigDecimal CD415LY);

	/** Get CD415LY	  */
	public BigDecimal getCD415LY();

    /** Column name CD416 */
    public static final String COLUMNNAME_CD416 = "CD416";

	/** Set CD416	  */
	public void setCD416 (BigDecimal CD416);

	/** Get CD416	  */
	public BigDecimal getCD416();

    /** Column name CD416LY */
    public static final String COLUMNNAME_CD416LY = "CD416LY";

	/** Set CD416LY	  */
	public void setCD416LY (BigDecimal CD416LY);

	/** Get CD416LY	  */
	public BigDecimal getCD416LY();

    /** Column name CD417 */
    public static final String COLUMNNAME_CD417 = "CD417";

	/** Set CD417	  */
	public void setCD417 (BigDecimal CD417);

	/** Get CD417	  */
	public BigDecimal getCD417();

    /** Column name CD417LY */
    public static final String COLUMNNAME_CD417LY = "CD417LY";

	/** Set CD417LY	  */
	public void setCD417LY (BigDecimal CD417LY);

	/** Get CD417LY	  */
	public BigDecimal getCD417LY();

    /** Column name CD418 */
    public static final String COLUMNNAME_CD418 = "CD418";

	/** Set CD418	  */
	public void setCD418 (BigDecimal CD418);

	/** Get CD418	  */
	public BigDecimal getCD418();

    /** Column name CD418LY */
    public static final String COLUMNNAME_CD418LY = "CD418LY";

	/** Set CD418LY	  */
	public void setCD418LY (BigDecimal CD418LY);

	/** Get CD418LY	  */
	public BigDecimal getCD418LY();

    /** Column name CD419 */
    public static final String COLUMNNAME_CD419 = "CD419";

	/** Set CD419	  */
	public void setCD419 (BigDecimal CD419);

	/** Get CD419	  */
	public BigDecimal getCD419();

    /** Column name CD419LY */
    public static final String COLUMNNAME_CD419LY = "CD419LY";

	/** Set CD419LY	  */
	public void setCD419LY (BigDecimal CD419LY);

	/** Get CD419LY	  */
	public BigDecimal getCD419LY();

    /** Column name CD420 */
    public static final String COLUMNNAME_CD420 = "CD420";

	/** Set CD420	  */
	public void setCD420 (BigDecimal CD420);

	/** Get CD420	  */
	public BigDecimal getCD420();

    /** Column name CD420LY */
    public static final String COLUMNNAME_CD420LY = "CD420LY";

	/** Set CD420LY	  */
	public void setCD420LY (BigDecimal CD420LY);

	/** Get CD420LY	  */
	public BigDecimal getCD420LY();

    /** Column name CD421 */
    public static final String COLUMNNAME_CD421 = "CD421";

	/** Set CD421	  */
	public void setCD421 (BigDecimal CD421);

	/** Get CD421	  */
	public BigDecimal getCD421();

    /** Column name CD421LY */
    public static final String COLUMNNAME_CD421LY = "CD421LY";

	/** Set CD421LY	  */
	public void setCD421LY (BigDecimal CD421LY);

	/** Get CD421LY	  */
	public BigDecimal getCD421LY();

    /** Column name CD421a */
    public static final String COLUMNNAME_CD421a = "CD421a";

	/** Set CD421a	  */
	public void setCD421a (BigDecimal CD421a);

	/** Get CD421a	  */
	public BigDecimal getCD421a();

    /** Column name CD421aLY */
    public static final String COLUMNNAME_CD421aLY = "CD421aLY";

	/** Set CD421aLY	  */
	public void setCD421aLY (BigDecimal CD421aLY);

	/** Get CD421aLY	  */
	public BigDecimal getCD421aLY();

    /** Column name CD421b */
    public static final String COLUMNNAME_CD421b = "CD421b";

	/** Set CD421b	  */
	public void setCD421b (BigDecimal CD421b);

	/** Get CD421b	  */
	public BigDecimal getCD421b();

    /** Column name CD421bLY */
    public static final String COLUMNNAME_CD421bLY = "CD421bLY";

	/** Set CD421bLY	  */
	public void setCD421bLY (BigDecimal CD421bLY);

	/** Get CD421bLY	  */
	public BigDecimal getCD421bLY();

    /** Column name CD422 */
    public static final String COLUMNNAME_CD422 = "CD422";

	/** Set CD422	  */
	public void setCD422 (BigDecimal CD422);

	/** Get CD422	  */
	public BigDecimal getCD422();

    /** Column name CD422LY */
    public static final String COLUMNNAME_CD422LY = "CD422LY";

	/** Set CD422LY	  */
	public void setCD422LY (BigDecimal CD422LY);

	/** Get CD422LY	  */
	public BigDecimal getCD422LY();

    /** Column name CD429 */
    public static final String COLUMNNAME_CD429 = "CD429";

	/** Set CD429	  */
	public void setCD429 (BigDecimal CD429);

	/** Get CD429	  */
	public BigDecimal getCD429();

    /** Column name CD429LY */
    public static final String COLUMNNAME_CD429LY = "CD429LY";

	/** Set CD429LY	  */
	public void setCD429LY (BigDecimal CD429LY);

	/** Get CD429LY	  */
	public BigDecimal getCD429LY();

    /** Column name CD430 */
    public static final String COLUMNNAME_CD430 = "CD430";

	/** Set CD430	  */
	public void setCD430 (BigDecimal CD430);

	/** Get CD430	  */
	public BigDecimal getCD430();

    /** Column name CD430LY */
    public static final String COLUMNNAME_CD430LY = "CD430LY";

	/** Set CD430LY	  */
	public void setCD430LY (BigDecimal CD430LY);

	/** Get CD430LY	  */
	public BigDecimal getCD430LY();

    /** Column name CD431 */
    public static final String COLUMNNAME_CD431 = "CD431";

	/** Set CD431	  */
	public void setCD431 (BigDecimal CD431);

	/** Get CD431	  */
	public BigDecimal getCD431();

    /** Column name CD431LY */
    public static final String COLUMNNAME_CD431LY = "CD431LY";

	/** Set CD431LY	  */
	public void setCD431LY (BigDecimal CD431LY);

	/** Get CD431LY	  */
	public BigDecimal getCD431LY();

    /** Column name CD432 */
    public static final String COLUMNNAME_CD432 = "CD432";

	/** Set CD432	  */
	public void setCD432 (BigDecimal CD432);

	/** Get CD432	  */
	public BigDecimal getCD432();

    /** Column name CD432LY */
    public static final String COLUMNNAME_CD432LY = "CD432LY";

	/** Set CD432LY	  */
	public void setCD432LY (BigDecimal CD432LY);

	/** Get CD432LY	  */
	public BigDecimal getCD432LY();

    /** Column name CD440 */
    public static final String COLUMNNAME_CD440 = "CD440";

	/** Set CD440	  */
	public void setCD440 (BigDecimal CD440);

	/** Get CD440	  */
	public BigDecimal getCD440();

    /** Column name CD440LY */
    public static final String COLUMNNAME_CD440LY = "CD440LY";

	/** Set CD440LY	  */
	public void setCD440LY (BigDecimal CD440LY);

	/** Get CD440LY	  */
	public BigDecimal getCD440LY();

    /** Column name Check_Hand_Input */
    public static final String COLUMNNAME_Check_Hand_Input = "Check_Hand_Input";

	/** Set Check_Hand_Input	  */
	public void setCheck_Hand_Input (boolean Check_Hand_Input);

	/** Get Check_Hand_Input	  */
	public boolean isCheck_Hand_Input();

    /** Column name Check_Upload_Excel */
    public static final String COLUMNNAME_Check_Upload_Excel = "Check_Upload_Excel";

	/** Set Check_Upload_Excel	  */
	public void setCheck_Upload_Excel (boolean Check_Upload_Excel);

	/** Get Check_Upload_Excel	  */
	public boolean isCheck_Upload_Excel();

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

    /** Column name IsRecordReject */
    public static final String COLUMNNAME_IsRecordReject = "IsRecordReject";

	/** Set IsRecordReject	  */
	public void setIsRecordReject (String IsRecordReject);

	/** Get IsRecordReject	  */
	public String getIsRecordReject();

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

    /** Column name LTC_20 */
    public static final String COLUMNNAME_LTC_20 = "LTC_20";

	/** Set LTC_20	  */
	public void setLTC_20 (BigDecimal LTC_20);

	/** Get LTC_20	  */
	public BigDecimal getLTC_20();

    /** Column name LTC_20LY */
    public static final String COLUMNNAME_LTC_20LY = "LTC_20LY";

	/** Set LTC_20LY	  */
	public void setLTC_20LY (BigDecimal LTC_20LY);

	/** Get LTC_20LY	  */
	public BigDecimal getLTC_20LY();

    /** Column name TDAB_Customer_Profile_ID */
    public static final String COLUMNNAME_TDAB_Customer_Profile_ID = "TDAB_Customer_Profile_ID";

	/** Set TDAB_Customer_Profile	  */
	public void setTDAB_Customer_Profile_ID (int TDAB_Customer_Profile_ID);

	/** Get TDAB_Customer_Profile	  */
	public int getTDAB_Customer_Profile_ID();

	public I_TDAB_Customer_Profile getTDAB_Customer_Profile() throws RuntimeException;

    /** Column name TDAB_Customer_Score_ID */
    public static final String COLUMNNAME_TDAB_Customer_Score_ID = "TDAB_Customer_Score_ID";

	/** Set TDAB_Customer_Score	  */
	public void setTDAB_Customer_Score_ID (int TDAB_Customer_Score_ID);

	/** Get TDAB_Customer_Score	  */
	public int getTDAB_Customer_Score_ID();

	public I_TDAB_Customer_Score getTDAB_Customer_Score() throws RuntimeException;

    /** Column name TDAB_Financial_ID */
    public static final String COLUMNNAME_TDAB_Financial_ID = "TDAB_Financial_ID";

	/** Set TDAB_Financial	  */
	public void setTDAB_Financial_ID (int TDAB_Financial_ID);

	/** Get TDAB_Financial	  */
	public int getTDAB_Financial_ID();

	public I_TDAB_Financial getTDAB_Financial() throws RuntimeException;

    /** Column name TDAB_Financial_Info_ID */
    public static final String COLUMNNAME_TDAB_Financial_Info_ID = "TDAB_Financial_Info_ID";

	/** Set TDAB_Financial_Info	  */
	public void setTDAB_Financial_Info_ID (int TDAB_Financial_Info_ID);

	/** Get TDAB_Financial_Info	  */
	public int getTDAB_Financial_Info_ID();

    /** Column name TDAB_Financial_Info_UU */
    public static final String COLUMNNAME_TDAB_Financial_Info_UU = "TDAB_Financial_Info_UU";

	/** Set TDAB_Financial_Info_UU	  */
	public void setTDAB_Financial_Info_UU (String TDAB_Financial_Info_UU);

	/** Get TDAB_Financial_Info_UU	  */
	public String getTDAB_Financial_Info_UU();

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

    /** Column name Year_Report */
    public static final String COLUMNNAME_Year_Report = "Year_Report";

	/** Set Year_Report.
	  * Năm báo cáo tài chính
	  */
	public void setYear_Report (String Year_Report);

	/** Get Year_Report.
	  * Năm báo cáo tài chính
	  */
	public String getYear_Report();

    /** Column name Year_Report_Ly */
    public static final String COLUMNNAME_Year_Report_Ly = "Year_Report_Ly";

	/** Set Year_Report_Ly.
	  * Năm trước năm báo cáo tài chính
	  */
	public void setYear_Report_Ly (String Year_Report_Ly);

	/** Get Year_Report_Ly.
	  * Năm trước năm báo cáo tài chính
	  */
	public String getYear_Report_Ly();
}
