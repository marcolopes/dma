/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.preferences;

public class PreferenceValue {

	private final PreferenceStore store;
	private final String key;
	private final Object defaultValue;

	public PreferenceValue(PreferenceStore store, String key, Object defaultValue) {
		this.store=store;
		this.key=key;
		this.defaultValue=defaultValue;
	}

	public int getInt() {return store.getInt(key, (Integer)defaultValue);}
	public long getLong() {return store.getLong(key, (Long)defaultValue);}
	public float getFloat() {return store.getFloat(key, (Float)defaultValue);}
	public double getDouble() {return store.getDouble(key, (Double)defaultValue);}
	public boolean getBoolean() {return store.getBoolean(key, (Boolean)defaultValue);}
	public String getString() {return store.getString(key, (String)defaultValue);}

	/** set & save */
	public void setValue(int value) {store.setValue(key, value);}
	public void setValue(long value) {store.setValue(key, value);}
	public void setValue(float value) {store.setValue(key, value);}
	public void setValue(double value) {store.setValue(key, value);}
	public void setValue(boolean value) {store.setValue(key, value);}
	public void setValue(String value) {store.setValue(key, value);}
	public void setToDefault() {store.setToDefault(key);}

}