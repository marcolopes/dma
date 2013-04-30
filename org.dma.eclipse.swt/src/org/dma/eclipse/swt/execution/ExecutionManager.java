/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dma.java.utils.Debug;
import org.dma.java.utils.object.ObjectUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ExecutionManager {

	private static final Map<ExecutionDefinition, ExecutionEvent> executionMap=new HashMap();

	/*
	 * Register
	 */
	public static void register(Control control, Action action) {
		register(control, new int[]{-1}, action);
	}


	public static void register(Control control, int keycode[], Action action) {
		register(control, keycode, null, action);
	}


	public static void register(Control control, int keycode[], String id, Action action) {
		register(control, keycode, id, null, action);
	}


	public static void register(Control control, int keycode[], String id, String secondaryId, Action action) {
		register(control, keycode, id, secondaryId, action, null, null);
	}


	public static void register(Control control, int keycode[], String id, Action action, Action responseAction, Action postresponseAction) {
		register(control, keycode, id, null, action, responseAction, postresponseAction);
	}


	public static void register(Control control, int keycode[], String id, String secondaryId, Action action, Action responseAction, Action postresponseAction) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(id,secondaryId,control);
		ExecutionEvent execEvent=new ExecutionEvent(action,responseAction,postresponseAction,keycode);
		register(execDefinition, execEvent);
	}


	private static void register(ExecutionDefinition execDefinition, final ExecutionEvent execEvent) {

		try{
			if(!executionMap.containsKey(execDefinition)) {

				execDefinition.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent event) {
						for(int i=0; i<execEvent.getKeycode().length; i++){
							if(event.keyCode==execEvent.getKeycode()[i]) {
								execEvent.getExecutionAction().run();
								execEvent.setActionExecuted(true);
								event.doit=false;
							}

						}
					}
				});

				if(execDefinition.getControl() instanceof Combo) {

					execDefinition.addSelectionListener(new Listener() {
						public void handleEvent(Event event) {
							Debug.out("EXECUTION");
							execEvent.getExecutionAction().run();
							execEvent.setActionExecuted(true);
						}
					});

				}

				executionMap.put(execDefinition, execEvent);

				Debug.out(execEvent.getExecutionAction().getId(), executionMap.size());

			}else{
				throw new Exception("EXECUTION ALREADY REGISTERED: "+execDefinition.getId());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}





	/*
	 * Unregister
	 */
	public static void unregister(Control control) {

		Iterator<ExecutionDefinition> iterator=executionMap.keySet().iterator();
		while(iterator.hasNext()) {

			ExecutionDefinition execDefinition=iterator.next();

			if(execDefinition.getControl().equals(control)){

				ExecutionEvent execEvent=executionMap.get(execDefinition);

				execDefinition.removeListeners();
				iterator.remove();

				Debug.out(execEvent.getExecutionAction().getId(), executionMap.size());
			}

		}

	}





	/*
	 * Executions
	 */
	public static void notifyDependentExecutions(String id, String secondaryId) {

		Iterator<ExecutionDefinition> iterator=executionMap.keySet().iterator();
		while(iterator.hasNext()) {

			ExecutionDefinition execDefinition=iterator.next();

			if(ObjectUtils.equals(id, execDefinition.getId()) &&
					ObjectUtils.equals(secondaryId, execDefinition.getSecondaryId())) {

				ExecutionEvent execEvent=executionMap.get(execDefinition);
				if(execEvent.getResponseAction()!=null && execEvent.isActionExecuted()) {

					execEvent.getResponseAction().run();
					execEvent.setActionExecuted(false);

					if(execEvent.getPostresponseAction()!=null)
						execEvent.getPostresponseAction().run();
				}
			}
		}
	}


	private static boolean hasDependentExecutions(String id, String secondaryId) {

		Iterator<ExecutionDefinition> iterator=executionMap.keySet().iterator();
		while(iterator.hasNext()) {

			ExecutionDefinition execDefinition=iterator.next();
			ExecutionEvent execEvent=executionMap.get(execDefinition);

			if(execDefinition!=null && execEvent!=null &&
				execEvent.getPostresponseAction()!=null &&
				ObjectUtils.equals(id, execDefinition.getId()) &&
				ObjectUtils.equals(secondaryId, execDefinition.getSecondaryId()))
				return true;
		}

		return false;
	}


}
