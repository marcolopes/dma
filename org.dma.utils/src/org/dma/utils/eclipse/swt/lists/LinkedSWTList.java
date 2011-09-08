/*******************************************************************************
 * 2010-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.lists;

import java.util.List;

public class LinkedSWTList {

	private CustomSWTList SWTList;
	private List<String> list;

	public LinkedSWTList(){
	}


	public LinkedSWTList(CustomSWTList SWTList, List<String> list){

		this.SWTList=SWTList;
		this.list=list;

	}





	/*
	 * Getters and setters
	 */
	public CustomSWTList getSWTList() {
		return SWTList;
	}

	public void setSWTList(CustomSWTList sWTList) {
		SWTList = sWTList;
	}


	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}


}
