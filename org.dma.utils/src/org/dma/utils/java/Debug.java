/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

import java.awt.Toolkit;
import java.util.Date;

import org.dma.utils.java.numeric.IntegerUtils;

public class Debug {

	/*
	 * Tipos (podem ser misturados)
	 */
	public static final int TYPE_NONE = 0;
	public static final int TYPE_DEBUG = 1;
	public static final int TYPE_WARNING = 2;
	public static final int TYPE_INFO = 4;
	public static final int TYPE_ALL = TYPE_DEBUG + TYPE_WARNING + TYPE_INFO;

	/*
	 * Level
	 */
	public static final int LEVEL_BASIC = 0;
	public static final int LEVEL_COMPLETE = 1;

	/*
	 * Configuracao
	 */
	public static int TYPE = TYPE_WARNING + TYPE_INFO;
	public static int LEVEL = LEVEL_BASIC;

	private static StackTraceElement caller; //stack trace

	/*
	 * Debug
	 */
	public static void debug(String message) {
		System.out.println("### "+message+" ###");
	}


	public static boolean isType(int type) {
		return IntegerUtils.bit(TYPE, type);
	}



	/*
	 * Info
	 */
	public static void info() {
		if (TYPE!=TYPE_NONE){
			caller = new Throwable().getStackTrace()[1];
			info2(null,null);
		}
	}


	public static void info(Object obj) {
		if (TYPE!=TYPE_NONE){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			info2(null,obj);
		}
	}


	public static void info(Object obj1, Object obj2) {
		if (TYPE!=TYPE_NONE){
			caller = new Throwable().getStackTrace()[1];
			if (obj1==null) obj1="<NULL>";
			info2(obj1.toString(),obj2);
		}
	}




	/*
	 * Warning
	 */
	public static void warning(String message) {
		if (TYPE!=TYPE_NONE){
			caller = new Throwable().getStackTrace()[1];
			warning2(message,null);
		}
	}


	public static void warning(Object obj) {
		if (TYPE!=TYPE_NONE){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			warning2(null,obj);
		}
	}


	public static void warning(String message, Object obj) {
		if (TYPE!=TYPE_NONE){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			warning2(message,obj);
		}
	}




	/*
	 * Privados
	 */
	private static void warning2(String message, Object obj) {
		if (IntegerUtils.bit(TYPE, TYPE_WARNING)){
			String logMessage=getMessage("### WARNING ### "+message,obj);
			System.out.println(logMessage);
			Toolkit.getDefaultToolkit().beep();
		}
	}


	private static void info2(String message, Object obj) {
		if (IntegerUtils.bit(TYPE, TYPE_INFO)){
			String logMessage=getMessage(message,obj);
			System.out.println(logMessage);
		}
	}


	private static String getMessage(String message, Object obj) {

		String logMessage="";
		try{
			switch(LEVEL){

			case LEVEL_BASIC:
				logMessage=caller.getFileName()+
				"; "+ caller.getMethodName();
				if (message!=null) logMessage+="; "+ message;
				if (obj!=null) logMessage+=": "+obj.toString();
				break;

			case LEVEL_COMPLETE:
				logMessage=new Date()+
				"; CLASSE: " + caller.getClassName()+
				"; METODO: " + caller.getMethodName()+
				"; LINHA: " + caller.getLineNumber();
				if (message!=null) logMessage+="; MENSAGEM: " + message;
				if (obj!=null) logMessage+=", Valor: "+obj.toString();
				break;
			}

		} catch (Exception e){
			e.printStackTrace();
		}

		return logMessage;

	}


}
