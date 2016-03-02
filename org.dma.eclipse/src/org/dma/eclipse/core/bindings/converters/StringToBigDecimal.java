/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import java.math.BigDecimal;

public class StringToBigDecimal extends CustomConverter {

	public StringToBigDecimal() {
		super(String.class, BigDecimal.class);
	}


	@Override
	public Object convert(Object fromObject) {
		return new BigDecimal(fromObject.toString());
	}


}
