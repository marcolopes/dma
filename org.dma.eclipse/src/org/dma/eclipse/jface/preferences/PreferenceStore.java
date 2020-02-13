/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PreferenceStore extends org.eclipse.jface.preference.PreferenceStore {

	private static Map<String, IPreferenceValue> VALUE_CACHE=new ConcurrentHashMap();

	public PreferenceStore(String pathname) {
		super(pathname);
		load();
	}

	public IPreferenceValue getValue(String key, Object defaultValue) {
		IPreferenceValue value=VALUE_CACHE.get(key);
		if (value==null) VALUE_CACHE.put(key, value=new PreferenceValue(this, key, defaultValue));
		return value;
	}

	public void load() {
		try{
			super.load();
		}catch(IOException e){
			System.err.println(e);
		}
	}

	public void save() {
		try{
			super.save();
		}catch(IOException e){
			System.err.println(e);
		}
	}

}