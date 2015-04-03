/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.eclipse.core.bindings.converters;

import org.dma.eclipse.core.bindings.converters.CustomConverter;
import org.dma.java.security.PasswordUtils;

public class StringToPassword extends CustomConverter {

	public StringToPassword() {
		super(String.class, String.class);
	}


	@Override
	public String convert(Object fromObject) {
		return PasswordUtils.MD5PasswordEnconde((String)fromObject);
	}


}
