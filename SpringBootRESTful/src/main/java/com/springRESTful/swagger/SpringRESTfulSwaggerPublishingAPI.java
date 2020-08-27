package com.springRESTful.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Search Query Param
 * 
 * When you feel your API definition is ready for production use, you can
 * publish it. Publishing is a way to show that the API is in a stable state and
 * its endpoints can be reliably called from other applications.
 * 
 * Publishing makes the API definition read-only, so any changes you make after
 * that point should be saved as a new version of the API. Collaborators will
 * not be able to edit the published version either.
 * 
 * An unpublished API definition is a draft, a work in progress. Every API in
 * SwaggerHub starts as unpublished. Though unpublished APIs are listed in the
 * SwaggerHub registry, they are not ready for API consumers.
 * 
 * A published API definition is a stable version ready for consuming from
 * client applications. It is not supposed to be changed, and any changes will
 * be introduced as a new version of the API. Published API versions cannot be
 * edited (unless you unpublish them). If you want to change something, you
 * should create a new version of the API and make changes in it.
 * 
 * Public and private indicate who can see the API in SwaggerHub; everyone or
 * just the selected collaborators. Published and unpublished indicate
 * production readiness – whether the API is ready for consumption or not.
 */
@RestController
public class SpringRESTfulSwaggerPublishingAPI {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulSwaggerPublishingAPI.class);

}
