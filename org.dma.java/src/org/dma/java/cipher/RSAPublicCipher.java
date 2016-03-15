/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.cipher;

import java.io.File;
import java.security.PublicKey;

import org.dma.java.security.RSAFactory;

public class RSAPublicCipher extends CryptoCipher {

	public RSAPublicCipher(byte[] keyBytes) {
		this(RSAFactory.decodePublicKey(keyBytes));
	}

	public RSAPublicCipher(String keyString) {
		this(RSAFactory.base64DecodePublicKey(keyString));
	}

	public RSAPublicCipher(File derFile) {
		this(RSAFactory.decodePublicKey(derFile));
	}

	public RSAPublicCipher(PublicKey key) {
		super(key);
	}


	@Deprecated
	public String decrypt(byte[] buffer) {
		throw new UnsupportedOperationException("Decrypt not possible with PublicKey");
	}


}
