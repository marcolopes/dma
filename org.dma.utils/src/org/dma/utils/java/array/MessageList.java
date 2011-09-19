/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.array;

import java.util.ArrayList;
import java.util.List;

public class MessageList {

	private final List<String> messages=new ArrayList();


	public MessageList(){
	}


	public void clear(){
		messages.clear();
	}

	public void print() {
		if (hasMessages())
			System.out.println(toString());
	}



	public void addMessage(String message){
		if (!messages.contains(message))
			messages.add(message);
	}

	public void add(String operation, String message){
		addMessage(operation+": "+message);
	}

	public void addMessageArray(String[] message){
		for(int i=0; i<message.length; i++)
			addMessage(message[i]);
	}



	public String toMessageString(){
		return ArrayUtils.concat(toMessageArray(),"\n");
	}

	public String[] toMessageArray(){
		return CollectionUtils.toStringArray(messages);
	}




	/*
	 * Getters and setters
	 */
	public boolean hasMessages(){
		return messages.size()!=0;
	}

	public List<String> getMessages() {
		return messages;
	}


}
