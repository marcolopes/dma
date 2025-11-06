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
 * Filipe Santos (filipesantos__12@hotmail.com)
 *******************************************************************************/
package org.dma.java.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class GsonObjectChecker {

	/** @see JsonObject#has(String) */
	public static boolean hasProperty(JsonObject jsonObject, String property) {
		return jsonObject!=null && jsonObject.has(property);
	}

	/** @see JsonElement#isJsonArray() */
	public static boolean isArray(JsonObject jsonObject, String property) {
		return hasProperty(jsonObject, property) && jsonObject.get(property).isJsonArray();
	}

	/** @see JsonElement#isJsonObject() */
	public static boolean isObject(JsonObject jsonObject, String property) {
		return hasProperty(jsonObject, property) && jsonObject.get(property).isJsonObject();
	}

	/** @see JsonElement#isJsonPrimitive() */
	public static boolean isPrimitive(JsonObject jsonObject, String property) {
		return hasProperty(jsonObject, property) && jsonObject.get(property).isJsonPrimitive();
	}

	/** @see JsonElement#isJsonNull() */
	public static boolean isNull(JsonObject jsonObject, String property) {
		return hasProperty(jsonObject, property) && jsonObject.get(property).isJsonNull();
	}

}
