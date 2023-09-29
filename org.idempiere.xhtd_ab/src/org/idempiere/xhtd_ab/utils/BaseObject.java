package org.idempiere.xhtd_ab.utils;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class BaseObject {
	protected static Logger logger = Logger.getLogger(BaseObject.class);
	protected static Gson gson = new Gson();
}
