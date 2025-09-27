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
package org.dma.java.security;

import org.dma.java.cipher.BlowfishCipher;
import org.dma.java.util.RandomValue;

public class BlowfishPassword extends BlowfishCipher {

	public BlowfishPassword(String key) {
		super(key);
	}

	/**
	 * BASE64encrypt with NO line break!
	 * @see BlowfishCipher#BASE64encrypt(String, int)
	 */
	public String encode(String password) {
		return BASE64encrypt(password, 0);
	}


	/**
	 * BASE64decrypt alias! (pair with encode)
	 * @see BlowfishCipher#BASE64decrypt(String)
	 */
	public String decode(String encoded) {
		return BASE64decrypt(encoded);
	}


	public boolean test(String encoded, String password) {
		return decode(encoded).equals(password);
	}


	public static void main(String[] args) {

		String password="password";
		System.out.println(password);

		BlowfishPassword cipher=new BlowfishPassword(new RandomValue().string(16));

		String encoded=cipher.encode(password);
		System.out.println(encoded);
		System.out.println(cipher.test(encoded, password));

	}


}