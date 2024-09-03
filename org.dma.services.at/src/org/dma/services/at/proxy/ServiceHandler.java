/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.at.proxy;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.WebServiceException;

import org.dma.services.at.SOAPMessageHandler;
import org.dma.services.at.ServiceCertificates;

public class ServiceHandler<T> extends SOAPMessageHandler<T> {

	private final String endpoint;

	public T getService() throws WebServiceException {
		return getService(endpoint);
	}

	private final File output;

	@Override
	protected String log(Source source) throws Exception {
		if (output!=null) toXML(source, new StreamResult(output));
		return super.log(source);
	}

	/** @see SOAPMessageHandler#SOAPMessageHandler(Object, String, String, ServiceCertificates) */
	public ServiceHandler(T service, String endpoint, String username, String password, ServiceCertificates cert, File output) {
		super(service, username, password, cert);
		this.endpoint = endpoint;
		this.output = output;
	}


}