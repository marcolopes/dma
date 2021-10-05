/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.security;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.dma.java.io.ByteFile;
import org.dma.java.util.TimeDateUtils;

public class JKSCertificate {

	public enum CERTIFICATE_TYPE {
		/** The proprietary keystore implementation provided by the SUN provider */
		JKS,
		/** The proprietary keystore implementation provided by the SunJCE provider */
		JCEKS,
		/** The transfer syntax for personal identity information as defined in PKCS#12 */
		PKCS12
	}

	public final String password;

	private X509Certificate X509Cert;
	private KeyStore keyStore;
	private String alias;

	/**
	 * @param type - the certificate type
	 * @param pathname - the keystore pathname
	 * @param password - the keystore password (null=no integrity checking)
	 * @param alias - the alias to load (if empty, use first alias found)
	 */
	public JKSCertificate(CERTIFICATE_TYPE type, String pathname, String password, String...alias) {
		this(type, new ByteFile(pathname).read(), password, alias);
	}

	/**
	 * @param type - the certificate type
	 * @param data - the keyStore data
	 * @param password - the keyStore password (null=no integrity checking)
	 * @param alias - the alias to load (if empty, use first alias found)
	 */
	public JKSCertificate(CERTIFICATE_TYPE type, byte[] data, String password, String...alias) {
		this.password=password;
		try{KeyStore keyStore=KeyStore.getInstance(type.name());
			keyStore.load(new ByteArrayInputStream(data), password==null ? null : password.toCharArray());
			if (alias.length==0 && keyStore.aliases().hasMoreElements()) alias=new String[]{keyStore.aliases().nextElement()};
			int index=-1;
			while(X509Cert==null && ++index<alias.length){
				X509Cert=(X509Certificate)keyStore.getCertificate(alias[index]);
			}if (X509Cert==null) throw new KeyStoreException("Certificate not found: "+Arrays.asList(alias));
			this.keyStore=keyStore;
			this.alias=alias[index];

		}catch(EOFException e){
		}catch(Exception e){
			System.err.println(e);
		}

	}


	public KeyStore getKeyStore() throws KeyStoreException {
		if (keyStore==null) throw new KeyStoreException("KeyStore not loaded");
		return keyStore;
	}


	public String getAlias() {
		return alias;
	}


	public PrivateKey getPrivateKey() throws KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException {
		KeyStore keyStore=getKeyStore(); // check
		return (PrivateKey)keyStore.getKey(alias, password==null ? null : password.toCharArray());
	}


	public Certificate[] getCertificateChain() throws KeyStoreException {
		KeyStore keyStore=getKeyStore(); // check
		return keyStore.getCertificateChain(alias);
	}


	public Certificate getCertificate() throws KeyStoreException {
		KeyStore keyStore=getKeyStore(); // check
		return keyStore.getCertificate(alias);
	}

	public TrustManager[] getTrustManagers() throws KeyStoreException, NoSuchAlgorithmException {
		KeyStore keyStore=getKeyStore(); // check
		TrustManagerFactory tmf=TrustManagerFactory.getInstance("SunX509");
		tmf.init(keyStore);
		return tmf.getTrustManagers();
	}


	/** Checks if X509 Certificate is loaded */
	public boolean isValid() {
		return X509Cert!=null;
	}


	/** Returns X509 Certificate days left */
	public long daysToExpire() {
		return X509Cert==null ? 0 : TimeDateUtils.getDaysBetween(new Date(), X509Cert.getNotAfter());
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

		Collection<String> col=new ArrayList();
		boolean[] usage=X509Cert.getKeyUsage();
		for(int i=0; i<usage.length && i<purposes.length; i++){
			if (usage[i]) col.add(purposes[i]);
		}return Collections.unmodifiableCollection(col);
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
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
	    	"\nISSUED: " + X509Cert.getNotBefore()+
	    	"\nEXPIRES: " + X509Cert.getNotAfter()+
	    	"\nDAYS LEFT: " + daysToExpire()+
			"\nHASH CODE: " + hashCode();

	}

	@Override
	public int hashCode() {
		return alias.hashCode()+
				(!isValid() ? 0 : X509Cert.hashCode());
	}

	public boolean equals(JKSCertificate other) {
		return alias.equals(other.alias) &&
				X509Cert==null ? other.X509Cert==null : X509Cert.equals(other.X509Cert);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JKSCertificate) return equals((JKSCertificate)obj);
		return false;
	}


}