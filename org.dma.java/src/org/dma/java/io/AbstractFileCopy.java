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
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractFileCopy extends AbstractStreamCopy {

	public final File src;

	public AbstractFileCopy(File src) {
		this.src=src;
	}


	/**
	 * Copies SOURCE file to DESTINATION file
	 * @return
	 * TRUE if copy was completed;
	 * FALSE if canceled or error
	 */
	public boolean to(File dst) {

		//avoid self copy!
		if (new FileHandler(src).equals(dst)) return true;

		try{
			InputStream in=new BufferedInputStream(new FileInputStream(src));

			OutputStream out=new BufferedOutputStream(new FileOutputStream(dst));

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


	public boolean to(String dst) {

		return to(new File(dst));

	}


}
