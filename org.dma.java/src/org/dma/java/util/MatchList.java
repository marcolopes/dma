/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.util.ArrayList;
import java.util.Collection;

public class MatchList extends UniqueArrayList<String> {

	private static final long serialVersionUID = 1L;

	/** Used by addAll methods */
	private Collection<String> trim(Collection<? extends String> col) {
		Collection<String> result=new ArrayList();
		for(String e: col){
			result.add(e.trim());
		}
		return result;
	}

	public MatchList() {
		super();
	}

	public MatchList(Collection<? extends String> col) {
		super.addAll(trim(col)); // avoid addAll OVERRIDE!
	}


	@Override
	public void add(int index, String e) {
		super.add(index, e.trim());
	}

	@Override
	public boolean add(String e) {
		return super.add(e.trim());
	}

	@Override
	public boolean addAll(Collection<? extends String> col) {
		return super.addAll(trim(col));
	}

	@Override
	public boolean addAll(int index, Collection<? extends String> col) {
		return super.addAll(index, trim(col));
	}

	@Override
	public String set(int index, String e) {
		return super.set(index, e.trim());
	}


	/** Checks if any element matches the given regex */
	public boolean matches(String regex) {
		for(String e: this){
			if (e.matches(regex)) return true;
		}
		return false;
	}


	/** Collection may contain REGEX elements */
	public boolean matchesAny(Collection<String> col) {
		for(String regex: col){
			if (matches(regex)) return true;
		}
		return false;
	}

}