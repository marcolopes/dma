/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.ui.debug;

import java.io.PrintStream;

import org.dma.java.util.Debug;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class DebugConsole {

	private final static IConsoleManager manager=ConsolePlugin.getDefault().getConsoleManager();

	private final MessageConsole console;
	private final PrintStream stream;
	private final PrintStream systemOut=System.out; // standard output stream
	private final PrintStream systemErr=System.err; // error output stream
	private final int level=Debug.LEVEL;

	public DebugConsole(String name) {
		Debug.out();
		this.console=new MessageConsole(name, null);
		this.stream=new PrintStream(console.newMessageStream());
		manager.addConsoles(new IConsole[]{console});
	}


	public void start() {
		Debug.LEVEL=Debug.LEVEL_BASIC;
		System.setOut(stream);
		System.setErr(stream);
	}


	public void stop() {
		System.setOut(systemOut);
		System.setErr(systemErr);
		Debug.LEVEL=level;
	}


	public void openConsole() {
		start();
		manager.showConsoleView(console);
	}


	public void closeConsole() {
		stop();
		manager.removeConsoles(new IConsole[]{console});
	}



	/*
	 * Getters and setters
	 */
	public MessageConsole getConsole() {
		return console;
	}


}