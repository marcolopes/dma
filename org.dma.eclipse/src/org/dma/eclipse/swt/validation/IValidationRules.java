/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.validation;

public interface IValidationRules {

	/**
	 * Field with no automatic validation
	 */
	public static final int DEFAULT = 0;

	/**
	 * Read-only field<br>
	 * NOTE: The field will be DISABLED and there will be made
	 * no validation to avoid the "block" of fields with error
	 */
	public static final int READONLY = 1 << 0;

	/**
	 * Field cannot be edited
	 * NOTE: The field will be treated with READONLY logic
	 * if in EDITED state
	 */
	public static final int NOTEDITABLE = 1 << 1;

	/**
	 * TEXT cannot be empty<br>
	 * LIST and COMBO must have elements<br>
	 * TIME and DATE must be valid
	 */
	public static final int NOTEMPTY = 1 << 2;

	/**
	 * TEXT cannot be ZERO<br>
	 * LIST and COMBO must have selection
	 */
	public static final int NOTZERO = 1 << 3;

	/**
	 * TEXT length must be exact
	 */
	public static final int LIMITMATCH = 1 << 4;


}