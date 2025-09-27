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
package org.dma.drivers.jdbc.managers;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

import org.dma.drivers.jdbc.BackupParameters;
import org.dma.java.io.Folder;

public interface IDatabaseManager {

	/** Simple name */
	public String getName();

	/** Only for H2 database */
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception;

	public File executeBackup(String host, String database, Folder folder, String username, String password, BackupParameters backup) throws Exception;

	public String getConnectionUrl(String host, String database, Folder folder, String properties);

	/** Should NOT be used to check the connection! */
	public Connection getConnection(String url, String username, String password) throws SQLException;

	/** Checks conectivity through the pool */
	public void checkConnection(String url, String username, String password) throws SQLException;

	/** Shuts down the pool manager */
	public void shutdown(String url, String username, String password) throws SQLException;

	/** Returns the native connection ID */
	public long getConnectionId(Connection connection);

	/** Closes the native connection */
	public void closeConnection(Connection connection) throws SQLException;

	/*
	 *  SQL updates
	 */
	public void executeAlterDataType(Connection connection, String tableName, String columnName, String dataType) throws SQLException;

	public void executeDropForeignKeys(Connection connection, String tableName, String columnName) throws SQLException;

	public void executeDropIndices(Connection connection, String tableName, String columnName) throws SQLException;

	public void executeDropColumn(Connection connection, String tableName, String columnName) throws SQLException;

	public void executeDropTable(Connection connection, String tableName) throws SQLException;

	public int executeSQLUpdate(Connection connection, String sql) throws SQLException;

	/*
	 *  SQL queries
	 */
	public Collection<String> getForeignKeyNames(Connection connection, String tableName, String columnName) throws SQLException;

	public Collection<String> getIndexKeyNames(Connection connection, String tableName, String columnName) throws SQLException;

	/*
	 *  SQL statements
	 */
	public String alterDataTypeSQL(String tableName, String columnName, String dataType);

	public String dropForeignKeySQL(String tableName, String foreignKeyName);

	public String dropIndexKeySQL(String tableName, String indexKeyName);

	/** IF EXISTS is not supported by MySQL and SQLServer */
	public String dropColumnSQL(String tableName, String columnName);

	/** IF EXISTS is not supported by SQLServer */
	public String dropTableSQL(String tableName);


}