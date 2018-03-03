/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.drivers.pool;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Manager implements IPoolManager {

	private final ComboPooledDataSource pool;

	public C3P0Manager(String url, String user, String password) {
		pool=new ComboPooledDataSource();
		//pool.setDriverClass("org.h2.Driver");
		pool.setJdbcUrl(url);
		pool.setUser(user);
		pool.setPassword(password);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return pool.getConnection();
	}

	@Override
	public void shutdown() {
		pool.close();
	}


}