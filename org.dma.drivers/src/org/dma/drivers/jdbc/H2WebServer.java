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

import java.sql.SQLException;

import org.h2.server.web.WebServer;
import org.h2.tools.Server;

import org.dma.java.io.Folder;

public class H2WebServer extends Server {

	private final WebServer server;

	public H2WebServer(Folder properties, Folder database) throws SQLException {
		super(new WebServer(),
				//PROPERTIES file folder
				"-properties", properties.getPath(),
				//DATABASE file folder
				"-baseDir", database.getPath());

		server=(WebServer)getService();
		server.setShutdownHandler(this);
	}


}
