package com.springRESTful.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springRESTful.service.SpringRESTfulService;

@RestController
public class SpringRESTfulController {

	public static final Logger logger = LoggerFactory.getLogger(SpringRESTfulController.class);

	@Autowired
	SpringRESTfulService azureADService;

}
