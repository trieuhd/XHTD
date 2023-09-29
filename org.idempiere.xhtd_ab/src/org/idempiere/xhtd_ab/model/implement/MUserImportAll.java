package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.compiere.model.MOrg;
import org.compiere.model.Query;
import org.compiere.model.X_AD_Org;
import org.compiere.model.X_AD_User;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_FILE_CHANGE_USER;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MUserImportAll extends X_TDAB_FILE_CHANGE_USER {

	private String sourceFilePath = "";
	private Object obj;

	public MUserImportAll(Properties ctx, int X_TDAB_FILE_CHANGE_USER_ID, String trxName) {
		super(ctx, X_TDAB_FILE_CHANGE_USER_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MUserImportAll(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	synchronized protected boolean beforeSave(boolean newRecord) {
		sourceFilePath = getFile_Upload();
		System.out.println("sourceFilePath::" + sourceFilePath);
		return super.beforeSave(newRecord);
	}

	@Override
	protected boolean afterSave(boolean newRecord, boolean success) {

		insertExToDB(new File(sourceFilePath));
		return true;
	}

	public boolean insertExToDB(File file) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			long start = System.currentTimeMillis();

			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = null;
			if (file.getPath().endsWith("xlsx")) {
				workbook = new XSSFWorkbook(inputStream);
			} else if (file.getPath().endsWith("xls")) {
				workbook = new HSSFWorkbook(inputStream);
			} else {
				inputStream.close();
				throw new IllegalArgumentException(Msg.getMsg(Env.getCtx(), MessageUtil.ERROR_FILE_TYPE));
			}
//            CallableStatement statement = DB.prepareCall("call CREATE_USER_ORG(?,?,?,?,?)");  
			Iterator<Sheet> sheetIterator = workbook.sheetIterator();
			while (sheetIterator.hasNext()) {
				Sheet sheet = sheetIterator.next();
				int rowNum = sheet.getLastRowNum();
				for (int i = 1; i <= rowNum; i++) {
					Row row = sheet.getRow(i);

					MCustomer mCustomer = getByCusValue(String.valueOf(row.getCell(1)));
					if (mCustomer != null){
						MOrg orgId = getOrgByValue(String.valueOf(row.getCell(6)));
						MXHTD user = getUserByValue(String.valueOf(row.getCell(7)));
						mCustomer.setAD_Org_ID_Hander(orgId.getAD_Org_ID());
						mCustomer.setAD_Org_ID(orgId.getAD_Org_ID());
						mCustomer.setUser_Handover_ID(user.getAD_User_ID());
						mCustomer.save();
						
						//set org and user in profile
						List<MCustomerProfile> profiles = MCustomer.getListCustomerProfile(mCustomer.getTDAB_Customer_ID());
						if (!CollectionUtils.isEmpty(profiles)) {
							for (MCustomerProfile profile : profiles) {
								profile.setAD_Org_ID_Hander(orgId.getAD_Org_ID());
								profile.setUser_Handover_ID(user.getAD_User_ID());
								profile.save();
							}
						}
					}
				}
			}
			Files.delete(Paths.get(sourceFilePath));
			long end = System.currentTimeMillis();
			System.out.printf("Import done in %d ms\n", (end - start));
			workbook.close();
		} catch (IOException ex1) {
			System.out.println("Error reading file");
			ex1.printStackTrace();
			return false;
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getLocalizedMessage(), e);
			return false;
		} finally {
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;

		}
		return true;
	}

	public static MXHTD getUserByValue(String profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MXHTD.COLUMNNAME_Name + "=?");
		return new Query(null, MXHTD.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}

	public static MCustomer getByCusValue(String profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MCustomer.COLUMNNAME_TaxCode + "=?");
		return new Query(null, MCustomer.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}
	
	public static MOrg getOrgByValue(String profileId) {
		StringBuilder whereClauseFinal = new StringBuilder(MOrg.COLUMNNAME_Value + "=?");
		return new Query(null, MOrg.Table_Name, whereClauseFinal.toString(), null)
				.setParameters(new Object[] { profileId }).first();
	}

}
