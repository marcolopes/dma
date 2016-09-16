/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.bindings;

import java.util.LinkedHashMap;

import org.dma.java.util.Debug;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;

public class BindingSupport extends LinkedHashMap<String, Binding> {

	private static final long serialVersionUID=1L;

	@Override
	public Binding put(String key, Binding binding) {
		if (containsKey(key)) throw new Error("BINDING ALREADY REGISTERED: "+key);
		return super.put(key, binding);
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
