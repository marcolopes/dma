/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Ricardo (AT)
 *******************************************************************************/
package org.dma.services.at.proxy;

import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.java.util.Debug;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.faturas.Faturas;
import pt.gov.portaldasfinancas.servicos.faturas.FaturasService;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class FaturasServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		//fews = Facturas Envio WebService?
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:400/fews/faturas"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:700/fews/faturas");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public FaturasServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		this(username, password, saCertificate, swCertificate, null, endpoint);
	}

	public FaturasServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate,
			JKSCertificate tsCertificate, ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate, tsCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia a conexao, adiciona o handler e invoca o webservice */
	public RegisterInvoiceResponseType register(RegisterInvoiceType request) throws Exception {

		// cria um novo servico
		FaturasService service = new FaturasService();
		// wsdlLocation esta' definido no servico
		Debug.out(service.getWSDLDocumentLocation());
		Faturas soapService = service.getFaturasSOAP();

		// inicializa handler
		initializeHandler((WSBindingProvider)soapService, endpoint.url, endpoint.isSecure());

		return soapService.registerInvoice(request);

	}


}