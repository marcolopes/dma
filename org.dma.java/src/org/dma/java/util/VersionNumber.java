/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.util;

import org.osgi.framework.Version;

public final class VersionNumber {

	public static VersionNumber valueOf(String version) {
		String[] array=StringUtils.split(version, ".");
		int major=array.length>0 ? StringUtils.val(StringUtils.numbers(array[0])) : 0;
		int minor=array.length>1 ? StringUtils.val(StringUtils.numbers(array[1])) : 0;
		int micro=array.length>2 ? StringUtils.val(StringUtils.numbers(array[2])) : 0;
		int build=array.length>3 ? StringUtils.val(StringUtils.numbers(array[3])) : 0;
		return new VersionNumber(major, minor, micro, build);
	}

	public final int major;
	public final int minor;
	public final int micro;
	public final int build;

	public VersionNumber(Version version) {
		this(version, StringUtils.val(version.getQualifier()));
	}

	public VersionNumber(Version version, int build) {
		this(version.getMajor(), version.getMinor(), version.getMicro(), build);
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
	 * TRUE if the current version is SMALLER;
	 * FALSE if the current version is EQUAL of GREATER
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
