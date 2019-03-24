/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers;

import org.dma.java.drivers.jdbc.POOLMANAGERS;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = Activator.class.getPackage().getName();

	public Activator() {
		System.err.println(PLUGIN_ID+"(ACTIVATOR)");
	}

	@Override
	public void start(BundleContext context) throws Exception {}

	@Override
	public void stop(BundleContext context) throws Exception {
		POOLMANAGERS.shutdown();
	}

	public static Class classForName(String className) {
		try{
			return Class.forName(className);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}return null;
	}

}
