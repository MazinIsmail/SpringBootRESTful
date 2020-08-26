package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * Caching REST API Response
 * 
 * Caching is the ability to store copies of frequently accessed data in several
 * places along the request-response path. When a consumer requests a resource
 * representation, the request goes through a cache or a series of caches (local
 * cache, proxy cache, or reverse proxy) toward the service hosting the
 * resource. If any of the caches along the request path has a fresh copy of the
 * requested representation, it uses that copy to satisfy the request. If none
 * of the caches can satisfy the request, the request travels to the service (or
 * origin server as it is formally known).
 * 
 * By using HTTP headers, an origin server indicates whether a response can be
 * cached and, if so, by whom, and for how long. Caches along the response path
 * can take a copy of a response, but only if the caching metadata allows them
 * to do so.
 * 
 * Optimizing the network using caching improves the overall quality-of-service
 * in the following ways:
 * 
 * Reduce bandwidth
 * 
 * Reduce latency
 * 
 * Reduce load on servers
 * 
 * Hide network failures
 * 
 * Being cacheable is one of architectural constraints of REST. GET requests
 * should be cachable by default – until special condition arises. Usually,
 * browsers treat all GET requests cacheable. POST requests are not cacheable by
 * default but can be made cacheable if either an 'Expires' header or a
 * 'Cache-Control' header with a directive, to explicitly allows caching, is
 * added to the response. Responses to PUT and DELETE requests are not cacheable
 * at all.
 * 
 * Expires:-
 * 
 * The Expires HTTP header specifies an absolute expiry time for a cached
 * representation. Beyond that time, a cached representation is considered stale
 * and must be re-validated with the origin server. To indicate that a
 * representation never expires, a service can include a time up to one year in
 * the future.
 * 
 * Cache-Control:-
 * 
 * The header value comprises one or more comma-separated directives. These
 * directives determine whether a response is cacheable, and if so, by whom, and
 * for how long e.g. max-age or s-maxage directives.
 * 
 * Cache-Control: max-age=3600
 * 
 * Cacheable responses (whether to a GET or to a POST request) should also
 * include a validator — either an ETag or a Last-Modified header.
 * 
 * ETag:-
 * 
 * An ETag value is an opaque string token that a server associates with a
 * resource to uniquely identify the state of the resource over its lifetime.
 * When the resource changes, the ETag changes accordingly.
 * 
 * ETag: "abcd1234567n34jv"
 * 
 * Last-Modified:-
 * 
 * Whereas a response’s Date header indicates when the response was generated,
 * the Last-Modified header indicates when the associated resource last changed.
 * The Last-Modified value cannot be less than the Date value.
 * 
 * Last-Modified: Fri, 10 May 2016 09:17:49 IST
 */
@Component
public class SpringRESTfulCaching {

}
