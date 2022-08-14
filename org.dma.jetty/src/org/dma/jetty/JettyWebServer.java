/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.jetty;

import org.dma.java.io.Folder;

import org.eclipse.jetty.webapp.WebAppContext;

public class JettyWebServer extends JettyServer {

	public static final String SERVLET_DEFAULT_DIRALLOWED = "org.eclipse.jetty.servlet.Default.dirAllowed";

	public JettyWebServer(JettyParameters parameters, WebAppContext contextHandler) {
		super(parameters, contextHandler);
	}

	@Override
	public JettyServer start() {
		deleteTempLocation();
		return super.start();
	}

	@Override
	public WebAppContext getHandler() {
		return (WebAppContext)super.getHandler();
	}

	public String getResourceLocation() {
		return getHandler().getResourceBase();
	}

	public String getTempLocation() {
		return (String)getHandler().getAttribute(WebAppContext.BASETEMPDIR);
	}

	public int deleteTempLocation() {
		return new Folder(getTempLocation()).deleteAllFiles();
	}

}
