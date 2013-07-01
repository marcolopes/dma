/*******************************************************************************
 * 2010-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import org.dma.java.utils.array.ArrayUtils;
import org.dma.java.utils.array.CollectionUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;

public class DoubleSWTList {

	private LinkedSWTList leftList;
	private LinkedSWTList rightList;

	public DoubleSWTList(){
	}


	public DoubleSWTList(LinkedSWTList leftList, LinkedSWTList rightList){

		this.leftList=leftList;
		this.rightList=rightList;

	}


	public void insert() {

		int[] selectionIndices = leftList.getSWTList().getSelectionIndices();
		int itemCount = rightList.getSWTList().getItemCount();

		//leftList.getList().removeAll(CollectionUtils.insert(rightList.getList(), leftList.getList(), selectionIndices, itemCount));
		CollectionUtils.insert(rightList.getList(), leftList.getList(), selectionIndices, itemCount);
		CollectionUtils.remove(leftList.getList(), selectionIndices);

		rightList.getSWTList().insert(leftList.getSWTList().getSelection(), itemCount);
		rightList.getSWTList().deselectAll(); // needed in MAC
		rightList.getSWTList().select(itemCount, itemCount+rightList.getSWTList().getItemCount()-1);
		rightList.getSWTList().showSelection(); // scroll items

		leftList.getSWTList().remove(selectionIndices);
		leftList.getSWTList().deselectAll(); // needed in MAC
		leftList.getSWTList().showSelection(); // scroll items
		leftList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}


	public void remove() {

		int[] selectionIndices = rightList.getSWTList().getSelectionIndices();

		//rightList.getList().removeAll(CollectionUtils.insert(leftList.getList(), rightList.getList(), selectionIndices, 0));
		CollectionUtils.insert(leftList.getList(), rightList.getList(), selectionIndices, 0);
		CollectionUtils.remove(rightList.getList(), selectionIndices);

		leftList.getSWTList().insert(rightList.getSWTList().getSelection(), 0);
		leftList.getSWTList().deselectAll(); // needed in MAC
		leftList.getSWTList().select(0, selectionIndices.length-1);
		leftList.getSWTList().showSelection(); // scroll items

		rightList.getSWTList().remove(selectionIndices);
		rightList.getSWTList().deselectAll(); // needed in MAC
		rightList.getSWTList().showSelection(); // scroll items
		rightList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}


	public void moveUp() {

		int[] selectionIndices = rightList.getSWTList().getSelectionIndices();
		int selectionIndex = ArrayUtils.lesser(selectionIndices);
		int selectionCount = selectionIndices.length;
		//int selectionCount = rightList.getSWTList().getSelectionCount();

		CollectionUtils.moveUp(rightList.getList(), selectionIndices, selectionIndex-1);

		rightList.getSWTList().moveUp(selectionIndices, selectionIndex-1);
		rightList.getSWTList().deselectAll(); // needed in MAC
		rightList.getSWTList().select(selectionIndex-1, selectionIndex+selectionCount-2);
		rightList.getSWTList().showSelection(); // scroll items
		rightList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}


	public void moveDown() {

		int[] selectionIndices = rightList.getSWTList().getSelectionIndices();
		int selectionIndex = ArrayUtils.lesser(selectionIndices);
		int selectionCount = selectionIndices.length;
		//int selectionCount = rightList.getSWTList().getSelectionCount();

		CollectionUtils.moveDown(rightList.getList(), selectionIndices, selectionIndex+1);

		rightList.getSWTList().moveDown(selectionIndices, selectionIndex+1);
		rightList.getSWTList().deselectAll(); // needed in MAC
		rightList.getSWTList().select(selectionIndex+1, selectionIndex+selectionCount);
		rightList.getSWTList().showSelection(); // scroll items
		rightList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}





	/*
	 * Getters and setters
	 */
	public LinkedSWTList getLeftList() {
		return leftList;
	}

	public void setLeftList(LinkedSWTList leftList) {
		this.leftList = leftList;
	}


	public LinkedSWTList getRightList() {
		return rightList;
	}

	public void setRightList(LinkedSWTList rightList) {
		this.rightList = rightList;
	}


}
