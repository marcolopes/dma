/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.jface.preference;

import java.io.IOException;

import org.eclipse.jface.preference.IPersistentPreferenceStore;
import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceValue {

	private final IPersistentPreferenceStore store;
	private final String name;
	private final Object value;

	/** Sets the DEFAULT value */
	public PreferenceValue(IPersistentPreferenceStore store, String name, Object value) {
		this.store=store;
		this.name=name;
		this.value=value;
		setDefault();
	}

	/** @see IPersistentPreferenceStore#save() */
	public void save() {
		try{
			store.save();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	/** @see IPreferenceStore#setDefault */
	public void setDefault() {
		if(value instanceof Double){
			store.setDefault(name, (Double)value);
		}else if(value instanceof Float){
			store.setDefault(name, (Float)value);
		}else if(value instanceof Integer){
			store.setDefault(name, (Integer)value);
		}else if(value instanceof Long){
			store.setDefault(name, (Long)value);
		}else if(value instanceof Boolean){
			store.setDefault(name, (Boolean)value);
		}else if(value instanceof String){
			store.setDefault(name, (String)value);
		}else throw new UnsupportedOperationException();
	}

	/** @see IPreferenceStore#getBoolean(String) */
	public boolean getBoolean() {return store.getBoolean(name);}
	public double getDouble() {return store.getDouble(name);}
	public float getFloat() {return store.getFloat(name);}
	public int getInt() {return store.getInt(name);}
	public long getLong() {return store.getLong(name);}
	public String getString() {return store.getString(name);}

	/** @see IPreferenceStore#setValue */
	public void setValue(boolean value) {store.setValue(name, value);}
	public void setValue(double value) {store.setValue(name, value);}
	public void setValue(float value) {store.setValue(name, value);}
	public void setValue(int value) {store.setValue(name, value);}
	public void setValue(long value) {store.setValue(name, value);}
	public void setValue(String value) {store.setValue(name, value);}
	public void setToDefault() {store.setToDefault(name);}

	/** set & save */
	public void saveValue(boolean value) {setValue(value); save();}
	public void saveValue(double value) {setValue(value); save();}
	public void saveValue(float value) {setValue(value); save();}
	public void saveValue(int value) {setValue(value); save();}
	public void saveValue(long value) {setValue(value); save();}
	public void saveValue(String value) {setValue(value); save();}
	public void saveToDefault() {setToDefault(); save();}

}