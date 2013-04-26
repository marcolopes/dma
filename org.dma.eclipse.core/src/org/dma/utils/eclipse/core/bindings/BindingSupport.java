/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.bindings;

import java.util.HashMap;
import java.util.Map;

import org.dma.utils.java.Debug;
import org.eclipse.core.databinding.DataBindingContext;

public class BindingSupport {

	private final Map<String, BindingDefinition> bindingMap=new HashMap();

	private final DataBindingContext bindingContext=new DataBindingContext();

	public BindingSupport() {
	}


	public void register(String property, BindingDefinition definition) {

		try{
			if (!bindingMap.containsKey(property)){

				bindingMap.put(property, definition);

				bindingContext.bindValue(
					definition.getTargetObservableValue(), definition.getModelObservableValue(),
					definition.getTargetToModel(), definition.getModelToTarget());

				Debug.out(property, bindingMap.keySet());

			}else{
				throw new Exception("BINDING ALREADY REGISTERED: "+property);
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public void unregister(String property) {

		BindingDefinition binding=bindingMap.remove(property);
		if (binding!=null){
			Debug.out(property, bindingMap.keySet());
			binding.dispose();
		}

	}


	public void unregisterAll() {

		while(bindingMap.size()>0){
			String property=bindingMap.keySet().iterator().next();
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
