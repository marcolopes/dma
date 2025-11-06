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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/*
 * https://repo1.maven.org/maven2/com/google/code/gson/gson
 */
public class GsonConverter extends GsonObjectHandler {

	private static final Gson Gson = new Gson();

	/** @see Gson#toJson(JsonElement) */
	public static String toJsonString(JsonObject jsonObject) {
		return Gson.toJson(jsonObject);
	}

	/** @see Gson#fromJson(String, Class) */
	public static JsonObject toJsonObject(String json) {
		return Gson.fromJson(json, JsonObject.class);
	}

	/** @see JsonParser#parseString(String) */
	public static JsonObject parse(String json) {
		JsonElement element=JsonParser.parseString(json);
		return element.isJsonObject() ? element.getAsJsonObject() : new JsonObject();
	}

}
