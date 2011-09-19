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



	public void add(String message){
		if (!messages.contains(message))
			messages.add(message);
	}

	public void add(String operation, String message){
		add(operation+": "+message);
	}

	public void addArray(String[] message){
		for(int i=0; i<message.length; i++)
			add(message[i]);
	}



	public String toString(){
		return ArrayUtils.concat(toArray(),"\n");
	}

	public String[] toArray(){
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
