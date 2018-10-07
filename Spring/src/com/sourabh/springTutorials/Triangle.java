package com.sourabh.springTutorials;

public class Triangle {
	private String type;
	private int height;
	private Points pointA;
	private Points pointB;
	private Points pointC;
	
	public Triangle(String type, Points pointA, Points pointB) {
		this.type = type;
		this.pointA = pointA;
		this.pointB = pointB;
	}
	
	public Points getPointA() {
		return pointA;
	}

	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}

	public Points getPointB() {
		return pointB;
	}

	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}

	public Points getPointC() {
		return pointC;
	}

	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println("This is a "+getType()+" Triangle of height "+getHeight());
		System.out.println("Point A's x is "+getPointA().getX()+ " and y is "+getPointA().getY());
		System.out.println("Point B's x is "+getPointB().getX()+ " and y is "+getPointB().getY());
		System.out.println("Point C's x is "+getPointC().getX()+ " and y is "+getPointC().getY());
	}
}
