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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class DriverCPManager implements IPoolManager {

	private Connection connection;

	private final String url, username, password;

	public DriverCPManager(String url, String username, String password) {
		this.url=url;
		this.username=username;
		this.password=password;
		/*
		 * The DriverManager itself doesn't do anything with the loginTimeout.
		 * It is up to individual JDBC driver to implement timeout handling
		 * and use the value of this property of DriverManager.
		 */
		DriverManager.setLoginTimeout((int)TimeUnit.MILLISECONDS.toSeconds(MAX_WAIT_PROPERTY.getIntValue()));
	}

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


}