package com.sourabh.udemy.XMLConfiguration;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky Day!";
	}

}
