/*******************************************************************************
 * 2010-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import org.dma.java.util.StringUtils;

import org.eclipse.swt.widgets.List;

public class ListUtils {

	public static void fill(List list, int size) {

		String line=StringUtils.replicate('-',20);
		list.add(line+" DUMMY ITEMS "+line);
		for (int i=0; i<=size-list.getItemCount(); i++){
			list.add(i+": "+StringUtils.randomLetters(50));
		}

	}

}
