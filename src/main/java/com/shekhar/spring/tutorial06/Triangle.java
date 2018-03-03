package com.shekhar.spring.tutorial06;

public class Triangle {

	private String type;
	private int number;

	/*public Triangle(String type, int number){
		this.number = number;
		this.type = type;			
	}*/
	public Triangle(Integer number){
		this.number = number;
	}
	public Triangle(String type){
		this.type = type;
	}
	
	
	
	public String getType() {
		return type;
	}
	
	public int getNumber() {
		return number;
	}

	public void draw(){
		System.out.println("Draw "+getNumber()+" "+getType()+" triangle.");
	}
	
	
}
