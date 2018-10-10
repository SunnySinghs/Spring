package com.sourabh.springTutorials;

import java.util.List;

public class Square {
	List<Points> points;

	public List<Points> getPoints() {
		return points;
	}

	public void setPoints(List<Points> points) {
		this.points = points;
	}
	
	void draw() {
		for(Points p : points) {
			System.out.println("X:"+p.getX()+" Y:"+p.getY());
		}
	}
}
