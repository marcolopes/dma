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
import java.util.ArrayList;
import java.util.Collection;

import org.h2.engine.Constants;
import org.h2.jdbc.JdbcConnection;
import org.h2.message.TraceSystem;
import org.h2.store.FileLock;
import org.h2.tools.DeleteDbFiles;
import org.h2.tools.RunScript;
import org.h2.tools.Script;

import org.dma.drivers.jdbc.BackupParameters;
import org.dma.drivers.jdbc.POOLMANAGERS;
import org.dma.java.io.CustomFile;
import org.dma.java.io.Folder;
import org.dma.java.io.ZipFile;
import org.dma.java.net.HttpServerHandler;
import org.dma.java.util.Debug;

public class H2Manager extends AbstractManager {

	public static JdbcConnection unwrap(Connection connection) throws SQLException {
		return connection.unwrap(JdbcConnection.class);
	}

	public static boolean isEmbedded(String host) {
		return new HttpServerHandler(host).isLocalhost();
	}

	public static String getConnectionUrl(String host, String database, Folder folder) {
		CustomFile file=new CustomFile(folder.getPath(), database);
		return isEmbedded(host) ?
				//jdbc:h2:[file:][<path>]<database>
				new StringBuilder("jdbc:h2:file:").append(file).toString() :
				//jdbc:h2:tcp://<server>[:<port>]/[<path>]<database>
				new StringBuilder("jdbc:h2:tcp://").
					append(host).append("/").append(file).toString();
	}

	public static void checkLock(Folder folder, String database) throws Exception {
		File file=new CustomFile(folder.getPath(), database+Constants.SUFFIX_LOCK_FILE);
		Debug.out("DATABASE LOCK: "+file);
		FileLock lock=new FileLock(new TraceSystem(null), file.getPath(), 0);
		lock.lock(FileLock.LOCK_FILE);
		lock.unlock();
	}

	public H2Manager(POOLMANAGERS pool) {
		super(pool);
	}

	@Override
	public String getName() {
		return "H2";
	}

	@Override
	public void compact(String host, String database, Folder folder, String username, String password) throws Exception {
		String url=getConnectionUrl(host, database, folder);
		//SQL script file
		File file=new CustomFile(Folder.temporary(), database+".sql");
		//Backup the database to the SQL script file
		Script.execute(url, username, password, file.getPath());
		//Delete the database file
		DeleteDbFiles.execute(folder.getPath(), database, true);
		//Recreate the database from the SQL script file
		RunScript.execute(url, username, password, file.getPath(), null, false);
		//Delete the SQL script file
		file.delete();
	}

	@Override
	public File executeBackup(String host, String database, Folder folder, String username, String password, BackupParameters backup) throws Exception {
		String prefix=getUniqueId(database);
		//[folder]/[prefix].zip
		ZipFile zip=new ZipFile(backup.folder, prefix+".zip");
		Debug.out("BACKUP ZIP: "+zip);
		if (isEmbedded(host)){
			/*
			 * H2 Driver v1.3.169
			 * Backup.execute does not work with eclipse exported product on MAC!
			 * https://groups.google.com/forum/#!topic/h2-database/AT7OpOkQfZ4
			 * File db=new File(database).getAbsoluteFile();
			 * Backup.execute(dump.toString(), db.getParent(), db.getName(), false);
			 */
			File file=new CustomFile(folder.getPath(), database+Constants.SUFFIX_PAGE_FILE);
			Debug.out("DATABASE FILE: "+file);
			checkLock(folder, database); //locked?
			if (file.length()>0) new ZipFile(zip).deflate(file); //ZIP file
		}else{
			File dump=new CustomFile(backup.folder, prefix+".sql");
			Debug.out("BACKUP DUMP: "+dump);
			executeBackup(backup.buildCommand(getConnectionUrl(host, database, folder), username, password, dump), password);
			//ZIP & delete dump
			zip.deflate(dump);
			dump.delete();
		}return zip;
	}

	@Override
	public String getConnectionUrl(String host, String database, Folder folder, String properties) {
		StringBuilder sb=new StringBuilder(getConnectionUrl(host, database, folder));
		if (isEmbedded(host)){
			//Multiple processes can access the same database
			sb.append(";AUTO_SERVER=TRUE");
		}else{
			//URL;property=value[;property=value]
			sb.append(properties.isEmpty() ? "" : ";"+properties);
			//The connection only succeeds when the database already exists
			sb.append(";IFEXISTS=TRUE");
		}//Needed when there is NO POOL
		if (pool==POOLMANAGERS.NONE) sb.append(";DB_CLOSE_DELAY=10");
		return sb.toString();
	}

	@Override
	public long getConnectionId(Connection connection) {
		try{return unwrap(connection).getTraceId();
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