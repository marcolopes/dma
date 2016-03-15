/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import org.dma.java.io.Command;

public final class ClassUtils {

	/** Create a new instance of the given class */
	public static <T> T newInstance(Class<? extends T> type, String className) {
		Class<?> klass=getClass(className);
		if (klass!=null) try{
			Class<? extends T> targetClass=klass.asSubclass(type);
			return targetClass.newInstance();
		}
		catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}
		return null;
	}


	public static Class<?> getClass(String className) {
		try{
			return Class.forName(className);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}


	public static void main(String[] args) throws Exception {

		Command instance=newInstance(
				Command.class, "org.dma.java.utils.Command");

		System.out.println(instance);

	}


}
