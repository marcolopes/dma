/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core;

import java.util.LinkedHashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

public class DebugLogger extends LinkedHashMap<Integer, Integer> {

	private static final long serialVersionUID = 1L;

	// Severity
	public static final int SEVERITY_OK = IStatus.OK;
	public static final int SEVERITY_INFO = IStatus.INFO;
	public static final int SEVERITY_WARNING = IStatus.WARNING;
	public static final int SEVERITY_ERROR = IStatus.ERROR;
	public static final int SEVERITY_CANCEL = IStatus.CANCEL;

	private final Plugin plugin;

	public DebugLogger(Plugin plugin) {
		System.out.println("plugin: "+plugin);
		this.plugin=plugin;
	}


	public void log(String message) {
		log(SEVERITY_INFO, message, null);
	}

	public void log(int severity, String message) {
		log(severity, message, null);
	}

	public void log(int severity, Throwable exception) {
		log(severity, "", exception);
	}

	public void log(int severity, String message, Throwable exception) {
		//log entry
		Status status=new Status(severity, plugin.getClass().getPackage().getName(), message, exception);
		plugin.getLog().log(status);
		//add to exceptions
		if (exception!=null && severity!=SEVERITY_OK){
			Integer n=get(severity);
			put(severity, n==null ? 1 : n+1);
		}
	}


	public boolean hasExceptions() {
		return !isEmpty();
	}


	public void report() {
		if (hasExceptions()){
			System.out.println(size()+" Exception(s)");
			debug();
		}
	}


	private void debug() {
		System.err.println("DEBUG BY SEVERITY");
		for(Integer key: keySet()){
			System.out.print("Type "+key+" (");
			switch(key){
			case SEVERITY_OK: System.out.print("OK"); break;
			case SEVERITY_INFO: System.out.print("INFO"); break;
			case SEVERITY_WARNING: System.out.print("WARNING"); break;
			case SEVERITY_ERROR: System.out.print("ERROR"); break;
			case SEVERITY_CANCEL: System.out.print("CANCEL"); break;
			}
			System.out.println(") = "+get(key));
		}
	}


}
