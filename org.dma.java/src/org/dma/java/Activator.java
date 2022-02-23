/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	public static final Bundle PLUGIN_BUNDLE = FrameworkUtil.getBundle(Activator.class);

	public static final String PLUGIN_ID = PLUGIN_BUNDLE.getSymbolicName();

	public static final Version PLUGIN_VERSION = PLUGIN_BUNDLE.getVersion();

	public static final String PLUGIN_NAME = PLUGIN_ID+" "+new Version(
			PLUGIN_VERSION.getMajor(), PLUGIN_VERSION.getMinor(), PLUGIN_VERSION.getMicro());

	public Activator() {
		System.err.println(PLUGIN_NAME+" "+getClass().getSimpleName());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		//in JDK 1.4, defaultEncodingName will typically be "Cp1252"
		System.out.println("FILE ENCODING: "+System.getProperty("file.encoding"));
		//in JDK 1.5+, will typically be "windows-1252"
		System.out.println("DEFAULT CHARSET: "+Charset.defaultCharset().name());
		//Available Locales
		List<String> languages=new ArrayList();
		List<String> countries=new ArrayList();
		for(Locale locale: Locale.getAvailableLocales()){
			if (!locale.getLanguage().isEmpty()) languages.add(locale.getLanguage());
			if (!locale.getCountry().isEmpty()) countries.add(locale.getCountry());
		}
		System.out.println("AVAILABLE languages: "+languages);
		System.out.println("AVAILABLE countries: "+countries);

	}

	@Override
	public void stop(BundleContext context) throws Exception {}

}
