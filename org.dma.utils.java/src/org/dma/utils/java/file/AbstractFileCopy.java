/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractFileCopy {

	public abstract boolean cancel();

	/**
	 * Copies a file from SOURCE to DESTINATION
	 * @return
	 * true - if copy was completed<br>
	 * false - if copy was canceled<br>
	 * null - if there was an error
	 */
	public Boolean copyFile(File src, File dst) {

		try{
			final InputStream bis =
				new BufferedInputStream(
						new FileInputStream(src));

			final OutputStream bos =
				new BufferedOutputStream(
						new FileOutputStream(dst));

			try{
				// Transfer bytes from input to output
				byte[] buf = new byte[1024];
				int len;
				while((len = bis.read(buf)) > 0 && !cancel())
					bos.write(buf, 0, len);

			}finally{
				FileUtils.close(bos);
				FileUtils.close(bis);
			}

			return cancel() ? false : true;

		} catch (FileNotFoundException e){
			System.out.println(e);
		} catch (IOException e){
		}

		return null;
	}


	public boolean copyFile(String src, String dst) {

		return copyFile(new File(src), new File(dst));

	}


	/**
	 * Downloads a file from SOURCE to DESTINATION
	 * @return
	 * true - if download was completed<br>
	 * false - if download was canceled<br>
	 * null - if there was an error
	 */
	public Boolean downloadFile(String src, String dst) {

		try{
			final BufferedInputStream bis =
				new BufferedInputStream(
					HTTPUtils.getInputStream(src));

			final OutputStream bos =
					new BufferedOutputStream(
							new FileOutputStream(dst));

			try{
				// Transfer bytes from input to output
				byte[] buf = new byte[1024];
				int len;
				while((len = bis.read(buf)) > 0 && !cancel())
					bos.write(buf, 0, len);

			}finally{
				FileUtils.close(bos);
				FileUtils.close(bis);
			}

			return cancel() ? false : true;

		} catch (FileNotFoundException e){
			System.out.println(e);
		} catch (IOException e){
		}

		return null;

	}


}
