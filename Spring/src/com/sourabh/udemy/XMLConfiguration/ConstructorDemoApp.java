package com.sourabh.udemy.XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("theCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
