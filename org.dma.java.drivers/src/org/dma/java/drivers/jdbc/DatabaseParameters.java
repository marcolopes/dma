/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.sql.Connection;

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

	public boolean isLocalhost() {
		return DRIVERS.isLocalhost(host);
	}

	public void checkH2Lock() throws Exception {
		DRIVERS.checkH2Lock(database);
	}

	public boolean isH2Embedded() {
		return driver.isH2Embedded(host);
	}

	public String getConnectionUrl() {
		return driver.getConnectionUrl(host, database, properties, pool);
	}

	public Connection getConnection() throws Exception {
		return driver.getConnection(getConnectionUrl(), user, password, pool);
	}

	public void checkConnection() throws Exception {
		driver.checkConnection(getConnectionUrl(), user, password);
	}

	public void executeBackup() throws Exception {
		driver.executeBackup(host, database, user, password, backup);
	}


}