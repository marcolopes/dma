/*******************************************************************************
 * 2008-2021 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.java.net;

public class ServerParameters {

	public static final String LOCALHOST = "localhost";

	public final String host;
	public final int port;

	public ServerParameters(String host) {
		this(host, 0);
	}

	public ServerParameters(String host, int port) {
		this.host=host.toLowerCase();
		this.port=port;
	}

	public boolean hasPort() {
		return port>0;
	}

	public boolean isPortValid() {
		return port>0 && port<=65535;
	}

	public boolean isLocalhost() {
		return host.startsWith(LOCALHOST) || host.startsWith("127.0.0.1");
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
