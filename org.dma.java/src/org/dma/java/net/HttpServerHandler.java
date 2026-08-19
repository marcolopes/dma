/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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

public class HttpServerHandler extends HttpURLHandler {

	public static String getUrl(boolean secure, String host, int port) {
		StringBuilder sb=new StringBuilder(secure ? "https" : "http").
			append("://").append(host);
		if (port>0) sb.append(":"+port);
		return sb.toString();
	}

	public final String host;
	public final int port;

	public HttpServerHandler(String host) {
		this(host, 0);
	}

	public HttpServerHandler(String host, int port) {
		this(false, host, port);
	}

	public HttpServerHandler(boolean secure, String host) {
		this(secure, host, 0);
	}

	public HttpServerHandler(boolean secure, String host, int port) {
		super(getUrl(secure, host, port));

		this.host=host;
		this.port=port;
	}

}
