/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import java.math.BigDecimal;

public class BigdecimalUtils {

	/*
	 * Conversion
	 */
	public static BigDecimal getValue(BigDecimal value) {

		return value==null ? new BigDecimal(0) : value;
	}


	public static String toString(BigDecimal value) {

		return value==null ? "" : value.toString();
	}


	public static BigDecimal fromString(String value){

		return value==null || value.length()==0 ? new BigDecimal(0) : new BigDecimal(value);
	}







	/*
	 * Analysis
	 */
	public static boolean isBigger(BigDecimal value, BigDecimal compareTo){

		int result = value.compareTo(compareTo);

		return result <= 0 ? false : true;

	}


	public static BigDecimal getBigger(BigDecimal value, BigDecimal compareTo){

		int result = value.compareTo(compareTo);

		if(result < 0) return compareTo;
		else if(result > 0)	return value;

		return null;

	}


	public static BigDecimal getSmaller(BigDecimal value, BigDecimal compareTo){

		int result = value.compareTo(compareTo);

		if(result < 0) return value;
		else if(result > 0) return compareTo;

		return null;

	}


}
