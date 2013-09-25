package pt.at.factemipf.core.webservices.proxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public final class WSAutenticaTestCypherUtil {

	private WSAutenticaTestCypherUtil(){}

	private enum AESConfiguration {
		CIPHER_ALGORITHM("AES"),
		CIPHER_MODE("ECB"),
		CIPHER_PADDING("PKCS5Padding");

		private String value;

		private AESConfiguration(String value){
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	private enum RSAConfiguration {
		CIPHER_ALGORITHM("RSA");

		private String value;

		private RSAConfiguration(String value){
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	enum KSConfiguration {
		KEYSTORE_TYPE("JKS");

		private String value;

		KSConfiguration(String value){
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public static Key getPublicKeyFromKeystore(String keystorePath, String keystorePwd, String keyAlias) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {

		KeyStore ks = KeyStore.getInstance(KSConfiguration.KEYSTORE_TYPE.getValue());

		InputStream fis = WSAutenticaTestCypherUtil.class.getClassLoader().getResourceAsStream(keystorePath);
		ks.load(fis, keystorePwd.toCharArray());
		Key key = ks.getCertificate(keyAlias).getPublicKey();

		fis.close();

		return key;
	}

	public static byte[] cypherRequestKey(PublicKey publicKey, byte[] requestKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Cipher cipher = Cipher.getInstance(RSAConfiguration.CIPHER_ALGORITHM.getValue());
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return cipher.doFinal(requestKey);
	}

	/**
	 * Decifra uma mensagem assinada com a chave publica do SA, dada a chave
	 * privada do SA
	 *
	 * @param privateKey
	 *            A chave privada do SA
	 * @param encriptedRequestKey
	 *            A mensagem a decifrar
	 * @return A mensagem decifrada
	 * @throws java.security.NoSuchAlgorithmException
	 *
	 * @throws javax.crypto.NoSuchPaddingException
	 *
	 * @throws java.security.InvalidKeyException
	 *
	 * @throws javax.crypto.IllegalBlockSizeException
	 *
	 * @throws javax.crypto.BadPaddingException
	 *
	 */
	public static byte[] decypherRequestKey(PrivateKey privateKey, byte[] encriptedRequestKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		byte[] decryptedMessage;

		Cipher cipher = Cipher.getInstance(RSAConfiguration.CIPHER_ALGORITHM.getValue());
		cipher.init(Cipher.DECRYPT_MODE, privateKey);

		decryptedMessage = cipher.doFinal(encriptedRequestKey);

		return decryptedMessage;
	}

	public static byte[] cypherCredential(byte[] requestKey, String credential) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Cipher cipher = Cipher.getInstance(AESConfiguration.CIPHER_ALGORITHM.getValue() + "/" +
				AESConfiguration.CIPHER_MODE.getValue() + "/" +
				AESConfiguration.CIPHER_PADDING.getValue());

		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(requestKey, AESConfiguration.CIPHER_ALGORITHM.getValue()));

		return cipher.doFinal(credential.getBytes("UTF-8"));
	}

	public static byte[] cypherCredentialBuffer(byte[] requestKey, byte[] credential) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Cipher cipher = Cipher.getInstance(AESConfiguration.CIPHER_ALGORITHM.getValue() + "/" +
				AESConfiguration.CIPHER_MODE.getValue() + "/" +
				AESConfiguration.CIPHER_PADDING.getValue());

		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(requestKey, AESConfiguration.CIPHER_ALGORITHM.getValue()));

		return cipher.doFinal(credential);
	}

	public static String decypherCredential(byte[] requestKey, byte[] encriptedCredential) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {

		Cipher decipher = Cipher.getInstance(AESConfiguration.CIPHER_ALGORITHM.getValue() + "/" +
				AESConfiguration.CIPHER_MODE.getValue() + "/" +
				AESConfiguration.CIPHER_PADDING.getValue());

		decipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(requestKey, AESConfiguration.CIPHER_ALGORITHM.getValue()));

		return new String(decipher.doFinal(encriptedCredential), "UTF-8");
	}

	public static byte[] decypherCredentialBuffer(byte[] requestKey, byte[] encriptedCredential) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {

		Cipher decipher = Cipher.getInstance(AESConfiguration.CIPHER_ALGORITHM.getValue() + "/" +
				AESConfiguration.CIPHER_MODE.getValue() + "/" +
				AESConfiguration.CIPHER_PADDING.getValue());

		decipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(requestKey, AESConfiguration.CIPHER_ALGORITHM.getValue()));

		return decipher.doFinal(encriptedCredential);
	}

	public static byte[] generateRequestKey() throws NoSuchAlgorithmException {
		KeyGenerator generator = KeyGenerator.getInstance(AESConfiguration.CIPHER_ALGORITHM.getValue());
		generator.init(128);
		Key keyToBeWrapped = generator.generateKey();

		return keyToBeWrapped.getEncoded();
	}

}
