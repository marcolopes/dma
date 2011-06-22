/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;

public class Logger {

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

	private final Map<Integer, Integer> exceptions=new HashMap();

	public Logger(String pluginId) {
		Debug.info();
		this.pluginId=pluginId;
	}


	public void file(int severity, String message) {
		file(severity, message, null);
	}


	public void file(int severity, String message, Throwable e) {
		log(severity, STYLE_FILE, message, e);
	}


	private void log(int severity, int style, String message) {
		log(severity, style, message, null);
	}


	private void log(int severity, int style, String message, Throwable e) {
		Status status=new Status(severity, pluginId, message, e);
		StatusManager.getManager().handle(status, style);

		if (severity!=SEVERITY_OK){
			Integer n=exceptions.get(severity);
			exceptions.put(severity, n==null ? 1 : n+1);
		}
	}


	public void report() {
		if (hasExceptions()){
			System.out.println(exceptions.size()+" Exception(s)");
			debug();
		}
	}


	public boolean hasExceptions() {
		return exceptions.size()>0;
	}


	private void debug() {
		System.out.println("### DEBUG BY SEVERITY ###");
		Iterator<Integer> iterator=exceptions.keySet().iterator();
		while(iterator.hasNext()){

			int key=iterator.next();
			System.out.print("Type "+key+" (");
			switch(key){
			case SEVERITY_OK: System.out.print("OK"); break;
			case SEVERITY_INFO: System.out.print("INFO"); break;
			case SEVERITY_WARNING: System.out.print("WARNING"); break;
			case SEVERITY_ERROR: System.out.print("ERROR"); break;
			case SEVERITY_CANCEL: System.out.print("CANCEL"); break;
			}
			System.out.println(") = "+exceptions.get(key));
		}

	}


}
