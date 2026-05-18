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

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dma.java.util.MessageLine;
import org.dma.java.util.TimeDateUtils;
import org.dma.jaxrs.responses.IResponse;

public class Endpoint extends org.dma.jaxrs.responses.Response {

	@Context private UriInfo info;
	public UriInfo getInfo() {return info;}

	@Context private HttpServletRequest request;
	public HttpServletRequest getRequest() {return request;}

	@Override
	public String toString() {
		//2025-04-04 23:59:99:999 [127.0.0.1 -> 127.0.0.1] http://url?parameters
		return new MessageLine(TimeDateUtils.getDateFormatted(
				new Date(request.getSession().getLastAccessedTime()), "yyyy-MM-dd HH:mm:ss:SSS")).
				//parentheses(getClass().getSimpleName()).
				brackets(new MessageLine(request.getRemoteAddr()).forward().append(request.getLocalAddr())).
				append(info.getRequestUri()).toString();
	}

	/*
	 * Runnable
	 */
	private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool();

	public static void run(EndpointRunnable runnable) {EXECUTOR.execute(runnable);}

	public abstract class EndpointRunnable implements Runnable {

		public abstract IResponse process();

		private final AsyncResponse ar;

		public EndpointRunnable(final @Suspended AsyncResponse ar) {
			this.ar=ar;
		}

		public boolean resume(Response response) {
			System.out.println(Endpoint.this.toString());
			System.out.println(response);
			return ar.resume(response);
		}

		/** Override to handle exception cause */
		public WebApplicationException handle(Throwable cause) {
			cause.printStackTrace();
			return new WebApplicationException(cause);
		}

		@Override
		public void run() {
			try{resume(process().build());
			}catch(Exception e){
				resume(handle(e).getResponse());
			}
		}

	}

}
