/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import java.lang.reflect.Method;

public final class ClassUtils {

	public static Class classForName(String className) {
		try{
			return Class.forName(className);
		}catch(ClassNotFoundException e){
			Debug.err(e);
		}return null;
	}


	public static Object getField(Class klass, String field) {
		try{
			return klass.getField(field).get(klass);
		}catch (NoClassDefFoundError e){
			System.err.print("CLASS NOT FOUND "+klass.getCanonicalName()+"."+field);
		}catch(NoSuchFieldException e){
			System.err.print("FIELD NOT FOUND "+klass.getCanonicalName()+"."+field);
		}catch(IllegalAccessException e){
			System.err.print("ILLEGAL ACCESS "+klass.getCanonicalName()+"."+field);
		}catch(ExceptionInInitializerError e) {
			System.err.print("INITIALIZER ERROR "+klass.getCanonicalName()+"."+field);
		}return null;
	}


	/** Create a new instance of the given class */
	public static <T> T newInstance(Class<? extends T> klass, Class<? extends T> subclass) {

		if (klass!=null) try{
			Class<? extends T> targetClass=klass.asSubclass(subclass);
			return targetClass.newInstance();
		}catch(InstantiationException e){
			Debug.err(e);
		}catch(IllegalAccessException e){
			Debug.err(e);
		}return null;

	}


	/** Create a new instance of the given class */
	public static <T> T newInstance(Class<? extends T> klass) {

		return newInstance(klass, klass);

	}


	/** Create a new instance of the given class */
	public static <T> T newInstance(String className) {

		Class<T> klass=classForName(className);

		return newInstance(klass, klass);

	}


	public static Object invoke(String className, String methodName, Class[] parameterTypes, Object...args) throws Exception {

		Class klass=classForName(className);

		Method method=klass.getDeclaredMethod(methodName, parameterTypes);

		return method.invoke(klass, args);

	}

	public static Object invoke(String className, String methodName, Object...args) throws Exception {

		int index=0;
		Class[] parameterTypes=new Class[args.length];
		for(Object obj: args){
			parameterTypes[index++]=obj.getClass();
		}

		return invoke(className, methodName, parameterTypes, args);

	}


	public static void main(String[] args) throws Exception {

		System.out.println(newInstance(ErrorList.class));
		System.out.println(invoke("java.lang.Integer", "valueOf", "10"));

	}


}
