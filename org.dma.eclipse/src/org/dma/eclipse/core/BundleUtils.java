/*******************************************************************************
 * 2008-2019 Public Domain
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

	public static URL urlResolver(Bundle bundle, String relativePath) {

		return FileLocator.find(bundle, new Path(relativePath), null);

	}


	/** PATH resolver for FOLDER plugin */
	public static String pathResolver(Bundle bundle, String relativePath) {

		URL url=urlResolver(bundle, relativePath);
		if (url!=null) try{
			String pathname=FileLocator.resolve(url).getFile();
			//normalize path
			return new File(pathname).getCanonicalPath();
		}catch(IOException e){
		}return null;

	}


	/** @see BundleUtils#pathResolver(Bundle, String) */
	public static String pathResolver(String bundleName, String relativePath) {

		return pathResolver(Platform.getBundle(bundleName), relativePath);

	}


	/** @see BundleUtils#pathResolver(Bundle, String) */
	public static String pathResolver(Class klass, String relativePath) {

		return pathResolver(FrameworkUtil.getBundle(klass), relativePath);

	}


	/** PATH resolver for JAR plugin */
	public static String jarPathResolver(Bundle bundle, String relativePath) {

		URL url=urlResolver(bundle, relativePath);
		if (url!=null) try{
			String pathname=FileLocator.toFileURL(url).getFile();
			//normalize path
			return new File(pathname).getCanonicalPath();
		}catch(IOException e){
		}return null;

	}


	/** @see BundleUtils#jarPathResolver(Bundle, String) */
	public static String jarPathResolver(String bundleName, String relativePath) {

		return jarPathResolver(Platform.getBundle(bundleName), relativePath);

	}


	/** @see BundleUtils#jarPathResolver(Bundle, String) */
	public static String jarPathResolver(Class klass, String relativePath) {

		return jarPathResolver(FrameworkUtil.getBundle(klass), relativePath);

	}


}
