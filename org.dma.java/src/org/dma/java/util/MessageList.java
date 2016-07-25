/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public class MessageList extends LinkedHashSet<String> {

	private static final long serialVersionUID = 1L;

	public MessageList(String...message) {
		this(Arrays.asList(message));
	}

	public MessageList(Collection<String> message) {
		super(message);
	}

	public MessageList() {
		super();
	}


	public void print() {
		print(System.out);
	}


	public void print(OutputStream out) {
		if (!isEmpty()) try{
			out.write(toString().getBytes());
		}catch(IOException e){
			System.out.println(e);
		}
	}


	public void add(String prefix, String message) {
		add(prefix+": "+message);
	}


	@Override
	public String[] toArray() {
		return CollectionUtils.toArray(this, String.class);
	}


	@Override
	public String toString() {
		return ArrayUtils.concat(toArray(), "\n");
	}


	public static void main(String[] argvs) {

		MessageList list=new MessageList("dummy one", "dummy two");
		list.add("prefix", "dummy");
		list.print();

	}


}