/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import org.osgi.framework.Version;

public final class VersionNumber {

	public static VersionNumber valueOf(String version) {
		int i=0;
		int[] array={0,0,0,0};
		for(String element: StringUtils.split(version, ".")){
			array[i++]=StringUtils.val(StringUtils.numbers(element));
		}return new VersionNumber(array[0], array[1], array[2], array[3]);
	}

	public final int major;
	public final int minor;
	public final int micro;
	public final int build;

	public VersionNumber(Version version) {
		this(version.getMajor(), version.getMinor(), version.getMicro(), StringUtils.val(version.getQualifier()));
	}

	public VersionNumber(int major) {
		this(major, 0);
	}

	public VersionNumber(int major, int minor) {
		this(major, minor, 0);
	}

	public VersionNumber(int major, int minor, int micro) {
		this(major, minor, micro, 0);
	}

	public VersionNumber(int major, int minor, int micro, int build) {
		this.major=major;
		this.minor=minor;
		this.micro=micro;
		this.build=build;
	}


	/**
	 * Checks if the current version is smaller
	 * @return
	 * true if the current version is SMALLER<br>
	 * false if the current version is EQUAL of GREATER
	 */
	public boolean smallerThan(VersionNumber version) {
		Debug.out(version);
		int[] THIS=toArray();
		int[] OTHER=version.toArray();
		//major to minor
		for (int i=0; i<THIS.length; i++){
			if (THIS[i]>OTHER[i]) return false;
			if (THIS[i]<OTHER[i]) return true;
		}return false; //equal!
	}


	public int[] toArray() {
		return new int[]{major, minor, micro, build};
	}


	public String toString(int length) {
		StringBuilder sb=new StringBuilder();
		int[] values=toArray();
		for(int i=0; i<length && i<values.length; i++){
			if (sb.length()>0) sb.append('.');
			sb.append(values[i]);
		}return sb.toString();
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return toString(4);
	}

	@Override
	public int hashCode() {
		return major + minor + micro + build;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VersionNumber) return equals((VersionNumber)obj);
		return equals(obj.toString());
	}

	public boolean equals(String version) {
		return equals(VersionNumber.valueOf(version));
	}

	public boolean equals(VersionNumber version) {
		return major==version.major &&
				minor==version.minor &&
				micro==version.micro &&
				build==version.build;
	}


}
