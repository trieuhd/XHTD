package org.idempiere.xhtd_ab.object;

import java.math.BigDecimal;

public class ScoreStringTag {
	
	private String indexScore;
	private String spScore;
	private String moodyScore;
	private BigDecimal fromValue;
	private BigDecimal toValue;
	
	public String getIndexScore() {
		return indexScore;
	}
	public void setIndexScore(String indexScore) {
		this.indexScore = indexScore;
	}
	public String getSpScore() {
		return spScore;
	}
	public void setSpScore(String spScore) {
		this.spScore = spScore;
	}
	public String getMoodyScore() {
		return moodyScore;
	}
	public void setMoodyScore(String moodyScore) {
		this.moodyScore = moodyScore;
	}
	public BigDecimal getFromValue() {
		return fromValue;
	}
	public void setFromValue(BigDecimal fromValue) {
		this.fromValue = fromValue;
	}
	public BigDecimal getToValue() {
		return toValue;
	}
	public void setToValue(BigDecimal toValue) {
		this.toValue = toValue;
	}
}
