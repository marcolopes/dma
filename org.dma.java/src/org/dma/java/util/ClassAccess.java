/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

public class ClassAccess {

	public static final String CLASS_NOT_FOUND = "CLASS NOT FOUND";
	public static final String FIELD_NOT_FOUND = "FIELD NOT FOUND";
	public static final String ILLEGAL_ACCESS = "ILLEGAL ACCESS";
	public static final String INITIALIZER_ERROR = "INITIALIZER ERROR";

	public static ErrorList error=new ErrorList();

	public static Object get(Class klass, String field) {
		try{
			return klass.getField(field).get(klass);
		}
		catch (NoClassDefFoundError e){
			error.addError(CLASS_NOT_FOUND+" "+klass.getCanonicalName()+"."+field);

		}catch(NoSuchFieldException e){
			error.addError(FIELD_NOT_FOUND+" "+klass.getCanonicalName()+"."+field);

		}catch(IllegalAccessException e){
			error.addError(ILLEGAL_ACCESS+" "+klass.getCanonicalName()+"."+field);

		}catch(ExceptionInInitializerError e) {
			error.addError(INITIALIZER_ERROR+" "+klass.getCanonicalName()+"."+field);
		}

		return null;

	}


}
