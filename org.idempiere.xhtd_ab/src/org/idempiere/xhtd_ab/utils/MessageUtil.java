package org.idempiere.xhtd_ab.utils;

import org.compiere.util.Env;
import org.compiere.util.Msg;

public class MessageUtil {

	public static final String ERROR_DUPLICATE = "ERROR_DUPLICATE";
	public static final String ERROR_DUPLICATE_CODE = "ERROR_DUPLICATE_CODE";
	public static final String ERROR_FILE_TYPE = "Error_FileType";
	public static final String ERROR_FILE_BCTC_TYPE = "ERROR_FILE_BCTC_TYPE";
	public static final String INPUT_INVALID = "INPUT_INVALID";
	public static final String INPUT_LESSTHANZERO = "INPUT_LESSTHANZERO";
	public static final String INPUT_GREATERTHANZERO = "INPUT_GREATERTHANZERO";
	public static final String INVALID_FORMAT_VALUE = "INVALID_FORMAT_VALUE";
	public static final String INVALID_FORMAT_YEAR = "INVALID_FORMAT_YEAR";
	
	public static final String TDAB_SCORE_INDEX = "TDAB_SCORE_INDEX";
	public static final String TDAB_SCORE_INDEX_CHANGED = "TDAB_SCORE_INDEX_CHANGED";
	public static final String ERROR_NEW_FINANCIAL= "ERROR_NEW_FINANCIAL";
	public static final String ERROR_NEW_FINANCIAL_TYPE= "ERROR_NEW_FINANCIAL_TYPE";
	public static final String ERROR_NEW_NON_FINANCIAL= "ERROR_NEW_NON_FINANCIAL";
	public static final String ERROR_NEW_CIC= "ERROR_NEW_CIC";
	public static final String FILE_NOTEXIST= "FILE_NOTEXIST";
	public static final String ERROR_BCTC_1YEAR = "ERROR_BCTC_1YEAR";
	public static final String ERROR_SUGGEST_FILE_NULL = "ERROR_SUGGEST_FILE_NULL";
	
	public static final String ERROR_DOANH_THU = "ERROR_DOANH_THU";
	public static final String ERROR_DATE_CIC = "ERROR_DATE_CIC";
	public static final String ERROR_MAXLENGTH_NOTE = "ERROR_MAXLENGTH_NOTE";
	public static final String ERROR_DATE_REGISTER_KD = "ERROR_DATE_REGISTER_KD";
	
	public static final String VI_PHAM_KO = "VI_PHAM_KO";
	public static final String CHO_DUYET = "CHO_DUYET";
	public static final String CHO_TD_DUYET = "CHO_TD_DUYET";
	public static final String DUYET = "DUYET";
	public static final String TU_CHOI = "TU_CHOI";
	public static final String LOAI_HO_SO = "LOAI_HO_SO";
	public static final String ERROR_KO = "ERROR_KO";
	public static final String CHANGE_USER_SUCCESS = "CHANGE_USER_SUCCESS";
	
	public static final String ERROR_VALIDATE_BCTC="ERROR_VALIDATE_BCTC";

