/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public abstract class AbstractFileCopy {

	public abstract boolean cancel();

	public final String src;

	public AbstractFileCopy(String src) {
		this.src=src;
	}


	private void close(Closeable resource) {
		try{
			resource.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}


	private void copy(InputStream bis, OutputStream bos) throws Exception {

		try{
			int len;
			byte[] buf = new byte[1024];
			// Transfer bytes from input to output
			while(!cancel() && (len = bis.read(buf)) > 0){
				bos.write(buf, 0, len);
			}

			if (cancel()) throw new InterruptedException();

		}finally{
			close(bos);
			close(bis);
		}

	}


	/**
	 * Copies a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if copy was completed;
	 * FALSE if canceled or error
	 */
	public boolean copyTo(File dst) {

		if (!new File(src).equals(dst)) try{

			InputStream bis =
					new BufferedInputStream(
							new FileInputStream(src));

			final OutputStream bos =
					new BufferedOutputStream(
							new FileOutputStream(dst));

			copy(bis, bos);

			return true;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	/**
	 * Downloads a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean downloadTo(String dst) {

		try{
			URLConnection urlConn = new URL(src).openConnection();
			urlConn.setDoInput(true); //input connection
			urlConn.setUseCaches(false); //avoid a cached file

			BufferedInputStream bis =
					new BufferedInputStream(
							urlConn.getInputStream());

			final OutputStream bos =
					new BufferedOutputStream(
							new FileOutputStream(dst));

			copy(bis, bos);

			return true;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


}
