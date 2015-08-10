package org.dma.services.at;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Logger;

import javax.crypto.KeyGenerator;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.xml.bind.DatatypeConverter;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.sun.xml.ws.developer.JAXWSProperties;
import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.io.NTPServerHandler.NTPServers;
import org.dma.java.io.NTPTimeInfo;
import org.dma.java.security.Certificate;
import org.dma.services.at.AutenticationCypherUtil.AES_CIPHER;
/**
 * SOAP Message Handler
 *
 * @author ricardo (AT)
 * @author marcolopes@netc.pt
 *
 */
public class SOAPMessageHandler implements SOAPHandler<SOAPMessageContext> {

	private static final int DEFAULT_CONNECT_TIMEOUT = 10000;
	private static final int DEFAULT_REQUEST_TIMEOUT = 10000;

	private static final String AUTH_NS = "http://schemas.xmlsoap.org/ws/2002/12/secext";
	private static final String AUTH_PREFIX = "wss";

	private static final Logger LOGGER = Logger.getLogger(SOAPMessageHandler.class.getSimpleName());

	private final String userName;
	private final String password;
	private final Certificate saCertificate;
	private final Certificate swCertificate;

	/**
	 * @param userName - Service Username
	 * @param password - Service Password
	 * @param saCertificate - Scheme Administrator Certificate
	 * @param swCertificate - Software Developer Certificate
	 */
	public SOAPMessageHandler(String userName, String password,
			Certificate saCertificate, Certificate swCertificate) {
		this.userName = userName;
		this.password = password;
		this.saCertificate = saCertificate;
		this.swCertificate = swCertificate;
	}


	public Binding initializeBindings(WSBindingProvider bp, String endpoint, boolean secure) throws Exception {

		//javax.xml.ws.service.endpoint.address
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
		//com.sun.xml.internal.ws.connect.timeout
		bp.getRequestContext().put(JAXWSProperties.CONNECT_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);
		//com.sun.xml.internal.ws.request.timeout
		bp.getRequestContext().put(JAXWSProperties.REQUEST_TIMEOUT, DEFAULT_REQUEST_TIMEOUT);

		if(secure){

			// Coloca o SSL socket factory no request context da ligacao a efetuar ao webservice
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
			kmf.init(swCertificate.getKeyStore(), swCertificate.password.toCharArray());

			// adiciona um Trust Store que aceita ligacao SSL sem validar o certificado
			SSLContext sslContext = SSLContext.getInstance("TLSv1"); // JAVA8 usa TLSv2
			sslContext.init(kmf.getKeyManagers(), new TrustManager[]{new PermissiveTrustStore()}, null);

			// indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
			/*
			KeyStore ts = KeyStore.getInstance("JKS");
			ts.load(this.getClass().getClassLoader().getResourceAsStream("trustStore"), "cliente".toCharArray());
			TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
			tmf.init(ts);
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
			 */
			bp.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

		}

		return bp.getBinding();

	}


	@Override
	public Set<QName> getHeaders() {
		return null;
	}


	@Override
	public void close(MessageContext messageContext) {
		// nothing to clean up
	}


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

				// create timestamp
				/*
				Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
				sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				String formattedDate = sdf.format(calendar.getTime());
				*/

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
				sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				NTPTimeInfo time=NTPServers.OAL.getDefaultTime(500);
				String formattedDate = sdf.format(time==null ? new Date() : time.getServerDate());
				System.out.println("DATE: "+formattedDate);

				// Generate simetric key used for this request. Nonce!
				KeyGenerator generator = KeyGenerator.getInstance(AES_CIPHER.ALGORITHM.value);
				generator.init(128); // Implementacao JAVA permite apenas 128 bits
				final byte[] simetricKey = generator.generateKey().getEncoded();

				// WSSecurity header
				SOAPFactory soapFactory = SOAPFactory.newInstance();
				SOAPElement wsSecurityHeaderElem = soapFactory.createElement("Security", AUTH_PREFIX, AUTH_NS);
				SOAPElement userNameTokenElem = soapFactory.createElement("UsernameToken", AUTH_PREFIX, AUTH_NS);

				// Username
				SOAPElement userNameElem = soapFactory.createElement("Username", AUTH_PREFIX, AUTH_NS);
				userNameElem.addTextNode(userName);

				// Password
				SOAPElement passwordElem = soapFactory.createElement("Password", AUTH_PREFIX, AUTH_NS);
				// Encrypt with the simetric key and B64 encode the password
				final byte[] encryptedPassword = AutenticationCypherUtil.cypherCredential(simetricKey, password);
				final String b64EncryptedPassword = DatatypeConverter.printBase64Binary(encryptedPassword);
				passwordElem.addTextNode(b64EncryptedPassword);
				// Calculate password digest
				final byte[] computedDigest = buildPasswordDigest(simetricKey, formattedDate, password);
				final byte[] encryptedDigest = AutenticationCypherUtil.cypherCredentialBuffer(simetricKey, computedDigest);
				final String b64EncryptedDigest = DatatypeConverter.printBase64Binary(encryptedDigest);
				passwordElem.addAttribute(soapFactory.createName("Digest"), b64EncryptedDigest);

				// Nonce
				SOAPElement nonceElem = soapFactory.createElement("Nonce", AUTH_PREFIX, AUTH_NS);
				// Encrypt with the SA public key and B64 encode the request simetric key
				final PublicKey publicKey = saCertificate.getX509Cert().getPublicKey();
				final byte[] encriptedSimetricKey = AutenticationCypherUtil.cypherRequestKey(publicKey, simetricKey);
				final String b64EncryptedSimetricKey = DatatypeConverter.printBase64Binary(encriptedSimetricKey);
				nonceElem.addTextNode(b64EncryptedSimetricKey);

				// Created
				SOAPElement createdElem = soapFactory.createElement("Created", AUTH_PREFIX, AUTH_NS);
				createdElem.addTextNode(formattedDate);

				// add child elements to the root element
				userNameTokenElem.addChildElement(userNameElem);
				userNameTokenElem.addChildElement(passwordElem);
				userNameTokenElem.addChildElement(nonceElem);
				userNameTokenElem.addChildElement(createdElem);
				wsSecurityHeaderElem.addChildElement(userNameTokenElem);

				// create SOAPHeader instance for SOAP envelope
				SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader sh = envelope.addHeader();

				// add SOAP element for header to SOAP header object
				sh.addChildElement(wsSecurityHeaderElem);

			}

			interceptAndRecordSoapMessage(smc);

		}catch(Exception e){
			e.printStackTrace();
		}

		return true;

	}


	private byte[] buildPasswordDigest(byte[] simetricKey, String timestamp, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {

		byte[] bytesNonce = simetricKey;
		byte[] bytesCreated = timestamp.getBytes("UTF-8");
		byte[] bytesPassword = password.getBytes("UTF-8");

		byte[] digestInput = new byte[bytesNonce.length + bytesCreated.length + bytesPassword.length];
		System.arraycopy(bytesNonce, 0, digestInput, 0, bytesNonce.length);
		System.arraycopy(bytesCreated, 0, digestInput, bytesNonce.length, bytesCreated.length);
		System.arraycopy(bytesPassword, 0, digestInput, bytesNonce.length + bytesCreated.length, bytesPassword.length);

		MessageDigest md = MessageDigest.getInstance("SHA-1");

		return md.digest(digestInput);

	}


	private void interceptAndRecordSoapMessage(SOAPMessageContext smc) {

		try{
			SOAPMessage message = smc.getMessage();
			Source source = message.getSOAPPart().getContent();
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