/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.dma.java.security.JKSCertificate;
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
		super(username, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia o servico e inicializa o handler */
	private TaxFreeService getService() throws WebServiceException {

		// cria um novo servico
		TaxFreeService service = new TaxFreeServiceImpl().getTaxFreeServicePort();

		// inicializa handler
		initializeHandler((BindingProvider)service, endpoint.url, endpoint.isSecure());

		return service;

	}


	public TaxFreeSubmissionResponseType register(TaxFreeSubmissionRequestType type) throws WebServiceException {

		return getService().taxFreeSubmission(type);

	}


}