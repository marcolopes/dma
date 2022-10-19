/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Random;

public class RandomValue {

	private static final Random RANDOM = new Random();

	private final Random random;

	public RandomValue() {
		this(RANDOM);
	}

	/** Random seed */
	public RandomValue(long seed) {
		this(new Random(seed));
	}

	public RandomValue(Random random) {
		this.random=random;
	}


	/*
	 * String
	 */
	public String string(int length, String chars) {

		char[] result=new char[length];

		for (int i=0; i<result.length; i++){
			result[i]=chars.charAt(random.nextInt(chars.length()));
		}

		return new String(result);

	}

	/** Lowercase letters + Decimal numbers */
	public String string(int length) {

		return string(length, StringUtils.LOWERCASE_LETTERS+StringUtils.DECIMAL_NUMBERS);

	}

	/** Lowercase letters */
	public String letters(int length) {

		return string(length, StringUtils.LOWERCASE_LETTERS);

	}

	/** Decimal numbers (0-9) */
	public String numbers(int length) {

		return string(length, StringUtils.DECIMAL_NUMBERS);

	}

	/** Integer number (started with 1) */
	public String integer(int length) {

		if (length==0) return "";

		return (length<0 ? "-" : "") +
				string(1, "123456789") +
				numbers(Math.abs(length)).substring(1);

	}


	/*
	 * Integer
	 */
	public int Integer() {

		return random.nextInt();

	}

	public Integer Integer(int length) {

		if (length!=0) try{
			return new Integer((length<0 ? "-" : "") + integer(length));
		}catch(Exception e){
			return Integer();
		}return 0;

	}


	/*
	 * Long
	 */
	public long Long() {

		return random.nextLong();

	}

	public Long Long(int length) {

		if (length!=0) try{
			return new Long((length<0 ? "-" : "") + integer(length));
		}catch(Exception e){
			return Long();
		}return 0l;

	}


	/*
	 * Float
	 */
	public float Float() {

		return random.nextFloat();

	}

	public Float Float(int length) {

		if (length>0) try{
			return new Float(string(1,"01")+"."+integer(length));
		}catch(Exception e){
			return Float();
		}return 0f;

	}


	/*
	 * Double
	 */
	public double Double() {

		return random.nextDouble();

	}

	public Double Double(int length) {

		if (length>0) try{
			return new Double(string(1,"01")+"."+integer(length));
		}catch(Exception e){
			return Double();
		}return 0d;

	}


	/*
	 * Decimal
	 */
	public BigDecimal Decimal(int length, int decimals) {

		if (length!=0) try{
			return new BigDecimal(
					(length<0 ? "-" : "") +
					integer(Math.abs(length))+
					(decimals>0 ? "."+numbers(decimals) : ""));
		}catch(Exception e){
			System.err.println(e);
		}return BigDecimal.ZERO;

	}

	public BigDecimal Decimal(int length) {

		return Decimal(length, 0);

	}


	/*
	 * Collection
	 */
	public <T> T from(Collection<T> col) {

		int index=random.nextInt(col.size());

		for(T element: col){
			if (--index<0) return element;
		}return null;

	}

	public <T> T from(T[] array) {

		return array.length==0 ? null : array[random.nextInt(array.length)];

	}


	public static void main(String[] argvs) {

		String format="%10s";

		RandomValue value=new RandomValue();

		System.out.printf(format, "string: "); System.out.println(value.string(20,"XYZ"));
		System.out.printf(format, "string: "); System.out.println(value.string(20));
		System.out.printf(format, "letters: "); System.out.println(value.letters(20));
		System.out.printf(format, "numbers: "); System.out.println(value.numbers(20));
		System.out.println();
		System.out.printf(format, "integer: "); System.out.println(value.integer(0));
		System.out.printf(format, "integer: "); System.out.println(value.integer(1));
		System.out.printf(format, "integer: "); System.out.println(value.integer(-1));
		System.out.printf(format, "integer: "); System.out.println(value.integer(10));
		System.out.printf(format, "integer: "); System.out.println(value.integer(-10));
		System.out.println();
		System.out.printf(format, "Integer: "); System.out.println(value.Integer());
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(0));
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(9));
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(-9));
		System.out.println();
		System.out.printf(format, "Long: "); System.out.println(value.Long());
		System.out.printf(format, "Long: "); System.out.println(value.Long(0));
		System.out.printf(format, "Long: "); System.out.println(value.Long(19));
		System.out.printf(format, "Long: "); System.out.println(value.Long(-19));
		System.out.println();
		System.out.printf(format, "Float: "); System.out.println(value.Float());
		System.out.printf(format, "Float: "); System.out.println(value.Float(0));
		System.out.printf(format, "Float: "); System.out.println(value.Float(10));
		System.out.println();
		System.out.printf(format, "Double: "); System.out.println(value.Double());
		System.out.printf(format, "Double: "); System.out.println(value.Double(0));
		System.out.printf(format, "Double: "); System.out.println(value.Double(10));
		System.out.println();
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(0));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(12));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(-12));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(12,6));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(-12,6));
		System.out.println();
		System.out.printf(format, "From: "); System.out.println(value.from(new String[0]));
		System.out.printf(format, "From: "); System.out.println(value.from(new String[]{"One","Two","Three"}));

	}


}