/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.security;

import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.dma.java.utils.string.StringUtils;

public class AESCipher extends CryptoCipher {

	public static final String ECB_PKCS5Padding = "AES/ECB/PKCS5Padding";

	public AESCipher(byte[] key, String transformation) {
		super(new SecretKeySpec(key, "AES"), transformation);
	}

	/**
	 * Algorithm: AES<br>
	 * Length: 128bits<br>
	 */
	public AESCipher(String transformation) {
		this(generateKey(128), ECB_PKCS5Padding);
	}


	/*
	 * KeyLength above 128bits requires to install the
	 * Java Cryptography Extension (JCE) unlimited strength jurisdiction policy files
	 * http://stackoverflow.com/questions/992019/java-256-bit-aes-password-based-encryption/992413#992413
	 */
	private static byte[] generateKey(int keyLength) {
		try{
			String password=StringUtils.random(64);
			String salt=StringUtils.random(16);
			KeySpec spec=new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, keyLength);

			SecretKeyFactory factory=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			return factory.generateSecret(spec).getEncoded();

		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
