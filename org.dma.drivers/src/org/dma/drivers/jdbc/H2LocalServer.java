/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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

import java.sql.SQLException;

import org.h2.server.TcpServer;
import org.h2.tools.Server;

import org.dma.java.io.Folder;

public class H2LocalServer extends Server {

	private final TcpServer server;

	public H2LocalServer(Folder properties, Folder database) throws SQLException {
		this(properties, database, 0);
	}

	public H2LocalServer(Folder properties, Folder database, int port) throws SQLException {
		super(new TcpServer(),
				"-tcp",
				"-tcpPort", String.valueOf(port),
				"-tcpDaemon",
				//"-tcpSSL",
				//PROPERTIES file folder
				"-properties", properties.getPath(),
				//DATABASE file folder
				"-baseDir", database.getPath());

		this.server=(TcpServer)getService();
		this.server.setShutdownHandler(this);
	}

}
