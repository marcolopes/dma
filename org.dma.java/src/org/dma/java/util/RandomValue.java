/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

public class RandomValue extends RandomString {

	public RandomValue() {
		super();
	}

	/** Random seed */
	public RandomValue(long seed) {
		super(seed);
	}


	/** Positive or negative */
	public Integer Integer(int length) {

		if (length!=0) try{
			return new Integer((length<0 ? "-" : "") + integer(length));
		}catch(Exception e){
		}return 0;

	}

	/** Positive or negative */
	public Long Long(int length) {

		if (length!=0) try{
			return new Long((length<0 ? "-" : "") + integer(length));
		}catch(Exception e){
		}return 0l;

	}

	/** Positive (0.x) */
	public Float Float(int length) {

		if (length>0) try{
			return new Float("0." + integer(length));
		}catch(Exception e){
		}return 0f;

	}

	/** Positive (0.x) */
	public Double Double(int length) {

		if (length>0) try{
			return new Double("0." + integer(length));
		}catch(Exception e){
		}return 0d;

	}

	/** Positive or negative */
	public BigDecimal Decimal(int length, int decimals) {

		if (length!=0) try{
			return new BigDecimal(
					(length<0 ? "-" : "")+
					integer(Math.abs(length))+
					(decimals>0 ? "." + numbers(decimals) : ""));
		}catch(Exception e){
			System.err.println(e);
		}return BigDecimal.ZERO;

	}

	/** Positive or negative */
	public BigDecimal Decimal(int length) {

		return Decimal(length, 0);

	}


	/*
	 * Collection
	 */
	public <T> T from(Collection<T> col) {

		int index=nextInt(col.size());

		for(T element: col){
			if (--index<0) return element;
		}return null;

	}

	public <T> T from(T[] array) {

		return array.length==0 ? null : array[nextInt(array.length)];

	}


	public static void main(String[] args) {

		String format="%10s";

		RandomValue value=new RandomValue();

		System.out.printf(format, "string: "); System.out.println(value.string(20,"XYZ"));
		System.out.printf(format, "string: "); System.out.println(value.string(20));
		System.out.printf(format, "letters: "); System.out.println(value.letters(20));
		System.out.printf(format, "numbers: "); System.out.println(value.numbers(20));
		System.out.println();
		System.out.printf(format, "integer: "); System.out.println(value.integer(-1));
		System.out.printf(format, "integer: "); System.out.println(value.integer(0));
		System.out.printf(format, "integer: "); System.out.println(value.integer(1));
		System.out.printf(format, "integer: "); System.out.println(value.integer(10));
		System.out.println();
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(-1));
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(0));
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(1));
		System.out.printf(format, "Integer: "); System.out.println(value.Integer(9));
		System.out.printf(format, "Integer: "); System.out.println(value.nextInt());
		System.out.println();
		System.out.printf(format, "Long: "); System.out.println(value.Long(-1));
		System.out.printf(format, "Long: "); System.out.println(value.Long(0));
		System.out.printf(format, "Long: "); System.out.println(value.Long(1));
		System.out.printf(format, "Long: "); System.out.println(value.Long(19));
		System.out.printf(format, "Long: "); System.out.println(value.nextLong());
		System.out.println();
		System.out.printf(format, "Float: "); System.out.println(value.Float(-1));
		System.out.printf(format, "Float: "); System.out.println(value.Float(0));
		System.out.printf(format, "Float: "); System.out.println(value.Float(1));
		System.out.printf(format, "Float: "); System.out.println(value.Float(8));
		System.out.printf(format, "Float: "); System.out.println(value.nextFloat());
		System.out.println();
		System.out.printf(format, "Double: "); System.out.println(value.Double(-1));
		System.out.printf(format, "Double: "); System.out.println(value.Double(0));
		System.out.printf(format, "Double: "); System.out.println(value.Double(1));
		System.out.printf(format, "Double: "); System.out.println(value.Double(17));
		System.out.printf(format, "Double: "); System.out.println(value.nextDouble());
		System.out.println();
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(-12,6));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(-12));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(0));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(1));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(12));
		System.out.printf(format, "Decimal: "); System.out.println(value.Decimal(12,6));
		System.out.println();
		System.out.printf(format, "From: "); System.out.println(value.from(new String[0]));
		System.out.printf(format, "From: "); System.out.println(value.from(new String[]{"One","Two","Three"}));

	}


}