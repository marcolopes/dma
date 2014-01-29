/*******************************************************************************
 * 2010-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import java.util.Arrays;
import java.util.List;

import org.dma.java.utils.array.ArrayUtils;
import org.dma.java.utils.array.CollectionUtils;
import org.eclipse.swt.widgets.Composite;

public class CustomSWTList extends org.eclipse.swt.widgets.List {

	//subclassing
	protected void checkSubclass() {}

	public CustomSWTList(Composite parent, int style){
		super(parent, style);
	}


	public void insert(String[] array, int index) {

		List<String> list=ArrayUtils.toList(getItems());
		list.addAll(index, Arrays.asList(array));
		setItems(CollectionUtils.toArray(list,String.class));

	}


	public void remove(int[] indexes) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.remove(list, indexes);
		setItems(CollectionUtils.toArray(list,String.class));

	}


	public void moveDown(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveDown(list, indexes, position);
		setItems(CollectionUtils.toArray(list,String.class));

	}


	public void moveUp(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveUp(list, indexes, position);
		setItems(CollectionUtils.toArray(list,String.class));

	}


}
