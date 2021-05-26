/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import org.h2.engine.Constants;
import org.h2.message.TraceSystem;
import org.h2.store.FileLock;
import org.h2.tools.DeleteDbFiles;
import org.h2.tools.RunScript;
import org.h2.tools.Script;

import org.dma.java.drivers.Activator;
import org.dma.java.io.Command;
import org.dma.java.io.CustomFile;
import org.dma.java.io.Folder;
import org.dma.java.io.ZipFile;
import org.dma.java.net.ServerParameters;
import org.dma.java.util.Debug;
import org.dma.java.util.StringUtils;
import org.dma.java.util.TimeDateUtils;
import org.dma.java.util.VersionNumber;

public enum DRIVERS {

	H2 ("org.h2.Driver",
			//https://javadocs.com/docs/com.h2database/h2/1.3.169/org/h2/constant/SysProperties.html#STORE_LOCAL_TIME
			new SystemProperty("h2.storeLocalTime", "true")),

	MySQL ("com.mysql.jdbc.Driver"),

	PostgreSQL ("org.postgresql.Driver"),

	@Deprecated
	SQLServer ("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	public static final VersionNumber H2_VERSION = new VersionNumber(
			Constants.VERSION_MAJOR, Constants.VERSION_MINOR, Constants.BUILD_ID);

	//processed BEFORE driver is loaded!
	private static class SystemProperty {
		public SystemProperty(String key, String value) {
			System.setProperty(key, value);
		}
	}

	public final String name;
	public final Class klass;

	DRIVERS(String name, SystemProperty...prop) {
		this.name=name;
		this.klass=Activator.classForName(name);
	}

	public boolean isH2Embedded(String host) {
		return this==H2 && new ServerParameters(host).isLocalhost();
	}

	public Connection getConnection(String url, String user, String password, POOLMANAGERS pool) throws SQLException {
		return pool.get(url, user, password).getConnection();
	}

	public Connection getConnection(String url, String user, String password) throws SQLException {
		return getConnection(url, user, password, POOLMANAGERS.NONE);
	}

	public void checkConnection(String url, String user, String password) throws SQLException {
		Debug.err("URL", url);
		Debug.err("USER", user);
		Debug.err("PASSWORD", password);
		getConnection(url, user, password).close();
	}

	private String getDatabaseUrl(String host, String database, Folder folder) {
		switch(this){
		case H2: return isH2Embedded(host) ?
				// jdbc:h2:[file:][<path>]<database>
				"jdbc:h2:file:" + new CustomFile(folder.getAbsolutePath(), database) :
				// jdbc:h2:tcp://<server>[:<port>]/[<path>]<database>
				"jdbc:h2:tcp://" + host + "/" + new CustomFile(folder.getAbsolutePath(), database);

		// jdbc:mysql://<host>:<port>/<database>
		case MySQL: return "jdbc:mysql://" + host + "/" + database;

		// jdbc:postgresql://<host>:<port>/<database>
		case PostgreSQL: return "jdbc:postgresql://" + host + "/" + database;

		// jdbc:sqlserver://[serverName[\instanceName][:portNumber]]
		case SQLServer: return "jdbc:sqlserver://" + host + ";databaseName="+database;
		}return null;
	}

	public String getConnectionUrl(String host, String database, Folder folder, String properties, POOLMANAGERS pool) {
		StringBuilder url=new StringBuilder(getDatabaseUrl(host, database, folder));
		switch(this){
		case H2:
			if (isH2Embedded(host)){
				//Multiple processes can access the same database
				if (new ServerParameters(host).isLocalhost()) url.append(";AUTO_SERVER=TRUE");
			}else{
				//URL;property=value[;property=value]
				url.append(properties.isEmpty() ? "" : ";"+properties);
				//The connection only succeeds when the database already exists
				url.append(";IFEXISTS=TRUE");
			}//needed when there is NO POOL
			if (pool==POOLMANAGERS.NONE) url.append(";DB_CLOSE_DELAY=10"); break;

		case MySQL:
			//URL?property=value[&property=value]
			url.append(properties.isEmpty() ? "" : "?"+properties); break;

		case PostgreSQL:
			//URL?property=value[&property=value]
			url.append(properties.isEmpty() ? "" : "?"+properties); break;

		case SQLServer:
			//URL;property=value[;property=value]
			url.append(properties.isEmpty() ? "" : ";"+properties);
			url.append(";SelectMethod=cursor"); break;
		}return url.toString();
	}

