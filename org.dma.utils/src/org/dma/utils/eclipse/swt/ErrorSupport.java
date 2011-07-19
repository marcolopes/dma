/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.java.ArrayUtils;
import org.dma.utils.java.CollectionUtils;

public class ErrorSupport {

	private final List<String> errors=new ArrayList();


	public ErrorSupport(){
	}


	public void clearErrors(){
		errors.clear();
	}


	public boolean showErrors(){
		if (hasErrors()) DialogHandler.error(getMessage());
		return hasErrors();
	}


	public void printErrors() {
		if (hasErrors()) System.out.println(getMessage());
	}


	public String getMessage(){
		return ArrayUtils.concat(getMessageArray(),"\n");
	}


	public String[] getMessageArray(){
		return CollectionUtils.toStringArray(errors);
	}


	public void addError(String[] message){
		for(int i=0; i<message.length; i++)
			addError(message[i]);
	}


	public void addError(String operation, String message){
		addError(operation+": "+message);
	}


	public void addError(String message){
		if (!errors.contains(message))
			errors.add(message);
	}


	public boolean hasErrors(){
		return errors.size()!=0;
	}


}
