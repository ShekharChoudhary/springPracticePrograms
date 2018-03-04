package com.shekhar.spring.tutorial10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("tutorial10.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();	
	}
	
}
