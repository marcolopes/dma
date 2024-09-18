/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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

import org.dma.eclipse.core.BundleUtils;
import org.dma.eclipse.core.jobs.CustomJob;
import org.dma.eclipse.swt.graphics.ImageManager;
import org.dma.java.awt.ImageHandler;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.graphics.Image;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	public static final Bundle PLUGIN_BUNDLE = FrameworkUtil.getBundle(Activator.class);

	public static final String PLUGIN_ID = PLUGIN_BUNDLE.getSymbolicName();

	public static final Version PLUGIN_VERSION = new Version(
			PLUGIN_BUNDLE.getVersion().getMajor(),
			PLUGIN_BUNDLE.getVersion().getMinor(),
			PLUGIN_BUNDLE.getVersion().getMicro());

	public static final String PLUGIN_NAME = PLUGIN_ID+" "+PLUGIN_VERSION;

	public static String pathResolver(String relativePath) {
		return BundleUtils.pathResolver(PLUGIN_ID, relativePath);
	}

	/** plug-in relative path */
	public static BufferedImage getBufferedImage(String resource) {
		return ImageHandler.createImage(Activator.class, resource);
	}

	/** plug-in relative path */
	public static BufferedImage getBufferedImage(String resource, int size) {
		return new ImageHandler(Activator.class, resource).resize(size);
	}

	/** plug-in relative path */
	public static Image getImage(String resource) {
		return ImageManager.getImage(getBufferedImage(resource));
	}

	/** plug-in relative path */
	public static Image getImage(String resource, int size) {
		return ImageManager.getImage(getBufferedImage(resource, size));
	}

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
		int seconds=0;
		Job.getJobManager().cancel(CustomJob.FAMILY);
		while(!CustomJob.isIdle() && seconds<10) try{
			if (seconds==0) System.out.println("Waiting for jobs...");
			Thread.sleep(1000);
			seconds++;
		}catch(Exception e){}
	}

}