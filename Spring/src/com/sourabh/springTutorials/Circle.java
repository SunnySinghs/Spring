package com.sourabh.springTutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {
	Points center;

	public Points getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Points center) {
		this.center = center;
	}

	void draw() {
		System.out.println("Circle center is:"+center.getX()+","+center.getY());
	}
}
