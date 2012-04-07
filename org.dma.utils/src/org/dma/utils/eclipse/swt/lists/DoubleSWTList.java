/*******************************************************************************
 * 2010-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.lists;

import org.dma.utils.java.array.ArrayUtils;
import org.dma.utils.java.array.CollectionUtils;
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

		int itemCount = rightList.getSWTList().getItemCount();
		int[] selectionIndices = leftList.getSWTList().getSelectionIndices();

		//leftList.getList().removeAll(CollectionUtils.insert(rightList.getList(), leftList.getList(), selectionIndices, itemCount));
		CollectionUtils.insert(rightList.getList(), leftList.getList(), selectionIndices, itemCount);
		CollectionUtils.remove(leftList.getList(), selectionIndices);
		rightList.getSWTList().insert(leftList.getSWTList().getSelection(), itemCount);
		leftList.getSWTList().remove(selectionIndices);

		rightList.getSWTList().select(itemCount, itemCount+rightList.getSWTList().getItemCount()-1);
		rightList.getSWTList().showSelection();
		rightList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}


	public void remove() {

		int[] selectionIndices = rightList.getSWTList().getSelectionIndices();

		//rightList.getList().removeAll(CollectionUtils.insert(leftList.getList(), rightList.getList(), selectionIndices, 0));
		CollectionUtils.insert(leftList.getList(), rightList.getList(), selectionIndices, 0);
		CollectionUtils.remove(rightList.getList(), selectionIndices);
		leftList.getSWTList().insert(rightList.getSWTList().getSelection(), 0);
		rightList.getSWTList().remove(selectionIndices);

		leftList.getSWTList().select(0, selectionIndices.length-1);
		leftList.getSWTList().showSelection();
		leftList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}


	public void moveUp() {

		int selectionCount = rightList.getSWTList().getSelectionCount();
		int selectionIndex = ArrayUtils.smaller(rightList.getSWTList().getSelectionIndices());
		int[] selectionIndices = rightList.getSWTList().getSelectionIndices();

		CollectionUtils.moveUp(rightList.getList(), selectionIndices, selectionIndex-1);
		rightList.getSWTList().moveUp(selectionIndices, selectionIndex-1 );

		rightList.getSWTList().select(selectionIndex-1, selectionIndex+selectionCount-2);
		rightList.getSWTList().showSelection();
		rightList.getSWTList().notifyListeners(SWT.Selection, new Event());

	}


	public void moveDown() {

		int selectionCount = rightList.getSWTList().getSelectionCount();
		int selectionIndex = ArrayUtils.smaller(rightList.getSWTList().getSelectionIndices());
		int[] selectionIndices = rightList.getSWTList().getSelectionIndices();

		CollectionUtils.moveDown(rightList.getList(), selectionIndices, selectionIndex+1);
		rightList.getSWTList().moveDown(selectionIndices, selectionIndex+1);

		rightList.getSWTList().select(selectionIndex+1, selectionIndex+selectionCount);
		rightList.getSWTList().showSelection();
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
