package org.idempiere.xhtd_ab.model.implement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Level;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.idempiere.xhtd_ab.model.X_TDAB_FILE_UPLOAD;
import org.idempiere.xhtd_ab.utils.MessageUtil;

public class MTDABFileUpload extends X_TDAB_FILE_UPLOAD {

	private String sourceFilePath = "";
	private Object obj;

	public MTDABFileUpload(Properties ctx, int X_TDAB_FILE_UPLOAD_ID, String trxName) {
		super(ctx, X_TDAB_FILE_UPLOAD_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MTDABFileUpload(Properties ctx, ResultSet rs, String trxName) {
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
				for (int i = 0; i <= rowNum; i++) {
					Row row = sheet.getRow(i);
					
				
//					String[] words=row.getCell(1).getStringCellValue().split("\\_",3);
//					
//					System.out.println(words[2]);

					try {
						System.out.print(String.valueOf(row.getCell(1)) + " ");
						File file1 = new File("D:\\XHTD\\152\\" + row.getCell(1));
						FileInputStream inputStream1 = new FileInputStream(file1);
						Workbook wb = null;
						try {
//							OPCPackage pkg = OPCPackage.open(inputStream1);
//							workbook1 = new XSSFWorkbook(pkg);
							wb = WorkbookFactory.create(new File("D:\\XHTD\\152\\" + row.getCell(1)));
							Sheet firstSheet = wb.getSheetAt(0);
							
							System.out.print(firstSheet.getRow(11).getCell(6) + " ");
//							System.out.print(firstSheet.getRow(11).getCell(4));
							System.out.println(" ");

						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("loi");
						}

					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(row.getCell(2));
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
