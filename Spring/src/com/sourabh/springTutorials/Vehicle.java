package com.sourabh.springTutorials;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vehicle implements InitializingBean, DisposableBean{

	private String type;
	private int srNo;

	public Vehicle(String type) {
		this.type = type;
	}

	public Vehicle(int srNo) {
		System.out.println("Constructing SrNo");
		this.srNo = srNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("setting type");
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

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Bean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Intializing Bean");
	}
	
	public void myInit() {
		System.out.println("Init Bean");
	}
	
	public void cleanUp() {
		System.out.println("CleanUp bean");
	}
	
	
}
