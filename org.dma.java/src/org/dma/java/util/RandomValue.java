/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.math.BigDecimal;
import java.util.Random;

public class RandomValue {

	private final static Random RANDOM = new Random();

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

	/** Integer number (1-9 + 0-9) */
	public String integer(int length) {

		return length==1 ? numbers(length) :
			string(1, "123456789") + numbers(length).substring(1);

	}


	/*
	 * Integer
	 */
	public int Integer() {

		return random.nextInt();

	}

	public Integer Integer(int length) {

		return new Integer(integer(length));

	}


	/*
	 * Long
	 */
	public long Long() {

		return random.nextLong();

	}

	public Long Long(int length) {

		return new Long(integer(length));

	}


	/*
	 * Float
	 */
	public float Float() {

		return random.nextFloat();

	}

	public Float Float(int length) {

		return new Float(integer(length));

	}


	/*
	 * Double
	 */
	public double Double() {

		return random.nextDouble();

	}

	public Double Double(int length) {

		return new Double(integer(length));

	}


	/*
	 * Decimal
	 */
	public BigDecimal decimal(int length) {

		return new BigDecimal(integer(length));

	}


}