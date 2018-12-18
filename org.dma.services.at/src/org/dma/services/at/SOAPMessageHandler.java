package org.dma.services.at;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Logger;

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
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.sun.xml.ws.developer.JAXWSProperties;
import com.sun.xml.ws.developer.WSBindingProvider;

import org.dma.java.cipher.CryptoCipher;
import org.dma.java.cipher.CryptoCipher.CIPHERS;
import org.dma.java.cipher.MessageDigest;
import org.dma.java.cipher.MessageDigest.ALGORITHMS;
import org.dma.java.cipher.RSAPublicCipher;
import org.dma.java.io.NTPServerHandler.NTPTimeInfo;
import org.dma.java.io.NTPServerHandler.NTP_SERVERS;
import org.dma.java.security.JKSCertificate;
/**
 * SOAP Message Handler
 *
 * @author ricardo (AT)
 * @author marcolopespt@gmail.com
 *
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


	public void initializeRequest(WSBindingProvider bp, String endpoint, boolean secure) throws Exception {

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

			/*
			// indica um conjunto de certificados confiaveis para estabelecer a ligacao SSL
			KeyStore ks = KeyStore.getInstance("JKS");
			ks.load(this.getClass().getClassLoader().getResourceAsStream("trustStore"), "cliente".toCharArray());
			TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
			tmf.init(ks);
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
			*/

			bp.getRequestContext().put(JAXWSProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());

		}

		// adiciona handler
		Binding binding = bp.getBinding();
		List<Handler> chain = binding.getHandlerChain();
		chain.add(this);
		binding.setHandlerChain(chain);

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

				// Generate simetric key used for this request!
				final CryptoCipher simetricKeyCipher = new CryptoCipher(CIPHERS.AES_ECB_PKCS5);
				final byte[] simetricKey = simetricKeyCipher.getKey().getEncoded();
				/*
				KeyGenerator generator = KeyGenerator.getInstance(CIPHERS.AES_ECB_PKCS5.algorithm);
				generator.init(128); // Implementacao JAVA permite apenas 128 bits
				final byte[] simetricKey = generator.generateKey().getEncoded();
				*/

				// create Timestamp
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
				sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				NTPTimeInfo time = NTP_SERVERS.queryAll(500, NTP_SERVERS.OAL, NTP_SERVERS.XS2ALL, NTP_SERVERS.WINDOWS);
				final String timestamp = sdf.format(time==null ? new Date() : time.getServerDate());
				System.out.println("DATE: "+timestamp);
				/*
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
				sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
				String formattedDate = sdf.format(calendar.getTime());
				*/

				// create SOAP Factory
				final SOAPFactory soapFactory = SOAPFactory.newInstance();

				// Username
				final SOAPElement usernameElem = soapFactory.createElement("Username", AUTH_PREFIX, AUTH_NS);
				usernameElem.addTextNode(username);

				// Password
				final SOAPElement passwordElem = soapFactory.createElement("Password", AUTH_PREFIX, AUTH_NS);
				// Encrypt with the simetric key and B64 encode the password
				passwordElem.addTextNode(simetricKeyCipher.BASE64encrypt(password, 0));
				/*
				final byte[] encryptedPassword = new AutenticationCypher(simetricKey).cypherCredential(password);
				final String b64EncryptedPassword = DatatypeConverter.printBase64Binary(encryptedPassword);
				passwordElem.addTextNode(b64EncryptedPassword);
				*/
				// Encrypt with the simetric key and B64 encode the digest
				byte[] passwordDigest = createPasswordDigest(simetricKey, timestamp, password);
				passwordElem.addAttribute(soapFactory.createName("Digest"),
						simetricKeyCipher.BASE64encrypt(passwordDigest, 0));
				/*
				final byte[] encryptedDigest = new AutenticationCypher(simetricKey).cypherCredentialBuffer(computedDigest);
				final String b64EncryptedDigest = DatatypeConverter.printBase64Binary(encryptedDigest);
				passwordElem.addAttribute(soapFactory.createName("Digest"), b64EncryptedDigest);
				*/

				// Nonce
				final SOAPElement nonceElem = soapFactory.createElement("Nonce", AUTH_PREFIX, AUTH_NS);
				// Encrypt with the SA public key and B64 encode the request simetric key
				PublicKey publicKey = saCertificate.getCertificate().getPublicKey();
				nonceElem.addTextNode(new RSAPublicCipher(publicKey).BASE64encrypt(simetricKey, 0));
				/*
				final byte[] encryptedSimetricKey = new AutenticationCypher(simetricKey).cypherRequestKey(publicKey);
				final String b64EncryptedSimetricKey = DatatypeConverter.printBase64Binary(encryptedSimetricKey);
				nonceElem.addTextNode(b64EncryptedSimetricKey);
				*/

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

			}

			interceptAndRecordSoapMessage(smc);

		}catch(Exception e){
			e.printStackTrace();
		}

		return true;

	}


	private byte[] createPasswordDigest(byte[] simetricKey, String timestamp, String password) throws UnsupportedEncodingException {

		byte[] createdBytes = timestamp.getBytes("UTF8");
		byte[] passwordBytes = password.getBytes("UTF8");

		byte[] message = new byte[simetricKey.length + createdBytes.length + passwordBytes.length];
		System.arraycopy(simetricKey, 0, message, 0, simetricKey.length);
		System.arraycopy(createdBytes, 0, message, simetricKey.length, createdBytes.length);
		System.arraycopy(passwordBytes, 0, message, simetricKey.length + createdBytes.length, passwordBytes.length);

		return new MessageDigest(ALGORITHMS.SHA1).digest(message);
		/*
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		return md.digest(digestInput);
		*/

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