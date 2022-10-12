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

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

public class Client {

	public static javax.ws.rs.client.Client newClient() {
		Thread.currentThread().setContextClassLoader(ClientBuilder.class.getClassLoader());
		return ClientBuilder.newClient();
	}

	private final javax.ws.rs.client.Client client;

	public Client() {
		this(newClient());
	}

	public Client(javax.ws.rs.client.Client client) {
		this.client=client;
	}


	/*
	 * Http Methods
	 */
	protected Response post(final String url, final Entity<?> entity) throws Exception {
		return client.target(url).request().async().post(entity).get();
	}

	protected Response put(String url, Entity<?> entity) throws Exception {
		return client.target(url).request().async().put(entity).get();
	}

	protected Response get(String url) throws Exception {
		return client.target(url).request().async().get().get();
	}

	protected Response delete(String url) throws Exception {
		return client.target(url).request().async().delete().get();
	}

}
