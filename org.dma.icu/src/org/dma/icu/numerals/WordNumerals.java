/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.icu.numerals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Locale;

import com.ibm.icu.text.RuleBasedNumberFormat;

public class WordNumerals implements IWordNumerals {

	private final RuleBasedNumberFormat format;

	//number of decimals
	private final int scale;
	//unit label
	private final NumeralUnit unit;

	public WordNumerals(Locale locale, int scale, NumeralUnit unit) {
		this.format=new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
		this.scale=scale;
		this.unit=unit;
	}


	private String capitalize(String string) {
		return string.substring(0,1).toUpperCase() + string.substring(1);
	}

	private String format(BigInteger value, String unit) {
		return format.format(value).concat(" ").concat(unit);
	}

	@Override
	public String toString(BigDecimal value) {

		BigDecimal scaled=value.abs().setScale(scale, RoundingMode.HALF_EVEN);
		BigInteger integer=scaled.abs().toBigInteger();
		BigInteger decimal=(scaled.subtract(new BigDecimal(integer))).multiply(new BigDecimal(100)).toBigInteger();

		if (scaled.signum()==0) return capitalize(format(BigInteger.ZERO, unit.main));

		StringBuilder sb=new StringBuilder();
		if (integer.signum()>0) sb.append(format(integer, unit.main));
		if (decimal.signum()>0){
			if (sb.length()>0) sb.append(" ");
			sb.append(format(decimal, unit.fractional));
		}return capitalize(sb.toString());

	}


	/** Test Case */
	public static void main(String[] args) {

		//teste de "overflow"
		BigDecimal overflow=new BigDecimal("123456789000000000000000000000000000");
		System.out.println("=== OVERFLOW ===");
		System.out.println(overflow);
		System.out.println(new PTWordNumerals(0).toString(overflow));

		WordNumerals numerals=new PTWordNumerals(2);

		//teste de intervalos
		int index=0;
		for(double[] interval: new double[][]{
			{.0,.09,.01},
			{.90,.99,.01},
			{1,1.99,.01},
			{2,2.99,.1},
			{3,200,1},
			{999,1001,1},
			{1229,1231,1},
			{1999,2001,1},
			{9999,10001,1},
			{101099,101101,1},
			{123449,123451,1},
			{999999,1000001,1},
			{10010099,10010101,1},
			{12345669,12345671,1},
			{999999999,1000000001,1},
			{1000567099,1000567101,1},
			{1000010000,1000010002,1},
			{1001000000,1001000002,1},
			{1010010000,1010010002,1},
			{1234567889,1234567891,1}}){
			System.out.println();
			System.out.println("=== INTERVALO #"+(index++)+" ===");
			for(BigDecimal value=BigDecimal.valueOf(interval[0]); value.doubleValue()<=interval[1];
					value=value.add(BigDecimal.valueOf(interval[2]))){
				System.out.println(String.format("%-14s",
						value.toPlainString())+": "+numerals.toString(value));
			}
		}

		//teste "Nova Gramatica do Portugues Contemporaneo"
		System.out.println();
		System.out.println("=== Nova Gramatica do Portugues Contemporaneo ===");
		for(BigDecimal value: new BigDecimal[]{
			new BigDecimal("999"),
			new BigDecimal("1230"),
			new BigDecimal("1200"),
			new BigDecimal("293572"),
			new BigDecimal("332415741211")}){
			System.out.println(String.format("%-14s",
					value.toPlainString())+": "+numerals.toString(value));
		}

	}


}