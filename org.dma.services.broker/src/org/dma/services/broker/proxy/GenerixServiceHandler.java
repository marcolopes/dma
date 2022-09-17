/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.GetDocResponse;
import com.generixgroup.pt.messaging.webservice.ListDocResponse;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;
import com.generixgroup.pt.messaging.webservice.Webservice;
import com.generixgroup.pt.messaging.webservice.WebserviceService;

import org.dma.java.net.HttpURLHandler;
import org.dma.services.broker.SOAPMessageHandler;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class GenerixServiceHandler extends SOAPMessageHandler {

	/** Invoice Manager */
	public enum ENDPOINTS {

		PROD ("http://85.158.120.184:9090/einvoice_webservice/WebservicePort"),
		TEST ("http://85.158.120.184:9090/einvoice_webservice/WebservicePort");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final Webservice service = new WebserviceService().getWebservicePort();

	private Webservice getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public GenerixServiceHandler(String username, String password, ENDPOINTS endpoint) {
		super(username, password);
		this.endpoint = endpoint;
	}


	/**
	 * @param transactionID Identificação do documento.
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