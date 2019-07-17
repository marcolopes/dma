/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.espap;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.namespace.QName;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.sun.xml.ws.developer.JAXWSProperties;
import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.security.JKSCertificate;
import org.dma.java.util.Debug;
/**
 * SOAP Message Handler
 */
public class SOAPMessageHandler implements SOAPHandler<SOAPMessageContext> {

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private static final String AUTH_NS = "http://schemas.xmlsoap.org/ws/2002/12/secext";
	private static final String AUTH_PREFIX = "wss";

	private static final Logger LOGGER = Logger.getLogger(SOAPMessageHandler.class.getSimpleName());

	private final String username;
	private final String password;
	private final JKSCertificate saCertificate;
	private final JKSCertificate swCertificate;

	/**
	 * @param username - Service Username
	 * @param password - Service Password
	 * @param saCertificate - Scheme Administrator Certificate
	 * @param swCertificate - Software Developer Certificate
	 */
	public SOAPMessageHandler(String username, String password,
			JKSCertificate saCertificate, JKSCertificate swCertificate) {
		this.username = username;
		this.password = password;
		this.saCertificate = saCertificate;
		this.swCertificate = swCertificate;
	}


	public void initializeHandler(WSBindingProvider provider, String endpoint, boolean secure) throws Exception {

		// adiciona handler
		Binding binding = provider.getBinding();
		List<Handler> chain = binding.getHandlerChain();
		chain.add(this);
		binding.setHandlerChain(chain);

		//javax.xml.ws.service.endpoint.address
		provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
		//com.sun.xml.internal.ws.connect.timeout
		provider.getRequestContext().put(JAXWSProperties.CONNECT_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);
		//com.sun.xml.internal.ws.request.timeout
		provider.getRequestContext().put(JAXWSProperties.REQUEST_TIMEOUT, DEFAULT_REQUEST_TIMEOUT);

		if(secure){

			// Coloca o SSL socket factory no request context da ligacao a efetuar ao webservice
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
			kmf.init(swCertificate.getKeyStore(), swCertificate.password.toCharArray());

			// adiciona um Trust Store que aceita ligacao SSL sem validar o certificado
			SSLContext sslContext = SSLContext.getInstance("TLSv1"); // JAVA8 usa TLSv2
			sslContext.init(kmf.getKeyManagers(), new TrustManager[]{new PermissiveTrustStore()}, null);

			/*
			// indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
			KeyStore ks = KeyStore.getInstance("JKS");
			ks.load(this.getClass().getClassLoader().getResourceAsStream("trustStore"), "cliente".toCharArray());
			TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
			tmf.init(ks);
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
			*/

			provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

		}

	}


	@Override
	public Set<QName> getHeaders() {
		return null;
	}


	@Override
	public void close(MessageContext messageContext) {}


	@Override
	public boolean handleFault(SOAPMessageContext smc) {
		interceptAndRecordSoapMessage(smc);
		return true;
	}


	/**
	 * Adiciona header para autenticacao
	 */
	@Override
	public boolean handleMessage(SOAPMessageContext smc) {

		try{
			boolean direction = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			if(direction){
				/*
				 * Falta informacao tecnica do ESPAP
				 */
			}

			interceptAndRecordSoapMessage(smc);

		}catch(Exception e){
			Debug.err(e);
		}

		return true;

	}


	private void interceptAndRecordSoapMessage(SOAPMessageContext smc) {

		try{
			Source source = smc.getMessage().getSOAPPart().getContent();
			boolean direction = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			LOGGER.info((direction ? "\n>>>SENT<<<\n" : "\n>>>RECEIVED<<<\n") + sourceToXMLString(source));

		}catch(Exception e){
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			LOGGER.severe("Could not intercept and log soap message\n\n" + sw.toString());
		}

	}


	private String sourceToXMLString(Source source) throws Exception {

		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		transformer.transform(source, new StreamResult(out));

		return out.toString("UTF-8");

	}


}