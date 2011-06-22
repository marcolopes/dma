/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.execution;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Listener;

public class ExecutionEvent {

	private final Action executionAction;
	private final Action responseAction;
	private final Action postresponseAction;
	private final int keycode;

	private Listener selectionListener;
	private Listener modifyListener;
	private KeyListener keyListener;

	private boolean actionExecuted=false;

	public ExecutionEvent(Action executionAction, Action responseAction, Action postresponseAction, int keycode) {
		this.executionAction=executionAction;
		this.responseAction=responseAction;
		this.postresponseAction=postresponseAction;
		this.keycode=keycode;
	}



	//getters and setters
	public Action getExecutionAction() {
		return executionAction;
	}

	public Action getResponseAction() {
		return responseAction;
	}

	public Action getPostresponseAction() {
		return postresponseAction;
	}

	public int getKeycode() {
		return keycode;
	}

	public Listener getSelectionListener() {
		return selectionListener;
	}

	public void setSelectionListener(Listener Listener) {
		this.selectionListener = Listener;
	}

	public Listener getModifyListener() {
		return modifyListener;
	}

	public void setModifyListener(Listener Listener) {
		this.modifyListener = Listener;
	}

	public KeyListener getKeyListener() {
		return keyListener;
	}

	public void setKeyListener(KeyListener keyListener) {
		this.keyListener = keyListener;
	}

	public boolean isActionExecuted() {
		return actionExecuted;
	}

	public void setActionExecuted(boolean actionExecuted) {
		this.actionExecuted = actionExecuted;
	}


}
