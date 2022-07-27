/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc.managers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

import org.dma.java.drivers.jdbc.BackupParameters;
import org.dma.java.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.Folder;

public interface IDatabaseManager {

	/** Simple name */
	public String getName();

	/** Driver class name */
	public String getDriverName();

	public boolean isH2Embedded(String host);

	/** Only for H2 database */
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception;

	public void executeBackup(String host, String database, Folder folder, String username, String password, BackupParameters backup) throws Exception;

	public String getConnectionUrl(String host, String database, Folder folder, String properties, POOLMANAGERS pool);

	/** Should NOT be used to check the connection! */
	public Connection getConnection(String url, String username, String password, POOLMANAGERS pool) throws SQLException;

	public void checkConnection(String url, String username, String password) throws SQLException;

	/*
	 *  SQL updates
	 */
	public void executeAlterDataType(Connection connection, String tableName, String columnName, String dataType) throws SQLException;

	public void executeDropForeignKeys(Connection connection, String tableName, String columnName) throws SQLException;

	public void executeDropIndices(Connection connection, String tableName, String columnName) throws SQLException ;

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