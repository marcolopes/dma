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
package org.dma.drivers.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dma.drivers.jdbc.pool.BoneCPManager;
import org.dma.drivers.jdbc.pool.C3P0Manager;
import org.dma.drivers.jdbc.pool.DBCPManager;
import org.dma.drivers.jdbc.pool.IPoolManager;

public enum POOLMANAGERS {

	NONE,
	/** http://commons.apache.org/dbcp */
	DBCP,
	/** http://www.mchange.com/projects/c3p0 */
	C3P0,
	/** http://www.jolbox.com */
	BONECP;

	private static Map<String, IPoolManager> CACHE=new ConcurrentHashMap();

	public IPoolManager get(String url, String username, String password) {
		IPoolManager manager=CACHE.get(url);
		if (manager==null) CACHE.put(url, manager=create(url, username, password));
		return manager;
	}

	private IPoolManager create(final String url, final String username, final String password) {
		switch(this){
		case NONE: return new IPoolManager() {
			private Connection connection;
			@Override
			public Connection getConnection() throws SQLException {
				return connection==null || connection.isClosed() ?
						connection=DriverManager.getConnection(url, username, password) : connection;
			}
			@Override
			public void shutdown() {
				if (connection!=null) try{
					connection.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		case DBCP: return new DBCPManager(url, username, password);
		case C3P0: return new C3P0Manager(url, username, password);
		case BONECP: return new BoneCPManager(url, username, password);
		}return null;
	}

	public static void shutdown() {
		for(IPoolManager manager: CACHE.values()) manager.shutdown();
	}

}