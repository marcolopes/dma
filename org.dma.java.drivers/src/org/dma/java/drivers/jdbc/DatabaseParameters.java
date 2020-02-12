/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.io.File;
import java.sql.Connection;

import org.dma.java.util.Debug;

public class DatabaseParameters {

	public final DRIVERS driver;
	public final String host;
	public final String database;
	public final String folder;
	public final String properties;
	public final String user;
	public final String password;
	public final POOLMANAGERS pool;
	public final BackupParameters backup;

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String user, String password, POOLMANAGERS pool) {
		this(driver, host, database, "", user, password, pool);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database,
			String properties, String user, String password, POOLMANAGERS pool) {
		this(driver, host, database, null, properties, user, password, pool);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database, File folder,
			String properties, String user, String password, POOLMANAGERS pool) {
		this(driver, host, database, folder, properties, user, password, pool, new BackupParameters());
	}

	/**
	 * @param driver - database driver {@link DRIVERS}
	 * @param host - connetion host; EMPTY=H2 Embedded mode
	 * @param database - database name
	 * @param folder - folder for H2 databases; NULL=no folder
	 * @param properties - connection properties; USUALLY property=value&property=value...
	 * @param user - database username
	 * @param password - database password
	 * @param pool - poolmanager {@link POOLMANAGERS}
	 * @param backup - backup parameters
	 */
	public DatabaseParameters(DRIVERS driver, String host, String database, File folder,
			String properties, String user, String password, POOLMANAGERS pool,
			BackupParameters backup) {
		this.driver=driver;
		this.host=host.isEmpty() ? "localhost" : host;
		this.database=database;
		Debug.err("database", this.database);
		this.folder=folder==null ? "" : folder.getAbsolutePath()+File.separator;
		Debug.err("folder", this.folder);
		this.properties=properties;
		this.user=user;
		this.password=password;
		this.pool=pool;
		this.backup=backup;
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
		return driver.getConnectionUrl(host, database, folder, properties, pool);
	}

	public Connection getConnection() throws Exception {
		return driver.getConnection(getConnectionUrl(), user, password, pool);
	}

	public void checkConnection() throws Exception {
		driver.checkConnection(getConnectionUrl(), user, password);
	}

	public void executeBackup() throws Exception {
		driver.executeBackup(host, database, folder, user, password, backup);
	}

	@Override
	public String toString() {
		return getConnectionUrl();
	}


}