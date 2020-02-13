/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.cipher;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * RSA is an asymmetric encryption algorithm developed in 1977
 * that use a pair of private key and public key.
 * RSA is the initials of the developers of the RSA algorithm:
 * Ron Rivest, Adi Shamir, and Leonard Adleman.
 * Today, RSA is probably the most used the encryption algorithm
 * for the Internet communication.
 */
public class RSACipher {

	/** Generate Key Pair */
	public static KeyPair generateKeyPair(int keysize) {
		try{
			// Generate the private/public key pair
			KeyPairGenerator keyGen=KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(keysize);
			return keyGen.genKeyPair();

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	private final KeyPair keyPair;
	private final RSAPublicCipher publicCipher;
	private final RSAPrivateCipher privateCipher;

	public RSACipher(int keysize) {
		this(generateKeyPair(keysize));
	}

	public RSACipher(KeyPair keyPair) {
		this(keyPair.getPrivate(), keyPair.getPublic());
	}

	public RSACipher(PrivateKey privateKey, PublicKey publicKey) {
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


	public static void debug(KeyPair keyPair) {

		String message="The quick brown fox jumps over the lazy dog.";
		System.out.println("message: " + message);

		RSAPublicCipher publicCipher=new RSAPublicCipher(keyPair.getPublic());
		String encrypted=publicCipher.BASE64encrypt(message,0);
		System.out.println("encrypted: " + encrypted);

		RSAPrivateCipher privateCipher=new RSAPrivateCipher(keyPair.getPrivate());
		String decrypted=privateCipher.BASE64decrypt(encrypted);
		System.out.println("decrypted: " + decrypted);

		// Get the formats of the encoded bytes
		System.out.println("Private Key format: " + keyPair.getPrivate().getFormat()); // PKCS#8
		System.out.println("Public Key format: " + keyPair.getPublic().getFormat()); // X.509
		System.out.println();

		// Get the bytes of the public and private keys
		System.out.println("-----BEGIN PRIVATE KEY-----");
		System.out.print(new Base64(64).encodeToString(keyPair.getPrivate().getEncoded()));
		System.out.println("-----END PRIVATE KEY-----");
		System.out.println();

		System.out.println("-----BEGIN PUBLIC KEY-----");
		System.out.print(new Base64(64).encodeToString(keyPair.getPublic().getEncoded()));
		System.out.println("-----END PUBLIC KEY-----");
		System.out.println();

		try{
			// The bytes can be converted back to public and private key objects
			KeyFactory keyFactory=KeyFactory.getInstance(keyPair.getPrivate().getAlgorithm());
			EncodedKeySpec privateKeySpec=new PKCS8EncodedKeySpec(keyPair.getPrivate().getEncoded());
			PrivateKey privateKey=keyFactory.generatePrivate(privateKeySpec);
			System.out.println("Are both private keys equal? " + keyPair.getPrivate().equals(privateKey));

			EncodedKeySpec publicKeySpec=new X509EncodedKeySpec(keyPair.getPublic().getEncoded());
			PublicKey publicKey=keyFactory.generatePublic(publicKeySpec);
			System.out.println("Are both public keys equal? " + keyPair.getPublic().equals(publicKey));

		}catch(Exception e){
			System.err.println(e);
		}

	}


	public static void main(String[] args) {

		for (int size: new int[]{256, 512, 1024, 2048, 4096}) try{
			System.out.println("KEY SIZE: "+size);
			debug(generateKeyPair(size));
			System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

		String message="The quick brown fox jumps over the lazy dog.";
		System.out.println("message: " + message);

		RSACipher rsa=new RSACipher(1024);

		String encrypted=rsa.getPublicCipher().BASE64encrypt(message, 0);
		System.out.println("encrypted: " + encrypted);
		String decrypted=rsa.getPrivateCipher().BASE64decrypt(encrypted);
		System.out.println("decrypted: " + decrypted);

		System.out.println("equal? " + decrypted.equals(message));
	}


}