	/** Only for H2 database */
	public void compact(String host, String database, Folder folder, String user, String password) throws Exception {
		String url=getDatabaseUrl(host, database, folder);
		//SQL script file
		File file=new CustomFile(Folder.temporary().getAbsolutePath(), database+".sql");
		//Backup the database to the SQL script file
		Script.execute(url, user, password, file.getAbsolutePath());
		//Delete the database file
		DeleteDbFiles.execute(folder.getAbsolutePath(), database, true);
		//Recreate the database from the SQL script file
		RunScript.execute(url, user, password, file.getAbsolutePath(), null, false);
		//Delete the SQL script file
		file.delete();
	}

	private void executeBackup(Command cmd, String password) throws Exception {
		switch(this){
		case H2:
		case MySQL:
		case SQLServer: break;
		//http://www.postgresql.org/docs/8.1/static/libpq-envars.html
		case PostgreSQL: cmd.setVariable("PGPASSWORD", password); break;
		}//execute command
		Debug.out("BACKUP COMMAND: "+cmd);
		if (cmd.startAndWait()!=0) throw new Exception(cmd.toString());
	}

	private void executeH2Backup(String database, Folder folder, ZipFile zip) throws Exception {
		File file=new CustomFile(folder.getAbsolutePath(), database+Constants.SUFFIX_PAGE_FILE);
		Debug.out("DATABASE FILE: "+file);
		//NOT empty?
		if (file.length()>0){
			//locked?
			checkH2Lock(database);
			//ZIP file
			new ZipFile(zip).deflate(file);
		}
	}

	public void executeBackup(String host, String database, Folder folder, String user, String password, BackupParameters backup) throws Exception {
		//colibri9_H2_2014-12-31_125959
		String prefix=new File(database).getName()+"_"+name()+"_"+TimeDateUtils.getDateFormatted("yyyy-MM-dd_HHmmss");
		//[folder]/[prefix].zip
		ZipFile zip=new ZipFile(backup.folder, prefix+".zip");
		Debug.out("BACKUP ZIP: "+zip);
		//H2 Embedded
		if (isH2Embedded(host)){
			/*
			 * H2 Driver v1.3.169
			 * Backup.execute does not work with eclipse exported product on MAC!
			 * https://groups.google.com/forum/#!topic/h2-database/AT7OpOkQfZ4
			 * File db=new File(database).getAbsoluteFile();
			 * Backup.execute(dump.toString(), db.getParent(), db.getName(), false);
			 */
			executeH2Backup(database, folder, zip);
		}else{
			//H2, MySQL, PostgreSQL
			CustomFile dump=new CustomFile(backup.folder, prefix+".sql");
			Debug.out("BACKUP DUMP: "+dump);
			switch(this){
			case H2: executeBackup(backup.buildCommand(getDatabaseUrl(host, database, folder), user, password, dump), password); break;
			case MySQL:
			case PostgreSQL:
			case SQLServer: executeBackup(backup.buildCommand(database, user, password, dump), password); break;
			}
			//ZIP dump
			zip.deflate(dump);
			//delete dump
			dump.delete();
		}
	}

	public String getDropForeignKeySQL(String tableName, String foreignKeyName) {
		switch(this){
		case H2: throw new UnsupportedOperationException();
		//ALTER TABLE table DROP FOREIGN KEY foreignKey
		case MySQL: return "ALTER TABLE "+tableName.toUpperCase()+" DROP FOREIGN KEY "+foreignKeyName;
		case PostgreSQL: throw new UnsupportedOperationException();
		case SQLServer: throw new UnsupportedOperationException();
		}return null;
	}

	public String getDropIndexKeySQL(String tableName, String indexKeyName) {
		switch(this){
		case H2: throw new UnsupportedOperationException();
		//ALTER TABLE table DROP INDEX indexKey
		case MySQL: return "ALTER TABLE `" + tableName.toUpperCase() + "` DROP INDEX `" + indexKeyName + "`";
		case PostgreSQL: throw new UnsupportedOperationException();
		case SQLServer: throw new UnsupportedOperationException();
		}return null;
	}

