/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.input;

import org.dma.java.math.NumericUtils;

public class FieldProperties implements IFieldProperties {

	public final int properties;

	public FieldProperties(int properties) {
		this.properties=properties;
	}

	public boolean is(int properties) {
		return NumericUtils.bit(this.properties, properties);
	}

	public boolean isDigits() {
		return is(DIGITS);
	}

	public boolean isLetters() {
		return is(LETTERS);
	}

	public boolean isPositive() {
		return is(POSITIVE);
	}

	public boolean isNoSpaces() {
		return is(NOSPACES);
	}

	public boolean isUppercase() {
		return is(UPPERCASE);
	}

	public boolean isLowercase() {
		return is(LOWERCASE);
	}

}