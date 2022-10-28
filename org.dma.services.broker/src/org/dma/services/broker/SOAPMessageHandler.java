/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Ricardo (Autoridade Tributaria)
 *******************************************************************************/
package org.dma.services.broker;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
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
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.sun.xml.ws.developer.JAXWSProperties;

import org.dma.java.cipher.MessageDigest;
import org.dma.java.cipher.MessageDigest.ALGORITHMS;
import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.ServiceCertificates;

/**
 * SOAP Message Handler
 */
public class SOAPMessageHandler implements SOAPHandler<SOAPMessageContext> {

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private static final String AUTH_NS = "http://schemas.xmlsoap.org/ws/2002/12/secext";
	private static final String AUTH_PREFIX = "wss";

	private static final Logger LOGGER = Logger.getLogger(SOAPMessageHandler.class.getSimpleName());

	public final String username;
	public final String password;
	public final ServiceCertificates cert;

	/**
	 * @param username - Service Username
	 * @param password - Service Password
	 */
	public SOAPMessageHandler(String username, String password) {
		this(username, password, null);
	}

	/**
	 * @param username - Service Username
	 * @param password - Service Password
	 * @param cert - Service Certificates
	 */
	public SOAPMessageHandler(String username, String password, ServiceCertificates cert) {
		this.username = username;
		this.password = password;
		this.cert = cert;
	}


	/*
	 * https://stackoverflow.com/questions/2490737/how-to-change-webservice-url-endpoint
	 */
	public void initialize(BindingProvider provider, HttpURLHandler url) throws WebServiceException {

		Binding binding = provider.getBinding();
		List<Handler> chain = binding.getHandlerChain();
		if (!chain.contains(this)){

			// add handler
			chain.add(this);
			binding.setHandlerChain(chain);

			//javax.xml.ws.service.endpoint.address
			provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.path());
			//com.sun.xml.internal.ws.connect.timeout
			provider.getRequestContext().put(JAXWSProperties.CONNECT_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);
			//com.sun.xml.internal.ws.request.timeout
			provider.getRequestContext().put(JAXWSProperties.REQUEST_TIMEOUT, DEFAULT_REQUEST_TIMEOUT);

			if (url.isSecure()) try{

				cert.validate();

				// Coloca o SSL socket factory no request context da ligacao a efetuar ao webservice
				KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				kmf.init(cert.sw.getKeyStore(), cert.sw.password.toCharArray());

				SSLContext sslContext = SSLContext.getInstance("TLSv1.2"); // necessita JAVA 7
				// indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
				sslContext.init(kmf.getKeyManagers(), cert.ts==null ?
						// Trust Store que aceita ligacao SSL sem validar o certificado
						new TrustManager[]{new PermissiveTrustStore()} : cert.ts.getTrustManagers(), null);

				/*Indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
				KeyStore ks = KeyStore.getInstance("JKS");
				ks.load(this.getClass().getClassLoader().getResourceAsStream("trustStore"), "cliente".toCharArray());
				TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
				tmf.init(ks);
				SSLContext sslContext = SSLContext.getInstance("TLS");
				sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);*/

				provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

			}catch(Exception e){
				throw new WebServiceException(e);
			}

		}

	}


	@Override
	public Set<QName> getHeaders() {
		return null;
	}


	/** Adiciona header para autenticacao */
	@Override
	public boolean handleMessage(SOAPMessageContext smc) {

		try{
			boolean direction = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			if (direction){/* Falta informacao tecnica */}

			logSOAPMessage(smc);

		}catch(Exception e){
			e.printStackTrace();
		}return true;

	}


	@Override
	public boolean handleFault(SOAPMessageContext smc) {
		logSOAPMessage(smc);
		return true;
	}


	@Override
	public void close(MessageContext messageContext) {}


	private byte[] createPasswordDigest(byte[] simetricKey, String timestamp, String password) throws UnsupportedEncodingException {

		byte[] createdBytes = timestamp.getBytes("UTF8");
		byte[] passwordBytes = password.getBytes("UTF8");

		byte[] message = new byte[simetricKey.length + createdBytes.length + passwordBytes.length];
		System.arraycopy(simetricKey, 0, message, 0, simetricKey.length);
		System.arraycopy(createdBytes, 0, message, simetricKey.length, createdBytes.length);
		System.arraycopy(passwordBytes, 0, message, simetricKey.length + createdBytes.length, passwordBytes.length);

		return new MessageDigest(ALGORITHMS.SHA1).digest(message);

	}


	private void logSOAPMessage(SOAPMessageContext smc) {

		if (!smc.isEmpty())	try{

			boolean direction = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			LOGGER.info((direction ? "<!---SENT--->	" : "<!---RECEIVED--->") + "\n" +
					toXMLString(smc.getMessage().getSOAPPart().getContent()));

		}catch(Exception e){
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			LOGGER.severe("Could not log SOAP message\n" + sw.toString());
		}

	}


	private String toXMLString(Source source) throws Exception {

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