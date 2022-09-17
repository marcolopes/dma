/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.at.proxy;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.ServiceCertificates;
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
		PROD ("https://servicos.portaldasfinancas.gov.pt:400/fews/faturas"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:700/fews/faturas");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final Faturas service = new FaturasService().getFaturasSOAP();

	private Faturas getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public FaturasServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint) {
		super(username, password, cert);
		this.endpoint = endpoint;
	}


	public RegisterInvoiceResponseType register(RegisterInvoiceType type) throws WebServiceException {
		return getService().registerInvoice(type);
	}


}