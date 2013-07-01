/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.array;
import java.util.LinkedHashSet;

public class MessageList extends LinkedHashSet<String>{

	private static final long serialVersionUID = 1L;

	public MessageList(){
	}


	public void print() {
		if (hasMessages())
			System.out.println(toString());
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
		return CollectionUtils.toArray(this,String.class);
	}


	public String toString(){
		return ArrayUtils.concat(toArray(),"\n");
	}



	/*
	 * Getters and setters
	 */
	public boolean hasMessages(){
		return size()!=0;
	}


}