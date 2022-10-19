/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.dma.java.input.FieldFormat.SEPARATOR;

public class MessageList extends LinkedHashSet<String> {

	private static final long serialVersionUID = 1L;

	public MessageList(Throwable e) {
		this(e.getMessage()==null ? e.toString() : e.getMessage());
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
			out.write(toString().concat(SEPARATOR.LINE.value).getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	/** @see Collection#addAll(Collection) */
	public boolean add(Collection<? extends String> col) {
		return addAll(col);
	}

	public MessageList add(String prefix, String message) {
		add(prefix+": "+message);
		return this;
	}

	/** @see MessageList#add(String, String) */
	public MessageList add(String prefix, Throwable e) {
		return add(prefix, e.getMessage()==null ? e.toString() : e.getMessage());
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
		return toString(SEPARATOR.LINE.value);
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