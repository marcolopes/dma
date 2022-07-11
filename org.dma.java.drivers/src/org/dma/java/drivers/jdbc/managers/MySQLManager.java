/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc.managers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import org.dma.java.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.Folder;

public class MySQLManager extends AbstractManager implements IDatabaseManager {

	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";

	@Override
	public String getName() {
		return "MySQL";
	}

	@Override
	public String getDriverName() {
		return DRIVER_NAME;
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties, POOLMANAGERS pool) {
		//URL?property=value[&property=value]
		return new StringBuilder(getDatabaseUrl(host, database, folder)).
				append(properties.isEmpty() ? "" : "?"+properties).toString();
	}

	private String getDatabaseUrl(String host, String database, Folder folder) {
		//jdbc:mysql://<host>:<port>/<database>
		return new StringBuilder("jdbc:mysql://").append(host).append("/").append(database).toString();
	}

	@Override
	public Connection getConnection(String url, String username, String password, POOLMANAGERS pool) throws SQLException {
		return pool.get(url, username, password).getConnection();
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

	@Override
	public String alterDataTypeSQL(String tableName, String columnName, String dataType) {
		//ALTER TABLE table MODIFY COLUMN column type
		return "ALTER TABLE "+tableName+" MODIFY COLUMN "+columnName+" "+dataType;
	}

}