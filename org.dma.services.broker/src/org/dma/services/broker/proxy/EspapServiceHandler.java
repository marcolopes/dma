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
package org.dma.services.broker.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import com.softlimits.clarinet.ArrayOfMessageOutputData;
import com.softlimits.clarinet.IMessageService;
import com.softlimits.clarinet.MessageService;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.JKSCertificate;
import org.dma.java.security.ServiceCertificates;
import org.dma.services.broker.SOAPMessageHandler;

/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * https://www.espap.gov.pt/spfin/Paginas/spfin.aspx#maintab5
 */
public class EspapServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PROD ("https://ws.netdocs.com.pt/TradeHttp/CTMessageService.svc/ssl"),
		TEST ("https://www-qa.netdocs.com.pt/TradeHttpQa/CTMessageService.svc/ssl");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final IMessageService service = new MessageService().getCustomBindingIMessageService();

	private IMessageService getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public EspapServiceHandler(String username, String password, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		super(username, password, new ServiceCertificates(null, swCertificate));
		this.endpoint = endpoint;
	}


	public ArrayOfMessageOutputData processMessage(byte[] message) throws WebServiceException {
		return getService().processMessage(message);
	}


}