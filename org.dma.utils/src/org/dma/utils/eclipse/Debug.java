/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse;

import java.util.Date;

import org.dma.utils.java.numeric.IntegerUtils;

public class Debug {

	/*
	 * Tipos (podem ser misturados)
	 */
	public static final int TYPE_NONE = 0;
	public static final int TYPE_WARNING = 1;
	public static final int TYPE_INFO = 2;

	/*
	 * Level
	 */
	public static final int LEVEL_NONE = 0;
	public static final int LEVEL_BASIC = 1;
	public static final int LEVEL_COMPLETE = 2;

	/*
	 * Configuracao
	 */
	public static int TYPE = TYPE_WARNING + TYPE_INFO;
	public static int LEVEL = LEVEL_BASIC;

	//stack trace
	private static StackTraceElement caller;


	// Info
	public static void info() {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			info2("",null);
		}
	}


	public static void info(String message) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			info2(message,null);
		}
	}


	public static void info(Object obj) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			info2("",obj);
		}
	}


	public static void info(String message, Object obj) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			info2(message,obj);
		}
	}




	// Warning
	public static void warning(String message) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			warning2(message,null);
		}
	}


	public static void warning(Object obj) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			warning2("",obj);
		}
	}


	public static void warning(String message, Object obj) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			warning2(message,obj);
		}
	}




	/*
	 * Metodos privados
	 */
	private static void warning2(String message, Object obj) {
		if (IntegerUtils.bit(TYPE, TYPE_WARNING)){
			String logMessage=getMessage("###WARNING### "+message,obj);
			System.out.println(logMessage);
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
		try {
			switch(LEVEL){

			case LEVEL_BASIC:
				logMessage=caller.getFileName()+
				"; "+ caller.getMethodName()+
				"; "+ message;
				if (obj!=null) logMessage+=": "+obj.toString();
				break;

			case LEVEL_COMPLETE:
				logMessage=new Date()+
				"; CLASSE: " + caller.getClassName()+
				"; METODO: " + caller.getMethodName()+
				"; LINHA: " + caller.getLineNumber()+
				"; MENSAGEM: " + message;
				if (obj!=null) logMessage+=", Valor: "+obj.toString();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return logMessage;

	}




	//getters and setters
	public static boolean isOn() {
		return LEVEL!=LEVEL_NONE;
	}


}
