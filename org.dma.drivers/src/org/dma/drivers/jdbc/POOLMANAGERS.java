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
import java.sql.SQLException;

import org.dma.drivers.jdbc.pool.BoneCPManager;
import org.dma.drivers.jdbc.pool.C3P0Manager;
import org.dma.drivers.jdbc.pool.DBCPManager;
import org.dma.drivers.jdbc.pool.DriverCPManager;
import org.dma.drivers.jdbc.pool.HikariCPManager;
import org.dma.drivers.jdbc.pool.IPoolManager;
import org.dma.drivers.jdbc.pool.PoolManagerMap;

public enum POOLMANAGERS {

	/** Native driver */ NONE,
	/** <a href=http://commons.apache.org/dbcp> DBCP */ DBCP,
	/** <a href=http://www.mchange.com/projects/c3p0> c3p0 */ C3P0,
	/** <a href=http://github.com/wwadge/bonecp> BoneCP */ BONECP,
	/** <a href=http://github.com/brettwooldridge/HikariCP> HikariCP */ HIKARI;

	/** Workaround for ENUM EXTENDS	*/
	private final PoolManagerMap map=new PoolManagerMap();

	public static void print() {
		System.out.println("---POOLMANAGERS---");
		for(POOLMANAGERS pool: values()){
			System.out.println(pool+"="+pool.map.size());
			pool.map.print();
		}
	}

	public static void shutdown() {
		for(POOLMANAGERS pool: values()){
			pool.map.shutdown();
		}
	}

	private IPoolManager create(final String url, final String username, final String password) {
		switch(this){
		case NONE: return new DriverCPManager(url, username, password);
		case DBCP: return new DBCPManager(url, username, password);
		case C3P0: return new C3P0Manager(url, username, password);
		case BONECP: return new BoneCPManager(url, username, password);
		case HIKARI: return new HikariCPManager(url, username, password);
		}return null;
	}

	public Connection getConnection(String url, String username, String password) throws SQLException {
		IPoolManager manager=map.get(url, username, password);
		if (manager==null) map.put(url, username, password, manager=create(url, username, password));
		return manager.getConnection();
	}

	public void checkConnection(String url, String username, String password) throws SQLException {
		if (this!=NONE) System.err.println("WARNING: "+this+" should NOT be used to check the connection!");
		IPoolManager manager=map.get(url, username, password);
		if (manager==null) manager=create(url, username, password);
		manager.getConnection().close();
	}

	public void shutdown(String url, String username, String password) {
		IPoolManager manager=map.remove(url, username, password);
		if (manager!=null) manager.shutdown();
	}

}