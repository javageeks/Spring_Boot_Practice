package com.greenhorn.spring_demo1;

public class HelloSpring {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
	
	// #demo with out DI / with normal java approach   
	
/*	public static void main(String[] args) {
		HelloSpring hs = new HelloSpring();
		hs.name = "Shaik Hussain";
		hs.printHello();
	}*/

}
