package org.dma.services.at;

import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.dma.java.cipher.CryptoCipher.CIPHERS;
/**
 * Rotinas de autenticacao
 *
 * @author ricardo (AT)
 * @author marcolopes@netc.pt
 *
 */
public class AutenticationCypherUtil {

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

		Cipher cipher = Cipher.getInstance(CIPHERS.AES_ECB_PKCS5.transformation);
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(requestKey, CIPHERS.AES_ECB_PKCS5.algorithm));
		return cipher.doFinal(credential);

	}


	public static byte[] cypherCredential(byte[] requestKey, String credential) throws Exception {

		return cypherCredentialBuffer(requestKey, credential.getBytes("UTF-8"));

	}


	public static byte[] decypherCredentialBuffer(byte[] requestKey, byte[] encriptedCredential) throws Exception {

		Cipher decipher = Cipher.getInstance(CIPHERS.AES_ECB_PKCS5.transformation);
		decipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(requestKey, CIPHERS.AES_ECB_PKCS5.algorithm));
		return decipher.doFinal(encriptedCredential);

	}


	public static String decypherCredential(byte[] requestKey, byte[] encriptedCredential) throws Exception {

		return new String(decypherCredentialBuffer(requestKey, encriptedCredential), "UTF-8");

	}


}
