package com.springRESTful.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Filtering
 * 
 * URL parameters is the easiest way to add basic filtering to REST APIs. If you
 * have an /items endpoint which are items for sale, you can filter via the
 * property name such as GET /items?state=active or GET
 * /items?state=active&seller_id=1234. However, this only works for exact
 * matches. What if you want to do a range such as a price or date range?
 * 
 * The problem is URL parameters only have a key and a value but filters are
 * composed of three components:-
 * 
 * The property or field name
 * 
 * The operator such as eq, lte, gte
 * 
 * The filter value
 * 
 * There are various ways to encode three components into URL param key/values.
 * 
 * 1. LHS Brackets
 * 
 * 2. RHS Colon
 */
@RestController
public class SpringRESTfulFiltering {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulFiltering.class);

}
