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
	private PrintStream systemStream;

	public DebugConsole(String name) {
		this(name, null);
	}

	public DebugConsole(String name, ImageDescriptor imageDescriptor) {
		console=new MessageConsole(name, imageDescriptor);
		messageStream=console.newMessageStream();
		messageStream.setActivateOnWrite(true);
		manager.addConsoles(new IConsole[]{console});
	}


	public void showConsole() {
		manager.showConsoleView(console);
	}

	public void closeConsole() {
		manager.removeConsoles(new IConsole[]{console});
	}


	public void writeSystemOut() {
		systemStream=new PrintStream(messageStream);
		System.setOut(systemStream);
		System.setErr(systemStream);
		showConsole();
	}

	public void restoreSystemOut() {
		System.setOut(systemOut);
		System.setErr(systemErr);
		closeConsole();
	}


	public void write(String message) {
		try{
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