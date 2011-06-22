package org.dma.utils.java.file;

import java.io.File;
import java.util.Comparator;

public class FileSorter implements Comparator<File> {


	public int compare(File file1, File file2){

		Integer num1=new Integer(file1.getName().split("-")[0]);
		Integer num2=new Integer(file2.getName().split("-")[0]);

		return num1.compareTo(num2);

	}


}


