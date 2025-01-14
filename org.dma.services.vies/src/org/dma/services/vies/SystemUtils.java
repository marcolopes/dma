package org.dma.services.vies;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class SystemUtils {

	/**
	 * <p>
	 * The <code>java.version</code> System Property. Java version number.
	 * </p>
	 *
	 * <p>
	 * Defaults to <code>null</code> if the runtime does not have
	 * security access to read this property or the property does not exist.
	 * </p>
	 *
	 * <p>
	 * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or
	 * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value
	 * will be out of sync with that System property.
	 * </p>
	 *
	 * @since Java 1.1
	 */
	public static final String JAVA_VERSION = getSystemProperty("java.version");

	/**
	 * <p>
	 * Gets the Java version as a <code>String</code> trimming leading letters.
	 * </p>
	 *
	 * <p>
	 * The field will return <code>null</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 *
	 * @since 2.1
	 */
	public static final String JAVA_VERSION_TRIMMED = getJavaVersionTrimmed();

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.1 (also 1.1.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 */
	public static final boolean IS_JAVA_1_1 = getJavaVersionMatches("1.1");

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.2 (also 1.2.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 */
	public static final boolean IS_JAVA_1_2 = getJavaVersionMatches("1.2");

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.3 (also 1.3.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 */
	public static final boolean IS_JAVA_1_3 = getJavaVersionMatches("1.3");

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.4 (also 1.4.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 */
	public static final boolean IS_JAVA_1_4 = getJavaVersionMatches("1.4");

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.5 (also 1.5.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 */
	public static final boolean IS_JAVA_1_5 = getJavaVersionMatches("1.5");

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.6 (also 1.6.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 */
	public static final boolean IS_JAVA_1_6 = getJavaVersionMatches("1.6");

	/**
	 * <p>
	 * Is <code>true</code> if this is Java version 1.7 (also 1.7.x versions).
	 * </p>
	 *
	 * <p>
	 * The field will return <code>false</code> if {@link #JAVA_VERSION} is <code>null</code>.
	 * </p>
	 *
	 * @since 2.5
	 */
	public static final boolean IS_JAVA_1_7 = getJavaVersionMatches("1.7");

	/**
	 * <p>
	 * Decides if the Java version matches.
	 * </p>
	 *
	 * @param versionPrefix
	 *            the prefix for the java version
	 * @return true if matches, or false if not or can't determine
	 */
	private static boolean getJavaVersionMatches(String versionPrefix) {
		return isJavaVersionMatch(JAVA_VERSION_TRIMMED, versionPrefix);
	}

	/**
	 * Trims the text of the java version to start with numbers.
	 *
	 * @return the trimmed java version
	 */
	private static String getJavaVersionTrimmed() {
		if (JAVA_VERSION != null) {
			for (int i = 0; i < JAVA_VERSION.length(); i++) {
				char ch = JAVA_VERSION.charAt(i);
				if (ch >= '0' && ch <= '9') {
					return JAVA_VERSION.substring(i);
				}
			}
		}
		return null;
	}

	// -----------------------------------------------------------------------
	/**
	 * <p>
	 * Gets a System property, defaulting to <code>null</code> if the property cannot be read.
	 * </p>
	 *
	 * <p>
	 * If a <code>SecurityException</code> is caught, the return value is <code>null</code> and a message is written to
	 * <code>System.err</code>.
	 * </p>
	 *
	 * @param property
	 *            the system property name
	 * @return the system property value or <code>null</code> if a security problem occurs
	 */
	private static String getSystemProperty(String property) {
		try {
			return System.getProperty(property);
		} catch (SecurityException ex) {
			// we are not allowed to look at this property
			System.err.println("Caught a SecurityException reading the system property '" + property
					+ "'; the SystemUtils property value will default to null.");
			return null;
		}
	}

	/**
	 * <p>
	 * Decides if the Java version matches.
	 * </p>
	 * <p>
	 * This method is package private instead of private to support unit test invocation.
	 * </p>
	 *
	 * @param version
	 *            the actual Java version
	 * @param versionPrefix
	 *            the prefix for the expected Java version
	 * @return true if matches, or false if not or can't determine
	 */
	static boolean isJavaVersionMatch(String version, String versionPrefix) {
		if (version == null) {
			return false;
		}
		return version.startsWith(versionPrefix);
	}

}