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

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dma.jaxrs.responses.IResponse;

public class Endpoint extends org.dma.jaxrs.responses.Response {

	@Context private UriInfo info;

	public UriInfo getInfo() {return info;}

	@Context private HttpServletRequest request;

	public HttpServletRequest getRequest() {return request;}

	public static final ExecutorService EXECUTOR = Executors.newCachedThreadPool();

	public static void run(EndpointRunnable runnable) {
		EXECUTOR.execute(runnable);
	}

	public abstract class EndpointRunnable implements Runnable {

		public abstract IResponse process();

		private final AsyncResponse ar;

		public EndpointRunnable(final @Suspended AsyncResponse ar) {
			this.ar=ar;
		}

		@Override
		public void run() {
			try{System.out.println(new Date(request.getSession().getLastAccessedTime()));
				System.out.println("Session["+request.getSession().getId()+"]");
				System.out.println(request.getPathInfo()+request.getParameterMap());
				Response response=process().build();
				System.out.println(response);
				ar.resume(response);
			}catch(Exception e){
				e.printStackTrace();
				ar.resume(internalServerError().build());
			}
		}

	}

}
