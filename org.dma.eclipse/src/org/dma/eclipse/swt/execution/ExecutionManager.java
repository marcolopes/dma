/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import org.dma.java.util.Debug;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ExecutionManager {

	private static final Map<ExecutionDefinition, ExecutionEvent> EVENTS=new LinkedHashMap();

	private static boolean equals(String id, String secondaryId) {
		return id==null ? true : id.equals(secondaryId);
	}

	/*
	 * Register
	 */
	@Deprecated
	public static ExecutionEvent register(Control control, IAction action, int keycode) {
		return register(control, action, KeyStroke.getInstance(keycode));
	}

	@Deprecated
	public static ExecutionEvent register(Control control, String id, IAction action, int keycode) {
		return register(control, id, action, KeyStroke.getInstance(keycode));
	}

	@Deprecated
	public static ExecutionEvent register(Control control, String id, String secondaryId, IAction action, int keycode) {
		return register(control, id, secondaryId, action, KeyStroke.getInstance(keycode));
	}

	public static ExecutionEvent register(Control control, IAction action, KeyStroke...keycode) {
		return register(control, null, action, keycode);
	}

	public static ExecutionEvent register(Control control, String id, IAction action, KeyStroke...keycode) {
		return register(control, id, null, action, keycode);
	}

	public static ExecutionEvent register(Control control, String id, String secondaryId, IAction action, KeyStroke...keycode) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(control, id, secondaryId);
		ExecutionEvent execEvent=new ExecutionEvent(keycode, action);
		return register(execDefinition, execEvent);
	}

	private static ExecutionEvent register(ExecutionDefinition execDefinition, final ExecutionEvent execEvent) {

		if(EVENTS.containsKey(execDefinition)) throw new RuntimeException("EXECUTION ALREADY REGISTERED: "+execDefinition.getId());

		execDefinition.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				for(KeyStroke keyCode: execEvent.getKeycode()){
					if(keyCode.getNaturalKey()==e.keyCode &&
						(keyCode.getModifierKeys()==KeyStroke.NO_KEY ||
						(e.stateMask & keyCode.getModifierKeys())==keyCode.getModifierKeys())){
						Debug.out("EXECUTION");
						execEvent.execute();
						e.doit=false;
					}
				}
			}
		});

		if(execDefinition.getControl() instanceof Button ||
			execDefinition.getControl() instanceof Combo) {
			execDefinition.addSelectionListener(new Listener() {
				@Override
				public void handleEvent(Event e) {
					Debug.out("EXECUTION");
					execEvent.execute();
				}
			});
		}

		EVENTS.put(execDefinition, execEvent);

		Debug.out(execEvent.toString(), EVENTS.size());

		return execEvent;

	}



	/*
	 * Unregister
	 */
	public static void unregister(Control control) {

		for(Iterator<ExecutionDefinition> iterator=EVENTS.keySet().iterator(); iterator.hasNext();){

			ExecutionDefinition execDefinition=iterator.next();

			if(execDefinition.getControl().equals(control)){

				ExecutionEvent execEvent=EVENTS.get(execDefinition);

				execDefinition.removeListeners();
				iterator.remove();

				Debug.out(execEvent.toString(), EVENTS.size());

			}

		}

	}



	/*
	 * Executions
	 */
	public static boolean notifyPendingExecutions(String id, String secondaryId) {

		for(Iterator<ExecutionDefinition> iterator=new LinkedList(EVENTS.keySet()).descendingIterator(); iterator.hasNext();){

			ExecutionDefinition execDefinition=iterator.next();

			if(equals(id, execDefinition.getId()) && equals(secondaryId, execDefinition.getSecondaryId())){

				ExecutionEvent execEvent=EVENTS.get(execDefinition);

				if(execEvent.isExecuted()){
					execEvent.executeResponse();
					return true;
				}

			}

		}

		return false;

	}


	public static boolean notifyPendingExecutions(String id) {

		return notifyPendingExecutions(id, null);

	}


	public static boolean hasPendingExecutions(String id, String secondaryId) {

		for(Iterator<ExecutionDefinition> iterator=new LinkedList(EVENTS.keySet()).descendingIterator(); iterator.hasNext();){

			ExecutionDefinition execDefinition=iterator.next();

			if(equals(id, execDefinition.getId()) && equals(secondaryId, execDefinition.getSecondaryId())){

				ExecutionEvent execEvent=EVENTS.get(execDefinition);

				if(execEvent.isExecuted() && !execEvent.isEmpty()) return true;

			}

		}

		return false;

	}


	public static boolean hasPendingExecutions(String id) {

		return hasPendingExecutions(id, null);

	}


}
