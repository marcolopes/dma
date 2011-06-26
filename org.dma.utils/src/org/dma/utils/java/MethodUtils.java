/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

import java.lang.reflect.Method;

public final class MethodUtils {


	public static Object invoke(String className, String methodName, Object[] args) throws Exception {

		Class[] params=new Class[args.length];
		for(int i=0; i<args.length; i++)
			params[i]=args[i].getClass();

		return invoke(className, methodName, args, params);

	}


	public static Object invoke(String className, String methodName, Object[] args, Class[] params) throws Exception {

		Class cl=Class.forName(className);
		Method method = cl.getDeclaredMethod(methodName, params);

		Object obj=cl.newInstance();
		return method.invoke(obj, args);

	}


	public static void main(String[] args) throws Exception {

		System.out.println(
			invoke("java.lang.String", "concat", new Object[]{"concat"}) );

	}


}
