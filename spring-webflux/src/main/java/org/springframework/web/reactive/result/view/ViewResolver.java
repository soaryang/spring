package org.springframework.web.reactive.result.view;

import reactor.core.publisher.Mono;

import java.util.Locale;

/**
 * Contract to resolve a view name to a {@link View} instance. The view name may
 * correspond to an HTML template or be generated dynamically.
 *
 * <p>The process of view resolution is driven through a ViewResolver-based
 * {@code HandlerResultHandler} implementation called
 * {@link ViewResolutionResultHandler
 * ViewResolutionResultHandler}.
 *
 * @author Rossen Stoyanchev
 * @see ViewResolutionResultHandler
 * @since 5.0
 */
public interface ViewResolver {

	/**
	 * Resolve the view name to a View instance.
	 *
	 * @param viewName the name of the view to resolve
	 * @param locale   the locale for the request
	 * @return the resolved view or an empty stream
	 */
	Mono<View> resolveViewName(String viewName, Locale locale);

}
