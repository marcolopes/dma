/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import java.util.List;

import org.dma.utils.eclipse.swt.custom.CustomSWTList;

public class LinkedSWTList {

	private CustomSWTList SWTList;
	private List<String> list;

	public LinkedSWTList(){
	}


	public LinkedSWTList(CustomSWTList SWTList, List<String> list){

		this.SWTList=SWTList;
		this.list=list;

	}





	//getters and setters
	public CustomSWTList getSWTList() {
		return SWTList;
	}

	public List<String> getList() {
		return list;
	}


}
