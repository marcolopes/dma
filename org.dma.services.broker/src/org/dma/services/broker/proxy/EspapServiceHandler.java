/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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

import javax.xml.ws.WebServiceException;

import com.softlimits.clarinet.ArrayOfMessageOutputData;
import com.softlimits.clarinet.IMessageService;
import com.softlimits.clarinet.MessageService;

import org.dma.java.security.JKSCertificate;
import org.dma.services.broker.SOAPMessageHandler;

/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * https://www.espap.gov.pt/spfin/Paginas/spfin.aspx#maintab5
 */
public class EspapServiceHandler extends SOAPMessageHandler<IMessageService> {

	public enum ENDPOINTS {

		PROD ("https://ws.netdocs.com.pt/TradeHttp/CTMessageService.svc/ssl"),
		TEST ("https://www-qa.netdocs.com.pt/TradeHttpQa/CTMessageService.svc/ssl");

		public final String name;

		private ENDPOINTS(String name) {
			this.name = name;
		}

	}

	private final ENDPOINTS endpoint;

	public IMessageService getService() throws WebServiceException {
		return getService(endpoint.name);
	}

	public EspapServiceHandler(ENDPOINTS endpoint, JKSCertificate cert, String username, String password) {
		super(new MessageService().getCustomBindingIMessageService(), cert, username, password);
		this.endpoint = endpoint;
	}


	public ArrayOfMessageOutputData processMessage(byte[] message) throws WebServiceException {
		return getService().processMessage(message);
	}


}