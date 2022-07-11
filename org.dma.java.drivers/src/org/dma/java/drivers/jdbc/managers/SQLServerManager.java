/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc.managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import org.dma.java.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.Folder;

public class SQLServerManager extends AbstractManager implements IDatabaseManager {

	public static final String DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	@Override
	public String getName() {
		return "SQLServer";
	}

	@Override
	public String getDriverName() {
		return DRIVER_NAME;
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties, POOLMANAGERS pool) {
		//URL;property=value[;property=value]
		return new StringBuilder(getDatabaseUrl(host, database, folder)).
				append(properties.isEmpty() ? "" : ";"+properties).
				append(";SelectMethod=cursor").toString();
	}

	private String getDatabaseUrl(String host, String database, Folder folder) {
		// jdbc:sqlserver://[serverName[\instanceName][:portNumber]]
		return new StringBuilder("jdbc:sqlserver://").append(host).append(";databaseName=").append(database).toString();
	}

	@Override
	public Connection getConnection(String url, String username, String password, POOLMANAGERS pool) throws SQLException {
		return pool.get(url, username, password).getConnection();
	}

	/*
	 *  SQL queries
	 */
	@Override
	public Collection<String> getForeignKeyNames(Connection connection, String tableName, String columnName) {
		return new ArrayList();
	}

	@Override
	public Collection<String> getIndexKeyNames(Connection connection, String tableName, String columnName) {
		return new ArrayList();
	}

	/*
	 *  SQL statements
	 */
	@Override
	public String dropForeignKeySQL(String tableName, String foreignKeyName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String dropIndexKeySQL(String tableName, String indexKeyName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String dropColumnSQL(String tableName, String columnName) {
		//ALTER TABLE table DROP COLUMN column
		return "ALTER TABLE "+tableName+" DROP COLUMN "+columnName;
	}

	@Override
	public String dropTableSQL(String tableName) {
		//DROP TABLE table
		return "DROP TABLE "+tableName;
	}

	@Override
	public String alterDataTypeSQL(String tableName, String columnName, String dataType) {
		throw new UnsupportedOperationException();
	}

}