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

	private final PrintStream systemOut=System.out; // standard output stream
	private final PrintStream systemErr=System.err; // error output stream
	private final PrintStream systemStream;

	public DebugConsole(String name) {
		this(name, null);
	}

	public DebugConsole(String name, ImageDescriptor imageDescriptor) {
		console=new MessageConsole(name, imageDescriptor);
		messageStream=console.newMessageStream();
		systemStream=new PrintStream(messageStream);
		manager.addConsoles(new IConsole[]{console});
	}


	/** Shows console */
	public void showConsole() {
		manager.showConsoleView(console);
	}

	/** Opens console AND redirects System messages */
	public void openConsole() {
		showConsole();
		showSystemOut();
	}

	/** Closes console AND restores System messages */
	public void closeConsole() {
		restoreSystemOut();
		manager.removeConsoles(new IConsole[]{console});
	}


	/** Redirects System messages */
	public void showSystemOut() {
		System.setOut(systemStream);
		System.setErr(systemStream);
	}

	/** Restores System messages */
	public void restoreSystemOut() {
		System.setOut(systemOut);
		System.setErr(systemErr);
		closeConsole();
	}


	public void write(String message) {
		try{
			messageStream.setActivateOnWrite(true);
			messageStream.write(message);
		}catch(IOException e){
			System.err.println(e);
		}
	}



	/*
	 * Getters and setters
	 */
	public MessageConsole getConsole() {
		return console;
	}


}