/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.proxy;

import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.java.util.Debug;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeService;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeServiceImpl;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionRequestType;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionResponseType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class TaxFreeServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		//fews = Facturas Envio WebService?
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:715/TaxFreeServiceImplService"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:715/TaxFreeServiceImplService");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public TaxFreeServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		this(username, password, saCertificate, swCertificate, null, endpoint);
	}

	public TaxFreeServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate,
			JKSCertificate tsCertificate, ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate, tsCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia a conexao, adiciona o handler e invoca o webservice */
	public TaxFreeSubmissionResponseType register(TaxFreeSubmissionRequestType request) throws Exception {

		// cria um novo servico
		TaxFreeServiceImpl service = new TaxFreeServiceImpl();
		// wsdlLocation esta' definido no servico
		Debug.out(service.getWSDLDocumentLocation());
		TaxFreeService soapService = service.getTaxFreeServicePort();

		// inicializa handler
		initializeHandler((WSBindingProvider)soapService, endpoint.url, endpoint.isSecure());

		return soapService.taxFreeSubmission(request);

	}


}