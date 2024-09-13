/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
 * UTF-8 friendly ResourceBundle support
 *
 * Utility that allows having multi-byte characters inside java .property files.
 * It removes the need for Sun's native2ascii application, you can simply have
 * UTF-8 encoded editable .property files.
 *
 * Use:
 * ResourceBundle bundle=new UTF8ResourceBundle("baseName");
 *
 * @author Tomas Varaneckas <tomas.varaneckas@gmail.com>
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class UTF8ResourceBundle extends ResourceBundle {

	/** Bundle with unicode data */
	private final ResourceBundle bundle;

	/** Loads with getSystemClassLoader() */
	public UTF8ResourceBundle(String baseName) {
		this(baseName, Locale.getDefault(), ClassLoader.getSystemClassLoader());
	}

	/** @see ResourceBundle#getBundle(String, Locale, ClassLoader) */
	public UTF8ResourceBundle(String baseName, Locale locale, ClassLoader loader) {
		this(getBundle(baseName, locale, loader));
	}

	public UTF8ResourceBundle(ResourceBundle bundle) {
		this.bundle=bundle;
	}

	@Override
	protected Object handleGetObject(String key) {
		final String value=bundle.getString(key);
		return value==null ? null : new String(value.getBytes(CustomFile.ISO_CHARSET), CustomFile.UTF8_CHARSET);
	}

	@Override
	public Enumeration<String> getKeys() {
		return bundle.getKeys();
	}

}
