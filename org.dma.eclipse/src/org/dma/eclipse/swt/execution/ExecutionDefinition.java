/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Listener;

public class ExecutionDefinition {

	private final Control control;
	private final String id;
	private final String secondaryId;

	private Listener selectionListener;
	private KeyListener keyListener;

	public ExecutionDefinition(Control control, String id, String secondaryId) {
		this.control=control;
		this.id=id;
		this.secondaryId=secondaryId;
	}



	/*
	 * Listeners
	 */
	public void addSelectionListener(Listener selectionListener) {
		this.selectionListener=selectionListener;
		control.addListener(SWT.Selection, selectionListener);
	}

	public void addKeyListener(KeyListener keyListener) {
		this.keyListener=keyListener;
		control.addKeyListener(keyListener);
	}

	public void removeListeners() {
		if(selectionListener!=null) control.removeListener(SWT.Selection, selectionListener);
		if(keyListener!=null) control.removeKeyListener(keyListener);
	}



	/*
	 * Getters and setters
	 */
	public Control getControl() {
		return control;
	}

	public String getId() {
		return id;
	}

	public String getSecondaryId() {
		return secondaryId;
	}



	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public int hashCode() {
		return control.hashCode() +
				(id==null ? 0 : id.hashCode()) +
				(secondaryId==null ? 0 : secondaryId.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}


}
