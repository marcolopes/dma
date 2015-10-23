package org.dma.services.at.proxy;

import java.net.URL;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;

import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporte;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporte_Service;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;
/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * @author ricardo (AT)
 * @author marcolopes@netc.pt
 *
 */
public class DocumentosTransporteProxy extends SOAPMessageHandler {

	public enum A10_ENDPOINTS {

		//sgdtws = Servico de Gestao de Documentos de Transporte WebService?
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:401/sgdtws/documentosTransporte"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:701/sgdtws/documentosTransporte");

		public final String url;

		private A10_ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure(){
			return url.startsWith("https");
		}

	}

	private final A10_ENDPOINTS endpoint;

	public DocumentosTransporteProxy(String userName, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, A10_ENDPOINTS endpoint) {
		super(userName, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/**
	 * Recebe o Bean e realiza um pedido ao webservice.
	 * Instancia a conexao, coloca o Handler e invoca o webservice
	 */
	public StockMovementResponse register(StockMovement request) throws Exception {

		// obtem o wsdl (wsdlLocation predefinido esta' definido no servico)
		URL wsdlLocation = this.getClass().getClassLoader().getResource("documentosTransporte.wsdl");
		System.out.println(wsdlLocation);

		// cria um novo servico
		DocumentosTransporte_Service service = new DocumentosTransporte_Service(wsdlLocation);
		DocumentosTransporte soapService = service.getDocumentosTransporteSOAP();

		// inicializa bindings
		Binding binding = initializeBindings((WSBindingProvider)soapService,
				endpoint.url, endpoint.isSecure());

		// adiciona handler
		List<Handler> chain = binding.getHandlerChain();
		chain.add(this);
		binding.setHandlerChain(chain);

		return soapService.envioDocumentoTransporte(request);

	}


}