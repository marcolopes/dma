/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.core;

import java.util.LinkedHashMap;

import org.dma.eclipse.core.DebugLogger.SEVERITY;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

public class DebugLogger extends LinkedHashMap<SEVERITY, Integer> {

	private static final long serialVersionUID = 1L;

	public enum SEVERITY {

		OK (IStatus.OK),
		INFO (IStatus.INFO),
		WARNING (IStatus.WARNING),
		ERROR (IStatus.ERROR),
		CANCEL (IStatus.CANCEL);

		public final int type;

		private SEVERITY(int type) {
			this.type=type;
		}

	}

	private final Plugin plugin;

	public DebugLogger(Plugin plugin) {
		this.plugin=plugin;
	}


	public void log(String message) {
		log(SEVERITY.INFO, message, null);
	}

	public void log(SEVERITY severity, String message) {
		log(severity, message, null);
	}

	public void log(SEVERITY severity, Throwable exception) {
		log(severity, "", exception);
	}

	public void log(SEVERITY severity, String message, Throwable exception) {
		//log entry
		Status status=new Status(severity.type, plugin.getBundle().getSymbolicName(), message, exception);
		plugin.getLog().log(status);
		//add to exceptions
		if (exception!=null && severity!=SEVERITY.OK){
			Integer n=get(severity);
			put(severity, n==null ? 1 : n+1);
		}
	}


	public void report() {

		if (!isEmpty()){

			System.out.println(size()+" Exception(s) BY SEVERITY");

			for(SEVERITY key: keySet()){
				System.out.print("Type "+key+" (");
				switch(key){
				case OK: System.out.print("OK"); break;
				case INFO: System.out.print("INFO"); break;
				case WARNING: System.out.print("WARNING"); break;
				case ERROR: System.out.print("ERROR"); break;
				case CANCEL: System.out.print("CANCEL"); break;
				}System.out.println(") = "+get(key));
			}

		}

	}


}