	public String getDropColumnSQL(String tableName, String columnName) {
		switch(this){
		//ALTER TABLE table DROP COLUMN IF EXISTS column
		case H2: return "ALTER TABLE "+tableName.toUpperCase()+" DROP COLUMN IF EXISTS "+columnName.toUpperCase();
		//ALTER TABLE table DROP COLUMN column
		case MySQL: return "ALTER TABLE "+tableName.toUpperCase()+" DROP COLUMN "+columnName.toUpperCase();
		//ALTER TABLE "table" DROP COLUMN IF EXISTS "column"
		case PostgreSQL: return "ALTER TABLE "+StringUtils.quote(tableName.toUpperCase())+" "+"DROP COLUMN IF EXISTS "+StringUtils.quote(columnName.toUpperCase());
		//ALTER TABLE table DROP COLUMN column
		case SQLServer: return "ALTER TABLE "+tableName.toUpperCase()+" DROP COLUMN "+columnName.toUpperCase();
		}return null;
	}

	public String getDropTableSQL(String tableName) {
		switch(this){
		case H2:
		//DROP TABLE IF EXISTS table
		case MySQL: return "DROP TABLE IF EXISTS "+tableName.toUpperCase();
		//DROP TABLE IF EXISTS "table"
		case PostgreSQL: return "DROP TABLE IF EXISTS "+StringUtils.quote(tableName.toUpperCase());
		//DROP TABLE table
		case SQLServer: return "DROP TABLE "+tableName.toUpperCase();
		}return null;
	}

	public Collection<String> getForeignKeyNames(Connection connection, String tableName, String columnName) throws SQLException {
		Collection<String> col=new ArrayList();
		switch(this){
		case H2: break;
		case MySQL:
			Statement st=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("SELECT CONSTRAINT_NAME from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_SCHEMA = SCHEMA() and TABLE_NAME = '"+tableName.toUpperCase()+"' and COLUMN_NAME = '"+columnName.toUpperCase()+"'");
			while(rs.next()) col.add(rs.getString("CONSTRAINT_NAME"));
			st.close();
			break;
		case PostgreSQL: break;
		case SQLServer: break;
		}return col;
	}

	public Collection<String> getIndexKeyNames(Connection connection, String tableName, String columnName) throws SQLException {
		Collection<String> col=new ArrayList();
		switch(this){
		case H2: break;
		case MySQL:
			Statement st=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("SHOW INDEX FROM '"+tableName.toUpperCase()+"' where COLUMN_NAME = '"+columnName.toUpperCase()+"'");
			while(rs.next()) col.add(rs.getString("Key_name"));
			st.close();
			break;
		case PostgreSQL: break;
		case SQLServer: break;
		}return col;
	}

	public void executeSQLUpdate(Connection connection, String sql) throws SQLException {
		try{
			Statement st=connection.createStatement();
			try{
				st.executeUpdate(sql);
			}catch(SQLTimeoutException e){
				System.out.println(e);
			}finally{
				st.close();
			}connection.commit();
		}catch(SQLException e){
			connection.rollback();
			throw new SQLException(e);
		}
	}

	public void executeDropColumn(Connection connection, String tableName, String columnName) throws SQLException {
		for(String foreignKeyName: getForeignKeyNames(connection, tableName, columnName)){
			Debug.out("DROPPING <"+tableName+":"+foreignKeyName+">");
			executeSQLUpdate(connection, getDropForeignKeySQL(tableName, foreignKeyName));
		}
		for(String indexKeyName: getIndexKeyNames(connection, tableName, columnName)){
			Debug.out("DROPPING <"+tableName+":"+indexKeyName+">");
			executeSQLUpdate(connection, getDropIndexKeySQL(tableName, indexKeyName));
		}
		Debug.out("DROPPING <"+tableName+":"+columnName+">");
		executeSQLUpdate(connection, getDropColumnSQL(tableName, columnName));
	}

	public void executeDropTable(Connection connection, String tableName) throws SQLException {
		Debug.out("DROPPING <"+tableName+">");
		executeSQLUpdate(connection, getDropTableSQL(tableName));
	}

	public static void checkH2Lock(String database) throws Exception {
		String filename=database+Constants.SUFFIX_LOCK_FILE;
		Debug.out("DATABASE LOCK: "+filename);
		try{//catch RuntimeException
			FileLock lock=new FileLock(new TraceSystem(null), filename, 0);
			lock.lock(FileLock.LOCK_FILE);
			lock.unlock();
		}catch(Exception e){
			throw new Exception(e);
		}
	}

}