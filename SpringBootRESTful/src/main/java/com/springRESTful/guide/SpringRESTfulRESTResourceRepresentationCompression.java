package com.springRESTful.guide;

import org.springframework.stereotype.Component;

/**
 * REST Resource Representation Compression
 * 
 * REST APIs can return the resource representations in several formats such as
 * XML, JSON, HTML, or even plain text. All such forms can be compressed to a
 * lesser number of bytes to save bandwidth over the network. Different
 * protocols use different techniques to enable compression and notify the
 * clients about the compression scheme – so that the client can decompress it
 * before consuming the representations.
 * 
 * HTTP is most widely used protocol for REST
 * 
 * Accept-Encoding:-
 * 
 * While requesting resource representations – along with an HTTP request, the
 * client sends an Accept-Encoding header that says what kind of compression
 * algorithms the client understands.
 * 
 * The two standard values for Accept-Encoding are; compress and gzip.
 * 
 * A sample request with accept-encoding header looks like this:
 * 
 * GET /employees HTTP/1.1
 * 
 * Host: www.domain.com
 * 
 * Accept: text/html
 * 
 * Accept-Encoding: gzip,compress
 * 
 * Other possible usage of accept-encoding may be:
 * 
 * Accept-Encoding: compress, gzip
 * 
 * Accept-Encoding:
 * 
 * Accept-Encoding: *
 * 
 * Accept-Encoding: compress;q=0.5, gzip;q=1.0
 * 
 * Accept-Encoding: gzip;q=1.0, identity; q=0.5, *;q=0
 * 
 * If an Accept-Encoding field is present in a request, and if the server cannot
 * send a response which is acceptable according to the Accept-Encoding header,
 * then the server SHOULD send an error response with the 406 (Not Acceptable)
 * status code.
 * 
 * 
 * Content-Encoding:-
 * 
 * If the server understands one of the compression algorithms from
 * Accept-Encoding, it can use that algorithm to compress the representation
 * before serving it. When successfully compressed, server lets know the client
 * of encoding scheme by another HTTP header i.e. Content-Encoding.
 * 
 * 200 OK
 * 
 * Content-Type: text/html
 * 
 * Content-Encoding: gzip
 * 
 * If the content-coding of an entity in a request message is not acceptable to
 * the origin server, the server SHOULD respond with a status code of 415
 * (Unsupported Media Type). If multiple content encodings have been applied to
 * an entity, all the encodings MUST be listed in the order in which they were
 * used.
 * 
 * 
 * Compression can save a lot of bandwidth, with minimal cost without additional
 * complexity. Also, you may know that most web browsers automatically request
 * compressed representations from website host servers – using the above
 * headers.
 */
@Component
public class SpringRESTfulRESTResourceRepresentationCompression {

}
