/*******************************************************************************
 * 2010-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import java.util.Collection;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.MovableList;

public class LinkedSWTList<T> extends MovableList<T> {

	private static final long serialVersionUID = 1L;

	private final CustomSWTList SWTList;

	public LinkedSWTList(CustomSWTList SWTList) {
		super();
		this.SWTList=SWTList;
	}

	public LinkedSWTList(CustomSWTList SWTList, Collection<T> list) {
		super(list);
		this.SWTList=SWTList;
	}


	/**
	 * Move SELECTED elements to TOP
	 * @param target - the destination list
	 */
	public void moveToTop(LinkedSWTList target) {

		int[] selectionIndices = SWTList.getSelectionIndices();
		//target.insert(this, 0, selectionIndices);
		//remove(selectionIndices);
		removeAll(target.insert(this, 0, selectionIndices));
		target.getSWTList().insert(SWTList.getSelection(), 0);
		SWTList.remove(selectionIndices);

	}


	/**
	 * Move SELECTED elements to BOTTOM
	 * @param target - the destination list
	 */
	public void moveToBottom(LinkedSWTList target) {

		int[] selectionIndices = SWTList.getSelectionIndices();
		int itemCount = target.getSWTList().getItemCount();
		//target.insert(this, itemCount, selectionIndices);
		//remove(selectionIndices);
		removeAll(target.insert(this, itemCount, selectionIndices));
		target.getSWTList().insert(SWTList.getSelection(), itemCount);
		SWTList.remove(selectionIndices);

	}


	/** Move SELECTED elements UP */
	public void moveUp() {

		int[] selectionIndices = SWTList.getSelectionIndices();
		int selectionIndex = ArrayUtils.smaller(selectionIndices);
		moveTo(selectionIndex-1, selectionIndices);
		SWTList.moveUp(selectionIndices, selectionIndex-1);

	}


	/** Move SELECTED elements DOWN */
	public void moveDown() {

		int[] selectionIndices = SWTList.getSelectionIndices();
		int selectionIndex = ArrayUtils.smaller(selectionIndices);
		moveTo(selectionIndex+1, selectionIndices);
		SWTList.moveDown(selectionIndices, selectionIndex+1);

	}



	/*
	 * Getters and setters
	 */
	public CustomSWTList getSWTList() {
		return SWTList;
	}


}
