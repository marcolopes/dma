/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse;

import org.dma.eclipse.swt.graphics.ColorManager;
import org.dma.eclipse.swt.graphics.ImageManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.dma.eclipse";

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println(PLUGIN_ID+" ACTIVATOR <start>");
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		ImageManager.CACHE.clear();
		ColorManager.CACHE.clear();
		System.out.println(PLUGIN_ID+" ACTIVATOR <stop>");
	}

}
