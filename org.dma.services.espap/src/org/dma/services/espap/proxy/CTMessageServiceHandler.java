/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.espap.proxy;

import com.softlimits.clarinet.ArrayOfMessageOutputData;
import com.softlimits.clarinet.IMessageService;
import com.softlimits.clarinet.MessageService;
import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.services.espap.SOAPMessageHandler;
/**
 * PROXY para ligacao ao endpoint do webservice
 * https://www.espap.gov.pt/spfin/Paginas/spfin.aspx#maintab5
 */
public class CTMessageServiceHandler extends SOAPMessageHandler {

	public enum A10_ENDPOINTS {
		PRODUCAO ("https://ws.netdocs.com.pt/TradeHttp/CTMessageService.svc/ssl"),
		TESTES ("https://www-qa.netdocs.com.pt/TradeHttpQa/CTMessageService.svc/ssl");

		public final String url;

		private A10_ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final A10_ENDPOINTS endpoint;

	public CTMessageServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, A10_ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia a conexao, coloca o adiciona e invoca o webservice */
	public ArrayOfMessageOutputData register(byte[] message) throws Exception {

		// cria um novo servico
		MessageService service = new MessageService();
		// wsdlLocation esta' definido no servico
		System.out.println(service.getWSDLDocumentLocation());
		IMessageService soapService = service.getCustomBindingIMessageService();

		// inicializa handler
		initializeHandler((WSBindingProvider)soapService, endpoint.url, endpoint.isSecure());

		return soapService.processMessage(message);

	}


}