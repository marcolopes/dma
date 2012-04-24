/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import java.math.BigDecimal;

public class DecimalUtils {

	/*
	 * Conversion
	 */
	public static String toString(BigDecimal value) {

		return value==null ? "" : value.toString();

	}


	public static BigDecimal getValue(BigDecimal value) {

		return value==null ? BigDecimal.valueOf(0) : value;

	}


	public static BigDecimal getValue(String value) {

		try{
			return new BigDecimal(value);

		}catch(NumberFormatException e){}

		return BigDecimal.valueOf(0);

	}







	/*
	 * Analysis
	 */
	public static boolean isZero(String value) {

		return getValue(value).doubleValue()==0;

	}


	public static boolean isBigger(BigDecimal value, BigDecimal compareTo){

		int result=value.compareTo(compareTo);

		return result <= 0 ? false : true;

	}


	public static BigDecimal getBigger(BigDecimal value, BigDecimal compareTo){

		int result = value.compareTo(compareTo);

		if(result < 0) return compareTo;
		else if(result > 0)	return value;

		return null;

	}


	public static BigDecimal getSmaller(BigDecimal value, BigDecimal compareTo){

		int result=value.compareTo(compareTo);

		if(result < 0) return value;
		else if(result > 0) return compareTo;

		return null;

	}


}
