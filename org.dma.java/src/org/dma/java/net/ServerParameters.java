/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
