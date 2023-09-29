package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_Read_File;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MReadFile extends X_Read_File {
	private File file1;
	private String sourceFilePath = "";
	private Object obj;
	public MReadFile(Properties ctx, int Read_File_ID, String trxName) {
		super(ctx, Read_File_ID, trxName);
		
			
		}
	public MReadFile(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean beforeSave(boolean newRecord) {
		// TODO Auto-generated method stub
		
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
					System.out.println("row.getCell(1)-"+row.getCell(2));
					try {
						
						
						File file1 = new File("C:\\Users\\trieunh\\Desktop\\testfile\\"+row.getCell(3)+".xlsx");
						FileInputStream inputStream1 = new FileInputStream(file1);
						Workbook workbook1 = null;
						try {
							workbook1 = new XSSFWorkbook(inputStream1);
							Sheet firstSheet = workbook1.getSheetAt(0);
							System.out.println(new BigDecimal(firstSheet.getRow(17).getCell(6).getNumericCellValue()));
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
}
