package pt.at.factemipf.core.webservices.proxy;

import java.io.IOException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Logger;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.ws.handler.Handler;

import pt.at.factemipf.core.webservices.client.factemiws.Faturas;
import pt.at.factemipf.core.webservices.client.factemiws.Faturas_Service;
import pt.at.factemipf.core.webservices.client.factemiws.RegisterInvoiceResponseType;
import pt.at.factemipf.core.webservices.client.factemiws.RegisterInvoiceType;
import pt.at.factemipf.core.webservices.proxy.SOAPClientMessageHeaderHandler.CERTIFICATE;

import com.sun.xml.ws.developer.JAXWSProperties;
import com.sun.xml.ws.developer.WSBindingProvider;

/**
 * proxy para ligacao ao endpoint do webservice.
 *
 * @author ricardo
 */
public class FaturasWSProxy {

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private final Logger logger;

	private final String endpoint;
	private final String user;
	private final String password;
	private final CERTIFICATE ambienteCert;

	public FaturasWSProxy(Logger logger, String endpoint, String user, String password, CERTIFICATE ambienteCert){
		this.logger = logger;
		this.endpoint = endpoint;
		this.user = user;
		this.password = password;
		this.ambienteCert = ambienteCert;
	}

	/**
	 * Recebe o Bean e realiza um pedido ao webservice.
	 * Instancia a conneccao, coloca os Handler (log e headers) e invoca o
	 * webservice
	 *
	 * @param registerInvoiceTypeRequest
	 *            request Bean a ser utilizado na invocacao do webservice
	 * @return resposta da invocacao do webservice
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws CertificateException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchPaddingException
	 * @throws InvalidAlgorithmParameterException
	 *
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws ParseException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	public RegisterInvoiceResponseType registerInvoice(RegisterInvoiceType registerInvoiceTypeRequest) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, ParseException, UnrecoverableKeyException, KeyManagementException {

		// obtem o wsdl
		URL wsdlUrl = this.getClass().getClassLoader().getResource("wsdl/factemiws/factemiws.wsdl");

		// cria um novo service para facturas
		Faturas_Service service = new Faturas_Service(wsdlUrl);

		Faturas serviceOps = service.getFaturasSOAP();

		WSBindingProvider bp = (WSBindingProvider)serviceOps;

		// ENDPOINT
		bp.getRequestContext().put("javax.xml.ws.service.endpoint.address", endpoint);
		// CONNECT_TIMEOUT
		bp.getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", DEFAULT_CONNECT_TIMEOUT);
		// REQUEST_TIMEOUT
		bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", DEFAULT_REQUEST_TIMEOUT);

		// caso o endpoint seja https, adiciona a ligacao o sslContext
		if(endpoint.startsWith("https")){
			setSSLConnection(bp);
		}

		// handler para colocacao de header no pedido
		SOAPClientMessageHeaderHandler soapClientHeaderHandler = new SOAPClientMessageHeaderHandler(logger, user, password, ambienteCert);
		// handler para loggin da mensagem enviada e recebida
		SOAPMessageLoggerHandler soapMessageLogger = new SOAPMessageLoggerHandler(logger);
		List<Handler> chain = bp.getBinding().getHandlerChain();
		chain.add(soapClientHeaderHandler);
		chain.add(soapMessageLogger);
		bp.getBinding().setHandlerChain(chain);

		return serviceOps.registerInvoice(registerInvoiceTypeRequest);
	}

	/**
	 * Colocar o SSL socket factory no request context do ligacao a efetuar ao
	 * webservice
	 *
	 * @param bp
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws CertificateException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	private void setSSLConnection(WSBindingProvider bp) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException, KeyManagementException {
		KeyStore ks = KeyStore.getInstance("pkcs12");
		ks.load(this.getClass().getClassLoader().getResourceAsStream("Testes Web services.pfx"), "TESTEwebservice".toCharArray());

		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
		kmf.init(ks, "TESTEwebservice".toCharArray());

		SSLContext sslContext = SSLContext.getInstance("TLS");

		// adicionar um Trust Store que aceita ligacao SSl sem validar o certificado
		sslContext.init(kmf.getKeyManagers(), new TrustManager[]{new PermissiveTrustStore()}, null);

		bp.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

	}

}
