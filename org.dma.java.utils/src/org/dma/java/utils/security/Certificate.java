/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.security;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Certificate {

	public enum CERTIFICATE_TYPE {JKS, PKCS12}

	public KeyStore keyStore; // keyStore cache
	private X509Certificate X509Cert;
	private long daysToExpire;

	public final String filename;
	public final String password;
	private final String alias;

	/**
	 * @param type - JKS, PKCS12 (enumerator)
	 * @param filename - keystore filename
	 * @param password - keystore password
	 * @param alias - keystore alias (if NULL, first key will be used)
	 */
	public Certificate(CERTIFICATE_TYPE type, String filename, String password, String alias) {
		this.filename = filename;
		this.password = password;
		this.alias = alias;

		try{
			keyStore = KeyStore.getInstance(type.name());
			FileInputStream fis = new FileInputStream(filename);
			keyStore.load(fis, password.toCharArray());
			fis.close();

			X509Cert = (X509Certificate)keyStore.getCertificate(alias());
	    	daysToExpire = TimeUnit.MILLISECONDS.toDays(X509Cert.getNotAfter().getTime()-new Date().getTime());

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public String alias(){
		try{
			return alias==null ? keyStore.aliases().nextElement() : alias;

		}catch(KeyStoreException e){}

		return null;
	}


	public boolean isExpired(){
		return daysToExpire < 0;
	}


	public void debug(){
		try{
	    	System.out.println("KEYSTORE: " + filename);
	    	System.out.println("CERTIFICATE: " + alias());
	    	System.out.println("TYPE: " + X509Cert.getType());
	    	System.out.println("ISSUER: " + X509Cert.getIssuerX500Principal());
	    	System.out.println("SUBJECT: " + X509Cert.getSubjectX500Principal());
	    	System.out.println("EXPIRATION: " + X509Cert.getNotAfter());
	    	System.out.println("DAYS LEFT: " + daysToExpire);

		}catch(Exception e){}
	}


}