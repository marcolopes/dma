/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse;

import org.dma.eclipse.swt.graphics.ColorManager;
import org.dma.eclipse.swt.graphics.ImageManager;
import org.osgi.framework.BundleContext;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.dma.eclipse";

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println(PLUGIN_ID+" ACTIVATOR <start>");
		super.start(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		ImageManager.CACHE.clear();
		ColorManager.CACHE.clear();
		super.stop(context);
		System.out.println(PLUGIN_ID+" ACTIVATOR <stop>");
	}

}
