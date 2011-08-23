/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package dma.utils.eclipse.swt.custom;

import java.util.List;

import org.eclipse.swt.widgets.Composite;

import dma.utils.java.ArrayUtils;
import dma.utils.java.CollectionUtils;

public class CustomList extends org.eclipse.swt.widgets.List {

	//subclassing
	protected void checkSubclass() {}


	public CustomList(Composite parent, int style) {
		super(parent, style);
	}


	public void insert(String[] array, int index) {

		List<String> list=ArrayUtils.toList(getItems());
		list.addAll(index, ArrayUtils.toList(array));
		setItems(CollectionUtils.toStringArray(list));

	}


	public void remove(int[] indexes) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.remove(list, indexes);
		setItems(CollectionUtils.toStringArray(list));

	}


	public void moveDown(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveDown(list, indexes, position);
		setItems(CollectionUtils.toStringArray(list));

	}


	public void moveUp(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveUp(list, indexes, position);
		setItems(CollectionUtils.toStringArray(list));

	}


}
