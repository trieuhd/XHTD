package org.idempiere.xhtd_ab.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.log4j.Logger;
import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.model.X_TDAB_STANDARD;
import org.idempiere.xhtd_ab.object.ConfigWOEObject;
import org.idempiere.xhtd_ab.object.ProfileObject;
import org.idempiere.xhtd_ab.object.ScoreConfigObject;
import org.idempiere.xhtd_ab.utils.BaseObject;
import org.idempiere.xhtd_ab.utils.ScoreStepUtils;
import org.idempiere.xhtd_ab.utils.ScoreUtils;

public class ScoreServiceStep extends BaseObject {
	protected Logger logger = Logger.getLogger(this.getClass());
	// Gia trị goc
	private String value;
	private String exceptionValue;
	private BigDecimal naValue;
	private BigDecimal logisticValue;
	private BigDecimal outLiersValue;
	private ScoreConfigObject configObject;
	private BigDecimal rsValue;
	private BigDecimal finalValue;
	private ProfileObject profile;

	public ScoreServiceStep(ScoreConfigObject configObject, ProfileObject profile) {
		this.configObject = configObject;
		this.profile = profile;
		process();
	}

	private void process() {
		logger.info("Start process with ID  = " + configObject.getStandardValue());
		logger.info("Start process with config  = " + gson.toJson(configObject));
		// gia trị goc
		getSourceValue();
		// xu li bat thương
		processException();
		// chuyen doi WOE
		processWOEValue();
		//quy tac gan gia trị NA
		processNAValue();
		// chuyen doi qua ham logistic
		processLogisticValue();
		//xử lý outliers
		processOutliers();
		
		finalValue();
		processFinal();
	}

	private void processWOEValue() {
		switch (configObject.getStandardValue()) {
		case "PTC5":
			this.value = ScoreStepUtils.getSourcePTC5(profile, configObject);
			return;
		case "STT_30":
			this.value = ScoreStepUtils.getSourceSTT_30(profile, configObject);
			return;
		default:
			break;
		}
}

	// Lấy giá trị gốc
	private void getSourceValue() {
		switch (configObject.getStandardValue()) {
		case "PTC5":
			this.value = ScoreStepUtils.getSourcePTC5(profile, configObject);
			return;
		case "STT_30":
			this.value = ScoreStepUtils.getSourceSTT_30(profile, configObject);
			return;
		case "DSCR22":
			this.value = ScoreStepUtils.getSourceDSCR22(profile, configObject);
			return;
		case "Efficiency13":
			this.value = ScoreStepUtils.getSourceEfficiency13(profile, configObject);
			return;
		case "Efficiency15":
			this.value = ScoreStepUtils.getSourceEfficiency15(profile, configObject);
			return;
		case "Growth2":
			this.value = ScoreStepUtils.getSourceGrowth2(profile, configObject);
			return;
		case "Leverage11":
			this.value = ScoreStepUtils.getSourceLeverage11(profile, configObject);
			return;
		case "Liquidity1":
			this.value = ScoreStepUtils.getSourceLiquidity1(profile, configObject);
			return;
		case "Profitability9":
			this.value = ScoreStepUtils.getSourceGProfitability9(profile, configObject);
			return;
		case "Cashflow1":
			this.value = ScoreStepUtils.getSourceCashflow1(profile, configObject);
			System.out.println("---"+this.value);
			return;
		default:
			break;
		}

		String tableName = ScoreUtils.getTableName(configObject.getSetOfStandard().getTypeOfValue());
		Object value = profile.getValue(tableName, configObject.getFieldValue());
		if (value == null) {
			value = "NA";
		} else {
			if (value instanceof String) {
				this.value = (String) value;
			}
			if (value instanceof BigDecimal) {
				BigDecimal numberValue = (BigDecimal) value;
				if (configObject.getStandardValue().equals("STT_21")) {
					numberValue = numberValue.divide(new BigDecimal("1000000"), 5, RoundingMode.HALF_UP);
				}
				this.value = numberValue.toEngineeringString();
			}
		}

	}

