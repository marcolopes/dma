/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Map;

public class Debug {

	public static boolean STATUS = true;

	public static final int LEVEL_BASIC = 0;
	public static final int LEVEL_COMPLETE = 1;
	public static int LEVEL = LEVEL_BASIC;

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


	public static void out() {
		if (STATUS){
			StackTraceElement caller = new Throwable().getStackTrace()[1];
			log(null, null, caller);
		}
	}

	public static void out(String message) {
		if (STATUS){
			StackTraceElement caller = new Throwable().getStackTrace()[1];
			log(message, null, caller);
		}
	}

	public static void out(Object obj) {
		if (STATUS){
			StackTraceElement caller = new Throwable().getStackTrace()[1];
			log(null, obj==null?"<NULL>":obj, caller);
		}
	}

	public static void out(String message, Object obj) {
		if (STATUS){
			StackTraceElement caller = new Throwable().getStackTrace()[1];
			log(message, obj==null?"<NULL>":obj, caller);
		}
	}


	private static void log(String message, Object obj, StackTraceElement caller) {

		String logMessage="";

		try{
			switch (LEVEL){

			case LEVEL_BASIC:
				logMessage=caller.getFileName()+
				"; "+ caller.getMethodName();
				if (message!=null) logMessage+="; "+ message;
				if (obj!=null) logMessage+=": "+obj.toString();
				break;

			case LEVEL_COMPLETE:
				logMessage=new Date()+
				"; CLASS: " + caller.getClassName()+
				"; METHOD: " + caller.getMethodName()+
				"; LINE: " + caller.getLineNumber();
				if (message!=null) logMessage+="; MENSAGEM: " + message;
				if (obj!=null) logMessage+=", Valor: "+obj.toString();
				break;
			}

		} catch (Exception e){
			e.printStackTrace();
		}

		System.out.println(logMessage);

	}


}
