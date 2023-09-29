package org.idempiere.xhtd_ab.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.idempiere.xhtd_ab.model.X_TDAB_Financial_Non;
import org.idempiere.xhtd_ab.object.ConfigWOEObject;
import org.idempiere.xhtd_ab.object.ProfileObject;
import org.idempiere.xhtd_ab.object.ScoreConfigObject;

public class ScoreStepUtils extends BaseObject {

	private static final String VALUE_NA = "NA";
	private static final String VALUE_INF = "Inf";

	// BCTC = 1 nam ->KQ_10/(CD_320+KQ_23)
	// BCTC 2 nam -> KQ_10/((CD_320+CD_320ly)/2+KQ_23)

	public static String getSourceDSCR22(ProfileObject profile, ScoreConfigObject config) {
		logger.info("Get resource DSCR22 start ");

		BigDecimal KQ_10 = profile.getBctcB1().getKQ10();
		BigDecimal KQ_23 = profile.getBctcB1().getKQ23();
		BigDecimal CD_320 = profile.getBctcB1().getCD320();
		BigDecimal CD_320LY = profile.getBctcB1().getCD320LY();
		try {
			BigDecimal binhQuan = CD_320.add(CD_320LY).divide(new BigDecimal(2));
			BigDecimal mau = binhQuan.add(KQ_23);
			if (mau.equals(BigDecimal.ZERO)) {
				return VALUE_INF;
			}
			return KQ_10.divide(mau, 5, RoundingMode.HALF_UP).toEngineeringString();
		} catch (Exception e) {
			return VALUE_NA;
		}
	}

	public static String getSourcePTC5(ProfileObject profile, ScoreConfigObject config) {
		logger.info("Get resource PTC5 start ");
		String value = null;

		BigDecimal num = profile.getNonFinancial().getYears_Experience_CEO();
		if (num == null) {
			return "NA";
		}
		ConfigWOEObject woeValue = ScoreUtils.findWOEObject(String.valueOf(num), "PTC5");
		if (woeValue != null) {
			value = woeValue.getValue();
		}
		return value;
	}

	public static String getSourceSTT_30(ProfileObject profile, ScoreConfigObject config) {
		logger.info("Get resource STT_30 start ");
		String value = null;

		BigDecimal num = profile.getCic().getNumber_loan_2_12m();
		ConfigWOEObject woeValue = ScoreUtils.findWOEObject(String.valueOf(num), "STT_30");
		if (woeValue != null) {
			value = woeValue.getValue();
		}
		return value;
	}

	public static String getSourceEfficiency13(ProfileObject profile, ScoreConfigObject config) {
		logger.info("Get resource Efficiency13 start ");

		BigDecimal KQ_10 = profile.getBctcB1().getKQ10();
		BigDecimal KQ_11 = profile.getBctcB1().getKQ11();
		BigDecimal CD_140 = profile.getBctcB1().getCD140();
		BigDecimal CD_130 = profile.getBctcB1().getCD130();
		BigDecimal CD_311 = profile.getBctcB1().getCD311();

		if (KQ_10.compareTo(BigDecimal.ZERO) == 0 || KQ_11.compareTo(BigDecimal.ZERO) == 0) {
			return VALUE_INF;
		} else {
			BigDecimal CD_140LY = profile.getBctcB1().getCD140LY();
			BigDecimal CD_130LY = profile.getBctcB1().getCD130LY();
			BigDecimal CD_311LY = profile.getBctcB1().getCD311LY();
			try {
				BigDecimal match1 = CD_140.add(CD_140LY).divide(new BigDecimal(2)).divide(KQ_11, 5,
						RoundingMode.HALF_UP);
				BigDecimal match2 = CD_130.add(CD_130LY).divide(new BigDecimal(2)).divide(KQ_10, 5,
						RoundingMode.HALF_UP);
				BigDecimal match3 = CD_311.add(CD_311LY).divide(new BigDecimal(2)).divide(KQ_11, 5,
						RoundingMode.HALF_UP);
				BigDecimal result = match1.add(match2).subtract(match3).multiply(new BigDecimal(365));
				return String.valueOf(result);
			} catch (Exception e) {
				return VALUE_NA;
			}
		}
	}

