/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.ui;

import java.util.List;

import org.dma.utils.eclipse.custom.CustomList;
import org.dma.utils.java.ArrayUtils;
import org.dma.utils.java.CollectionUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;

public class DoubleList {

	private CustomList leftSWTList;
	private List<String> leftList;

	private CustomList rightSWTList;
	private List<String> rightList;

	public DoubleList(){
	}


	public DoubleList(CustomList leftSWTList, List<String> leftList,
			CustomList rightSWTList, List<String> rightList){

		this.leftSWTList=leftSWTList;
		this.leftList=leftList;

		this.rightSWTList=rightSWTList;
		this.rightList=rightList;

	}


	public void insert() {

		int itemCount = rightSWTList.getItemCount();
		int[] selectionIndices = leftSWTList.getSelectionIndices();

		leftList.removeAll(CollectionUtils.insert(rightList, leftList, selectionIndices, itemCount));
		//CollectionUtils.remove(leftList, selectionIndices);
		rightSWTList.insert(leftSWTList.getSelection(), itemCount);
		leftSWTList.remove(selectionIndices);

		rightSWTList.select(itemCount, itemCount+rightSWTList.getItemCount()-1);
		rightSWTList.showSelection();
		rightSWTList.notifyListeners(SWT.Selection, new Event());

	}


	public void remove() {

		int[] selectionIndices = rightSWTList.getSelectionIndices();

		rightList.removeAll(CollectionUtils.insert(leftList, rightList, selectionIndices, 0));
		//CollectionUtils.remove(rightList, selectionIndices);
		leftSWTList.insert(rightSWTList.getSelection(), 0);
		rightSWTList.remove(selectionIndices);

		leftSWTList.select(0, selectionIndices.length-1);
		leftSWTList.showSelection();
		leftSWTList.notifyListeners(SWT.Selection, new Event());

	}


	public void moveUp() {

		int selectionCount = rightSWTList.getSelectionCount();
		int selectionIndex = ArrayUtils.smaller(rightSWTList.getSelectionIndices());
		int[] selectionIndices = rightSWTList.getSelectionIndices();

		CollectionUtils.moveUp(rightList, selectionIndices, selectionIndex-1);
		rightSWTList.moveUp(selectionIndices, selectionIndex-1 );

		rightSWTList.select(selectionIndex-1, selectionIndex+selectionCount-2);
		rightSWTList.showSelection();
		rightSWTList.notifyListeners(SWT.Selection, new Event());

	}


	public void moveDown() {

		int selectionCount = rightSWTList.getSelectionCount();
		int selectionIndex = ArrayUtils.smaller(rightSWTList.getSelectionIndices());
		int[] selectionIndices = rightSWTList.getSelectionIndices();

		CollectionUtils.moveDown(rightList, selectionIndices, selectionIndex+1);
		rightSWTList.moveDown(selectionIndices, selectionIndex+1);

		rightSWTList.select(selectionIndex+1, selectionIndex+selectionCount);
		rightSWTList.showSelection();
		rightSWTList.notifyListeners(SWT.Selection, new Event());

	}






	//getters and setters
	public CustomList getLeftSWTList() {
		return leftSWTList;
	}

	public List<String> getLeftList() {
		return leftList;
	}

	public void setLeftList(CustomList leftSWTList, List<String> leftList) {
		this.leftSWTList=leftSWTList;
		this.leftList=leftList;
	}


	public void setRightList(CustomList rightSWTList, List<String> rightList) {
		this.rightSWTList=rightSWTList;
		this.rightList=rightList;
	}

	public CustomList getRightSWTList() {
		return rightSWTList;
	}

	public List<String> getRightList() {
		return rightList;
	}


}
