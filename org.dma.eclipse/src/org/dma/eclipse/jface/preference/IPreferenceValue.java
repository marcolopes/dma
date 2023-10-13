/*******************************************************************************
 * Copyright 2008-2019 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.jface.preference;

public interface IPreferenceValue {

	/** get */
	public int getInt();
	public long getLong();
	public float getFloat();
	public double getDouble();
	public boolean getBoolean();
	public String getString();

	/** load & get */
	public int loadInt();
	public long loadLong();
	public float loadFloat();
	public double loadDouble();
	public boolean loadBoolean();
	public String loadString();

	/** set & save */
	public void setToDefault();
	public void setValue(int value);
	public void setValue(long value);
	public void setValue(float value);
	public void setValue(double value);
	public void setValue(boolean value);
	public void setValue(String value);

}