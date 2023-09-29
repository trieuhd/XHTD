package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.compiere.model.Query;
import org.compiere.model.X_AD_Role;
import org.compiere.model.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_History;
import org.idempiere.xhtd_ab.utils.CustomerScoreUtil;
import org.idempiere.xhtd_ab.utils.FileUtil;
import org.idempiere.xhtd_ab.utils.MessageUtil;


public class MFinancial extends X_TDAB_Financial{
	
	
	final static Logger logger = Logger.getLogger(MFinancial.class);
	private String b1Path=null;
	private String destFolderPath = null;
	private String b1Name= null;
	BigDecimal TT_0 = new BigDecimal(0);
	MBCTC_DN_B1 mbctc_DN = null;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MFinancial(Properties ctx, int TDAB_Financial_ID, String trxName) {
		super(ctx, TDAB_Financial_ID, trxName);
		
			
		}
	public MFinancial(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	
	
	private List<MFinancial> getFinancialByCustomerProfile(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(MFinancial.COLUMNNAME_TDAB_Customer_Profile_ID + "=?");
		return new Query(null, MFinancial.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).list();
	}
	
	
	private List<MFinancialHistory> getFinancialHistories(Integer mFinancial){
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialHistory.COLUMNNAME_TDAB_Financial_ID + "=?");
		return new Query(null, MFinancialHistory.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { mFinancial }).list();
	}
	
	private List<MBCTC_DN_B1> getBCTC(Integer mFinancial){
		StringBuilder whereClauseFinal = new StringBuilder(MBCTC_DN_B1.COLUMNNAME_TDAB_Financial_ID + "=?");
		return new Query(null, MBCTC_DN_B1.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { mFinancial }).list();
	}
	
	@Override
	protected boolean beforeDelete() {
	   MFinancial mInfoFinanceDN = new MFinancial(getCtx(), getTDAB_Financial_ID(), get_TrxName());
		List<MFinancialHistory> listHis = getFinancialHistories(mInfoFinanceDN.getTDAB_Financial_ID());
		
		for (MFinancialHistory i : listHis) {
			i.delete(true);
		}
		
		List<MBCTC_DN_B1> listBctc = getBCTC(mInfoFinanceDN.getTDAB_Financial_ID());
		
		for (MBCTC_DN_B1 i : listBctc) {
			i.delete(true);
		}
		
		mInfoFinanceDN.delete(true);
		return super.beforeDelete();
	}
	@Override
	protected boolean beforeSave(boolean newRecord) {
		logger.info("Before save...!");
		destFolderPath = FileUtil.getPath(get_TrxName());
		b1Path =  getBCTC_B1_File();
		b1Name = FileUtil.splitFileName(b1Path);
		
		List<MFinancial> mFinancial = getFinancialByCustomerProfile(getTDAB_Customer_Profile_ID());
		
		
		if (newRecord) {
			if (mFinancial.size()!=0) {
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_NEW_FINANCIAL));
			}
		}
		
//		if (!b1Path.endsWith("xls") && !b1Path.endsWith("xlsx")) {
//			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_FILE_BCTC_TYPE));
//		}
        
		
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = new Date();
			String currentDate = dateFormat.format(date);
			FileUtil.copyFile(Paths.get(getBCTC_B1_File()),Paths.get(destFolderPath ,currentDate+"_"+getTDAB_Customer_Profile_ID()+"_"+b1Name));
			Files.delete(Paths.get(getBCTC_B1_File()));
			File file1 = new File(Paths.get(destFolderPath,currentDate+"_"+getTDAB_Customer_Profile_ID()+"_"+b1Name).toString());
			logger.info("Path file: "+file1.getAbsolutePath());
			setBCTC_B1_File(destFolderPath + currentDate+"_"+getTDAB_Customer_Profile_ID()+"_"+b1Name);
			mbctc_DN = insertBCTCB1_DB(file1, getTDAB_Customer_Profile_ID(), newRecord);
			
		} catch (IOException e) {
			logger.error("Error before save: "+e.getLocalizedMessage());
			e.printStackTrace();
		}
		
		return super.beforeSave(newRecord);
	}
	
	
	
