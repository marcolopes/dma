/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.drivers.pool;

import java.sql.Connection;

public interface IPoolManager {

	public Connection getConnection() throws Exception;

	public void shutdown();


}