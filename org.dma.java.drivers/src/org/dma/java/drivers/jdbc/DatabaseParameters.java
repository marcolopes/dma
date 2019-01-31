/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.sql.Connection;
import java.util.Arrays;

import org.dma.java.drivers.jdbc.DatabaseDrivers.DRIVERS;
import org.dma.java.drivers.jdbc.DatabaseDrivers.POOLMANAGERS;
import org.dma.java.util.CollectionUtils;
import org.dma.java.util.StringUtils;

public class DatabaseParameters {

	public final DRIVERS driver;
	public final String host;
	public final String database;
	public final String properties;
	public final String user;
	public final String password;
	public final POOLMANAGERS pool;
	public final BackupParameters backup;

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String user, String password, POOLMANAGERS pool) {
		this(driver, host, database, null, user, password, pool);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String properties, String user, String password, POOLMANAGERS pool) {
		this(driver, host, database, properties, user, password, pool, null);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String properties, String user, String password, POOLMANAGERS pool,
			BackupParameters backup) {
		this.driver=driver;
		this.host=host==null ? "" : host;
		this.database=database==null ? "" : database;
		this.properties=properties==null ? "" : properties;
		this.user=user==null ? "" : user;
		this.password=password==null ? "" : password;
		this.pool=pool;
		this.backup=backup==null ? new BackupParameters() : backup;
	}

	public boolean isH2Embedded() {
		return driver.isH2Embedded(host);
	}

	public boolean isLocalhost() {
		return DRIVERS.isLocalhost(host);
	}

	public void checkH2Lock() throws Exception {
		DRIVERS.checkH2Lock(database);
	}

	public void executeBackup() throws Exception {
		driver.executeBackup(host, database, user, password, backup);
	}

	public String getConnectionUrl() {
		return driver.getConnectionUrl(host, database, properties, pool);
	}

	public Connection getConnection() throws Exception {
		return DRIVERS.getConnection(getConnectionUrl(), user, password, pool);
	}

	public void checkConnection() throws Exception {
		DRIVERS.checkConnection(getConnectionUrl(), user, password);
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/** Returns DRIVER_HOST_DATABASE */
	@Override
	public String toString() {
		return CollectionUtils.concat(Arrays.asList(driver, host,
				StringUtils.normalize(database)), "_");
	}


}