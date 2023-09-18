/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.drivers;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.Version;

import org.dma.drivers.jdbc.POOLMANAGERS;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	public static final Bundle PLUGIN_BUNDLE = FrameworkUtil.getBundle(Activator.class);

	public static final String PLUGIN_ID = PLUGIN_BUNDLE.getSymbolicName();

	public static final Version PLUGIN_VERSION = PLUGIN_BUNDLE.getVersion();

	public static final String PLUGIN_NAME = PLUGIN_ID+" "+new Version(
			PLUGIN_VERSION.getMajor(), PLUGIN_VERSION.getMinor(), PLUGIN_VERSION.getMicro());

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
		POOLMANAGERS.shutdown();
	}

	public static Class classForName(String className) {
		try{return Class.forName(className);
		}catch(ClassNotFoundException e){
			System.err.println(e);
		}return null;
	}

}
