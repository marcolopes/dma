/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.ui;

import java.io.PrintStream;

import org.dma.eclipse.swt.graphics.ColorManager;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class MessageConsoleView extends MessageConsole {

	public static final String ID = IConsoleConstants.ID_CONSOLE_VIEW;

	private class MessageConsoleErrorStream extends MessageConsoleStream {

		public MessageConsoleErrorStream(MessageConsole console) {
			super(console);
			setColor(ColorManager.COLOR_RED);
		}

	}

	private class MessageStream {

		public final MessageConsoleStream out;
		public final MessageConsoleErrorStream err;

		public MessageStream(MessageConsole console) {
			this.out=console.newMessageStream();
			this.err=new MessageConsoleErrorStream(console);
		}

	}

	private class SystemStream {

		public final PrintStream out; // standard output stream
		public final PrintStream err; // error output stream

		public SystemStream(MessageStream stream) {
			this(new PrintStream(stream.out), new PrintStream(stream.err));
		}

		public SystemStream(PrintStream out, PrintStream err) {
			this.out=out;
			this.err=err;
		}

	}

	private static final IConsoleManager manager=ConsolePlugin.getDefault().getConsoleManager();

	private final MessageStream consoleStream;

	private SystemStream systemStream;

	public MessageConsoleView() {
		this("", null);
	}

	@Deprecated
	public MessageConsoleView(String name) {
		this(name, null);
	}

	public MessageConsoleView(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		consoleStream=new MessageStream(this);
		manager.addConsoles(new IConsole[]{this});
	}

	/** Opens console and redirects system messages */
	public void open(boolean captureOutputStream) {
		UIHelper.getActivePage().addPartListener(new IPartListener() {
			@Override
			public void partOpened(IWorkbenchPart part) {}
			@Override
			public void partActivated(IWorkbenchPart part) {}
			@Override
			public void partDeactivated(IWorkbenchPart part) {}
			@Override
			public void partBroughtToTop(IWorkbenchPart part) {}
			@Override
			public void partClosed(IWorkbenchPart part) {
				if(part instanceof IConsoleView){
					IConsoleView view=(IConsoleView)part;
					if (view.getViewSite().getId().equals(ID)){
						restoreOutputStream();
					}
				}
			}
		});
		activate();
		if (captureOutputStream) captureOutputStream();
	}

	public boolean isOpen() {
		return UIHelper.isViewOpen(ID);
	}

	/** Closes console and restores system messages */
	public void close() {
		UIHelper.hideView(ID);
	}


	/** Activates the console and writes to it */
	public void out(String message) {
		consoleStream.out.setActivateOnWrite(true);
		consoleStream.out.println(message);
		consoleStream.out.setActivateOnWrite(false);
	}


	/** Activates the console and writes to it */
	public void err(String message) {
		consoleStream.err.setActivateOnWrite(true);
		consoleStream.err.println(message);
		consoleStream.err.setActivateOnWrite(false);
	}


	/** Redirects system messages */
	public void captureOutputStream() {
		if (systemStream==null) try{
			//backup
			systemStream=new SystemStream(System.out, System.err);
			//redirect
			SystemStream systemStream=new SystemStream(consoleStream);
			System.setOut(systemStream.out);
			System.setErr(systemStream.err);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/** Restores system messages */
	public void restoreOutputStream() {
		if (systemStream!=null) try{
			//restore
			System.setOut(systemStream.out);
			System.setErr(systemStream.err);
			systemStream=null;
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}