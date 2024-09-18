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
package org.dma.drivers.jdbc;

import org.h2.engine.Constants;

import org.dma.drivers.Activator;
import org.dma.drivers.jdbc.managers.H2Manager;
import org.dma.drivers.jdbc.managers.IDatabaseManager;
import org.dma.drivers.jdbc.managers.MySQLManager;
import org.dma.drivers.jdbc.managers.PostgreSQLManager;
import org.dma.drivers.jdbc.managers.SQLServerManager;
import org.dma.java.util.VersionNumber;

public enum DRIVERS {

	/*
	 * https://javadoc.io/static/com.h2database/h2/1.3.169/org/h2/constant/SysProperties.html#STORE_LOCAL_TIME
	 * System property h2.storeLocalTime (default: false)
	 * Store the local time. If disabled, the daylight saving offset is not taken into account.
	 */
	H2 (new H2Manager(), new SystemProperty("h2.storeLocalTime", "true")),

	MySQL (new MySQLManager()),

	PostgreSQL (new PostgreSQLManager()),

	SQLServer (new SQLServerManager());

	public static final VersionNumber H2_VERSION = new VersionNumber(
			Constants.VERSION_MAJOR, Constants.VERSION_MINOR, Constants.BUILD_ID);

	//processed BEFORE driver is loaded!
	private static class SystemProperty {
		public SystemProperty(String key, String value) {
			System.setProperty(key, value);
		}
	}

	public final IDatabaseManager manager;
	public final String name;
	public final Class klass;

	DRIVERS(IDatabaseManager manager, SystemProperty...prop) {
		this.manager=manager;
		this.name=manager.getDriverName();
		this.klass=Activator.classForName(name);
	}

}