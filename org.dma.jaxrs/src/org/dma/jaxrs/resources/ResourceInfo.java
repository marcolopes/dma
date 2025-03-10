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
package org.dma.jaxrs.resources;

import org.glassfish.jersey.server.model.ResourceMethod;

public class ResourceInfo {

	public final ResourceMethod method;
	public final String path;

	public ResourceInfo(ResourceMethod method, String path) {
		this.method=method;
		this.path=path;
	}

	@Override
	public String toString() {
		return String.format("%-8s %s", method.getHttpMethod(), path);
	}

}