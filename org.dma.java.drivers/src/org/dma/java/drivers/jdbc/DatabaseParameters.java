/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.sql.Connection;
import java.util.Arrays;

import org.dma.java.util.CollectionUtils;
import org.dma.java.util.StringUtils;

public class DatabaseParameters extends DatabaseDrivers {

	public final DRIVERS driver;
	public final String host;
	public final String database;
	public final String properties;
	public final String user;
	public final String password;
	public final POOLMANAGERS pooling;
	public final BackupParameters backup;

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String user, String password, POOLMANAGERS pooling) {
		this(driver, host, database, null, user, password, pooling);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String properties, String user, String password, POOLMANAGERS pooling) {
		this(driver, host, database, properties, user, password, pooling, null);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String properties, String user, String password, POOLMANAGERS pooling,
			BackupParameters backup) {
		this.driver=driver;
		this.host=host==null ? "" : host;
		this.database=database==null ? "" : database;
		this.properties=properties==null ? "" : properties;
		this.user=user==null ? "" : user;
		this.password=password==null ? "" : password;
		this.pooling=pooling;
		this.backup=backup==null ? new BackupParameters() : backup;
	}

	public boolean isH2Embedded() {
		return driver.isH2Embedded(host);
	}

	public boolean isLocalhost() {
		return isLocalhost(host);
	}

	public void checkH2Lock() throws Exception {
		checkH2Lock(database);
	}

	public void executeBackup() throws Exception {
		driver.executeBackup(host, database, user, password, backup);
	}

	public String getConnectionUrl() {
		return driver.getConnectionUrl(host, database, properties, pooling);
	}

	public Connection getConnection() throws Exception {
		return getConnection(getConnectionUrl(), user, password, pooling);
	}

	public void checkConnection() throws Exception {
		checkConnection(getConnectionUrl(), user, password);
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