//	private boolean isCheckDuplicate(boolean newRecord, int profileId) {
//		if (!newRecord)
//			return false;
//		StringBuilder sql = new StringBuilder("SELECT COUNT(1) FROM ").append(MFinancial.Table_Name);
//		sql.append(" WHERE ").append(MFinancial.COLUMNNAME_TDAB_Customer_Score_ID);
//		sql.append(" = ? ");
//		int count = DB.getSQLValue(get_TrxName(), sql.toString(), new Object[] { profileId });
//		if (count > 0)
//			return true;
//		return false;
//	}

	public MFinancial(MCustomerScore mCustomerScore) {
		// TODO Auto-generated constructor stub
		this (mCustomerScore.getCtx(), 0, mCustomerScore.get_TrxName());
		if (mCustomerScore.get_ID() == 0)
			throw new IllegalArgumentException("Header not saved");
		setTDAB_Customer_Score_ID(mCustomerScore.getTDAB_Customer_Score_ID());
	}
	
	private List<MFinancialHistory> getHistoryByIdAndUser(Integer id, Integer financial_id){
		logger.info("Get History by User Id: "+id+" and Financial Id: "+financial_id);
		StringBuilder whereClauseFinal = new StringBuilder(MFinancialHistory.COLUMNNAME_CreatedBy + "=? AND "+MFinancialHistory.COLUMNNAME_TDAB_Financial_ID+ "=?");
		return new Query(null, MFinancialHistory.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id , financial_id}).list();
	}
	
	
	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		logger.info("After save...");
		logger.info("Customer profile id: "+getTDAB_Customer_Profile_ID());
		logger.info("Financial id: "+getTDAB_Financial_ID());
		MFinancialHistory mFinancialHistory = null;
		// TODO Auto-generated method stub
		CustomerScoreUtil.setStatusApproved(getTDAB_Customer_Profile_ID(),
				MCustomerProfile.COLUMNNAME_StatusFinance);
		
	    mbctc_DN.setTDAB_Financial_ID(getTDAB_Financial_ID());
	    mbctc_DN.save();
	    
	    List<MFinancialHistory> listFinanHis = getHistoryByIdAndUser(Env.getAD_User_ID(getCtx()),getTDAB_Financial_ID());
	    if (listFinanHis.size()==0) { 
	    	mFinancialHistory = new MFinancialHistory(getCtx(), 0, get_TrxName());
	    	mFinancialHistory.setTDAB_Financial_ID(getTDAB_Financial_ID());
	    } else {
	    	mFinancialHistory = listFinanHis.get(0);
	    }
	    
		mFinancialHistory.setSHORT_TERM_ASSETS(getSHORT_TERM_ASSETS());
		mFinancialHistory.setSHORT_TERM_ASSETS_LY(getSHORT_TERM_ASSETS_LY());
	    
		mFinancialHistory.setLONG_TERM_ASSETS(getLONG_TERM_ASSETS());
		mFinancialHistory.setLONG_TERM_ASSETS_LY(getLONG_TERM_ASSETS_LY());  
	    
		mFinancialHistory.setTotal_Assets(getTotal_Assets());
		mFinancialHistory.setTotal_Assets_LY(getTotal_Assets_LY());
	    
		mFinancialHistory.setLiabilities(getLiabilities());
		mFinancialHistory.setLiabilities_LY(getLiabilities_LY());
	    
		mFinancialHistory.setOwner_Equity(getOwner_Equity());
		mFinancialHistory.setOwner_Equity_LY(getOwner_Equity_LY());
	    
		mFinancialHistory.setTotal_Resources(getTotal_Resources());
		mFinancialHistory.setTotal_Resources_LY(getTotal_Resources_LY());
		
		mFinancialHistory.setBCTC_B1_File(getBCTC_B1_File().replace(" ", ""));
		Integer userID= Env.getAD_User_ID(getCtx());
		X_AD_User user = getUserById(userID);
		
		Integer roleID= Env.getAD_User_ID(getCtx());
		if (roleID == 1000036 || roleID == 1000030) {
			mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_CVQHKH);
		} else if(roleID == 1000031) {
			mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_KSV);
		} else if (roleID == 1000032) {
			mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_TDTD);
		}
		else
		mFinancialHistory.setRoleCreated(X_TDAB_Financial_History.ROLECREATED_CVQHKH);
		mFinancialHistory.setHisCreatedBy(user.getName());
		mFinancialHistory.save();
	    
		return super.afterSave(newRecord, success);
	}
	
	private X_AD_User getUserById(Integer id) {
		StringBuilder whereClauseFinal = new StringBuilder(X_AD_User.COLUMNNAME_AD_User_ID + "=?");
		return new Query(null, X_AD_User.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { id }).first();
	}
	
	
	
	private Integer validateCell(double cell) {
			if (cell> 0) {
				return 1;
			} else if (cell<0){
			   return -1;
			} else return 0;
	}
	
	private Exception throwException(Workbook workbook, String msg) throws IOException {
		workbook.close();
		throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), msg));
	}


	protected MBCTC_DN_B1 insertBCTCB1_DB(File file, int TDAB_Customer_Profile_ID, boolean newRecord) throws IOException {
		MBCTC_DN_B1 mbctc_DN_B1 = null;
		if (newRecord) {
		  mbctc_DN_B1 = new MBCTC_DN_B1(getCtx(), 0, get_TrxName());
		} else {
			MFinancial old = new MFinancial(getCtx(), getTDAB_Financial_ID(), get_TrxName());
			List<MBCTC_DN_B1> list = getBCTC(old.getTDAB_Financial_ID());
			mbctc_DN_B1 = list.get(0);
		}
		
		int mbctc_DN_B1_ID = 0;
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = null;
		if (file.getPath().endsWith("xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (file.getPath().endsWith("xls")) {
			workbook = new HSSFWorkbook(inputStream);
		} else {
			inputStream.close();
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_FILE_BCTC_TYPE));
		}
	
		
		
		Sheet firstSheet = workbook.getSheetAt(0);
		mbctc_DN_B1.setTDAB_Customer_Profile_ID(TDAB_Customer_Profile_ID);
		mbctc_DN_B1.setTDAB_Financial_ID(getTDAB_Financial_ID());
		
		
		
		if (validateCell(firstSheet.getRow(17).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(17).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD100);
		}
		
		if (validateCell(firstSheet.getRow(18).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(18).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD110);
		}
		
		if (validateCell(firstSheet.getRow(19).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(19).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD111);
		}
		
		if (validateCell(firstSheet.getRow(20).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(20).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD112);
		}
		
		if (validateCell(firstSheet.getRow(21).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(21).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD120);
		}
		
		if (validateCell(firstSheet.getRow(22).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(22).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD121);
		}
		
		if (validateCell(firstSheet.getRow(23).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(23).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD122);
		}
		
		if (validateCell(firstSheet.getRow(24).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(24).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD123);
		}
		
		if (validateCell(firstSheet.getRow(25).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(25).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD130);
		}
		
		if (validateCell(firstSheet.getRow(26).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(26).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD131);
		}
		
		if (validateCell(firstSheet.getRow(27).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(27).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD132);
		}
		
		if (validateCell(firstSheet.getRow(28).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(28).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD133);
		}
		
		if (validateCell(firstSheet.getRow(29).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(29).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD134);
		}
		
		if (validateCell(firstSheet.getRow(30).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(30).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD135);
		}
		
		if (validateCell(firstSheet.getRow(31).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(31).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD136);
		}
		
		if (validateCell(firstSheet.getRow(32).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(32).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD137);
		}
		
		if (validateCell(firstSheet.getRow(33).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(33).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD139);
		}
		
		if (validateCell(firstSheet.getRow(34).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(34).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD140);
		}
		
		if (validateCell(firstSheet.getRow(35).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(35).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD141);
		}
		
		if (validateCell(firstSheet.getRow(36).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(36).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD149);
		}
		
		if (validateCell(firstSheet.getRow(37).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(37).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD150);
		}
		
		if (validateCell(firstSheet.getRow(38).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(38).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD151);
		}
		
		if (validateCell(firstSheet.getRow(39).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(39).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD152);
		}
		
		if (validateCell(firstSheet.getRow(40).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(40).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD153);
		}
		
		if (validateCell(firstSheet.getRow(41).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(41).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD154);
		}
		
		if (validateCell(firstSheet.getRow(42).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(42).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD155);
		}
		
		if (validateCell(firstSheet.getRow(44).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(44).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD200);
		}
		
		if (validateCell(firstSheet.getRow(45).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(45).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD210);
		}
		
		if (validateCell(firstSheet.getRow(46).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(46).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD211);
		}
		
		if (validateCell(firstSheet.getRow(47).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(47).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD212);
		}
		
		if (validateCell(firstSheet.getRow(48).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(48).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD213);
		}
		
		if (validateCell(firstSheet.getRow(49).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(49).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD214);
		}
		if (validateCell(firstSheet.getRow(50).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(50).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD215);
		}
		if (validateCell(firstSheet.getRow(51).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(51).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD216);
		}
		if (validateCell(firstSheet.getRow(52).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(52).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD219);
		}
		if (validateCell(firstSheet.getRow(53).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(53).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD220);
		}
		if (validateCell(firstSheet.getRow(54).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(54).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD221);
		}
		if (validateCell(firstSheet.getRow(55).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(55).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD222);
		}
		if (validateCell(firstSheet.getRow(56).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(56).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD223);
		}
		if (validateCell(firstSheet.getRow(57).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(57).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD224);
		}
		if (validateCell(firstSheet.getRow(58).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(58).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD225);
		}
		if (validateCell(firstSheet.getRow(59).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(59).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD226);
		}
		if (validateCell(firstSheet.getRow(60).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(60).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD227);
		}
		if (validateCell(firstSheet.getRow(61).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(61).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD228);
		}
		if (validateCell(firstSheet.getRow(62).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(62).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD229);
		}
		if (validateCell(firstSheet.getRow(63).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(63).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD230);
		}
		if (validateCell(firstSheet.getRow(64).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(64).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD231);
		}
		if (validateCell(firstSheet.getRow(65).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(65).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD232);
		}
		if (validateCell(firstSheet.getRow(66).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(66).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD240);
		}
		if (validateCell(firstSheet.getRow(67).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(67).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD241);
		}
		if (validateCell(firstSheet.getRow(68).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(68).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD242);
		}
		if (validateCell(firstSheet.getRow(69).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(69).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD250);
		}
		if (validateCell(firstSheet.getRow(70).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(70).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD251);
		}
		if (validateCell(firstSheet.getRow(71).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(71).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD252);
		}
		if (validateCell(firstSheet.getRow(72).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(72).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD253);
		}
		if (validateCell(firstSheet.getRow(73).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(73).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD254);
		}
		if (validateCell(firstSheet.getRow(74).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(74).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD255);
		}
		if (validateCell(firstSheet.getRow(75).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(75).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD260);
		}
		if (validateCell(firstSheet.getRow(76).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(76).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD261);
		}
		if (validateCell(firstSheet.getRow(77).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(77).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD262);
		}
		if (validateCell(firstSheet.getRow(78).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(78).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD263);
		}
		if (validateCell(firstSheet.getRow(79).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(79).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD268);
		}
