package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * Idempotent REST APIs
 * 
 * In the context of REST APIs, when making multiple identical requests has the
 * same effect as making a single request – then that REST API is called
 * idempotent.
 * 
 * An idempotent HTTP method is an HTTP method that can be called many times
 * without different outcomes. It would not matter if the method is called only
 * once, or ten times over. The result should be the same. Idempotence
 * essentially means that the result of a successfully performed request is
 * independent of the number of times it is executed.
 * 
 * Idempotency with HTTP Methods:-
 * 
 * POST is NOT idempotent.
 * 
 * GET, PUT, DELETE, HEAD, OPTIONS and TRACE are idempotent.
 * 
 * Generally – not necessarily – POST APIs are used to create a new resource on
 * server. So when you invoke the same POST request N times, you will have N new
 * resources on the server. So, POST is not idempotent.
 * 
 * GET, HEAD, OPTIONS and TRACE methods NEVER change the resource state on
 * server. They are purely for retrieving the resource representation or meta
 * data at that point of time. So invoking multiple requests will not have any
 * write operation on server, so GET, HEAD, OPTIONS and TRACE are idempotent.
 * 
 * Generally – not necessarily – PUT APIs are used to update the resource state.
 * If you invoke a PUT API N times, the very first request will update the
 * resource; then rest N-1 requests will just overwrite the same resource state
 * again and again – effectively not changing anything. Hence, PUT is
 * idempotent.
 * 
 * When you invoke N similar DELETE requests, first request will delete the
 * resource and response will be 200 (OK) or 204 (No Content). Other N-1
 * requests will return 404 (Not Found). Clearly, the response is different from
 * first request, but there is no change of state for any resource on server
 * side because original resource is already deleted. So, DELETE is idempotent.
 */
@Component
public class SpringRESTfulIdempotent {

}
