package com.sourabh.springTutorials;

public class Rectangle {
		Points pointB;
		Points pointC;
		Points pointD;
		Points pointE;
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

		public Points getPointE() {
			return pointE;
		}

		public void setPointE(Points pointE) {
			this.pointE = pointE;
		}

		void draw() {
			System.out.println("Point X : "+pointB.getX()+ " Point Y :"+pointB.getY());
			System.out.println("Point X : "+pointC.getX()+ " Point Y :"+pointC.getY());
			System.out.println("Point X : "+pointD.getX()+ " Point Y :"+pointD.getY());
			System.out.println("Point X : "+pointE.getX()+ " Point Y :"+pointE.getY());
		}
}
