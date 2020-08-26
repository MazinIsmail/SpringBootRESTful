package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * REST API Security Essentials
 * 
 * There are multiple ways to secure a RESTful API e.g. basic auth, OAuth etc.
 * but one thing is sure that RESTful APIs should be stateless – so request
 * authentication/authorization should not depend on cookies or sessions.
 * Instead, each API request should come with some sort authentication
 * credentials which must be validated on the server for every request.
 * 
 * REST Security Design Principles:-
 * 
 * 1. Least Privilege: An entity should only have the required set of
 * permissions to perform the actions for which they are authorized, and no
 * more. Permissions can be added as needed and should be revoked when no longer
 * in use.
 * 
 * 2. Fail-Safe Defaults: A user’s default access level to any resource in the
 * system should be “denied” unless they’ve been granted a “permit” explicitly.
 * 
 * 3. Economy of Mechanism: The design should be as simple as possible. All the
 * component interfaces and the interactions between them should be simple
 * enough to understand.
 * 
 * 4. Complete Mediation: A system should validate access rights to all its
 * resources to ensure that they’re allowed and should not rely on the cached
 * permission matrix. If the access level to a given resource is being revoked,
 * but that isn’t reflected in the permission matrix, it would violate the
 * security.
 * 
 * 5. Open Design: This principle highlights the importance of building a system
 * in an open manner—with no secret, confidential algorithms.
 * 
 * 6. Separation of Privilege: Granting permissions to an entity should not be
 * purely based on a single condition, a combination of conditions based on the
 * type of resource is a better idea.
 * 
 * 7. Least Common Mechanism: It concerns the risk of sharing state among
 * different components. If one can corrupt the shared state, it can then
 * corrupt all the other components that depend on it.
 * 
 * 8. Psychological Acceptability: It states that security mechanisms should not
 * make the resource more difficult to access than if the security mechanisms
 * were not present. In short, security should not make worse the user
 * experience.
 * 
 * Best Practices to Secure REST APIs:-
 * 
 * Keep it Simple: Secure an API/System – just how secure it needs to be. Every
 * time you make the solution more complex “unnecessarily,” you are also likely
 * to leave a hole.
 * 
 * Always Use HTTPS: By always using SSL, the authentication credentials can be
 * simplified to a randomly generated access token. The token is delivered in
 * the username field of HTTP Basic Auth. It’s relatively simple to use, and you
 * get a lot of security features for free. If you use HTTP 2, to improve
 * performance – you can even send multiple requests over a single connection,
 * that way you avoid the complete TCP and SSL handshake overhead on later
 * requests.
 * 
 * Use Password Hash: Passwords must always be hashed to protect the system (or
 * minimize the damage) even if it is compromised in some hacking attempts.
 * There are many such hashing algorithms which can prove really effective for
 * password security e.g. PBKDF2, bcrypt and scrypt algorithms.
 * 
 * Never expose information on URLs: Usernames, passwords, session tokens, and
 * API keys should not appear in the URL, as this can be captured in web server
 * logs, which makes them easily exploitable.
 * 
 * Consider OAuth
 * 
 * Input Parameter Validation: Validate request parameters on the very first
 * step, before it reaches to application logic. Put strong validation checks
 * and reject the request immediately if validation fails. In API response, send
 * relevant error messages and example of correct input format to improve user
 * experience.
 */
@Component
public class SpringRESTfulSecurityEssentials {

}
