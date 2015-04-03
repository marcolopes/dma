/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import java.util.Collection;

import org.dma.eclipse.core.bindings.converters.CustomConverter;

public class ObjectToCombo extends CustomConverter {

	private final Collection<?> objectCollection;

	public ObjectToCombo(Collection<?> objectCollection){
		super(Object.class, Object.class);
		this.objectCollection=objectCollection;
	}


	@Override
	public Object convert(Object fromObject) {
		for(Object obj: objectCollection){
			if(fromObject.toString().equals(obj.toString())) return obj;
		}
		return null;
	}


}