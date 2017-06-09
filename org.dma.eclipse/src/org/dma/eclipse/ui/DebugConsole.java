/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.ui;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class DebugConsole {

	private final static IConsoleManager manager=ConsolePlugin.getDefault().getConsoleManager();

	private final MessageConsole console;
	private final MessageConsoleStream messageStream;

	private PrintStream systemOut=System.out; // standard output stream
	private PrintStream systemErr=System.err; // error output stream
	private PrintStream systemStream;

	public DebugConsole(String name) {
		this(name, null);
	}

	public DebugConsole(String name, ImageDescriptor imageDescriptor) {
		console=new MessageConsole(name, imageDescriptor);
		messageStream=console.newMessageStream();
	}


	private void disposeConsoleStream() {
		if (!messageStream.isClosed()) try{
			messageStream.flush();
			messageStream.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}


	/** Redirects System messages */
	public void captureSystemOut() {
		if (systemStream!=null) return;
		systemStream=new PrintStream(messageStream);
		systemOut=System.out;
		System.setOut(systemStream);
		systemErr=System.err;
		System.setErr(systemStream);
	}

	/** Restores System messages */
	public void restoreSystemOut() {
		if (systemStream==null) return;
		System.setOut(systemOut);
		System.setErr(systemErr);
		systemStream.close();
		systemStream=null;
	}


	/** Shows console */
	public void showConsole() {
		manager.showConsoleView(console);
	}

	/** Clears the console text */
	public void clearConsole() {
		console.clearConsole();
	}

	/** Opens console AND redirects System messages */
	public void openConsole() {
		manager.addConsoles(new IConsole[]{console});
		showConsole();
		captureSystemOut();
	}

	/** Closes console */
	public void closeConsole() {
		manager.removeConsoles(new IConsole[]{console});
		UIHelper.hideView(UIHelper.findViewReference("org.eclipse.ui.console.ConsoleView"));
	}

	/** Disposes console AND restores System messages */
	public void disposeConsole() {
		restoreSystemOut();
		disposeConsoleStream();
		closeConsole();
	}


	/** Activates the console and writes to it */
	public void println(String message) {
		messageStream.setActivateOnWrite(true);
		messageStream.println(message);
		messageStream.setActivateOnWrite(false);
	}



	/*
	 * Getters and setters
	 */
	public MessageConsole getConsole() {
		return console;
	}


}