	public static String getSourceEfficiency15(ProfileObject profile, ScoreConfigObject config) {
		logger.info("Get resource Efficiency15 start ");

		BigDecimal KQ10 = profile.getBctcB1().getKQ10();
		BigDecimal CD320 = profile.getBctcB1().getCD320();
		BigDecimal CD338 = profile.getBctcB1().getCD338();
		BigDecimal CD400 = profile.getBctcB1().getCD400();
		BigDecimal CD320LY = profile.getBctcB1().getCD320LY();
		BigDecimal CD338LY = profile.getBctcB1().getCD338LY();
		BigDecimal CD400LY = profile.getBctcB1().getCD400LY();

		try {
			BigDecimal add = CD320.add(CD338).add(CD400).add(CD320LY).add(CD338LY).add(CD400LY);
			// TH1
			if (add.compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_INF;
			}
			// TH3
			return String.valueOf(KQ10.divide(add.divide(new BigDecimal(2)), 5, RoundingMode.HALF_UP));
		} catch (Exception e) {
			// TH2
			return VALUE_NA;
		}

	}

	public static String getSourceGrowth2(ProfileObject profile, ScoreConfigObject config) {

		BigDecimal CD400 = profile.getBctcB1().getCD400();
		BigDecimal CD400LY = profile.getBctcB1().getCD400LY();

		try {
			//TH1
			if(CD400LY.compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_INF;
			}
			//TH3
			return String.valueOf(CD400.subtract(CD400LY).divide(CD400LY, 5, RoundingMode.HALF_UP));
		} catch (Exception e) {
			//TH2
			return VALUE_NA;
		}
	}

	public static String getSourceLeverage11(ProfileObject profile, ScoreConfigObject config) {


		BigDecimal CD320 = profile.getBctcB1().getCD320();
		BigDecimal CD338 = profile.getBctcB1().getCD338();
		BigDecimal CD400 = profile.getBctcB1().getCD400();
		try {
			// TH1
			if (CD400.compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_INF;
			}
			// TH3
			return String.valueOf(CD320.add(CD338).divide(CD400, 5, RoundingMode.HALF_UP));
		} catch (Exception e) {
			// TH2
			return VALUE_NA;
		}

	}

	public static String getSourceLiquidity1(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal CD100 = profile.getBctcB1().getCD100();
		BigDecimal CD310 = profile.getBctcB1().getCD310();

		// TH1
		if (CD310.compareTo(BigDecimal.ZERO) == 0) {
			return VALUE_INF;
		}
		try {
			// TH3
			return String.valueOf(CD100.divide(CD310, 5, RoundingMode.HALF_UP));
		} catch (Exception e) {
			// TH2
			return VALUE_NA;
		}
	}

	public static String getSourceGProfitability9(ProfileObject profile, ScoreConfigObject config) {
		
		BigDecimal CD270 = profile.getBctcB1().getCD270();
		BigDecimal CD270LY = profile.getBctcB1().getCD270LY();
		BigDecimal KQ60 = profile.getBctcB1().getKQ60();
		
		
		try {
			if(CD270.add(CD270LY).compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_INF;
			}
			//TH3
			return String.valueOf(KQ60.divide(CD270.add(CD270LY).divide(new BigDecimal(2)), 5, RoundingMode.HALF_UP));
		} catch (Exception e) {
			//TH2
			return VALUE_NA;
		}
	}

	public static String getSourceCashflow1(ProfileObject profile, ScoreConfigObject config) {
		
		BigDecimal CD_310 = profile.getBctcB1().getCD310();
		BigDecimal CD_310ly = profile.getBctcB1().getCD310LY();
		BigDecimal LCT_20 = profile.getBctcB1().getLTC_20();
		BigDecimal total = CD_310.add(CD_310ly).divide(new BigDecimal(2));
		try {
			if(total.equals(BigDecimal.ZERO)) {
				return VALUE_INF;
			}
			return LCT_20.divide(total, 5, RoundingMode.HALF_UP).toEngineeringString();
		} catch (Exception e) {
			//TH2
			return VALUE_NA;
		}
	}

