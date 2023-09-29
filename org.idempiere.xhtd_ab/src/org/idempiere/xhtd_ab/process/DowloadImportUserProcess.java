package org.idempiere.xhtd_ab.process;

import java.nio.file.Paths;

import org.compiere.model.X_AD_SysConfig;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.idempiere.xhtd_ab.utils.FileUtil;

public class DowloadImportUserProcess extends SvrProcess{
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String doIt() throws Exception {
		
		FileUtil.download(Paths.get(getPath(get_TrxName())), processUI);
		return null;
	}
	
	public static String getPath(String trxName) {
		String path = "";
		String type = "IMPORT_USER_TP_PATH";
		StringBuilder sql = new StringBuilder("SELECT " + X_AD_SysConfig.COLUMNNAME_Value);
		sql.append(" FROM " + X_AD_SysConfig.Table_Name + " A WHERE A." + X_AD_SysConfig.COLUMNNAME_Name +" = ? ");
		path = DB.getSQLValueString(trxName, sql.toString(), type);
		return path;
	}

}
