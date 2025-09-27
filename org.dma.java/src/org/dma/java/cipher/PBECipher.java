/*******************************************************************************
 * Copyright 2008-2016 Marco Lopes (marcolopespt@gmail.com)
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

import java.security.spec.KeySpec;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 * KeyLength above 128bits requires to install the
 * Java Cryptography Extension (JCE) unlimited strength jurisdiction policy files<br>
 * http://stackoverflow.com/questions/992019/java-256-bit-aes-password-based-encryption/992413#992413
 */
public class PBECipher extends CryptoCipher {

	/** PBKDF2 (Password-Based Key Derivation Function 2) */
	public static SecretKey generateKey(KeySpec spec) {
		try{SecretKeyFactory factory=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			return factory.generateSecret(spec);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/** @see CryptoCipher#CryptoCipher(java.security.Key, String) */
	public PBECipher(String transformation, String password, String salt, int keyLength) {
		this(transformation, new PBEKeySpec(password.toCharArray(),
				salt.getBytes(), 65536, keyLength));
	}

	/** @see CryptoCipher#CryptoCipher(java.security.Key, String) */
	public PBECipher(String transformation, String password, String salt) {
		this(transformation, new PBEKeySpec(password.toCharArray(),
				salt.getBytes(), 65536));
	}

	/** @see CryptoCipher#CryptoCipher(java.security.Key, String) */
	public PBECipher(String transformation, String password) {
		this(transformation, new PBEKeySpec(password.toCharArray()));
	}

	/** @see CryptoCipher#CryptoCipher(java.security.Key, String) */
	public PBECipher(String transformation, KeySpec spec) {
		super(generateKey(spec), transformation);
	}


}
