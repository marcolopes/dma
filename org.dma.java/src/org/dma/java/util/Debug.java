/*******************************************************************************
 * Copyright 2008-2019 Marco Lopes (marcolopespt@gmail.com)
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

public class Debug {

	public static boolean STATUS = true;

	public static String NULL = "<NULL>";

	public static void err() {
		err(null, NULL, new Throwable().getStackTrace()[1]);
	}

	public static void err(String message) {
		err(message, NULL, new Throwable().getStackTrace()[1]);
	}

	public static void err(Object obj) {
		err(null, obj, new Throwable().getStackTrace()[1]);
	}

	public static void err(String message, Object obj) {
		err(message, obj, new Throwable().getStackTrace()[1]);
	}

	private static void err(String message, Object obj, StackTraceElement caller) {
		if (STATUS) System.err.println(log(message, obj, caller));
	}


	public static void out() {
		out(null, NULL, new Throwable().getStackTrace()[1]);
	}

	public static void out(String message) {
		out(message, NULL, new Throwable().getStackTrace()[1]);
	}

	public static void out(Object obj) {
		out(null, obj, new Throwable().getStackTrace()[1]);
	}

	public static void out(String message, Object obj) {
		out(message, obj, new Throwable().getStackTrace()[1]);
	}

	private static void out(String message, Object obj, StackTraceElement caller) {
		if (STATUS) System.out.println(log(message, obj, caller));
	}


	private static String log(String message, Object obj, StackTraceElement caller) {

		StringBuilder sb=new StringBuilder();

		try{sb.insert(0, obj==null ? NULL : obj.equals(NULL) ? "" : obj.toString()).
			insert(0, message==null || message.isEmpty() ? "" : sb.length()==0 ? message : message+": ").
			insert(0, caller.toString());

		}catch(Exception e){
			e.printStackTrace();
		}return sb.toString();

	}


}
