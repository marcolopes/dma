/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import org.dma.java.drivers.pool.BoneCPManager;
import org.dma.java.drivers.pool.C3P0Manager;
import org.dma.java.drivers.pool.DBCPManager;
import org.dma.java.drivers.pool.IPoolManager;

public enum POOLMANAGERS {

	NONE,
	/** http://commons.apache.org/dbcp */
	DBCP,
	/** http://www.mchange.com/projects/c3p0 */
	C3P0,
	/** http://www.jolbox.com */
	BONECP;

	private static HashMap<String, IPoolManager> CACHE=new HashMap();

	public static void shutdown() {
		for(IPoolManager manager: CACHE.values()) manager.shutdown();
	}

	public synchronized IPoolManager get(String url, String user, String password) {
		IPoolManager manager=CACHE.get(url);
		if (manager==null) CACHE.put(url, manager=create(url, user, password));
		return manager;
	}

	private IPoolManager create(final String url, final String user, final String password) {
		switch(this){
		case NONE: return new IPoolManager() {
			@Override
			public void shutdown() {}
			@Override
			public Connection getConnection() throws SQLException {
				return DriverManager.getConnection(url, user, password);
			}
		};
		case DBCP: return new DBCPManager(url, user, password);
		case C3P0: return new C3P0Manager(url, user, password);
		case BONECP: return new BoneCPManager(url, user, password);
		}return null;
	}

}