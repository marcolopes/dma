/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.widgets;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class CustomTableColumn extends TableColumn {

	@Override //subclassing
	protected void checkSubclass() {}

	private int widthPercentage=0;

	public int getWidthPercentage() {return widthPercentage;}
	public void setWidthPercentage(int widthPercentage) {this.widthPercentage=widthPercentage;}

	/** @see TableColumn#TableColumn(Table, int) */
	public CustomTableColumn(Table parent, int style) {
		super(parent, style);
	}


}