/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Others
 *******************************************************************************/
package org.dma.utils.bouncycastle;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;

import javax.security.auth.x500.X500Principal;

import org.bouncycastle.x509.X509V1CertificateGenerator;
import org.dma.utils.java.security.KeysGenerator;

public class CertificateGenerator {

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

		try {
			Date startDate = new Date(); // time from which certificate is valid
			Date expiryDate = new Date(); // time after which certificate is not valid
			BigInteger serialNumber = BigInteger.valueOf(1); // serial number for certificate

			X509V1CertificateGenerator certGen = new X509V1CertificateGenerator();
			X500Principal dnName = new X500Principal("CN=Test CA Certificate");

			certGen.setSerialNumber(serialNumber);
			certGen.setIssuerDN(dnName);
			certGen.setNotBefore(startDate);
			certGen.setNotAfter(expiryDate);
			certGen.setSubjectDN(dnName); // note: same as issuer
			certGen.setPublicKey(keyPair.getPublic());
			certGen.setSignatureAlgorithm(signatureAlgorithm);

			//X509Certificate cert = certGen.generate(keyPair.getPrivate(), "BC");
			X509Certificate cert = certGen.generate(keyPair.getPrivate());

			return cert;

		} catch (CertificateEncodingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (SignatureException e) {
			e.printStackTrace();
		}

		return null;

	}



	public static void main(String[] args) {

		//Generate a 1024-bit RSA key pair
		KeyPair kp = KeysGenerator.generate("RSA", 1024);
		X509Certificate cert=CertificateGenerator.generate(kp, "SHA1withRSA");
		System.out.println("X509Certificate: " + cert+"\n");

	}


}

