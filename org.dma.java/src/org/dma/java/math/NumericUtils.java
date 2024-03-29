/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;

public class NumericUtils {

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

		switch(value.compareTo(compareTo)){
		case -1: return compareTo;
		case 1: return value;
		}return null;

	}


	public static BigDecimal lesser(BigDecimal value, BigDecimal compareTo){

		switch(value.compareTo(compareTo)){
		case -1: return value;
		case 1: return compareTo;
		}return null;

	}


	public static void main(String[] args) {

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
