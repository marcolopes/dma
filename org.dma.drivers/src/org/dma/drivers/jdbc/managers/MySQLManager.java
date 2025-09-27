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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.mysql.jdbc.MySQLConnection;

import org.dma.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.Folder;

public class MySQLManager extends AbstractManager {

	public static MySQLConnection unwrap(Connection connection) throws SQLException {
		return connection.unwrap(MySQLConnection.class);
	}

	public MySQLManager(POOLMANAGERS pool) {
		super(pool);
	}

	@Override
	public String getName() {
		return "MySQL";
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties) {
		//jdbc:mysql://<host>:<port>/<database>
		return new StringBuilder("jdbc:mysql://").append(host).append("/").append(database).
				//URL?property=value[&property=value]
				append(properties.isEmpty() ? "" : "?"+properties).toString();
	}

	@Override
	public long getConnectionId(Connection connection) {
		try{return unwrap(connection).getId();
		}catch(Exception e){}
		return 0;
	}

	@Override
	public void closeConnection(Connection connection) throws SQLException {
		unwrap(connection).close();
	}

	/*
	 *  SQL updates
	 */
	@Override
	public void executeDropColumn(Connection connection, String tableName, String columnName) {
		try{super.executeDropColumn(connection, tableName, columnName);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void executeDropTable(Connection connection, String tableName) {
		try{super.executeDropTable(connection, tableName);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void executeAlterDataType(Connection connection, String tableName, String columnName, String dataType) {
		try{super.executeAlterDataType(connection, tableName, columnName, dataType);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	/*
	 *  SQL queries
	 */
	@Override
	public Collection<String> getForeignKeyNames(Connection connection, String tableName, String columnName) throws SQLException {
		Collection<String> col=new ArrayList();
		Statement st=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("SELECT CONSTRAINT_NAME from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_SCHEMA = SCHEMA() and TABLE_NAME = '"+tableName+"' and COLUMN_NAME = '"+columnName+"'");
		while(rs.next()) col.add(rs.getString("CONSTRAINT_NAME"));
		st.close();
		return col;
	}

	@Override
	public Collection<String> getIndexKeyNames(Connection connection, String tableName, String columnName) throws SQLException {
		Collection<String> col=new ArrayList();
		Statement st=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("SHOW INDEX FROM "+tableName+" WHERE COLUMN_NAME = '"+columnName+"'");
		while(rs.next()) col.add(rs.getString("Key_name"));
		st.close();
		return col;
	}

	/*
	 *  SQL statements
	 */
	@Override
	public String alterDataTypeSQL(String tableName, String columnName, String dataType) {
		//ALTER TABLE table MODIFY COLUMN column type
		return "ALTER TABLE "+tableName+" MODIFY COLUMN "+columnName+" "+dataType;
	}

	@Override
	public String dropForeignKeySQL(String tableName, String foreignKeyName) {
		//ALTER TABLE table DROP FOREIGN KEY foreignKey
		return "ALTER TABLE "+tableName+" DROP FOREIGN KEY "+foreignKeyName;
	}

	@Override
	public String dropIndexKeySQL(String tableName, String indexKeyName) {
		//ALTER TABLE table DROP INDEX indexKey
		return "ALTER TABLE "+tableName+" DROP INDEX "+indexKeyName;
	}

	@Override
	public String dropColumnSQL(String tableName, String columnName) {
		//ALTER TABLE table DROP COLUMN column
		return "ALTER TABLE "+tableName+" DROP COLUMN "+columnName;
	}

	@Override
	public String dropTableSQL(String tableName) {
		//DROP TABLE IF EXISTS table
		return "DROP TABLE IF EXISTS "+tableName;
	}

}