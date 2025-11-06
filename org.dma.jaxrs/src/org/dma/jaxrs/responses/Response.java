/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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

import javax.ws.rs.core.Response.Status;

import org.dma.java.gson.GsonConverter;

public class Response extends GsonConverter {

	/*
	 * Builders
	 */
	public static ResponseBuilder builder(Status status) {
		return builder(status, null);
	}

	public static <T> ResponseBuilder<T> builder(Status status, T entity) {
		return new ResponseBuilder(status, entity);
	}

	/*
	 * Builders Shortcuts
	 */
	public static ResponseBuilder ok() {
		return ok(null);
	}

	public static <T> ResponseBuilder<T> ok(T entity) {
		return builder(Status.OK, entity);
	}

	public static ResponseBuilder created() {
		return created(null);
	}

	public static <T> ResponseBuilder<T> created(T entity) {
		return builder(Status.CREATED, entity);
	}

	public static ResponseBuilder accepted() {
		return accepted(null);
	}

	public static <T> ResponseBuilder<T> accepted(T entity) {
		return builder(Status.ACCEPTED, entity);
	}

	public static ResponseBuilder noContent() {
		return noContent(null);
	}

	public static <T> ResponseBuilder<T> noContent(T entity) {
		return builder(Status.NO_CONTENT, entity);
	}

	public static ResponseBuilder resetContent() {
		return resetContent(null);
	}

	public static <T> ResponseBuilder<T> resetContent(T entity) {
		return builder(Status.RESET_CONTENT, entity);
	}

	public static ResponseBuilder partialContent() {
		return partialContent(null);
	}

	public static <T> ResponseBuilder<T> partialContent(T entity) {
		return builder(Status.PARTIAL_CONTENT, entity);
	}

	public static ResponseBuilder movedPermanently() {
		return movedPermanently(null);
	}

	public static <T> ResponseBuilder<T> movedPermanently(T entity) {
		return builder(Status.MOVED_PERMANENTLY, entity);
	}

	public static ResponseBuilder found() {
		return found(null);
	}

	public static <T> ResponseBuilder<T> found(T entity) {
		return builder(Status.FOUND, entity);
	}

	public static ResponseBuilder seeOther() {
		return seeOther(null);
	}

	public static <T> ResponseBuilder<T> seeOther(T entity) {
		return builder(Status.SEE_OTHER, entity);
	}

	public static ResponseBuilder notModified() {
		return notModified(null);
	}

	public static <T> ResponseBuilder<T> notModified(T entity) {
		return builder(Status.NOT_MODIFIED, entity);
	}

	public static ResponseBuilder useProxy() {
		return useProxy(null);
	}

	public static <T> ResponseBuilder<T> useProxy(T entity) {
		return builder(Status.USE_PROXY, entity);
	}

	public static ResponseBuilder temporaryRedirect() {
		return temporaryRedirect(null);
	}

	public static <T> ResponseBuilder<T> temporaryRedirect(T entity) {
		return builder(Status.TEMPORARY_REDIRECT, entity);
	}

	public static ResponseBuilder badRequest() {
		return badRequest(null);
	}

	public static <T> ResponseBuilder<T> badRequest(T entity) {
		return builder(Status.BAD_REQUEST, entity);
	}

	public static ResponseBuilder unauthorized() {
		return unauthorized(null);
	}

	public static <T> ResponseBuilder<T> unauthorized(T entity) {
		return builder(Status.UNAUTHORIZED, entity);
	}

	public static ResponseBuilder paymentRequired() {
		return paymentRequired(null);
	}

	public static <T> ResponseBuilder<T> paymentRequired(T entity) {
		return builder(Status.PAYMENT_REQUIRED, entity);
	}

	public static ResponseBuilder forbidden() {
		return forbidden(null);
	}

	public static <T> ResponseBuilder<T> forbidden(T entity) {
		return builder(Status.FORBIDDEN, entity);
	}

	public static ResponseBuilder notFound() {
		return notFound(null);
	}

	public static <T> ResponseBuilder<T> notFound(T entity) {
		return builder(Status.NOT_FOUND, entity);
	}

	public static ResponseBuilder methodNotAllowed() {
		return methodNotAllowed(null);
	}

	public static <T> ResponseBuilder<T> methodNotAllowed(T entity) {
		return builder(Status.METHOD_NOT_ALLOWED, entity);
	}

	public static ResponseBuilder notAcceptable() {
		return notAcceptable(null);
	}

