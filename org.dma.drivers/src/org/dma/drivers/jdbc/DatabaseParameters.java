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

import java.io.File;
import java.sql.Connection;
import java.util.EnumMap;

import org.dma.drivers.jdbc.managers.H2Manager;
import org.dma.drivers.jdbc.managers.IDatabaseManager;
import org.dma.drivers.jdbc.managers.MySQLManager;
import org.dma.drivers.jdbc.managers.PostgreSQLManager;
import org.dma.drivers.jdbc.managers.SQLServerManager;
import org.dma.java.io.Folder;
import org.dma.java.net.HttpServerHandler;
import org.dma.java.net.URLHandler.LOCALHOST;

public class DatabaseParameters extends EnumMap<POOLMANAGERS, IDatabaseManager> {

	private static final long serialVersionUID = 1L;

	private IDatabaseManager get(POOLMANAGERS pool) {
		IDatabaseManager manager=super.get(pool);
		if (manager==null) put(pool, manager=create(pool));
		return manager;
	}

	private IDatabaseManager create(POOLMANAGERS pool) {
		switch(driver){
		case H2: return new H2Manager(pool);
		case MySQL: return new MySQLManager(pool);
		case PostgreSQL: return new PostgreSQLManager(pool);
		case SQLServer: return new SQLServerManager(pool);
		}return null;
	}

	public final DRIVERS driver;
	public final String host;
	public final String database;
	public final Folder folder;
	public final String properties;
	public final String username;
	public final String password;
	public final POOLMANAGERS pool;
	public final BackupParameters backup;
	public final String connectionUrl;

	/** H2 Embedded */
	public DatabaseParameters(String database, Folder folder, String username, String password, POOLMANAGERS pool) {
		this(database, folder, "", username, password, pool);
	}

	/** H2 Embedded */
	public DatabaseParameters(String database, Folder folder, String properties, String username, String password, POOLMANAGERS pool) {
		this(DRIVERS.H2, "", database, folder, properties, username, password, pool);
	}

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
	 * @param driver Database driver {@link DRIVERS}
	 * @param host Connetion host (EMPTY=H2 Embedded mode)
	 * @param database Database name
	 * @param folder Database folder (ex: H2; NULL=current folder)
	 * @param properties Connection properties (USUALLY property=value&property=value...)
	 * @param username Database username
	 * @param password Database password
	 * @param pool Poolmanager {@link POOLMANAGERS}
	 * @param backup Backup parameters
	 */
	public DatabaseParameters(DRIVERS driver, String host, String database, Folder folder, String properties, String username, String password, POOLMANAGERS pool, BackupParameters backup) {
		super(POOLMANAGERS.class);

		this.driver=driver;
		this.host=host.isEmpty() ? LOCALHOST.NAME.value : host;
		this.database=database;
		this.folder=folder==null ? Folder.current() : folder;
		this.properties=properties;
		this.username=username;
		this.password=password;
		this.pool=pool;
		this.backup=backup;
		this.connectionUrl=getConnectionUrl();
	}

	private String getConnectionUrl() {
		return getManager().getConnectionUrl(host, database, folder, properties);
	}

	public IDatabaseManager getManager() {
		return get(pool);
	}

	public boolean isLocalhost() {
		return new HttpServerHandler(host).isLocalhost();
	}

	public boolean isH2Embedded() {
		return driver==DRIVERS.H2 && H2Manager.isEmbedded(host);
	}

	public void compact() throws Exception {
		getManager().compact(host, database, folder, username, password);
	}

	public File executeBackup() throws Exception {
		return getManager().executeBackup(host, database, folder, username, password, backup);
	}

	public Connection getConnection() throws Exception {
		return getManager().getConnection(connectionUrl, username, password);
	}

	public void checkConnection() throws Exception {
		//NATIVE driver (exceptions consistency)
		get(POOLMANAGERS.NONE).checkConnection(connectionUrl, username, password);
	}

	public void shutdown() throws Exception {
		getManager().shutdown(connectionUrl, username, password);
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return connectionUrl;
	}

	@Override
	public int hashCode() {
		return connectionUrl.hashCode()+
				username.hashCode()+
				password.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}

}