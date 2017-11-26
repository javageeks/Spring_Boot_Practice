package com.greenhorn.spring_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDemo1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"helloSpring.xml");

		HelloSpring obj = (HelloSpring) context.getBean("helloBean");
		obj.printHello();

	}

}
