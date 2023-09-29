package org.idempiere.xhtd_ab.utils;

import java.math.BigDecimal;

public class ValidateUtil {
	private static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	private static final String regexNumber = "^[a-zA-Z0-9]+$";
	private static final String regexString = "^[a-zA-Z]+$";
	private static final String regexNumbers = "^[0-9]+$";
	private static final String regex = "^[0-9\\-]+$";
	private static final String regexNumbersAndSize = "^[0-9]{9,12}+$";
	private static final String regexNumbersAndSizeBusiness = "^[0-9]{9,13}+$";

//	public static Boolean isNumberBusiness(String value) {
//		try {
//
//			if ((value.matches(regexNumber) && value.length() <= 13)
//					|| (value.matches(regexNumber) && value.length() >= 9))
//				return true;
//			return false;
//		} catch (Exception e) {
//		}
//		return false;
//	}
	public static Boolean isNumberBusiness(String value) {
		try {
			if (value.matches(regexNumbersAndSizeBusiness) && value.length() >= 9 && value.length() <= 13) {
				return true;
			}
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static Boolean isCompanyName(String value) {
		try {
			if (value.matches(regexString))
				return true;
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static Boolean isCheckNumber(String value) {
		try {
			if (value.matches(regexNumbers))
				return true;
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static Boolean isCheckNumberAndMinus(String value) {
		try {
			if (value.matches(regex))
				return true;
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static Boolean isUserLogin(String value) {
		try {
			if (value.matches(regexNumber))
				return true;
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static Boolean isLengthUserLogin(String value) {
		try {

			if ((value.matches(regexNumber) && value.length() >= 3 && value.length() <= 20))
				return true;
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static Boolean isNumberAndCheckSize(String value) {
		try {
			if (value.matches(regexNumbersAndSize) && value.length() >= 9 && value.length() <= 12) {
				return true;
			}
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static boolean isBigThan(BigDecimal value) {

		String str = value.toString();

		try {
			if (("0.0".equals(str))) {
				return true;
			}
			return false;
		} catch (Exception e) {
		}
		return false;
	}
	public static Boolean isCheckStringNull(String value) {
		try {
			if ( value == null || "".equals(value)) {
				return true;
			}
			return false;
		} catch (Exception e) {
		}
		return false;
	}
}
