package org.dma.services.at;

import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/**
 * Rotinas de autenticacao
 *
 * @author ricardo (AT)
 * @author marcolopes@netc.pt
 *
 */
public class AutenticationCypherUtil {

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
