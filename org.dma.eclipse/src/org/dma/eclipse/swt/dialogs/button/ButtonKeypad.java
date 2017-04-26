/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.button;

import java.math.BigDecimal;

import org.dma.eclipse.swt.custom.CustomButton;
import org.dma.eclipse.swt.custom.CustomShell;
import org.dma.eclipse.swt.dialogs.button.KeypadDisplay.FUNCTIONS;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class ButtonKeypad extends CustomShell {

	public abstract boolean done(String result);

	private enum LABELS {

		SEVEN ("7"), EIGHT ("8"), NINE ("9"), DELETE ("\u2190", FUNCTIONS.DELETE),
		FOUR ("4"), FIVE ("5"), SIX ("6"), BACK ("\u21e6", FUNCTIONS.BACK),
		ONE ("1"), TWO ("2"), THREE ("3"), FORWARD ("\u21e8", FUNCTIONS.FORWARD),
		ZERO ("0"), POINT ("."), CLEAR ("C", FUNCTIONS.CLEAR), RETURN ("OK");

		public final String label;
		public final FUNCTIONS function;

		private LABELS(String label) {
			this(label, null);
		}

		private LABELS(String label, FUNCTIONS function) {
			this.label=label;
			this.function=function;
		}

	}


	private final int height;
	private final KeypadDisplay display;

	public ButtonKeypad() {
		this(Display.getDefault().getActiveShell());
	}

	public ButtonKeypad(int height) {
		this(Display.getDefault().getActiveShell(), height);
	}

	public ButtonKeypad(Shell parent) {
		this(parent, Display.getDefault().getClientArea().height / 10);
	}

	public ButtonKeypad(Shell parent, int height) {
		super(parent, STYLE_RESIZABLE);

		this.height=height;

		display=createCompositeDisplay();
		createCompositeButtons();
		setGridLayout();
		pack();
		setCenteredLocation();
	}

	public void setValue(String value) {
		display.setValue(value);
	}

	public void setValue(BigDecimal value) {
		setValue(value.toPlainString());
	}

	public void setValue(Double value) {
		setValue(BigDecimal.valueOf(value));
	}

	public void setValue(BigDecimal value, int scale) {
		setValue(value.setScale(scale));
	}


	/*
	 * Contents
	 */
	private KeypadDisplay createCompositeDisplay() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout();
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));

		final KeypadDisplay display=new KeypadDisplay(composite, 20);
		display.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.keyCode){
				case 'c':
				case 'C': display.function(FUNCTIONS.CLEAR); break;
				case SWT.CR:
				case SWT.KEYPAD_CR: if (!done(display.getValue())) break;
				//$FALL-THROUGH$
				case SWT.ESC: close(); break;
				}
			}
		});

		return display;

	}


	private void createCompositeButtons() {

		Composite composite=new Composite(this, SWT.NONE);
		GridLayout gridLayout=new GridLayout(4, true);
		gridLayout.marginWidth=0;
		gridLayout.marginHeight=0;
		gridLayout.horizontalSpacing=0;
		gridLayout.verticalSpacing=0;
		composite.setLayout(gridLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		for(LABELS label: LABELS.values()){
			final CustomButton button=new CustomButton(composite, SWT.PUSH);
			GridData gridData=new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.minimumWidth=height;
			gridData.minimumHeight=height;
			button.setLayoutData(gridData);
			button.setFontSize(20);
			button.setText(label.label);
			button.setToolTipText(label.name());
			button.setData(label);
			button.setFocus();

			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					LABELS label=(LABELS)e.widget.getData();
					display.setFocus();
					if (label==LABELS.RETURN){
						if (done(display.getValue())) close();
					}else if (label.function==null){
						display.insert(label.label);
					}else{
						display.function(label.function);
					}
				}
			});
		}

	}


	public static void main(String[] argvs) {

		new ButtonKeypad() {
			@Override
			public boolean done(String result) {
				System.out.println(result);
				return true;
			}
		}.openAndSleep();

	}


}
