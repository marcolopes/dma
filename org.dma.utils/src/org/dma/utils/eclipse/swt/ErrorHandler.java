/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import org.dma.utils.java.ErrorList;

public class ErrorHandler {

	public static void show(ErrorList error){

		if (error.hasErrors())
			DialogHandler.error(error.getMessage());

	}


}
