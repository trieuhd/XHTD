package org.idempiere.xhtd_ab.utils;

import java.math.BigDecimal;
import java.util.List;

import org.idempiere.xhtd_ab.object.ScoreStringTag;

public class Utils {
	public static BigDecimal convertStringToNB(String value) {
		if (value == null || value.isEmpty()) {
			return null;
		}
		value = value.replace(",", ".");
		BigDecimal bigDecimal = new BigDecimal(value);
		return bigDecimal;
	}

	public static void main(String[] args) {
		int a = 5 + 4 * 3;
	}

	public static  ScoreStringTag findPDRateByRate(List<ScoreStringTag> listTag, BigDecimal pdRate) {
		for(ScoreStringTag tag : listTag) {
			if(pdRate.compareTo(tag.getFromValue())>=0 && pdRate.compareTo(tag.getToValue())<=0) {
				return tag;
			}
		}
		return listTag.get(listTag.size()-1);
	}
	

	public static ScoreStringTag findPDRateByIndex(String index,List<ScoreStringTag> listTag) {
		for(ScoreStringTag tag : listTag) {
			if(tag.getIndexScore().equals(index)) {
				return tag;
			}
		}
		return null;
	}
	 public static String convertRank (int rank) {
		 if (rank <= 9) {
			 String rk = "0"+ String.valueOf(rank); 
			 return rk;
		 }
		 
		 return String.valueOf(rank);
	 }
}
