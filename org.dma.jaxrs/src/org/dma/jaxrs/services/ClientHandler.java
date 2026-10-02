/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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

import java.util.concurrent.Future;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

import org.dma.java.net.URLHandler;
import org.dma.java.util.MessageList;

/*
 * https://restfulapi.net/http-methods
 * https://eclipse-ee4j.github.io/jersey/download.html
 * https://repo1.maven.org/maven2/org/glassfish/jersey/bundles/jaxrs-ri/
 */
public class ClientHandler extends org.dma.jaxrs.responses.Response {

	private final Client client;
	private final URLHandler url;

	public Client getClient() {return client;}
	public URLHandler getUrl() {return url;}

	public ClientHandler(URLHandler url) {
		this(url, new ClientBuilder().builder);
	}

	public ClientHandler(URLHandler url, javax.ws.rs.client.ClientBuilder builder) {
		this(url, builder.build());
	}

	public ClientHandler(URLHandler url, Client client) {
		this.client=client;
		this.url=url;
	}

	public WebTarget target(String...more) {
		return client.target(url.path(more));
	}

	/** @see Client#close() */
	public void close() {client.close();}

	public <T> T get(Future<T> future) {
		try{return future.get();
		}catch(Exception e){
			MessageList error=new MessageList(getUrl().toString()).append(e);
			Throwable cause=e.getCause();
			while(cause!=null){
				error.add(cause);
				cause=cause.getCause();
			}error.print(System.err);
		}return null;
	}


}
