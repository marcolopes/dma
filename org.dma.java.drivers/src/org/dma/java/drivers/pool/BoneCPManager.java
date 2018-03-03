/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.drivers.pool;

import java.sql.Connection;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class BoneCPManager implements IPoolManager {

	private final BoneCP pool;

	public BoneCPManager(String url, String user, String password) {
		//Class.forName("org.h2.Driver");
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
			e.printStackTrace();
		}return null;
	}

	@Override
	public Connection getConnection() throws Exception {
		return pool.getConnection();
	}

	@Override
	public void shutdown() {
		pool.shutdown();
	}


}