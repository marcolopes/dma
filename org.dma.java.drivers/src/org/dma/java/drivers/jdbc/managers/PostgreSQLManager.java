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
import org.dma.java.io.Command;
import org.dma.java.io.Folder;
import org.dma.java.util.StringUtils;

public class PostgreSQLManager extends AbstractManager implements IDatabaseManager {

	public static final String DRIVER_NAME = "org.postgresql.Driver";

	@Override
	public String getName() {
		return "PostgreSQL";
	}

	@Override
	public String getDriverName() {
		return DRIVER_NAME;
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {}

	@Override
	public void executeBackup(Command cmd, String password) throws Exception {
		//http://www.postgresql.org/docs/8.1/static/libpq-envars.html
		cmd.setVariable("PGPASSWORD", password);
		super.executeBackup(cmd, password);
	}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties, POOLMANAGERS pool) {
		//URL?property=value[&property=value]
		return new StringBuilder(getDatabaseUrl(host, database, folder)).
				append(properties.isEmpty() ? "" : "?"+properties).toString();
	}

	private String getDatabaseUrl(String host, String database, Folder folder) {
		//jdbc:postgresql://<host>:<port>/<database>
		return new StringBuilder("jdbc:postgresql://").append(host).append("/").append(database).toString();
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
		//ALTER TABLE "table" DROP COLUMN IF EXISTS "column"
		return "ALTER TABLE "+StringUtils.quote(tableName)+" DROP COLUMN IF EXISTS "+StringUtils.quote(columnName);
	}

	@Override
	public String dropTableSQL(String tableName) {
		//DROP TABLE IF EXISTS "table"
		return "DROP TABLE IF EXISTS "+StringUtils.quote(tableName);
	}

	@Override
	public String alterDataTypeSQL(String tableName, String columnName, String dataType) {
		//ALTER TABLE "table" ALTER COLUMN "column" TYPE type
		return "ALTER TABLE "+StringUtils.quote(tableName)+" ALTER COLUMN "+StringUtils.quote(columnName)+" TYPE "+dataType;
	}

}