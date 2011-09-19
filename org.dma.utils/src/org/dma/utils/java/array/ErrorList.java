/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.array;

import java.util.ArrayList;
import java.util.List;

public class ErrorList {

	private final List<String> errors=new ArrayList();


	public ErrorList(){
	}


	public void clearErrors(){
		errors.clear();
	}

	public void printErrors() {
		if (hasErrors())
			System.out.println(getErrorMessage());
	}



	public void addError(String message){
		if (!errors.contains(message))
			errors.add(message);
	}

	public void addError(String operation, String message){
		addError(operation+": "+message);
	}

	public void addErrorArray(String[] message){
		for(int i=0; i<message.length; i++)
			addError(message[i]);
	}



	public String getErrorMessage(){
		return ArrayUtils.concat(getErrorArray(),"\n");
	}

	public String[] getErrorArray(){
		return CollectionUtils.toStringArray(errors);
	}




	/*
	 * Getters and setters
	 */
	public boolean hasErrors(){
		return errors.size()!=0;
	}

	public List<String> getErrors() {
		return errors;
	}


}
