/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.security;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.dma.utils.java.timedate.TimeDateUtils;

public class Certificate {

	public enum CERTIFICATE_TYPE {JKS, PKCS12}

	public final String filename;
	public final String password;
	private String alias;

	public KeyStore keyStore; // cache
	private X509Certificate X509Cert;
	private long daysToExpire=0;

	/**
	 * @param type - JKS, PKCS12 (enumerator)
	 * @param filename - keystore filename
	 * @param password - keystore password
	 * @param alias - keystore alias (null=first key will be used)
	 */
	public Certificate(CERTIFICATE_TYPE type, String filename, String password) {
		this.filename=filename;
		this.password=password;

		try{
			keyStore=KeyStore.getInstance(type.name());
			FileInputStream fis=new FileInputStream(filename);
			keyStore.load(fis, password.toCharArray());
			fis.close();

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Certificate(CERTIFICATE_TYPE type, String filename, String password, String alias) {
		this(type, filename, password);
		load(alias);
	}


	/** Returns first alias */
	public String alias() {
		try{
			return alias==null ? keyStore.aliases().nextElement() : alias;

		}catch(Exception e){}

		return null;
	}


	/** Load alias */
	public boolean load(String alias) {
		this.alias=alias;

		try{
			X509Cert=(X509Certificate)keyStore.getCertificate(alias());
			if (X509Cert==null) throw new Exception("Alias not found: "+alias);
	    	daysToExpire=TimeDateUtils.getDaysBetween(new Date(), X509Cert.getNotAfter());

			return true;

		}catch(Exception e){
			System.out.println(e);
		}

		return false;
	}


	/** Load first alias */
	public boolean load() {
		return load(null);
	}


	public boolean isExpired(int daysToExpire) {
		return this.daysToExpire<daysToExpire;
	}


	public boolean isExpired() {
		return isExpired(0);
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

		Collection<String> col=new ArrayList();
		for(int i=0; i<X509Cert.getKeyUsage().length && i<purposes.length; i++){
			if (X509Cert.getKeyUsage()[i]) col.add(purposes[i]);
		}
		return col;
	}


	public void debug() {
		try{
	    	System.out.println("-----X509 CERTIFICATE-----");
	    	System.out.println("STORE: " + filename);
	    	System.out.println("ALIAS: " + alias());
	    	System.out.println("USAGE: " + getKeyUsage());
	    	System.out.println("SERIAL: " + X509Cert.getSerialNumber());
	    	System.out.println("ISSUER: " + X509Cert.getIssuerX500Principal());
	    	System.out.println("SUBJECT: " + X509Cert.getSubjectX500Principal());
	    	System.out.println("EXPIRES: " + X509Cert.getNotAfter());
	    	System.out.println("DAYS LEFT: " + daysToExpire);
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