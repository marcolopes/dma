/*******************************************************************************
 * 2010-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.viewers;

import java.util.Collection;

public interface ITableViewerContainer {

	public Object getNewObject() throws Exception;

	public void createObject() throws Exception;

	public void insertObject() throws Exception;

	public void removeObject();

	public void copyObject();

	public void editObject();

	public int getNumberOfObjects();

	public Collection retrieveObjects();

	public void updateTable();

}
