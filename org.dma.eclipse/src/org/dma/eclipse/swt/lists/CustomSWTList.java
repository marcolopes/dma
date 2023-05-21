/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.MovableList;
import org.dma.java.util.RandomValue;
import org.dma.java.util.StringList;
import org.dma.java.util.StringUtils;
import org.dma.java.util.SystemUtils;

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

		StringList list=new StringList(getItems());
		list.insert(index, array);
		setItems(list.toArray());
		if (SystemUtils.IS_OS_MAC) deselectAll();
		select(index, index+array.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void remove(int[] indices) {

		MovableList<String> list=new MovableList(getItems());
		list.remove(indices);
		setItems(new StringList(list).toArray());
		if (SystemUtils.IS_OS_MAC) deselectAll();
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void moveUp(int[] indices, int position) {

		MovableList<String> list=new MovableList(getItems());
		list.moveTo(position, indices);
		setItems(new StringList(list).toArray());
		if (SystemUtils.IS_OS_MAC) deselectAll();
		select(position, position+indices.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public void moveDown(int[] indices, int position) {

		MovableList<String> list=new MovableList(getItems());
		list.moveTo(position, indices);
		setItems(new StringList(list).toArray());
		if (SystemUtils.IS_OS_MAC) deselectAll();
		select(position, position+indices.length-1);
		showSelection(); // scroll items
		notifyListeners(SWT.Selection, new Event());

	}


	public boolean canMoveUp() {
		return ArrayUtils.smaller(getSelectionIndices())>0;
	}


	public boolean canMoveDown() {
		int selectionIndex=ArrayUtils.greater(getSelectionIndices());
		return selectionIndex>=0 && selectionIndex<getItemCount()-1;
	}


	/** DEBUG */
	public void fill(int size) {
		String line=StringUtils.replicas("-", 20);
		add(line+" DUMMY ITEMS "+line);
		for (int i=getItemCount(); i<=size; i++){
			add(new RandomValue().letters(50));
		}
	}

}