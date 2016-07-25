/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.cipher;

import java.io.File;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

import org.dma.java.io.ByteFileHandler;

public class RSAPublicCipher extends CryptoCipher {

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
	public static PublicKey decode(byte[] encodedKey) {
		try{
			KeyFactory kf=KeyFactory.getInstance("RSA");
			X509EncodedKeySpec spec=new X509EncodedKeySpec(encodedKey);
			return kf.generatePublic(spec);

		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}


	/** @see RSAPrivateCipher#decode(byte[]) */
	public RSAPublicCipher(File file) {
		this(new ByteFileHandler(file).readFully());
	}

	/** @see RSAPrivateCipher#decode(byte[]) */
	public RSAPublicCipher(byte[] encodedKey) {
		this(decode(encodedKey));
	}

	public RSAPublicCipher(PublicKey key) {
		super(key);
	}


	/** Verify signature */
	public boolean verifySHA1Signature(byte[] signatureBytes, byte[] messageBytes) {

		try{
			Signature signature=Signature.getInstance("SHA1withRSA");
			signature.initVerify(getKey());
			signature.update(messageBytes);

			return signature.verify(signatureBytes);

		}catch(Exception e){
			System.out.println(e);
		}

		return false;

	}


	@Override
	public PublicKey getKey() {
		return (PublicKey)super.getKey();
	}


	@Override
	public byte[] decrypt(byte[] messageBytes) {
		throw new UnsupportedOperationException("Decrypt not possible with PublicKey");
	}

	@Override
	public String BASE64decrypt(byte[] messageBytes) {
		throw new UnsupportedOperationException("Decrypt not possible with PublicKey");
	}

	@Override
	public String BASE64decrypt(String message) {
		throw new UnsupportedOperationException("Decrypt not possible with PublicKey");
	}


}
