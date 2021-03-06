package com.shekhar.spring.tutorial04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Tutorial04.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}
}
