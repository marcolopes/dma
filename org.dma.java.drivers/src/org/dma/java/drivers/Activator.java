/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

import org.dma.java.drivers.jdbc.POOLMANAGERS;

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
	public void start(BundleContext context) throws Exception {}

	@Override
	public void stop(BundleContext context) throws Exception {
		POOLMANAGERS.shutdown();
	}

	public static Class classForName(String className) {
		try{return Class.forName(className);
		}catch(ClassNotFoundException e){
			System.err.println(e);
		}return null;
	}

}
