/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.cipher;

import java.io.File;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PKCS8EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.dma.java.io.ByteFileHandler;

public class RSAPrivateCipher extends CryptoCipher {

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
	public static PrivateKey decode(byte[] encodedKey) {
		try{
			KeyFactory kf=KeyFactory.getInstance(CIPHERS.RSA_ECB_PKCS1.algorithm);
			PKCS8EncodedKeySpec spec=new PKCS8EncodedKeySpec(encodedKey);
			return kf.generatePrivate(spec);

		}catch(Exception e){
			System.err.println(e);
		}
		return null;
	}


	/** @see RSAPrivateCipher#decode(byte[]) */
	public RSAPrivateCipher(File file) {
		this(new ByteFileHandler(file).readFully());
	}

	/** @see RSAPrivateCipher#decode(byte[]) */
	public RSAPrivateCipher(byte[] encodedKey) {
		this(decode(encodedKey));
	}

	public RSAPrivateCipher(PrivateKey key) {
		super(key);
	}


	/** Compute signature */
	public byte[] signWithSHA1(byte[] messageBytes) throws SignatureException {

		try{
			Signature signature=Signature.getInstance("SHA1withRSA");
			signature.initSign(getKey());
			signature.update(messageBytes);

			return signature.sign();

		}catch(Exception e){
			throw new SignatureException(e);
		}

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Compute signature Bytes <br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param messageBytes - the message to sign.
	 */
	public String BASE64signWithSHA1(byte[] messageBytes) throws SignatureException {

		try{
			byte[] signatureBytes=signWithSHA1(messageBytes);
			byte[] base64Bytes=new Base64(0).encode(signatureBytes);

			return new String(base64Bytes, "UTF8");

		}catch(Exception e){
			throw new SignatureException(e);
		}

	}


	/**
	 * <b>Message is processed as follows:</b><br>
	 * - Convert String to Bytes (UTF8 charset)<br>
	 * - Compute signature Bytes <br>
	 * - Encode Bytes to BASE64<br>
	 * - Convert Bytes to String (UTF8 charset)<br>
	 *
	 * @param message - the message to sign.
	 */
	public String BASE64signWithSHA1(String message) throws SignatureException {

		try{
			byte[] messageBytes=message.getBytes("UTF8");

			return BASE64signWithSHA1(messageBytes);

		}catch(Exception e){
			throw new SignatureException(e);
		}

	}


	@Override
	public PrivateKey getKey() {
		return (PrivateKey)super.getKey();
	}


	@Override
	public byte[] encrypt(byte[] messageBytes) {
		throw new UnsupportedOperationException("Encrypt not possible with PrivateKey");
	}

	@Override
	public String BASE64encrypt(byte[] messageBytes, int lineLength) {
		throw new UnsupportedOperationException("Encrypt not possible with PrivateKey");
	}

	@Override
	public String BASE64encrypt(String message, int lineLength) {
		throw new UnsupportedOperationException("Encrypt not possible with PrivateKey");
	}


}
