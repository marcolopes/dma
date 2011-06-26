/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class KeysGenerator {

	public static KeyPair generate(String keyAlgorithm, int keysize) {

		try {
			// Get the public/private key pair
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance(keyAlgorithm);
			keyGen.initialize(keysize);
			KeyPair keyPair = keyGen.genKeyPair();

			// Get the bytes of the public and private keys
			PrivateKey privateKey = keyPair.getPrivate();
			PublicKey  publicKey  = keyPair.getPublic();

			// Get the formats of the encoded bytes
			String formatPrivate = privateKey.getFormat(); // PKCS#8
			String formatPublic  = publicKey.getFormat(); // X.509
			System.out.println("Private Key Format : " + formatPrivate);
			System.out.println("Public Key Format  : " + formatPublic);

			// The bytes can be converted back to public and private key objects
			KeyFactory keyFactory = KeyFactory.getInstance(keyAlgorithm);
			EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKey.getEncoded());
			PrivateKey privateKey2 = keyFactory.generatePrivate(privateKeySpec);

			EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());
			PublicKey publicKey2 = keyFactory.generatePublic(publicKeySpec);

			// The original and new keys are the same
			System.out.println("Are both private keys equal? " + privateKey.equals(privateKey2));
			System.out.println("Are both public keys equal? " + publicKey.equals(publicKey2));

			return keyPair;

		} catch (InvalidKeySpecException specException) {
			System.out.println("Invalid Key Spec Exception");

		} catch (NoSuchAlgorithmException e) {
			System.out.println("No such algorithm: " + keyAlgorithm);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}



}

