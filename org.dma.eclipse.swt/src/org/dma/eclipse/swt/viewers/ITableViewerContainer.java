/*******************************************************************************
 * 2010-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.Collection;

public interface ITableViewerContainer {

	public Object getNewObject();

	public void createObject();

	public void insertObject();

	public void removeObject();

	public void copyObject();

	public void editObject();

	public int getNumberOfObjects();

	public Collection retrieveObjects();

	public void updateTable();

	public void moveSelectionUp(boolean wrap);

	public void moveSelectionDown(boolean wrap);

}
