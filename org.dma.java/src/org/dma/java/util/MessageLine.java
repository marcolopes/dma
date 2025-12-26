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

import java.sql.Time;
import java.util.Date;

public class MessageLine extends StringList {

	private static final long serialVersionUID = 1L;

	private static String parse(Object obj) {
		if (obj instanceof Date) return TimeDateUtils.getDateFormatted((Date)obj);
		if (obj instanceof Time) return TimeDateUtils.getTimeFormatted((Time)obj);
		if (obj instanceof Throwable){
			Throwable e=(Throwable)obj;
			return e.getMessage()==null ? e.toString() : e.getMessage();
		}return obj.toString();
	}

	public MessageLine(Object obj) {append(obj);}

	public MessageLine append(Object obj) {
		add(parse(obj));
		return this;
	}

	public MessageLine parentheses(Object obj) {
		return append("("+parse(obj)+")");
	}

	public MessageLine brackets(Object obj) {
		return append("["+parse(obj)+"]");
	}

	public MessageLine equal(Object obj) {
		return append("=").append(parse(obj));
	}

	public MessageLine notEqual(Object obj) {
		return append("<>").append(parse(obj));
	}

	public MessageLine biggerThan(Object obj) {
		return append(">").append(parse(obj));
	}

	public MessageLine smallerThan(Object obj) {
		return append("<").append(parse(obj));
	}

	public MessageLine colon() {
		return append(":");
	}

	public MessageLine dash() {
		return append("-");
	}

	public MessageLine forward() {
		return append("->");
	}

	public MessageLine back() {
		return append("<-");
	}

	public String toString(String separator) {
		return concat(separator);
	}

	@Override
	public String toString() {
		return toString(" ");
	}


}