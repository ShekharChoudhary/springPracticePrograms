package com.shekhar.spring.tutorial16.beanFactoryPP;

import java.util.List;

public class Triangle {

	private List<Point> point;

	public List<Point> getPoint() {
		return point;
	}

	public void setPoint(List<Point> point) {
		this.point = point;
	}
	
	public void draw(){
	 point.stream().forEach(e -> System.out.println("( "+e.getX()+" , "+e.getY()+" )"));
	}
}
