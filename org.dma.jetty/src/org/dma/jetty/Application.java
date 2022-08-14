/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.jetty;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	public Application() {
		System.err.println(Activator.PLUGIN_NAME+" "+getClass().getSimpleName());
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Display display=Display.getDefault();
		if (display!=null) try{
			JettyShell shell=new JettyShell(display.getActiveShell(), new JettyServer()/*.start()*/);
			shell.openAndSleep();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			display.dispose();
		}return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {}

}
