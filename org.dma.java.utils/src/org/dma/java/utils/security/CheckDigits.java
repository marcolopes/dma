/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.security;

import org.dma.java.utils.string.StringUtils;

public final class CheckDigits {

	/**
	 * Validates a NIF (Fiscal Identification Number)
	 * @param nif - 9 digit number
	 */
	public static boolean validateNIF(String nif) {

		final int max=9;

		//check if is numeric and has 9 numbers
		if (StringUtils.isNumeric(nif) && nif.length()==max) {

			int checkSum=0;
			//perform calculations
			for (int i=0; i<max-1; i++){
				checkSum+=StringUtils.num(nif.charAt(i)) * (max-i);
			}

			int checkDigit=11-(checkSum % 11);
			//if checkDigit is higher than TEN set it to zero
			if (checkDigit>=10) checkDigit=0;

			//compare checkDigit with the last number of NIF
			return checkDigit==StringUtils.num(nif.charAt(max-1));

		}

		return false;

	}


}
