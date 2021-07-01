/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public class MessageList extends LinkedHashSet<String> {

	private static final long serialVersionUID = 1L;

	@Deprecated
	public MessageList(Exception e) {
		this(e.getMessage());
	}

	public MessageList(String...message) {
		this(Arrays.asList(message));
	}

	public MessageList(Collection<String> message) {
		super(message);
	}

	public MessageList() {
		super();
	}


	/** Throws exception if NOT empty */
	public void throwException() throws Exception {
		if (!isEmpty()) throw new Exception(toString());
	}

	public void print() {
		print(System.out);
	}

	public void print(OutputStream out) {
		if (!isEmpty()) try{
			String message=toString()+"\n";
			out.write(message.getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	public boolean add(Collection<? extends String> col) {
		return addAll(col);
	}

	/** "prefix: message" */
	public MessageList add(String prefix, String message) {
		add(prefix+": "+message);
		return this;
	}

	public MessageList add(Throwable e) {
		add(e.getMessage()==null ? e.toString() : e.getMessage());
		return this;
	}


	@Override
	public String[] toArray() {
		return StringList.valueOf(this).toArray();
	}

	@Override
	public String toString() {
		return ArrayUtils.concat(toArray(), "\n");
	}

	public String toString(String separator) {
		return ArrayUtils.concat(toArray(), separator);
	}


	public static void main(String[] argvs) {

		MessageList list=new MessageList("dummy one", "dummy two");
		list.add("prefix", "dummy");
		list.print();

	}


}