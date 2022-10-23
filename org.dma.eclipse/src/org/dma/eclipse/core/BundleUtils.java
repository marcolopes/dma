/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.core;

import java.io.IOException;
import java.net.URL;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.dma.java.io.CustomFile;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

public class BundleUtils {

	public static URL urlResolver(Bundle bundle, String relativePath) {

		return FileLocator.find(bundle, new Path(relativePath), null);

	}


	/** Bundle PATH resolver */
	public static String pathResolver(Bundle bundle, String relativePath) {

		try{return new CustomFile(FileLocator.getBundleFile(bundle), relativePath).toString();
		}catch(IOException e){
			e.printStackTrace();
		}return null;

		/*URL url=urlResolver(bundle, relativePath);
		if (url!=null) try{
			//does not work on exported JAR
			//FileLocator.resolve(url).getPath();
			String pathname=FileLocator.toFileURL(url).getPath();
			//normalize path
			return new File(pathname).getCanonicalPath();
		}catch(IOException e){
		}return null;*/

	}


	/** @see BundleUtils#pathResolver(Bundle, String) */
	public static String pathResolver(String bundleName, String relativePath) {

		return pathResolver(Platform.getBundle(bundleName), relativePath);

	}


	/** @see BundleUtils#pathResolver(Bundle, String) */
	public static String pathResolver(Class klass, String relativePath) {

		return pathResolver(FrameworkUtil.getBundle(klass), relativePath);

	}


}
