/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Ricardo (AT)
 *******************************************************************************/
package org.dma.services.at.proxy;

import javax.xml.ws.BindingProvider;

import org.dma.java.security.JKSCertificate;
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
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:401/sgdtws/documentosTransporte"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:701/sgdtws/documentosTransporte");

		public final String url;

		private ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final ENDPOINTS endpoint;

	public StockMovementServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia o servico e inicializa o handler */
	private DocumentosTransporte getService() throws Exception {

		// cria um novo servico
		DocumentosTransporte service = new DocumentosTransporteService().getDocumentosTransporteSOAP();

		// inicializa handler
		initializeHandler((BindingProvider)service, endpoint.url, endpoint.isSecure());

		return service;

	}


	public StockMovementResponse register(StockMovement type) throws Exception {

		return getService().envioDocumentoTransporte(type);

	}


}