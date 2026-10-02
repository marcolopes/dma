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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.glassfish.jersey.server.model.Resource;
import org.glassfish.jersey.server.model.ResourceMethod;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class ResourceInfoMap extends TreeMap<String, Collection<ResourceInfo>> {

	private static final long serialVersionUID = 1L;

	public void print() {print("");}
	/** @see UriBuilder#fromPath(String) */
	public void print(String basePath) {print(UriBuilder.fromPath(basePath));}
	/** @see UriInfo#getBaseUriBuilder() */
	public void print(UriInfo info) {print(info.getBaseUriBuilder());}
	public void print(UriBuilder builder) {
		for(Map.Entry<String, JsonElement> entry: toJsonObject(builder).entrySet()){
			System.out.println(entry.getValue().getAsString());
		}
	}

	public void put(ResourceInfo info) {
		if (!containsKey(info.resourcePath)) put(info.resourcePath, new ArrayList());
		get(info.resourcePath).add(info);
	}

	private final ResourceInfo info;

	public ResourceInfoMap(Class<?> klass, Class<? extends Annotation>...exclude) {
		this(Resource.from(klass), exclude);
	}

	public ResourceInfoMap(Resource resource, Class<? extends Annotation>...exclude) {
		info=resource==null ? null : new ResourceInfo(resource);
		process(resource, exclude);
	}

	private void process(Resource resource, Class<? extends Annotation>...exclude) {
		if (resource!=null){
			for(Resource childResource: resource.getChildResources()){
				process(childResource, exclude);
			}//List of resource methods and resource locator
			for(ResourceMethod method: getAllMethods(resource, exclude)){
				if (method.getType().equals(ResourceMethod.JaxrsType.SUB_RESOURCE_LOCATOR)){
					process(Resource.from(resource.getResourceLocator().getInvocable().getDefinitionMethod().getReturnType()), exclude);
				}else if (!resource.getPath().equals(info.resourcePath)){
					put(new ResourceInfo(resource.getPath(), method));
				}
			}
		}
	}

	private Collection<ResourceMethod> getAllMethods(Resource resource, Class<? extends Annotation>...exclude) {
		Collection<ResourceMethod> methods=new ArrayList();
		for(ResourceMethod method: resource.getAllMethods()){
			if (!hasAnnotation(method, exclude)) methods.add(method);
		}return methods;
	}

	private boolean hasAnnotation(ResourceMethod method, Class<? extends Annotation>...annotations) {
		Method definitionMethod=method.getInvocable().getDefinitionMethod();
		Method handlingMethod=method.getInvocable().getHandlingMethod();
		return hasAnnotation(definitionMethod, annotations) ||
				(handlingMethod!=null && !handlingMethod.equals(definitionMethod) &&
				hasAnnotation(handlingMethod, annotations));
	}

	private boolean hasAnnotation(Method method, Class<? extends Annotation>...annotations) {
		for(Annotation annotation: method.getAnnotations()){
			for(Class<? extends Annotation> annotationClass: annotations){
				if (annotation.annotationType().equals(annotationClass)) return true;
			}
		}return false;
	}

	public JsonObject toJsonObject(UriInfo info) {return toJsonObject(info.getBaseUriBuilder());}
	public JsonObject toJsonObject(UriBuilder builder) {
		JsonObject jsonObject=new JsonObject();
		if (info!=null){
			String basePath=builder.clone().path(info.resourcePath).path("{method}").toTemplate();
			jsonObject.addProperty("url", info.isEmpty() ? basePath : basePath+"?"+info.getQueryParams());
			for(String key: keySet()){
				for(ResourceInfo info: get(key)){
					jsonObject.addProperty(key, info.toString());
				}
			}
		}return jsonObject;
	}

}