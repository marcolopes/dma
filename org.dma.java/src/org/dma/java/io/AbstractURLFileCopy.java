/*******************************************************************************
 * 2008-2021 Public Domain
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

	private final URLFile file;

	public AbstractURLFileCopy(URLFile file) {
		this.file=file;
	}

	/**
	 * Downloads the file to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean to(File dst) {

		try{File output=new File(dst+".tmp");

			BufferedInputStream in=new BufferedInputStream(file.asInputStream());

			OutputStream out=new BufferedOutputStream(new FileOutputStream(output));

			try{copy(in, out);
			}finally{
				out.close();
				in.close();
			}dst.delete();

			return output.renameTo(dst);

		}catch(InterruptedException e){
			System.out.println(e);
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	/**
	 * Uploads the file from SOURCE
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean from(File src) {

		try{BufferedInputStream in=new BufferedInputStream(new FileInputStream(src));

			OutputStream out=new BufferedOutputStream(file.asOutputStream());

			try{copy(in, out);
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
