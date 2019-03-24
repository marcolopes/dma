/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

public class BundleUtils {

	public static URL urlResolver(Bundle bundle, String fullPath) {

		return FileLocator.find(bundle, new Path(fullPath), null);

	}


	/** PATH resolver for FOLDER plugin */
	public static String pathResolver(Bundle bundle, String fullPath) {

		URL url=urlResolver(bundle, fullPath);
		if (url!=null){
			try{
				String pathname=FileLocator.resolve(url).getFile();
				//normalize path
				return new File(pathname).getCanonicalPath();
			}catch(IOException e){}
		}

		return null;

	}


	/** @see BundleUtils#pathResolver(Bundle, String) */
	public static String pathResolver(String bundleName, String fullPath) {

		return pathResolver(Platform.getBundle(bundleName), fullPath);

	}


	/** @see BundleUtils#pathResolver(Bundle, String) */
	public static String pathResolver(Class klass, String fullPath) {

		return pathResolver(FrameworkUtil.getBundle(klass), fullPath);

	}


	/** PATH resolver for JAR plugin */
	public static String jarPathResolver(Bundle bundle, String fullPath) {

		URL url=urlResolver(bundle, fullPath);
		if (url!=null){
			try{
				String path=FileLocator.toFileURL(url).getFile();
				//normalize path
				return new File(path).getCanonicalPath();
			}catch(IOException e){}
		}

		return null;

	}


	/** @see BundleUtils#jarPathResolver(Bundle, String) */
	public static String jarPathResolver(String bundleName, String fullPath) {

		return jarPathResolver(Platform.getBundle(bundleName), fullPath);

	}


	/** @see BundleUtils#jarPathResolver(Bundle, String) */
	public static String jarPathResolver(Class klass, String fullPath) {

		return jarPathResolver(FrameworkUtil.getBundle(klass), fullPath);

	}


}
