/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

import java.util.ArrayList;
import java.util.List;

public class ErrorList {

	private final List<String> errors=new ArrayList();


	public ErrorList(){
	}


	public void clearErrors(){
		errors.clear();
	}


	public void addError(String message){
		if (!errors.contains(message))
			errors.add(message);
	}

	public void addError(String[] message){
		for(int i=0; i<message.length; i++)
			addError(message[i]);
	}

	public void addError(String operation, String message){
		addError(operation+": "+message);
	}


	public String getMessage(){
		return ArrayUtils.concat(getMessageArray(),"\n");
	}


	public String[] getMessageArray(){
		return CollectionUtils.toStringArray(errors);
	}


	public boolean hasErrors(){
		return errors.size()!=0;
	}

	public void printErrors() {
		if (hasErrors())
			System.out.println(getMessage());
	}



	/*
	 * Getters and setters
	 */
	public List<String> getErrors() {
		return errors;
	}


}
