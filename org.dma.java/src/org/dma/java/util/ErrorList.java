/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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

	public ErrorList() {}

	public ErrorList(Exception e) {
		addError(e.getMessage());
	}


	/** Clears ERRORS and WARNINGS */
	public void clear() {
		errors.clear();
		warnings.clear();
	}

	/** Prints ERRORS and WARNINGS */
	public void print() {
		errors.print();
		warnings.print();
	}

	/** Adds ERRORS and WARNINGS */
	public void add(ErrorList list) {
		errors.addAll(list.errors);
		warnings.addAll(list.warnings);
	}


	/*
	 * Errors
	 */
	public void addError(String prefix, String message) {
		errors.add(prefix, message);
	}

	public void addError(String message) {
		errors.add(message);
	}

	public void addError(Exception e) {
		errors.add(e);
	}

	public MessageList errors() {
		return errors;
	}


	/*
	 * Warnings
	 */
	public void addWarning(String prefix, String message) {
		warnings.add(prefix, message);
	}

	public void addWarning(String message) {
		warnings.add(message);
	}

	public void addWarning(Exception e) {
		warnings.add(e);
	}

	public MessageList warnings() {
		return warnings;
	}


}
