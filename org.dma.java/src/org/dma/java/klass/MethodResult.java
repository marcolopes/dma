/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.klass;

public class MethodResult {

	public boolean value;

	/** Return value = false */
	public MethodResult(){
		this(false);
	}

	public MethodResult(boolean value){
		this.value=value;
	}

}
