/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Others
 *******************************************************************************/
package org.dma.java.security;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.cert.X509Certificate;
import java.util.Date;

import javax.security.auth.x500.X500Principal;

import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.dma.java.cipher.RSACipher;
import org.dma.java.util.Debug;

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
			Date startDate=new Date(); // time from which certificate is valid
			Date expiryDate=new Date(); // time after which certificate is not valid
			BigInteger serialNumber=BigInteger.valueOf(1); // serial number for certificate

			X509V1CertificateGenerator cg=new X509V1CertificateGenerator();
			X500Principal distinguishedName=new X500Principal("CN=Test CA Certificate");

			cg.setSerialNumber(serialNumber);
			cg.setIssuerDN(distinguishedName);
			cg.setNotBefore(startDate);
			cg.setNotAfter(expiryDate);
			cg.setSubjectDN(distinguishedName); // note: same as issuer
			cg.setPublicKey(keyPair.getPublic());
			cg.setSignatureAlgorithm(signatureAlgorithm);

			X509Certificate cert=cg.generate(keyPair.getPrivate() /*, "BC"*/);

			return cert;

		}catch(Exception e){
			Debug.err(e);
		}

		return null;

	}


	public static void main(String[] args) {

		//Generate a 1024-bit RSA key pair
		KeyPair kp=RSACipher.generateKeyPair(1024);

		//Generate X509 certificate
		X509Certificate cert=CertificateFactory.generate(kp, "SHA1withRSA");
		System.out.println("X509Certificate: "+cert);

	}


}
