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
	private final PrintStream printStream;

	private PrintStream systemOut; // standard output stream
	private PrintStream systemErr; // error output stream

	public DebugConsole(String name) {
		this(name, null);
	}

	public DebugConsole(String name, ImageDescriptor imageDescriptor) {
		console=new MessageConsole(name, imageDescriptor);
		messageStream=console.newMessageStream();
		printStream=new PrintStream(messageStream);
		manager.addConsoles(new IConsole[]{console});
	}


	private void disposeConsoleStream() {
		if (!messageStream.isClosed()) try{
			messageStream.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}


	/** Redirects System messages */
	public void captureSystemOut() {
		if (systemOut==null) try{
			systemOut=System.out;
			systemErr=System.err;
			System.setOut(printStream);
			System.setErr(printStream);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	/** Restores System messages */
	public void restoreSystemOut() {
		if (systemOut!=null) try{
			System.setOut(systemOut);
			System.setErr(systemErr);
			systemOut=null;
		}catch(Exception e){
			System.out.println(e);
		}
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
		showConsole();
		captureSystemOut();
	}

	/** Closes console AND restores System messages */
	public void closeConsole() {
		restoreSystemOut();
		UIHelper.hideView("org.eclipse.ui.console.ConsoleView");
		//disposeConsoleStream();
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