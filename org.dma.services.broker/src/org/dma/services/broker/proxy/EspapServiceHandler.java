/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.broker.proxy;

import javax.xml.ws.BindingProvider;

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
public class EspapServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PRODUCAO ("https://ws.netdocs.com.pt/TradeHttp/CTMessageService.svc/ssl"),
		TESTES ("https://www-qa.netdocs.com.pt/TradeHttpQa/CTMessageService.svc/ssl");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public EspapServiceHandler(String username, String password, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		super(username, password, null, swCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia o servico e inicializa o handler */
	private IMessageService getService() throws Exception {

		// cria um novo servico
		IMessageService service = new MessageService().getCustomBindingIMessageService();

		// inicializa handler
		initializeHandler((BindingProvider)service, endpoint.url, endpoint.isSecure());

		return service;

	}


	public ArrayOfMessageOutputData processMessage(byte[] message) throws Exception {

		return getService().processMessage(message);

	}


}