	public static final String ERROR_VALIDATE_NUMBER="ERROR_VALIDATE_NUMBER";
	public static final String ERROR_CD100= "ERROR_CD100";
	public static final String ERROR_CD110= "ERROR_CD110";
	public static final String ERROR_CD111= "ERROR_CD111";
	public static final String ERROR_CD112= "ERROR_CD112";
	public static final String ERROR_CD120= "ERROR_CD120";
	public static final String ERROR_CD121= "ERROR_CD121";
	public static final String ERROR_CD122= "ERROR_CD122";
	public static final String ERROR_CD123= "ERROR_CD123";
	public static final String ERROR_CD130= "ERROR_CD130";
	public static final String ERROR_CD131= "ERROR_CD131";
	public static final String ERROR_CD132= "ERROR_CD132";
	public static final String ERROR_CD133= "ERROR_CD133";
	public static final String ERROR_CD134= "ERROR_CD134";
	public static final String ERROR_CD135= "ERROR_CD135";
	public static final String ERROR_CD136= "ERROR_CD136";
	public static final String ERROR_CD137= "ERROR_CD137";
	public static final String ERROR_CD139= "ERROR_CD139";
	public static final String ERROR_CD140= "ERROR_CD140";
	public static final String ERROR_CD141= "ERROR_CD141";
	public static final String ERROR_CD149= "ERROR_CD149";
	public static final String ERROR_CD150= "ERROR_CD150";
	public static final String ERROR_CD151= "ERROR_CD151";
	public static final String ERROR_CD152= "ERROR_CD152";
	public static final String ERROR_CD153= "ERROR_CD153";
	public static final String ERROR_CD154= "ERROR_CD154";
	public static final String ERROR_CD155= "ERROR_CD155";
	public static final String ERROR_CD200= "ERROR_CD200";
	public static final String ERROR_CD210= "ERROR_CD210";
	public static final String ERROR_CD211= "ERROR_CD211";
	public static final String ERROR_CD212= "ERROR_CD212";
	public static final String ERROR_CD213= "ERROR_CD213";
	public static final String ERROR_CD214= "ERROR_CD214";
	public static final String ERROR_CD215= "ERROR_CD215";
	public static final String ERROR_CD216= "ERROR_CD216";
	public static final String ERROR_CD219= "ERROR_CD219";
	public static final String ERROR_CD220= "ERROR_CD220";
	public static final String ERROR_CD221= "ERROR_CD221";
	public static final String ERROR_CD222= "ERROR_CD222";
	public static final String ERROR_CD223= "ERROR_CD223";
	public static final String ERROR_CD224= "ERROR_CD224";
	public static final String ERROR_CD225= "ERROR_CD225";
	public static final String ERROR_CD226= "ERROR_CD226";
	public static final String ERROR_CD227= "ERROR_CD227";
	public static final String ERROR_CD228= "ERROR_CD228";
	public static final String ERROR_CD229= "ERROR_CD229";
	public static final String ERROR_CD230= "ERROR_CD230";
	public static final String ERROR_CD231= "ERROR_CD231";
	public static final String ERROR_CD232= "ERROR_CD232";
	public static final String ERROR_CD240= "ERROR_CD240";
	public static final String ERROR_CD241= "ERROR_CD241";
	public static final String ERROR_CD242= "ERROR_CD242";
	public static final String ERROR_CD250= "ERROR_CD250";
	public static final String ERROR_CD251= "ERROR_CD251";
	public static final String ERROR_CD252= "ERROR_CD252";
	public static final String ERROR_CD253= "ERROR_CD253";
	public static final String ERROR_CD254= "ERROR_CD254";
	public static final String ERROR_CD255= "ERROR_CD255";
	public static final String ERROR_CD260= "ERROR_CD260";
	public static final String ERROR_CD261= "ERROR_CD261";
	public static final String ERROR_CD262= "ERROR_CD262";
	public static final String ERROR_CD263= "ERROR_CD263";
	public static final String ERROR_CD268= "ERROR_CD268";
	public static final String ERROR_CD269= "ERROR_CD269";
	public static final String ERROR_CD270= "ERROR_CD270";
	public static final String ERROR_CD300= "ERROR_CD300";
	public static final String ERROR_CD310= "ERROR_CD310";
	public static final String ERROR_CD311= "ERROR_CD311";
	public static final String ERROR_CD312= "ERROR_CD312";
	public static final String ERROR_CD313= "ERROR_CD313";
	public static final String ERROR_CD314= "ERROR_CD314";
	public static final String ERROR_CD315= "ERROR_CD315";
	public static final String ERROR_CD316= "ERROR_CD316";
	public static final String ERROR_CD317= "ERROR_CD317";
	public static final String ERROR_CD318= "ERROR_CD318";
	public static final String ERROR_CD319= "ERROR_CD319";
	public static final String ERROR_CD320= "ERROR_CD320";
	public static final String ERROR_CD321= "ERROR_CD321";
	public static final String ERROR_CD322= "ERROR_CD322";
	public static final String ERROR_CD323= "ERROR_CD323";
	public static final String ERROR_CD324= "ERROR_CD324";
	public static final String ERROR_CD330= "ERROR_CD330";
	public static final String ERROR_CD331= "ERROR_CD331";
	public static final String ERROR_CD332= "ERROR_CD332";
	public static final String ERROR_CD333= "ERROR_CD333";
	public static final String ERROR_CD334= "ERROR_CD334";
	public static final String ERROR_CD335= "ERROR_CD335";
	public static final String ERROR_CD336= "ERROR_CD336";
	public static final String ERROR_CD337= "ERROR_CD337";
	public static final String ERROR_CD338= "ERROR_CD338";
	public static final String ERROR_CD339= "ERROR_CD339";
    public static final String ERROR_CD340= "ERROR_CD340";
	public static final String ERROR_CD341= "ERROR_CD341";
	public static final String ERROR_CD342= "ERROR_CD342";
	public static final String ERROR_CD343= "ERROR_CD343";
	public static final String ERROR_CD411= "ERROR_CD411";
	public static final String ERROR_CD411a= "ERROR_CD411a";
	public static final String ERROR_CD411b= "ERROR_CD411b";
	public static final String ERROR_CD413= "ERROR_CD413";
	public static final String ERROR_CD414= "ERROR_CD414";
	public static final String ERROR_CD415= "ERROR_CD415";
	public static final String ERROR_CD418= "ERROR_CD418";
	public static final String ERROR_CD419= "ERROR_CD419";
	public static final String ERROR_CD420= "ERROR_CD420";
	public static final String ERROR_CD422= "ERROR_CD422";
	public static final String ERROR_CD429= "ERROR_CD429";
	public static final String ERROR_CD430= "ERROR_CD430";
	public static final String ERROR_CD431= "ERROR_CD431";
	public static final String ERROR_CD432= "ERROR_CD432";
	public static final String ERROR_CD440= "ERROR_CD440";
	public static final String ERROR_KQ01= "ERROR_KQ01";
	public static final String ERROR_KQ02= "ERROR_KQ02";
	public static final String ERROR_KQ10= "ERROR_KQ10";
	public static final String ERROR_KQ11= "ERROR_KQ11";
	public static final String ERROR_KQ21= "ERROR_KQ21";
	public static final String ERROR_KQ31= "ERROR_KQ31";
	public static final String ERROR_KQ61= "ERROR_KQ61";
	public static final String ERROR_KQ62= "ERROR_KQ62";
	
