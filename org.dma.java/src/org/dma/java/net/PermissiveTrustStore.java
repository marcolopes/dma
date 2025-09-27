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
 *******************************************************************************/
package org.dma.java.net;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class PermissiveTrustStore implements X509TrustManager {

	public static SSLContext createSSLContext() {
		try{SSLContext sslContext=SSLContext.getInstance("TLS"); // JAVA 8
			sslContext.init(null, new TrustManager[]{new PermissiveTrustStore()}, new SecureRandom());
			return sslContext;
		}catch(Exception e){
			e.printStackTrace();
		}return null;
	}

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) {
		//do nothing, you're the client
	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) {
		//do nothing, accept all
	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {
		//also only relevant for servers
		return null;
	}

}