//		if (validateCell(firstSheet.getRow(80).getCell(6).getNumericCellValue())==-1||
//				validateCell(firstSheet.getRow(80).getCell(4).getNumericCellValue())==-1) {
//			throwException(workbook, MessageUtil.ERROR_CD269);
//		}
		if (validateCell(firstSheet.getRow(81).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(81).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD270);
		}
		if (validateCell(firstSheet.getRow(84).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(84).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD300);
		}
		if (validateCell(firstSheet.getRow(85).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(85).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD310);
		}
		if (validateCell(firstSheet.getRow(86).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(86).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD311);
		}
		if (validateCell(firstSheet.getRow(87).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(87).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD312);
		}
//		if (validateCell(firstSheet.getRow(88).getCell(6).getNumericCellValue())==-1||
//				validateCell(firstSheet.getRow(88).getCell(4).getNumericCellValue())==-1) {
//			throwException(workbook, MessageUtil.ERROR_CD313);
//		}
		if (validateCell(firstSheet.getRow(89).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(89).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD314);
		}
		if (validateCell(firstSheet.getRow(90).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(90).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD315);
		}
		if (validateCell(firstSheet.getRow(91).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(91).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD316);
		}
		if (validateCell(firstSheet.getRow(92).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(92).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD317);
		}
		if (validateCell(firstSheet.getRow(93).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(93).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD318);
		}
		if (validateCell(firstSheet.getRow(94).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(94).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD319);
		}
		if (validateCell(firstSheet.getRow(95).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(95).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD320);
		}
		if (validateCell(firstSheet.getRow(96).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(96).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD321);
		}
		if (validateCell(firstSheet.getRow(97).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(97).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD322);
		}
