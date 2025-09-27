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
package org.dma.drivers.jdbc.pool;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/*
 * https://github.com/brettwooldridge/HikariCP/blob/dev/CHANGES
 */
public class HikariCPManager implements IPoolManager {

	private final HikariDataSource pool;

	public HikariCPManager(String url, String username, String password) {
		/*
		 * https://github.com/brettwooldridge/HikariCP?tab=readme-ov-file#gear-configuration-knobs-baby
		 */
		HikariConfig config=new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		/*
		 * Set the maximum number of milliseconds that a client will wait
		 * for a connection from the pool. If this time is exceeded without
		 * a connection becoming available, a SQLException will be thrown
		 * from javax.sql.DataSource.getConnection().
		 */
		config.setConnectionTimeout(MAX_WAIT_PROPERTY.getIntValue());
		/*
		 * HikariCP validates connections that have been idle for a certain period.
		 * This helps prevent issues with connections that might have been dropped
		 * by the database server while sitting idle in the pool.
		 */
		pool=createPool(config);
	}

	private HikariDataSource createPool(HikariConfig config) {
		try{return new HikariDataSource(config);
		}catch(Exception e){
			e.printStackTrace();
		}return null;
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