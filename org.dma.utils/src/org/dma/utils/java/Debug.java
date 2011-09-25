/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

import java.awt.Toolkit;
import java.util.Date;

import org.dma.utils.java.numeric.IntegerUtils;
import org.dma.utils.java.string.StringUtils;

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

	/*
	 * Helpers
	 */
	public static void header(String message) {

		int HEADER_LENGHT = 50;

		if (message==null || message.isEmpty()){
			System.out.println(StringUtils.replicate('-',HEADER_LENGHT));
		}else{
			message="[ "+message+" ]";
			int replicas=message.length()>HEADER_LENGHT ? 0 : (HEADER_LENGHT-message.length())/2;
			System.out.println(
				StringUtils.replicate('-',replicas)+
				message+
				StringUtils.replicate('-',replicas));
		}

	}



	/*
	 * Info
	 */
	public static void info() {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			info2(null,null);
		}
	}


	public static void info(Object obj) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			if (obj==null) obj="<NULL>";
			info2(null,obj);
		}
	}


	public static void info(Object obj1, Object obj2) {
		if (isOn()){
			caller = new Throwable().getStackTrace()[1];
			if (obj1==null) obj1="<NULL>";
			info2(obj1.toString(),obj2);
		}
	}




	/*
	 * Warning
	 */
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
			warning2(null,obj);
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





	/*
	 * Getters and setters
	 */
	public static boolean isOn() {
		return LEVEL!=LEVEL_NONE;
	}


}
