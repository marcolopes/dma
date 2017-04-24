/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.lang.reflect.Method;

public final class MethodUtils {


	public static Object invoke(String className, String methodName, Class[] parameterTypes, Object...args) throws Exception {

		Class klass=Class.forName(className);
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

		System.out.println(
			invoke("java.lang.Integer", "valueOf", "10"));

	}


}
