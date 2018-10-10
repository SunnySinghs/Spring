package com.sourabh.springTutorials;

public class Shape {

	Triangle tri;
	Rectangle rect;
	Pentagon pent;
	public Shape(Triangle tri) {
		System.out.println("tri");
		this.tri = tri;
	}
	public Shape(Triangle tri, Rectangle rect) {
		System.out.println("rect");
		this.tri = tri;
		this.rect = rect;
	}
	public Shape(Triangle tri, Rectangle rect, Pentagon pent) {
		System.out.println("pent");
		this.tri = tri;
		this.rect = rect;
		this.pent = pent;
	}
	void draw() {
		System.out.println();
		System.out.println("Traingle : ");
		tri.draw();
		System.out.println("Rectangle : ");
		rect.draw();
		System.out.println("Pentagon : ");
		pent.getRect().draw();
	}
}
