/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.preferences;

import java.util.HashMap;

import org.osgi.framework.Bundle;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

public class PreferenceStore {

	private static HashMap<String, PreferenceValue> VALUE_CACHE=new HashMap();

	private final IEclipsePreferences store;

	public PreferenceStore(Plugin plugin) {
		this(plugin.getBundle());
	}

	public PreferenceStore(Bundle bundle) {
		this(bundle.getSymbolicName());
	}

	public PreferenceStore(String name) {
		this.store=InstanceScope.INSTANCE.getNode(name);
	}

	public PreferenceValue getValue(String key, Object defaultValue) {
		PreferenceValue value=VALUE_CACHE.get(key);
		if (value==null) VALUE_CACHE.put(key, value=new PreferenceValue(this, key, defaultValue));
		return value;
	}

	private void save() {
		try{
			store.flush();
		}catch(Exception e){
			System.err.println(e);
		}
	}

	public int getInt(String key, int def) {return store.getInt(key, def);}
	public long getLong(String key, long def) {return store.getLong(key, def);}
	public float getFloat(String key, float def) {return store.getFloat(key, def);}
	public double getDouble(String key, double def) {return store.getDouble(key, def);}
	public boolean getBoolean(String key, boolean def) {return store.getBoolean(key, def);}
	public String getString(String key, String def) {return store.get(key, def);}

	/** set & save */
	public void setValue(String key, int value) {store.putInt(key, value); save();}
	public void setValue(String key, long value) {store.putLong(key, value); save();}
	public void setValue(String key, float value) {store.putFloat(key, value); save();}
	public void setValue(String key, double value) {store.putDouble(key, value); save();}
	public void setValue(String key, boolean value) {store.putBoolean(key, value); save();}
	public void setValue(String key, String value) {store.put(key, value); save();}
	public void setToDefault(String key) {store.remove(key); save();}

}