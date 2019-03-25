/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.ui;

import java.util.LinkedHashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;

public class DebugLogger extends LinkedHashMap<Integer, Integer> {

	private static final long serialVersionUID = 1L;

	// Severity
	public static final int SEVERITY_OK = IStatus.OK;
	public static final int SEVERITY_INFO = IStatus.INFO;
	public static final int SEVERITY_WARNING = IStatus.WARNING;
	public static final int SEVERITY_ERROR = IStatus.ERROR;
	public static final int SEVERITY_CANCEL = IStatus.CANCEL;

	// Style
	public static final int STYLE_FILE = StatusManager.LOG;
	public static final int STYLE_SCREEN = StatusManager.SHOW;
	public static final int STYLE_BLOCK = StatusManager.BLOCK;

	private final String pluginId;

	public DebugLogger(String pluginId) {
		System.out.println("LOGGER: "+pluginId);
		this.pluginId=pluginId;
	}


	/*
	 * File log
	 */
	public void file(String message) {
		file(SEVERITY_INFO, message, null);
	}

	public void file(int severity, String message) {
		file(severity, message, null);
	}

	public void file(int severity, Throwable exception) {
		file(severity, "", exception);
	}

	public void file(int severity, String message, Throwable exception) {
		file(severity, STYLE_FILE, message, exception);
	}

	public void file(int severity, int style, String message) {
		file(severity, style, message, null);
	}

	private void file(int severity, int style, String message, Throwable exception) {
		//log entry
		Status status=new Status(severity, pluginId, message, exception);
		StatusManager.getManager().handle(status, style);
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
