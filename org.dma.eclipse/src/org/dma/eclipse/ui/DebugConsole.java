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

	private PrintStream systemOut=System.out; // standard output stream
	private PrintStream systemErr=System.err; // error output stream

	private MessageConsoleStream messageStream;
	private PrintStream systemStream;

	public DebugConsole(String name) {
		this(name, null);
	}

	public DebugConsole(String name, ImageDescriptor imageDescriptor) {
		console=new MessageConsole(name, imageDescriptor);
		manager.addConsoles(new IConsole[]{console});
	}

	private MessageConsoleStream getMessageStream() {
		if (messageStream==null || messageStream.isClosed()){
			messageStream=console.newMessageStream();
			messageStream.setActivateOnWrite(true);
		}
		return messageStream;
	}

	private void disposeConsoleStream() {
		if (messageStream!=null && !messageStream.isClosed()) try{
			messageStream.flush();
			messageStream.close();
			messageStream=null;
		}catch(IOException e){
			System.out.println(e);
		}
	}


	/** Redirects System messages */
	public void captureSystemOut() {
		if (systemStream!=null) return;
		systemStream=new PrintStream(getMessageStream());
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

	/** Opens console AND redirects System messages */
	public void openConsole() {
		showConsole();
		captureSystemOut();
	}

	/** Clears the console text */
	public void clearConsole() {
		console.clearConsole();
	}

	/** Closes console AND restores System messages */
	public void closeConsole() {
		restoreSystemOut();
		disposeConsoleStream();
		manager.removeConsoles(new IConsole[]{console});
	}


	/** Activates the console and writes to it */
	public void write(String message) {
		getMessageStream().print(message);
	}



	/*
	 * Getters and setters
	 */
	public MessageConsole getConsole() {
		return console;
	}


}