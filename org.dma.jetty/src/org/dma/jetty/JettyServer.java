/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@projectocolibri.com)
 * Filipe Santos (filipesantos__12@hotmail.com)
 * Sergio Gomes (s.miguelgomes@gmail.com)
 *******************************************************************************/
package org.dma.jetty;

import java.util.Collection;

import org.eclipse.jetty.io.EndPoint;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerWrapper;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.component.LifeCycle.Listener;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class JettyServer implements Runnable {

	//Exceptions
	public static final IllegalArgumentException PARAMETERS_NOT_DEFINED_EXCEPTION = new IllegalArgumentException("parameters is not defined");
	public static final IllegalArgumentException HANDLER_NOT_DEFINED_EXCEPTION = new IllegalArgumentException("handler is not defined");

	private final Server server=new Server();

	private final JettyParameters parameters;
	private final Handler handler;

	private boolean busy=false;

	public JettyServer() {
		this(new HandlerWrapper());
	}

	public JettyServer(Handler handler) {
		this(new JettyParameters(), handler);
	}

	public JettyServer(String host, int port, Handler handler) {
		this(new JettyParameters(host, port), handler);
	}

	public JettyServer(JettyParameters parameters, Handler handler) {
		this(parameters, handler, null);
	}

	public JettyServer(JettyParameters parameters, Handler handler, SslContextFactory sslContextFactory) {
		if (parameters==null) throw PARAMETERS_NOT_DEFINED_EXCEPTION;
		if (handler==null) throw HANDLER_NOT_DEFINED_EXCEPTION;
		this.parameters=parameters;
		this.handler=handler;
		configure(sslContextFactory);
	}

	private void configure(SslContextFactory sslContextFactory) {
		server.setStopAtShutdown(true);
		server.setHandler(handler);
		ServerConnector connector=sslContextFactory==null ? createConnector() : createConnector(sslContextFactory);
		connector.close();
		server.setConnectors(new Connector[]{connector});
		server.addLifeCycleListener(new Listener() {
			@Override
			public void lifeCycleStarting(LifeCycle event) {busy=true;}
			@Override
			public void lifeCycleStarted(LifeCycle event) {busy=false;}
			@Override
			public void lifeCycleFailure(LifeCycle event, Throwable cause) {busy=false;}
			@Override
			public void lifeCycleStopping(LifeCycle event) {busy=true;}
			@Override
			public void lifeCycleStopped(LifeCycle event) {busy=false;}
		});
	}

	private ServerConnector createConnector() {
		ServerConnector connector=new ServerConnector(server);
		parameters.configure(connector);
		return connector;
	}

	private ServerConnector createConnector(SslContextFactory sslContextFactory) {
		ServerConnector connector=new ServerConnector(server, sslContextFactory);
		parameters.configure(connector);
		return connector;
	}

	@Override
	public void run() {
		try{server.start();
			server.join();
		}catch(Exception e){}
	}

	public JettyServer start() {
		busy=true;
		new Thread(this).start();
		while(busy)try{
			Thread.sleep(50);
		}catch(Exception e){}
		return this;
	}

	public JettyServer stop() {
		try{server.stop();
		}catch(Exception e){}
		return this;
	}

	public boolean startStop() {
		if (isRunning()) stop();
		else start();
		return isRunning();
	}

	public boolean isRunning() {
		return server.isRunning();
	}

	public boolean isStopped() {
		return server.isStopped();
	}

	public Server getServer() {
		return server;
	}

	public JettyParameters getParameters() {
		return parameters;
	}

	public Handler getHandler() {
		return handler;
	}

	public Collection<EndPoint> getConnectedEndPoints() {
		return server.getConnectors()[0].getConnectedEndPoints();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [version=" + Server.getVersion() +
				", server=" + server +
				", parameters=" + parameters +
				", handler=" + handler + "]";
	}

}
