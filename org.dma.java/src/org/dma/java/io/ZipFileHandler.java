/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class ZipFileHandler extends FileHandler {

	public ZipFileHandler(String filename) {
		super(filename);
	}

	public ZipFileHandler(File file) {
		super(file);
	}


	public void create(Collection<File> filesToAdd, ZipParameters parameters) throws ZipException {

		try{
			// Initiate ZipFile object with the path/name of the zip file.
			// Zip file may not necessarily exist. If zip file exists, then
			// all these files are added to the zip file. If zip file does not
			// exist, then a new zip file is created with the files mentioned
			ZipFile zipFile=new ZipFile(file);

			// Initiate Zip Parameters which define various properties such
			// as compression method, etc. More parameters are explained in other
			// examples
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);

			// Now add files to the zip file
			// Note: To add a single file, the method addFile can be used
			// Note: If the zip file already exists and if this zip file is a split file
			// then this method throws an exception as Zip Format Specification does not
			// allow updating split zip files
			zipFile.addFiles(new ArrayList(filesToAdd), parameters);

		}catch(ZipException e){
			throw new ZipException(e.getCause() instanceof FileNotFoundException ?
				e.getCause().getMessage() : e.getMessage());
		}

	}

	/**
	 * Several predefined compression levels are available
	 * @see Zip4jConstants
	 * <li>DEFLATE_LEVEL_FASTEST - Lowest compression level but higher speed of compression
	 * <li>DEFLATE_LEVEL_FAST - Low compression level but higher speed of compression
	 * <li>DEFLATE_LEVEL_NORMAL - Optimal balance between compression level/speed
	 * <li>DEFLATE_LEVEL_MAXIMUM - High compression level with a compromise of speed
	 * <li>DEFLATE_LEVEL_ULTRA - Highest compression level but low speed
	 */
	public void create(Collection<File> filesToAdd, int compressionLevel) throws ZipException {

		ZipParameters parameters=new ZipParameters();
		// Set the compression level. This value has to be in between 0 to 9
		parameters.setCompressionLevel(compressionLevel);

		create(filesToAdd, parameters);

	}

	/** Optimal balance between compression level/speed */
	public void normalDeflate(Collection<File> filesToAdd) throws ZipException {

		create(filesToAdd, Zip4jConstants.DEFLATE_LEVEL_NORMAL);

	}

	/** Lowest compression level but higher speed of compression */
	public void fastestDeflate(Collection<File> filesToAdd) throws ZipException {

		create(filesToAdd, Zip4jConstants.DEFLATE_LEVEL_FASTEST);

	}

	/** Highest compression level but low speed */
	public void ultraDeflate(Collection<File> filesToAdd) throws ZipException {

		create(filesToAdd, Zip4jConstants.DEFLATE_LEVEL_ULTRA);

	}

}
