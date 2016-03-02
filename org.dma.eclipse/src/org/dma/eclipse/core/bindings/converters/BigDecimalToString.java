/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import java.math.BigDecimal;

public class BigDecimalToString extends CustomConverter {

	public BigDecimalToString() {
		super(BigDecimal.class, String.class);
	}


	@Override
	public Object convert(Object fromObject) {
		return fromObject.toString();
	}


}
