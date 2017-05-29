/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Debug {

	public static boolean STATUS = true;

	public static void size(Map map) {
		try{
			System.out.println("Index Size: " + map.size());
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(baos);
			oos.writeObject(map);
			oos.close();
			System.out.println("Data Size: " + baos.size());

		}catch(IOException e){
			e.printStackTrace();
		}
	}


	public static void err() {
		err(null, null, new Throwable().getStackTrace()[1]);
	}

	public static void err(String message) {
		err(message, null, new Throwable().getStackTrace()[1]);
	}

	public static void err(Object obj) {
		err(null, obj==null ? "<NULL>" : obj, new Throwable().getStackTrace()[1]);
	}

	public static void err(String message, Object obj) {
		err(message, obj==null ? "<NULL>" : obj, new Throwable().getStackTrace()[1]);
	}

	public static void err(String message, Object obj, StackTraceElement caller) {
		if (STATUS) System.err.println(log(message, obj, caller));
	}


	public static void out() {
		out(null, null, new Throwable().getStackTrace()[1]);
	}

	public static void out(String message) {
		out(message, null, new Throwable().getStackTrace()[1]);
	}

	public static void out(Object obj) {
		out(null, obj==null ? "<NULL>" : obj, new Throwable().getStackTrace()[1]);
	}

	public static void out(String message, Object obj) {
		out(message, obj==null ? "<NULL>" : obj, new Throwable().getStackTrace()[1]);
	}

	public static void out(String message, Object obj, StackTraceElement caller) {
		if (STATUS) System.out.println(log(message, obj, caller));
	}

	private static String log(String message, Object obj, StackTraceElement caller) {

		StringBuilder sb=new StringBuilder();

		try{
			sb.append(caller.getFileName());
			sb.append("(");
			sb.append(caller.getMethodName());
			sb.append(")");
			if (message!=null) sb.append(" "+message);
			if (obj!=null) sb.append(": "+obj.toString());

		}catch(Exception e){
			e.printStackTrace();
		}

		return sb.toString();

	}


}
