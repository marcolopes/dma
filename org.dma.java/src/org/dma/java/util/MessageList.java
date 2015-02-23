/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public class MessageList extends LinkedHashSet<String> {

	private static final long serialVersionUID = 1L;

	public MessageList(String[] message) {
		this(Arrays.asList(message));
	}

	public MessageList(Collection<String> message) {
		super(message);
	}

	public MessageList() {
		super();
	}


	public void print() {
		if (!isEmpty()) System.out.println(toString());
	}


	public void add(String source, String message) {
		add(source+": "+message);
	}


	public void add(String...message) {
		add(new MessageList(message));
	}


	public void add(MessageList list) {
		for(String message: list){
			add(message);
		}
	}


	@Override
	public String[] toArray() {
		return CollectionUtils.toArray(this, String.class);
	}


	@Override
	public String toString() {
		return ArrayUtils.concat(toArray(), "\n");
	}


}