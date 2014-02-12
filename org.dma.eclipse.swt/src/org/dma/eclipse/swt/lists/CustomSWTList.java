/*******************************************************************************
 * 2010-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import java.util.Arrays;
import java.util.List;

import org.dma.java.utils.array.ArrayUtils;
import org.dma.java.utils.array.CollectionUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;

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
		deselectAll(); // needed in MAC
		select(index, index+array.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void remove(int[] indexes) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.remove(list, indexes);
		setItems(CollectionUtils.toArray(list,String.class));
		deselectAll(); // needed in MAC
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void moveUp(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveUp(list, indexes, position);
		setItems(CollectionUtils.toArray(list,String.class));
		deselectAll(); // needed in MAC
		select(position, position+indexes.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void moveDown(int[] indexes, int position) {

		List<String> list=ArrayUtils.toList(getItems());
		CollectionUtils.moveDown(list, indexes, position);
		setItems(CollectionUtils.toArray(list,String.class));
		deselectAll(); // needed in MAC
		select(position, position+indexes.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public boolean canMoveUp() {
		return ArrayUtils.smaller(getSelectionIndices())>0;
	}


	public boolean canMoveDown() {
		return ArrayUtils.greater(getSelectionIndices())+1<getItemCount();
	}


}