	// gia tri bat thuong
	public static String getExceptionDSCR22(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal KQ_10 = profile.getBctcB1().getKQ10();
		BigDecimal KQ_23 = profile.getBctcB1().getKQ23();
		BigDecimal CD_320 = profile.getBctcB1().getCD320();
		BigDecimal CD_320LY = profile.getBctcB1().getCD320LY();
		// Min value
		if (CD_320LY != null && CD_320LY.compareTo(BigDecimal.ZERO) < 0) {
			return config.getMinNaValue().toEngineeringString();
		}
		// qt2
		if (KQ_10.compareTo(BigDecimal.ZERO) < 0 || CD_320.compareTo(BigDecimal.ZERO) < 0
				|| KQ_23.compareTo(BigDecimal.ZERO) < 0) {
			return config.getMinNaValue().toEngineeringString();
		}

		// Max value
		if (KQ_10.compareTo(BigDecimal.ZERO) > 0 && CD_320LY != null) {
			BigDecimal check = CD_320.add(CD_320LY).divide(new BigDecimal("2")).add(KQ_23);
			if (check != null && check.equals(BigDecimal.ZERO)) {
				return config.getMaxNaValue().toEngineeringString();
			}
		}
		return null;
	}

	public static String getExceptionEfficiency13(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal KQ_10 = profile.getBctcB1().getKQ10();
		BigDecimal KQ_11 = profile.getBctcB1().getKQ11();
		BigDecimal CD_140 = profile.getBctcB1().getCD140();
		BigDecimal CD_130 = profile.getBctcB1().getCD130();
		BigDecimal CD_311 = profile.getBctcB1().getCD311();
		BigDecimal CD_140LY = profile.getBctcB1().getCD140LY();
		BigDecimal CD_130LY = profile.getBctcB1().getCD130LY();
		BigDecimal CD_311LY = profile.getBctcB1().getCD311LY();

		try {
			// 1
			if (CD_140.compareTo(BigDecimal.ZERO) < 0 || CD_140LY.compareTo(BigDecimal.ZERO) < 0
					|| CD_130.compareTo(BigDecimal.ZERO) < 0 || CD_130LY.compareTo(BigDecimal.ZERO) < 0
					|| CD_311.compareTo(BigDecimal.ZERO) < 0 || CD_311LY.compareTo(BigDecimal.ZERO) < 0
					|| KQ_10.compareTo(BigDecimal.ZERO) < 0 || KQ_11.compareTo(BigDecimal.ZERO) < 0
					|| KQ_10.compareTo(BigDecimal.ZERO) == 0 || KQ_11.compareTo(BigDecimal.ZERO) == 0) {
				return config.getMaxNaValue().toEngineeringString();
			}
		} catch (Exception e) {
			return null;
		}
		// 2
		return null;
	}

	public static String getExceptionEfficiency15(ProfileObject profile, ScoreConfigObject config) {
		logger.info("Get resource Efficiency15 start ");
		BigDecimal KQ10 = profile.getBctcB1().getKQ10();
		BigDecimal CD320 = profile.getBctcB1().getCD320();
		BigDecimal CD338 = profile.getBctcB1().getCD338();
		BigDecimal CD400 = profile.getBctcB1().getCD400();
		BigDecimal CD320LY = profile.getBctcB1().getCD320LY();
		BigDecimal CD338LY = profile.getBctcB1().getCD338LY();
		BigDecimal CD400LY = profile.getBctcB1().getCD400LY();

//		String type_Business = X_TDAB_Financial_Non.TYPE_BUSINESS_3;
		String type_Business = profile.getNonFinancial().getType_Business();
		try {
			// 1
			if (KQ10.compareTo(BigDecimal.ZERO) < 0 || CD320.compareTo(BigDecimal.ZERO) < 0
					|| CD320LY.compareTo(BigDecimal.ZERO) < 0 || CD338.compareTo(BigDecimal.ZERO) < 0
					|| CD338LY.compareTo(BigDecimal.ZERO) < 0) {
				return config.getMinNaValue().toEngineeringString();
			}

			// 2
			if (KQ10.compareTo(BigDecimal.ZERO) > 0 && (CD400.add(CD320).add(CD338).compareTo(BigDecimal.ZERO) == 0)) {
				return VALUE_NA;
			}

			if (type_Business.equals("3")) {
				if (CD400LY.add(CD320LY).add(CD338LY).compareTo(BigDecimal.ZERO) == 0) {
					return VALUE_NA;
				}
			}
		} catch (Exception e) {
			return null;
		}
		// 3
		return null;
	}

