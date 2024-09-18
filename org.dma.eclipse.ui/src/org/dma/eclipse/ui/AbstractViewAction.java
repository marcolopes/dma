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
 *******************************************************************************/
package org.dma.eclipse.ui;

import org.dma.eclipse.jface.CustomAction;
import org.dma.eclipse.jface.dialogs.message.ErrorDialog;
import org.dma.eclipse.ui.internal.UIHelper2;
import org.dma.java.util.Debug;
import org.dma.java.util.MessageList;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;

public abstract class AbstractViewAction extends CustomAction {

	public abstract void initialize(IViewPart view);

	private IViewPart view;

	private final String viewId, secondaryId;

	public AbstractViewAction(IViewReference viewReference) {
		this(viewReference.getId(), viewReference.getSecondaryId());
	}

	public AbstractViewAction(String viewId, String secondaryId) {
		super(viewId);
		this.viewId=viewId.replace(":", "+");
		this.secondaryId=secondaryId==null ? null : secondaryId.replace(":", "+");
	}

	@Override
	public void run() {
		run(false);
	}

	public IViewPart run(final boolean detach) {
		UIHelper.showBusyWhile(new Runnable() {
			@Override
			public void run() {
				Debug.err(viewId, secondaryId);
				try{initialize(view=UIHelper.openView(viewId, secondaryId));
					if (detach) UIHelper2.detachView(view);
					else UIHelper.showView(view);
					view.setFocus();
				}catch(Exception e){
					e.printStackTrace();
					ErrorDialog.open(new MessageList(e));
				}
			}
		});return view;
	}


	public void closeView() {
		if (view==null) throw new UnsupportedOperationException("View is closed!");
		UIHelper.hideView(view);
		//view.dispose();
		view=null;
	}


}