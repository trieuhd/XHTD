package org.idempiere.xhtd_ab.object;

import java.math.BigDecimal;
import java.util.List;

public class ScoreConfigObject {
	private String fieldValue ;
	private BigDecimal minNaValue;
	private BigDecimal maxNaValue;
	private BigDecimal naValue;
	private BigDecimal logisticA;
	private BigDecimal logisticB;
	private BigDecimal strMean;
	private BigDecimal strSD;
	private SetOfStandard setOfStandard;
	private List<FieldObject> listParams;
	//Mean-3*SD
	private BigDecimal strMeanS;
	//Mean+3*SD
	private BigDecimal strMeanP;
	
	//Tham số giá trị quy đổi điểm
	private BigDecimal cvSD;
	private BigDecimal cvMeanSD;
	
	private String standardValue;

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public BigDecimal getMinNaValue() {
		return minNaValue;
	}

	public void setMinNaValue(BigDecimal minNaValue) {
		this.minNaValue = minNaValue;
	}

	public BigDecimal getMaxNaValue() {
		return maxNaValue;
	}

	public void setMaxNaValue(BigDecimal maxNaValue) {
		this.maxNaValue = maxNaValue;
	}

	public BigDecimal getNaValue() {
		return naValue;
	}

	public void setNaValue(BigDecimal naValue) {
		this.naValue = naValue;
	}

	public BigDecimal getLogisticA() {
		return logisticA;
	}

	public void setLogisticA(BigDecimal logisticA) {
		this.logisticA = logisticA;
	}

	public BigDecimal getLogisticB() {
		return logisticB;
	}

	public void setLogisticB(BigDecimal logisticB) {
		this.logisticB = logisticB;
	}

	public BigDecimal getStrMean() {
		return strMean;
	}

	public void setStrMean(BigDecimal strMean) {
		this.strMean = strMean;
	}

	public BigDecimal getStrSD() {
		return strSD;
	}

	public void setStrSD(BigDecimal strSD) {
		this.strSD = strSD;
	}

	public BigDecimal getStrMeanS() {
		return strMeanS;
	}

	public void setStrMeanS(BigDecimal strMeanS) {
		this.strMeanS = strMeanS;
	}

	public BigDecimal getStrMeanP() {
		return strMeanP;
	}

	public void setStrMeanP(BigDecimal strMeanP) {
		this.strMeanP = strMeanP;
	}

	public BigDecimal getCvSD() {
		return cvSD;
	}

	public void setCvSD(BigDecimal cvSD) {
		this.cvSD = cvSD;
	}

	public BigDecimal getCvMeanSD() {
		return cvMeanSD;
	}

	public void setCvMeanSD(BigDecimal cvMeanSD) {
		this.cvMeanSD = cvMeanSD;
	}

	public String getStandardValue() {
		return standardValue;
	}

	public void setStandardValue(String standardValue) {
		this.standardValue = standardValue;
	}

	public List<FieldObject> getListParams() {
		return listParams;
	}

	public void setListParams(List<FieldObject> listParams) {
		this.listParams = listParams;
	}

	public SetOfStandard getSetOfStandard() {
		return setOfStandard;
	}

	public void setSetOfStandard(SetOfStandard setOfStandard) {
		this.setOfStandard = setOfStandard;
	}
	
}
