/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractStreamCopy {

	public abstract boolean cancel();

	/** Streams must be closed by caller */
	public void copy(InputStream in, OutputStream out) throws IOException, InterruptedException {

		byte[] buf=new byte[1024];

		int len;
		// Transfer bytes from input to output
		while(!cancel() && (len=in.read(buf)) > 0){
			out.write(buf, 0, len);
		}

		if (cancel()) throw new InterruptedException();

	}


}
