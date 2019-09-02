/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

public interface IPreferenceValue {

	/** get */
	public int getInt();
	public long getLong();
	public float getFloat();
	public double getDouble();
	public boolean getBoolean();
	public String getString();

	/** load & get */
	public int loadInt();
	public long loadLong();
	public float loadFloat();
	public double loadDouble();
	public boolean loadBoolean();
	public String loadString();

	/** set & save */
	public void setToDefault();
	public void setValue(int value);
	public void setValue(long value);
	public void setValue(float value);
	public void setValue(double value);
	public void setValue(boolean value);
	public void setValue(String value);

}