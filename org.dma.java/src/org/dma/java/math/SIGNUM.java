/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.math;

import java.math.BigDecimal;

public enum SIGNUM {

	ONE (BigDecimal.ONE),
	MINUS_ONE (ONE.value.negate());

	public final BigDecimal value;

	private SIGNUM(BigDecimal value) {
		this.value=value;
	}

}