/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.pool;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPManager implements IPoolManager {

	private final BasicDataSource pool;

	public DBCPManager(String url, String user, String password) {
		pool=new BasicDataSource();
		//pool.setDriverClassName("org.h2.Driver");
		pool.setUrl(url);
		pool.setUsername(user);
		pool.setPassword(password);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return pool.getConnection();
	}

	@Override
	public void shutdown() {
		if (pool!=null) try{
			pool.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}


}