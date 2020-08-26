package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * Content Negotiation in REST APIs
 * 
 * Generally, resources can have multiple presentations, mostly because there
 * may be multiple different clients expecting different representations. Asking
 * for a suitable presentation by a client, is referred as content negotiation.
 * 
 * If the selection of the best representation for a response is made by an
 * algorithm located at the server, it is called server-driven negotiation. If
 * that selection is made at agent or client-side, its called agent-driven
 * content negotiation.
 * 
 * Practically, you will NOT find much usage of server-side negotiations
 * because, in that way, you have to make lots of assumptions about client
 * expectations.
 * 
 * So, most REST API implementations rely on agent-driven content negotiations.
 * Agent driven content negotiation rely on usage of HTTP request headers or
 * resource URI patterns.
 * 
 * Content negotiation using HTTP headers:-
 * 
 * Server uses the HTTP request header Content-Type. Some common examples of
 * content types are “text/plain”, “application/xml”, “text/html”,
 * “application/json”, “image/gif”, and “image/jpeg”.
 * 
 * Content-Type: application/json
 * 
 * Similarly, to determine what type of representation is desired at client
 * side, HTTP header ACCEPT is used. It will have one of the values as mentioned
 * for Content-Type above.
 * 
 * Accept: application/json
 * 
 * Content negotiation using URL patterns:-
 * 
 * Another way to pass content type information to the server, the client may
 * use the specific extension in resource URIs. For example, a client can ask
 * for details using:
 * 
 * http://rest.api.com/v1/employees/20423.xml
 * 
 * http://rest.api.com/v1/employees/20423.json
 * 
 * In above case, first request URI will return a XML response whether second
 * request URI will return a JSON response.
 * 
 * 
 * It is possible to have multiple values in Accept header.
 */
// Accept: application/json,application/xml;q=0.9,*/*;q=0.8
/**
 * Above Accept header allows you to ask the server a JSON format. If it can’t,
 * perhaps it could return XML format (the second level). If it’s still not
 * possible, let it return what it can.
 * 
 * The preference order is defined through the q parameter with values from 0 to
 * 1. When nothing is specified, the implicit value is 1.
 */
@Component
public class SpringRESTfulContentNegotiation {

}
