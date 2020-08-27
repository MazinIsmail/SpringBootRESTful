package com.springRESTful.cloudAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cloud APIs
 * 
 * Cloud Application Programming Interface (Cloud API) is a type of API that
 * enables the development of applications and services used for the
 * provisioning of cloud hardware, software, and platforms.
 * 
 * Cloud APIs allows administrators to integrate applications and other
 * workloads into the cloud.
 * 
 * There are four major areas where cloud computing will need to integrate with
 * another platform:-
 * 
 * 1. PaaS APIs (Service-level): Also known as Platform-as-a-Service, these
 * service APIs are designed to provide access and functionality for a cloud
 * environment. This means integration with databases, messaging systems,
 * portals, and even storage components. Hardware and software tools available
 * over the internet.
 * 
 * 2. SaaS APIs (Application-level): These APIs are also referred to as
 * Software-as-a-Service APIs. Their goal is to help connect the
 * application-layer with the cloud and underlying IT infrastructure. Example,
 * Dropbox, Salesforce, Cisco WebEx, Gsuite.
 * 
 * 3. IaaS APIs (Infrastructure-level): Commonly referred to as
 * Infrastructure-as-a-Service, these APIs help control specific cloud resources
 * and their distribution.
 */
@RestController
public class SpringRESTfulCloudAPI {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulCloudAPI.class);

}
