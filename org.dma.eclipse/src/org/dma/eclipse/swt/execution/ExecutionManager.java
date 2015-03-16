/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
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
		register(control, keycode, null, action);
	}

	public static void register(Control control, int keycode[], String id, IAction action) {
		register(control, keycode, id, null, action);
	}

	public static void register(Control control, int keycode[], String id, String secondaryId, IAction action) {
		register(control, keycode, id, secondaryId, action, null, null);
	}

	public static void register(Control control, int keycode[], String id, IAction action, IAction responseAction, IAction postresponseAction) {
		register(control, keycode, id, null, action, responseAction, postresponseAction);
	}

	public static void register(Control control, int keycode[], String id, String secondaryId, IAction action, IAction responseAction, IAction postresponseAction) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(id, secondaryId, control);
		ExecutionEvent execEvent=new ExecutionEvent(action, responseAction, postresponseAction, keycode);
		register(execDefinition, execEvent);
	}

	private static void register(ExecutionDefinition execDefinition, final ExecutionEvent execEvent) {

		if(EVENTS.containsKey(execDefinition)) throw new Error("EXECUTION ALREADY REGISTERED: "+execDefinition.getId());

		execDefinition.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				for(int keyCode: execEvent.getKeycode()){
					if(keyCode==event.keyCode) {
						Debug.out("EXECUTION");
						execEvent.getExecutionAction().run();
						execEvent.setActionExecuted(true);
						event.doit=false;
					}
				}
			}
		});

		if(execDefinition.getControl() instanceof Combo) {

			execDefinition.addSelectionListener(new Listener() {
				@Override
				public void handleEvent(Event event) {
					Debug.out("EXECUTION");
					execEvent.getExecutionAction().run();
					execEvent.setActionExecuted(true);
				}
			});

		}

		EVENTS.put(execDefinition, execEvent);

		Debug.out(execEvent.getExecutionAction().getId(), EVENTS.size());

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

				Debug.out(execEvent.getExecutionAction().getId(), EVENTS.size());

			}

		}

	}



	/*
	 * Executions
	 */
	public static void notifyDependentExecutions(String id, String secondaryId) {

		for(ExecutionDefinition execDefinition: EVENTS.keySet()) {

			if(ObjectUtils.equals(id, execDefinition.getId()) &&
				ObjectUtils.equals(secondaryId, execDefinition.getSecondaryId())) {

				ExecutionEvent execEvent=EVENTS.get(execDefinition);

				if(execEvent.getResponseAction()!=null && execEvent.isActionExecuted()) {

					execEvent.getResponseAction().run();
					execEvent.setActionExecuted(false);

					if(execEvent.getPostresponseAction()!=null) {
						execEvent.getPostresponseAction().run();
					}

				}

			}

		}

	}


	public static void notifyDependentExecutions(String id) {

		notifyDependentExecutions(id, null);

	}


	private static boolean hasDependentExecutions(String id, String secondaryId) {

		for(ExecutionDefinition execDefinition: EVENTS.keySet()) {

			ExecutionEvent execEvent=EVENTS.get(execDefinition);

			if(execDefinition!=null && execEvent!=null &&
				execEvent.getPostresponseAction()!=null &&
					ObjectUtils.equals(id, execDefinition.getId()) &&
					ObjectUtils.equals(secondaryId, execDefinition.getSecondaryId()))
				return true;
		}

		return false;

	}


	private static boolean hasDependentExecutions(String id) {

		return hasDependentExecutions(id, null);

	}


}
