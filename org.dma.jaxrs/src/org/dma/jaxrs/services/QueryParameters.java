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
package org.dma.jaxrs.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.dma.java.util.StringList;
import org.dma.jaxrs.services.QueryParameters.QueryParameterValue;

public class QueryParameters extends ArrayList<QueryParameterValue> {

	private static final long serialVersionUID = 0L;

	public static class QueryParameterValue {

		public final String name, value;

		public QueryParameterValue(String name, String value) {
			this.name=name;
			this.value=value;
		}

		@Override
		public String toString() {
			return name+"="+value;
		}

	}

	public QueryParameters(QueryParameterValue...value) {
		super(Arrays.asList(value));
	}

	@Override
	public String toString() {
		return StringList.valueOf(this).concat("&");
	}

}
