/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BundleUtils {

	/**
	 * PATH resolver for FOLDER plugin
	 */
	public static String pathResolver(Bundle bundle, String fullPath) {

		URL url=FileLocator.find(bundle, new Path(fullPath), null);
		if (url!=null){
			try{
				String path=FileLocator.resolve(url).getFile();
				//normalize path
				return new File(path).getAbsolutePath()+File.separator;
			}catch(IOException e){}
		}

		return null;

	}


	public static String pathResolver(String bundleName, String fullPath) {

		return pathResolver(Platform.getBundle(bundleName), fullPath);

	}


	public static String pathResolver(Class klass, String fullPath) {

		return pathResolver(FrameworkUtil.getBundle(klass), fullPath);

	}


	/**
	 * PATH resolver for JAR plugin
	 */
	public static String jarPathResolver(Bundle bundle, String fullPath) {

		URL url=FileLocator.find(bundle, new Path(fullPath), null);
		if (url!=null){
			try{
				String path=FileLocator.toFileURL(url).getFile();
				//normalize path
				return new File(path).getAbsolutePath()+File.separator;
			}catch(IOException e){}
		}

		return null;

	}


	public static String jarPathResolver(String bundleName, String fullPath) {

		return jarPathResolver(Platform.getBundle(bundleName), fullPath);

	}


	public static String jarPathResolver(Class cl, String fullPath) {

		return jarPathResolver(FrameworkUtil.getBundle(cl), fullPath);

	}


}
