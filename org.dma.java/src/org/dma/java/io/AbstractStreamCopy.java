/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractStreamCopy {

	public abstract boolean cancel();

	/** Streams must be closed by caller */
	public void copy(InputStream bis, OutputStream bos) throws Exception {

		int len;
		byte[] buf=new byte[1024];
		// Transfer bytes from input to output
		while(!cancel() && (len=bis.read(buf)) > 0){
			bos.write(buf, 0, len);
		}

		if (cancel()) throw new InterruptedException();

	}


}
