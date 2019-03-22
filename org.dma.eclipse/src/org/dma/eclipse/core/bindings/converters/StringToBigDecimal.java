/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import java.math.BigDecimal;

public class StringToBigDecimal extends CustomConverter {

	public StringToBigDecimal() {
		super(String.class, BigDecimal.class);
	}


	@Override
	public BigDecimal convert(Object fromObject) {
		return new BigDecimal(fromObject.toString());
	}


}
