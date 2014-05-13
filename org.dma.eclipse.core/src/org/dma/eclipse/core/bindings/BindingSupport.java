/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.bindings;

import java.util.HashMap;

import org.dma.java.utils.Debug;

import org.eclipse.core.databinding.DataBindingContext;

public class BindingSupport extends HashMap<String, BindingDefinition> {

	private static final long serialVersionUID = 1L;

	private final DataBindingContext bindingContext=new DataBindingContext();

	public BindingSupport() {}


	public void register(String property, BindingDefinition definition) {

		try{
			if (!containsKey(property)){

				put(property, definition);

				bindingContext.bindValue(
					definition.getTargetObservableValue(),
					definition.getModelObservableValue(),
					definition.getTargetToModel(),
					definition.getModelToTarget());

				Debug.out(property, keySet());

			}else{
				throw new Exception("BINDING ALREADY REGISTERED: "+property);
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public void unregister(String property) {

		BindingDefinition binding=remove(property);
		if (binding!=null){
			Debug.out(property, keySet());
			binding.dispose();
		}

	}


	public void unregisterAll() {

		while(!isEmpty()){
			String property=keySet().iterator().next();
			unregister(property);
		}

		bindingContext.dispose();

	}




	/*
	 * Getters and setters
	 */
	public DataBindingContext getBindingContext() {
		return bindingContext;
	}


}
