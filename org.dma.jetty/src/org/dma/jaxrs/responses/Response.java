/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Filipe Santos (filipesantos__12@hotmail.com)
 *******************************************************************************/
package org.dma.jaxrs.responses;

import java.io.File;
import java.util.HashMap;

import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.dma.java.util.StringUtils;

public class Response<T> extends HashMap<String, Object> implements IResponse {

	private Status status;
	private T entity;

	public Response(Status status) {
		this(status, null);
	}

	public Response(Status status, T entity) {
		this.status=status;
		this.entity=entity;
	}

	public Response(javax.ws.rs.core.Response response) {
		this.status=Status.fromStatusCode(response.getStatus());
		this.entity=(T)response.getEntity();
		for(String header : response.getHeaders().keySet()){
			setHeader(header, response.getHeaders().get(header));
		}
	}

	/*
	 * Build
	 */
	public javax.ws.rs.core.Response build() {
		ResponseBuilder builder=javax.ws.rs.core.Response.status(status).entity(entity);
		for(String key : keySet()){
			builder.header(key, get(key));
		}return builder.build();
	}

	public Response<T> setHeader(File file) {
		return setHeader("Content-Disposition", "attachment; filename="+StringUtils.quote(file.getName()));
	}

	public Response<T> setHeader(String header, Object value) {
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
	 * To
	 */
	@Override
	public String toString() {
		return Response.class.getCanonicalName() +
				" [status=" + status +
				", entity=" + entity + "]";
	}

	/*
	 * Static Builders
	 */
	public static Response build(Status status) {
		return build(status, null);
	}

	public static <T> Response<T> build(Status status, T entity) {
		return new Response(status, entity);
	}

	/*
	 * Static Builders Shortcuts
	 */
	public static Response ok() {
		return ok(null);
	}

	public static <T> Response<T> ok(T entity) {
		return build(Status.OK, entity);
	}

	public static Response created() {
		return created(null);
	}

	public static <T> Response<T> created(T entity) {
		return build(Status.CREATED, entity);
	}

	public static Response accepted() {
		return accepted(null);
	}

	public static <T> Response<T> accepted(T entity) {
		return build(Status.ACCEPTED, entity);
	}

	public static Response noContent() {
		return noContent(null);
	}

	public static <T> Response<T> noContent(T entity) {
		return build(Status.NO_CONTENT, entity);
	}

	public static Response resetContent() {
		return resetContent(null);
	}

	public static <T> Response<T> resetContent(T entity) {
		return build(Status.RESET_CONTENT, entity);
	}

	public static Response partialContent() {
		return partialContent(null);
	}

	public static <T> Response<T> partialContent(T entity) {
		return build(Status.PARTIAL_CONTENT, entity);
	}

	public static Response movedPermanently() {
		return movedPermanently(null);
	}

	public static <T> Response<T> movedPermanently(T entity) {
		return build(Status.MOVED_PERMANENTLY, entity);
	}

	public static Response found() {
		return found(null);
	}

	public static <T> Response<T> found(T entity) {
		return build(Status.FOUND, entity);
	}

	public static Response seeOther() {
		return seeOther(null);
	}

	public static <T> Response<T> seeOther(T entity) {
		return build(Status.SEE_OTHER, entity);
	}

	public static Response notModified() {
		return notModified(null);
	}

	public static <T> Response<T> notModified(T entity) {
		return build(Status.NOT_MODIFIED, entity);
	}

	public static Response useProxy() {
		return useProxy(null);
	}

	public static <T> Response<T> useProxy(T entity) {
		return build(Status.USE_PROXY, entity);
	}

	public static Response temporaryRedirect() {
		return temporaryRedirect(null);
	}

	public static <T> Response<T> temporaryRedirect(T entity) {
		return build(Status.TEMPORARY_REDIRECT, entity);
	}

	public static Response badRequest() {
		return badRequest(null);
	}

	public static <T> Response<T> badRequest(T entity) {
		return build(Status.BAD_REQUEST, entity);
	}

	public static Response unauthorized() {
		return unauthorized(null);
	}

	public static <T> Response<T> unauthorized(T entity) {
		return build(Status.UNAUTHORIZED, entity);
	}

	public static Response paymentRequired() {
		return paymentRequired(null);
	}

	public static <T> Response<T> paymentRequired(T entity) {
		return build(Status.PAYMENT_REQUIRED, entity);
	}

	public static Response forbidden() {
		return forbidden(null);
	}

	public static <T> Response<T> forbidden(T entity) {
		return build(Status.FORBIDDEN, entity);
	}

	public static Response notFound() {
		return notFound(null);
	}

	public static <T> Response<T> notFound(T entity) {
		return build(Status.NOT_FOUND, entity);
	}

	public static Response methodNotAllowed() {
		return methodNotAllowed(null);
	}

	public static <T> Response<T> methodNotAllowed(T entity) {
		return build(Status.METHOD_NOT_ALLOWED, entity);
	}

	public static Response notAcceptable() {
		return notAcceptable(null);
	}

	public static <T> Response<T> notAcceptable(T entity) {
		return build(Status.NOT_ACCEPTABLE, entity);
	}

	public static Response proxyAuthenticationRequired() {
		return proxyAuthenticationRequired(null);
	}

	public static <T> Response<T> proxyAuthenticationRequired(T entity) {
		return build(Status.PROXY_AUTHENTICATION_REQUIRED, entity);
	}

	public static Response requestTimeout() {
		return requestTimeout(null);
	}

	public static <T> Response<T> requestTimeout(T entity) {
		return build(Status.REQUEST_TIMEOUT, entity);
	}

	public static Response conflict() {
		return conflict(null);
	}

	public static <T> Response<T> conflict(T entity) {
		return build(Status.CONFLICT, entity);
	}

	public static Response gone() {
		return gone(null);
	}

	public static <T> Response<T> gone(T entity) {
		return build(Status.GONE, entity);
	}

	public static Response lengthRequired() {
		return lengthRequired(null);
	}

	public static <T> Response<T> lengthRequired(T entity) {
		return build(Status.LENGTH_REQUIRED, entity);
	}

	public static Response preconditionFailed() {
		return preconditionFailed(null);
	}

	public static <T> Response<T> preconditionFailed(T entity) {
		return build(Status.PRECONDITION_FAILED, entity);
	}

	public static Response requestEntityTooLarge() {
		return requestEntityTooLarge(null);
	}

	public static <T> Response<T> requestEntityTooLarge(T entity) {
		return build(Status.REQUEST_ENTITY_TOO_LARGE, entity);
	}

	public static Response requestURITooLong() {
		return requestURITooLong(null);
	}

	public static <T> Response<T> requestURITooLong(T entity) {
		return build(Status.REQUEST_URI_TOO_LONG, entity);
	}

	public static Response unsupportedMediaType() {
		return unsupportedMediaType(null);
	}

	public static <T> Response<T> unsupportedMediaType(T entity) {
		return build(Status.UNSUPPORTED_MEDIA_TYPE, entity);
	}

	public static Response requestedRangeNotSatisfiable() {
		return requestedRangeNotSatisfiable(null);
	}

	public static <T> Response<T> requestedRangeNotSatisfiable(T entity) {
		return build(Status.REQUESTED_RANGE_NOT_SATISFIABLE, entity);
	}

	public static Response expectationFailed() {
		return expectationFailed(null);
	}

	public static <T> Response<T> expectationFailed(T entity) {
		return build(Status.EXPECTATION_FAILED, entity);
	}

	public static Response internalServerError() {
		return internalServerError(null);
	}

	public static <T> Response<T> internalServerError(T entity) {
		return build(Status.INTERNAL_SERVER_ERROR, entity);
	}

	public static Response notImplemented() {
		return notImplemented(null);
	}

	public static <T> Response<T> notImplemented(T entity) {
		return build(Status.NOT_IMPLEMENTED, entity);
	}

	public static Response badGateway() {
		return badGateway(null);
	}

	public static <T> Response<T> badGateway(T entity) {
		return build(Status.BAD_GATEWAY, entity);
	}

	public static Response serviceUnavailable() {
		return serviceUnavailable(null);
	}

	public static <T> Response<T> serviceUnavailable(T entity) {
		return build(Status.SERVICE_UNAVAILABLE, entity);
	}

	public static Response gatewayTimeout() {
		return gatewayTimeout(null);
	}

	public static <T> Response<T> gatewayTimeout(T entity) {
		return build(Status.GATEWAY_TIMEOUT, entity);
	}

	public static Response httpVersionNotSupported() {
		return httpVersionNotSupported(null);
	}

	public static <T> Response<T> httpVersionNotSupported(T entity) {
		return build(Status.HTTP_VERSION_NOT_SUPPORTED, entity);
	}

}