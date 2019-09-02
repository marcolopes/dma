/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

import org.dma.java.security.BlowfishPassword;

import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceSecureValue implements IPreferenceValue {

	private final PreferenceStore store;
	private final BlowfishPassword cipher;
	private final PreferenceValue value;
	private final PreferenceValue control;

	public PreferenceSecureValue(PreferenceStore store, String name, BlowfishPassword cipher) {
		this.store=store;
		this.cipher=cipher;
		value=new PreferenceValue(store, name+"_value", IPreferenceStore.STRING_DEFAULT_DEFAULT);
		control=new PreferenceValue(store, name+"_control", IPreferenceStore.STRING_DEFAULT_DEFAULT);
	}

	/** get */
	@Override
	public int getInt() {
		String value=getString();
		return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
				IPreferenceStore.INT_DEFAULT_DEFAULT : Integer.valueOf(value);
	}
	@Override
	public long getLong() {
		String value=getString();
		return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
				IPreferenceStore.LONG_DEFAULT_DEFAULT : Long.valueOf(value);
	}
	@Override
	public float getFloat() {
		String value=getString();
		return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
				IPreferenceStore.FLOAT_DEFAULT_DEFAULT : Float.valueOf(value);
	}
	@Override
	public double getDouble() {
		String value=getString();
		return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
				IPreferenceStore.DOUBLE_DEFAULT_DEFAULT : Double.valueOf(value);
	}
	@Override
	public boolean getBoolean() {
		String value=getString();
		return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
				IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT : !IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT;
	}
	@Override
	public String getString() {
		String value=this.value.getString();
		//decode result can be null!
		return value.equals(cipher.decode(control.getString())) ? value : IPreferenceStore.STRING_DEFAULT_DEFAULT;
	}

	/** load & get */
	@Override
	public int loadInt() {store.load(); return getInt();}
	@Override
	public long loadLong() {store.load(); return getLong();}
	@Override
	public float loadFloat() {store.load(); return getFloat();}
	@Override
	public double loadDouble() {store.load(); return getDouble();}
	@Override
	public boolean loadBoolean() {store.load(); return getBoolean();}
	@Override
	public String loadString() {store.load(); return getString();}

	/** set & save */
	@Deprecated
	@Override
	public void setToDefault() {throw new UnsupportedOperationException();}
	@Override
	public void setValue(int value) {setValue(Integer.toString(value));}
	@Override
	public void setValue(long value) {setValue(Long.toString(value));}
	@Override
	public void setValue(float value) {setValue(Float.toString(value));}
	@Override
	public void setValue(double value) {setValue(Double.toString(value));}
	@Override
	public void setValue(boolean value) {setValue(Boolean.toString(value));}
	@Override
	public void setValue(String value) {
		this.value.setValue(value);
		this.control.setValue(cipher.encode(value));
	}

}
