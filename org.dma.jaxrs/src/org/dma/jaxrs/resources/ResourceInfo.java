/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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

import org.glassfish.jersey.server.model.Resource;
import org.glassfish.jersey.server.model.ResourceMethod;

public class ResourceInfo extends QueryParamList {

	private static final long serialVersionUID = 1L;

	public String getQueryParams() {return super.toString();}

	public final String resourcePath;
	public final String httpMethod;

	public ResourceInfo(String resourcePath, ResourceMethod method) {
		super(method);
		this.resourcePath=resourcePath;
		this.httpMethod=method.getHttpMethod();
	}

	public ResourceInfo(Resource resource) {
		super(resource);
		this.resourcePath=resource.getPath();
		this.httpMethod="";
	}

	@Override
	public String toString() {
		return String.format("%-8s %s", httpMethod, isEmpty() ? resourcePath : resourcePath+"?"+getQueryParams());
	}

}