/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
