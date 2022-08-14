/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@projectocolibri.com)
 * Filipe Santos (filipesantos__12@hotmail.com)
 *******************************************************************************/
package org.dma.jetty;

import org.dma.java.net.ServerParameters;
import org.dma.java.util.MessageList;
import org.dma.java.util.StringUtils;

import org.eclipse.jetty.server.ServerConnector;

public class JettyParameters extends ServerParameters {

	//Exceptions
	public static final IllegalArgumentException HOST_NOT_DEFINED_EXCEPTION = new IllegalArgumentException("host is not defined");
	public static final IllegalArgumentException INVALID_PORT_EXCEPTION = new IllegalArgumentException("port is invalid");

	public JettyParameters() {
		this("127.0.0.1", 8087);
	}

	public JettyParameters(String host, int port) {
		super(host, port);
	}

	public MessageList validate() {
		MessageList error = new MessageList();
		if (StringUtils.isEmpty(host)) error.add(HOST_NOT_DEFINED_EXCEPTION);
		if (!isPortValid()) error.add(INVALID_PORT_EXCEPTION);
		return error;
	}

	public void configure(ServerConnector connector) {
		connector.setHost(host);
		connector.setPort(port);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [server=" + super.toString() + "]";
	}

}
