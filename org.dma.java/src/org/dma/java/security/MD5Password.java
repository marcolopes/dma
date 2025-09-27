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

/**
 * https://spycloud.com/blog/how-long-would-it-take-to-crack-your-password
 * </p>
 * (MD5) 12 minutes and 22 seconds</br>
 * (MD5-Salted): 17 minutes and 54 seconds</br>
 * (Bcrypt): 22 years
 */
@Deprecated
public class MD5Password extends MessageDigest {

	private final String password;

	public MD5Password(String password) {
		super(ALGORITHMS.MD5);
		this.password=password;
	}


	/** @see MessageDigest#BASE64digest(String) */
	public String encode() {
		return BASE64digest(password);
	}


	public boolean test(String encoded) {
		return encode().equals(encoded);
	}


	public static void main(String[] args) {

		MD5Password digest=new MD5Password("password");

		String encoded=digest.encode();
		System.out.println(encoded);
		System.out.println(digest.test(encoded));

	}


}