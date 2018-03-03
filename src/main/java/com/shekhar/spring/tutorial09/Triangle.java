package com.shekhar.spring.tutorial09;

import java.util.List;

public class Triangle {

	List<Point> list;

	public List<Point> getList() {
		return list;
	}

	public void setList(List<Point> list) {
		this.list = list;
	}
	
	public void draw(){
		for(Point point : list){
			System.out.println("( "+point.getX()+", "+point.getY()+" )");
		}
	}
}
