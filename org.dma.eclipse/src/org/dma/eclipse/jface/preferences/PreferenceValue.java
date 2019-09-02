/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

public class PreferenceValue implements IPreferenceValue {

	private final PreferenceStore store;
	private final String name;
	private final Object defaultValue;

	public PreferenceValue(PreferenceStore store, String name, Object defaultValue) {
		this.store=store;
		this.name=name.toUpperCase();
		this.defaultValue=defaultValue;
		setDefault();
	}

	private void setDefault() {
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

	/** get */
	@Override
	public int getInt() {return store.getInt(name);}
	@Override
	public long getLong() {return store.getLong(name);}
	@Override
	public float getFloat() {return store.getFloat(name);}
	@Override
	public double getDouble() {return store.getDouble(name);}
	@Override
	public boolean getBoolean() {return store.getBoolean(name);}
	@Override
	public String getString() {return store.getString(name);}

	public Object getValue() {
		if(defaultValue instanceof Integer) return getInt();
		if(defaultValue instanceof Long) return getLong();
		if(defaultValue instanceof Float) return getFloat();
		if(defaultValue instanceof Double) return getDouble();
		if(defaultValue instanceof Boolean) return getBoolean();
		if(defaultValue instanceof String) return getString();
		throw new UnsupportedOperationException();
	}

	/** load & get */
	@Override
	public int loadInt() {store.load(); return store.getInt(name);}
	@Override
	public long loadLong() {store.load(); return store.getLong(name);}
	@Override
	public float loadFloat() {store.load(); return store.getFloat(name);}
	@Override
	public double loadDouble() {store.load(); return store.getDouble(name);}
	@Override
	public boolean loadBoolean() {store.load(); return store.getBoolean(name);}
	@Override
	public String loadString() {store.load(); return store.getString(name);}

	/** set & save */
	@Override
	public void setToDefault() {store.setToDefault(name); store.save();}
	@Override
	public void setValue(int value) {store.setValue(name, value); store.save();}
	@Override
	public void setValue(long value) {store.setValue(name, value); store.save();}
	@Override
	public void setValue(float value) {store.setValue(name, value); store.save();}
	@Override
	public void setValue(double value) {store.setValue(name, value); store.save();}
	@Override
	public void setValue(boolean value) {store.setValue(name, value); store.save();}
	@Override
	public void setValue(String value) {store.setValue(name, value); store.save();}

}