/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import javax.ws.rs.client.Client;

import org.dma.java.gson.GsonConverter;

/**
 * https://restfulapi.net/http-methods
 * https://eclipse-ee4j.github.io/jersey/download.html
 * https://repo1.maven.org/maven2/org/glassfish/jersey/bundles/jaxrs-ri/
 */
public class ClientHandler extends GsonConverter {

	public final Client client;

	public ClientHandler() {
		this(new ClientBuilder().builder);
	}

	public ClientHandler(javax.ws.rs.client.ClientBuilder builder) {
		this(builder.build());
	}

	public ClientHandler(Client client) {
		this.client=client;
	}

	/** @see Client#close() */
	public void close() {
		client.close();
	}


}
