/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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

public class ErrorList {

	private final MessageList warnings=new MessageList();
	private final MessageList errors=new MessageList();

	public MessageList warnings() {return warnings;}
	public MessageList errors() {return errors;}

	public ErrorList() {}

	/** Clears ERRORS and WARNINGS */
	public void clear() {
		warnings.clear();
		errors.clear();
	}

	/** Prints ERRORS and WARNINGS */
	public ErrorList print() {
		warnings.print();
		errors.print(System.err);
		return this;
	}

	/** Adds ERRORS and WARNINGS */
	public ErrorList add(ErrorList list) {
		warnings.addAll(list.warnings);
		errors.addAll(list.errors);
		return this;
	}

	public ErrorList prefix(String prefix) {
		ErrorList list=new ErrorList();
		list.warnings.addAll(warnings.prefix(prefix));
		list.errors.addAll(errors.prefix(prefix));
		return list;
	}


}