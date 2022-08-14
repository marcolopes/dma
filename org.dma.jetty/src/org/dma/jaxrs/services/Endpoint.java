/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Filipe Santos (filipesantos__12@hotmail.com)
 *******************************************************************************/
package org.dma.jaxrs.services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import org.dma.jaxrs.responses.IResponse;
import org.dma.jaxrs.responses.Response;

public class Endpoint {

	public static Client newClient() {
		Thread.currentThread().setContextClassLoader(ClientBuilder.class.getClassLoader());
		return ClientBuilder.newClient();
	}

	public static final int MAX_THREAD_POOL = 10;

	public static ExecutorService executor = Executors.newFixedThreadPool(MAX_THREAD_POOL);

	public abstract class EndpointRunnable implements Runnable {

		protected abstract IResponse process();

		private final AsyncResponse ar;

		public EndpointRunnable(final @Suspended AsyncResponse ar) {
			this.ar=ar;
		}

		@Override
		public void run() {
			try{ar.resume(process().build());
			}catch(Exception e){
				e.printStackTrace();
				ar.resume(Response.internalServerError().build());
			}
		}

	}

	/*
	 * Run
	 */
	public static void run(EndpointRunnable runnable) {
		executor.execute(runnable);
	}

}
