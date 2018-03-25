package com.shekhar.spring.tutorial19_autowiringPart1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("tutorial19_part1.xml");
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
	}
}
