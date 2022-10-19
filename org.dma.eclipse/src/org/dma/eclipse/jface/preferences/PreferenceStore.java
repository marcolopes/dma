/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.preferences;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dma.java.security.BlowfishPassword;

public class PreferenceStore extends org.eclipse.jface.preference.PreferenceStore {

	private static Map<String, IPreferenceValue> VALUE_CACHE = new ConcurrentHashMap();

	public PreferenceStore(String pathname) {
		super(pathname);
		load();
	}

	public IPreferenceValue getValue(String key, Object defaultValue) {
		IPreferenceValue value=VALUE_CACHE.get(key);
		if (value==null) VALUE_CACHE.put(key, value=new PreferenceValue(this, key, defaultValue));
		return value;
	}

	public IPreferenceValue getSecureValue(String key, BlowfishPassword cipher) {
		IPreferenceValue value=VALUE_CACHE.get(key);
		if (value==null) VALUE_CACHE.put(key, value=new PreferenceSecureValue(this, key, cipher));
		return value;
	}

	public void load() {
		try{super.load();
		}catch(IOException e){
			System.err.println(e);
		}
	}

	public void save() {
		try{super.save();
		}catch(IOException e){
			System.err.println(e);
		}
	}

}