package com.shekhar.spring.tutorial14.lifeCycle.part2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("tutorial14_part2.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}
