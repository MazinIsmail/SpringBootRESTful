package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * REST API Versioning
 * 
 * Change in an API is inevitable as your knowledge and experience of a system
 * improve. Managing the impact of this change can be quite a challenge when it
 * threatens to break existing client integration.
 * 
 * APIs only need to be up-versioned when a breaking change is made. Breaking
 * changes include:
 * 
 * a change in the format of the response data for one or more calls.
 * 
 * a change in the response type (i.e. changing an integer to a float)
 * 
 * removing any part of the API.
 * 
 * Breaking changes should always result in a change to the major version number
 * for an API or content response type.
 * 
 * Non-breaking changes, such as adding new endpoints or new response
 * parameters, do not require a change to the major version number. However, it
 * can be helpful to track the minor versions of APIs when changes are made to
 * support customers who may be receiving cached versions of data or may be
 * experiencing other API issues.
 * 
 * 
 * REST doesn’t provide for any specific versioning guidelines but the more
 * commonly used approaches fall into three categories:-
 * 
 * 1. URI Versioning: Using the URI is the most straightforward approach (and
 * most commonly used as well) though it does violate the principle that a URI
 * should refer to a unique resource. You are also guaranteed to break client
 * integration when a version is updated.
 * 
 * http://api.example.com/v1
 * 
 * http://apiv1.example.com
 * 
 * The version need not be numeric, nor specified using the “v[x]” syntax.
 * Alternatives include dates, project names, seasons or other identifiers that
 * are meaningful enough to the team producing the APIs and flexible enough to
 * change as the versions change.
 * 
 * 2. Versioning using Custom Request Header: A custom header (e.g.
 * Accept-version) allows you to preserve your URIs between versions though it
 * is effectively a duplicate of the content negotiation behavior implemented by
 * the existing Accept header.
 * 
 * Accept-version: v1
 * 
 * Accept-version: v2
 * 
 * 3. Versioning using Accept header: Content negotiation may let you preserve a
 * clean set of URLs but you still have to deal with the complexity of serving
 * different versions of content somewhere. This burden tends to be moved up the
 * stack to your API controllers which become responsible for figuring out which
 * version of a resource to send. The end result tends to be a more complex API
 * as clients have to know which headers to specify before requesting a
 * resource.
 * 
 * Accept: application/vnd.example.v1+json
 * 
 * Accept: application/vnd.example+json;version=1.0
 * 
 * In the real world, an API is never going to be completely stable. So it’s
 * important how this change is managed. A well documented and gradual
 * deprecation of API can be an acceptable practice for most of the APIs.
 */
@Component
public class SpringRESTfulVersioning {

}
