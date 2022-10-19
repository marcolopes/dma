/*******************************************************************************
 * Copyright 2008-2016 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.core.bindings;

import java.util.LinkedHashMap;

import org.dma.java.util.Debug;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;

public class BindingSupport extends LinkedHashMap<String, Binding> {

	private static final long serialVersionUID = 1L;

	@Override
	public Binding put(String id, Binding binding) {
		if (containsKey(id)) throw new RuntimeException("BINDING ALREADY REGISTERED: "+id);
		return super.put(id, binding);
	}

	private final DataBindingContext bindingContext;

	public BindingSupport() {
		this(Realm.getDefault());
	}

	public BindingSupport(Realm realm) {
		bindingContext=new DataBindingContext(realm);
	}


	public void register(String property, ValueBindingDefinition definition) {

		put(property, bindingContext.bindValue(
				definition.getTargetObservableValue(),
				definition.getModelObservableValue(),
				definition.getTargetToModelUpdate(),
				definition.getModelToTargetUpdate()));

	}


	public void register(String property, ListBindingDefinition definition) {

		put(property, bindingContext.bindList(
				definition.getTargetObservableList(),
				definition.getModelObservableList(),
				definition.getTargetToModelUpdate(),
				definition.getModelToTargetUpdate()));

	}


	public void unregister(String property) {

		Binding binding=remove(property);

		if (binding!=null) binding.dispose();

	}


	public void unregisterAll() {

		Debug.out(keySet());

		while(!isEmpty()){
			String property=keySet().iterator().next();
			unregister(property);
		}

		bindingContext.dispose();

	}


}
