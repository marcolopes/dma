/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.proxy;

import javax.xml.ws.BindingProvider;

import com.generixgroup.pt.messaging.webservice.Credentials;
import com.generixgroup.pt.messaging.webservice.GetDocResponse;
import com.generixgroup.pt.messaging.webservice.ListDocResponse;
import com.generixgroup.pt.messaging.webservice.RoutingInfo;
import com.generixgroup.pt.messaging.webservice.UploadDocResponse;
import com.generixgroup.pt.messaging.webservice.Webservice;
import com.generixgroup.pt.messaging.webservice.WebserviceService;

import org.dma.services.broker.SOAPMessageHandler;

public class GenerixServiceHandler extends SOAPMessageHandler {

	/** Netix Messaging */
	public enum ENDPOINTS {

		PRODUCAO ("http://85.158.120.184:9090/einvoice_webservice"),
		TESTES ("http://85.158.120.184:9090/einvoice_webservice");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public GenerixServiceHandler(ENDPOINTS endpoint) {
		super(null, null, null, null);
		this.endpoint = endpoint;
	}


	/** Instancia o servico e inicializa o handler */
	private Webservice getService() throws Exception {

		// cria um novo servico
		Webservice service = new WebserviceService().getWebservicePort();

		// inicializa handler
		initializeHandler((BindingProvider)service, endpoint.url, endpoint.isSecure());

		return service;

	}

	/**
	 * @param transactionID Identificação do documento.
	 * Aconselha-se a que seja o nome do ficheiro original.
	 * @param credentials Autenticação
	 * @param info Informação sobre o emissor, receptor e tipo de mensagem
	 * @param document Mensagem a transportar codificada em base64
	 */
	public UploadDocResponse uploadDocument(String transactionID, Credentials credentials,
			RoutingInfo info, String document) throws Exception {

		return getService().uploadDocument(transactionID, credentials, info, document);

	}

	/**
	 * Devolve uma estrutura com os nomes das mensagens pendentes
	 *
	 * @param credentials Autenticação
	 */
	public ListDocResponse listDocuments(Credentials credentials) throws Exception {

		return getService().listDocuments(credentials, "*");

	}

	/**
	 * Devolve uma estrutura com o conteúdo do documento codificado em base64
	 *
	 * @param credentials Autenticação
	 * @param messageID Nome do ficheiro
	 */
	public GetDocResponse getDocument(Credentials credentials, String messageID) throws Exception {

		return getService().getDocument(credentials, messageID, true);

	}


}