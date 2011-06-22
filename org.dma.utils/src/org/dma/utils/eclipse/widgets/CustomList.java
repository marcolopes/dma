/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.widgets;

import java.util.List;

import org.dma.utils.java.ArrayUtils;
import org.dma.utils.java.CollectionUtils;
import org.eclipse.swt.widgets.Composite;

public class CustomList extends org.eclipse.swt.widgets.List {

	public CustomList(Composite parent, int style){
		super(parent, style);
	}


	public void insert(String[] array, int index) {

		List<String> list=ArrayUtils.toList(getItems());
		list.addAll(index, ArrayUtils.toList(array));
		setItems(CollectionUtils.toArray(list));

	}


	public void remove(int[] indexes) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.remove(list, indexes);
		setItems(CollectionUtils.toArray(list));

	}


	public void moveDown(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveDown(list, indexes, position);
		setItems(CollectionUtils.toArray(list));

	}


	public void moveUp(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveUp(list, indexes, position);
		setItems(CollectionUtils.toArray(list));

	}



	//metodos protegidos
	protected void checkSubclass() {}


}
