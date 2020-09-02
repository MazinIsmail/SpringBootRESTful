package com.springRESTful.constraints;

import org.springframework.stereotype.Component;

/**
 * REST Architectural Constraints (Hint: UCSC-LC)
 * 
 * It is an architecture style for designing loosely coupled applications over
 * HTTP, that is often used in the development of web services. REST does not
 * enforce any rule regarding how it should be implemented at lower level, it
 * just put high level design guidelines and leave you to think of your own
 * implementation.
 * 
 * REST defines 6 architectural constraints which make any web service – a true
 * RESTful API:-
 * 
 * 1. Uniform interface
 * 
 * Once a developer becomes familiar with one of your APIs, he should be able to
 * follow a similar approach for other APIs.
 * 
 * As the constraint name itself applies, you MUST decide APIs interface for
 * resources inside the system which are exposed to API consumers and follow
 * religiously. A resource in the system should have only one logical URI, and
 * that should provide a way to fetch related or additional data. It’s always
 * better to synonymize a resource with a web page.
 * 
 * Any single resource should not be too large and contain each and everything
 * in its representation. Whenever relevant, a resource should contain links
 * (HATEOAS) pointing to relative URIs to fetch related information.
 * 
 * Also, the resource representations across the system should follow specific
 * guidelines such as naming conventions, link formats, or data format (XML
 * or/and JSON).
 * 
 * All resources should be accessible through a common approach such as HTTP GET
 * and similarly modified using a consistent approach.
 * 
 * 2. Client–server
 * 
 * This constraint essentially means that client application and server
 * application MUST be able to evolve separately without any dependency on each
 * other. A client should know only resource URIs, and that’s all.
 * 
 * 3. Stateless
 * 
 * Make all client-server interactions stateless. The server will not store
 * anything about the latest HTTP request the client made. It will treat every
 * request as new. No session, no history.
 * 
 * 4. Cacheable
 * 
 * Caching of data and responses is of utmost importance wherever they are
 * applicable/possible. Caching brings performance improvement for the
 * client-side and better scope for scalability for a server because the load
 * has reduced.
 * 
 * Caching can be implemented on the server or client-side.
 * 
 * 5. Layered system
 * 
 * REST allows you to use a layered system architecture where you deploy the
 * APIs on server A, and store data on server B and authenticate requests in
 * Server C, for example. A client cannot ordinarily tell whether it is
 * connected directly to the end server or an intermediary along the way.
 * 
 * 6. Code on demand (optional)
 * 
 * Well, this constraint is optional. Most of the time, you will be sending the
 * static representations of resources in the form of XML or JSON. But when you
 * need to, you are free to return executable code to support a part of your
 * application, e.g., clients may call your API to get a UI widget rendering
 * code. It is permitted.
 * 
 * 
 * All the above constraints help you build a truly RESTful API, and you should
 * follow them. Still, at times, you may find yourself violating one or two
 * constraints. Do not worry; you are still making a RESTful API – but not
 * “truly RESTful.”
 */
@Component
public class SpringRESTfulConstraints {

}
