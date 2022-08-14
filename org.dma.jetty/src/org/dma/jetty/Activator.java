/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.jetty;

import java.awt.image.BufferedImage;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

import org.dma.eclipse.core.BundleUtils;
import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageUtils;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.swt.graphics.Image;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	public static final Bundle PLUGIN_BUNDLE = FrameworkUtil.getBundle(Activator.class);

	public static final String PLUGIN_ID = PLUGIN_BUNDLE.getSymbolicName();

	public static final Version PLUGIN_VERSION = PLUGIN_BUNDLE.getVersion();

	public static final String PLUGIN_NAME = PLUGIN_ID+" "+new Version(
			PLUGIN_VERSION.getMajor(), PLUGIN_VERSION.getMinor(), PLUGIN_VERSION.getMicro());

	public Activator() {
		System.err.println(PLUGIN_NAME+" "+getClass().getSimpleName());
	}

	public static String pathResolver(String relativePath) {
		return BundleUtils.pathResolver(PLUGIN_BUNDLE, relativePath);
	}

	public static BufferedImage getBufferedImage(String imagePath) {
		return ImageUtils.createImage(Activator.class, imagePath);
	}

	public static Image getImage(String imagePath) {
		return ImageManager.getImage(getBufferedImage(imagePath));
	}

}
