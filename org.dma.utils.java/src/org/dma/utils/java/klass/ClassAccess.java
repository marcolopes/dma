/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.klass;

import org.dma.utils.java.array.ErrorList;

public class ClassAccess {

	public static final String CLASS_NOT_FOUND = "CLASS NOT FOUND";
	public static final String FIELD_NOT_FOUND = "FIELD NOT FOUND";
	public static final String ILLEGAL_ACCESS = "ILLEGAL ACCESS";
	public static final String INITIALIZER_ERROR = "INITIALIZER ERROR";

	private static ErrorList error=new ErrorList();

	public static Object getField(Class cl, String field) {
		try{

			return cl.getField(field).get(cl);

		}
		catch (NoClassDefFoundError e){
			error.getErrors().add(CLASS_NOT_FOUND+" "+cl.getCanonicalName()+"."+field);

		}catch (NoSuchFieldException e){
			error.getErrors().add(FIELD_NOT_FOUND+" "+cl.getCanonicalName()+"."+field);

		}catch (IllegalAccessException e){
			error.getErrors().add(ILLEGAL_ACCESS+" "+cl.getCanonicalName()+"."+field);

		}catch (ExceptionInInitializerError e) {
			error.getErrors().add(INITIALIZER_ERROR+" "+cl.getCanonicalName()+"."+field);
		}

		return null;

	}



	/*
	 * Getters and setters
	 */
	public static ErrorList getError() {
		return error;
	}


}
