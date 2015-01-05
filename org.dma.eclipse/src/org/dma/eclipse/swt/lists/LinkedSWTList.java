/*******************************************************************************
 * 2010-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.lists;

import java.util.Collection;
import java.util.LinkedList;

import org.dma.java.util.ArrayUtils;
import org.dma.java.util.CollectionUtils;

public class LinkedSWTList<T> extends LinkedList<T> {

	private static final long serialVersionUID = 1L;

	private final CustomSWTList SWTList;

	public LinkedSWTList(CustomSWTList SWTList, Collection<T> list){
		this.SWTList=SWTList;
		addAll(list);
	}


	/**
	 * Move SELECTED elements into list TOP
	 * @param into - the destination list
	 */
	public void moveToTop(LinkedSWTList into) {

		int[] selectionIndices = SWTList.getSelectionIndices();
		//CollectionUtils.insert(into, this, selectionIndices, 0);
		//CollectionUtils.remove(this, selectionIndices);
		removeAll(CollectionUtils.insert(into, this, selectionIndices, 0));
		into.getSWTList().insert(SWTList.getSelection(), 0);
		SWTList.remove(selectionIndices);

	}


	/**
	 * Move SELECTED elements into list BOTTOM
	 * @param into - the destination list
	 */
	public void moveToBottom(LinkedSWTList into) {

		int[] selectionIndices = SWTList.getSelectionIndices();
		int itemCount = into.getSWTList().getItemCount();
		//CollectionUtils.insert(into, this, selectionIndices, itemCount);
		//CollectionUtils.remove(this, selectionIndices);
		removeAll(CollectionUtils.insert(into, this, selectionIndices, itemCount));
		into.getSWTList().insert(SWTList.getSelection(), itemCount);
		SWTList.remove(selectionIndices);

	}


	/** Move SELECTED elements UP */
	public void moveUp() {

		int[] selectionIndices = SWTList.getSelectionIndices();
		int selectionIndex = ArrayUtils.smaller(selectionIndices);
		CollectionUtils.moveUp(this, selectionIndices, selectionIndex-1);
		SWTList.moveUp(selectionIndices, selectionIndex-1);

	}


	/** Move SELECTED elements DOWN */
	public void moveDown() {

		int[] selectionIndices = SWTList.getSelectionIndices();
		int selectionIndex = ArrayUtils.smaller(selectionIndices);
		CollectionUtils.moveDown(this, selectionIndices, selectionIndex+1);
		SWTList.moveDown(selectionIndices, selectionIndex+1);

	}



	/*
	 * Getters and setters
	 */
	public CustomSWTList getSWTList() {
		return SWTList;
	}


}
