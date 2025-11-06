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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.dma.java.util.TimeDateUtils;

public class GsonObjectHandler extends GsonObjectChecker {

	/*
	 * Object
	 */
	public static JsonObject getObject(JsonObject jsonObject, String property) {
		return isObject(jsonObject, property) ? jsonObject.get(property).getAsJsonObject() : new JsonObject();
	}

	public static void addObject(JsonObject jsonObject, String property, JsonObject value) {
		if (jsonObject!=null) jsonObject.add(property, value);
	}

	/*
	 * Array
	 */
	public static JsonArray getArray(JsonObject jsonObject, String property) {
		return isArray(jsonObject, property) ? jsonObject.get(property).getAsJsonArray() : new JsonArray();
	}

	public static void addArray(JsonObject jsonObject, String property, JsonArray value) {
		if (jsonObject!=null) jsonObject.add(property, value);
	}

	/*
	 * String
	 */
	public static String getString(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsString() : "";
	}

	public static void addString(JsonObject jsonObject, String property, String value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Byte
	 */
	public static byte getByte(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsByte() : 0x00;
	}

	public static void addByte(JsonObject jsonObject, String property, Byte value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Short
	 */
	public static short getShort(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsShort() : 0;
	}

	public static void addShort(JsonObject jsonObject, String property, Short value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Integer
	 */
	public static int getInt(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsInt() : 0;
	}

	public static void addInt(JsonObject jsonObject, String property, Integer value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Long
	 */
	public static long getLong(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsLong() : 0;
	}

	public static void addLong(JsonObject jsonObject, String property, Long value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Float
	 */
	public static float getFloat(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsFloat() : 0;
	}

	public static void addFloat(JsonObject jsonObject, String property, Float value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Double
	 */
	public static double getDouble(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsDouble() : 0;
	}

	public static void addDouble(JsonObject jsonObject, String property, Double value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * BigInteger
	 */
	public static BigInteger getBigInteger(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsBigInteger() : BigInteger.ZERO;
	}

	public static void addBigInteger(JsonObject jsonObject, String property, BigInteger value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * BigDecimal
	 */
	public static BigDecimal getBigDecimal(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsBigDecimal() : BigDecimal.ZERO;
	}

	public static void addBigDecimal(JsonObject jsonObject, String property, BigDecimal value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Date
	 */
	public static Date getDate(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? new Date(jsonObject.get(property).getAsLong()) : TimeDateUtils.getCurrentDate();
	}

	public static void addDate(JsonObject jsonObject, String property, Date value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value==null ? null : value.getTime());
	}

	/*
	 * Time
	 */
	public static Time getTime(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? new Time(jsonObject.get(property).getAsLong())  : TimeDateUtils.getCurrentTime();
	}

	public static void addTime(JsonObject jsonObject, String property, Time value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value==null ? null : value.getTime());
	}

	/*
	 * Timestamp
	 */
	public static Timestamp getTimestamp(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? new Timestamp(jsonObject.get(property).getAsLong()) : TimeDateUtils.getCurrentTimestamp();
	}

	public static void addTimestamp(JsonObject jsonObject, String property, Timestamp value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value==null ? null : value.getTime());
	}

	/*
	 * Boolean
	 */
	public static boolean getBoolean(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsBoolean() : false;
	}

	public static void addBoolean(JsonObject jsonObject, String property, Boolean value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

	/*
	 * Binary
	 */
	public static byte[] getBinary(JsonObject jsonObject, String property) {
		return Base64.decodeBase64(getString(jsonObject, property));
	}

	public static void addBinary(JsonObject jsonObject, String property, byte[] value) {
		addString(jsonObject, property, Base64.encodeBase64String(value));
	}

	/*
	 * Character
	 */
	public static char getChar(JsonObject jsonObject, String property) {
		return isPrimitive(jsonObject, property) ? jsonObject.get(property).getAsString().charAt(0) : '\0';
	}

	public static void addChar(JsonObject jsonObject, String property, Character value) {
		if (jsonObject!=null) jsonObject.addProperty(property, value);
	}

}
