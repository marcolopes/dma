/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Others
 *******************************************************************************/
package org.dma.utils.java.security;

import org.dma.utils.eclipse.Debug;
import org.dma.utils.java.string.StringUtils;

public final class CheckDigits {

	/*
	 * <summary>
	 * Validates a NIF (Numero de Identificacao Fiscal)
	 * </summary>
	 * <param name="nif"></param>
	 * <returns></returns>
	 */
	public static boolean checkNIF(String nif) {

		Debug.info("nif",nif);

		//Check if is numeric and if has 9 numbers
		if (StringUtils.isNumeric(nif) && nif.length()==9) {

			//Get the first number of NIF
			String c = nif.substring(0,1);

			//Check first number is (1, 2, 5, 6, 8 or 9)
			if (c.equals("1") || c.equals("2") || c.equals("5") || c.equals("6") || c.equals("8") || c.equals("9")) {

				//Perform CheckDigit calculations
				int checkDigit = StringUtils.num(c.charAt(0)) * 9;
				for (int i=2; i<=8; i++) {
					checkDigit += StringUtils.num(nif.charAt(i-1)) * (10-i);
				}
				checkDigit = 11 - (checkDigit % 11);

				//if checkDigit is higher than ten set it to zero
				if (checkDigit>=10)
					checkDigit=0;

				//Compare checkDigit with the last number of NIF
				if (checkDigit==StringUtils.num(nif.charAt(8)))
					return true;
			}
		}

		return false;

	}
}
