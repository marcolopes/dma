/*******************************************************************************
 * 2008-2020 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.java.net;

public class ServerParameters {

	public final String host;
	public final int port;

	public ServerParameters(String host) {
		this(host, 0);
	}

	public ServerParameters(String host, int port) {
		this.host=host;
		this.port=port;
	}

	public String getURL() {
		return port==0 ?
				"http://" + host :
				"http://" + host + ":" + port;
	}

	public String getURL(String path) {
		return getURL() + "/" + path;
	}

	@Override
	public String toString() {
		return getURL();
	}

}
