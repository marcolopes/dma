/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public abstract class AbstractURLFileCopy extends AbstractStreamCopy {

	public final String src;

	public AbstractURLFileCopy(String src) {
		this.src=src;
	}


	protected InputStream getInputStream(String url) throws Exception {

		URLConnection conn=new URL(url).openConnection();
		conn.setDoInput(true); //input connection
		conn.setDoOutput(false); //output connection
		conn.setUseCaches(false); //avoid a cached file

		return conn.getInputStream();

	}


	protected OutputStream getOutputStream(String url) throws Exception {

		URLConnection conn=new URL(url).openConnection();
		conn.setDoInput(false); //input connection
		conn.setDoOutput(true); //output connection
		conn.setUseCaches(false); //avoid a cached file

		return conn.getOutputStream();

	}


	/**
	 * Downloads a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean to(String dst) {

		try{
			BufferedInputStream bis=
					new BufferedInputStream(
							getInputStream(src));

			File output=new File(dst+".tmp");

			final OutputStream bos=
					new BufferedOutputStream(
							new FileOutputStream(output));

			try{
				copy(bis, bos);

			}finally{
				bos.close();
				bis.close();
			}

			new File(dst).delete();

			return output.renameTo(new File(dst));

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
