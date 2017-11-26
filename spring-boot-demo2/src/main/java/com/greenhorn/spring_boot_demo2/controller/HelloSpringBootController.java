package com.greenhorn.spring_boot_demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello .. welcome to Spring Boot ..";
	}
}
