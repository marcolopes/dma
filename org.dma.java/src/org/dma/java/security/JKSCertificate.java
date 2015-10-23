/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.dma.java.io.ByteFileHandler;
import org.dma.java.util.TimeDateUtils;

public class JKSCertificate {

	public enum CERTIFICATE_TYPE {
		/** The proprietary keystore implementation provided by the SunJCE provider */
		JCEKS,
		/** The proprietary keystore implementation provided by the SUN provider */
		JKS,
		/** The transfer syntax for personal identity information as defined in PKCS #12 */
		PKCS12
	}

	private X509Certificate X509Cert;
	private KeyStore keyStore;
	private String alias;

	public final String password;

	public JKSCertificate(CERTIFICATE_TYPE type, String filename, String password) {
		this(type, new ByteFileHandler(filename).asInputStream(), password, null);
	}

	public JKSCertificate(CERTIFICATE_TYPE type, String filename, String password, String alias) {
		this(type, new ByteFileHandler(filename).asInputStream(), password, alias);
	}

	public JKSCertificate(CERTIFICATE_TYPE type, InputStream stream, String password) {
		this(type, stream, password, null);
	}

	/**
	 * @param type - JKS, PKCS12 (enumerator)
	 * @param stream - keystore stream
	 * @param password - keystore password (null=no integrity checking)
	 * @param alias - alias to load (null=use first alias found)
	 */
	public JKSCertificate(CERTIFICATE_TYPE type, InputStream stream, String password, String alias) {
		this.password=password;

		try{
			this.keyStore=KeyStore.getInstance(type.name());
			this.keyStore.load(stream, password==null ? null : password.toCharArray());
			this.alias=alias==null ? keyStore.aliases().nextElement() : alias;
			this.X509Cert=(X509Certificate)keyStore.getCertificate(this.alias);

		}catch(Exception e){
			System.out.println(e);
			keyStore=null;
		}

	}


	private void checkKeystore() throws KeyStoreException {
		if (keyStore==null) throw new KeyStoreException("KeyStore not loaded");
	}


	public KeyStore getKeyStore() {
		return keyStore;
	}


	public String getAlias() {
		return alias;
	}


	public PrivateKey getPrivateKey() throws KeyStoreException {
		checkKeystore();
		try{
			return (PrivateKey)keyStore.getKey(alias,
					password==null ? null : password.toCharArray());

		}catch(UnrecoverableKeyException e){
			System.out.println(e);
		}catch(NoSuchAlgorithmException e){
			System.out.println(e);
		}

		return null;
	}


	public Certificate[] getCertificateChain() throws KeyStoreException {
		checkKeystore();
		return keyStore.getCertificateChain(alias);
	}


	public Certificate getCertificate() throws KeyStoreException {
		checkKeystore();
		return keyStore.getCertificate(alias);
	}


	/** Checks if X509 Certificate is loaded */
	public boolean isValid() {
		return X509Cert!=null;
	}


	/** Returns X509 Certificate days left */
	public long daysToExpire() {
		return X509Cert==null ? 0 :
			TimeDateUtils.getDaysBetween(new Date(), X509Cert.getNotAfter());
	}


	/** Checks if X509 Certificate is expired */
	public boolean isExpired(int daysToExpire) {
		return daysToExpire() < daysToExpire;
	}


	/** Checks if X509 Certificate is expired */
	public boolean isExpired() {
		return isExpired(0);
	}


	/** Returns X509 Certificate usage */
	public Collection<String> getKeyUsage() {
		String[] purposes=new String[]{
		     "digitalSignature",
		     "nonRepudiation",
		     "keyEncipherment",
		     "dataEncipherment",
		     "keyAgreement",
		     "keyCertSign",
		     "cRLSign",
		     "encipherOnly",
		     "decipherOnly"};

		List<String> col=new ArrayList();
		boolean[] usage=X509Cert.getKeyUsage();
		for(int i=0; i<usage.length && i<purposes.length; i++){
			if (usage[i]) col.add(purposes[i]);
		}
		return Collections.unmodifiableCollection(col);
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return !isValid() ? "INVALID" :
			"-----X509 CERTIFICATE-----"+
			"\nALIAS: " + alias+
			"\nUSAGE: " + getKeyUsage()+
	    	"\nSERIAL: " + X509Cert.getSerialNumber()+
	    	"\nISSUER: " + X509Cert.getIssuerX500Principal()+
	    	"\nSUBJECT: " + X509Cert.getSubjectX500Principal()+
	    	"\nEXPIRES: " + X509Cert.getNotAfter()+
	    	"\nDAYS LEFT: " + daysToExpire()+
			"\nHASH CODE: " + hashCode();

	}

	@Override
	public int hashCode() {
		return !isValid() ? 0 : X509Cert.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}


}