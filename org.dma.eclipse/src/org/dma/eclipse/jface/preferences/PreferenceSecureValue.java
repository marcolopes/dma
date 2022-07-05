/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

import org.dma.java.security.BlowfishPassword;

import org.eclipse.jface.preference.IPreferenceStore;

public class PreferenceSecureValue implements IPreferenceValue {

	private class ValuePair {

		private final BlowfishPassword cipher;
		private final IPreferenceValue value;
		private final IPreferenceValue hash;

		public ValuePair(PreferenceStore store, String name, BlowfishPassword cipher) {
			this.cipher=cipher;
			this.value=new PreferenceValue(store, name+"_value", IPreferenceStore.STRING_DEFAULT_DEFAULT);
			this.hash=new PreferenceValue(store, name+"_hash", IPreferenceStore.STRING_DEFAULT_DEFAULT);
		}

		public void setValue(String value) {
			this.value.setValue(value);
			this.hash.setValue(cipher.encode(value));
		}

		public String getString() {
			String value=this.value.getString();
			//decode result can be null!
			return value.equals(cipher.decode(hash.getString())) ? value : IPreferenceStore.STRING_DEFAULT_DEFAULT;
		}

		public int getInt() {
			String value=getString();
			return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
					IPreferenceStore.INT_DEFAULT_DEFAULT : Integer.valueOf(value);
		}

		public long getLong() {
			String value=getString();
			return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
					IPreferenceStore.LONG_DEFAULT_DEFAULT : Long.valueOf(value);
		}

		public float getFloat() {
			String value=getString();
			return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
					IPreferenceStore.FLOAT_DEFAULT_DEFAULT : Float.valueOf(value);
		}

		public double getDouble() {
			String value=getString();
			return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
					IPreferenceStore.DOUBLE_DEFAULT_DEFAULT : Double.valueOf(value);
		}

		public boolean getBoolean() {
			String value=getString();
			return value.equals(IPreferenceStore.STRING_DEFAULT_DEFAULT) ?
					IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT : !IPreferenceStore.BOOLEAN_DEFAULT_DEFAULT;
		}

	}

	private final PreferenceStore store;
	private final ValuePair pair;

	public PreferenceSecureValue(PreferenceStore store, String name, BlowfishPassword cipher) {
		this.store=store;
		this.pair=new ValuePair(store, name, cipher);
	}

	/** get */
	@Override
	public int getInt() {return pair.getInt();}
	@Override
	public long getLong() {return pair.getLong();}
	@Override
	public float getFloat() {return pair.getFloat();}
	@Override
	public double getDouble() {return pair.getDouble();}
	@Override
	public boolean getBoolean() {return pair.getBoolean();}
	@Override
	public String getString() {return pair.getString();}

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
	public void setValue(String value) {pair.setValue(value);}

}
