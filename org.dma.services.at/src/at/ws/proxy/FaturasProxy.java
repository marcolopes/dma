package at.ws.proxy;

import java.net.URL;
import java.util.List;

import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;

import pt.gov.portaldasfinancas.servicos.faturas.Faturas;
import pt.gov.portaldasfinancas.servicos.faturas.Faturas_Service;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceResponseType;
import pt.gov.portaldasfinancas.servicos.faturas.RegisterInvoiceType;
import at.ws.AutenticationCypherUtil.Certificate;
import at.ws.SOAPMessageHandler;

import com.sun.xml.ws.developer.WSBindingProvider;
/**
 * PROXY para ligacao ao endpoint do webservice
 *
 * @author ricardo (AT)
 * @author marcolopes@netc.pt
 *
 */
public class FaturasProxy extends SOAPMessageHandler {

	public enum A10_ENDPOINTS {

		//fews = Facturas Envio WebService?
		PRODUCAO ("https://servicos.portaldasfinancas.gov.pt:400/fews/faturas"),
		TESTES ("https://servicos.portaldasfinancas.gov.pt:700/fews/faturas");

		public final String url;

		private A10_ENDPOINTS(String url) {
			this.url = url;
		}

		public boolean isSecure(){
			return url.startsWith("https");
		}

	}

	private final A10_ENDPOINTS endpoint;

	public FaturasProxy(String userName, String password,
			Certificate saCertificate, Certificate swCertificate, A10_ENDPOINTS endpoint) {
		super(userName, password, saCertificate, swCertificate);
		this.endpoint = endpoint;
	}


	/**
	 * Recebe o Bean e realiza um pedido ao webservice.
	 * Instancia a conexao, coloca o Handler e invoca o webservice
	 */
	public RegisterInvoiceResponseType register(RegisterInvoiceType request) throws Exception {

		// obtem o wsdl (por defeito e' usado o wsdlLocation definido no servico)
		URL wsdlLocation = this.getClass().getClassLoader().getResource("faturas.wsdl");
		System.out.println(wsdlLocation);

		// cria um novo servico
		Faturas_Service service = new Faturas_Service(wsdlLocation);
		Faturas soapService = service.getFaturasSOAP();

		// inicializa bindings
		Binding binding = initializeBindings((WSBindingProvider)soapService,
				endpoint.url, endpoint.isSecure());

		// adiciona handler
		List<Handler> chain = binding.getHandlerChain();
		chain.add(this);
		binding.setHandlerChain(chain);

		return soapService.registerInvoice(request);

	}


}