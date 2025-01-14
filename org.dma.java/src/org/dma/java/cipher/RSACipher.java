/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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

import org.dma.java.io.CustomFile;

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
		try{// Generate the private/public key pair
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

	public KeyPair getKeyPair() {return keyPair;}
	public RSAPublicCipher getPublicCipher() {return publicCipher;}
	public RSAPrivateCipher getPrivateCipher() {return privateCipher;}

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


	public static void keyPairTest(int keysize, String message) throws Exception {

		System.out.println("Generating Key Pair: " + keysize);
		KeyPair keyPair=generateKeyPair(keysize);
		if (keyPair!=null){

			System.out.println();
			PublicKey publicKey=keyPair.getPublic();
			System.out.println("-----BEGIN PUBLIC KEY-----");
			System.out.print(new Base64(CustomFile.BASE64_LINE_LENGTH).encodeToString(publicKey.getEncoded()));
			System.out.println("-----END PUBLIC KEY-----");
			System.out.println();
			RSAPublicCipher publicCipher=new RSAPublicCipher(publicKey);
			String BASE64encrypt=publicCipher.BASE64encrypt(message, 0);
			System.out.println("BASE64encrypt: " + BASE64encrypt);
			// The bytes can be converted back to public and private key objects
			System.out.println("Public Key format (X.509): " + publicKey.getFormat());
			KeyFactory factory=KeyFactory.getInstance(publicKey.getAlgorithm());
			System.out.println("Public Key algorithm: " + factory.getAlgorithm());
			EncodedKeySpec keySpec=new X509EncodedKeySpec(publicKey.getEncoded());
			System.out.println("Public keys equal? " + publicKey.equals(factory.generatePublic(keySpec)));
			System.out.println();

			PrivateKey privateKey=keyPair.getPrivate();
			System.out.println("-----BEGIN PRIVATE KEY-----");
			System.out.print(new Base64(CustomFile.BASE64_LINE_LENGTH).encodeToString(privateKey.getEncoded()));
			System.out.println("-----END PRIVATE KEY-----");
			System.out.println();
			RSAPrivateCipher privateCipher=new RSAPrivateCipher(privateKey);
			String BASE64decrypt=privateCipher.BASE64decrypt(BASE64encrypt);
			System.out.println("BASE64decrypt: " + BASE64decrypt);
			// The bytes can be converted back to public and private key objects
			System.out.println("Private Key format (PKCS#8): " + privateKey.getFormat());
			factory=KeyFactory.getInstance(privateKey.getAlgorithm());
			System.out.println("Private Key algorithm: " + factory.getAlgorithm());
			factory=KeyFactory.getInstance(privateKey.getAlgorithm());
			keySpec=new PKCS8EncodedKeySpec(privateKey.getEncoded());
			System.out.println("Private keys equal? " + privateKey.equals(factory.generatePrivate(keySpec)));
			System.out.println();

		}

	}


	public static void main(String[] args) throws Exception {

		RSACipher rsa=new RSACipher(1024);

		String message = "The quick brown fox jumps over the lazy dog.";
		System.out.println(message);
		System.out.println();

		System.out.println("-----PUBLIC KEY-----");
		String BASE64encrypt=rsa.getPublicCipher().BASE64encrypt(message, 0);
		System.out.println("BASE64encrypt: " + BASE64encrypt);
		//
		String BASE64decrypt=rsa.getPrivateCipher().BASE64decrypt(BASE64encrypt);
		System.out.println("BASE64decrypt: " + BASE64decrypt);
		System.out.println("Valid result? " + message.equals(BASE64decrypt));
		System.out.println();

		System.out.println("-----PRIVATE KEY-----");
		String BASE64signWithSHA1=rsa.getPrivateCipher().BASE64signWithSHA1(message);
		System.out.println("BASE64signWithSHA1: " + BASE64signWithSHA1);
		System.out.println("verifySHA1Signature: " + rsa.getPublicCipher().verifySHA1Signature(BASE64signWithSHA1, message));
		//
		BASE64encrypt=rsa.getPrivateCipher().BASE64encrypt(message, 0);
		System.out.println("BASE64encrypt: " + BASE64encrypt);
		BASE64decrypt=rsa.getPublicCipher().BASE64decrypt(BASE64encrypt);
		//
		System.out.println("BASE64decrypt: " + BASE64decrypt);
		System.out.println("Valid result? " + message.equals(BASE64decrypt));
		System.out.println();

		for(int size=256;; size*=2){
			keyPairTest(size, message);
			System.out.print("");
		}

	}


}