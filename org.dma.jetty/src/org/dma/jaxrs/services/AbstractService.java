/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Filipe Santos (filipesantos__12@hotmail.com)
 *******************************************************************************/
package org.dma.jaxrs.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.glassfish.jersey.server.ResourceConfig;

import org.dma.java.util.MessageList;

public abstract class AbstractService extends ArrayList<Class> {

	private static final long serialVersionUID = 1L;

	public abstract MessageList initialize();

	public AbstractService(Class...klass) {
		this(Arrays.asList(klass));
	}

	public AbstractService(List<Class> klass) {
		addAll(klass);
	}

	/** Register service classes */
	public void register(ResourceConfig config) {
		for(Class klass: this){
			config.register(klass);
		}
	}

}
