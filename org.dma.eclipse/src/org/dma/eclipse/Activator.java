/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse;

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageUtils;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	public static final Bundle PLUGIN_BUNDLE = FrameworkUtil.getBundle(Activator.class);

	public static final String PLUGIN_ID = PLUGIN_BUNDLE.getSymbolicName();

	public Activator() {
		System.err.println(PLUGIN_ID+"(ACTIVATOR)");
	}

	/** plug-in relative path */
	public static ImageDescriptor getImageDescriptor(String imagePath) {
		return ImageDescriptor.createFromFile(Activator.class, imagePath);
	}

	/** plug-in relative path */
	public static BufferedImage getBufferedImage(String imagePath, int iconSize) {
		return ImageUtils.createImage(Activator.class, imagePath, iconSize);
	}

	/** plug-in relative path */
	public static BufferedImage getBufferedImage(String imagePath) {
		return ImageUtils.createImage(Activator.class, imagePath);
	}

	/** plug-in relative path */
	public static Image getImage(String imagePath, int iconSize) {
		return ImageManager.getImage(getBufferedImage(imagePath, iconSize));
	}

	/** plug-in relative path */
	public static Image getImage(String imagePath) {
		return ImageManager.getImage(getBufferedImage(imagePath));
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		//ColorManager.DISPLAY.isDisposed();
		//FontManager.DISPLAY.isDisposed();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

}
