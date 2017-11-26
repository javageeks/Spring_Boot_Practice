package com.geenhorn.spring_demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class MyRestController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello ! Welcome to Spring MVC";
	}

}