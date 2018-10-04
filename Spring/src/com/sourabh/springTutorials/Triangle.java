package com.sourabh.springTutorials;

public class Triangle {
	private String type;
	private int height;
	private int width;
	private String type1;
	private Points pointA;
	private Points pointB;
	private Points pointC;
	private Points pointD;
	
	public Triangle(int width) {
		this.width = width;
	}
	public Triangle(String type1) {
		this.type1 = type1;
	}
	public Triangle(String type, Points pointA, Points pointD) {
		this.type = type;
		this.pointA = pointA;
		this.pointD = pointD;
	}
	
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
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

	public Points getPointD() {
		return pointD;
	}
	public void setPointD(Points pointD) {
		this.pointD = pointD;
	}
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
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
		System.out.println("This is a "+getType()+" Triangle of height "+getHeight() + " and width "+getWidth());
		System.out.println("Point A's x is "+getPointA().getX()+ " and y is "+getPointA().getY());
		System.out.println("Point B's x is "+getPointB().getX()+ " and y is "+getPointB().getY());
		System.out.println("Point C's x is "+getPointC().getX()+ " and y is "+getPointC().getY());
		System.out.println("Point D's x is "+getPointD().getX()+ " and y is "+getPointD().getY());
	}
}
