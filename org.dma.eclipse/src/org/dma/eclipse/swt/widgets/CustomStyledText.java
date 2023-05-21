/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.widgets;

import java.util.Timer;
import java.util.TimerTask;

import org.dma.eclipse.swt.graphics.ColorManager;

import org.eclipse.swt.custom.LineBackgroundEvent;
import org.eclipse.swt.custom.LineBackgroundListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public abstract class CustomStyledText extends StyledText {

	@Override //subclassing
	protected void checkSubclass() {}

	public abstract void doUpdate();

	/** @see StyledText#StyledText(Composite, int) */
	public CustomStyledText(Composite parent, int style) {
		super(parent, style);

		addModifyListener(new ModifyListener() {
			final Runnable runnable=new Runnable() {
				@Override
				public void run() {
					if (isDisposed()) return;
					setRedraw(false);
					doUpdate();
					setRedraw(true);
				}
			};
			final Timer timer=new Timer(true);
			TimerTask task;
			@Override
			public void modifyText(ModifyEvent e) {
				if (task!=null) task.cancel();
				timer.schedule(task=new TimerTask() {
					@Override
					public void run() {//UI task
						Display.getDefault().asyncExec(runnable);
					}
				}, 500);
			}
		});

		addLineBackgroundListener(new LineBackgroundListener() {
			@Override
			public void lineGetBackground(LineBackgroundEvent event) {
				if (getLineAtOffset(event.lineOffset)%2==1){
					event.lineBackground=ColorManager.COLOR_LIGHT_GRAY;
				}
			}
		});
	}

	@Override
	public void setText(String text) {
		super.setText(text);
		doUpdate();
	}


	/**
	 * Creates a new font with the specified height.
	 * The font is automatically disposed when
	 * the associated control is disposed
	 */
	public void setFontSize(int height) {
		FontData[] fontData=getFont().getFontData();
		for(int i=0; i<fontData.length; ++i){
			fontData[i].setHeight(height);
		}
		final Font font=new Font(getDisplay(), fontData);
		// Since you created the font, you must dispose it
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				font.dispose();
			}
		});
		setFont(font);
	}


}