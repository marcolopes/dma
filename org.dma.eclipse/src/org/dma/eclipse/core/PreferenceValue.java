/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class PreferenceValue {

	private final IEclipsePreferences store;
	private final String key;
	private final Object defaultValue;

	/** Sets the DEFAULT value */
	public PreferenceValue(IEclipsePreferences store, String key, Object defaultValue) {
		this.store=store;
		this.key=key;
		this.defaultValue=defaultValue;
	}

	public void save() {
		try{
			store.flush();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public boolean getBoolean() {return store.getBoolean(key, (Boolean)defaultValue);}
	public double getDouble() {return store.getDouble(key, (Double)defaultValue);}
	public float getFloat() {return store.getFloat(key, (Float)defaultValue);}
	public int getInt() {return store.getInt(key, (Integer)defaultValue);}
	public long getLong() {return store.getLong(key, (Long)defaultValue);}
	public String getString() {return store.get(key, (String)defaultValue);}

	/** set & save */
	public void setValue(boolean value) {store.putBoolean(key, value); save();}
	public void setValue(double value) {store.putDouble(key, value); save();}
	public void setValue(float value) {store.putFloat(key, value); save();}
	public void setValue(int value) {store.putInt(key, value); save();}
	public void setValue(long value) {store.putLong(key, value); save();}
	public void setValue(String value) {store.put(key, value); save();}
	public void setToDefault() {store.remove(key); save();}

}