/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.viewers;

import java.util.Collection;

public interface ITableViewerContainer {

	public Collection<Object> retrieveObjects();

	public void editObject();

}
