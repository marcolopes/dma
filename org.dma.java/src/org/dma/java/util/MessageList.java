/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.dma.java.input.FieldFormat.SEPARATOR;

public class MessageList extends ArrayList<MessageLine> {

	private static final long serialVersionUID = 1L;

	public void print() {print(System.out);}

	public void print(OutputStream out) {
		if (!isEmpty()) try{
			out.write(toString().concat(SEPARATOR.LINE.value).getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public MessageList() {}
	public MessageList(Throwable t) {add(t);}
	public MessageList(String...array) {this(new StringList(array));}
	public MessageList(StringList list) {for(String string: list) add(string);}

	private MessageList append(Object obj) {
		add(new MessageLine(obj));
		return this;
	}

	public MessageList add(Throwable t) {return append(t);}
	public MessageList add(String string) {return append(string);}
	public boolean add(MessageList list) {return addAll(list);}

	/** Returns a new list */
	public MessageList prefix(String prefix) {
		MessageList list=new MessageList();
		for(MessageLine line: this){
			list.append(new MessageLine(line).addPrefix(": ").addPrefix(prefix));
		}return list;
	}


	/** Throws exception if NOT empty */
	public void throwException() throws Exception {
		if (!isEmpty()) throw new Exception(toString());
	}

	public String toString(String separator) {
		Set<String> col=new LinkedHashSet(size());
		for(MessageLine line: this){
			col.add(line.toString());
		}return new StringList(col).concat(separator);
	}

	@Override
	public String toString() {
		return toString(SEPARATOR.LINE.value);
	}


	public static void main(String[] args) {

		MessageList list=new MessageList("dummy one", "dummy two");
		list.prefix("prefix").print();
		list.print();

	}


}