/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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

import org.dma.java.net.HttpURLHandler;
import org.dma.java.security.JKSCertificate;

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
	public final JKSCertificate cert;

	/**
	 * @param username Service username
	 * @param password Service password
	 */
	public SOAPMessageHandler(String username, String password) {
		this(username, password, null);
	}

	/**
	 * @param username Service username
	 * @param password Service password
	 * @param cert Service certificate
	 */
	public SOAPMessageHandler(String username, String password, JKSCertificate cert) {
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

				// Coloca o SSL socket factory no request context da ligacao a efetuar ao webservice
				KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				kmf.init(cert.getKeyStore(), cert.password.toCharArray());

				SSLContext sslContext = SSLContext.getInstance("TLSv1.2"); // necessita JAVA 7
				// Trust Store que aceita ligacao SSL sem validar o certificado
				sslContext.init(kmf.getKeyManagers(), new TrustManager[]{new PermissiveTrustStore()}, null);

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
	public boolean handleMessage(SOAPMessageContext context) {

		try{boolean direction = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

			if (direction){/* Falta informacao tecnica */}

			log(context);

		}catch(Exception e){
			e.printStackTrace();
		}return true;

	}


	@Override
	public boolean handleFault(SOAPMessageContext context) {
		log(context);
		return true;
	}


	@Override
	public void close(MessageContext context) {}


	private void log(SOAPMessageContext context) {

		if (!context.isEmpty())	try{

			Source source = context.getMessage().getSOAPPart().getContent();
			boolean direction = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			System.err.println((direction ? "<!---SENT--->" : "<!---RECEIVED--->") + "\n" + toXML(source));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	private String toXML(Source source) throws Exception {

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		toXML(source, new StreamResult(out));

		return out.toString("UTF-8");

	}


	private void toXML(Source source, StreamResult outputTarget) throws Exception {

		Transformer transformer = TransformerFactory.newInstance().newTransformer();

		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		transformer.transform(source, outputTarget);

	}


}