	public static String getExceptionGrowth2(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal CD400 = profile.getBctcB1().getCD400();
		BigDecimal CD400LY = profile.getBctcB1().getCD400LY();
		try {
			// 1
			if (CD400.subtract(CD400LY).compareTo(BigDecimal.ZERO) < 0 && CD400LY.compareTo(BigDecimal.ZERO) == 0) {
				return config.getMinNaValue().toEngineeringString();
			}

			// 2
			if (CD400.subtract(CD400LY).compareTo(BigDecimal.ZERO) > 0 && CD400LY.compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_NA;
			}

			// 3
			if ((CD400.compareTo(BigDecimal.ZERO) < 0 && CD400LY.compareTo(BigDecimal.ZERO) < 0)
					|| (CD400.compareTo(BigDecimal.ZERO) > 0 && CD400LY.compareTo(BigDecimal.ZERO) < 0)) {
				return "-1";
			}
		} catch (Exception e) {
			return null;
		}

		// 4
		return null;
	}

	public static String getExceptionLeverage11(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal CD320 = profile.getBctcB1().getCD320();
		BigDecimal CD338 = profile.getBctcB1().getCD338();
		BigDecimal CD400 = profile.getBctcB1().getCD400();
		try {
			// 1
			if (CD320.compareTo(BigDecimal.ZERO) < 0 || CD338.compareTo(BigDecimal.ZERO) < 0) {
				return config.getMaxNaValue().toEngineeringString();
			}

			// 2
			if (CD320.add(CD338).compareTo(BigDecimal.ZERO) > 0 && CD400.compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_NA;
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public static String getExceptionLiquidity1(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal CD100 = profile.getBctcB1().getCD100();
		BigDecimal CD310 = profile.getBctcB1().getCD310();
		try {
			// 1
			if (CD100.compareTo(BigDecimal.ZERO) < 0 || CD310.compareTo(BigDecimal.ZERO) < 0) {
				return config.getMinNaValue().toEngineeringString();
			}
			// 2
			if (CD100.compareTo(BigDecimal.ZERO) > 0 && CD310.compareTo(BigDecimal.ZERO) == 0) {

			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public static String getExceptionGProfitability9(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal CD270 = profile.getBctcB1().getCD270();
		BigDecimal CD270LY = profile.getBctcB1().getCD270LY();
		BigDecimal KQ60 = profile.getBctcB1().getKQ60();

		try {
			// 1
			if (CD270.compareTo(BigDecimal.ZERO) < 0 || CD270LY.compareTo(BigDecimal.ZERO) < 0
					|| (KQ60.compareTo(BigDecimal.ZERO) > 0 && CD270.add(CD270LY).compareTo(BigDecimal.ZERO) == 0)) {
				return config.getMinNaValue().toEngineeringString();
			}
			// 2
			if (KQ60.compareTo(BigDecimal.ZERO) > 0 && CD270.add(CD270LY).compareTo(BigDecimal.ZERO) == 0) {
				return VALUE_NA;
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}

	public static String getExceptionCashflow1(ProfileObject profile, ScoreConfigObject config) {
		BigDecimal CD310 = profile.getBctcB1().getCD310();
		BigDecimal CD310LY = profile.getBctcB1().getCD310LY();
		BigDecimal LCT20 = profile.getBctcB1().getLTC_20();
		BigDecimal total = CD310.add(CD310LY).divide(new BigDecimal(2));
			
		try {
			if (CD310.compareTo(BigDecimal.ZERO) < 0 || CD310LY.compareTo(BigDecimal.ZERO) < 0) {
				return config.getMinNaValue().toEngineeringString();
			}

			else if (LCT20.compareTo(BigDecimal.ZERO) < 0 && CD310.add(CD310LY).equals(BigDecimal.ZERO)) {
				return VALUE_NA;
			}

			else if (LCT20.compareTo(BigDecimal.ZERO) > 0 && CD310.add(CD310LY).equals(BigDecimal.ZERO)) {
				return config.getMaxNaValue().toEngineeringString();
			}
			else
				return LCT20.divide(total, 5, RoundingMode.HALF_UP).toEngineeringString();
				
			
		} catch (Exception e) {
			//TH2
			return VALUE_NA;
		}
		
		
	}
}
