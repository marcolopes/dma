/*******************************************************************************
 * 2008-2019 Public Domain
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
			//check if is numeric and has 9 numbers
			if (!number.matches("[0-9]+") || number.length()!=max) return false;
			int checkSum=0;
			//calculate checkSum
			for (int i=0; i<max-1; i++){
				checkSum+=(number.charAt(i)-'0')*(max-i);
			}
			int checkDigit=11-(checkSum % 11);
			//if checkDigit is higher than 9 set it to zero
			if (checkDigit>9) checkDigit=0;
			//compare checkDigit with the last number of NIF
			return checkDigit==number.charAt(max-1)-'0';
		}

	}

	/** Returns the VAT NUMBER without spaces and country prefix */
	public static String parse(COUNTRIES country, String vatNumber) {
		String compacted=vatNumber.replaceAll(" ","").toUpperCase();
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
		this.number=parse(country, vatNumber);
	}

	public boolean isValid() {
		switch(country){
		default: return true;
		case PT: return CheckDigit.PT(number);
		}
	}

	public CheckVatResult query() {
		return country.queryVatNumber(number);
	}


	public static void main(String[] args) {

		VatNumber number=new VatNumber(COUNTRIES.PT, "509922716");
		System.out.println("VALID: " + number.isValid());
		System.out.println(number.query());

		number=new VatNumber(COUNTRIES.PT, "PT 501591109");
		System.out.println("VALID: " + number.isValid());
		System.out.println(number.query());

	}

}