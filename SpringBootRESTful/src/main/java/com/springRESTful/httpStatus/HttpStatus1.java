package com.springRESTful.httpStatus;

/**
 * An informational response indicates that the request was received and
 * understood. It is issued on a provisional basis while request processing
 * continues. It alerts the client to wait for a final response.
 * 
 * 100 Continue: The 100 Continue status code means that the initial part of the
 * request has been received by the server and that the client should proceed
 * with the request or ignore the response if the request has already finished.
 *
 * 101 Switching Protocols: The requester has asked the server to switch
 * protocols and the server has agreed to do so.
 * 
 * 102 Processing: This code indicates that the server has received and is
 * processing the request, but no response is available yet. This prevents the
 * client from timing out and assuming the request was lost.
 * 
 * 103 Early Hints: Used to return some response headers before final HTTP
 * message.
 * 
 */
public class HttpStatus1 {

}
