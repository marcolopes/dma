/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.cipher;

import java.io.File;
import java.security.PrivateKey;

import org.dma.java.security.RSAFactory;

public class RSAPrivateCipher extends CryptoCipher {

	public RSAPrivateCipher(byte[] keyBytes) {
		this(RSAFactory.decodePrivateKey(keyBytes));
	}

	public RSAPrivateCipher(String keyString) {
		this(RSAFactory.base64DecodePrivateKey(keyString));
	}

	public RSAPrivateCipher(File derFile) {
		this(RSAFactory.decodePrivateKey(derFile));
	}

	public RSAPrivateCipher(PrivateKey key) {
		super(key);
	}


	@Deprecated
	public String encrypt(byte[] buffer, int lineLength) {
		throw new UnsupportedOperationException("Encrypt not possible with PrivateKey");
	}


}
