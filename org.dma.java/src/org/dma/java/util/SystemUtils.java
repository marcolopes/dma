/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

public class SystemUtils {

	/** @see org.apache.commons.lang.SystemUtils#OS_VERSION */
	public static final String OS_VERSION = org.apache.commons.lang.SystemUtils.OS_VERSION;
	/** @see org.apache.commons.lang.SystemUtils#OS_NAME */
	public static final String OS_NAME = org.apache.commons.lang.SystemUtils.OS_NAME;

	/** @see org.apache.commons.lang.SystemUtils#OS_ARCH */
	public static final String OS_ARCH = org.apache.commons.lang.SystemUtils.OS_ARCH;
	/** Is true if this is a 64 bits Operating System */
	public static final boolean IS_OS_ARCH_64 = IS_OS_ARCH_64();

	/** @see org.apache.commons.lang.SystemUtils#IS_OS_WINDOWS */
	public static final boolean IS_OS_WINDOWS = org.apache.commons.lang.SystemUtils.IS_OS_WINDOWS;
	/** @see org.apache.commons.lang.SystemUtils#IS_OS_WINDOWS_7 */
	public static final boolean IS_OS_WINDOWS_7 = org.apache.commons.lang.SystemUtils.IS_OS_WINDOWS_7;
	/** Is true if this is Windows 64 bits */
	public static final boolean IS_OS_WINDOWS_ARCH_64 = IS_OS_WINDOWS && IS_OS_ARCH_64;
	/** Is true if this is Windows 32 bits */
	public static final boolean IS_OS_WINDOWS_ARCH_32 = IS_OS_WINDOWS && !IS_OS_ARCH_64;

	/** @see org.apache.commons.lang.SystemUtils#IS_OS_LINUX */
	public static final boolean IS_OS_LINUX = org.apache.commons.lang.SystemUtils.IS_OS_LINUX;
	/** Is true if this is Linux 64 bits */
	public static final boolean IS_OS_LINUX_ARCH_64 = IS_OS_LINUX && IS_OS_ARCH_64;
	/** Is true if this is Linux 32 bits */
	public static final boolean IS_OS_LINUX_ARCH_32 = IS_OS_LINUX && !IS_OS_ARCH_64;

	/** @see org.apache.commons.lang.SystemUtils#IS_OS_MAC */
	public static final boolean IS_OS_MAC = org.apache.commons.lang.SystemUtils.IS_OS_MAC;
	/** Is true if this is MAC 64 bits */
	public static final boolean IS_OS_MAC_ARCH_64 = IS_OS_MAC && IS_OS_ARCH_64;
	/** Is true if this is MAC 32 bits */
	public static final boolean IS_OS_MAC_ARCH_32 = IS_OS_MAC && !IS_OS_ARCH_64;

	/** @see org.apache.commons.lang.SystemUtils#JAVA_VERSION */
	public static final String JAVA_VERSION = org.apache.commons.lang.SystemUtils.JAVA_VERSION;
	/** Java runtime name (ARCH + VERSION) */
	public static final String JAVA_NAME = "Java "+JAVA_VERSION+" "+OS_NAME;

	/** Java runtime architecture */
	public static final String JAVA_ARCH = System.getProperty("sun.arch.data.model");
	/** Is true if this is Java 64 bits */
	public static final boolean IS_JAVA_ARCH_64 = JAVA_ARCH!=null && JAVA_ARCH.endsWith("64");

	/*
	 * https://stackoverflow.com/questions/4748673/how-can-i-check-the-bitness-of-my-os-using-java-j2se-not-os-arch
	 */
	private static boolean IS_OS_ARCH_64() {
		String ARCHITECTURE=System.getenv("PROCESSOR_ARCHITECTURE");
		String ARCHITEW6432=System.getenv("PROCESSOR_ARCHITEW6432");
		return ARCHITECTURE!=null && ARCHITECTURE.endsWith("64") ||
				ARCHITEW6432!=null && ARCHITEW6432.endsWith("64") || OS_ARCH.endsWith("64");
	}

}
