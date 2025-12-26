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

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;

import org.dma.java.io.ByteFile;

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
		try{KeyFactory factory=KeyFactory.getInstance(CIPHERS.RSA_ECB_PKCS1.algorithm);
			X509EncodedKeySpec spec=new X509EncodedKeySpec(encodedKey);
			return factory.generatePublic(spec);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/** @see RSAPrivateCipher#decode(byte[]) */
	public RSAPublicCipher(File file) {
		this(new ByteFile(file).readFully());
	}

	/** @see RSAPrivateCipher#decode(byte[]) */
	public RSAPublicCipher(byte[] encodedKey) {
		this(decode(encodedKey));
	}

	public RSAPublicCipher(PublicKey key) {
		super(key);
	}


	@Override
	public PublicKey getKey() {
		return (PublicKey)super.getKey();
	}


	/** Verify signature */
	public boolean verifySHA1Signature(byte[] signatureBytes, byte[] messageBytes) {

		if (signatureBytes!=null && messageBytes!=null) try{
			Signature signature=Signature.getInstance("SHA1withRSA");
			signature.initVerify(getKey());
			signature.update(messageBytes);

			return signature.verify(signatureBytes);

		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	/** Verify signature */
	public boolean verifySHA1Signature(String base64signature, String message) {

		if (base64signature!=null && message!=null) try{
			byte[] base64Bytes=new Base64().decode(base64signature);

			return verifySHA1Signature(base64Bytes, message.getBytes("UTF8"));

		}catch(UnsupportedEncodingException e){
			System.err.println(e);
		}return false;

	}


}
