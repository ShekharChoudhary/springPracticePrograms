package com.shekhar.spring.tutorial14.lifeCycle.part1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is mainly used to initialization process before the beans are created for eg. configurations etc
 * also it is used for the clean up process
 * for initialization we use the InitializingBean interface 
 * for clean up we use the DisposableBean interface
 * @author choudshe
 *
 */
public class DrawingApplication {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("tutorial14_part1.xml");
		
		context.registerShutdownHook();
		
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		triangle.draw();
		
	}
	
}
