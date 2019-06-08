/*******************************************************************************
 * 2010-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.CollectionUtils;
import org.dma.java.util.MovableList;
import org.dma.java.util.RandomValue;
import org.dma.java.util.StringUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;

public class CustomSWTList extends org.eclipse.swt.widgets.List {

	@Override //subclassing
	protected void checkSubclass() {}

	public CustomSWTList(Composite parent, int style){
		super(parent, style);
	}


	public void insert(String[] array, int index) {

		List<String> list=new ArrayList(Arrays.asList(getItems()));
		list.addAll(index, Arrays.asList(array));
		setItems(CollectionUtils.toArray(list, String.class));
		deselectAll(); // needed in MAC
		select(index, index+array.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void remove(int[] indexes) {

		MovableList<String> list=new MovableList(Arrays.asList(getItems()));
		list.remove(indexes);
		setItems(CollectionUtils.toArray(list, String.class));
		deselectAll(); // needed in MAC
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void moveUp(int[] indexes, int position) {

		MovableList<String> list=new MovableList(Arrays.asList(getItems()));
		list.moveTo(position, indexes);
		setItems(CollectionUtils.toArray(list, String.class));
		deselectAll(); // needed in MAC
		select(position, position+indexes.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void moveDown(int[] indexes, int position) {

		MovableList<String> list=new MovableList(Arrays.asList(getItems()));
		list.moveTo(position, indexes);
		setItems(CollectionUtils.toArray(list, String.class));
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


	/** DEBUG */
	public void fill(int size) {
		String line=StringUtils.replicate('-',20);
		add(line+" DUMMY ITEMS "+line);
		for (int i=0; i<=size-getItemCount(); i++){
			add(i+": "+new RandomValue().letters(50));
		}
	}

}