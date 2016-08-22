/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.Arrays;
import java.util.Collection;

public class MatchList extends UniqueArrayList<String> {

	private static final long serialVersionUID = 1L;

	/** Element trim */
	@Override
	public boolean add(String e) {
		return super.add(e.trim());
	}

	public final String message;

	public MatchList(String message, String...array) {
		this(message, Arrays.asList(array));
	}

	public MatchList(String message, Collection<String> col) {
		super(col);
		this.message=message;
	}


	/** Checks if any element matches the given regex */
	public boolean matches(String regex) {
		Debug.out("SEARCHING "+regex, super.toString());
		for(String e: this){
			Debug.out("CHECKING", e);
			if (e.matches(regex)) return true;
		}
		Debug.out("NOT FOUND", regex);
		return false;
	}


	/** Collection may contain REGEX elements */
	public boolean matchesAny(Collection<String> col) {
		for(String regex: col){
			if (matches(regex)) return true;
		}
		return false;
	}



	/*
	 * (non-Javadoc)
	 * @see java.util.AbstractCollection
	 */
	@Override
	public String toString() {
		return "message = "+message+
				"\nlist = "+super.toString();
	}

}