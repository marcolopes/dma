package org.dma.services.at.proxy;

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;

import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporte;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.DocumentosTransporteService;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovement;
import pt.gov.portaldasfinancas.servicos.documentosTransporte.StockMovementResponse;
/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * @author ricardo (AT)
 * @author marcolopespt@gmail.com
 *
 */
public class StockMovementServiceHandler extends SOAPMessageHandler {

	public enum A10_ENDPOINTS {

		//sgdtws = Servico de Gestao de Documentos de Transporte WebService?
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:401/sgdtws/documentosTransporte"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:701/sgdtws/documentosTransporte");

		public final String url;

		private A10_ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final A10_ENDPOINTS endpoint;

	public StockMovementServiceHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, A10_ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/**
	 * Recebe o Bean e realiza um pedido ao webservice.
	 * Instancia a conexao, coloca o Handler e invoca o webservice
	 */
	public StockMovementResponse register(StockMovement request) throws Exception {

		// cria um novo servico
		DocumentosTransporteService service = new DocumentosTransporteService();
		// wsdlLocation esta' definido no servico
		System.out.println(service.getWSDLDocumentLocation());
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