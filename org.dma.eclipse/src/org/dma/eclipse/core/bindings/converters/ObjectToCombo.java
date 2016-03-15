/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import java.util.Collection;

public class ObjectToCombo extends CustomConverter {

	private final Collection<?> objectCollection;

	/** Beware of objects equals() method */
	public ObjectToCombo(Collection<?> objectCollection){
		super(Object.class, Object.class);
		this.objectCollection=objectCollection;
	}


	@Override
	public Object convert(Object fromObject) {
		for(Object obj: objectCollection){
			if(fromObject.equals(obj)) return obj;
		}
		return null;
	}


}