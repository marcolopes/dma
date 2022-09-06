/*******************************************************************************
 * 2008-2020 Public Domain
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
			@Override
			public void shutdown() {}
			@Override
			public Connection getConnection() throws SQLException {
				return DriverManager.getConnection(url, username, password);
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