	// Sau khi xử lý NA value
	private void processNAValue() {
		if (exceptionValue.equals("NA")) {
			naValue = configObject.getNaValue();
		} else {
			naValue = new BigDecimal(exceptionValue);
		}
	}

	// xu ly gia tri bat thuong
	private void processException() {
		logger.info("Source value is .... " + value);
		if (value.equals("NA")) {
			exceptionValue = value;
			return;
		}
		switch (configObject.getStandardValue()) {
		case "DSCR22":
			String exValue = ScoreStepUtils.getExceptionDSCR22(profile, configObject);
			if (exValue != null) {
				exceptionValue = exValue;
			}

			else {
				exceptionValue = value;
			}
			return;
		case "Efficiency13":
			String efficiency13 = ScoreStepUtils.getExceptionEfficiency13(profile, configObject);
			if (efficiency13 != null) {
				exceptionValue = efficiency13;
			} else {
				exceptionValue = value;
			}
			return;
		case "Efficiency15":
			String efficiency15 = ScoreStepUtils.getExceptionEfficiency15(profile, configObject);
			if (efficiency15 != null) {
				exceptionValue = efficiency15;
			} else {
				exceptionValue = value;
			}
			return;
		case "Growth2":
			String growth2 = ScoreStepUtils.getExceptionGrowth2(profile, configObject);
			if (growth2 != null) {
				if (growth2.equals("-1")) {
					exceptionValue = new BigDecimal(value).multiply(new BigDecimal("-1")).toEngineeringString();
				} else {
					exceptionValue = growth2;
				}
			} else {
				exceptionValue = value;
			}
			return;
		case "Leverage11":
			String leverage11 = ScoreStepUtils.getExceptionLeverage11(profile, configObject);
			if (leverage11 != null) {
				exceptionValue = leverage11;
			} else {
				exceptionValue = value;
			}
			return;
		case "Liquidity1":
			String liquidity1 = ScoreStepUtils.getExceptionLiquidity1(profile, configObject);
			if (liquidity1 != null) {
				exceptionValue = liquidity1;
			} else {
				exceptionValue = value;
			}
			return;
		case "Profitability9":
			String profitability9 = ScoreStepUtils.getExceptionGProfitability9(profile, configObject);
			if (profitability9 != null) {
				exceptionValue = profitability9;
			} else {
				exceptionValue = value;
			}
			return;
		case "Cashflow1":
			String cashflow1 = ScoreStepUtils.getExceptionCashflow1(profile, configObject);
			if (cashflow1 != null) {
				exceptionValue = cashflow1;
			} else {
				exceptionValue = value;
			}
			System.out.println("cashflow1_"+cashflow1);
			return;

		case "PTC12":
			try {
				BigDecimal nValue = new BigDecimal(value);
				if (nValue.compareTo(BigDecimal.ZERO) < 0) {
					exceptionValue = "NA";
					return;
				}
			} catch (Exception e) {
				logger.info("Value PTC12 not cat to bigdecimal .. ");
			}
		case "PTC18":
			try {
				BigDecimal nValue = new BigDecimal(value);
				if (nValue.compareTo(BigDecimal.ZERO) < 0) {
					exceptionValue = "NA";
					return;
				}
			} catch (Exception e) {
				logger.info("Value PTC18 not cat to bigdecimal .. ");
			}
		default:
			break;
		}

		exceptionValue = value;
		if (exceptionValue == null) {
			exceptionValue = "NA";
		}
		logger.info("Value after process exception .... " + exceptionValue);
	}

