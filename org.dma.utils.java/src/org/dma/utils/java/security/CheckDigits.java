/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import org.dma.utils.java.string.StringUtils;

public final class CheckDigits {

	/**
	 * Validates a NIF (Numero de Identificacao Fiscal)
	 * @param nif - 9 digit number
	 */
	public static boolean validateNIF(String nif) {

		final int max=9;

		//check if is numeric and has 9 numbers
		if (StringUtils.isNumeric(nif) && nif.length()==max) {

			int checkDigit=0;

			//perform CheckDigit calculations
			for (int i=0; i<max-1; i++){
				checkDigit+=StringUtils.num(nif.charAt(i)) * (max-i);
			}

			checkDigit=11-(checkDigit % 11);

			//if checkDigit is higher than ten set it to zero
			if (checkDigit>=10)
				checkDigit=0;

			//compare checkDigit with the last number of NIF
			return checkDigit==StringUtils.num(nif.charAt(max-1));

		}

		return false;

	}


}
