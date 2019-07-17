/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.pool;

import java.sql.Connection;
import java.sql.SQLException;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

import org.dma.java.util.Debug;

public class BoneCPManager implements IPoolManager {

	private final BoneCP pool;

	public BoneCPManager(String url, String user, String password) {
		//Activator.classForName("org.h2.Driver");
		BoneCPConfig config=new BoneCPConfig();
		config.setJdbcUrl(url);
		config.setUsername(user);
		config.setPassword(password);
		pool=getPool(config);
	}

	private BoneCP getPool(BoneCPConfig config) {
		try{
			return new BoneCP(config);

		}catch(Exception e){
			Debug.err(e);
		}return null;
	}

	@Override
	public Connection getConnection() throws SQLException {
		return pool.getConnection();
	}

	@Override
	public void shutdown() {
		if (pool!=null) pool.shutdown();
	}


}