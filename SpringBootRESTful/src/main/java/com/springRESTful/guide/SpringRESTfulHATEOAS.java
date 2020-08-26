package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * HATEOAS Driven REST APIs
 * 
 * HATEOAS (Hypermedia as the Engine of Application State) is a constraint of
 * the REST application architecture that keeps the RESTful style architecture
 * unique from most other network application architectures. The term
 * “hypermedia” refers to any content that contains links to other forms of
 * media such as images, movies, and text.
 * 
 * REST architectural style lets us use the hypermedia links in the response
 * contents. It allows the client can dynamically navigate to the appropriate
 * resources by traversing the hypermedia links.
 * 
 * Navigating hypermedia links is conceptually the same as a web user browsing
 * through web pages by clicking the relevant hyperlinks to achieve a final
 * goal.
 * 
 * The response returned by the server contains hypermedia links to other
 * resources ,which can be traversed by the client to read employees belonging
 * to the department.
 * 
 * REST client hits an initial API URI and uses the server-provided links to
 * dynamically discover available actions and access the resources it needs.
 * Clients no longer have to hard code the URI structures for various resources.
 * HATEOAS allows the server to make URI changes as the API evolves without
 * breaking the clients.
 * 
 * Above API interaction is possible using HATEOAS only.
 * 
 * 
 * The following are the two popular formats for specifying JSON REST API
 * hypermedia links:-
 * 
 * 1. RFC 5988 (web linking)
 * 
 * Target URI: Each link should contain a target Internationalized Resource
 * Identifiers (IRIs). This is represented by the href attribute.
 * 
 * Link relation type: The link relation type describes how the current context
 * (source) is related to the target resource. This is represented by the rel
 * attribute.
 * 
 * Attributes for target IRI: The attributes for a link include hreflang, media,
 * title, and type, and any extension link parameters.
 * 
 * 2. JSON Hypermedia API Language (HAL)
 * 
 * JSON HAL is a promising proposal that sets the conventions for expressing
 * hypermedia controls, such as links, with JSON or XML. It is in the draft
 * stage at this time.
 * 
 * The two associated MIME types are
 * 
 * media type: application/hal+xml
 * 
 * media type: application/hal+json
 * 
 * Each link in HAL may contain the following properties:
 * 
 * Target URI: It indicates the target resource URI. This is represented by the
 * href attribute.
 * 
 * Link relation: The link relation type describes how the current context is
 * related to the target resource. This is represented by the rel attribute.
 * 
 * Type: This indicates the expected resource media type. This is represented by
 * the type attribute.
 * 
 */
@Component
public class SpringRESTfulHATEOAS {

}
