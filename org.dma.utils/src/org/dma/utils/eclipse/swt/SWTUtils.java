/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import java.io.ByteArrayInputStream;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class SWTUtils {


	public static Image createImage(byte[] array){

		return new Image(Display.getDefault(), new ByteArrayInputStream(array));

	}

}