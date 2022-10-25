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

import org.dma.jaxrs.services.QueryParameters.QueryParameterValue;

/**
 * https://restfulapi.net/http-methods
 */
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


	/**
	 * Use GET requests to retrieve resource representation/information only – and not modify it in any way.
	 * As GET requests do not change the resource’s state, these are said to be safe methods.
	 */
	public Response get(String url, QueryParameterValue...parameters) throws Exception {
		return get(url, new QueryParameters(parameters));
	}

	public Response get(String url, QueryParameters parameters) throws Exception {
		String query=parameters.toString();
		System.out.println("[GET] "+url+query);
		return client.target(url+query).request().async().get().get();
	}

	/**
	 * Use POST APIs to create new subordinate resources,
	 * e.g., a file is subordinate to a directory containing it or a row is subordinate to a database table.
	 */
	public Response post(final String url, final Entity<?> entity) throws Exception {
		System.out.println("[POST] "+url);
		return client.target(url).request().async().post(entity).get();
	}

	/**
	 * Use PUT APIs primarily to update an existing resource
	 * (if the resource does not exist, then API may decide to create a new resource or not).
	 */
	public Response put(String url, Entity<?> entity) throws Exception {
		System.out.println("[PUT] "+url);
		return client.target(url).request().async().put(entity).get();
	}

	/**
	 * As the name applies, DELETE APIs delete the resources (identified by the Request-URI).
	 */
	public Response delete(String url) throws Exception {
		System.out.println("[DELETE] "+url);
		return client.target(url).request().async().delete().get();
	}


}
