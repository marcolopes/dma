/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractStreamCopy {

	public abstract boolean cancel();

	protected void close(Closeable resource) {
		try{
			resource.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}


	public void copy(InputStream bis, OutputStream bos) throws Exception {

		try{
			int len;
			byte[] buf=new byte[1024];
			// Transfer bytes from input to output
			while(!cancel() && (len=bis.read(buf)) > 0){
				bos.write(buf, 0, len);
			}

			if (cancel()) throw new InterruptedException();

		}finally{
			close(bos);
			close(bis);
		}

	}


}
