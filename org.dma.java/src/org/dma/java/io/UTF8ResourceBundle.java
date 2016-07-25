package org.dma.java.io;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * UTF-8 friendly ResourceBundle support
 *
 * Utility that allows having multi-byte characters inside java .property files.
 * It removes the need for Sun's native2ascii application, you can simply have
 * UTF-8 encoded editable .property files.
 *
 * Use:
 * ResourceBundle bundle=new UTF8ResourceBundle("baseName");
 *
 * @author Tomas Varaneckas <tomas.varaneckas@gmail.com>
 * @author Marco Lopes <marcolopes@netc.pt>
 */
public class UTF8ResourceBundle extends ResourceBundle {

	/** Bundle with unicode data */
	private final ResourceBundle bundle;

	/** Loads with getSystemClassLoader() */
	public UTF8ResourceBundle(String baseName) {
		this(baseName, ClassLoader.getSystemClassLoader());
	}

	/** @see ResourceBundle#getBundle(String, Locale, ClassLoader) */
	public UTF8ResourceBundle(String baseName, ClassLoader loader) {
		this(getBundle(baseName, Locale.getDefault(), loader));
	}

	public UTF8ResourceBundle(ResourceBundle bundle) {
		this.bundle=bundle;
	}

	@Override
	protected Object handleGetObject(String key) {
		final String value=bundle.getString(key);
		if (value!=null) try{
			return new String(value.getBytes("ISO-8859-1"), "UTF-8");

		}catch(UnsupportedEncodingException e) {
			throw new UnsupportedOperationException("Encoding not supported", e);
		}
		return null;
	}

	@Override
	public Enumeration<String> getKeys() {
		return bundle.getKeys();
	}

}
