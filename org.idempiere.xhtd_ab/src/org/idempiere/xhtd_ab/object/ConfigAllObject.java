package org.idempiere.xhtd_ab.object;

import java.util.List;

public class ConfigAllObject {
	private List<ScoreConfigObject> listConfig;
	private SminSmaxObject sminMaxObject ;
	private ConfigPTC39Object configPTC39Object;
	private ConfigPDRateObject configPDRateObject;
	private List<ScoreStringTag> listScoreStringTag;
	public List<ScoreConfigObject> getListConfig() {
		return listConfig;
	}
	public void setListConfig(List<ScoreConfigObject> listConfig) {
		this.listConfig = listConfig;
	}
	public SminSmaxObject getSminMaxObject() {
		return sminMaxObject;
	}
	public void setSminMaxObject(SminSmaxObject sminMaxObject) {
		this.sminMaxObject = sminMaxObject;
	}
	public ConfigPTC39Object getConfigPTC39Object() {
		return configPTC39Object;
	}
	public void setConfigPTC39Object(ConfigPTC39Object configPTC39Object) {
		this.configPTC39Object = configPTC39Object;
	}
	public ConfigPDRateObject getConfigPDRateObject() {
		return configPDRateObject;
	}
	public void setConfigPDRateObject(ConfigPDRateObject configPDRateObject) {
		this.configPDRateObject = configPDRateObject;
	}
	public List<ScoreStringTag> getListScoreStringTag() {
		return listScoreStringTag;
	}
	public void setListScoreStringTag(List<ScoreStringTag> listScoreStringTag) {
		this.listScoreStringTag = listScoreStringTag;
	}
	
}
