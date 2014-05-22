/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.numeric;

import java.math.BigDecimal;
import java.util.Random;

import org.dma.java.utils.string.StringUtils;

public class NumericUtils {

	/*
	 * Conversion
	 */
	public static String toString(int value){

		return Integer.toString(value);

	}


	public static String toString(BigDecimal value) {

		return value==null ? "" : value.toString();

	}


	public static char chr(int value) {

		return (char)value;

	}


	public static BigDecimal value(String value) {

		try{
			return new BigDecimal(value);

		}catch(NumberFormatException e){}

		return BigDecimal.ZERO;

	}





	/*
	 * Creation
	 */
	public static Integer random(int length) {

		return new Integer(StringUtils.randomNumbers(length));

	}


	public static Integer random() {

		return new Random().nextInt(Integer.MAX_VALUE);

	}





	/*
	 * Analysis
	 */
	public static boolean bit(int value, int bit) {

		return (value & bit)!=0;
	}


	public static boolean isZero(BigDecimal value) {

		return value.signum()==0;

	}


	public static boolean isZero(String value) {

		return isZero(value(value));

	}


	public static boolean isEqual(BigDecimal value, BigDecimal compareTo){

		return value.compareTo(compareTo) == 0 ? true : false;

	}


	public static boolean isGreater(BigDecimal value, BigDecimal compareTo){

		return value.compareTo(compareTo) > 0 ? true : false;

	}


	public static boolean isGreaterOrEqual(BigDecimal value, BigDecimal compareTo){

		return value.compareTo(compareTo) >= 0 ? true : false;

	}


	public static boolean isLesser(BigDecimal value, BigDecimal compareTo){

		return value.compareTo(compareTo) < 0 ? true : false;

	}


	public static boolean isLesserOrEqual(BigDecimal value, BigDecimal compareTo){

		return value.compareTo(compareTo) <= 0 ? true : false;

	}


	public static BigDecimal greater(BigDecimal value, BigDecimal compareTo){

		int result = value.compareTo(compareTo);

		switch(result){
		case -1: return compareTo;
		case 1: return value;
		default: return null;
		}

	}


	public static BigDecimal lesser(BigDecimal value, BigDecimal compareTo){

		int result=value.compareTo(compareTo);

		switch(result){
		case -1: return value;
		case 1: return compareTo;
		default: return null;
		}

	}


	public static void main(String[] argvs){

		System.out.println("double");
		double d=0d;
		for (int i=1; i<=100; i++) {
			d+=0.01;
			System.out.println(d);
		}

		System.out.println("float");
		float f=0f;
		for (int i=1; i<=100000; i++) {
			f+=0.01;
			System.out.println(f);
		}

	}


}
