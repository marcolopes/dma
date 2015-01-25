/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

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
	 * TRUE if copy was completed;
	 * FALSE if canceled or error
	 */
	public boolean copyFile(File src, File dst) {

		if (!src.equals(dst)) try{

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
				while((len = bis.read(buf)) > 0 && !cancel()){
					bos.write(buf, 0, len);
				}

			}finally{
				FileUtils.close(bos);
				FileUtils.close(bis);
			}

			return cancel() ? false : true;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public boolean copyFile(String src, String dst) {

		return copyFile(new File(src), new File(dst));

	}


	/**
	 * Downloads a file from SOURCE to DESTINATION
	 * @return
	 * TRUE if download was completed;
	 * FALSE if canceled or error
	 */
	public boolean downloadFile(String src, String dst) {

		try{
			final BufferedInputStream bis =
				new BufferedInputStream(
					NetUtils.getInputStream(src));

			final OutputStream bos =
					new BufferedOutputStream(
							new FileOutputStream(dst));

			try{
				// Transfer bytes from input to output
				byte[] buf = new byte[1024];
				int len;
				while((len = bis.read(buf)) > 0 && !cancel()){
					bos.write(buf, 0, len);
				}

			}finally{
				FileUtils.close(bos);
				FileUtils.close(bis);
			}

			return cancel() ? false : true;

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
