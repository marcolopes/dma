/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.dma.utils.java.ArrayUtils;

/*
 * RSA is an asymmetric encryption algorithm developed in 1977 that use a pair of private key and public key.
 * RSA is the initials of the developers of the RSA algorithm: Ron Rivest, Adi Shamir, and Leonard Adleman.
 * Today, RSA is probably the most used the encryption algorithm for the Internet communication.
 */

public class RSASignature {

	/*
	 * Reads and Decodes the PRIVATE KEY
	 * FILE FORMAT: DER (Distinguished Encoding Rules) Encoding
	 * KEY ENCODING: PKCS#8
	 *
	 * PKCS stands for Public-Key Cryptography Standards, developed by
	 * RSA Security currently a division of EMC.
	 * PKCS#8 describes syntax for private-key information, including a
	 * private key for some public-key algorithm and a set of attributes.
	 * PKCS#8 is mainly used to encode private keys.
	 */
	public static PrivateKey decodePrivateKey(byte[] keyBytes) {

		try {
			PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
			KeyFactory kf = KeyFactory.getInstance("RSA");
			PrivateKey key = kf.generatePrivate(spec);
			return key;

		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException");
		} catch (InvalidKeySpecException e) {
			System.out.println("InvalidKeySpecException");
		}

		return null;

	}


	public static PrivateKey loadAndDecodePrivateKey(String derfile) {

		byte[] keyBytes = loadFile(derfile);
		if (keyBytes!=null)
			return decodePrivateKey(keyBytes);

		return null;

	}



	/*
	 * Reads and Decodes the PUBLIC KEY
	 * FILE FORMAT: DER (Distinguished Encoding Rules) Encoding
	 *
	 * KEY ENCODING: X.509
	 * X.509 is an ITU-T standard for a public key infrastructure (PKI)
	 * for single sign-on and Privilege Management Infrastructure (PMI).
	 * X.509 specifies, amongst other things, standard formats for
	 * public key certificates, certificate revocation lists,
	 * attribute certificates, and a certification path validation algorithm.
	 */
	public static PublicKey decodePublicKey(byte[] keyBytes) {

		try {
			X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
			KeyFactory kf = KeyFactory.getInstance("RSA");
			PublicKey key = kf.generatePublic(spec);
			return key;

		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException");
		} catch (InvalidKeySpecException e) {
			System.out.println("InvalidKeySpecException");
		}

		return null;

	}


	public static PublicKey loadAndDecodePublicKey(String derfile) {

		byte[] keyBytes = loadFile(derfile);
		if (keyBytes!=null)
			return decodePublicKey(keyBytes);

		return null;

	}


	public static byte[] loadFile(String filename) {

		System.out.println("LOADING: " + filename);

		try {
			// read
			File file = new File(filename);
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			byte[] keyBytes = new byte[(int)file.length()];
			dis.readFully(keyBytes);
			dis.close();

			return keyBytes;

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}

		return null;

	}


	// Verify signature
	public static boolean SHA1withRSASignatureVerify(PublicKey publicKey, byte[] signatureBytes, String message) {

		try {
			Signature signature = Signature.getInstance("SHA1withRSA");
			signature.initVerify(publicKey);
			signature.update(message.getBytes());
			boolean verify = signature.verify(signatureBytes);

			return verify;

		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (SignatureException e) {
			e.printStackTrace();
		}

		return false;
	}


	// Compute signature
	public static byte[] SHA1withRSASignature(PrivateKey privateKey, String message) {

		try {
			Signature signature = Signature.getInstance("SHA1withRSA");
			signature.initSign(privateKey);
			signature.update(message.getBytes());
			byte[] signatureBytes = signature.sign();

			return signatureBytes;

		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (SignatureException e) {
			e.printStackTrace();
		}

		return null;
	}


	public static void cipherTest(PrivateKey privateKey, PublicKey publicKey, String message) {

		try {
			// Encrypt digest
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, privateKey);
			byte[] cipherBytes = cipher.doFinal(message.getBytes());
			System.out.println("cipherBytes: " + ArrayUtils.toHex(cipherBytes)+"\n");

			// Decrypt digest
			cipher.init(Cipher.DECRYPT_MODE, publicKey);
			byte[] digestBytes2 = cipher.doFinal(cipherBytes);
			System.out.println("digestBytes2: " + ArrayUtils.toHex(digestBytes2)+"\n");

		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
	}



}

