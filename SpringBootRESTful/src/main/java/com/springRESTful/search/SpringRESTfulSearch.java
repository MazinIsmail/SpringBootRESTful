package com.springRESTful.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Search Query Param
 * 
 * If you require search on your endpoint, you can add support for filters and
 * ranges directly with the search parameter. If you’re already using
 * ElasticSearch or other Lucene based technology, you could support the Lucene
 * syntax or ElasticSearch Simple Query Strings directly.
 * 
 * For example, we could search items for those that contain the terms red chair
 * and the price is greater than or equal to 10 and less than or equal to 100:
 * GET /items?q=title:red chair AND price:[10 TO 100]
 * 
 * Such APIs can allow fuzziness matching, boosting certain terms, and more.
 * 
 * Benefits:
 * 
 * Most flexible queries for API users
 * 
 * Almost no parsing required on backend, can pass directly to search engine or
 * database (Just be careful of sanitizing inputs for security)
 * 
 * Downsides:
 * 
 * Harder for beginners to start working with the API. Need to become familiar
 * Lucene syntax.
 * 
 * Full-text search doesn’t make sense for all resources. For example, Fuzziness
 * and term boosting doesn’t make sense for time series metric data.
 * 
 * Requires URL percent encoding which makes using cURL or Postman more
 * complicated.
 */
@RestController
public class SpringRESTfulSearch {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulSearch.class);

}
