/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Debug {

	public static boolean STATUS = true;

	public static String NULL = "<NULL>";

	public static void size(Map map) {
		try{
			System.out.println("Index Size: " + map.size());
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(baos);
			oos.writeObject(map);
			oos.close();
			System.out.println("Data Size: " + baos.size());

		}catch(IOException e){
			Debug.err(e);
		}
	}


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

		try{
			sb.insert(0, obj==null ? NULL :
				obj.equals(NULL) ? "" : obj.toString());
			sb.insert(0, message==null || message.isEmpty() ? "" :
				sb.length()==0 ? message : message+": ");
			sb.insert(0, caller+" ");

		}catch(Exception e){
			e.printStackTrace();
		}

		return sb.toString();

	}


}