	//check DUPLICATE so dang ky
	public static final String ERROR_DUPLICATE_NUMBER = "ERROR_DUPLICATE_NUMBER";
	// check do dai so dang ký
	public static final String ERROR_LENGTH_NUMBER = "ERROR_LENGTH_NUMBER";
	//check ten doanh nghiep
	public static final String ERROR_NAME_COMPANY = "ERROR_NAME_COMPANY";
	// check duplicate mst
	public static final String ERROR_DUPLICATE_TAXCODE = "ERROR_DUPLICATE_TAXCODE";
	// check thông tin khach hang da tao ho so cham diem
	public static final String ERROR_DUPLICATE_CUS = "ERROR_DUPLICATE_CUS";
	// check nhap chi so và dáu - của truog so dang ky
	public static final String ERROR_STRING = "ERROR_STRING";
	// check nhap chi so và dáu - của truog so dang ky
	public static final String ERROR_STRING_MST = "ERROR_STRING_MST";
	//check DUPLICATE bộ cau hoi
	public static final String ERROR_DUPLICATE_QUESTION = "ERROR_DUPLICATE_QUESTION";
	//check DUPLICATE KO
	public static final String ERROR_DUPLICATE_KO = "ERROR_DUPLICATE_KO";
	//check XOA BAN GHI TRANG THAI kt
	public static final String ERROR_DELETE_TS = "ERROR_DELETE_TS";
	// check number mã CIC
	public static final String ERROR_STRING_CIC = "ERROR_STRING_CIC";
	//check user chỉ nhập chữ và số
	public static final String ERROR_USER_LOGIN = "ERROR_USER_LOGIN";
	//check do dai user
	public static final String ERROR_LENGTH_USER = "ERROR_LENGTH_USER";
	//check nam kinh doanh phai > 1
	public static final String ERROR_YEARS_OPERATION = "ERROR_YEARS_OPERATION";
	//check CMT/CCCD
	public static final String ERROR_CCCD = "ERROR_CCCD";
	//check so du doanh nghiep da QHTD
	public static final String ERROR_AVERAGE_BALANCE_12_MONTH = "ERROR_AVERAGE_BALANCE_12_MONTH";
	//check loi xoa khach hang
	public static final String ERROR_DELETE_CUSTOMER = "ERROR_DELETE_CUSTOMER";
	//check cau tra loi KO_01 KO_02
	public static final String ERROR_ANSWER_KO = "ERROR_ANSWER_KO";
	//check ma CIC khi trinh duyet
	public static final String ERROR_ID_CIC = "ERROR_ID_CIC";
	
	// xet bat buoc cho cac truong trong man hinh thong tin tai chin
	public static final String ERROR_CD122_NULL = "ERROR_CD122_NULL";	
	public static final String ERROR_CD137_NULL = "ERROR_CD137_NULL";	
	public static final String ERROR_CD149_NULL = "ERROR_CD149_NULL";	
	public static final String ERROR_CD219_NULL = "ERROR_CD219_NULL";	
	public static final String ERROR_CD223_NULL = "ERROR_CD223_NULL";	
	public static final String ERROR_CD226_NULL = "ERROR_CD226_NULL";	
	public static final String ERROR_CD229_NULL = "ERROR_CD229_NULL";	
	public static final String ERROR_CD232_NULL = "ERROR_CD232_NULL";	
	public static final String ERROR_CD254_NULL = "ERROR_CD254_NULL";	
	public static final String ERROR_CD415_NULL = "ERROR_CD415_NULL";	
	public static final String ERROR_KQ70_NULL = "ERROR_KQ70_NULL";	
	public static final String ERROR_KQ71_NULL = "ERROR_KQ71_NULL";	
	
	public static final String ERROR_REJECT = "ERROR_REJECT";
	
	public static final String ERROR_YEAR_LY = "ERROR_YEAR_LY";
	public static final String ERROR_YEAR_NULL = "ERROR_YEAR_NULL";
	
	public static final String ERROR_YEAR_LY_NUM = "ERROR_YEAR_LY_NUM";
	public static final String ERROR_YEAR_NUM = "ERROR_YEAR_NUM";
	
	public static String getMessage(String key) {
		return Msg.getMsg(Env.getCtx(), key);
	}
}
