package com.springRESTful.approaches;

import org.springframework.stereotype.Component;

/**
 * Contract First Approach
 * 
 * In a Contract-First approach, you first define the contract, and then
 * implement the service.
 * 
 * When we start out with establishing a contract, we define a contract and then
 * share it with our consumer. All this can happen even before we implement the
 * service and make it available.
 * 
 * The contract tells the consumer what the request and response communication
 * is expected to be. Once the contract is in place, the service provider can
 * work on providing a service that adheres to the contract. The service
 * consumer can work on developing an application to consume it.
 * 
 * Advantages of Contract First:-
 * 
 * Teams Can Develop in Parallel
 * 
 * Teams Know What to Expect
 * 
 * Cross-Platform Compatible
 * 
 * Disadvantages of Contract First:-
 * 
 * Requires Initial Additional Effort
 * 
 * When Developer Experience Matters: A well-designed API can do wonders for the
 * adoption and consumption of your APIs, and good design can be better achieved
 * with the design-first approach. If your API strategy involves the high
 * adoption of your API and retention of users integrating with your API, then
 * good Developers Experience (DX) matters.
 * 
 * When Delivering Mission-Critical APIs: The biggest reason to go for the
 * design-first approach is when your API’s target audience is external
 * customers or partners. In such a case, your API is a key distribution channel
 * that your end customers can use to consume the services you provide, and good
 * design plays a key role in determining customer satisfaction.
 * 
 * When Ensuring Good Communication: The API contract can act as the central
 * draft that keeps all your team members aligned on what your API’s objectives
 * are, and how your API’s resources are exposed. Spotting issues in the design,
 * before writing any code is a much more efficient and streamlined approach,
 * than doing so after the implementation is already in place.
 */
@Component
public class SpringRESTfulContractFirstApproache {

}
