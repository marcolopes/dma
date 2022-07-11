/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.sql.Connection;

import org.dma.java.io.Folder;
import org.dma.java.net.ServerParameters;

public class DatabaseParameters {

	public final DRIVERS driver;
	public final String host;
	public final String database;
	public final Folder folder;
	public final String properties;
	public final String username;
	public final String password;
	public final POOLMANAGERS pool;
	public final BackupParameters backup;

	public DatabaseParameters(DRIVERS driver, String host, String database, String username, String password, POOLMANAGERS pool) {
		this(driver, host, database, "", username, password, pool);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database, String properties, String username, String password, POOLMANAGERS pool) {
		this(driver, host, database, null, properties, username, password, pool);
	}

	public DatabaseParameters(DRIVERS driver, String host, String database, Folder folder, String properties, String username, String password, POOLMANAGERS pool) {
		this(driver, host, database, folder, properties, username, password, pool, new BackupParameters());
	}

	/**
	 * @param driver - database driver {@link DRIVERS}
	 * @param host - connetion host; EMPTY=H2 Embedded mode
	 * @param database - database name
	 * @param folder - database folder (ex: H2); NULL=current folder
	 * @param properties - connection properties; USUALLY property=value&property=value...
	 * @param username - database username
	 * @param password - database password
	 * @param pool - poolmanager {@link POOLMANAGERS}
	 * @param backup - backup parameters
	 */
	public DatabaseParameters(DRIVERS driver, String host, String database, Folder folder,
			String properties, String username, String password, POOLMANAGERS pool, BackupParameters backup) {
		this.driver=driver;
		this.host=host.isEmpty() ? ServerParameters.LOCALHOST : host;
		this.database=database;
		this.folder=folder==null ? Folder.current() : folder;
		this.properties=properties;
		this.username=username;
		this.password=password;
		this.pool=pool;
		this.backup=backup;
	}

	public boolean isLocalhost() {
		return new ServerParameters(host).isLocalhost();
	}

	public boolean isH2Embedded() {
		return driver.manager.isH2Embedded(host);
	}

	public void compact() throws Exception {
		driver.manager.compact(host, database, folder, username, password);
	}

	public void executeBackup() throws Exception {
		driver.manager.executeBackup(host, database, folder, username, password, backup);
	}

	public String getConnectionUrl() {
		return driver.manager.getConnectionUrl(host, database, folder, properties, pool);
	}

	public void checkConnection() throws Exception {
		driver.manager.checkConnection(getConnectionUrl(), username, password);
	}

	public Connection getConnection() throws Exception {
		return driver.manager.getConnection(getConnectionUrl(), username, password, pool);
	}

	@Override
	public String toString() {
		return getConnectionUrl();
	}

}