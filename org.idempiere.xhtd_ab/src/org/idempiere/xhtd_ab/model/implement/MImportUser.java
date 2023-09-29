package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_FILE_IMPORT;
import org.idempiere.xhtd_ab.utils.Logutil;
import org.idempiere.xhtd_ab.utils.MessageUtil;

import com.google.gson.Gson;

public class MImportUser extends X_TDAB_FILE_IMPORT {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static Logger logger = Logger.getLogger(MImportUser.class);
	protected static Gson gson = new Gson();

	private String path;

	public MImportUser(Properties ctx, int TDAB_FILE_IMPORT_ID, String trxName) {
		super(ctx, TDAB_FILE_IMPORT_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MImportUser(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	@SuppressWarnings("resource")
	@Override
	protected boolean beforeSave(boolean newRecord) {

		// TODO Auto-generated method stub
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {
		Logutil.config();
		logger = Logger.getLogger(MImportUser.class);
		logger.info("Start import user.............." + getFile_Upload());
		File file = new File(getFile_Upload());
		try {
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
			for(int i = 1 ;i<firstSheet.getPhysicalNumberOfRows();i++) {
				try {
					Row row = firstSheet.getRow(i);
					MUserImport user = new MUserImport(getCtx(), 0, get_TrxName());
					user.setDescription(row.getCell(0).getStringCellValue());
					user.setTitle((row.getCell(1).getStringCellValue()));
					user.setName(row.getCell(2).getStringCellValue());
					user.setEMail(row.getCell(3).getStringCellValue());
					user.setLDAPUser(row.getCell(4).getStringCellValue());
					user.setOrg_Value(row.getCell(5).getStringCellValue());
					user.setAD_Role_ID(Integer.valueOf((row.getCell(6).getStringCellValue())));
					user.setTDAB_FILE_IMPORT_ID(getTDAB_FILE_IMPORT_ID());
					user.save();
				}
				catch (Exception e) {
					logger.info("Error when call ------------"+i);
					continue;
				}
			
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_FILE_BCTC_TYPE));
		}

		return super.afterSave(newRecord, success);
	}
	

}
