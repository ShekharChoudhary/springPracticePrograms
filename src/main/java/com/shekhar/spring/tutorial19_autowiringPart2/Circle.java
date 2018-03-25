package com.shekhar.spring.tutorial19_autowiringPart2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw(){
		System.out.println("Center is ( "+getCenter().getX()+","+getCenter().getY()+" )");
	}
	
}
