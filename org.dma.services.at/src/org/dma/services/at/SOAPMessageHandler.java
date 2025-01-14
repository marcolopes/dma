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
package org.dma.services.at;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
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

import org.dma.bouncycastle.PROVIDERS;
import org.dma.java.cipher.CryptoCipher;
import org.dma.java.cipher.CryptoCipher.CIPHERS;
import org.dma.java.cipher.RSAPublicCipher;
import org.dma.java.net.HttpURLHandler;
import org.dma.java.net.NTPServerHandler.NTPTimeInfo;
import org.dma.java.net.NTPServerHandler.NTP_SERVERS;
import org.dma.java.net.PermissiveTrustStore;
import org.dma.java.security.MessageDigest;
import org.dma.java.security.MessageDigest.ALGORITHMS;
import org.dma.java.util.Debug;
import org.dma.java.util.SystemUtils;

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

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private static final String AUTH_PREFIX = "wss";
	private static final String AUTH_NAMESPACE = "http://schemas.xmlsoap.org/ws/2002/12/secext";

	private static final NTPTimeInfo TIME_INFO = NTP_SERVERS.queryAll(1000);

	private final T service;

	public final String username;
	public final String password;
	public final ServiceCertificates cert;

	/**
	 * @param username Service username
	 * @param password Service password
	 * @param cert Service certificates
	 */
	public SOAPMessageHandler(T service, String username, String password, ServiceCertificates cert) {
		this.service = service;
		this.username = username;
		this.password = password;
		this.cert = cert;
	}


	/*
	 * https://stackoverflow.com/questions/2490737/how-to-change-webservice-url-endpoint
	 */
	public T getService(String endpoint) throws WebServiceException {

		BindingProvider provider = (BindingProvider)service;

		Binding binding = provider.getBinding();
		List<Handler> chain = binding.getHandlerChain();
		if (!chain.contains(this)) try{

			if (cert==null) throw new WebServiceException("No certificates found!");
			if (Debug.STATUS) System.out.println(cert);
			cert.validate();

			HttpURLHandler url = new HttpURLHandler(endpoint);
			if (!url.isValid()) throw new Exception("Invalid URL: "+endpoint);

			// add handler
			chain.add(this);
			binding.setHandlerChain(chain);

			//javax.xml.ws.service.endpoint.address
			provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.path());
			//com.sun.xml.internal.ws.connect.timeout
			provider.getRequestContext().put(JAXWSProperties.CONNECT_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);
			//com.sun.xml.internal.ws.request.timeout
			provider.getRequestContext().put(JAXWSProperties.REQUEST_TIMEOUT, DEFAULT_REQUEST_TIMEOUT);

			if (url.isSecure()){

				SSLContext sslContext = SystemUtils.IS_JAVA_1_7 ?
						SSLContext.getInstance("TLSv1.2", PROVIDERS.JSSE.provider) :
						SSLContext.getInstance("TLS");

				if (Debug.STATUS) System.setProperty("javax.net.debug", "ssl:handshake");
				// Indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
				KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
				kmf.init(cert.sw.getKeyStore(), cert.sw.password.toCharArray());
				sslContext.init(kmf.getKeyManagers(), cert.ts==null ?
						// Trust Store que aceita ligacao SSL sem validar o certificado
						new TrustManager[]{new PermissiveTrustStore()} : cert.ts.getTrustManagers(), new SecureRandom());

				/*KeyStore ks = KeyStore.getInstance("JKS");
				ks.load(this.getClass().getClassLoader().getResourceAsStream("trustStore"), "cliente".toCharArray());
				TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
				tmf.init(ks);
				SSLContext sslContext = SSLContext.getInstance("TLS");
				sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);*/

				// Coloca o SSL socket factory no request context da ligacao a efetuar ao webservice
				provider.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

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

			// Generate simetric key used for this request!
			CryptoCipher simetricKeyCipher = new CryptoCipher(CIPHERS.AES_ECB_PKCS5);
			byte[] simetricKey = simetricKeyCipher.getKey().getEncoded();

			// Create SOAP Factory
			SOAPFactory factory = SOAPFactory.newInstance();

			// Username Token
			SOAPElement usernameToken = factory.createElement("UsernameToken", AUTH_PREFIX, AUTH_NAMESPACE);

			// Username
			usernameToken.addChildElement(factory.createElement("Username", AUTH_PREFIX, AUTH_NAMESPACE).addTextNode(username));

			// Nonce
			usernameToken.addChildElement(factory.createElement("Nonce", AUTH_PREFIX, AUTH_NAMESPACE).addTextNode(
					 // Encrypt with the SA public key and B64 encode the request simetric key
					 new RSAPublicCipher(cert.sa.getCertificate().getPublicKey()).BASE64encrypt(simetricKey, 0)));

			// Password
			usernameToken.addChildElement(factory.createElement("Password", AUTH_PREFIX, AUTH_NAMESPACE).addTextNode(
					// Encrypt with the simetric key and B64 encode the password
					simetricKeyCipher.BASE64encrypt(password, 0)));

			/*SOAPElement passwordElement = factory.createElement("Password", AUTH_PREFIX, AUTH_NAMESPACE).addTextNode(
					// Encrypt with the simetric key and B64 encode the password
					simetricKeyCipher.BASE64encrypt(password, 0));
			// Encrypt with the simetric key and B64 encode the digest
			passwordElement.addAttribute(factory.createName("Digest"), simetricKeyCipher.BASE64encrypt(
					createPasswordDigest(simetricKey, timestamp, password), 0));*/

			// Created
			usernameToken.addChildElement(factory.createElement("Created", AUTH_PREFIX, AUTH_NAMESPACE).addTextNode(
					// Encrypt with the simetric key and B64 encode the timestamp
					simetricKeyCipher.BASE64encrypt(createTimestamp(), 0)));

			// Security
			SOAPElement securityHeader = factory.createElement("Security", AUTH_PREFIX, AUTH_NAMESPACE);
			securityHeader.addChildElement(usernameToken);

			// Create SOAP Header for SOAP envelope
			SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
			if (envelope.getHeader()==null) envelope.addHeader(); // JAVA 8
			envelope.getHeader().addChildElement(securityHeader);

			return log(smc);

		}catch(Exception e){
			e.printStackTrace();
		}return false;

	}


	@Override
	public boolean handleFault(SOAPMessageContext smc) {return log(smc);}


	@Override
	public void close(MessageContext messageContext) {}


	private String createTimestamp() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Long offset=TIME_INFO==null || TIME_INFO.getOffset()==null ? 0 : TIME_INFO.getOffset();
		return sdf.format(new Date(System.currentTimeMillis()+offset));

	}


	@Deprecated
	private byte[] createPasswordDigest(byte[] simetricKey, String timestamp, String password) throws UnsupportedEncodingException {

		byte[] createdBytes = timestamp.getBytes("UTF8");
		byte[] passwordBytes = password.getBytes("UTF8");
		byte[] message = new byte[simetricKey.length + createdBytes.length + passwordBytes.length];
		System.arraycopy(simetricKey, 0, message, 0, simetricKey.length);
		System.arraycopy(createdBytes, 0, message, simetricKey.length, createdBytes.length);
		System.arraycopy(passwordBytes, 0, message, simetricKey.length + createdBytes.length, passwordBytes.length);
		return new MessageDigest(ALGORITHMS.SHA1).digest(message);

	}


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