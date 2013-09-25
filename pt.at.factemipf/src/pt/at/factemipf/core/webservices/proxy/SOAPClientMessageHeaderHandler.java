package pt.at.factemipf.core.webservices.proxy;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Logger;

import javax.xml.bind.DatatypeConverter;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPClientMessageHeaderHandler implements SOAPHandler<SOAPMessageContext> {

	public enum CERTIFICATE {
		PROD("P", "sapubkey.prod", "Producao"),
		TESTES("T", "sapubkey.testes", "Testes");

		private final String key, keyAlias, descricao;

		private CERTIFICATE(String key, String keyAlias, String desc){
			this.key = key;
			this.keyAlias = keyAlias;
			this.descricao = desc;
		}

		public String getKeyAlias() {
			return keyAlias;
		}

		public String getDescricao() {
			return descricao;
		}

		public static CERTIFICATE get(String mode) {
			for(CERTIFICATE certificate : CERTIFICATE.values()){
				if(certificate.key.equals(mode))
					return certificate;
			}
			throw new IllegalArgumentException("certificado inexistente nao validado.");
		}
	}

	private static final String AUTH_NS = "http://schemas.xmlsoap.org/ws/2002/12/secext";
	private static final String AUTH_PREFIX = "wss";

	private static final String KS_PATH = "saPubKey.jks";
	private static final String KS_PWD = "saKeyPubPass";
	//	private static final String KEY_ALIAS = "sapubkey.testes";

	private final Logger logger;
	private final String userName;
	private final String password;
	private final CERTIFICATE ambienteCert;

	public SOAPClientMessageHeaderHandler(Logger logger, String userName, String password, CERTIFICATE ambienteCert){
		this.logger = logger;
		this.userName = userName;
		this.password = password;
		this.ambienteCert = ambienteCert;
	}

	public boolean handleFault(SOAPMessageContext smc) {
		return true;
	}

	public void close(MessageContext mc) {}

	/**
	 * adiciona header para autenticacao
	 */
	public boolean handleMessage(SOAPMessageContext smc) {

		boolean direction = (Boolean)smc.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if(direction){
			try{

				// ----------------------
				// ---- AUTENTICACAO ----
				// ----------------------
				// Generate simetric key used for this request. Nonce!
				final byte[] simetricKey = generateAESKey();
				//				log.info("Chave simetrica gerada");

				// Encrypt with the simetric key and B64 encode the password
				final byte[] encryptedPassword = WSAutenticaTestCypherUtil.cypherCredential(simetricKey, password);
				final String b64EncryptedPassword = DatatypeConverter.printBase64Binary(encryptedPassword);
				//				log.info("Password field encrypted and encoded: " + b64EncryptedPassword);

				// Encrypt with the simetric key and B64 encode the timestamp
				final String clearTimestamp = getTimestamp();
				//				log.info("timestamp in plainText: " + clearTimestamp);

				// Encrypt with the SA public key and B64 encode the request simetric key (nonce)
				final Key publicKey = WSAutenticaTestCypherUtil.getPublicKeyFromKeystore(KS_PATH, KS_PWD, ambienteCert.getKeyAlias());
				final byte[] encriptedSimetricKey = WSAutenticaTestCypherUtil.cypherRequestKey((PublicKey)publicKey, simetricKey);
				final String b64EncryptedSimetricKey = DatatypeConverter.printBase64Binary(encriptedSimetricKey);
				//				log.info("Request simetric key encrypted and encoded:\n" + b64EncryptedSimetricKey);

				// Calculate password digest
				final byte[] computedDigest = buildPasswordDigest(simetricKey, clearTimestamp, password);
				final byte[] encryptedDigest = WSAutenticaTestCypherUtil.cypherCredentialBuffer(simetricKey, computedDigest);
				final String b64EncryptedDigest = DatatypeConverter.printBase64Binary(encryptedDigest);
				//				log.info("Password digest encrypted and encoded:\n" + b64EncryptedDigest);
				// ----------------------

				SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
				SOAPFactory soapFactory = SOAPFactory.newInstance();

				// WSSecurity <Security> header
				SOAPElement wsSecHeaderElm = soapFactory.createElement(
						"Security",
						AUTH_PREFIX,
						AUTH_NS);
				SOAPElement userNameTokenElm = soapFactory.createElement("UsernameToken",
						AUTH_PREFIX,
						AUTH_NS);

				// Username
				SOAPElement userNameElm = soapFactory.createElement("Username",
						AUTH_PREFIX,
						AUTH_NS);
				userNameElm.addTextNode(userName);

				// Password
				SOAPElement passwdElm = soapFactory.createElement("Password",
						AUTH_PREFIX,
						AUTH_NS);
				passwdElm.addTextNode(b64EncryptedPassword);
				//Digest
				//passwdElm.addAttribute(new QName("Digest"), b64EncryptedDigest);
				passwdElm.addAttribute(soapFactory.createName("Digest"), b64EncryptedDigest);

				//Nonce
				SOAPElement nonceElm = soapFactory.createElement("Nonce",
						AUTH_PREFIX,
						AUTH_NS);
				nonceElm.addTextNode(b64EncryptedSimetricKey);

				//Created
				SOAPElement createdElm = soapFactory.createElement("Created",
						AUTH_PREFIX,
						AUTH_NS);
				createdElm.addTextNode(clearTimestamp);

				userNameTokenElm.addChildElement(userNameElm);
				userNameTokenElm.addChildElement(passwdElm);
				userNameTokenElm.addChildElement(nonceElm);
				userNameTokenElm.addChildElement(createdElm);

				// add child elements to the root element
				wsSecHeaderElm.addChildElement(userNameTokenElm);

				// create SOAPHeader instance for SOAP envelope
				SOAPHeader sh = envelope.addHeader();

				// add SOAP element for header to SOAP header object
				sh.addChildElement(wsSecHeaderElm);

			}catch(Exception ex){
				StringWriter sw = new StringWriter();
				ex.printStackTrace(new PrintWriter(sw));
				String stacktrace = sw.toString();
				logger.severe("Could not intercept and add WS Security Header\n\n" + stacktrace);
			}
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

	public java.util.Set<QName> getHeaders() {
		return null;
	}

	// ---------------
	// Utility Methods
	// ---------------

	private static byte[] generateAESKey() throws NoSuchAlgorithmException {
		return WSAutenticaTestCypherUtil.generateRequestKey();
	}

	private static final SimpleDateFormat TIMESTAMP_FORMATER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");

	static{
		TIMESTAMP_FORMATER.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	private static String getTimestamp() throws ParseException {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		return TIMESTAMP_FORMATER.format(c.getTime());
	}
}