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
package org.dma.services.at;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
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
import javax.xml.soap.SOAPHeader;
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

import org.dma.java.cipher.CryptoCipher;
import org.dma.java.cipher.CryptoCipher.CIPHERS;
import org.dma.java.cipher.MessageDigest;
import org.dma.java.cipher.MessageDigest.ALGORITHMS;
import org.dma.java.cipher.RSAPublicCipher;
import org.dma.java.net.HttpURLHandler;
import org.dma.java.net.NTPServerHandler.NTPTimeInfo;
import org.dma.java.net.NTPServerHandler.NTP_SERVERS;
import org.dma.java.security.ServiceCertificates;

/**
 * SOAP Message Handler
 */
public class SOAPMessageHandler implements SOAPHandler<SOAPMessageContext> {

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private static final String AUTH_NS = "http://schemas.xmlsoap.org/ws/2002/12/secext";
	private static final String AUTH_PREFIX = "wss";

	public final String username;
	public final String password;
	public final ServiceCertificates cert;
	public final File output;

	/**
	 * @param username - Service Username
	 * @param password - Service Password
	 * @param cert - Service Certificates
	 */
	public SOAPMessageHandler(String username, String password, ServiceCertificates cert) {
		this(username, password, cert, null);
	}

	/**
	 * @param username - Service Username
	 * @param password - Service Password
	 * @param cert - Service Certificates
	 * @param output - Result Output File
	 */
	public SOAPMessageHandler(String username, String password, ServiceCertificates cert, File output) {
		this.username = username;
		this.password = password;
		this.cert = cert;
		this.output = output;
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

				if (cert==null) throw new Exception("No certificates found!");

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

		try{boolean direction = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

			if (direction){

				// Generate simetric key used for this request!
				final CryptoCipher simetricKeyCipher = new CryptoCipher(CIPHERS.AES_ECB_PKCS5);
				final byte[] simetricKey = simetricKeyCipher.getKey().getEncoded();

				// create Timestamp
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
				sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				/*Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
				String timestamp = sdf.format(calendar.getTime());*/
				NTPTimeInfo time = NTP_SERVERS.queryAll(500, NTP_SERVERS.OAL, NTP_SERVERS.XS2ALL, NTP_SERVERS.WINDOWS);
				final String timestamp = sdf.format(time==null ? new Date() : time.getServerDate());

				// create SOAP Factory
				final SOAPFactory soapFactory = SOAPFactory.newInstance();

				// Username
				final SOAPElement usernameElem = soapFactory.createElement("Username", AUTH_PREFIX, AUTH_NS);
				usernameElem.addTextNode(username);

				// Password
				final SOAPElement passwordElem = soapFactory.createElement("Password", AUTH_PREFIX, AUTH_NS);
				// Encrypt with the simetric key and B64 encode the password
				passwordElem.addTextNode(simetricKeyCipher.BASE64encrypt(password, 0));

				// Encrypt with the simetric key and B64 encode the digest
				byte[] passwordDigest = createPasswordDigest(simetricKey, timestamp, password);
				passwordElem.addAttribute(soapFactory.createName("Digest"), simetricKeyCipher.BASE64encrypt(passwordDigest, 0));

				// Nonce
				final SOAPElement nonceElem = soapFactory.createElement("Nonce", AUTH_PREFIX, AUTH_NS);
				// Encrypt with the SA public key and B64 encode the request simetric key
				PublicKey publicKey = cert.sa.getCertificate().getPublicKey();
				nonceElem.addTextNode(new RSAPublicCipher(publicKey).BASE64encrypt(simetricKey, 0));

				// Created
				final SOAPElement createdElem = soapFactory.createElement("Created", AUTH_PREFIX, AUTH_NS);
				createdElem.addTextNode(timestamp);

				// Username Token
				final SOAPElement usernameTokenElem = soapFactory.createElement("UsernameToken", AUTH_PREFIX, AUTH_NS);
				usernameTokenElem.addChildElement(usernameElem);
				usernameTokenElem.addChildElement(passwordElem);
				usernameTokenElem.addChildElement(nonceElem);
				usernameTokenElem.addChildElement(createdElem);

				// Security
				final SOAPElement securityHeaderElem = soapFactory.createElement("Security", AUTH_PREFIX, AUTH_NS);
				securityHeaderElem.addChildElement(usernameTokenElem);

				// create SOAPHeader instance for SOAP envelope
				final SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
				final SOAPHeader header = envelope.addHeader();
				header.addChildElement(securityHeaderElem);

			}log(smc);

		}catch(Exception e){
			e.printStackTrace();
		}return true;

	}


	@Override
	public boolean handleFault(SOAPMessageContext smc) {
		log(smc);
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


	private void log(SOAPMessageContext smc) {

		if (!smc.isEmpty())	try{

			Source source = smc.getMessage().getSOAPPart().getContent();
			boolean direction = (Boolean)smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			System.err.println((direction ? "<!---SENT--->" : "<!---RECEIVED--->") + "\n" + toXML(source));
			if (output!=null && !direction) toXML(source, new StreamResult(output));

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