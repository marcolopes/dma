/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.klass;

import org.dma.utils.java.array.ErrorList;

public class ClassAccess {

	public static final String ILLEGAL_ACCESS = "ILLEGAL ACCESS";
	public static final String INITIALIZER_ERROR = "INITIALIZER ERROR";
	public static final String FIELD_NOT_FOUND = "FIELD NOT FOUND";

	private static ErrorList error=new ErrorList();


	public static Object getField(Class cl, String field) {
		try{

			return cl.getField(field).get(cl);

		} catch (NoSuchFieldException e){
			error.addError(FIELD_NOT_FOUND+" "+cl.getCanonicalName()+"."+field);

		} catch (IllegalAccessException e){
			error.addError(ILLEGAL_ACCESS+" "+cl.getCanonicalName()+"."+field);

		} catch (ExceptionInInitializerError e) {
			error.addError(INITIALIZER_ERROR+" "+cl.getCanonicalName()+"."+field);
		}

		return null;

	}



	//getters
	public static ErrorList getError() {
		return error;
	}


}
