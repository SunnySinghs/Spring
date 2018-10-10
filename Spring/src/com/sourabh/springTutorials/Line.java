package com.sourabh.springTutorials;

public class Line {

	Points pointB;
	Points pointC;
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
	void draw() {
		System.out.println("Point X : "+pointB.getX()+" Points Y : "+pointB.getY());
		System.out.println("Point X : "+pointC.getX()+" Points Y : "+pointC.getY());
	}
	
}
