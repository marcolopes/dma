/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

import org.glassfish.jersey.server.model.Resource;
import org.glassfish.jersey.server.model.ResourceMethod;

public class ResourceInfoMap extends LinkedHashMap<String, Collection<ResourceInfo>> {

	private static final long serialVersionUID = 1L;

	private final Resource resource;

	public ResourceInfoMap(Class resourceClass) {
		this(Resource.from(resourceClass));
	}

	public ResourceInfoMap(Resource resource) {
		this.resource=resource;
		if (resource!=null) process(resource);
	}

	private void process(Resource resource) {
		for(Resource childResource: resource.getChildResources()){
			process(childResource);
		}//List of resource methods and resource locator
		for(ResourceMethod method: resource.getAllMethods()){
			if (method.getType().equals(ResourceMethod.JaxrsType.SUB_RESOURCE_LOCATOR)){
				process(Resource.from(resource.getResourceLocator().getInvocable().getDefinitionMethod().getReturnType()));
			}else if (!resource.getPath().equals(this.resource.getPath())){
				Collection<ResourceInfo> list=get(resource.getPath());
				if (list==null) put(resource.getPath(), list=new ArrayList());
				list.add(new ResourceInfo(method, resource.getPath()));
			}
		}
	}

	public void print(String basePath) {
		if (resource!=null) System.out.println("[" + basePath + resource.getPath() + "]"+resource.getName());
		for(String key: keySet()){
			for(ResourceInfo info: get(key)){
				System.out.println(info);
			}
		}
	}

	public void print() {
		print("");
	}

}
