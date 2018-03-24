package com.shekhar.spring.tutorial18.RequireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("tutorial18.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}
	
}
