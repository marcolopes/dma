/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.input;

public interface IFieldProperties {

	public static final int NONE = 0;

	/** Allows DIGITS and SPACES */
	public static final int DIGITS = 1 << 0;

	/** Allows LETTERS and SPACES */
	public static final int LETTERS = 1 << 1;

	/** Allows POSITIVE numbers */
	public static final int POSITIVE = 1 << 2;

	/** Does not allow SPACES */
	public static final int NOSPACES = 1 << 3;

	/** Converts to uppercase */
	public static final int UPPERCASE = 1 << 4;

	/** Converts to lowercase */
	public static final int LOWERCASE = 1 << 5;


}
