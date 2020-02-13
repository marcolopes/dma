/*******************************************************************************
 * 2008-2020 Public Domain
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

	//update timer
	private Timer timer=new Timer(true);

	/** @see StyledText#StyledText(Composite, int) */
	public CustomStyledText(Composite parent, int style) {
		super(parent, style);

		addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				resetTimer();
			}
		});

		addLineBackgroundListener(new LineBackgroundListener() {
			@Override
			public void lineGetBackground(LineBackgroundEvent event) {
				if(getLineAtOffset(event.lineOffset)%2==1){
					event.lineBackground=ColorManager.COLOR_LIGHT_GRAY;
				}
			}
		});
	}


	@Override
	public void dispose() {
		timer.cancel();
		super.dispose();
	}


	public void resetTimer() {
		timer.cancel();
		timer=new Timer(true);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				//UI task
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						setRedraw(false);
						doUpdate();
						setRedraw(true);
					}
				});
			}
		}, 500);
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