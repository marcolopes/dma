/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;

public class NumericUtils {

	/*
	 * Conversion
	 */
	public static String toString(int value){

		return String.valueOf(value);

	}


	public static String toString(BigDecimal value) {

		return value == null ? "" : value.toString();

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
	 * Operations
	 */
	public static final int safeAdd(int left, int right) throws ArithmeticException {

		if (right > 0 ? left > Integer.MAX_VALUE - right : left < Integer.MIN_VALUE - right)
			throw new ArithmeticException("Integer overflow");

		return left + right;

	}

	public static final int safeSubtract(int left, int right) throws ArithmeticException {

		if (right > 0 ? left < Integer.MIN_VALUE + right : left > Integer.MAX_VALUE + right)
			throw new ArithmeticException("Integer overflow");

		return left - right;

	}

	public static final int safeMultiply(int left, int right) throws ArithmeticException {

		if (right > 0 ? left > Integer.MAX_VALUE/right || left < Integer.MIN_VALUE/right :
			(right < -1 ? left > Integer.MIN_VALUE/right || left < Integer.MAX_VALUE/right :
				right == -1 && left == Integer.MIN_VALUE)) throw new ArithmeticException("Integer overflow");

		return left * right;

	}

	public static final int safeDivide(int left, int right) throws ArithmeticException {

		if (left == Integer.MIN_VALUE && right == -1) throw new ArithmeticException("Integer overflow");

		return left / right;

	}

	public static final int safeNegate(int a) throws ArithmeticException {

		if (a == Integer.MIN_VALUE) throw new ArithmeticException("Integer overflow");

		return -a;

	}

	public static final int safeAbs(int a) throws ArithmeticException {

		if (a == Integer.MIN_VALUE) throw new ArithmeticException("Integer overflow");

		return Math.abs(a);

	}




	/*
	 * Analysis
	 */
	public static boolean bit(int value, int bit) {

		return (value & bit) != 0;
	}


	public static boolean isZero(BigDecimal value) {

		return value.signum() == 0;

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
		}return null;


	}


	public static BigDecimal lesser(BigDecimal value, BigDecimal compareTo){

		int result=value.compareTo(compareTo);

		switch(result){
		case -1: return value;
		case 1: return compareTo;
		}return null;

	}


	public static void main(String[] argvs) {

		System.out.println("double");
		double d=0d;
		for (int i=1; i<=100; i++) {
			d+=0.01;
			System.out.println(d);
		}

		System.out.println("float");
		float f=0f;
		for (int i=1; i<=100; i++) {
			f+=0.01;
			System.out.println(f);
		}

	}


}
