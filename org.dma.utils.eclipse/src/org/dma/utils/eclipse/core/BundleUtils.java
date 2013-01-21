/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BundleUtils {

	public static String pathResolver(Bundle bundle, String fullPath) {

		URL url=FileLocator.find(bundle, new Path(fullPath), null);
		if (url!=null){
			try{
				return FileLocator.resolve(url).getFile(); // FOLDER PLUGIN
			}catch(IOException e){}
		}

		return null;

	}


	public static String pathResolver(String bundleName, String fullPath) {

		return pathResolver(Platform.getBundle(bundleName), fullPath);

	}


	public static String pathResolver(Class cl, String fullPath) {

		return pathResolver(FrameworkUtil.getBundle(cl), fullPath);

	}


	public static String jarPathResolver(Bundle bundle, String fullPath) {

		URL url=FileLocator.find(bundle, new Path(fullPath), null);
		if (url!=null){
			try{
				return FileLocator.toFileURL(url).getFile(); // JAR PLUGIN
			}catch(IOException e){}
		}

		return null;

	}


	public static String jarPathResolver(String bundleName, String fullPath) {

		return jarPathResolver(Platform.getBundle(bundleName), fullPath);

	}


}
