/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dma.jaxrs.responses.IResponse;

public class Endpoint extends org.dma.jaxrs.responses.Response {

	public static final ExecutorService EXECUTOR = Executors.newCachedThreadPool();

	public static void run(EndpointRunnable runnable) {
		EXECUTOR.execute(runnable);
	}

	@Context private UriInfo info;

	public String getPathParameter(String key) {
		return info.getPathParameters().getFirst(key);
	}

	public abstract class EndpointRunnable implements Runnable {

		public abstract IResponse process();

		private final AsyncResponse ar;

		public EndpointRunnable(final @Suspended AsyncResponse ar) {
			this.ar=ar;
		}

		@Override
		public void run() {
			try{Response response=process().build();
				System.out.println(response);
				ar.resume(response);
			}catch(Exception e){
				e.printStackTrace();
				ar.resume(internalServerError().build());
			}
		}

	}

}
