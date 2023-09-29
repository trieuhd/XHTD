package org.idempiere.xhtd_ab.object;

import java.math.BigDecimal;

public class SminSmaxObject {
	
	private BigDecimal sMin;
	private BigDecimal sMax;
	private String type;
	
	public BigDecimal getsMin() {
		return sMin;
	}
	public void setsMin(BigDecimal sMin) {
		this.sMin = sMin;
	}
	public BigDecimal getsMax() {
		return sMax;
	}
	public void setsMax(BigDecimal sMax) {
		this.sMax = sMax;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
