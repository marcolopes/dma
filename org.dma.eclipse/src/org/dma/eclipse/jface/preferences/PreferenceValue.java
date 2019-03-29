/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

public class PreferenceValue {

	private final PreferenceStore store;
	private final String name;
	private final Object defaultValue;

	public PreferenceValue(PreferenceStore store, String name, Object defaultValue) {
		this.store=store;
		this.name=name;
		this.defaultValue=defaultValue;
		setDefault();
	}

	public void setDefault() {
		if(defaultValue instanceof Integer){
			store.setDefault(name, (Integer)defaultValue);
		}else if(defaultValue instanceof Long){
			store.setDefault(name, (Long)defaultValue);
		}else if(defaultValue instanceof Float){
			store.setDefault(name, (Float)defaultValue);
		}else if(defaultValue instanceof Double){
			store.setDefault(name, (Double)defaultValue);
		}else if(defaultValue instanceof Boolean){
			store.setDefault(name, (Boolean)defaultValue);
		}else if(defaultValue instanceof String){
			store.setDefault(name, (String)defaultValue);
		}else throw new UnsupportedOperationException();
	}

	public int getInt() {return store.getInt(name);}
	public long getLong() {return store.getLong(name);}
	public float getFloat() {return store.getFloat(name);}
	public double getDouble() {return store.getDouble(name);}
	public boolean getBoolean() {return store.getBoolean(name);}
	public String getString() {return store.getString(name);}

	/** set & save */
	public void setValue(int value) {store.setValue(name, value); store.save();}
	public void setValue(long value) {store.setValue(name, value); store.save();}
	public void setValue(float value) {store.setValue(name, value); store.save();}
	public void setValue(double value) {store.setValue(name, value); store.save();}
	public void setValue(boolean value) {store.setValue(name, value); store.save();}
	public void setValue(String value) {store.setValue(name, value); store.save();}
	public void setToDefault() {store.setToDefault(name);}

}