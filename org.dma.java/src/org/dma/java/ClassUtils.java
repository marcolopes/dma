/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java;


public final class ClassUtils {

	/**
	 * Create a new instance of the given class.
	 * MyClass mc=newInstance(MyClass.class, "some.common.prefix.MyClass");
	 *
	 * @param type the target type
	 * @param className the class to create an instance of
	 * @return the new instance
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static <T> T newInstance(Class<? extends T> type, String className) throws
		ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class<?> klass=Class.forName(className);
		Class<? extends T> targetClass=klass.asSubclass(type);

		return targetClass.newInstance();

	}


	public static void main(String[] args) throws Exception {

		Command instance=newInstance(
				Command.class, "org.dma.java.utils.Command");

		System.out.println(instance);

	}


}
