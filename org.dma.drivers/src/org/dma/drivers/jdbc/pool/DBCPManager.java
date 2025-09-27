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

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPManager implements IPoolManager {

	private final BasicDataSource pool=new BasicDataSource();

	public DBCPManager(String url, String username, String password) {
		/*
		 * https://commons.apache.org/proper/commons-dbcp/configuration.html
		 */
		pool.setUrl(url);
		pool.setUsername(username);
		pool.setPassword(password);
		pool.setMaxWait(MAX_WAIT_PROPERTY.getIntValue());
		/*
		 * Default: true
		 * The indication of whether objects will be validated before being
		 * borrowed from the pool. If the object fails to validate, it will
		 * be dropped from the pool, and we will attempt to borrow another.
		 */
		pool.setTestOnBorrow(true);
		/*
		 * The SQL query that will be used to validate connections from this
		 * pool before returning them to the caller. If specified, this query
		 * MUST be an SQL SELECT statement that returns at least one row.
		 * --- If not specified --- connections will be validation by calling
		 * the isValid() method
		 */
		pool.setValidationQuery(null);
	}

	@Override
	public Connection getConnection() throws SQLException {
		return pool.getConnection();
	}

	@Override
	public void shutdown() {
		try{pool.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}