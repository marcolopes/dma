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

import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporte;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporteService;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;

/**
 * PROXY para ligacao ao endpoint do webservice
 */
public class StockMovementServiceHandler extends SOAPMessageHandler {

	public enum ENDPOINTS {

		//sgdtws = Servico de Gestao de Documentos de Transporte WebService?
		PROD ("https://servicos.portaldasfinancas.gov.pt:401/sgdtws/documentosTransporte"),
		TEST ("https://servicos.portaldasfinancas.gov.pt:701/sgdtws/documentosTransporte");

		public final HttpURLHandler url;

		private ENDPOINTS(String urlname) {
			this.url = new HttpURLHandler(urlname);
		}

	}

	private final DocumentosTransporte service = new DocumentosTransporteService().getDocumentosTransporteSOAP();

	private DocumentosTransporte getService() throws WebServiceException {
		initialize((BindingProvider)service, endpoint.url);
		return service;
	}

	private final ENDPOINTS endpoint;

	public StockMovementServiceHandler(String username, String password, ServiceCertificates cert, ENDPOINTS endpoint) {
		super(username, password, cert);
		this.endpoint = endpoint;
	}


	public StockMovementResponse register(StockMovement type) throws WebServiceException {
		return getService().envioDocumentoTransporte(type);
	}


}