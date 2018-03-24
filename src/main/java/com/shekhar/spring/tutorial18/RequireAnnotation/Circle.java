package com.shekhar.spring.tutorial18.RequireAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class Circle {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw(){
		System.out.println("Center of the circle is ("+getCenter().getX()+" , "+getCenter().getY()+" )");
	}
	
}