	public static <T> ResponseBuilder<T> notAcceptable(T entity) {
		return builder(Status.NOT_ACCEPTABLE, entity);
	}

	public static ResponseBuilder proxyAuthenticationRequired() {
		return proxyAuthenticationRequired(null);
	}

	public static <T> ResponseBuilder<T> proxyAuthenticationRequired(T entity) {
		return builder(Status.PROXY_AUTHENTICATION_REQUIRED, entity);
	}

	public static ResponseBuilder requestTimeout() {
		return requestTimeout(null);
	}

	public static <T> ResponseBuilder<T> requestTimeout(T entity) {
		return builder(Status.REQUEST_TIMEOUT, entity);
	}

	public static ResponseBuilder conflict() {
		return conflict(null);
	}

	public static <T> ResponseBuilder<T> conflict(T entity) {
		return builder(Status.CONFLICT, entity);
	}

	public static ResponseBuilder gone() {
		return gone(null);
	}

	public static <T> ResponseBuilder<T> gone(T entity) {
		return builder(Status.GONE, entity);
	}

	public static ResponseBuilder lengthRequired() {
		return lengthRequired(null);
	}

	public static <T> ResponseBuilder<T> lengthRequired(T entity) {
		return builder(Status.LENGTH_REQUIRED, entity);
	}

	public static ResponseBuilder preconditionFailed() {
		return preconditionFailed(null);
	}

	public static <T> ResponseBuilder<T> preconditionFailed(T entity) {
		return builder(Status.PRECONDITION_FAILED, entity);
	}

	public static ResponseBuilder requestEntityTooLarge() {
		return requestEntityTooLarge(null);
	}

	public static <T> ResponseBuilder<T> requestEntityTooLarge(T entity) {
		return builder(Status.REQUEST_ENTITY_TOO_LARGE, entity);
	}

	public static ResponseBuilder requestURITooLong() {
		return requestURITooLong(null);
	}

	public static <T> ResponseBuilder<T> requestURITooLong(T entity) {
		return builder(Status.REQUEST_URI_TOO_LONG, entity);
	}

	public static ResponseBuilder unsupportedMediaType() {
		return unsupportedMediaType(null);
	}

	public static <T> ResponseBuilder<T> unsupportedMediaType(T entity) {
		return builder(Status.UNSUPPORTED_MEDIA_TYPE, entity);
	}

	public static ResponseBuilder requestedRangeNotSatisfiable() {
		return requestedRangeNotSatisfiable(null);
	}

	public static <T> ResponseBuilder<T> requestedRangeNotSatisfiable(T entity) {
		return builder(Status.REQUESTED_RANGE_NOT_SATISFIABLE, entity);
	}

	public static ResponseBuilder expectationFailed() {
		return expectationFailed(null);
	}

	public static <T> ResponseBuilder<T> expectationFailed(T entity) {
		return builder(Status.EXPECTATION_FAILED, entity);
	}

	public static ResponseBuilder internalServerError() {
		return internalServerError(null);
	}

	public static <T> ResponseBuilder<T> internalServerError(T entity) {
		return builder(Status.INTERNAL_SERVER_ERROR, entity);
	}

	public static ResponseBuilder notImplemented() {
		return notImplemented(null);
	}

	public static <T> ResponseBuilder<T> notImplemented(T entity) {
		return builder(Status.NOT_IMPLEMENTED, entity);
	}

	public static ResponseBuilder badGateway() {
		return badGateway(null);
	}

	public static <T> ResponseBuilder<T> badGateway(T entity) {
		return builder(Status.BAD_GATEWAY, entity);
	}

	public static ResponseBuilder serviceUnavailable() {
		return serviceUnavailable(null);
	}

	public static <T> ResponseBuilder<T> serviceUnavailable(T entity) {
		return builder(Status.SERVICE_UNAVAILABLE, entity);
	}

	public static ResponseBuilder gatewayTimeout() {
		return gatewayTimeout(null);
	}

	public static <T> ResponseBuilder<T> gatewayTimeout(T entity) {
		return builder(Status.GATEWAY_TIMEOUT, entity);
	}

	public static ResponseBuilder httpVersionNotSupported() {
		return httpVersionNotSupported(null);
	}

	public static <T> ResponseBuilder<T> httpVersionNotSupported(T entity) {
		return builder(Status.HTTP_VERSION_NOT_SUPPORTED, entity);
	}

}
