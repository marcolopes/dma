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

import java.util.ArrayList;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.bindings.keys.KeyStroke;

public class ExecutionEvent extends ArrayList<IAction> {

	private static final long serialVersionUID = 1L;

	public ExecutionEvent addResponse(IAction action) {
		super.add(action);
		return this;
	}

	private final KeyStroke[] keycode;
	private final IAction action;
	private boolean executed=false;

	public boolean isExecuted() {return executed;}

	public KeyStroke[] getKeycode() {return keycode;}
	public IAction getAction() {return action;}

	public ExecutionEvent(KeyStroke[] keycode, IAction action) {
		this.keycode=keycode;
		this.action=action;
	}


	public void execute() {
		action.run();
		executed=true;
	}


	public void executeResponse() {
		for(IAction action: this) action.run();
		executed=false;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return action.getId();
	}


}
