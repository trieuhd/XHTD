package org.idempiere.xhtd_ab.utils;

import org.apache.log4j.PropertyConfigurator;
import org.compiere.model.MSysConfig;

public class Logutil {
	private static boolean check = false;
	public static void config() {
		if(!check) {
			String path = MSysConfig.getValue("LOG_FILE");
			path = path + "log4j.properties";
			PropertyConfigurator.configure(path);
			check = true;
		}
		
	}
}
