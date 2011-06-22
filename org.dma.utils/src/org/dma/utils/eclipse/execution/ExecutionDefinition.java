/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.execution;

import org.dma.utils.java.ObjectUtils;
import org.eclipse.swt.widgets.Control;

public class ExecutionDefinition {

	private final String srcId;
	private final String srcSecondaryId;
	private final Control srcControl;

	public ExecutionDefinition(String srcId, String srcSecondaryId, Control srcControl) {
		this.srcId=srcId;
		this.srcSecondaryId=srcSecondaryId;
		this.srcControl=srcControl;
	}


	public boolean equals(ExecutionDefinition exec) {
		if(ObjectUtils.equals(exec.getSrcId(), this.srcId) &&
				ObjectUtils.equals(exec.getSrcSecondaryId(), this.srcSecondaryId) &&
				ObjectUtils.equals(exec.getSrcControl(), this.srcControl))
			return true;

		return false;
	}


	public String toString() {
		String toString=
			"srcId: "+this.srcId + "; "+
			"srcSecondaryId: "+this.srcSecondaryId + "; "+
			"srcControl: "+srcControl.hashCode();
		return toString;
	}





	//getters and setters
	public String getSrcId() {
		return srcId;
	}

	public String getSrcSecondaryId() {
		return srcSecondaryId;
	}

	public Control getSrcControl() {
		return srcControl;
	}



}
