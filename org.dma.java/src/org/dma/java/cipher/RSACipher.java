/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.cipher;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.dma.java.security.RSAFactory;

public class RSACipher {

	private final KeyPair keyPair;
	private final RSAPublicCipher publicCipher;
	private final RSAPrivateCipher privateCipher;

	public RSACipher(int keysize){
		this(RSAFactory.generateKeyPair(keysize));
	}

	public RSACipher(KeyPair keyPair){
		this(keyPair.getPrivate(), keyPair.getPublic());
	}

	public RSACipher(PrivateKey privateKey, PublicKey publicKey){
		this.keyPair=new KeyPair(publicKey, privateKey);
		this.publicCipher=new RSAPublicCipher(publicKey);
		this.privateCipher=new RSAPrivateCipher(privateKey);
	}



	/*
	 * Getters and setters
	 */
	public KeyPair getKeyPair() {
		return keyPair;
	}

	public RSAPublicCipher getPublicCipher() {
		return publicCipher;
	}

	public RSAPrivateCipher getPrivateCipher() {
		return privateCipher;
	}



	public static void main(String[] args) {

		try{
			RSACipher rsa = new RSACipher(1024);

			String message = "The quick brown fox jumps over the lazy dog.";
			System.out.println("message: " + message);

			String encrypted = rsa.getPublicCipher().encrypt(message, 0);
			System.out.println("encrypted: " + encrypted);

			String decrypted = rsa.getPrivateCipher().decrypt(encrypted);
			System.out.println("decrypted: " + decrypted);

			System.out.println("equal? " + decrypted.equals(message));

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}
