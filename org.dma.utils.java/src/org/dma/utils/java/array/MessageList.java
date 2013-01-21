/*******************************************************************************
 * 2008-2012 Public Domain
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

	public void add(String source, String message){
		add(source+": "+message);
	}

	public void add(String[] message){
		for(int i=0; i<message.length; i++)
			add(message[i]);
	}

	public void add(MessageList list){
		add(list.toArray());
	}




	public String[] toArray(){
		return CollectionUtils.toArray(messages,String.class);
	}

	public String toString(){
		return ArrayUtils.concat(toArray(),"\n");
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
