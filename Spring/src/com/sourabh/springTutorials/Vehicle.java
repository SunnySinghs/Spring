package com.sourabh.springTutorials;

public class Vehicle {

	private String type;
	private int srNo;

	public Vehicle(String type) {
		super();
		this.type = type;
	}

	public Vehicle(int srNo) {
		super();
		this.srNo = srNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	
	public void print() {
		System.out.println("Vehicle type : "+getType());
		System.out.println("Vehicle srNo : "+getSrNo());
	}
}
