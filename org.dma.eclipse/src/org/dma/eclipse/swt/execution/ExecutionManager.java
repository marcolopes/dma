/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.ObjectUtils;
import org.dma.java.util.Debug;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ExecutionManager {

	private static final Map<ExecutionDefinition, ExecutionEvent> EVENTS=new HashMap();

	/*
	 * Register
	 */
	public static void register(Control control, IAction action) {
		register(control, new int[]{-1}, action);
	}

	public static void register(Control control, int keycode[], IAction action) {
		register(control, null, keycode, action);
	}

	public static void register(Control control, String id, int keycode[], IAction action) {
		register(control, id, null, keycode, action);
	}

	public static void register(Control control, String id, int keycode[], IAction action, IAction...responseAction) {
		register(control, id, null, keycode, action, responseAction);
	}

	public static void register(Control control, String id, String secondaryId, int keycode[], IAction action, IAction...responseAction) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(control, id, secondaryId);
		ExecutionEvent execEvent=new ExecutionEvent(keycode, action, responseAction);
		register(execDefinition, execEvent);
	}

	private static void register(ExecutionDefinition execDefinition, final ExecutionEvent execEvent) {

		if(EVENTS.containsKey(execDefinition)) throw new Error("EXECUTION ALREADY REGISTERED: "+execDefinition.getId());

		execDefinition.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				for(int keyCode: execEvent.getKeycode()){
					if(keyCode==e.keyCode) {
						Debug.out("EXECUTION");
						execEvent.execute();
						e.doit=false;
					}
				}
			}
		});

		if(execDefinition.getControl() instanceof Combo) {
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

	}



	/*
	 * Unregister
	 */
	public static void unregister(Control control) {

		for(Iterator<ExecutionDefinition> iterator=EVENTS.keySet().iterator(); iterator.hasNext();) {

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
	public static void notifyPendingExecutions(String id, String secondaryId) {

		for(Iterator<ExecutionDefinition> iterator=EVENTS.keySet().iterator(); iterator.hasNext();) {

			ExecutionDefinition execDefinition=iterator.next();

			if(ObjectUtils.equals(id, execDefinition.getId()) &&
				ObjectUtils.equals(secondaryId, execDefinition.getSecondaryId())) {

				ExecutionEvent execEvent=EVENTS.get(execDefinition);
				if(execEvent.isExecuted()) execEvent.executeResponse();

			}

		}

	}


	public static void notifyPendingExecutions(String id) {

		notifyPendingExecutions(id, null);

	}


	public static boolean hasPendingExecutions(String id, String secondaryId) {

		for(Iterator<ExecutionDefinition> iterator=EVENTS.keySet().iterator(); iterator.hasNext();) {

			ExecutionDefinition execDefinition=iterator.next();

			if(ObjectUtils.equals(id, execDefinition.getId()) &&
				ObjectUtils.equals(secondaryId, execDefinition.getSecondaryId())){

				ExecutionEvent execEvent=EVENTS.get(execDefinition);

				if(execEvent.hasResponseAction()) return true;

			}

		}

		return false;

	}


	public static boolean hasPendingExecutions(String id) {

		return hasPendingExecutions(id, null);

	}


}
