/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.http.client.reactive;

import org.springframework.http.HttpMethod;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.function.Function;

/**
 * Abstraction over HTTP clients driving the underlying HTTP client to connect
 * to the origin server and provide all necessary infrastructure to send a
 * {@link ClientHttpRequest} and receive a {@link ClientHttpResponse}.
 *
 * @author Brian Clozel
 * @since 5.0
 */
public interface ClientHttpConnector {

	/**
	 * Connect to the origin server using the given {@code HttpMethod} and
	 * {@code URI}, then apply the given {@code requestCallback} on the
	 * {@link ClientHttpRequest} once the connection has been established.
	 * <p>Return a publisher of the {@link ClientHttpResponse}.
	 *
	 * @param method          the HTTP request method
	 * @param uri             the HTTP request URI
	 * @param requestCallback a function that prepares and writes the request,
	 *                        returning a publisher that signals when it's done interacting with the
	 *                        request. Implementations should return a {@code Mono<Void>} by calling
	 *                        {@link ClientHttpRequest#writeWith} or {@link ClientHttpRequest#setComplete}.
	 * @return a publisher of the {@link ClientHttpResponse}
	 */
	Mono<ClientHttpResponse> connect(HttpMethod method, URI uri,
									 Function<? super ClientHttpRequest, Mono<Void>> requestCallback);

}
