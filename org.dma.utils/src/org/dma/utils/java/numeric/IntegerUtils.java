/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

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
	 * Analysis
	 */
	public static boolean bit(int value, int bit) {

		return (value & bit)!=0;
	}


	public static int smaller(int value1, int value2) {

		return value2<value1 ? value2 : value1;

	}


}
