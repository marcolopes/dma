/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.drivers.jdbc.pool;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dma.drivers.jdbc.pool.PoolManagerMap.UserMap;

public class PoolManagerMap extends ConcurrentHashMap<String, UserMap> {

	private static final long serialVersionUID = 1L;

	public static class UserMap extends LinkedHashMap<String, Map<String, IPoolManager>> {

		private static final long serialVersionUID = 1L;

		public void print() {
			for(String username: keySet()){
				System.out.println(get(username).size()+" USER "+username);
			}
		}

		public IPoolManager get(String username, String password) {
			return containsKey(username) ? get(username).get(password) : null;
		}

		public IPoolManager remove(String username, String password) {
			return containsKey(username) ? get(username).remove(password) : null;
		}

		public IPoolManager put(String username, String password, IPoolManager manager) {
			if (!containsKey(username)) put(username, new ConcurrentHashMap());
			return get(username).put(password, manager);
		}

		public void shutdown() {
			for(String username: keySet()){
				for(IPoolManager manager: get(username).values()){
					manager.shutdown();
				}
			}clear();
		}

	}

	public void print() {
		for(String url: keySet()){
			System.out.println(url);
			get(url).print();
		}
	}

	public IPoolManager get(String url, String username, String password) {
		return containsKey(url) ? get(url).get(username, password) : null;
	}

	public IPoolManager remove(String url, String username, String password) {
		return containsKey(url) ? get(url).remove(username, password) : null;
	}

	public IPoolManager put(String url, String username, String password, IPoolManager manager) {
		if (!containsKey(url)) put(url, new UserMap());
		return get(url).put(username, password, manager);
	}

	public void shutdown() {
		for(String url: keySet()){
			get(url).shutdown();
		}clear();
	}

}
