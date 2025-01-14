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
 * Others
 *******************************************************************************/
package org.dma.bouncycastle;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.cert.X509Certificate;
import java.util.Date;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509v1CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

public class CertificateFactory {

	/*
	 * CERTIFICATION
	 *

	Avaliable Algorithms

	DSA
	DSA currently just supports SHA-1.
	The following value can be used in place of the variable signatureAlgorithm in the examples below:

	 * SHA1withDSA

	Elliptic Curve (ECDSA)
	ECDSA is support with both the SHA-1 and SHA-2 family of digest algorithms.
	The following values can be used in place of the variable signatureAlgorithm in the examples below:

	 * SHA1withECDSA
	 * SHA224withECDSA
	 * SHA256withECDSA
	 * SHA384withECDSA
	 * SHA512withECDSA

	Astute readers will probably realise at this point that given a 239 bit ECDSA key and a 512 bit hash,
	about 280 of the hash bits are going to be without a home in the signature as the hash can be no longer than the order N of the key.
	In this case the hash is truncated by losing the excess right most bits of it, so you can still use the larger hash algorithm, but it will be shortened.

	GOST
	The algorithms GOST3410-94 and GOST3410-2001 are supported for certificate signing.
	The following value can be used in place of signatureAlgorithm in the examples below:

	 * GOST3411withGOST3410
	 * GOST3411withECGOST3410

	RSA
	A variety of digests can be used to sign certficates using the RSA algorithm.
	The following value can be used in place of the variable signatureAlgorithm in the examples below:

	 * MD2withRSA
	 * MD5withRSA
	 * SHA1withRSA
	 * SHA224withRSA
	 * SHA256withRSA
	 * SHA384withRSA
	 * SHA512withRSA
	 * RIPEMD160withRSA
	 * RIPEMD128withRSA
	 * RIPEMD256withRSA

	 */
	public static X509Certificate generate(KeyPair keyPair, String signatureAlgorithm) {

		try{
			X509v1CertificateBuilder builder=new X509v1CertificateBuilder(
					new X500Name("CN=Test Root Certificate"),
					BigInteger.ZERO,
					new Date(), new Date(),
					new X500NameBuilder(X500Name.getDefaultStyle()).
					addRDN(BCStyle.CN, "Test").build(),
					SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded()));

			return new JcaX509CertificateConverter().getCertificate(
					builder.build(new JcaContentSignerBuilder(signatureAlgorithm).
							setProvider(new BouncyCastleProvider()).
							build(keyPair.getPrivate())));

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}

	/** Generate Key Pair */
	public static KeyPair generateKeyPair(int keysize) {

		try{// Generate the private/public key pair
			KeyPairGenerator keyGen=KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(keysize);
			return keyGen.genKeyPair();

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	public static void main(String[] args) {

		//Generate a 1024-bit RSA key pair
		KeyPair kp=generateKeyPair(1024);

		//Generate X509 certificate
		X509Certificate cert=generate(kp, "SHA1withRSA");
		System.out.println("X509Certificate: "+cert);

	}


}
