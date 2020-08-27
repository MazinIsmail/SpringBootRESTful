package com.springRESTful.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Filtering
 * 
 * 1. RHS Colon:-
 * 
 * Similar to the bracket approach, you can design an API to take the operator
 * on the RHS instead of LHS. For example, GET /items?price=gte:10&price=lte:100
 * would find all the items where the price is greater than or equal to 10, but
 * less than or equal to 100.
 * 
 * Benefits:
 * 
 * Easiest to parse on server side especially if duplicate filters are not
 * supported. No custom binders are needed. Many API frameworks already handle
 * URL parameter arrays. Multiple price filters will be under the same variable
 * ‘price’ which may be a Sequence or Map.
 * 
 * Downsides:
 * 
 * Literal values need special handling. For example, GET /items?user_id=gt:100
 * would translate to find all items where the user_id is greater than 100.
 * However, what if we want to find all items where the user_id equals gt:100 as
 * that could be a valid id?
 */
@RestController
public class SpringRESTfulFilteringRHSColon {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulFilteringRHSColon.class);

}
