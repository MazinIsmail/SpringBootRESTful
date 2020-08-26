package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * Statelessness in REST APIs
 * 
 * As per the REST (REpresentational “State” Transfer) architecture, the server
 * does not store any state about the client session on the server-side. This
 * restriction is called Statelessness. Each request from the client to server
 * must contain all of the information necessary to understand the request, and
 * cannot take advantage of any stored context on the server. Session state is
 * therefore kept entirely on the client. Client is responsible for storing and
 * handling all application state-related information on client side.
 * 
 * Application state is server-side data which servers store to identify
 * incoming client requests, their previous interaction details, and current
 * context information.
 * 
 * Resource state is the current state of a resource on a server at any point of
 * time – and it has nothing to do with the interaction between client and
 * server. It is what you get as a response from the server as API response. You
 * refer to it as resource representation.
 * 
 * REST statelessness means being free on application state.
 * 
 * Advantages of Statelessness:-
 * 
 * Statelessness helps in scaling the APIs to millions of concurrent users by
 * deploying it to multiple servers. Any server can handle any request because
 * there is no session related dependency.
 * 
 * Being stateless makes REST APIs less complex – by removing all server-side
 * state synchronization logic.
 * 
 * A stateless API is also easy to cache as well. Specific software can decide
 * whether or not to cache the result of an HTTP request just by looking at that
 * one request.
 */
@Component
public class SpringRESTfulStatelessness {

}
