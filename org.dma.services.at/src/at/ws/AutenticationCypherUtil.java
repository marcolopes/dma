package at.ws;
/**
 * Rotinas de autenticacao
 *
 * @author ricardo (AT)
 * @author marcolopes@netc.pt
 *
 */
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AutenticationCypherUtil {

	public static enum CERTIFICATE_TYPE {JKS, PKCS12}

	public static class Certificate {

		public KeyStore keyStore; // keyStore cache
		public final String keyPassword;
		public final String keyAlias;

		public Certificate(CERTIFICATE_TYPE type, String name, String keyPassword, String keyAlias) {
			this.keyPassword=keyPassword;
			this.keyAlias = keyAlias;
			try{
				keyStore = KeyStore.getInstance(type.name());
				FileInputStream fis = new FileInputStream(name);
				keyStore.load(fis, keyPassword.toCharArray());
				fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}


	public enum AES_CIPHER {

		ALGORITHM ("AES"),
		MODE ("ECB"),
		PADDING ("PKCS5Padding");

		public static final String TRANSFORMATION =
				ALGORITHM.value + "/" +
						MODE.value + "/" +
						PADDING.value;

		public final String value;

		private AES_CIPHER(String value) {
			this.value = value;
		}


	}


	public static byte[] cypherRequestKey(PublicKey publicKey, byte[] requestKey) throws Exception {

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return cipher.doFinal(requestKey);

	}


	public static byte[] decypherRequestKey(PrivateKey privateKey, byte[] encriptedRequestKey) throws Exception {

		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return cipher.doFinal(encriptedRequestKey);

	}


	public static byte[] cypherCredentialBuffer(byte[] requestKey, byte[] credential) throws Exception {

		Cipher cipher = Cipher.getInstance(AES_CIPHER.TRANSFORMATION);
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(requestKey, AES_CIPHER.ALGORITHM.value));
		return cipher.doFinal(credential);

	}


	public static byte[] cypherCredential(byte[] requestKey, String credential) throws Exception {

		return cypherCredentialBuffer(requestKey, credential.getBytes("UTF-8"));

	}


	public static byte[] decypherCredentialBuffer(byte[] requestKey, byte[] encriptedCredential) throws Exception {

		Cipher decipher = Cipher.getInstance(AES_CIPHER.TRANSFORMATION);
		decipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(requestKey, AES_CIPHER.ALGORITHM.value));
		return decipher.doFinal(encriptedCredential);

	}


	public static String decypherCredential(byte[] requestKey, byte[] encriptedCredential) throws Exception {

		return new String(decypherCredentialBuffer(requestKey, encriptedCredential), "UTF-8");

	}


}
