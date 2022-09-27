/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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
