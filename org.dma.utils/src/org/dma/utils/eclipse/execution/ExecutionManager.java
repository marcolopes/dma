/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dma.utils.eclipse.Debug;
import org.dma.utils.java.ObjectUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ExecutionManager {

	private static final Map<ExecutionDefinition, ExecutionEvent> executionMap=new HashMap();


	//register
	public static void registerExecution(Control srcControl, int keycode, String srcId, String srcSecondaryId, Action action, Action responseAction, Action postresponseAction) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(srcId,srcSecondaryId,srcControl);
		ExecutionEvent execEvent=new ExecutionEvent(action,responseAction,postresponseAction,keycode);
		registerExecution(execDefinition, execEvent);
	}


	public static void registerExecution(Control srcControl, int keycode, String srcId, Action action, Action responseAction, Action postresponseAction) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(srcId,null,srcControl);
		ExecutionEvent execEvent=new ExecutionEvent(action,responseAction,postresponseAction,keycode);
		registerExecution(execDefinition, execEvent);
	}


	public static void registerExecution(Control srcControl, int keycode, Action action) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(null,null,srcControl);
		ExecutionEvent execEvent=new ExecutionEvent(action,null,null,keycode);
		registerExecution(execDefinition, execEvent);
	}


	public static void registerExecution(Control srcControl, Action action) {
		ExecutionDefinition execDefinition=new ExecutionDefinition(null,null,srcControl);
		ExecutionEvent execEvent=new ExecutionEvent(action,null,null,-1);
		registerExecution(execDefinition, execEvent);
	}


	private static void registerExecution(ExecutionDefinition execDefinition, final ExecutionEvent execEvent) {

		if(!executionMap.containsKey(execDefinition)) {

			if(execDefinition.getSrcControl() instanceof Combo) {

				Listener selectionListener=new Listener() {

					public void handleEvent(Event event) {
						Debug.info("### EXECUTION ###");
						execEvent.getExecutionAction().run();
						execEvent.setActionExecuted(true);
					}
				};

				execDefinition.getSrcControl().addListener(SWT.Selection,selectionListener);
				execEvent.setSelectionListener(selectionListener);

			}else{

				KeyListener keyListener=new KeyAdapter()  {

					public void keyPressed(KeyEvent event) {
						if(event.keyCode==execEvent.getKeycode()) {
							execEvent.getExecutionAction().run();
							execEvent.setActionExecuted(true);
							event.doit=false;
						}
					}
				};

				execDefinition.getSrcControl().addKeyListener(keyListener);
				execEvent.setKeyListener(keyListener);
			}

			executionMap.put(execDefinition, execEvent);

			debug(execEvent);

		}else
			Debug.warning("EXECUTION ALREADY REGISTERED", execDefinition.getSrcId());

	}






	//unregister
	public static void unregisterExecution(Control srcControl) {

		List<ExecutionDefinition> keys=new ArrayList();

		//percorre as execucoes
		Iterator<ExecutionDefinition> iterator=executionMap.keySet().iterator();
		while(iterator.hasNext()) {

			ExecutionDefinition execDefinition=iterator.next();

			//encontra execucoes com o mesmo control
			if(execDefinition.getSrcControl().equals(srcControl))
				keys.add(execDefinition);
		}

		for(int i=0; i<keys.size(); i++){

			ExecutionDefinition execDefinition=keys.get(i);
			ExecutionEvent execEvent=executionMap.get(execDefinition);

			if(execEvent.getSelectionListener()!=null)
				execDefinition.getSrcControl().removeListener(SWT.Selection, execEvent.getSelectionListener());

			if(execEvent.getModifyListener()!=null)
				execDefinition.getSrcControl().removeListener(SWT.Modify, execEvent.getModifyListener());

			if(execEvent.getKeyListener()!=null)
				execDefinition.getSrcControl().removeKeyListener(execEvent.getKeyListener());

			executionMap.remove(execDefinition);

			debug(execEvent);
		}

	}


	public static void notifyDependentExecutions(String srcId, String srcSecondaryId) {

		Iterator<ExecutionDefinition> iterator=executionMap.keySet().iterator();
		while(iterator.hasNext()) {

			ExecutionDefinition execDefinition=iterator.next();

			if(ObjectUtils.equals(srcId, execDefinition.getSrcId()) &&
					ObjectUtils.equals(srcSecondaryId, execDefinition.getSrcSecondaryId())) {

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


	private static boolean hasDependentExecutions(String srcId, String srcSecondaryId) {

		Iterator<ExecutionDefinition> iterator=executionMap.keySet().iterator();
		while(iterator.hasNext()) {

			ExecutionDefinition execDefinition=iterator.next();
			ExecutionEvent execEvent=executionMap.get(execDefinition);

			if(execDefinition!=null && execEvent!=null &&
				execEvent.getPostresponseAction()!=null &&
				ObjectUtils.equals(srcId, execDefinition.getSrcId()) &&
				ObjectUtils.equals(srcSecondaryId, execDefinition.getSrcSecondaryId()))

				return true;
		}

		return false;
	}



	private static void debug(final ExecutionEvent execEvent) {

		Debug.info(execEvent.getExecutionAction()+"/"+
				execEvent.getKeycode()+": "+executionMap.size());

	}


}
