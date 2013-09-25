package pt.at.webservices.sgdt.proxy;

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
import javax.xml.namespace.QName;
import javax.xml.ws.handler.Handler;

import pt.at.webservices.factemipf.proxy.PermissiveTrustStore;
import pt.at.webservices.factemipf.proxy.SOAPClientMessageHeaderHandler;
import pt.at.webservices.factemipf.proxy.SOAPMessageLoggerHandler;
import pt.at.webservices.factemipf.proxy.SOAPClientMessageHeaderHandler.CERTIFICATE;
import pt.at.webservices.sgdt.client.DocumentosTransporte;
import pt.at.webservices.sgdt.client.DocumentosTransporte_Service;
import pt.at.webservices.sgdt.client.StockMovement;
import pt.at.webservices.sgdt.client.StockMovementResponse;

import com.sun.xml.ws.developer.JAXWSProperties;
import com.sun.xml.ws.developer.WSBindingProvider;

public class DocumentoTransporteClientProxy {

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	public static final QName DOCUMENTOTRANSPORTE_QNAME = new QName(
			"https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/", "documentosTransporte");

	private Logger logger;

	private String endpoint;
	private String user;
	private String password;
	private CERTIFICATE ambienteCert;
	private String keystoreFile;
	private String keystorePassword;

	public DocumentoTransporteClientProxy(Logger logger, String endpoint, String user, String password, CERTIFICATE ambienteCert,
			String keystoreFile, String keystorePassword) {
		this.logger = logger;
		this.endpoint = endpoint;
		this.user = user;
		this.password = password;
		this.ambienteCert = ambienteCert;
		this.keystoreFile = keystoreFile != null ? keystoreFile : "TesteWebServices.pfx";
		this.keystorePassword = keystorePassword != null ? keystorePassword : "TESTEwebservice";
	}

	/**
	 * Recebe o Bean e realiza um pedido ao webservice. Instancia a connecção, coloca os Handler (log e headers) e
	 * invoca o webservice
	 * 
	 * @param envioDocumentoTransporteRequest request Bean a ser utilizado na invocação do webservice
	 * @return resposta da invocação do webservice
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws CertificateException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchPaddingException
	 * @throws InvalidAlgorithmParameterException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws ParseException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	public final StockMovementResponse envioDocumentoTransporte(
			StockMovement envioDocumentoTransporteRequest) throws NoSuchAlgorithmException,
			KeyStoreException, CertificateException, IOException, InvalidKeyException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, ParseException,
			UnrecoverableKeyException, KeyManagementException {

		// obtem o wsdl
		URL wsdlUrl = this.getClass().getClassLoader().getResource("wsdl/documentosTransporte.wsdl");

		// cria um novo service para facturas
		DocumentosTransporte_Service service = new DocumentosTransporte_Service(wsdlUrl, DOCUMENTOTRANSPORTE_QNAME);

		DocumentosTransporte serviceOps = service.getDocumentosTransporteSOAP();

		WSBindingProvider bp = (WSBindingProvider) serviceOps;

		// ENDPOINT
		bp.getRequestContext().put("javax.xml.ws.service.endpoint.address", endpoint);
		// CONNECT_TIMEOUT
		bp.getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", DEFAULT_CONNECT_TIMEOUT);
		// REQUEST_TIMEOUT
		bp.getRequestContext().put("com.sun.xml.internal.ws.request.timeout", DEFAULT_REQUEST_TIMEOUT);

		// caso o endpoint seja https, adiciona a ligação o sslContext
		if (endpoint.startsWith("https")) {
			setSSLConnection(bp);
		}

		// handler para colocação de header no pedido
		SOAPClientMessageHeaderHandler soapClientHeaderHandler = new SOAPClientMessageHeaderHandler(logger, user, password,
				ambienteCert);

		// handler para loggin da mensagem enviada e recebida
		SOAPMessageLoggerHandler soapMessageLogger = new SOAPMessageLoggerHandler(logger);

		@SuppressWarnings("rawtypes")
		List<Handler> chain = bp.getBinding().getHandlerChain();
		chain.add(soapClientHeaderHandler);
		chain.add(soapMessageLogger);
		
		bp.getBinding().setHandlerChain(chain);

		return serviceOps.envioDocumentoTransporte(envioDocumentoTransporteRequest);
	}

	/**
	 * Colocar o SSL socket factory no request context do ligação a efetuar ao webservice
	 *
	 * @param bp
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws CertificateException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	private void setSSLConnection(WSBindingProvider bp) throws KeyStoreException, IOException, NoSuchAlgorithmException,
			CertificateException, UnrecoverableKeyException, KeyManagementException {

		KeyStore ks = KeyStore.getInstance("pkcs12");
		ks.load(this.getClass().getClassLoader().getResourceAsStream(keystoreFile), keystorePassword.toCharArray());

		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
		kmf.init(ks, keystorePassword.toCharArray());

		SSLContext sslContext = SSLContext.getInstance("TLS");

		// indica um conjunto de certificados confiaveis para estabelecer a ligação SSL
//		KeyStore ts = KeyStore.getInstance("JKS");
//		ts.load(this.getClass().getClassLoader().getResourceAsStream("trustStore"), "cliente".toCharArray());
//		TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
//		tmf.init(ts);
//		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
		
		sslContext.init(kmf.getKeyManagers(), new TrustManager[] {new PermissiveTrustStore()}, null);

		bp.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

	}
}