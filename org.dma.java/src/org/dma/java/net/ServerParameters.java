/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.net;

import org.dma.java.util.ArrayUtils;

public class ServerParameters {

	public static final String LOCALHOST = "localhost";

	public final String host;
	public final int port;

	public ServerParameters(String host) {
		this(host, 0);
	}

	public ServerParameters(String host, int port) {
		this.host=host;
		this.port=port;
	}

	public boolean hasPort() {
		return port>0;
	}

	public boolean isPortValid() {
		return port>0 && port<=65535;
	}

	public boolean isLocalhost() {
		return host.toLowerCase().startsWith(LOCALHOST) || host.startsWith("127.0.0.1");
	}

	public String getURL() {
		return port==0 ?
				"http://" + host :
				"http://" + host + ":" + port;
	}

	public String getURL(String...more) {
		return getURL() + "/" + ArrayUtils.concat(more, "/");
	}

	@Override
	public String toString() {
		return getURL();
	}

}
