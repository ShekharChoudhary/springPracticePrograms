package com.shekhar.spring.tutorial15;

import java.util.Set;

public class Triangle {

	private Set<Point> point;

	public Set<Point> getPoint() {
		return point;
	}

	public void setPoint(Set<Point> point) {
		this.point = point;
	}
	
	public void draw(){
		point.stream().forEach(e -> System.out.println("( "+e.getX()+","+e.getY()+" )"));
	}
}
