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

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.GetDocResponse;
import com.generixgroup.pt.messaging.webservice.ListDocResponse;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;
import com.generixgroup.pt.messaging.webservice.Webservice;
import com.generixgroup.pt.messaging.webservice.WebserviceService;

import org.dma.services.broker.SOAPMessageHandler;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class GenerixServiceHandler extends SOAPMessageHandler<Webservice> {

	/** Invoice Manager */
	public enum ENDPOINTS {

		PROD ("http://85.158.120.184:9090/einvoice_webservice/WebservicePort"),
		TEST ("http://85.158.120.184:9090/einvoice_webservice/WebservicePort");

		public final String name;

		private ENDPOINTS(String name) {
			this.name = name;
		}

	}

	private final ENDPOINTS endpoint;

	public Webservice getService() throws WebServiceException {
		return getService(endpoint.name);
	}

	public GenerixServiceHandler(ENDPOINTS endpoint, String username, String password) {
		super(new WebserviceService().getWebservicePort(), null, username, password);
		this.endpoint = endpoint;
	}


	/**
	 * @param transactionID A identificação do documento.
	 * Aconselha-se a que seja o nome do ficheiro original.
	 * @param credentials Autenticação
	 * @param info Informação sobre o emissor, receptor e tipo de mensagem
	 * @param document Mensagem a transportar codificada em base64
	 */
	public UploadDocResponse uploadDocument(String transactionID, Credentials credentials,
			RoutingInfo info, String document) throws WebServiceException {
		return getService().uploadDocument(transactionID, credentials, info, document);
	}

	/**
	 * Devolve uma estrutura com os nomes das mensagens pendentes
	 *
	 * @param credentials Autenticação
	 */
	public ListDocResponse listDocuments(Credentials credentials) throws WebServiceException {
		return getService().listDocuments(credentials, "*");
	}

	/**
	 * Devolve uma estrutura com o conteúdo do documento codificado em base64
	 *
	 * @param credentials Autenticação
	 * @param messageID Nome do ficheiro
	 */
	public GetDocResponse getDocument(Credentials credentials, String messageID) throws WebServiceException {
		return getService().getDocument(credentials, messageID, true);
	}


}