	// 1/(1+EXP(-a-b*T12))
	private void processLogisticValue() {
		if (configObject.getLogisticA() == null || configObject.getLogisticB() == null) {
			logisticValue = naValue;
			return;
		}
//		BigDecimal nValue = new BigDecimal(value);
		// -a-b*T12
		BigDecimal numerator = (new BigDecimal("-1")).multiply(configObject.getLogisticB().multiply(naValue))
				.subtract(configObject.getLogisticA());
		BigDecimal numeratorValue = new BigDecimal(Math.exp(numerator.doubleValue()));
		numeratorValue = numeratorValue.add(BigDecimal.ONE);
		logisticValue = BigDecimal.ONE.divide(numeratorValue, 5, RoundingMode.HALF_UP);
		logger.info("Value after process logistic .... " + logisticValue);
	}

	// Xử lý outliers chuyển đối biến PTC/CIC dạng số
	private void processOutliers() {
		logger.info("Start process outlier .... ");
		if (configObject.getStrMeanP() == null || configObject.getStrMeanS() == null) {
			outLiersValue = logisticValue;
			return;
		}

		if (logisticValue.compareTo(configObject.getStrMeanS()) < 0) {
			outLiersValue = configObject.getStrMeanS();
			return;
		}

		if (logisticValue.compareTo(configObject.getStrMeanP()) > 0) {
			outLiersValue = configObject.getStrMeanP();
			return;
		}
		outLiersValue = logisticValue;
		logger.info("Value after process outliner .... " + outLiersValue);
	}

	// Kết quả cuối cùng(chua nhan trong so) b7
	private void finalValue() {
		logger.info("Start process final .... " + outLiersValue);
		BigDecimal numerator = outLiersValue.subtract(configObject.getCvMeanSD()).divide(configObject.getCvSD(), 5,
				RoundingMode.HALF_UP);
		rsValue = numerator.multiply(new BigDecimal("50"));
		logger.info("process final .... " + rsValue);
		
		logger.info("cần tim  .... " + configObject.getCvMeanSD());
	}

	// Diem sau khi nhan trong so
	private void processFinal() {
		logger.info("process final .... ");
		String auditer = profile.getNonFinancial().getFinancial_Statements_Audited();
		if (auditer.equals(X_TDAB_Financial_Non.FINANCIAL_STATEMENTS_AUDITED_3)) {
			finalValue = rsValue.multiply(configObject.getSetOfStandard().getwUnauditer()).divide(new BigDecimal(100));
		}
		if (auditer.equals(X_TDAB_Financial_Non.FINANCIAL_STATEMENTS_AUDITED_1)
				|| auditer.equals(X_TDAB_Financial_Non.FINANCIAL_STATEMENTS_AUDITED_2) || auditer.equals("0")) {
			finalValue = rsValue.multiply(configObject.getSetOfStandard().getwAuditer()).divide(new BigDecimal(100));
		}
		if (configObject.getSetOfStandard().getRate().equals(X_TDAB_STANDARD.RATE__)) {
			finalValue = finalValue.multiply(new BigDecimal("-1"));
		}
		logger.info("process financial  .... " + finalValue);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getExceptionValue() {
		return exceptionValue;
	}

	public void setExceptionValue(String exceptionValue) {
		this.exceptionValue = exceptionValue;
	}

	public BigDecimal getNaValue() {
		return naValue;
	}

	public void setNaValue(BigDecimal naValue) {
		this.naValue = naValue;
	}

	public BigDecimal getLogisticValue() {
		return logisticValue;
	}

	public void setLogisticValue(BigDecimal logisticValue) {
		this.logisticValue = logisticValue;
	}

	public BigDecimal getOutLiersValue() {
		return outLiersValue;
	}

	public void setOutLiersValue(BigDecimal outLiersValue) {
		this.outLiersValue = outLiersValue;
	}

	public BigDecimal getRsValue() {
		return rsValue;
	}

	public void setRsValue(BigDecimal rsValue) {
		this.rsValue = rsValue;
	}

	public BigDecimal getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(BigDecimal finalValue) {
		this.finalValue = finalValue;
	}

	public ScoreConfigObject getConfig() {
		return configObject;
	}

}
