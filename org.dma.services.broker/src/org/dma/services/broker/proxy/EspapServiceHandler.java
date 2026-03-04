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
 *******************************************************************************/
package org.dma.services.broker.proxy;

import java.security.SecureRandom;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import com.softlimits.clarinet.ArrayOfMessageOutputData;
import com.softlimits.clarinet.IMessageService;
import com.softlimits.clarinet.MessageService;
import com.sun.xml.ws.developer.JAXWSProperties;

import org.dma.java.net.PermissiveTrustStore;
import org.dma.java.security.JKSCertificate;

/*
 * PROXY para ligacao ao endpoint do webservice
 *
 * https://www.espap.gov.pt/spfin/Paginas/spfin.aspx#maintab5
 */
public class EspapServiceHandler {

	public enum ENDPOINTS {

		PROD ("https://ws.netdocs.com.pt/TradeHttp/CTMessageService.svc/ssl"),
		TEST ("https://www-qa.netdocs.com.pt/TradeHttpQa/CTMessageService.svc/ssl");

		public final String name;

		private ENDPOINTS(String name) {
			this.name=name;
		}

	}

	public static IMessageService getService(JKSCertificate cert) throws WebServiceException {
		System.setProperty("javax.net.debug", "all");
		IMessageService service=new MessageService().getCustomBindingIMessageService();
		try{SSLContext sslContext=SSLContext.getInstance("TLSv1.2");
			KeyManagerFactory kmf=KeyManagerFactory.getInstance("SunX509");
			kmf.init(cert.getKeyStore(), cert.password.toCharArray());
			sslContext.init(kmf.getKeyManagers(), new TrustManager[]{new PermissiveTrustStore()}, new SecureRandom());
			BindingProvider provider=(BindingProvider)service;
			provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());
		}catch(Exception e){
			throw new WebServiceException(e);
		}return service;
	}

	public final ENDPOINTS endpoint;
	public final String username;
	public final String password;
	public final JKSCertificate cert;

	public EspapServiceHandler(ENDPOINTS endpoint, String username, String password, JKSCertificate cert) {
		this.endpoint=endpoint;
		this.username=username;
		this.password=password;
		this.cert=cert;
	}


	public ArrayOfMessageOutputData processMessage(byte[] message) throws WebServiceException {
		return getService(cert).processMessage(message);
	}


}