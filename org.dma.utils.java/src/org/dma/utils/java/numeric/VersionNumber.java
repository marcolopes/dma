/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.numeric;

import org.dma.utils.java.Debug;
import org.dma.utils.java.array.ArrayUtils;

public final class VersionNumber {

	public final int major;
	public final int minor;
	public final int macro;

	public VersionNumber(int major, int minor, int macro){
		this.major = major;
		this.minor = minor;
		this.macro = macro;
	}

	public VersionNumber(String version) {
		String[] array=ArrayUtils.numbers(version.split("\\."));
		major=array.length>=0 ? Integer.valueOf(array[0]) : 0;
		minor=array.length>=1 ? Integer.valueOf(array[1]) : 0;
		macro=array.length>=2 ? Integer.valueOf(array[2]) : 0;
	}


	/**
	 * Checks if the current version is smaller than VERSION
	 * @return
	 * true - if the current version is SMALLER<br>
	 * false - if the current version is EQUAL of GREATER<br>
	 */
	public boolean smallerThan(VersionNumber version) {

		Debug.out(version);

		if (major>version.major)
			return false;
		else if (major<version.major)
			return true;
		else if (minor>version.minor)
			return false;
		else if (minor<version.minor)
			return true;
		else if (macro>version.macro)
			return false;
		else if (macro<version.macro)
			return true;

		return false; //equal!

	}


	public boolean equals(VersionNumber version) {
		return major==version.major &&
				minor==version.minor &&
				macro==version.macro;
	}


	public int[] toArray(){
		return new int[]{major,minor,macro};
	}


	public String toString(){
		return String.valueOf(major)+"."+
			String.valueOf(minor)+"."+
			String.valueOf(macro);
	}


}
