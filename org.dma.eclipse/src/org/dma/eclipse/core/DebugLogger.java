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
package org.dma.eclipse.core;

import java.util.EnumMap;

import org.dma.eclipse.core.DebugLogger.SEVERITY;
import org.dma.java.util.MessageLine;
import org.dma.java.util.MessageList;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

public class DebugLogger extends EnumMap<SEVERITY, Integer> {

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

	public void report() {
		MessageList list=new MessageList();
		for(SEVERITY key: keySet()) list.add(new MessageLine("Type").append(key).equal(get(key)));
		if (!list.isEmpty()){
			list.add(0, new MessageLine(size()).append("Exception(s) BY SEVERITY"));
			System.out.println(list.toString());
		}
	}

	private final Plugin plugin;

	public DebugLogger(Plugin plugin) {
		super(SEVERITY.class);
		this.plugin=plugin;
	}


	@Deprecated
	private Status log(String message) {
		return log(SEVERITY.INFO, message, null);
	}

	/** @see DebugLogger#log(SEVERITY, String, Throwable) */
	public Status log(SEVERITY severity, String message) {
		return log(severity, message, null);
	}

	/** @see DebugLogger#log(SEVERITY, String, Throwable) */
	public Status log(SEVERITY severity, Throwable exception) {
		return log(severity, "", exception);
	}

	/** @see ILog#log(IStatus status) */
	public Status log(SEVERITY severity, String message, Throwable exception) {
		Status status=new Status(severity.type, plugin.getBundle().getSymbolicName(), message, exception);
		//log the status
		plugin.getLog().log(status);
		//add to exceptions
		if (exception!=null && severity!=SEVERITY.OK){
			Integer value=get(severity);
			put(severity, value==null ? 1 : value+1);
		}return status;
	}


}