//		if (validateCell(firstSheet.getRow(98).getCell(6).getNumericCellValue())==-1||
//				validateCell(firstSheet.getRow(98).getCell(4).getNumericCellValue())==-1) {
//			throwException(workbook, MessageUtil.ERROR_CD323);
//		}
		if (validateCell(firstSheet.getRow(99).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(99).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD324);
		}
		if (validateCell(firstSheet.getRow(100).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(100).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD330);
		}
		if (validateCell(firstSheet.getRow(101).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(101).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD331);
		}
		if (validateCell(firstSheet.getRow(102).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(102).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD332);
		}
		if (validateCell(firstSheet.getRow(103).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(103).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD333);
		}
		if (validateCell(firstSheet.getRow(104).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(104).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD334);
		}
		if (validateCell(firstSheet.getRow(105).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(105).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD335);
		}
		if (validateCell(firstSheet.getRow(106).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(106).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD336);
		}
//		if (validateCell(firstSheet.getRow(107).getCell(6).getNumericCellValue())==-1||
//				validateCell(firstSheet.getRow(107).getCell(4).getNumericCellValue())==-1) {
//			throwException(workbook, MessageUtil.ERROR_CD337);
//		}
		if (validateCell(firstSheet.getRow(108).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(108).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD338);
		}
		if (validateCell(firstSheet.getRow(109).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(109).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD339);
		}
		if (validateCell(firstSheet.getRow(110).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(110).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD340);
		}
		if (validateCell(firstSheet.getRow(111).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(111).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD341);
		}
		if (validateCell(firstSheet.getRow(112).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(112).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD342);
		}
		if (validateCell(firstSheet.getRow(113).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(113).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD343);
		}
		if (validateCell(firstSheet.getRow(116).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(116).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD411);
		}
		if (validateCell(firstSheet.getRow(117).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(117).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD411a);
		}
		if (validateCell(firstSheet.getRow(118).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(118).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD411b);
		}
		
		if (validateCell(firstSheet.getRow(120).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(120).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD413);
		}
		if (validateCell(firstSheet.getRow(121).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(121).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD414);
		}
		if (validateCell(firstSheet.getRow(122).getCell(6).getNumericCellValue())==1||
				validateCell(firstSheet.getRow(122).getCell(4).getNumericCellValue())==1) {
			throwException(workbook, MessageUtil.ERROR_CD415);
		}
		if (validateCell(firstSheet.getRow(125).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(125).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD418);
		}
		if (validateCell(firstSheet.getRow(126).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(126).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD419);
		}
		if (validateCell(firstSheet.getRow(127).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(127).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD420);
		}
		if (validateCell(firstSheet.getRow(131).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(131).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD422);
		}
		if (validateCell(firstSheet.getRow(132).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(132).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD429);
		}
		if (validateCell(firstSheet.getRow(133).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(133).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD430);
		}
		if (validateCell(firstSheet.getRow(134).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(134).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD431);
		}
		if (validateCell(firstSheet.getRow(135).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(135).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD432);
		}
		if (validateCell(firstSheet.getRow(136).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(136).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_CD440);
		}		
		if (validateCell(firstSheet.getRow(141).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(141).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_KQ01);
		}
		if (validateCell(firstSheet.getRow(142).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(142).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_KQ02);
		}
		if (validateCell(firstSheet.getRow(143).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(143).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_KQ10);
		}
		if (validateCell(firstSheet.getRow(144).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(144).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_KQ11);
		}
		if (validateCell(firstSheet.getRow(146).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(146).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_KQ21);
		}
		if (validateCell(firstSheet.getRow(153).getCell(6).getNumericCellValue())==-1||
				validateCell(firstSheet.getRow(153).getCell(4).getNumericCellValue())==-1) {
			throwException(workbook, MessageUtil.ERROR_KQ31);
		}
