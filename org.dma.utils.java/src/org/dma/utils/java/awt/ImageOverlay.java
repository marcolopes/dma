/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.awt;

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

	private Color textColor = Color.BLACK;
	private Color outlineColor = Color.WHITE;
	private int margin = 5;

	private final BufferedImage image;
	private final Graphics2D g2d;
	private Font font;

	public ImageOverlay(BufferedImage image, Font font) {
		this.image=image;
		this.g2d=image.createGraphics();
		this.font=font==null ? g2d.getFont() : font;
		g2d.drawImage(image, 0, 0, null);
	}

	public ImageOverlay(BufferedImage image) {
		this(image, null);
	}


	public void dispose(){
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
	 * @param horizontalAlignment LEFT (default), RIGHT, CENTER
	 * @param verticalAlignment TOP (default), BOTTOM
	 * @param style NONE (default), OUTLINE, SHADOW
	 * @return the processed image
	 */
	public BufferedImage writeText(String text, int horizontalAlignment, int verticalAlignment, int style) {

		g2d.setFont(font);
		FontMetrics fm = g2d.getFontMetrics();

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

		return image;

	}




	/*
	 * Getters and setters
	 */
	public Color getTextColor() {
		return textColor;
	}

	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}


	public Color getOutlineColor() {
		return outlineColor;
	}

	public void setOutlineColor(Color outlineColor) {
		this.outlineColor = outlineColor;
	}


	public int getMargin() {
		return margin;
	}

	public void setMargin(int margin) {
		this.margin = margin;
	}


	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}


}
