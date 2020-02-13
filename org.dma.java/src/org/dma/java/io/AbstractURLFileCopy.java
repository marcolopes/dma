/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public abstract class AbstractURLFileCopy extends AbstractStreamCopy {

	/**
	 * Downloads a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean to(URLFileHandler src, String dst) {

		try{
			File output=new File(dst+".tmp");

			BufferedInputStream in=new BufferedInputStream(src.asInputStream());

			OutputStream out=new BufferedOutputStream(new FileOutputStream(output));

			try{
				copy(in, out);

			}finally{
				out.close();
				in.close();
			}

			new File(dst).delete();

			return output.renameTo(new File(dst));

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	/**
	 * Uploads a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean to(String src, URLFileHandler dst) {

		try{
			BufferedInputStream in=new BufferedInputStream(new FileInputStream(src));

			OutputStream out=new BufferedOutputStream(dst.asOutputStream());

			try{
				copy(in, out);

			}finally{
				out.close();
				in.close();
			}return true;

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


}
