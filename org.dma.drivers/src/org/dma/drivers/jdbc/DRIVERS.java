/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.drivers.jdbc;

import org.h2.engine.Constants;

import org.dma.drivers.Activator;
import org.dma.java.util.SystemUtils.SystemProperty;
import org.dma.java.util.VersionNumber;

public enum DRIVERS {

	/*
	 * https://javadoc.io/static/com.h2database/h2/1.3.169/org/h2/constant/SysProperties.html#STORE_LOCAL_TIME
	 * System property h2.storeLocalTime (default: false)
	 * Store the local time. If disabled, the daylight saving offset is not taken into account.
	 */
	/** SystemProperty processed BEFORE driver is loaded! */
	H2 ("org.h2.Driver", new SystemProperty("h2.storeLocalTime", "true")),
	MySQL ("com.mysql.jdbc.Driver"),
	PostgreSQL ("org.postgresql.Driver"),
	SQLServer ("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	public static final VersionNumber H2_VERSION = new VersionNumber(
			Constants.VERSION_MAJOR, Constants.VERSION_MINOR, Constants.BUILD_ID);

	public final String name;
	public final Class klass;

	DRIVERS(String name, SystemProperty...prop) {
		this.name=name;
		this.klass=Activator.classForName(name);
	}

}