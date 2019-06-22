/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.math;

public class CheckDigits {

	/**
	 * ISO 7064 Mod 97,10 check digit
	 */
	public static String ISO7064Mod97_10(String digits) {

		/*
		int index=0;
		int checksum=0;
		final int[] multiplier={
			51, 73, 17, 89, 38, 62, 45, 53, 15, 50,
			 5, 49, 34, 81, 76, 27, 90,  9, 30,  3};
		for(char c: digits.toCharArray()){
			checksum+=Character.getNumericValue(c) * multiplier[index];
			index++;
		}
		checksum=98-(checksum % 97);
		*/

		int checksum=0;
		for(char c: digits.toCharArray()){
			checksum=(checksum + Character.getNumericValue(c)) * 10 % 97;
		}
		checksum=98-(checksum * 10 % 97);

		return checksum>=10 ? ""+checksum : "0"+checksum;

	}


}