package com.springRESTful.approaches;

import org.springframework.stereotype.Component;

/**
 * Code First Approach
 * 
 * Advantages of Code First:-
 * 
 * Low-effort contracts: Generating the contract does not require any additional
 * effort. It is just a by-product of the service development, as it can be
 * automatically generated from the code
 * 
 * Contract, code in-sync: As the contract is generated from the code, the two
 * always in sync with each other
 * 
 * 
 * Disadvantages of Code First:-
 * 
 * No Parallel Development
 * 
 * No Target for Teams
 * 
 * No Cross-Platform Compatibility: In some older frameworks, it is not that
 * easy to generate the contract from the code. As a result, it is quite common
 * for the contracts generated not being compatible across platforms.
 * 
 * When Delivery Speedy Matters: Developers can start implementing the API much
 * faster if they start coding the API directly from the requirements document.
 * This is important if your go-to-market strategy emphasizes speed and agility
 * as important factors for the success of the API program.
 * 
 * When Developing Internal APIs: The code-first approach affords speed,
 * automation, and reduced process complexity, at the cost of good developer
 * experience. If the API will only be consumed by the team or company that’s
 * building it, then the code-first approach is an ideal solution. This is
 * especially true if the API developed is small with only a few end points,
 * that will only be used internally.
 */
@Component
public class SpringRESTfulCodeFirstApproache {

}
