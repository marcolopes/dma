/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse;

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.graphics.ColorManager;
import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageUtils;
import org.osgi.framework.BundleContext;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = Activator.class.getPackage().getName();

	// The shared instance
	private static Activator plugin;

	/** Returns the shared instance */
	public static Activator getDefault() {
		return plugin;
	}

	public Activator() {
		System.err.println(PLUGIN_ID+"(ACTIVATOR)");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		ImageManager.CACHE.clear();
		ColorManager.CACHE.clear();
		plugin = null;
		super.stop(context);
	}

	public static BufferedImage getBufferedImage(String imagePath, int iconSize) {
		return ImageUtils.resizeImage(Activator.class, imagePath, iconSize);
	}

	public static BufferedImage getBufferedImage(String imagePath) {
		return ImageUtils.createImage(Activator.class, imagePath);
	}

}
