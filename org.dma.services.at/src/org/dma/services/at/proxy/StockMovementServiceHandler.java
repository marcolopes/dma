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
		this(username, password, saCertificate, swCertificate, null, endpoint);
	}

	public StockMovementServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate,
			JKSCertificate tsCertificate, ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate, tsCertificate);
		this.endpoint = endpoint;
	}


	/** Instancia a conexao, adiciona o handler e invoca o webservice */
	public StockMovementResponse register(StockMovement request) throws Exception {

		// cria um novo servico
		DocumentosTransporteService service = new DocumentosTransporteService();
		// wsdlLocation esta' definido no servico
		Debug.out(service.getWSDLDocumentLocation());
		DocumentosTransporte soapService = service.getDocumentosTransporteSOAP();

		// inicializa handler
		initializeHandler((WSBindingProvider)soapService, endpoint.url, endpoint.isSecure());

		return soapService.envioDocumentoTransporte(request);

	}


}