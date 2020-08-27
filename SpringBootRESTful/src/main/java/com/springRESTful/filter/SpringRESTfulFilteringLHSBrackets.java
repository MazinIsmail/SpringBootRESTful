package com.springRESTful.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Filtering
 * 
 * 1. LHS Brackets:-
 * 
 * One way to encode operators is the use of square brackets [] on the key name.
 * For example, GET /items?price[gte]=10&price[lte]=100 would find all the items
 * where the price is greater than or equal to 10, but less than or equal to
 * 100.
 * 
 * We can have as many operators as needed such as [lte], [gte], [exists],
 * [regex], [before], and [after].
 * 
 * LHS Brackets are a little harder to parse on server side, but provides
 * greater flexibility in what the filter value is for clients. No need to
 * handle special characters differently.
 * 
 * Benefits:
 * 
 * 1. Ease of use for clients. There are many query string parsing libraries
 * available that easily encode nested JSON objects into square brackets. qs is
 * one such library that automatically encodes/decodes square brackets:
 * 
 * var qs = require('qs');
 * 
 * var assert = require('assert');
 * 
 * assert.deepEqual(qs.parse('price[gte]=10&price[lte]=100'), {
 * 
 * price: { gte: 10, lte: 100 }
 * 
 * });
 * 
 * 2. Simple to parse on server side. The URL parameter key contains both the
 * field name and operator. Easy to GROUP BY (property name, operator) without
 * looking at the URL parameter values.
 * 
 * 3. No need to escape special characters in the filter value when operator is
 * taken as a literal filter term.
 * 
 * Downsides:
 * 
 * 1. May require more work on server side to parse and group the filters. You
 * may have to write a custom URL parameter binder or parser to split the query
 * string key into two components: The field name and the operator. You would
 * then need to GROUP BY (property name, operator).
 * 
 * 2. Special characters in variable names can be awkward. You may have to write
 * a custom binder to split the query string key into two components: The field
 * name and the operator.
 * 
 * 3. Hard to manage custom combinational filters. Multiple filters with the
 * same property name and operator result in an implicit AND. What if the API
 * user wanted to OR the filters instead. i.e. find all items where price is
 * less than 10 OR greater than 100?
 */
@RestController
public class SpringRESTfulFilteringLHSBrackets {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulFilteringLHSBrackets.class);

}
