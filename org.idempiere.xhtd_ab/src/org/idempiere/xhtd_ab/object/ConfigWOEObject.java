package org.idempiere.xhtd_ab.object;

public class ConfigWOEObject {
	private String standValue;
	private double fromValue;
	private double toValue;
	private String value;

	public ConfigWOEObject(double from, double to, String value,String standValue) {
		this.fromValue = from;
		this.toValue = to;
		this.value = value;
		this.standValue = standValue;
	}
	
	public double getFromValue() {
		return fromValue;
	}

	public void setFromValue(double fromValue) {
		this.fromValue = fromValue;
	}

	public double getToValue() {
		return toValue;
	}

	public void setToValue(double toValue) {
		this.toValue = toValue;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStandValue() {
		return standValue;
	}

	public void setStandValue(String standValue) {
		this.standValue = standValue;
	}

}
