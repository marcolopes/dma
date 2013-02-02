/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import org.dma.utils.java.string.StringUtils;

public class IntegerUtils {

	/*
	 * Conversion
	 */
	public static String toString(int value){

		return Integer.toString(value);

	}


	public static char chr(int value) {

		return (char)value;

	}






	/*
	 * Creation
	 */
	public static Integer random(int length) {

		return new Integer(StringUtils.random("0123456789", length));

	}





	/*
	 * Analysis
	 */
	public static boolean bit(int value, int bit) {

		return (value & bit)!=0;
	}


	public static int smaller(int value1, int value2) {

		return value2<value1 ? value2 : value1;

	}


	public static int bigger(int value1, int value2) {

		return value2>value1 ? value2 : value1;

	}


}
