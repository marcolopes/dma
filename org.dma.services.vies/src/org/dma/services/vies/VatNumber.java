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
package org.dma.services.vies;

import org.dma.services.vies.CheckVatHandler.COUNTRIES;

public class VatNumber {
	/**
	 * http://zylla.wipos.p.lodz.pl/ut/translation.html
	 */
	public static class CheckDigit {

		/*
		 * Portugal
		 * - All numbers are weighted from right to the left, beginning with the next to last number
		 * (thus before the place of the check digit), with their position in the number sequence,
		 * i.e. the next to last number is multiplied by 2, the next by 3, etc..
		 * - The products are summed up.
		 * - The full remainder to the next lower multiples of 11 (modulo 11) is calculated.
		 * - The check digit is the difference of the remainder to 11.
		 * - If the difference is larger nine, p = 0 applies
		 */
		public static boolean PT(String number) {
			final int max=9;
			//check if is numeric and has 9 digits
			if (number.matches("[0-9]+") && !number.startsWith("0") && number.length()==max){
				int checkSum=0;
				//calculate checkSum
				for (int i=0; i<max-1; i++) checkSum+=(number.charAt(i)-'0')*(max-i);
				//calculate checkDigit
				int checkDigit=11-(checkSum % 11);
				//if checkDigit is higher than 9 set it to zero
				if (checkDigit>9) checkDigit=0;
				//compare checkDigit with the last digit
				return checkDigit==number.charAt(max-1)-'0';
			}return false;
		}

	}

	/** Returns the VAT NUMBER without spaces and country prefix */
	public static String parse(COUNTRIES country, String vatNumber) {
		String compacted=vatNumber.replace(" ","").toUpperCase();
		return compacted.startsWith(country.name()) ?
				compacted.substring(country.name().length()) : compacted;
	}

	public final COUNTRIES country;
	public final String number;

	/** Country can be VIES or ISO */
	public VatNumber(String countryCode, String vatNumber) {
		this(COUNTRIES.get(countryCode), vatNumber);
	}

	public VatNumber(COUNTRIES country, String vatNumber) {
		this.country=country;
		this.number=country==null ? vatNumber : parse(country, vatNumber);
	}

	public boolean isValid() {
		if (country!=null) switch(country){
		default: return true;
		case PT: return CheckDigit.PT(number);
		}return false;
	}

	public CheckVatResult query() throws Exception {
		return country==null ? new CheckVatResult() : country.queryVatNumber(number);
	}


	public static void main(String[] args) throws Exception {

		VatNumber number=new VatNumber(COUNTRIES.PT, "PT 501591109");
		System.out.println("VALID: " + number.isValid());
		System.out.println(number.query());

		number=new VatNumber(COUNTRIES.PT, "509922716");
		System.out.println("VALID: " + number.isValid());
		System.out.println(number.query());

	}

}