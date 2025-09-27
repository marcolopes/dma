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

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.microsoft.sqlserver.jdbc.ISQLServerConnection;

import org.dma.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.Folder;

public class SQLServerManager extends AbstractManager {

	public static ISQLServerConnection unwrap(Connection connection) throws SQLException {
		return connection.unwrap(ISQLServerConnection.class);
	}

	public SQLServerManager(POOLMANAGERS pool) {
		super(pool);
	}

	@Override
	public String getName() {
		return "SQLServer";
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties) {
		//jdbc:sqlserver://[serverName[\instanceName][:portNumber]]
		return new StringBuilder("jdbc:sqlserver://").append(host).append(";databaseName=").append(database).
				//URL;property=value[;property=value]
				append(properties.isEmpty() ? "" : ";"+properties).
				append(";SelectMethod=cursor").toString();
	}

	@Override
	public long getConnectionId(Connection connection) {
		try{return unwrap(connection).getClientConnectionId().hashCode();
		}catch(Exception e){}
		return 0;
	}

	@Override
	public void closeConnection(Connection connection) throws SQLException {
		unwrap(connection).close();
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
	public String alterDataTypeSQL(String tableName, String columnName, String dataType) {
		throw new UnsupportedOperationException();
	}

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

}