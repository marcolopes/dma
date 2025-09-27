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

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Manager implements IPoolManager {

	private final ComboPooledDataSource pool=new ComboPooledDataSource();

	public C3P0Manager(String url, String user, String password) {
		/*
		 * https://www.mchange.com/projects/c3p0/#configuration
		 */
		pool.setJdbcUrl(url);
		pool.setUser(user);
		pool.setPassword(password);
		/*
		 * Default: 0
		 * The number of milliseconds a client calling getConnection() will wait
		 * for a Connection to be checked-in or acquired when the pool is exhausted.
		 * Zero means wait indefinitely.
		 * Setting any positive value will cause the getConnection() call to time-out
		 * and break with an SQLException after the specified number of milliseconds.
		 */
		pool.setCheckoutTimeout(MAX_WAIT_PROPERTY.getIntValue());
		/*
		 * Default: false
		 * If true, an operation will be performed at every connection checkout
		 * to verify that the connection is valid. Be sure to set an efficient
		 * preferredTestQuery or automaticTestTable if you set this to true.
		 * Performing the (expensive) default Connection test on every client
		 * checkout will harm client performance.
		 * Testing Connections in checkout is the simplest and most reliable form
		 * of Connection testing, but for better performance, consider verifying
		 * connections periodically using idleConnectionTestPeriod.
		 */
		pool.setTestConnectionOnCheckout(true);
		/*
		 * Default: null
		 * Defines the query that will be executed for all connection tests,
		 * if the default ConnectionTester (or some other implementation of
		 * QueryConnectionTester, or better yet FullQueryConnectionTester) is being used.
		 *
		 * This is rarely useful, and should be left as null except when using
		 * very old (pre Java 6) or broken JDBC drivers. More recent drivers define
		 * a Connection.isValid(int timeout) method for efficient Connection tests,
		 * which will be used unless this parameter, automaticTestTable,
		 * and/or connectionTesterClassName are set to nondefault values.
		 *
		 * When working with very old JDBC drivers (or drivers who Connection.isValid(...)
		 * method is poorly implemented), defining a preferredTestQuery that will
		 * execute quickly in your database may dramatically speed up Connection tests.
		 */
		pool.setPreferredTestQuery(null);
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