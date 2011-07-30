/*******************************************************************************
 * 2008-2011 Projecto Colibri
 * Marco Lopes (marcolopes@projectocolibri.com)
 *******************************************************************************/
package org.dma.utils.eclipse.core.bindings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BindingSupport {

	private final Map<String, BindingDefinition> map=new HashMap();

	public BindingSupport() {
	}


	public void register(String property, BindingDefinition definition) {
		map.put(property, definition);
	}


	public void unregister(String property) {

		if (map.containsKey(property)){
			map.get(property).dispose();
			map.remove(property);
		}

	}


	public void unregisterAll() {

		Iterator<String> iterator=map.keySet().iterator();
		while(iterator.hasNext()){
			unregister(iterator.next());
		}

	}


}
