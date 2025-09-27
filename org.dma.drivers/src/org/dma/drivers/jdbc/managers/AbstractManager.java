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
import java.sql.Statement;

import org.dma.drivers.jdbc.BackupParameters;
import org.dma.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.Command;
import org.dma.java.io.CustomFile;
import org.dma.java.io.Folder;
import org.dma.java.io.ZipFile;
import org.dma.java.util.Debug;
import org.dma.java.util.TimeDateUtils;

public abstract class AbstractManager implements IDatabaseManager {

	protected final POOLMANAGERS pool;

	public AbstractManager(POOLMANAGERS pool) {
		this.pool=pool;
	}

	public String getUniqueId(String database) {
		//database_H2_2014-12-31_235959
		return database.concat("_").concat(getName()).concat("_").
				concat(TimeDateUtils.getDateFormatted("yyyy-MM-dd_HHmmss"));
	}

	@Override
	public File executeBackup(String host, String database, Folder folder, String username, String password, BackupParameters backup) throws Exception {
		String prefix=getUniqueId(database);
		CustomFile dump=new CustomFile(backup.folder, prefix+".sql");
		Debug.out("BACKUP DUMP: "+dump);
		executeBackup(backup.buildCommand(database, username, password, dump), password);
		//ZIP & delete dump
		ZipFile zip=new ZipFile(backup.folder, prefix+".zip");
		Debug.out("BACKUP ZIP: "+zip);
		zip.deflate(dump);
		dump.delete();
		return zip;
	}

	public void executeBackup(Command cmd, String password) throws Exception {
		Debug.out("BACKUP COMMAND: "+cmd);
		if (cmd.startAndWait()!=0) throw new Exception(cmd.toString());
	}

	/** Release the connection from the pool */
	@Deprecated
	public void releaseConnection(Connection connection) throws SQLException {
		closeConnection(connection); // If we close the native connection
		connection.close(); // It should then be released from the pool
	}

	@Override
	public Connection getConnection(String url, String username, String password) throws SQLException {
		Connection connection=pool.getConnection(url, username, password);
		Debug.out(pool.name(), getConnectionId(connection));
		return connection;
	}

	@Override
	public void checkConnection(String url, String username, String password) throws SQLException {
		pool.checkConnection(url, username, password);
	}

	@Override
	public void shutdown(String url, String username, String password) {
		pool.shutdown(url, username, password);
	}

	/*
	 *  SQL updates
	 */
	@Override
	public void executeAlterDataType(Connection connection, String tableName, String columnName, String dataType) throws SQLException {
		Debug.out("ALTERING DATA TYPE <"+tableName+":"+columnName+">");
		executeSQLUpdate(connection, alterDataTypeSQL(tableName, columnName, dataType));
	}

	@Override
	public void executeDropForeignKeys(Connection connection, String tableName, String columnName) throws SQLException {
		for(String foreignKeyName: getForeignKeyNames(connection, tableName, columnName)){
			Debug.out("DROPPING FOREIGN KEY <"+tableName+":"+foreignKeyName+">");
			executeSQLUpdate(connection, dropForeignKeySQL(tableName, foreignKeyName));
		}
	}

	@Override
	public void executeDropIndices(Connection connection, String tableName, String columnName) throws SQLException {
		for(String indexKeyName: getIndexKeyNames(connection, tableName, columnName)){
			Debug.out("DROPPING INDEX <"+tableName+":"+indexKeyName+">");
			executeSQLUpdate(connection, dropIndexKeySQL(tableName, indexKeyName));
		}
	}

	@Override
	public void executeDropColumn(Connection connection, String tableName, String columnName) throws SQLException {
		executeDropForeignKeys(connection, tableName, columnName);
		executeDropIndices(connection, tableName, columnName);
		Debug.out("DROPPING <"+tableName+":"+columnName+">");
		executeSQLUpdate(connection, dropColumnSQL(tableName, columnName));
	}

	@Override
	public void executeDropTable(Connection connection, String tableName) throws SQLException {
		Debug.out("DROPPING <"+tableName+">");
		executeSQLUpdate(connection, dropTableSQL(tableName));
	}

	@Override
	public int executeSQLUpdate(Connection connection, String sql) throws SQLException {
		int result=-1;
		try(Statement st=connection.createStatement()){
			result=st.executeUpdate(sql);
			connection.commit();
		}catch(SQLException e){
			connection.rollback();
			throw new SQLException(e);
		}return result;
	}

}