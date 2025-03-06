/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.namespace.QName;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
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
import org.dma.java.net.PermissiveTrustStore;
import org.dma.java.security.JKSCertificate;

/**
 * SOAP Message Handler
 */
public class SOAPMessageHandler<T> implements SOAPHandler<SOAPMessageContext> {

	private enum DIRECTION {

		OUTBOUND, INBOUND;

		public static DIRECTION get(SOAPMessageContext smc) {
			return (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY) ? OUTBOUND : INBOUND;
		}

	}

	private static final String AUTH_PREFIX = "wss";
	private static final String AUTH_NAMESPACE = "http://schemas.xmlsoap.org/ws/2002/12/secext";

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private final T service;
	private final JKSCertificate cert;

	public final String username;
	public final String password;

	/**
	 * @param cert - Service certificates
	 * @param username - Service username
	 * @param password - Service password
	 */
	public SOAPMessageHandler(T service, JKSCertificate cert, String username, String password) {
		this.service = service;
		this.cert = cert;
		this.username = username;
		this.password = password;
	}


	/*
	 * https://stackoverflow.com/questions/2490737/how-to-change-webservice-url-endpoint
	 */
	public T getService(String endpoint) throws WebServiceException {

		BindingProvider provider = (BindingProvider)service;

		Binding binding = provider.getBinding();
		List<Handler> chain = binding.getHandlerChain();
		if (!chain.contains(this)) try{

			HttpURLHandler url = new HttpURLHandler(endpoint);
			if (!url.isValid()) throw new Exception("Invalid URL: "+endpoint);

			//javax.xml.ws.service.endpoint.address
			provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.path());
			//com.sun.xml.internal.ws.connect.timeout
			provider.getRequestContext().put(JAXWSProperties.CONNECT_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);
			//com.sun.xml.internal.ws.request.timeout
			provider.getRequestContext().put(JAXWSProperties.REQUEST_TIMEOUT, DEFAULT_REQUEST_TIMEOUT);

			if (url.isSecure()) try{

				SSLContext sslContext = SSLContext.getInstance("TLSv1.2"); // JAVA 7

				// Indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
				KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				kmf.init(cert.getKeyStore(), cert.password.toCharArray());
				// Trust Store que aceita ligacao SSL sem validar o certificado
				sslContext.init(kmf.getKeyManagers(), new TrustManager[]{new PermissiveTrustStore()}, null);

				// Coloca o SSL socket factory no request context da ligacao a efetuar ao webservice
				provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

			}catch(Exception e){
				throw new WebServiceException(e);
			}

		}catch(Exception e){
			throw new WebServiceException(e);
		}return service;

	}


	/*
	 * (non-Javadoc)
	 * @see javax.xml.ws.handler.soap.SOAPHandler
	 */
	@Override
	public Set<QName> getHeaders() {return null;}


	/*
	 * (non-Javadoc)
	 * @see javax.xml.ws.handler.Handler
	 */
	@Override
	public boolean handleMessage(SOAPMessageContext smc) {

		if (DIRECTION.get(smc)==DIRECTION.OUTBOUND) try{

			/* Falta informacao tecnica */

		}catch(Exception e){
			e.printStackTrace();
		}return log(smc);

	}


	@Override
	public boolean handleFault(SOAPMessageContext smc) {return log(smc);}


	@Override
	public void close(MessageContext messageContext) {}


	private boolean log(SOAPMessageContext smc) {

		if (!smc.isEmpty()) try{

			Source source = smc.getMessage().getSOAPPart().getContent();
			switch(DIRECTION.get(smc)){
			case OUTBOUND: System.err.println("<!---SENT--->\n" + log(source)); break;
			case INBOUND: System.err.println("<!---RECEIVED--->\n" + log(source)); break;
			}return true;

		}catch(Exception e){
			e.printStackTrace();
		}return false;

	}

	protected String log(Source source) throws Exception {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		toXML(source, new StreamResult(out));
		return out.toString("UTF-8");

	}

	protected void toXML(Source source, Result outputTarget) throws Exception {

		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
		transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(source, outputTarget);

	}


}