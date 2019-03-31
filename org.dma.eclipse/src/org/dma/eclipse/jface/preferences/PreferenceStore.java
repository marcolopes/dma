/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

import java.io.IOException;
import java.util.HashMap;

public class PreferenceStore extends org.eclipse.jface.preference.PreferenceStore {

	private static HashMap<String, PreferenceValue> VALUE_CACHE=new HashMap();

	public PreferenceStore(String pathname) {
		super(pathname);
		load();
	}

	public PreferenceValue getValue(String key, Object defaultValue) {
		PreferenceValue value=VALUE_CACHE.get(key);
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