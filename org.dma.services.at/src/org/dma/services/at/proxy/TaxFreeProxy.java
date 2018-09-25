package org.dma.services.at.proxy;

import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;

import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.services.at.SOAPMessageHandler;

import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeService;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeServiceImplService;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionRequestType;
import pt.gov.portaldasfinancas.servicos.taxfree.TaxFreeSubmissionResponseType;
/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * @author ricardo (AT)
 * @author marcolopespt@gmail.com
 *
 */
public class TaxFreeProxy extends SOAPMessageHandler {

	public enum A10_ENDPOINTS {

		//fews = Facturas Envio WebService?
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:715/TaxFreeServiceImplService"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:715/TaxFreeServiceImplService");

		public final String url;

		private A10_ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure() {
			return url.startsWith("https");
		}

	}

	private final A10_ENDPOINTS endpoint;

	public TaxFreeProxy(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate, A10_ENDPOINTS endpoint) {
		super(username, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/**
	 * Recebe o Bean e realiza um pedido ao webservice.
	 * Instancia a conexao, coloca o Handler e invoca o webservice
	 */
	public TaxFreeSubmissionResponseType register(TaxFreeSubmissionRequestType request) throws Exception {

		/*
		// obtem o wsdl (wsdlLocation predefinido esta' definido no servico)
		URL wsdlLocation = this.getClass().getClassLoader().getResource("eTaxFreeSoapWebServices.wsdl");
		System.out.println(wsdlLocation);
		//TaxFreeServiceImplService service = new TaxFreeServiceImplService(wsdlLocation);
		*/

		// cria um novo servico
		TaxFreeServiceImplService service = new TaxFreeServiceImplService();
		// wsdlLocation esta' definido no servico
		System.out.println(service.getWSDLDocumentLocation());
		TaxFreeService soapService = service.getTaxFreeServicePort();

		// inicializa bindings
		Binding binding = initializeBindings((WSBindingProvider)soapService,
				endpoint.url, endpoint.isSecure());

		// adiciona handler
		List<Handler> chain = binding.getHandlerChain();
		chain.add(this);
		binding.setHandlerChain(chain);

		return soapService.taxFreeSubmission(request);

	}


}