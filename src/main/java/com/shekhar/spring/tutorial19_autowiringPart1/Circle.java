package com.shekhar.spring.tutorial19_autowiringPart1;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle {

	private Point center;

	public Point getCenter() {
		return center;
	}
	
	/**
	 * if we have only one bean of 'point' in the bean factory then it gets autowired automatically.
	 * But if we have more than one bean of the same type in the bean factory then we have to change
	 * the id of one of the bean and make it 'center'.
	 * so if we have only one bean then it is autowiring by type and it gets autowired by default
	 * and if we have more than one bean of the same type then it is autowiring by name
	 * 
	 * @param center
	 */
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw(){
		System.out.println("Center is ( "+getCenter().getX()+","+getCenter().getY()+" )");
	}
}
