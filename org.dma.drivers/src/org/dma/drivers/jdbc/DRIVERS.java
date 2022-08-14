/*******************************************************************************
 * 2008-2022 Public Domain
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
	 * https://javadocs.com/docs/com.h2database/h2/1.3.169/org/h2/constant/SysProperties.html#STORE_LOCAL_TIME
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