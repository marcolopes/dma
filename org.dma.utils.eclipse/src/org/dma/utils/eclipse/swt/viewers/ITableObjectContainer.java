/*******************************************************************************
 * 2010-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.viewers;

public interface ITableObjectContainer {

	public Object getNewObject();

	public boolean verifyObject();

	public void insertObject();

	public boolean postInsertObject();

	public void removeObject();

	public boolean postRemoveObject();

	public Object retrievePreviousObject();

	public Object retrieveNextObject();

	public void navigateToNewObject();

	public void navigateToObject(Object object, String command);


}
