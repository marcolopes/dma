/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.drivers.jdbc;

import java.sql.SQLException;

import org.h2.server.web.WebServer;
import org.h2.tools.Server;

import org.dma.java.io.Folder;

public class H2WebServer extends Server {

	private final WebServer server;

	public H2WebServer(Folder properties, Folder database) throws SQLException {
		super(new WebServer(),
				//PROPERTIES file folder
				"-properties", properties.getAbsolutePath(),
				//DATABASE file folder
				"-baseDir", database.getAbsolutePath());

		server=(WebServer)getService();
		server.setShutdownHandler(this);
	}


}
