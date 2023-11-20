/*******************************************************************************
 * Copyright 2008-2012 Marco Lopes (marcolopespt@gmail.com)
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

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageOverlay {

	public static final int DEFAULT = 0;

	/*
	 * Horizontal alignement
	 */
	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	public static final int CENTER = 2;

	/*
	 * Vertical alignement
	 */
	public static final int TOP = 0;
	public static final int BOTTOM = 1;

	/*
	 * Style
	 */
	public static final int NONE = 0;
	public static final int OUTLINE = 1;
	public static final int SHADOW = 2;

	/*
	 * Margin
	 */
	private int margin = 5;

	public int getMargin() {return margin;}
	public void setMargin(int margin) {this.margin=margin;}

	/*
	 * Text Color
	 */
	private Color textColor = Color.BLACK;

	public Color getTextColor() {return textColor;}
	public void setTextColor(Color textColor) {this.textColor=textColor;}

	/*
	 * Outline Color
	 */
	private Color outlineColor = Color.WHITE;

	public Color getOutlineColor() {return outlineColor;}
	public void setOutlineColor(Color outlineColor) {this.outlineColor=outlineColor;}

	private final BufferedImage image;
	private final Graphics2D g2d;
	private Font font;

	public Font getFont() {return font;}
	public void setFont(Font font) {this.font=font;}

	public ImageOverlay(BufferedImage image) {
		this(image, null);
	}

	public ImageOverlay(BufferedImage image, Font font) {
		this.image=image;
		this.g2d=image.createGraphics();
		this.font=font==null ? g2d.getFont() : font;
		g2d.drawImage(image, 0, 0, null);
	}


	public void dispose() {
		g2d.dispose();
	}


	private void drawOutline(String text, int x, int y) {

		g2d.setColor(outlineColor);
		g2d.drawString(text, x+1, y);
		g2d.drawString(text, x, y+1);
		g2d.drawString(text, x-1, y);
		g2d.drawString(text, x, y-1);
		g2d.drawString(text, x+1, y+1);
		g2d.drawString(text, x-1, y-1);
		g2d.drawString(text, x+1, y-1);
		g2d.drawString(text, x-1, y+1);

	}


	private void drawShadow(String text, int x, int y) {

		g2d.setColor(outlineColor);
		g2d.drawString(text, x+1, y+1);

	}


	/**
	 * @param horizontalAlignment DEFAULT, LEFT, RIGHT, CENTER (default=LEFT)
	 * @param verticalAlignment DEFAULT, TOP, BOTTOM (default=TOP)
	 * @param style DEFAULT, NONE, OUTLINE, SHADOW (default=NONE)
	 */
	public void writeText(String text, int horizontalAlignment, int verticalAlignment, int style) {

		g2d.setFont(font);
		FontMetrics fm=g2d.getFontMetrics();

		int x=0;
		switch(horizontalAlignment){
		case LEFT: x=margin; break;
		case RIGHT: x=image.getWidth() - fm.stringWidth(text) - margin; break;
		case CENTER: x=(image.getWidth() - fm.stringWidth(text))/2; break;
		}

		int y=0;
		switch(verticalAlignment){
		case TOP: y=fm.getHeight(); break;
		case BOTTOM: y=image.getHeight() - margin; break;
		}

		switch(style){
		case OUTLINE: drawOutline(text, x, y); break;
		case SHADOW: drawShadow(text, x, y); break;
		}

		g2d.setColor(textColor);
		g2d.drawString(text, x, y);

	}


}
