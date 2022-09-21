/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.numerals;

import java.util.Locale;

public class ENWordNumerals extends WordNumerals {

	public static final NumeralUnit UNIT_EURO = new NumeralUnit("Euros", "Cents");

	public static final NumeralUnit UNIT_METER = new NumeralUnit("Meters", "Centimeters");

	/** EURO by default */
	public ENWordNumerals(int scale) {
		this(scale, UNIT_EURO);
	}

	public ENWordNumerals(int scale, NumeralUnit unit) {
		super(new Locale("EN"), scale, unit);
	}


}