//		if (validateCell(firstSheet.getRow(160).getCell(6).getNumericCellValue())==-1||
//				validateCell(firstSheet.getRow(160).getCell(4).getNumericCellValue())==-1) {
//			throwException(workbook, MessageUtil.ERROR_KQ61);
//		}
//		if (validateCell(firstSheet.getRow(161).getCell(6).getNumericCellValue())==-1||
//				validateCell(firstSheet.getRow(161).getCell(4).getNumericCellValue())==-1) {
//			throwException(workbook, MessageUtil.ERROR_KQ62);
//		}
		
		if (firstSheet.getRow(81).getCell(4).getNumericCellValue()==0
				|| firstSheet.getRow(136).getCell(4).getNumericCellValue()==0) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_BCTC_1YEAR));
		}
		
		
		if (firstSheet.getRow(81).getCell(6).getNumericCellValue()!=firstSheet.getRow(136).getCell(6).getNumericCellValue()
				|| firstSheet.getRow(81).getCell(4).getNumericCellValue()!=firstSheet.getRow(136).getCell(4).getNumericCellValue()) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_VALIDATE_BCTC));
		}
		
		
		mbctc_DN_B1.setCD100(new BigDecimal(firstSheet.getRow(17).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD100LY(new BigDecimal(firstSheet.getRow(17).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD110(new BigDecimal(firstSheet.getRow(18).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD110LY(new BigDecimal(firstSheet.getRow(18).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD111(new BigDecimal(firstSheet.getRow(19).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD111LY(new BigDecimal(firstSheet.getRow(19).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD112(new BigDecimal(firstSheet.getRow(20).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD112LY(new BigDecimal(firstSheet.getRow(20).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD120(new BigDecimal(firstSheet.getRow(21).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD120LY(new BigDecimal(firstSheet.getRow(21).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD121(new BigDecimal(firstSheet.getRow(22).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD121LY(new BigDecimal(firstSheet.getRow(22).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD122(new BigDecimal(firstSheet.getRow(23).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD122LY(new BigDecimal(firstSheet.getRow(23).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD123(new BigDecimal(firstSheet.getRow(24).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD123LY(new BigDecimal(firstSheet.getRow(24).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD130(new BigDecimal(firstSheet.getRow(25).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD130LY(new BigDecimal(firstSheet.getRow(25).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD131(new BigDecimal(firstSheet.getRow(26).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD131LY(new BigDecimal(firstSheet.getRow(26).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD132(new BigDecimal(firstSheet.getRow(27).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD132LY(new BigDecimal(firstSheet.getRow(27).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD133(new BigDecimal(firstSheet.getRow(28).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD133LY(new BigDecimal(firstSheet.getRow(28).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD134(new BigDecimal(firstSheet.getRow(29).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD134LY(new BigDecimal(firstSheet.getRow(29).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD135(new BigDecimal(firstSheet.getRow(30).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD135LY(new BigDecimal(firstSheet.getRow(30).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD136(new BigDecimal(firstSheet.getRow(31).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD136LY(new BigDecimal(firstSheet.getRow(31).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD137(new BigDecimal(firstSheet.getRow(32).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD137LY(new BigDecimal(firstSheet.getRow(32).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD139(new BigDecimal(firstSheet.getRow(33).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD139LY(new BigDecimal(firstSheet.getRow(33).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD140(new BigDecimal(firstSheet.getRow(34).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD140LY(new BigDecimal(firstSheet.getRow(34).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD141(new BigDecimal(firstSheet.getRow(35).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD141LY(new BigDecimal(firstSheet.getRow(35).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD149(new BigDecimal(firstSheet.getRow(36).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD149LY(new BigDecimal(firstSheet.getRow(36).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD150(new BigDecimal(firstSheet.getRow(37).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD150LY(new BigDecimal(firstSheet.getRow(37).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD151(new BigDecimal(firstSheet.getRow(38).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD151LY(new BigDecimal(firstSheet.getRow(38).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD152(new BigDecimal(firstSheet.getRow(39).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD152LY(new BigDecimal(firstSheet.getRow(39).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD153(new BigDecimal(firstSheet.getRow(40).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD153LY(new BigDecimal(firstSheet.getRow(40).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD154(new BigDecimal(firstSheet.getRow(41).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD154LY(new BigDecimal(firstSheet.getRow(41).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD155(new BigDecimal(firstSheet.getRow(42).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD155LY(new BigDecimal(firstSheet.getRow(42).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD200(new BigDecimal(firstSheet.getRow(44).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD200LY(new BigDecimal(firstSheet.getRow(44).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD210(new BigDecimal(firstSheet.getRow(45).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD210LY(new BigDecimal(firstSheet.getRow(45).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD211(new BigDecimal(firstSheet.getRow(46).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD211LY(new BigDecimal(firstSheet.getRow(46).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD212(new BigDecimal(firstSheet.getRow(47).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD212LY(new BigDecimal(firstSheet.getRow(47).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD213(new BigDecimal(firstSheet.getRow(48).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD213LY(new BigDecimal(firstSheet.getRow(48).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD214(new BigDecimal(firstSheet.getRow(49).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD214LY(new BigDecimal(firstSheet.getRow(49).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD215(new BigDecimal(firstSheet.getRow(50).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD215LY(new BigDecimal(firstSheet.getRow(50).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD216(new BigDecimal(firstSheet.getRow(51).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD216LY(new BigDecimal(firstSheet.getRow(51).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD219(new BigDecimal(firstSheet.getRow(52).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD219LY(new BigDecimal(firstSheet.getRow(52).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD220(new BigDecimal(firstSheet.getRow(53).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD220LY(new BigDecimal(firstSheet.getRow(53).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD221(new BigDecimal(firstSheet.getRow(54).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD221LY(new BigDecimal(firstSheet.getRow(54).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD222(new BigDecimal(firstSheet.getRow(55).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD222LY(new BigDecimal(firstSheet.getRow(55).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD223(new BigDecimal(firstSheet.getRow(56).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD223LY(new BigDecimal(firstSheet.getRow(56).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD224(new BigDecimal(firstSheet.getRow(57).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD224LY(new BigDecimal(firstSheet.getRow(57).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD225(new BigDecimal(firstSheet.getRow(58).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD225LY(new BigDecimal(firstSheet.getRow(58).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD226(new BigDecimal(firstSheet.getRow(59).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD226LY(new BigDecimal(firstSheet.getRow(59).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD227(new BigDecimal(firstSheet.getRow(60).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD227LY(new BigDecimal(firstSheet.getRow(60).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD228(new BigDecimal(firstSheet.getRow(61).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD228LY(new BigDecimal(firstSheet.getRow(61).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD229(new BigDecimal(firstSheet.getRow(62).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD229LY(new BigDecimal(firstSheet.getRow(62).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD230(new BigDecimal(firstSheet.getRow(63).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD230LY(new BigDecimal(firstSheet.getRow(63).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD231(new BigDecimal(firstSheet.getRow(64).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD231LY(new BigDecimal(firstSheet.getRow(64).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD232(new BigDecimal(firstSheet.getRow(65).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD232LY(new BigDecimal(firstSheet.getRow(65).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD240(new BigDecimal(firstSheet.getRow(66).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD240LY(new BigDecimal(firstSheet.getRow(66).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD241(new BigDecimal(firstSheet.getRow(67).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD241LY(new BigDecimal(firstSheet.getRow(67).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD242(new BigDecimal(firstSheet.getRow(68).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD242LY(new BigDecimal(firstSheet.getRow(68).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD250(new BigDecimal(firstSheet.getRow(69).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD250LY(new BigDecimal(firstSheet.getRow(69).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD251(new BigDecimal(firstSheet.getRow(70).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD251LY(new BigDecimal(firstSheet.getRow(70).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD252(new BigDecimal(firstSheet.getRow(71).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD252LY(new BigDecimal(firstSheet.getRow(71).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD253(new BigDecimal(firstSheet.getRow(72).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD253LY(new BigDecimal(firstSheet.getRow(72).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD254(new BigDecimal(firstSheet.getRow(73).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD254LY(new BigDecimal(firstSheet.getRow(73).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD255(new BigDecimal(firstSheet.getRow(74).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD255LY(new BigDecimal(firstSheet.getRow(74).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD260(new BigDecimal(firstSheet.getRow(75).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD260LY(new BigDecimal(firstSheet.getRow(75).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD261(new BigDecimal(firstSheet.getRow(76).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD261LY(new BigDecimal(firstSheet.getRow(76).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD262(new BigDecimal(firstSheet.getRow(77).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD262LY(new BigDecimal(firstSheet.getRow(77).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD263(new BigDecimal(firstSheet.getRow(78).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD263LY(new BigDecimal(firstSheet.getRow(78).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD268(new BigDecimal(firstSheet.getRow(79).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD268LY(new BigDecimal(firstSheet.getRow(79).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD269(new BigDecimal(firstSheet.getRow(80).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD269LY(new BigDecimal(firstSheet.getRow(80).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD270(new BigDecimal(firstSheet.getRow(81).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD270LY(new BigDecimal(firstSheet.getRow(81).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD300(new BigDecimal(firstSheet.getRow(84).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD300LY(new BigDecimal(firstSheet.getRow(84).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD310(new BigDecimal(firstSheet.getRow(85).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD310LY(new BigDecimal(firstSheet.getRow(85).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD311(new BigDecimal(firstSheet.getRow(86).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD311LY(new BigDecimal(firstSheet.getRow(86).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD312(new BigDecimal(firstSheet.getRow(87).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD312LY(new BigDecimal(firstSheet.getRow(87).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD313(new BigDecimal(firstSheet.getRow(88).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD313LY(new BigDecimal(firstSheet.getRow(88).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD314(new BigDecimal(firstSheet.getRow(89).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD314LY(new BigDecimal(firstSheet.getRow(89).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD315(new BigDecimal(firstSheet.getRow(90).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD315LY(new BigDecimal(firstSheet.getRow(90).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD316(new BigDecimal(firstSheet.getRow(91).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD316LY(new BigDecimal(firstSheet.getRow(91).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD317(new BigDecimal(firstSheet.getRow(92).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD317LY(new BigDecimal(firstSheet.getRow(92).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD318(new BigDecimal(firstSheet.getRow(93).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD318LY(new BigDecimal(firstSheet.getRow(93).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD319(new BigDecimal(firstSheet.getRow(94).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD319LY(new BigDecimal(firstSheet.getRow(94).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD320(new BigDecimal(firstSheet.getRow(95).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD320LY(new BigDecimal(firstSheet.getRow(95).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD321(new BigDecimal(firstSheet.getRow(96).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD321LY(new BigDecimal(firstSheet.getRow(96).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD322(new BigDecimal(firstSheet.getRow(97).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD322LY(new BigDecimal(firstSheet.getRow(97).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD323(new BigDecimal(firstSheet.getRow(98).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD323LY(new BigDecimal(firstSheet.getRow(98).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD324(new BigDecimal(firstSheet.getRow(99).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD324LY(new BigDecimal(firstSheet.getRow(99).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD330(new BigDecimal(firstSheet.getRow(100).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD330LY(new BigDecimal(firstSheet.getRow(100).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD331(new BigDecimal(firstSheet.getRow(101).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD331LY(new BigDecimal(firstSheet.getRow(101).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD332(new BigDecimal(firstSheet.getRow(102).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD332LY(new BigDecimal(firstSheet.getRow(102).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD333(new BigDecimal(firstSheet.getRow(103).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD333LY(new BigDecimal(firstSheet.getRow(103).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD334(new BigDecimal(firstSheet.getRow(104).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD334LY(new BigDecimal(firstSheet.getRow(104).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD335(new BigDecimal(firstSheet.getRow(105).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD335LY(new BigDecimal(firstSheet.getRow(105).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD336(new BigDecimal(firstSheet.getRow(106).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD336LY(new BigDecimal(firstSheet.getRow(106).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD337(new BigDecimal(firstSheet.getRow(107).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD337LY(new BigDecimal(firstSheet.getRow(107).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD338(new BigDecimal(firstSheet.getRow(108).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD338LY(new BigDecimal(firstSheet.getRow(108).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD339(new BigDecimal(firstSheet.getRow(109).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD339LY(new BigDecimal(firstSheet.getRow(109).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD340(new BigDecimal(firstSheet.getRow(110).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD340LY(new BigDecimal(firstSheet.getRow(110).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD341(new BigDecimal(firstSheet.getRow(111).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD341LY(new BigDecimal(firstSheet.getRow(111).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD342(new BigDecimal(firstSheet.getRow(112).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD342LY(new BigDecimal(firstSheet.getRow(112).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD343(new BigDecimal(firstSheet.getRow(113).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD343LY(new BigDecimal(firstSheet.getRow(113).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD400(new BigDecimal(firstSheet.getRow(114).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD400LY(new BigDecimal(firstSheet.getRow(114).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD410(new BigDecimal(firstSheet.getRow(115).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD410LY(new BigDecimal(firstSheet.getRow(115).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD411(new BigDecimal(firstSheet.getRow(116).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD411LY(new BigDecimal(firstSheet.getRow(116).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD411a(new BigDecimal(firstSheet.getRow(117).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD411aLY(new BigDecimal(firstSheet.getRow(117).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD411b(new BigDecimal(firstSheet.getRow(118).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD411bLY(new BigDecimal(firstSheet.getRow(118).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD412(new BigDecimal(firstSheet.getRow(119).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD412LY(new BigDecimal(firstSheet.getRow(119).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD413(new BigDecimal(firstSheet.getRow(120).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD413LY(new BigDecimal(firstSheet.getRow(120).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD414(new BigDecimal(firstSheet.getRow(121).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD414LY(new BigDecimal(firstSheet.getRow(121).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD415(new BigDecimal(firstSheet.getRow(122).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD415LY(new BigDecimal(firstSheet.getRow(122).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD416(new BigDecimal(firstSheet.getRow(123).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD416LY(new BigDecimal(firstSheet.getRow(123).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD417(new BigDecimal(firstSheet.getRow(124).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD417LY(new BigDecimal(firstSheet.getRow(124).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD418(new BigDecimal(firstSheet.getRow(125).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD418LY(new BigDecimal(firstSheet.getRow(125).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD419(new BigDecimal(firstSheet.getRow(126).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD419LY(new BigDecimal(firstSheet.getRow(126).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD420(new BigDecimal(firstSheet.getRow(127).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD420LY(new BigDecimal(firstSheet.getRow(127).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD421(new BigDecimal(firstSheet.getRow(128).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD421LY(new BigDecimal(firstSheet.getRow(128).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD421a(new BigDecimal(firstSheet.getRow(129).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD421aLY(new BigDecimal(firstSheet.getRow(129).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD421b(new BigDecimal(firstSheet.getRow(130).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD421bLY(new BigDecimal(firstSheet.getRow(130).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD422(new BigDecimal(firstSheet.getRow(131).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD422LY(new BigDecimal(firstSheet.getRow(131).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD429(new BigDecimal(firstSheet.getRow(132).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD429LY(new BigDecimal(firstSheet.getRow(132).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD430(new BigDecimal(firstSheet.getRow(133).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD430LY(new BigDecimal(firstSheet.getRow(133).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD431(new BigDecimal(firstSheet.getRow(134).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD431LY(new BigDecimal(firstSheet.getRow(134).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD432(new BigDecimal(firstSheet.getRow(135).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD432LY(new BigDecimal(firstSheet.getRow(135).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setCD440(new BigDecimal(firstSheet.getRow(136).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setCD440LY(new BigDecimal(firstSheet.getRow(136).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ01(new BigDecimal(firstSheet.getRow(141).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ01LY(new BigDecimal(firstSheet.getRow(141).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ02(new BigDecimal(firstSheet.getRow(142).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ02LY(new BigDecimal(firstSheet.getRow(142).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ10(new BigDecimal(firstSheet.getRow(143).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ10LY(new BigDecimal(firstSheet.getRow(143).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ11(new BigDecimal(firstSheet.getRow(144).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ11LY(new BigDecimal(firstSheet.getRow(144).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ20(new BigDecimal(firstSheet.getRow(145).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ20LY(new BigDecimal(firstSheet.getRow(145).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ21(new BigDecimal(firstSheet.getRow(146).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ21LY(new BigDecimal(firstSheet.getRow(146).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ22(new BigDecimal(firstSheet.getRow(147).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ22LY(new BigDecimal(firstSheet.getRow(147).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ23(new BigDecimal(firstSheet.getRow(148).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ23LY(new BigDecimal(firstSheet.getRow(148).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ24(new BigDecimal(firstSheet.getRow(149).getCell(4).getNumericCellValue()));
		mbctc_DN_B1.setKQ24LY(new BigDecimal(firstSheet.getRow(149).getCell(6).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ25(new BigDecimal(firstSheet.getRow(150).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ25LY(new BigDecimal(firstSheet.getRow(150).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ26(new BigDecimal(firstSheet.getRow(151).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ26LY(new BigDecimal(firstSheet.getRow(151).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ30(new BigDecimal(firstSheet.getRow(152).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ30LY(new BigDecimal(firstSheet.getRow(152).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ31(new BigDecimal(firstSheet.getRow(153).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ31LY(new BigDecimal(firstSheet.getRow(153).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ32(new BigDecimal(firstSheet.getRow(154).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ32LY(new BigDecimal(firstSheet.getRow(154).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ40(new BigDecimal(firstSheet.getRow(155).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ40LY(new BigDecimal(firstSheet.getRow(155).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ50(new BigDecimal(firstSheet.getRow(156).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ50LY(new BigDecimal(firstSheet.getRow(156).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ51(new BigDecimal(firstSheet.getRow(157).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ51LY(new BigDecimal(firstSheet.getRow(157).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ52(new BigDecimal(firstSheet.getRow(158).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ52LY(new BigDecimal(firstSheet.getRow(158).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ60(new BigDecimal(firstSheet.getRow(159).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ60LY(new BigDecimal(firstSheet.getRow(159).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ61(new BigDecimal(firstSheet.getRow(160).getCell(4).getNumericCellValue()));
		mbctc_DN_B1.setKQ61LY(new BigDecimal(firstSheet.getRow(160).getCell(6).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ62(new BigDecimal(firstSheet.getRow(161).getCell(4).getNumericCellValue()));
		mbctc_DN_B1.setKQ62LY(new BigDecimal(firstSheet.getRow(161).getCell(6).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ70(new BigDecimal(firstSheet.getRow(162).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ70LY(new BigDecimal(firstSheet.getRow(162).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setKQ71(new BigDecimal(firstSheet.getRow(163).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setKQ71LY(new BigDecimal(firstSheet.getRow(163).getCell(4).getNumericCellValue()));
		
		mbctc_DN_B1.setLTC_20(new BigDecimal(firstSheet.getRow(167).getCell(6).getNumericCellValue()));
		mbctc_DN_B1.setLTC_20LY(new BigDecimal(firstSheet.getRow(167).getCell(4).getNumericCellValue()));
		
	    mbctc_DN_B1.save();
	    mbctc_DN_B1_ID = mbctc_DN_B1.getTDAB_BCTC_DN_B1_ID();
	    
	    setCash_And_Cash_Equivalents(mbctc_DN_B1.getCD110());
	    setCash_And_Cash_Equivalents_LY(mbctc_DN_B1.getCD110LY());
	    
	    setSHORT_TERM_ASSETS(mbctc_DN_B1.getCD100());
	    setSHORT_TERM_ASSETS_LY(mbctc_DN_B1.getCD100LY());
	    
	    setLONG_TERM_ASSETS(mbctc_DN_B1.getCD200());
	    setLONG_TERM_ASSETS_LY(mbctc_DN_B1.getCD200LY());
	    
	    setshort_Term_Investment(mbctc_DN_B1.getCD120());
	    setshort_Term_Investment_LY(mbctc_DN_B1.getCD120LY());
	    
	    setShort_Term_Receivable(mbctc_DN_B1.getCD130());
	    setShort_Term_Receivable_LY(mbctc_DN_B1.getCD130LY());
	    
	    setInventories(mbctc_DN_B1.getCD140());
	    setInventories_LY(mbctc_DN_B1.getCD140LY());
	    
	    setOther_Short_Term_Assets(mbctc_DN_B1.getCD150());
	    setOther_Short_Term_Assets_LY(mbctc_DN_B1.getCD150LY());
	    
	    setLong_Term_Receivables(mbctc_DN_B1.getCD210());
	    setLong_Term_Receivables_LY(mbctc_DN_B1.getCD210LY());
	    
	    setFixed_Assets(mbctc_DN_B1.getCD220());
	    setFixed_Assets_LY(mbctc_DN_B1.getCD220LY());
	    
	    setReal_Estate_Investment(mbctc_DN_B1.getCD230());
	    setReal_Estate_Investment_LY(mbctc_DN_B1.getCD230LY());
	    
	    setLong_Term_Financial_Investment(mbctc_DN_B1.getCD250());
	    setLong_Term_Financial_Invest_LY(mbctc_DN_B1.getCD250LY());
	    
	    setOther_Long_Term_Assets(mbctc_DN_B1.getCD260());
	    setOther_Long_Term_Assets_LY(mbctc_DN_B1.getCD260LY());
	    
	    setTotal_Assets(mbctc_DN_B1.getCD270());
	    setTotal_Assets_LY(mbctc_DN_B1.getCD270LY());
	    
	    setLiabilities(mbctc_DN_B1.getCD300());
	    setLiabilities_LY(mbctc_DN_B1.getCD300LY());
	    
	    setCurrent_Liabilities(mbctc_DN_B1.getCD310());
	    setCurrent_Liabilities_LY(mbctc_DN_B1.getCD310LY());
	    
	    setLong_Term_Liabilities(mbctc_DN_B1.getCD330());
	    setLong_Term_Liabilities_LY(mbctc_DN_B1.getCD330LY());
	    
	    setOwner_Equity(mbctc_DN_B1.getCD410());
	    setOwner_Equity_LY(mbctc_DN_B1.getCD410LY());
	    
	    setBonus_And_Welfare_Fund(mbctc_DN_B1.getCD430());
	    setBonus_And_Welfare_Fund_LY(mbctc_DN_B1.getCD430LY());
	    
	    setTotal_Resources(mbctc_DN_B1.getCD440());
	    setTotal_Resources_LY(mbctc_DN_B1.getCD440LY());
	    
	    
	    setRevenue_Goods_Sold_Service(mbctc_DN_B1.getKQ10());
	    setRevenue_Goods_Sold_Service_LY(mbctc_DN_B1.getKQ10LY());
	    
		setProfit_Goods_Sold_Service(mbctc_DN_B1.getKQ20());
		setProfit_Goods_Sold_Service_LY(mbctc_DN_B1.getKQ20LY());
		
		setOperating_Profit(mbctc_DN_B1.getKQ30());
		setOperating_Profit_LY(mbctc_DN_B1.getKQ30LY());
		
		setProfit_Other_Activities(mbctc_DN_B1.getKQ40());
		setProfit_Other_Activities_LY(mbctc_DN_B1.getKQ40LY());
		
		setProfit_Before_Tax(mbctc_DN_B1.getKQ50());
		setProfit_Before_Tax_LY(mbctc_DN_B1.getKQ50LY());
		
		setProfit_After_Tax(mbctc_DN_B1.getKQ60());
		setProfit_After_Tax_LY(mbctc_DN_B1.getKQ60LY());
		
	    workbook.close();
	    
	    if(!getBCTC_B1_File().equalsIgnoreCase(getBCTC_B1_File().replace(" ", ""))) {
	    // File (or directory) with old name
	 		File file1 = new File(getBCTC_B1_File());

	 		// File (or directory) with new name
	 		File file2 = new File(getBCTC_B1_File().replace(" ", ""));

	 		if (file2.exists())
	 		   throw new java.io.IOException("file exists");
	 			
	 		// Rename file (or directory)
	 		file1.renameTo(file2);
	 		
	 		 setBCTC_B1_File(file2.getAbsolutePath());
	    }
	    
	   
		return mbctc_DN_B1;
	    
	}
	
	
}
