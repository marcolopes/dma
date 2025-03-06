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

public class ErrorList {

	private final MessageList errors=new MessageList();
	private final MessageList warnings=new MessageList();

	public MessageList errors() {return errors;}
	public MessageList warnings() {return warnings;}

	public ErrorList() {}

	/** Clears ERRORS and WARNINGS */
	public void clear() {
		errors.clear();
		warnings.clear();
	}

	/** Prints ERRORS and WARNINGS */
	public ErrorList print() {
		errors.print();
		warnings.print();
		return this;
	}

	/** Adds ERRORS and WARNINGS */
	public ErrorList add(ErrorList list) {
		errors.addAll(list.errors);
		warnings.addAll(list.warnings);
		return this;
	}

	public ErrorList prefix(String prefix) {
		ErrorList list=new ErrorList();
		list.errors.addAll(errors.prefix(prefix));
		list.warnings.addAll(warnings.prefix(prefix));
		return list;
	}


}