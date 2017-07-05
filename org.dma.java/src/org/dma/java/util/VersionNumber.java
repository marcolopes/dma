/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

public final class VersionNumber {

	public final int major;
	public final int minor;
	public final int macro;
	public final int build;

	public VersionNumber(int major, int minor) {
		this(major, minor, 0);
	}

	public VersionNumber(int major, int minor, int macro) {
		this(major, minor, macro, 0);
	}

	public VersionNumber(int major, int minor, int macro, int build) {
		this.major=major;
		this.minor=minor;
		this.macro=macro;
		this.build=build;
	}

	public VersionNumber(String version) {
		String[] array=ArrayUtils.numbers(StringUtils.split(version, "."));
		major=array.length>0 ? StringUtils.val(array[0]) : 0;
		minor=array.length>1 ? StringUtils.val(array[1]) : 0;
		macro=array.length>2 ? StringUtils.val(array[2]) : 0;
		build=array.length>3 ? StringUtils.val(array[3]) : 0;
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
		}
		return false; //equal!
	}


	public int[] toArray() {
		return new int[]{major, minor, macro, build};
	}


	public String toString(int length) {
		StringBuilder result=new StringBuilder();
		int[] values=toArray();
		for(int i=0; i<length; i++){
			if (result.length()>0) result.append('.');
			result.append(values[i]);
		}
		return result.toString();
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
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof VersionNumber)
			return equals((VersionNumber)obj);
		return equals(obj.toString());
	}

	public boolean equals(String version) {
		return equals(new VersionNumber(version));
	}

	public boolean equals(VersionNumber version) {
		return major==version.major &&
				minor==version.minor &&
				macro==version.macro &&
				build==version.build;
	}


}
