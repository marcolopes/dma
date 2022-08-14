/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc.managers;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

import org.h2.engine.Constants;
import org.h2.message.TraceSystem;
import org.h2.store.FileLock;
import org.h2.tools.DeleteDbFiles;
import org.h2.tools.RunScript;
import org.h2.tools.Script;

import org.dma.java.drivers.jdbc.BackupParameters;
import org.dma.java.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.CustomFile;
import org.dma.java.io.Folder;
import org.dma.java.io.ZipFile;
import org.dma.java.net.ServerParameters;
import org.dma.java.util.Debug;

public class H2Manager extends AbstractManager implements IDatabaseManager {

	public static final String DRIVER_NAME = "org.h2.Driver";

	public static void checkLock(String database) throws Exception {
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

	@Override
	public String getName() {
		return "H2";
	}

	@Override
	public String getDriverName() {
		return DRIVER_NAME;
	}

	@Override
	public boolean isH2Embedded(String host) {
		return new ServerParameters(host).isLocalhost();
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {
		String url=getDatabaseUrl(host, database, folder);
		//SQL script file
		File file=new CustomFile(Folder.temporary().getAbsolutePath(), database+".sql");
		//Backup the database to the SQL script file
		Script.execute(url, username, password, file.getAbsolutePath());
		//Delete the database file
		DeleteDbFiles.execute(folder.getAbsolutePath(), database, true);
		//Recreate the database from the SQL script file
		RunScript.execute(url, username, password, file.getAbsolutePath(), null, false);
		//Delete the SQL script file
		file.delete();
	}

	@Override
	public void executeBackup(String host, String database, Folder folder, String username, String password, BackupParameters backup) throws Exception {
		String prefix=getUniqueId(database);
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
			File file=new CustomFile(folder.getAbsolutePath(), database+Constants.SUFFIX_PAGE_FILE);
			Debug.out("DATABASE FILE: "+file);
			checkLock(database); //locked?
			if (file.length()>0) new ZipFile(zip).deflate(file); //ZIP file
		}else{
			CustomFile dump=new CustomFile(backup.folder, prefix+".sql");
			Debug.out("BACKUP DUMP: "+dump);
			executeBackup(backup.buildCommand(getDatabaseUrl(host, database, folder), username, password, dump), password);
			//ZIP & delete dump
			zip.deflate(dump);
			dump.delete();
		}
	}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties, POOLMANAGERS pool) {
		StringBuilder sb=new StringBuilder(getDatabaseUrl(host, database, folder));
		if (isH2Embedded(host)){
			//Multiple processes can access the same database
			sb.append(";AUTO_SERVER=TRUE");
		}else{
			//URL;property=value[;property=value]
			sb.append(properties.isEmpty() ? "" : ";"+properties);
			//The connection only succeeds when the database already exists
			sb.append(";IFEXISTS=TRUE");
		}//needed when there is NO POOL
		if (pool==POOLMANAGERS.NONE) sb.append(";DB_CLOSE_DELAY=10");
		return sb.toString();
	}

	private String getDatabaseUrl(String host, String database, Folder folder) {
		CustomFile file=new CustomFile(folder.getAbsolutePath(), database);
		return isH2Embedded(host) ?
				//jdbc:h2:[file:][<path>]<database>
				new StringBuilder("jdbc:h2:file:").append(file).toString() :
				//jdbc:h2:tcp://<server>[:<port>]/[<path>]<database>
				new StringBuilder("jdbc:h2:tcp://").
					append(host).append("/").append(file).toString();
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
		//ALTER TABLE table ALTER COLUMN column SET DATA TYPE type
		return "ALTER TABLE "+tableName+" ALTER COLUMN "+columnName+" SET DATA TYPE "+dataType;
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
		//ALTER TABLE table DROP COLUMN IF EXISTS column
		return "ALTER TABLE "+tableName+" DROP COLUMN IF EXISTS "+columnName;
	}

	@Override
	public String dropTableSQL(String tableName) {
		//DROP TABLE IF EXISTS table
		return "DROP TABLE IF EXISTS "+tableName;
	}

}