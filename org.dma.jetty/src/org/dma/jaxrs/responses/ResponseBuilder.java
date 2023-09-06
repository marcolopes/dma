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
 * Filipe Santos (filipesantos__12@hotmail.com)
 *******************************************************************************/
package org.dma.jaxrs.responses;

import java.io.File;
import java.util.HashMap;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.Status.Family;

import org.dma.java.util.StringUtils;

public class ResponseBuilder<T> extends HashMap<String, Object> implements IResponse {

	private Status status;
	private T entity;

	public ResponseBuilder(Status status) {
		this(status, null);
	}

	public ResponseBuilder(Status status, T entity) {
		this.status=status;
		this.entity=entity;
	}

	public ResponseBuilder(Response response) {
		this.status=Status.fromStatusCode(response.getStatus());
		this.entity=(T)response.getEntity();
		for(String header : response.getHeaders().keySet()){
			setHeader(header, response.getHeaders().get(header));
		}
	}

	/*
	 * Build
	 */
	@Override
	public Response build() {
		Response.ResponseBuilder builder=Response.status(status).entity(entity);
		for(String key : keySet()){
			builder.header(key, get(key));
		}return builder.build();
	}

	public ResponseBuilder<T> setHeader(File file) {
		return setHeader("Content-Disposition", "attachment; filename="+StringUtils.quote(file.getName()));
	}

	public ResponseBuilder<T> setHeader(String header, Object value) {
		put(header, value);
		return this;
	}

	/*
	 * Getters & Setters
	 */
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	/*
	 * Control
	 */
	public boolean isInformation() {
		return status.getFamily()==Family.INFORMATIONAL;
	}

	public boolean isSuccess() {
		return status.getFamily()==Family.SUCCESSFUL;
	}

	public boolean isRedirect() {
		return status.getFamily()==Family.REDIRECTION;
	}

	public boolean isClientError() {
		return status.getFamily()==Family.CLIENT_ERROR;
	}

	public boolean isServerError() {
		return status.getFamily()==Family.SERVER_ERROR;
	}

	/*
	 * To
	 */
	@Override
	public String toString() {
		return ResponseBuilder.class.getCanonicalName() +
				" [status=" + status +
				", entity=" + entity + "]";
	}

}
