package com.greenhorn.spring_boot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBoot {

	public static void main(String[] args) {
		
	SpringApplication.run(HelloSpringBoot.class, args);

	}

	
	
	//to see the initialized beans
	/*	 ApplicationContext ctx = SpringApplication.run(HelloSpringBoot.class, args);
			 System.out.println("Let's inspect the beans provided by Spring Boot:");
	
	         String[] beanNames = ctx.getBeanDefinitionNames();
	         Arrays.sort(beanNames);
	         for (String beanName : beanNames) {
	             System.out.println(beanName);
	         }*/
}
