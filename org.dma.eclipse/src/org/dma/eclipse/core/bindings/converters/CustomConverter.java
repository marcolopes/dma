/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import org.eclipse.core.databinding.conversion.IConverter;

public abstract class CustomConverter implements IConverter {

	private final Class fromType, toType;

	public CustomConverter(Class fromType, Class toType) {
		this.fromType=fromType;
		this.toType=toType;
	}

	@Override
	public Class getFromType() {
		return fromType;
	}


	@Override
	public Class getToType() {
		return toType;
	}


}