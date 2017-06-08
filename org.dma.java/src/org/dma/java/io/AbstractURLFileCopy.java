/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
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
	public boolean to(FileURL src, String dst) {

		try{
			BufferedInputStream bis=
					new BufferedInputStream(
							src.asInputStream());

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

		}catch(Exception e){
			System.err.println(e);
		}

		return false;

	}


	/**
	 * Uploads a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean to(String src, FileURL dst) {

		try{
			BufferedInputStream bis=
					new BufferedInputStream(
							new FileInputStream(src));

			final OutputStream bos=
					new BufferedOutputStream(
							dst.asOutputStream());

			try{
				copy(bis, bos);

			}finally{
				bos.close();
				bis.close();
			}

			return true;

		}catch(Exception e){
			System.err.println(e);
		}

		return false;

	}


}
