/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class ZipUtils {

	public static boolean createZipFile(String filename, List<File> filesToAdd, ZipParameters parameters){

		try {
			// Initiate ZipFile object with the path/name of the zip file.
			// Zip file may not necessarily exist. If zip file exists, then
			// all these files are added to the zip file. If zip file does not
			// exist, then a new zip file is created with the files mentioned
			ZipFile zipFile = new ZipFile(filename);

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

			return true;

		} catch (ZipException e) {
			e.printStackTrace();
		}

		return false;

	}

	/**
	 * Several predefined compression levels are available
	 * DEFLATE_LEVEL_FASTEST - Lowest compression level but higher speed of compression
	 * DEFLATE_LEVEL_FAST - Low compression level but higher speed of compression
	 * DEFLATE_LEVEL_NORMAL - Optimal balance between compression level/speed
	 * DEFLATE_LEVEL_MAXIMUM - High compression level with a compromise of speed
	 * DEFLATE_LEVEL_ULTRA - Highest compression level but low speed
	 */
	public static boolean createZipFile(String filename, List<File> filesToAdd, int compressionLevel){

		ZipParameters parameters = new ZipParameters();
		// Set the compression level. This value has to be in between 0 to 9
		parameters.setCompressionLevel(compressionLevel);

		return createZipFile(filename, filesToAdd, parameters);

	}

	/**
	 * Optimal balance between compression level/speed
	 */
	public static boolean normalDeflate(String filename, List<File> filesToAdd){

		return createZipFile(filename, filesToAdd, Zip4jConstants.DEFLATE_LEVEL_NORMAL);

	}

	/**
	 * Lowest compression level but higher speed of compression
	 */
	public static boolean fastestDeflate(String filename, List<File> filesToAdd){

		return createZipFile(filename, filesToAdd, Zip4jConstants.DEFLATE_LEVEL_FASTEST);

	}

	/**
	 * Highest compression level but low speed
	 */
	public static boolean ultraDeflate(String filename, List<File> filesToAdd){

		return createZipFile(filename, filesToAdd, Zip4jConstants.DEFLATE_LEVEL_ULTRA);

	}

}
