package org.idempiere.xhtd_ab.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.text.Normalizer;
import java.util.regex.Pattern;
import java.nio.file.Files;

import org.adempiere.util.IProcessUI;
import org.apache.poi.ss.usermodel.Cell;
import org.compiere.model.X_AD_SysConfig;
import org.compiere.util.DB;

public class FileUtil {
	public static String getPath(String trxName) {
		String path = "";
		String type = "";
		if (System.getProperty("os.name").contains("Linux")) {
			type = "XHTDAB_DN_FILE_PATH_LINUX";
		} else if (System.getProperty("os.name").contains("Windows")) {
			type = "XHTDAB_DN_FILE_PATH_WINDOWS";
		}
		StringBuilder sql = new StringBuilder("SELECT " + X_AD_SysConfig.COLUMNNAME_Value);
		sql.append(" FROM " + X_AD_SysConfig.Table_Name + " A WHERE A." + X_AD_SysConfig.COLUMNNAME_Name + " = ? ");
		path = DB.getSQLValueString(trxName, sql.toString(), type);
		return path;
	}

	public static void copyFile(Path source, Path dest) {
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String splitFileName(String fileSource) {
		int pos = fileSource.lastIndexOf('\\');
		String baseName = (pos > -1) ? fileSource.substring(pos + 1) : fileSource;
		String[] parts = baseName.split("\\_");
		return parts[parts.length - 1];
	}

	public static Boolean checkFileName(String fileSource) {
		if (fileSource.endsWith("xls") || fileSource.endsWith("xlsx")) {
			return true;
		}
		return false;
	}
	
	public static String fileName(String fileSource) {
        try {

            String temp = Normalizer.normalize(fileSource, Normalizer.Form.NFD);
            Pattern pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}+");
            temp = pattern.matcher(temp).replaceAll("");
            return temp.replaceAll("đ", "d").replaceAll(" ","");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

	public static Object getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();

		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();

		case Cell.CELL_TYPE_NUMERIC:
			return cell.getNumericCellValue();
		}

		return null;
	}

	public static void download(Path fileSource, IProcessUI processUI) {
		try {
//			Filedownload.save(fileSource.toString(),null);
			if (processUI != null) {
				processUI.download(new File(fileSource.toString()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
