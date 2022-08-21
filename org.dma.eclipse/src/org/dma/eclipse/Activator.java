/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse;

import java.awt.image.BufferedImage;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

import org.dma.eclipse.swt.graphics.ColorManager;
import org.dma.eclipse.swt.graphics.FontManager;
import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageUtils;
import org.dma.java.util.Debug;

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

	/** plug-in relative path */
	public static BufferedImage getBufferedImage(String imagePath) {
		return ImageUtils.createImage(Activator.class, imagePath);
	}

	/** plug-in relative path */
	public static BufferedImage getBufferedImage(String imagePath, int iconSize) {
		return ImageUtils.createImage(Activator.class, imagePath, iconSize);
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		Debug.err();
		ColorManager.DISPLAY.isDisposed();
		FontManager.DISPLAY.isDisposed();
		ImageManager.DISPLAY.isDisposed();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		Debug.err();
		ImageManager.REGISTRY.dispose();
	}

}