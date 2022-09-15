/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.dma.java.security.ServiceCertificates;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.documentos.FatcorewsPort;
import pt.gov.portaldasfinancas.servicos.documentos.FatcorewsPortService;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterInvoiceRequest;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterPaymentRequest;
import pt.gov.portaldasfinancas.servicos.documentos.RegisterWorkRequest;
import pt.gov.portaldasfinancas.servicos.documentos.ResponseType;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class DocumentosServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		PROD ("https://servicos.portaldasfinancas.gov.pt:423/fatcorews/ws/"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:723/fatcorews/ws/");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public DocumentosServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint) {
		super(username, password, cert);
		this.endpoint = endpoint;
	}


	/** Instancia o servico e inicializa o handler */
	private FatcorewsPort getService() throws WebServiceException {

		// cria um novo servico
		FatcorewsPort service = new FatcorewsPortService().getFatcorewsPortSoap11();

		// inicializa handler
		initializeHandler((BindingProvider)service, endpoint.url, endpoint.isSecure());

		return service;

	}


	public ResponseType register(RegisterInvoiceRequest type) throws WebServiceException {

		return getService().registerInvoice(type).getResponse();
	}


	public ResponseType register(RegisterWorkRequest type) throws WebServiceException {

		return getService().registerWork(type).getResponse();
	}


	public ResponseType register(RegisterPaymentRequest type) throws WebServiceException {

		return getService().registerPayment(type).getResponse();
	}


}