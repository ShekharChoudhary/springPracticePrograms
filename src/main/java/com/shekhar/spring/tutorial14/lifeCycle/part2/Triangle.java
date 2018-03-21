package com.shekhar.spring.tutorial14.lifeCycle.part2;

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
		point.stream().forEach(e -> System.out.println("( "+e.getX() +","+e.getY()+" )"));
	}
	
	public void startUp(){
		System.out.println("The beans has been initialized");
	}
	
	public void shutDown(){
		System.out.println("The beans has been shutdown.");
	}
}
