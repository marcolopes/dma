/*******************************************************************************
 * Copyright 2008-2015 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.util;

import java.util.ArrayList;

public class PagedList<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	private int index=0;
	private int count=0;

	public void home() {
		index=0;
	}

	public void next() {
		int index=this.index+count;
		this.index=index>=size() ? size() : index;
	}

	public void previous() {
		int index=this.index-count;
		this.index=index<=0 ? 0 : index;
	}

	public boolean hasNext() {
		return count>0 && index+count<size();
	}

	public boolean hasPrevious() {
		return count>0 && index>0;
	}



	/*
	 * Getters and setters
	 */
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index=index;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count=count;
	}


}
