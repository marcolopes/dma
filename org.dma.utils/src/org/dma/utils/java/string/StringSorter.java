package org.dma.utils.java.string;

import java.util.Comparator;

public class StringSorter implements Comparator<String> {


	public int compare(String str1, String str2){
		return str1.compareTo(str2);
	}


}
