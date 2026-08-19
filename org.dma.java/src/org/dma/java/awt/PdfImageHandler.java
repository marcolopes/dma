/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.awt;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;

import org.dma.java.io.FileParameters;
import org.dma.java.io.Folder;

public class PdfImageHandler extends ImageHandler {

	public PdfImageHandler(BufferedImage image) {
		super(image);
	}

	public void save(File pdfFile, int pageIndex) {
		String prefix=pdfFile.getName().concat(pageIndex==-1 ? "" : "."+pageIndex);
		File file=new FileParameters(prefix, IMAGE_FORMATS.PNG.name, Folder.temporary()).toFile();
		if (!file.exists()){
			file.deleteOnExit();
			save(IMAGE_FORMATS.PNG, file);
			System.out.println(file);
		}
	}

	@Override
	public int getPrintableHeight() {
		if (image!=null){
			int width=image.getWidth();
			int height=image.getHeight();
			if (width>0 && height>0){
				Raster raster=image.getRaster();
				if (raster.getNumBands()==1){
					int sample=raster.getSample(0, 0, 0);
					for(int y=height-1; y>=0; y--){
						for(int x=0; x<width; x++){
							if (raster.getSample(x, y, 0)!=sample) return y+1;
						}
					}
				}else return super.getPrintableHeight();
			}
		}return 0;
	}

	/** @see PdfImageHandler#getPrintableHeight() */
	public boolean isEmpty() {
		return getPrintableHeight()==0;
	}

}