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

import java.lang.reflect.Constructor;
import java.util.ArrayList;

import javax.ws.rs.QueryParam;

import org.glassfish.jersey.server.model.Parameter;
import org.glassfish.jersey.server.model.Resource;
import org.glassfish.jersey.server.model.ResourceMethod;

import org.dma.java.util.StringList;

public class QueryParamList extends ArrayList<Parameter> {

	private static final long serialVersionUID = 1L;

	public QueryParamList(ResourceMethod method) {
		for(Parameter parameter: method.getInvocable().getParameters()){
			if (parameter.getSourceAnnotation()!=null &&
				parameter.getSourceAnnotation().annotationType()==QueryParam.class) add(parameter);
		}
	}

	public QueryParamList(Resource resource) {
		for(Class<?> klass: resource.getHandlerClasses()){
			for(Constructor<?> constructor: klass.getDeclaredConstructors()){
				for(Parameter parameter: Parameter.create(klass, klass, constructor, false)){
					if (parameter.getSourceAnnotation()!=null &&
						parameter.getSourceAnnotation().annotationType()==QueryParam.class) add(parameter);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringList list=new StringList();
		for(Parameter parameter: this){
			list.append(parameter.getSourceName()+"="+parameter.getRawType().getSimpleName());
		}return list.concat("&");
	}

}