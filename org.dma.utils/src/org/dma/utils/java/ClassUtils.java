/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java;

public final class ClassUtils {

	/**
	 * Create a new instance of the given class.
	 * My my = newInstance(My.class, "some.common.prefix.MyClass");
	 *
	 * @param <T>
	 *            target type
	 * @param type
	 *            the target type
	 * @param className
	 *            the class to create an instance of
	 * @return the new instance
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static <T> T newInstance(Class<? extends T> type, String className) throws
	        ClassNotFoundException,
	        InstantiationException,
	        IllegalAccessException {

	    Class<?> clazz = Class.forName(className);
	    Class<? extends T> targetClass = clazz.asSubclass(type);
	    T result = targetClass.newInstance();

	    return result;

	}


}
