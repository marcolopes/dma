/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.security;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.dma.java.io.FileHandler;
import org.dma.java.util.TimeDateUtils;

public class Certificate {

	public enum CERTIFICATE_TYPE {JKS, PKCS12}

	private X509Certificate X509Cert;
	private KeyStore keyStore; // cache
	private String alias;

	public final String password;

	/**
	 * @param type - JKS, PKCS12 (enumerator)
	 * @param filename - keystore filename
	 * @param password - keystore password
	 * @param alias - alias to load (null=first key will be used)
	 */
	public Certificate(CERTIFICATE_TYPE type, String filename, String password, String alias) {
		this(type, new FileHandler(filename).asInputStream(), password, alias);
	}

	public Certificate(CERTIFICATE_TYPE type, InputStream stream, String password, String alias) {
		this(type, stream, password);
		load(alias);
	}

	public Certificate(CERTIFICATE_TYPE type, String filename, String password) {
		this(type, new FileHandler(filename).asInputStream(), password);
	}

	public Certificate(CERTIFICATE_TYPE type, InputStream stream, String password) {
		this.password=password;

		try{
			try{
				keyStore=KeyStore.getInstance(type.name());
				keyStore.load(stream, password.toCharArray());
			}finally{
				stream.close();
			}

		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			keyStore=null;
			e.printStackTrace();
		}

	}


	/** Returns first alias */
	public String alias() {
		if (alias==null && keyStore!=null) try{
			return keyStore.aliases().nextElement();

		}catch(KeyStoreException e){
			System.out.println(e);
		}catch(NoSuchElementException e){}

		return alias;
	}


	/** Loads alias (null=first alias) */
	public boolean load(String alias) {
		this.alias=alias;

		if (keyStore!=null) try{
			X509Cert=(X509Certificate)keyStore.getCertificate(alias());
			if (X509Cert==null) throw new KeyStoreException("Alias not found: "+alias);

			return true;

		}catch(KeyStoreException e){
			System.out.println(e);
		}

		return false;
	}


	/** Loads first alias */
	public boolean load() {
		return load(null);
	}


	public long daysToExpire() {
		return X509Cert==null ? 0 :
			TimeDateUtils.getDaysBetween(new Date(), X509Cert.getNotAfter());
	}


	public boolean isExpired(int daysToExpire) {
		return daysToExpire() < daysToExpire;
	}


	public boolean isExpired() {
		return isExpired(0);
	}


	public KeyStore getKeyStore() {
		return keyStore;
	}


	public X509Certificate getX509Cert() {
		return X509Cert;
	}


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
		for(int i=0; i<X509Cert.getKeyUsage().length && i<purposes.length; i++){
			if (X509Cert.getKeyUsage()[i]) col.add(purposes[i]);
		}
		return col;
	}


	public void debug(String filename) {
		try{
	    	System.out.println("-----X509 CERTIFICATE-----");
	    	System.out.println("STORE: " + filename);
	    	System.out.println("ALIAS: " + alias());
	    	System.out.println("USAGE: " + getKeyUsage());
	    	System.out.println("SERIAL: " + X509Cert.getSerialNumber());
	    	System.out.println("ISSUER: " + X509Cert.getIssuerX500Principal());
	    	System.out.println("SUBJECT: " + X509Cert.getSubjectX500Principal());
	    	System.out.println("EXPIRES: " + X509Cert.getNotAfter());
	    	System.out.println("DAYS LEFT: " + daysToExpire());
	    	System.out.println("HASH CODE: " + X509Cert.hashCode());

		}catch(Exception e){}
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public int hashCode() {
		return X509Cert==null ? 0 : X509Cert.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}


}