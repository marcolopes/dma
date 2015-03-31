/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.dma.java.cipher.RSAPrivateCipher;
import org.dma.java.cipher.RSAPublicCipher;
/**
 * RSA is an asymmetric encryption algorithm developed in 1977
 * that use a pair of private key and public key.
 * RSA is the initials of the developers of the RSA algorithm:
 * Ron Rivest, Adi Shamir, and Leonard Adleman.
 * Today, RSA is probably the most used the encryption algorithm
 * for the Internet communication.
 */
public class RSAFactory {

	private static byte[] loadKeyBytes(String filename) {

		try{
			// read
			File file=new File(filename);
			DataInputStream dis=new DataInputStream(new FileInputStream(file));
			byte[] bytes=new byte[(int)file.length()];
			dis.readFully(bytes);
			dis.close();

			return bytes;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	/**
	 * Reads and Decodes the PRIVATE KEY<br>
	 * FILE FORMAT: DER (Distinguished Encoding Rules) Encoding<br>
	 * KEY ENCODING: PKCS#8<br>
	 *<br>
	 * PKCS stands for Public-Key Cryptography Standards, developed by
	 * RSA Security currently a division of EMC.
	 * PKCS#8 describes syntax for private-key information, including a
	 * private key for some public-key algorithm and a set of attributes.
	 * PKCS#8 is mainly used to encode private keys.
	 */
	public static PrivateKey decodePrivateKey(byte[] keyBytes) {

		try{
			KeyFactory kf=KeyFactory.getInstance("RSA");
			PKCS8EncodedKeySpec spec=new PKCS8EncodedKeySpec(keyBytes);
			return kf.generatePrivate(spec);

		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}catch(InvalidKeySpecException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static PrivateKey base64DecodePrivateKey(String keyString) {

		return decodePrivateKey(new Base64(0).decode(keyString));

	}


	public static PrivateKey loadAndDecodePrivateKey(String derFile) {

		byte[] keyBytes=loadKeyBytes(derFile);
		return keyBytes==null ?	null : decodePrivateKey(keyBytes);

	}


	/**
	 * Reads and Decodes the PUBLIC KEY<br>
	 * FILE FORMAT: DER (Distinguished Encoding Rules) Encoding<br>
	 * KEY ENCODING: X.509<br>
	 *<br>
	 * X.509 is an ITU-T standard for a public key infrastructure (PKI)
	 * for single sign-on and Privilege Management Infrastructure (PMI).
	 * X.509 specifies, amongst other things, standard formats for
	 * public key certificates, certificate revocation lists,
	 * attribute certificates, and a certification path validation algorithm.
	 */
	public static PublicKey decodePublicKey(byte[] keyBytes) {

		try{
			KeyFactory kf=KeyFactory.getInstance("RSA");
			X509EncodedKeySpec spec=new X509EncodedKeySpec(keyBytes);
			return kf.generatePublic(spec);

		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}catch(InvalidKeySpecException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static PublicKey base64DecodePublicKey(String keyString) {

		return decodePublicKey(new Base64(0).decode(keyString));

	}


	public static PublicKey loadAndDecodePublicKey(String derFile) {

		byte[] keyBytes=loadKeyBytes(derFile);
		return keyBytes==null ?	null : decodePublicKey(keyBytes);

	}


	/** Compute signature */
	public static byte[] signWithSHA1(PrivateKey privateKey, byte[] messageBytes) {

		try{
			Signature signature=Signature.getInstance("SHA1withRSA");
			signature.initSign(privateKey);
			signature.update(messageBytes);
			return signature.sign();

		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}catch(InvalidKeyException e){
			System.out.println(e);
		}catch(SignatureException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}


	/** Verify signature */
	public static boolean verifySHA1Signature(PublicKey publicKey, byte[] signatureBytes, byte[] messageBytes) {

		try{
			Signature signature=Signature.getInstance("SHA1withRSA");
			signature.initVerify(publicKey);
			signature.update(messageBytes);
			return signature.verify(signatureBytes);

		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}catch(InvalidKeyException e){
			System.out.println(e);
		}catch(SignatureException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;
	}


	/** Generate Key Pair */
	public static KeyPair generateKeyPair(int keysize){
		try{
			// Generate the private/public key pair
			KeyPairGenerator keyGen=KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(keysize);

			return keyGen.genKeyPair();

		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}


	public static void debug(KeyPair keyPair) {

		String message="The quick brown fox jumps over the lazy dog.";
		System.out.println("message: " + message);

		RSAPublicCipher publicCipher=new RSAPublicCipher(keyPair.getPublic());
		String encrypted=publicCipher.encrypt(message,0);
		System.out.println("encrypted: " + encrypted);

		RSAPrivateCipher privateCipher=new RSAPrivateCipher(keyPair.getPrivate());
		String decrypted=privateCipher.decrypt(encrypted);
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

		}catch(NoSuchAlgorithmException e){
			System.out.println("No such algorithm: " + keyPair.getPrivate().getAlgorithm());
		}catch(InvalidKeySpecException specException) {
			System.out.println("Invalid Key Spec Exception");
		}

		try{
			KeyFactory keyFactory=KeyFactory.getInstance(keyPair.getPublic().getAlgorithm());
			EncodedKeySpec publicKeySpec=new X509EncodedKeySpec(keyPair.getPublic().getEncoded());
			PublicKey publicKey=keyFactory.generatePublic(publicKeySpec);
			System.out.println("Are both public keys equal? " + keyPair.getPublic().equals(publicKey));

		}catch(NoSuchAlgorithmException e){
			System.out.println("No such algorithm: " + keyPair.getPublic().getAlgorithm());
		}catch(InvalidKeySpecException specException) {
			System.out.println("Invalid Key Spec Exception");
		}

	}


}

