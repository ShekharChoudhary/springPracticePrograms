package com.shekhar.spring.tutorial14.lifeCycle.part1;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * If we implement the interfaces InitializingBean and DisposableBean and also defind the 
 * init-method and destroy-method property in the XML file then first the default methods of
 * the interfaces are run and after that the methods mentioned in the xml file are run.
 * @author choudshe
 *
 */
public class Triangle implements InitializingBean,DisposableBean {

	private List<Point> point;

	public List<Point> getPoint() {
		return point;
	}

	public void setPoint(List<Point> point) {
		this.point = point;
	}
	
	public void draw(){
		point.stream().forEach(e -> System.out.println("( "+e.getX()+", "+e.getY()+" )"));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean init method called for the triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Desposable bean destroy method called for the triangle");
		
	}
}
