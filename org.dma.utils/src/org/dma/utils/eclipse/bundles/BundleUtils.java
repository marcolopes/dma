/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.bundles;

import java.io.File;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

public class BundleUtils {


	private static URI locateFile(Bundle bundle, String fullPath) {

		try {
			URL url = FileLocator.find(bundle, new Path(fullPath), null);
			if(url != null)
				return FileLocator.resolve(url).toURI();
				//return FileLocator.toFileURL(url).toURI();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}


	public static File fileResolver(Bundle bundle, String fullPath) {

		try {
			return new File(locateFile(bundle,fullPath));

		} catch (Exception e) {}

		return null;

	}


	public static String pathResolver(Bundle bundle, String fullPath) {

		try {
			return fileResolver(bundle,fullPath).getAbsolutePath();

		} catch (Exception e) {}

		return null;

	}


}
