/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.dma.java.drivers.Activator;
import org.dma.java.io.Command;
import org.dma.java.io.FileParameters;
import org.dma.java.io.ZipFileHandler;
import org.dma.java.util.Debug;
import org.dma.java.util.StringUtils;
import org.dma.java.util.TimeDateUtils;
import org.dma.java.util.VersionNumber;
import org.h2.engine.Constants;
import org.h2.message.TraceSystem;
import org.h2.store.FileLock;
import org.h2.tools.DeleteDbFiles;
import org.h2.tools.RunScript;
import org.h2.tools.Script;

public enum DRIVERS {

	H2 ("org.h2.Driver",
			//TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
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

	public static boolean isLocalhost(String host) {
		return host.startsWith("localhost") || host.startsWith("127.0.0.1");
	}

	public static void checkH2Lock(String database) throws Exception {
		String filename=database+Constants.SUFFIX_LOCK_FILE;
		System.out.println("DATABASE LOCK: "+filename);
		try{
			FileLock lock=new FileLock(new TraceSystem(null), filename, 0);
			lock.lock(FileLock.LOCK_FILE);
			lock.unlock();

		}catch(Exception e){
			throw new Exception(e);
		}
	}

	public final String name;
	public final Class klass;

	DRIVERS(String name, SystemProperty...prop) {
		this.name=name;
		this.klass=Activator.classForName(name);
	}

	public boolean isH2Embedded(String host) {
		return this==H2 && (host.isEmpty() || isLocalhost(host));
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

	private String getDatabaseUrl(String host, String database) {
		switch(this){
		case H2: return isH2Embedded(host) ?
				// jdbc:h2:[file:][<path>]<database>
				"jdbc:h2:file:" + database :
				// jdbc:h2:tcp://<server>[:<port>]/[<path>]<database>
				"jdbc:h2:tcp://" + host + "/" + database;

		// jdbc:mysql://<host>:<port>/<database>
		case MySQL: return "jdbc:mysql://" + host + "/" + database;

		// jdbc:postgresql://<host>:<port>/<database>
		case PostgreSQL: return "jdbc:postgresql://" + host + "/" + database;

		// jdbc:sqlserver://[serverName[\instanceName][:portNumber]]
		case SQLServer: return "jdbc:sqlserver://" + host + ";databaseName="+database;
		}
		return null;
	}

	public String getConnectionUrl(String host, String database, String properties, POOLMANAGERS pool) {
		StringBuilder url=new StringBuilder(getDatabaseUrl(host, database));
		switch(this){
		case H2:
			if (isH2Embedded(host)){
				//Multiple processes can access the same database
				if (isLocalhost(host)) url.append(";AUTO_SERVER=TRUE");
			}else{
				//URL;property=value;property=value...
				url.append(properties.isEmpty() ? "" : ";"+properties);
				//The connection only succeeds when the database already exists
				url.append(";IFEXISTS=TRUE");
			}
			//needed when there is NO POOL
			url.append(pool==POOLMANAGERS.NONE ? ";DB_CLOSE_DELAY=10" : ""); break;

		case MySQL:
			//URL?property=value&property=value...
			url.append(properties.isEmpty() ? "" : "?"+properties); break;

		case PostgreSQL:
			//URL?property=value&property=value...
			url.append(properties.isEmpty() ? "" : "?"+properties); break;

		case SQLServer:
			//URL;property=value;property=value...
			url.append(properties.isEmpty() ? "" : ";"+properties);
			url.append(";SelectMethod=cursor"); break;
		}
		return url.toString();
	}

	private void executeBackup(Command cmd, String password) throws Exception {
		switch(this){
		case H2:
		case MySQL:
		case SQLServer: break;
		//http://www.postgresql.org/docs/8.1/static/libpq-envars.html
		case PostgreSQL: cmd.setVariable("PGPASSWORD", password); break;
		}
		System.out.println("BACKUP COMMAND: "+cmd);
		//executes command
		if (cmd.startAndWait()!=0) throw new Exception(cmd.toString());
	}

	public void executeBackup(String host, String database, String user, String password,
			BackupParameters backup) throws Exception {
		//colibri9_H2_2014-12-31_125959
		String prefix=new File(database).getName()+"_"+name()+"_"+
				TimeDateUtils.getDateFormatted(new Date(),"yyyy-MM-dd_HHmmss");

		FileParameters zip=new FileParameters(prefix, "zip", backup.folder);
		System.out.println("BACKUP FILE: "+zip);

		if (isH2Embedded(host)){
			File db=new File(database+Constants.SUFFIX_PAGE_FILE).getAbsoluteFile();
			System.out.println("BACKUP DATABASE: "+db);
			//empty database?
			if (db.length()==0) return;
			//check lock
			checkH2Lock(database);
			//ZIP dump
			new ZipFileHandler(zip.toFile()).normalDeflate(Arrays.asList(db));
			//Driver H2 v1.3.169
			//Backup.execute does not work with eclipse exported product on MAC!
			//https://groups.google.com/forum/#!topic/h2-database/AT7OpOkQfZ4
			/*
			File db=new File(database).getAbsoluteFile();
			Backup.execute(dump.toString(), db.getParent(), db.getName(), false);
			*/
		}else{
			//H2, MySQL, PostgreSQL
			FileParameters dump=new FileParameters(prefix, "sql", backup.folder);
			System.out.println("BACKUP DUMP: "+dump);
			switch(this){
			case H2: executeBackup(backup.buildCommand(
					getDatabaseUrl(host, database), user, password, dump), password); break;
			case MySQL:
			case PostgreSQL:
			case SQLServer: executeBackup(backup.buildCommand(
					database, user, password, dump), password); break;
			}
			//ZIP dump
			new ZipFileHandler(zip.toFile()).normalDeflate(Arrays.asList(dump.toFile()));
			//delete dump
			dump.toFile().delete();
		}
	}

	/** Only for H2 database */
	public void compact(String host, String database, String user, String password) throws Exception {
		String url=getDatabaseUrl(host, database);
		String file = database+".sql";
		Script.execute(url, user, password, file);
		DeleteDbFiles.execute(System.getProperty("java.io.tmpdir"), database, true);
		RunScript.execute(url, user, password, file, null, false);

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
			ResultSet rs=st.executeQuery("select CONSTRAINT_NAME from INFORMATION_SCHEMA.KEY_COLUMN_USAGE where CONSTRAINT_SCHEMA = SCHEMA() and TABLE_NAME = '"+tableName.toUpperCase()+"' and COLUMN_NAME = '"+columnName.toUpperCase()+"'");
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
			ResultSet rs=st.executeQuery("SHOW INDEX FROM `" + tableName.toUpperCase() + "` where column_name = '" + columnName.toUpperCase() + "'");
			while(rs.next()) col.add(rs.getString("Key_name"));
			st.close();
			break;
		case PostgreSQL: break;
		case SQLServer: break;
		}return col;
	}

	public void executeSQLUpdate(Connection connection, String sql) throws SQLException {
		try{
			Statement stmt=connection.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			connection.commit();
		}finally{
			connection.rollback();
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

}